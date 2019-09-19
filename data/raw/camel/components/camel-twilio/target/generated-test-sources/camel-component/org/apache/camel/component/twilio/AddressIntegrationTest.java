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
import org.apache.camel.component.twilio.internal.AddressApiMethod;

/**
 * Test class for {@link com.twilio.rest.api.v2010.account.Address} APIs.
 * TODO Move the file to src/test/java, populate parameter values, and remove @Ignore annotations.
 * The class source won't be generated again if the generator MOJO finds it under src/test/java.
 */
public class AddressIntegrationTest extends AbstractTwilioTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(AddressIntegrationTest.class);
    private static final String PATH_PREFIX = TwilioApiCollection.getCollection().getApiName(AddressApiMethod.class).getName();

    // TODO provide parameter values for creator
    @Ignore
    @Test
    public void testCreator() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.customerName", null);
        // parameter type is String
        headers.put("CamelTwilio.street", null);
        // parameter type is String
        headers.put("CamelTwilio.city", null);
        // parameter type is String
        headers.put("CamelTwilio.region", null);
        // parameter type is String
        headers.put("CamelTwilio.postalCode", null);
        // parameter type is String
        headers.put("CamelTwilio.isoCountry", null);

        final com.twilio.rest.api.v2010.account.AddressCreator result = requestBodyAndHeaders("direct://CREATOR", null, headers);

        assertNotNull("creator result", result);
        LOG.debug("creator: " + result);
    }

    // TODO provide parameter values for creator
    @Ignore
    @Test
    public void testCreator_1() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathAccountSid", null);
        // parameter type is String
        headers.put("CamelTwilio.customerName", null);
        // parameter type is String
        headers.put("CamelTwilio.street", null);
        // parameter type is String
        headers.put("CamelTwilio.city", null);
        // parameter type is String
        headers.put("CamelTwilio.region", null);
        // parameter type is String
        headers.put("CamelTwilio.postalCode", null);
        // parameter type is String
        headers.put("CamelTwilio.isoCountry", null);

        final com.twilio.rest.api.v2010.account.AddressCreator result = requestBodyAndHeaders("direct://CREATOR_1", null, headers);

        assertNotNull("creator result", result);
        LOG.debug("creator: " + result);
    }

    // TODO provide parameter values for deleter
    @Ignore
    @Test
    public void testDeleter() throws Exception {
        // using String message body for single parameter "pathSid"
        final com.twilio.rest.api.v2010.account.AddressDeleter result = requestBody("direct://DELETER", null);

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
        headers.put("CamelTwilio.pathSid", null);

        final com.twilio.rest.api.v2010.account.AddressDeleter result = requestBodyAndHeaders("direct://DELETER_1", null, headers);

        assertNotNull("deleter result", result);
        LOG.debug("deleter: " + result);
    }

    // TODO provide parameter values for fetcher
    @Ignore
    @Test
    public void testFetcher() throws Exception {
        // using String message body for single parameter "pathSid"
        final com.twilio.rest.api.v2010.account.AddressFetcher result = requestBody("direct://FETCHER", null);

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
        headers.put("CamelTwilio.pathSid", null);

        final com.twilio.rest.api.v2010.account.AddressFetcher result = requestBodyAndHeaders("direct://FETCHER_1", null, headers);

        assertNotNull("fetcher result", result);
        LOG.debug("fetcher: " + result);
    }

    @Ignore
    @Test
    public void testReader() throws Exception {
        final com.twilio.rest.api.v2010.account.AddressReader result = requestBody("direct://READER", null);

        assertNotNull("reader result", result);
        LOG.debug("reader: " + result);
    }

    // TODO provide parameter values for reader
    @Ignore
    @Test
    public void testReader_1() throws Exception {
        // using String message body for single parameter "pathAccountSid"
        final com.twilio.rest.api.v2010.account.AddressReader result = requestBody("direct://READER_1", null);

        assertNotNull("reader result", result);
        LOG.debug("reader: " + result);
    }

    // TODO provide parameter values for updater
    @Ignore
    @Test
    public void testUpdater() throws Exception {
        // using String message body for single parameter "pathSid"
        final com.twilio.rest.api.v2010.account.AddressUpdater result = requestBody("direct://UPDATER", null);

        assertNotNull("updater result", result);
        LOG.debug("updater: " + result);
    }

    // TODO provide parameter values for updater
    @Ignore
    @Test
    public void testUpdater_1() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        // parameter type is String
        headers.put("CamelTwilio.pathAccountSid", null);
        // parameter type is String
        headers.put("CamelTwilio.pathSid", null);

        final com.twilio.rest.api.v2010.account.AddressUpdater result = requestBodyAndHeaders("direct://UPDATER_1", null, headers);

        assertNotNull("updater result", result);
        LOG.debug("updater: " + result);
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
                    .to("twilio://" + PATH_PREFIX + "/creator");

                // test route for deleter
                from("direct://DELETER")
                    .to("twilio://" + PATH_PREFIX + "/deleter?inBody=pathSid");

                // test route for deleter
                from("direct://DELETER_1")
                    .to("twilio://" + PATH_PREFIX + "/deleter");

                // test route for fetcher
                from("direct://FETCHER")
                    .to("twilio://" + PATH_PREFIX + "/fetcher?inBody=pathSid");

                // test route for fetcher
                from("direct://FETCHER_1")
                    .to("twilio://" + PATH_PREFIX + "/fetcher");

                // test route for reader
                from("direct://READER")
                    .to("twilio://" + PATH_PREFIX + "/reader");

                // test route for reader
                from("direct://READER_1")
                    .to("twilio://" + PATH_PREFIX + "/reader?inBody=pathAccountSid");

                // test route for updater
                from("direct://UPDATER")
                    .to("twilio://" + PATH_PREFIX + "/updater?inBody=pathSid");

                // test route for updater
                from("direct://UPDATER_1")
                    .to("twilio://" + PATH_PREFIX + "/updater");

            }
        };
    }
}
