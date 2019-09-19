/*
 * Camel Api Route test generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:12:17 CEST 2019
 */
package org.apache.camel.component.google.mail;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.camel.component.google.mail.internal.GoogleMailApiCollection;
import org.apache.camel.component.google.mail.internal.GmailUsersHistoryApiMethod;

/**
 * Test class for {@link com.google.api.services.gmail.Gmail$Users$History} APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class GmailUsersHistoryIntegrationTest extends AbstractGoogleMailTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(GmailUsersHistoryIntegrationTest.class);
    private static final String PATH_PREFIX = GoogleMailApiCollection.getCollection().getApiName(GmailUsersHistoryApiMethod.class).getName();

    // TODO provide parameter values for list
    @Ignore
    @Test
    public void testList() throws Exception {
        // using String message body for single parameter "userId"
        final com.google.api.services.gmail.Gmail.Users.History.List result = requestBody("direct://LIST", null);

        assertNotNull("list result", result);
        LOG.debug("list: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for list
                from("direct://LIST")
                    .to("google-mail://" + PATH_PREFIX + "/list?inBody=userId");

            }
        };
    }
}