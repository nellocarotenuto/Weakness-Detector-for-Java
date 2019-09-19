/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:31:49 CEST 2019
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.OutgoingCallerId;

import org.apache.camel.util.component.ApiMethod;
import org.apache.camel.util.component.ApiMethodArg;
import org.apache.camel.util.component.ApiMethodImpl;

import static org.apache.camel.util.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.OutgoingCallerId
 */
public enum OutgoingCallerIdApiMethod implements ApiMethod {

    DELETER(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdDeleter.class,
        "deleter",
        arg("pathSid", String.class)),
    DELETER_1(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),
    FETCHER(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdFetcher.class,
        "fetcher",
        arg("pathSid", String.class)),
    FETCHER_1(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),
    READER(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdReader.class,
        "reader"),
    READER_1(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdReader.class,
        "reader",
        arg("pathAccountSid", String.class)),
    UPDATER(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdUpdater.class,
        "updater",
        arg("pathSid", String.class)),
    UPDATER_1(
        com.twilio.rest.api.v2010.account.OutgoingCallerIdUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class));
    

    private final ApiMethod apiMethod;

    private OutgoingCallerIdApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(OutgoingCallerId.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
