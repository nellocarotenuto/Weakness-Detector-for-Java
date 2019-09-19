/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:05:31 CEST 2019
 */
package org.apache.camel.component.box.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.box.api.BoxSearchManager;

import org.apache.camel.util.component.ApiMethod;
import org.apache.camel.util.component.ApiMethodArg;
import org.apache.camel.util.component.ApiMethodImpl;

import static org.apache.camel.util.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.box.api.BoxSearchManager
 */
public enum BoxSearchManagerApiMethod implements ApiMethod {

    SEARCHFOLDER(
        java.util.Collection.class,
        "searchFolder",
        arg("folderId", String.class),
        arg("query", String.class));
    

    private final ApiMethod apiMethod;

    private BoxSearchManagerApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(BoxSearchManager.class, resultType, name, args);
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