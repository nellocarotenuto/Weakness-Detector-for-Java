/**
 * Created by Apache CXF WadlToJava code generator
**/
package org.apache.camel.component.linkedin.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;
import org.apache.camel.component.linkedin.api.model.Companies;
import org.apache.camel.component.linkedin.api.model.Company;
import org.apache.camel.component.linkedin.api.model.CompanyStatistics;
import org.apache.camel.component.linkedin.api.model.EventType;
import org.apache.camel.component.linkedin.api.model.HistoricalFollowStatistics;
import org.apache.camel.component.linkedin.api.model.HistoricalStatusUpdateStatistics;
import org.apache.camel.component.linkedin.api.model.IsCompanyShareEnabled;
import org.apache.camel.component.linkedin.api.model.Likes;
import org.apache.camel.component.linkedin.api.model.NumFollowers;
import org.apache.camel.component.linkedin.api.model.Share;
import org.apache.camel.component.linkedin.api.model.TimeGranularity;
import org.apache.camel.component.linkedin.api.model.Update;
import org.apache.camel.component.linkedin.api.model.UpdateComment;
import org.apache.camel.component.linkedin.api.model.UpdateComments;
import org.apache.camel.component.linkedin.api.model.Updates;

public interface CompaniesResource {

    @GET
    @Produces("application/xml")
    @Path("/companies{fields}")
    Companies getCompanies(@PathParam("fields") String fields, @QueryParam("email-domain") String email_domain, @QueryParam("is-company-admin") Boolean is_company_admin);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}{fields}")
    Company getCompanyById(@PathParam("company-id") long company_id, @PathParam("fields") String fields);

    @GET
    @Produces("application/xml")
    @Path("/companies/universal-name={universal-name}{fields}")
    Company getCompanyByName(@PathParam("universal-name") String universal_name, @PathParam("fields") String fields);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/updates{fields}")
    Updates getCompanyUpdates(@PathParam("company-id") long company_id, @PathParam("fields") String fields, @QueryParam("event-type") EventType event_type, @QueryParam("start") Long start, 
                @QueryParam("count") Long count);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/updates/key={update-key}/update-comments{fields}")
    UpdateComments getCompanyUpdateComments(@PathParam("company-id") long company_id, @PathParam("update-key") String update_key, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @POST
    @Consumes("application/xml")
    @Path("/companies/{company-id}/updates/key={update-key}/update-comments-as-company")
    void addCompanyUpdateCommentAsCompany(@PathParam("company-id") long company_id, @PathParam("update-key") String update_key, UpdateComment updatecomment);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/updates/key={update-key}/likes{fields}")
    Likes getCompanyUpdateLikes(@PathParam("company-id") long company_id, @PathParam("update-key") String update_key, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @POST
    @Consumes("application/xml")
    @Produces("application/xml")
    @Path("/companies/{company-id}/shares")
    Update addShare(@PathParam("company-id") long company_id, Share share);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/is-company-share-enabled")
    IsCompanyShareEnabled isShareEnabled(@PathParam("company-id") long company_id);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/relation-to-viewer/is-company-share-enabled")
    IsCompanyShareEnabled isViewerShareEnabled(@PathParam("company-id") long company_id);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/historical-follow-statistics")
    HistoricalFollowStatistics getHistoricalFollowStatistics(@PathParam("company-id") long company_id, @QueryParam("start-timestamp") Long start_timestamp, @QueryParam("end-timestamp") Long end_timestamp, @QueryParam("time-granularity") TimeGranularity time_granularity);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/historical-status-update-statistics")
    HistoricalStatusUpdateStatistics getHistoricalStatusUpdateStatistics(@PathParam("company-id") long company_id, @QueryParam("start-timestamp") Long start_timestamp, @QueryParam("end-timestamp") Long end_timestamp, @QueryParam("time-granularity") TimeGranularity time_granularity, 
                @QueryParam("update-key") String update_key);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/company-statistics")
    CompanyStatistics getStatistics(@PathParam("company-id") long company_id);

    @GET
    @Produces("application/xml")
    @Path("/companies/{company-id}/num-followers")
    NumFollowers getNumberOfFollowers(@PathParam("company-id") long company_id, @QueryParam("geos") List<String> geos, @QueryParam("companySizes") List<String> companySizes, @QueryParam("jobFunc") List<String> jobFunc, 
                @QueryParam("industries") List<String> industries, @QueryParam("seniorities") List<String> seniorities);

}