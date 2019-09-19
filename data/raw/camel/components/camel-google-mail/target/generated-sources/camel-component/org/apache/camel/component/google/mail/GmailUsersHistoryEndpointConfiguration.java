/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:12:17 CEST 2019
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.gmail.Gmail$Users$History
 */
@UriParams
public final class GmailUsersHistoryEndpointConfiguration extends GoogleMailConfiguration {

    @UriParam
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
