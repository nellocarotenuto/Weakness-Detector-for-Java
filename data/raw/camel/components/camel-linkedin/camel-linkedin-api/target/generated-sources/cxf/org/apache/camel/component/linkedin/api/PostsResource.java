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
import javax.ws.rs.QueryParam;
import org.apache.camel.component.linkedin.api.model.Comment;
import org.apache.camel.component.linkedin.api.model.Comments;
import org.apache.camel.component.linkedin.api.model.IsFollowing;
import org.apache.camel.component.linkedin.api.model.IsLiked;
import org.apache.camel.component.linkedin.api.model.Post;
import org.apache.camel.component.linkedin.api.model.PostCategoryCode;

@Path("posts")
public interface PostsResource {

    @GET
    @Produces("application/xml")
    @Path("/{post-id}{fields}")
    Post getPost(@PathParam("post-id") String post_id, @QueryParam("count") Long count, @QueryParam("start") Long start, @PathParam("fields") String fields);

    @PUT
    @Consumes("application/xml")
    @Path("/{post-id}/relation-to-viewer/is-liked")
    void likePost(@PathParam("post-id") String post_id, IsLiked isliked);

    @PUT
    @Consumes("application/xml")
    @Path("/{post-id}/relation-to-viewer/is-following")
    void followPost(@PathParam("post-id") String post_id, IsFollowing isfollowing);

    @PUT
    @Consumes("application/xml")
    @Path("/{post-id}/category/code")
    void flagCategory(@PathParam("post-id") String post_id, PostCategoryCode postcategorycode);

    @DELETE
    @Path("/{post-id}")
    void removePost(@PathParam("post-id") String post_id);

    @GET
    @Produces("application/xml")
    @Path("/{post-id}/comments{fields}")
    Comments getPostComments(@PathParam("post-id") String post_id, @QueryParam("count") Long count, @QueryParam("start") Long start, @PathParam("fields") String fields);

    @POST
    @Consumes("application/xml")
    @Path("/{post-id}/comments")
    void addComment(@PathParam("post-id") String post_id, Comment comment);

}