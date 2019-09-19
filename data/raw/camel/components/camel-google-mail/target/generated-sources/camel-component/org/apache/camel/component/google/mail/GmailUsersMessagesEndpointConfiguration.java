/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:12:17 CEST 2019
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.gmail.Gmail$Users$Messages
 */
@UriParams
public final class GmailUsersMessagesEndpointConfiguration extends GoogleMailConfiguration {

    @UriParam
    private com.google.api.services.gmail.model.BatchDeleteMessagesRequest batchDeleteMessagesRequest;

    @UriParam
    private com.google.api.services.gmail.model.BatchModifyMessagesRequest batchModifyMessagesRequest;

    @UriParam
    private com.google.api.services.gmail.model.Message content;

    @UriParam
    private String id;

    @UriParam
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;

    @UriParam
    private com.google.api.services.gmail.model.ModifyMessageRequest modifyMessageRequest;

    @UriParam
    private String userId;

    public com.google.api.services.gmail.model.BatchDeleteMessagesRequest getBatchDeleteMessagesRequest() {
        return batchDeleteMessagesRequest;
    }

    public void setBatchDeleteMessagesRequest(com.google.api.services.gmail.model.BatchDeleteMessagesRequest batchDeleteMessagesRequest) {
        this.batchDeleteMessagesRequest = batchDeleteMessagesRequest;
    }

    public com.google.api.services.gmail.model.BatchModifyMessagesRequest getBatchModifyMessagesRequest() {
        return batchModifyMessagesRequest;
    }

    public void setBatchModifyMessagesRequest(com.google.api.services.gmail.model.BatchModifyMessagesRequest batchModifyMessagesRequest) {
        this.batchModifyMessagesRequest = batchModifyMessagesRequest;
    }

    public com.google.api.services.gmail.model.Message getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.Message content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public com.google.api.services.gmail.model.ModifyMessageRequest getModifyMessageRequest() {
        return modifyMessageRequest;
    }

    public void setModifyMessageRequest(com.google.api.services.gmail.model.ModifyMessageRequest modifyMessageRequest) {
        this.modifyMessageRequest = modifyMessageRequest;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
