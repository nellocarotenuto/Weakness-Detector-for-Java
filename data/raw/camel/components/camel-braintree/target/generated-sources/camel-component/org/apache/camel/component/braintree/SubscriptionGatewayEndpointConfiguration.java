/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:05:39 CEST 2019
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.braintreegateway.SubscriptionGateway
 */
@UriParams
public final class SubscriptionGatewayEndpointConfiguration extends BraintreeConfiguration {

    @UriParam
    private java.math.BigDecimal amount;

    @UriParam
    private String customerId;

    @UriParam
    private String id;

    @UriParam
    private com.braintreegateway.SubscriptionRequest request;

    @UriParam
    private com.braintreegateway.SubscriptionSearchRequest searchRequest;

    @UriParam
    private String subscriptionId;

    public java.math.BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.braintreegateway.SubscriptionRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.SubscriptionRequest request) {
        this.request = request;
    }

    public com.braintreegateway.SubscriptionSearchRequest getSearchRequest() {
        return searchRequest;
    }

    public void setSearchRequest(com.braintreegateway.SubscriptionSearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
}
