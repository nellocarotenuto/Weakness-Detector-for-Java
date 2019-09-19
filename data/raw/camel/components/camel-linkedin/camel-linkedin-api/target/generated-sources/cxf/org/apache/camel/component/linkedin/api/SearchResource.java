/**
 * Created by Apache CXF WadlToJava code generator
**/
package org.apache.camel.component.linkedin.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.apache.camel.component.linkedin.api.model.CompanySearch;
import org.apache.camel.component.linkedin.api.model.Distance;
import org.apache.camel.component.linkedin.api.model.JobSearch;
import org.apache.camel.component.linkedin.api.model.PeopleSearch;

public interface SearchResource {

    @GET
    @Produces("application/xml")
    @Path("/people-search{fields}")
    PeopleSearch searchPeople(@PathParam("fields") String fields, @QueryParam("keywords") String keywords, @QueryParam("first-name") String first_name, @QueryParam("last-name") String last_name, 
                @QueryParam("company-name") String company_name, @QueryParam("current-company") String current_company, @QueryParam("title") String title, @QueryParam("current-title") String current_title, 
                @QueryParam("school-name") String school_name, @QueryParam("current-school") String current_school, @QueryParam("country-code") String country_code, @QueryParam("postal-code") String postal_code, 
                @QueryParam("distance") Distance distance, @QueryParam("facet") String facet, @QueryParam("facets") String facets, @QueryParam("start") Long start, 
                @QueryParam("count") Long count, @QueryParam("sort") String sort);

    @GET
    @Produces("application/xml")
    @Path("/company-search{fields}")
    CompanySearch searchCompanies(@PathParam("fields") String fields, @QueryParam("keywords") String keywords, @QueryParam("hq-only") String hq_only, @QueryParam("facet") String facet, 
                @QueryParam("facets") String facets, @QueryParam("start") Long start, @QueryParam("count") Long count, @QueryParam("sort") String sort);

    @GET
    @Produces("application/xml")
    @Path("/job-search{fields}")
    JobSearch searchJobs(@PathParam("fields") String fields, @QueryParam("keywords") String keywords, @QueryParam("company-name") String company_name, @QueryParam("job-title") String job_title, 
                @QueryParam("country-code") String country_code, @QueryParam("postal-code") String postal_code, @QueryParam("distance") Distance distance, @QueryParam("facet") String facet, 
                @QueryParam("facets") String facets, @QueryParam("start") Long start, @QueryParam("count") Long count, @QueryParam("sort") String sort);

}