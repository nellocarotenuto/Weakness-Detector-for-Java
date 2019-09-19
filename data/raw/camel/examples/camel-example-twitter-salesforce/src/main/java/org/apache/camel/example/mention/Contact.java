/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Mon Apr 06 17:56:36 PDT 2015
 */
package org.apache.camel.example.mention;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Contact Data Transfer Object (DTO) needed for Salesforce component.
 *<p>
 * This is a trivial, hand coded, example of DTO for Contact SObject,
 * for production use you would most likely want to generate these
 * using {@code camel-salesforce-maven-plugin} as it adds all fields
 * and generates {@link AbstractDescribedSObjectBase} based classes,
 * which are needed for some of the operations (like composite API).
 */
// CHECKSTYLE:OFF
public class Contact extends AbstractSObjectBase {

    @JsonProperty("LastName")
    private final String lastName;

    @JsonProperty("TwitterScreenName__c")
    private String screenName;

    @JsonCreator
    public Contact(@JsonProperty("LastName") String lastName,
                   @JsonProperty("TwitterScreenName__c") String screenName) {
        this.lastName = lastName;
        this.screenName = screenName;
    }

    public String getTwitterScreenName__c() {
        return screenName;
    }

    public void setTwitterScreenName__c(String screenName) {
        this.screenName = screenName;
    }
}
// CHECKSTYLE:ON
