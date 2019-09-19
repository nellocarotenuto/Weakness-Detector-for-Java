/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:12:17 CEST 2019
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.gmail.Gmail$Users$Threads
 */
@UriParams
public final class GmailUsersThreadsEndpointConfiguration extends GoogleMailConfiguration {

    @UriParam
    private com.google.api.services.gmail.model.ModifyThreadRequest content;

    @UriParam
    private String id;

    @UriParam
    private String userId;

    public com.google.api.services.gmail.model.ModifyThreadRequest getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.ModifyThreadRequest content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}