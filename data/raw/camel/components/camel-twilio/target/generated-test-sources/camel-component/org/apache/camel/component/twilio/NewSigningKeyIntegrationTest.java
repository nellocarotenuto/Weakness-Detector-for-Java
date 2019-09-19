/*
 * Camel Api Route test generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:31:49 CEST 2019
 */
package org.apache.camel.component.twilio;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.camel.component.twilio.internal.TwilioApiCollection;
import org.apache.camel.component.twilio.internal.NewSigningKeyApiMethod;

/**
 * Test class for {@link com.twilio.rest.api.v2010.account.NewSigningKey} APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class NewSigningKeyIntegrationTest extends AbstractTwilioTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(NewSigningKeyIntegrationTest.class);
    private static final String PATH_PREFIX = TwilioApiCollection.getCollection().getApiName(NewSigningKeyApiMethod.class).getName();

    @Ignore
    @Test
    public void testCreator() throws Exception {
        final com.twilio.rest.api.v2010.account.NewSigningKeyCreator result = requestBody("direct://CREATOR", null);

        assertNotNull("creator result", result);
        LOG.debug("creator: " + result);
    }

    // TODO provide parameter values for creator
    @Ignore
    @Test
    public void testCreator_1() throws Exception {
        // using String message body for single parameter "pathAccountSid"
        final com.twilio.rest.api.v2010.account.NewSigningKeyCreator result = requestBody("direct://CREATOR_1", null);

        assertNotNull("creator result", result);
        LOG.debug("creator: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for creator
                from("direct://CREATOR")
                    .to("twilio://" + PATH_PREFIX + "/creator");

                // test route for creator
                from("direct://CREATOR_1")
                    .to("twilio://" + PATH_PREFIX + "/creator?inBody=pathAccountSid");

            }
        };
    }
}
