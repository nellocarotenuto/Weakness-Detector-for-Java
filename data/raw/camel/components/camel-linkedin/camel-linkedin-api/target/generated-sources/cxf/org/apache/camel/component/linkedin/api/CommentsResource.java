/**
 * Created by Apache CXF WadlToJava code generator
**/
package org.apache.camel.component.linkedin.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.apache.camel.component.linkedin.api.model.Comment;

@Path("comments")
public interface CommentsResource {

    @GET
    @Produces("application/xml")
    @Path("/{comment-id}{fields}")
    Comment getComment(@PathParam("comment-id") String comment_id, @PathParam("fields") String fields);

    @DELETE
    @Path("/{comment-id}")
    void removeComment(@PathParam("comment-id") String comment_id);

}