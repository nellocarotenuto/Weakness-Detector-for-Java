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
import org.apache.camel.component.twilio.internal.PayloadApiMethod;

/**
 * Test class for {@link com.twilio.rest.api.v2010.account.recording.addonresult.Payload} APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class PayloadIntegrationTest extends AbstractTwilioTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(PayloadIntegrationTest.class);
    private static final String PATH_PREFIX = TwilioApiCollection.getCollection().getApiName(PayloadApiMethod.class).getName();

    // TODO provide parameter values for deleter
    @Ignore
    @Test
    public void testDeleter() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathReferenceSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathAddOnResultSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathSid", null);

        final com.twilio.rest.api.v2010.account.recording.addonresult.PayloadDeleter result = requestBodyAndHeaders("direct://DELETER", null, headers);

        assertNotNull("deleter result", result);
        LOG.debug("deleter: " + result);
    }

    // TODO provide parameter values for deleter
    @Ignore
    @Test
    public void testDeleter_1() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathAccountSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathReferenceSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathAddOnResultSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathSid", null);

        final com.twilio.rest.api.v2010.account.recording.addonresult.PayloadDeleter result = requestBodyAndHeaders("direct://DELETER_1", null, headers);

        assertNotNull("deleter result", result);
        LOG.debug("deleter: " + result);
    }

    // TODO provide parameter values for fetcher
    @Ignore
    @Test
    public void testFetcher() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathReferenceSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathAddOnResultSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathSid", null);

        final com.twilio.rest.api.v2010.account.recording.addonresult.PayloadFetcher result = requestBodyAndHeaders("direct://FETCHER", null, headers);

        assertNotNull("fetcher result", result);
        LOG.debug("fetcher: " + result);
    }

    // TODO provide parameter values for fetcher
    @Ignore
    @Test
    public void testFetcher_1() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathAccountSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathReferenceSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathAddOnResultSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathSid", null);

        final com.twilio.rest.api.v2010.account.recording.addonresult.PayloadFetcher result = requestBodyAndHeaders("direct://FETCHER_1", null, headers);

        assertNotNull("fetcher result", result);
        LOG.debug("fetcher: " + result);
    }

    // TODO provide parameter values for reader
    @Ignore
    @Test
    public void testReader() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathReferenceSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathAddOnResultSid", null);

        final com.twilio.rest.api.v2010.account.recording.addonresult.PayloadReader result = requestBodyAndHeaders("direct://READER", null, headers);

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
        headers.put("CamelTwilio.pathReferenceSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathAddOnResultSid", null);

        final com.twilio.rest.api.v2010.account.recording.addonresult.PayloadReader result = requestBodyAndHeaders("direct://READER_1", null, headers);

        assertNotNull("reader result", result);
        LOG.debug("reader: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for deleter
                from("direct://DELETER")
                    .to("twilio://" + PATH_PREFIX + "/deleter");

                // test route for deleter
                from("direct://DELETER_1")
                    .to("twilio://" + PATH_PREFIX + "/deleter");

                // test route for fetcher
                from("direct://FETCHER")
                    .to("twilio://" + PATH_PREFIX + "/fetcher");

                // test route for fetcher
                from("direct://FETCHER_1")
                    .to("twilio://" + PATH_PREFIX + "/fetcher");

                // test route for reader
                from("direct://READER")
                    .to("twilio://" + PATH_PREFIX + "/reader");

                // test route for reader
                from("direct://READER_1")
                    .to("twilio://" + PATH_PREFIX + "/reader");

            }
        };
    }
}
