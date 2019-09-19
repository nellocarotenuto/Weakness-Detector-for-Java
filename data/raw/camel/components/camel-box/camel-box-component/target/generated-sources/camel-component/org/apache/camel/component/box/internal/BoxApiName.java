/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:05:31 CEST 2019
 */
package org.apache.camel.component.box.internal;

import org.apache.camel.util.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component Box
 */
public enum BoxApiName implements ApiName {

    COLLABORATIONS("collaborations"),
    COMMENTS("comments"),
    EVENT_LOGS("event-logs"),
    FILES("files"),
    FOLDERS("folders"),
    GROUPS("groups"),
    EVENTS("events"),
    SEARCH("search"),
    TASKS("tasks"),
    USERS("users");

    private static final BoxApiName[] VALUES = values();
    
    private final String name;

    private BoxApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static BoxApiName fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < VALUES.length; i++) {
            if (VALUES[i].name.equals(value)) {
                return VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}
