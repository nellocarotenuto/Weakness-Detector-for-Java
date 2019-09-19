/**
 * Created by Apache CXF WadlToJava code generator
**/
package org.apache.camel.component.linkedin.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.apache.camel.component.linkedin.api.model.Job;

@Path("jobs")
public interface JobsResource {

    @POST
    @Consumes("application/xml")
    void addJob(Job job);

    @GET
    @Produces("application/xml")
    @Path("/{job-id}${fields}")
    Job getJob(@PathParam("job-id") long job_id, @PathParam("fields") String fields);

    @PUT
    @Consumes("application/xml")
    @Path("/partner-job-id={partner-job-id}")
    void editJob(@PathParam("partner-job-id") long partner_job_id, Job job);

    @DELETE
    @Path("/partner-job-id={partner-job-id}")
    void removeJob(@PathParam("partner-job-id") long partner_job_id);

}