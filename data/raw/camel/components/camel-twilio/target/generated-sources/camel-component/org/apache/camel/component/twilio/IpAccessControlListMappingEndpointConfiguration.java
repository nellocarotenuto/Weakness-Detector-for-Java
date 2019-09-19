/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:31:49 CEST 2019
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMapping
 */
@UriParams
public final class IpAccessControlListMappingEndpointConfiguration extends TwilioConfiguration {

    @UriParam
    private String ipAccessControlListSid;

    @UriParam
    private String pathAccountSid;

    @UriParam
    private String pathDomainSid;

    @UriParam
    private String pathSid;

    public String getIpAccessControlListSid() {
        return ipAccessControlListSid;
    }

    public void setIpAccessControlListSid(String ipAccessControlListSid) {
        this.ipAccessControlListSid = ipAccessControlListSid;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathDomainSid() {
        return pathDomainSid;
    }

    public void setPathDomainSid(String pathDomainSid) {
        this.pathDomainSid = pathDomainSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
