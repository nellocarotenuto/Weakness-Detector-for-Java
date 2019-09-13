/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.core.provisioning.java.pushpull;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.syncope.common.lib.patch.AnyPatch;
import org.apache.syncope.common.lib.to.EntityTO;
import org.apache.syncope.common.lib.to.GroupTO;
import org.apache.syncope.common.lib.types.ConnConfProperty;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.provisioning.api.Connector;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile;
import org.apache.syncope.core.provisioning.api.pushpull.ProvisioningReport;
import org.apache.syncope.core.persistence.api.dao.AnyTypeDAO;
import org.apache.syncope.core.persistence.api.entity.resource.Provision;
import org.identityconnectors.framework.common.objects.Attribute;
import org.identityconnectors.framework.common.objects.ConnectorObject;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.OperationOptionsBuilder;
import org.identityconnectors.framework.common.objects.SyncDelta;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.syncope.core.provisioning.java.job.SetUMembershipsJob;
import org.springframework.transaction.annotation.Transactional;

/**
 * Simple action for pulling LDAP groups memberships to Syncope group memberships, when the same resource is
 * configured for both users and groups.
 *
 * @see org.apache.syncope.core.provisioning.java.propagation.LDAPMembershipPropagationActions
 */
public class LDAPMembershipPullActions extends SchedulingPullActions {

    protected static final Logger LOG = LoggerFactory.getLogger(LDAPMembershipPullActions.class);

    @Autowired
    protected AnyTypeDAO anyTypeDAO;

    @Autowired
    protected GroupDAO groupDAO;

    @Autowired
    private PullUtils pullUtils;

    protected final Map<String, Set<String>> membershipsBefore = new HashMap<>();

    protected final Map<String, Set<String>> membershipsAfter = new HashMap<>();

    /**
     * Allows easy subclassing for the ConnId AD connector bundle.
     *
     * @param connector A Connector instance to query for the groupMemberAttribute property name
     * @return the name of the attribute used to keep track of group memberships
     */
    protected String getGroupMembershipAttrName(final Connector connector) {
        Optional<ConnConfProperty> groupMembership = connector.getConnInstance().getConf().stream().
                filter(property -> "groupMemberAttribute".equals(property.getSchema().getName())
                && !property.getValues().isEmpty()).
                findFirst();

        return groupMembership.isPresent()
                ? (String) groupMembership.get().getValues().get(0)
                : "uniquemember";
    }

    /**
     * Read values of attribute returned by getGroupMembershipAttrName(); if not present in the given delta, perform an
     * additional read on the underlying connector.
     *
     * @param delta representing the pulling group
     * @param connector associated to the current resource
     * @return value of attribute returned by
     * {@link #getGroupMembershipAttrName}
     */
    protected List<Object> getMembAttrValues(final SyncDelta delta, final Connector connector) {
        String groupMemberName = getGroupMembershipAttrName(connector);

        // first, try to read the configured attribute from delta, returned by the ongoing pull
        Attribute membAttr = delta.getObject().getAttributeByName(groupMemberName);
        // if not found, perform an additional read on the underlying connector for the same connector object
        if (membAttr == null) {
            OperationOptionsBuilder oob = new OperationOptionsBuilder().setAttributesToGet(groupMemberName);
            ConnectorObject remoteObj = connector.getObject(ObjectClass.GROUP, delta.getUid(), false, oob.build());
            if (remoteObj == null) {
                LOG.debug("Object for '{}' not found", delta.getUid().getUidValue());
            } else {
                membAttr = remoteObj.getAttributeByName(groupMemberName);
            }
        }

        return membAttr == null || membAttr.getValue() == null
                ? Collections.emptyList()
                : membAttr.getValue();
    }

    /**
     * Keep track of members of the group being updated before actual update takes place.
     * This is not needed on
     * <ul>
     * <li>{@link #beforeProvision} because the pulling group does not exist yet on Syncope</li>
     * <li>{@link #beforeDelete} because group delete cascades as membership removal for all users involved</li>
     * </ul>
     *
     * {@inheritDoc}
     */
    @Transactional(readOnly = true)
    @Override
    public <P extends AnyPatch> void beforeUpdate(
            final ProvisioningProfile<?, ?> profile,
            final SyncDelta delta,
            final EntityTO entity,
            final P anyPatch) throws JobExecutionException {

        if (!(entity instanceof GroupTO)) {
            super.beforeUpdate(profile, delta, entity, anyPatch);
        }

        groupDAO.findUMemberships(groupDAO.find(entity.getKey())).forEach(uMembership -> {
            Set<String> memb = membershipsBefore.get(uMembership.getLeftEnd().getKey());
            if (memb == null) {
                memb = new HashSet<>();
                membershipsBefore.put(uMembership.getLeftEnd().getKey(), memb);
            }
            memb.add(entity.getKey());
        });
    }

    /**
     * Keep track of members of the group being updated after actual update took place.
     * {@inheritDoc}
     */
    @Override
    public void after(
            final ProvisioningProfile<?, ?> profile,
            final SyncDelta delta,
            final EntityTO entity,
            final ProvisioningReport result) throws JobExecutionException {

        if (!(entity instanceof GroupTO)) {
            super.after(profile, delta, entity, result);
        }

        Optional<? extends Provision> provision = profile.getTask().getResource().getProvision(anyTypeDAO.findUser()).
                filter(p -> p.getMapping() != null);
        if (!provision.isPresent()) {
            super.after(profile, delta, entity, result);
        }

        getMembAttrValues(delta, profile.getConnector()).forEach(membValue -> {
            Optional<String> userKey = pullUtils.match(
                    anyTypeDAO.findUser(),
                    membValue.toString(),
                    profile.getTask().getResource(),
                    profile.getConnector(),
                    false);
            if (userKey.isPresent()) {
                Set<String> memb = membershipsAfter.get(userKey.get());
                if (memb == null) {
                    memb = new HashSet<>();
                    membershipsAfter.put(userKey.get(), memb);
                }
                memb.add(entity.getKey());
            } else {
                LOG.warn("Could not find matching user for {}", membValue);
            }
        });
    }

    @Override
    public void afterAll(final ProvisioningProfile<?, ?> profile) throws JobExecutionException {
        Map<String, Object> jobMap = new HashMap<>();
        jobMap.put(SetUMembershipsJob.MEMBERSHIPS_BEFORE_KEY, membershipsBefore);
        jobMap.put(SetUMembershipsJob.MEMBERSHIPS_AFTER_KEY, membershipsAfter);
        schedule(SetUMembershipsJob.class, jobMap);
    }
}