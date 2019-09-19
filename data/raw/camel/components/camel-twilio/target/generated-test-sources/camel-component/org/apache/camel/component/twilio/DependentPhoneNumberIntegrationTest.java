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
import org.apache.camel.component.twilio.internal.DependentPhoneNumberApiMethod;

/**
 * Test class for {@link com.twilio.rest.api.v2010.account.address.DependentPhoneNumber} APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class DependentPhoneNumberIntegrationTest extends AbstractTwilioTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(DependentPhoneNumberIntegrationTest.class);
    private static final String PATH_PREFIX = TwilioApiCollection.getCollection().getApiName(DependentPhoneNumberApiMethod.class).getName();

    // TODO provide parameter values for reader
    @Ignore
    @Test
    public void testReader() throws Exception {
        // using String message body for single parameter "pathAddressSid"
        final com.twilio.rest.api.v2010.account.address.DependentPhoneNumberReader result = requestBody("direct://READER", null);

        assertNotNull("reader result", result);
        LOG.debug("reader: " + result);
    }

    // TODO provide parameter values for reader
    @Ignore
    @Test
    public void testReader_1() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathAccountSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathAddressSid", null);

        final com.twilio.rest.api.v2010.account.address.DependentPhoneNumberReader result = requestBodyAndHeaders("direct://READER_1", null, headers);

        assertNotNull("reader result", result);
        LOG.debug("reader: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for reader
                from("direct://READER")
                    .to("twilio://" + PATH_PREFIX + "/reader?inBody=pathAddressSid");

                // test route for reader
                from("direct://READER_1")
                    .to("twilio://" + PATH_PREFIX + "/reader");

            }
        };
    }
}
