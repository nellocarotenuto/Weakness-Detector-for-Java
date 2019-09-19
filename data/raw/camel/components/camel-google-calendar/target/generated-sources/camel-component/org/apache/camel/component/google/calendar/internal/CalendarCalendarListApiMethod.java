/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:12:02 CEST 2019
 */
package org.apache.camel.component.google.calendar.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.calendar.Calendar.CalendarList;

import org.apache.camel.util.component.ApiMethod;
import org.apache.camel.util.component.ApiMethodArg;
import org.apache.camel.util.component.ApiMethodImpl;

import static org.apache.camel.util.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.calendar.Calendar$CalendarList
 */
public enum CalendarCalendarListApiMethod implements ApiMethod {

    DELETE(
        com.google.api.services.calendar.Calendar.CalendarList.Delete.class,
        "delete",
        arg("calendarId", String.class)),
    GET(
        com.google.api.services.calendar.Calendar.CalendarList.Get.class,
        "get",
        arg("calendarId", String.class)),
    INSERT(
        com.google.api.services.calendar.Calendar.CalendarList.Insert.class,
        "insert",
        arg("content", com.google.api.services.calendar.model.CalendarListEntry.class)),
    LIST(
        com.google.api.services.calendar.Calendar.CalendarList.List.class,
        "list"),
    PATCH(
        com.google.api.services.calendar.Calendar.CalendarList.Patch.class,
        "patch",
        arg("calendarId", String.class),
        arg("content", com.google.api.services.calendar.model.CalendarListEntry.class)),
    UPDATE(
        com.google.api.services.calendar.Calendar.CalendarList.Update.class,
        "update",
        arg("calendarId", String.class),
        arg("content", com.google.api.services.calendar.model.CalendarListEntry.class)),
    WATCH(
        com.google.api.services.calendar.Calendar.CalendarList.Watch.class,
        "watch",
        arg("contentChannel", com.google.api.services.calendar.model.Channel.class));
    

    private final ApiMethod apiMethod;

    private CalendarCalendarListApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(CalendarList.class, resultType, name, args);
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
