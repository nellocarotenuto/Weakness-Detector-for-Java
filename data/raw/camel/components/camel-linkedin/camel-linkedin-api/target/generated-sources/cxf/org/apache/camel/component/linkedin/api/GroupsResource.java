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
import org.apache.camel.component.linkedin.api.model.Group;
import org.apache.camel.component.linkedin.api.model.Order;
import org.apache.camel.component.linkedin.api.model.Post;
import org.apache.camel.component.linkedin.api.model.PostCategoryCode;
import org.apache.camel.component.linkedin.api.model.Posts;

@Path("groups")
public interface GroupsResource {

    @GET
    @Produces("application/xml")
    @Path("/{group-id}{fields}")
    Group getGroup(@PathParam("group-id") long group_id, @PathParam("fields") String fields);

    @GET
    @Produces("application/xml")
    @Path("/{group-id}/posts{fields}")
    Posts getPosts(@PathParam("group-id") long group_id, @QueryParam("start") Long start, @QueryParam("count") Long count, @QueryParam("order") Order order, 
                @QueryParam("category") PostCategoryCode category, @QueryParam("modified-since") Long modified_since, @PathParam("fields") String fields);

    @POST
    @Consumes("application/xml")
    @Path("/{group-id}/posts")
    void addPost(@PathParam("group-id") long group_id, Post post);

}