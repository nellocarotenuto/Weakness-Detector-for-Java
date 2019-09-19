/*
 * Camel ApiCollection generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:20:08 CEST 2019
 */
package org.apache.camel.component.linkedin.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.camel.component.linkedin.LinkedInConfiguration;
import org.apache.camel.component.linkedin.CommentsResourceEndpointConfiguration;
import org.apache.camel.component.linkedin.CompaniesResourceEndpointConfiguration;
import org.apache.camel.component.linkedin.GroupsResourceEndpointConfiguration;
import org.apache.camel.component.linkedin.JobsResourceEndpointConfiguration;
import org.apache.camel.component.linkedin.PeopleResourceEndpointConfiguration;
import org.apache.camel.component.linkedin.PostsResourceEndpointConfiguration;
import org.apache.camel.component.linkedin.SearchResourceEndpointConfiguration;

import org.apache.camel.util.component.ApiCollection;
import org.apache.camel.util.component.ApiMethod;
import org.apache.camel.util.component.ApiMethodHelper;

/**
 * Camel {@link ApiCollection} for LinkedIn
 */
public final class LinkedInApiCollection extends ApiCollection<LinkedInApiName, LinkedInConfiguration> {

    private static LinkedInApiCollection collection;

    private LinkedInApiCollection() {
        final Map<String, String> aliases = new HashMap<String, String>();
        final Map<LinkedInApiName, ApiMethodHelper<? extends ApiMethod>> apiHelpers = new HashMap<>();
        final Map<Class<? extends ApiMethod>, LinkedInApiName> apiMethods = new HashMap<>();

        List<String> nullableArgs;

        aliases.clear();
        aliases.put("(add|get|remove|search)(.+)", "$2");
        nullableArgs = Arrays.asList();
        apiHelpers.put(LinkedInApiName.COMMENTS, new ApiMethodHelper<CommentsResourceApiMethod>(CommentsResourceApiMethod.class, aliases, nullableArgs));
        apiMethods.put(CommentsResourceApiMethod.class, LinkedInApiName.COMMENTS);

        aliases.clear();
        aliases.put("(add|get|remove|search)(.+)", "$2");
        nullableArgs = Arrays.asList("companySizes", "count", "email_domain", "end_timestamp", "event_type", "geos", "industries", "is_company_admin", "jobFunc", "secure_urls", "seniorities", "start", "start_timestamp", "statistics_update_key", "time_granularity");
        apiHelpers.put(LinkedInApiName.COMPANIES, new ApiMethodHelper<CompaniesResourceApiMethod>(CompaniesResourceApiMethod.class, aliases, nullableArgs));
        apiMethods.put(CompaniesResourceApiMethod.class, LinkedInApiName.COMPANIES);

        aliases.clear();
        aliases.put("(add|get|remove|search)(.+)", "$2");
        nullableArgs = Arrays.asList("category", "count", "modified_since", "order", "start");
        apiHelpers.put(LinkedInApiName.GROUPS, new ApiMethodHelper<GroupsResourceApiMethod>(GroupsResourceApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GroupsResourceApiMethod.class, LinkedInApiName.GROUPS);

        aliases.clear();
        aliases.put("(add|get|remove|search)(.+)", "$2");
        nullableArgs = Arrays.asList();
        apiHelpers.put(LinkedInApiName.JOBS, new ApiMethodHelper<JobsResourceApiMethod>(JobsResourceApiMethod.class, aliases, nullableArgs));
        apiMethods.put(JobsResourceApiMethod.class, LinkedInApiName.JOBS);

        aliases.clear();
        aliases.put("(add|get|remove|search)(.+)", "$2");
        nullableArgs = Arrays.asList("after", "before", "category", "count", "membership_state", "modified_since", "order", "public_profile_url", "role", "scope", "secure_urls", "show_hidden_members", "start", "type");
        apiHelpers.put(LinkedInApiName.PEOPLE, new ApiMethodHelper<PeopleResourceApiMethod>(PeopleResourceApiMethod.class, aliases, nullableArgs));
        apiMethods.put(PeopleResourceApiMethod.class, LinkedInApiName.PEOPLE);

        aliases.clear();
        aliases.put("(add|get|remove|search)(.+)", "$2");
        nullableArgs = Arrays.asList("count", "start");
        apiHelpers.put(LinkedInApiName.POSTS, new ApiMethodHelper<PostsResourceApiMethod>(PostsResourceApiMethod.class, aliases, nullableArgs));
        apiMethods.put(PostsResourceApiMethod.class, LinkedInApiName.POSTS);

        aliases.clear();
        aliases.put("(add|get|remove|search)(.+)", "$2");
        nullableArgs = Arrays.asList("company_name", "count", "country_code", "current_company", "current_school", "current_title", "distance", "facet", "facets", "first_name", "hq_only", "job_title", "keywords", "last_name", "postal_code", "school_name", "sort", "start", "title");
        apiHelpers.put(LinkedInApiName.SEARCH, new ApiMethodHelper<SearchResourceApiMethod>(SearchResourceApiMethod.class, aliases, nullableArgs));
        apiMethods.put(SearchResourceApiMethod.class, LinkedInApiName.SEARCH);

        setApiHelpers(apiHelpers);
        setApiMethods(apiMethods);
    }

    public LinkedInConfiguration getEndpointConfiguration(LinkedInApiName apiName) {
        LinkedInConfiguration result = null;
        switch (apiName) {
        case COMMENTS:
            result = new CommentsResourceEndpointConfiguration();
            break;
        case COMPANIES:
            result = new CompaniesResourceEndpointConfiguration();
            break;
        case GROUPS:
            result = new GroupsResourceEndpointConfiguration();
            break;
        case JOBS:
            result = new JobsResourceEndpointConfiguration();
            break;
        case PEOPLE:
            result = new PeopleResourceEndpointConfiguration();
            break;
        case POSTS:
            result = new PostsResourceEndpointConfiguration();
            break;
        case SEARCH:
            result = new SearchResourceEndpointConfiguration();
            break;
        }
        return result;
    }

    public static synchronized LinkedInApiCollection getCollection() {
        if (collection == null) {
            collection = new LinkedInApiCollection();
        }
        return collection;
    }
}