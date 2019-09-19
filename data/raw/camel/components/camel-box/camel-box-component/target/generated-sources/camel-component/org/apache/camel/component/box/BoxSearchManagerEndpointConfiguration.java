/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:05:31 CEST 2019
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxSearchManager
 */
@UriParams
public final class BoxSearchManagerEndpointConfiguration extends BoxConfiguration {

    @UriParam
    private String folderId;

    @UriParam
    private String query;

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
