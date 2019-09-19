/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:05:31 CEST 2019
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxUsersManager
 */
@UriParams
public final class BoxUsersManagerEndpointConfiguration extends BoxConfiguration {

    @UriParam
    private String email;

    @UriParam
    private String emailAliasId;

    @UriParam
    private String[] fields;

    @UriParam
    private String filterTerm;

    @UriParam
    private Boolean force;

    @UriParam
    private com.box.sdk.BoxUser.Info info;

    @UriParam
    private String login;

    @UriParam
    private String name;

    @UriParam
    private Boolean notifyUser;

    @UriParam
    private com.box.sdk.CreateUserParams params;

    @UriParam
    private String sourceUserId;

    @UriParam
    private String userId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAliasId() {
        return emailAliasId;
    }

    public void setEmailAliasId(String emailAliasId) {
        this.emailAliasId = emailAliasId;
    }

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String getFilterTerm() {
        return filterTerm;
    }

    public void setFilterTerm(String filterTerm) {
        this.filterTerm = filterTerm;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public com.box.sdk.BoxUser.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxUser.Info info) {
        this.info = info;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNotifyUser() {
        return notifyUser;
    }

    public void setNotifyUser(Boolean notifyUser) {
        this.notifyUser = notifyUser;
    }

    public com.box.sdk.CreateUserParams getParams() {
        return params;
    }

    public void setParams(com.box.sdk.CreateUserParams params) {
        this.params = params;
    }

    public String getSourceUserId() {
        return sourceUserId;
    }

    public void setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
