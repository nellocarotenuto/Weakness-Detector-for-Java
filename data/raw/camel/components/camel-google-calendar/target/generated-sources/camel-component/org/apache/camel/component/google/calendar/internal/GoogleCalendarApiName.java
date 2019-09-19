/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:12:02 CEST 2019
 */
package org.apache.camel.component.google.calendar.internal;

import org.apache.camel.util.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component GoogleCalendar
 */
public enum GoogleCalendarApiName implements ApiName {

    ACL("acl"),
    LIST("list"),
    CALENDARS("calendars"),
    CHANNELS("channels"),
    COLORS("colors"),
    FREEBUSY("freebusy"),
    EVENTS("events"),
    SETTINGS("settings");

    private static final GoogleCalendarApiName[] VALUES = values();
    
    private final String name;

    private GoogleCalendarApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static GoogleCalendarApiName fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < VALUES.length; i++) {
            if (VALUES[i].name.equals(value)) {
                return VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}