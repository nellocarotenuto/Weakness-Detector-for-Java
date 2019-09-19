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
import org.apache.camel.component.linkedin.api.model.Activity;
import org.apache.camel.component.linkedin.api.model.Companies;
import org.apache.camel.component.linkedin.api.model.Company;
import org.apache.camel.component.linkedin.api.model.Connections;
import org.apache.camel.component.linkedin.api.model.GroupMembership;
import org.apache.camel.component.linkedin.api.model.GroupMemberships;
import org.apache.camel.component.linkedin.api.model.Groups;
import org.apache.camel.component.linkedin.api.model.IsLiked;
import org.apache.camel.component.linkedin.api.model.JobBookmark;
import org.apache.camel.component.linkedin.api.model.JobBookmarks;
import org.apache.camel.component.linkedin.api.model.JobSuggestions;
import org.apache.camel.component.linkedin.api.model.Likes;
import org.apache.camel.component.linkedin.api.model.MailboxItem;
import org.apache.camel.component.linkedin.api.model.MembershipStateCode;
import org.apache.camel.component.linkedin.api.model.NetworkStats;
import org.apache.camel.component.linkedin.api.model.NetworkUpdateReturnType;
import org.apache.camel.component.linkedin.api.model.Order;
import org.apache.camel.component.linkedin.api.model.Person;
import org.apache.camel.component.linkedin.api.model.PostCategoryCode;
import org.apache.camel.component.linkedin.api.model.PostRole;
import org.apache.camel.component.linkedin.api.model.Posts;
import org.apache.camel.component.linkedin.api.model.Share;
import org.apache.camel.component.linkedin.api.model.Update;
import org.apache.camel.component.linkedin.api.model.UpdateComment;
import org.apache.camel.component.linkedin.api.model.UpdateComments;
import org.apache.camel.component.linkedin.api.model.Updates;

@Path("people")
public interface PeopleResource {

    @GET
    @Produces("application/xml")
    @Path("/~{fields}")
    Person getPerson(@PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @GET
    @Produces("application/xml")
    @Path("/~/connections{fields}")
    Connections getConnections(@PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @POST
    @Consumes("application/xml")
    @Produces("application/xml")
    @Path("/~/shares")
    Update share(Share share);

    @GET
    @Produces("application/xml")
    @Path("/~/network/updates{fields}")
    Updates getNetworkUpdates(@QueryParam("scope") String scope, @QueryParam("type") NetworkUpdateReturnType type, @QueryParam("count") Long count, @QueryParam("start") Long start, 
                @QueryParam("after") Long after, @QueryParam("before") Long before, @QueryParam("show-hidden-members") Boolean show_hidden_members, @PathParam("fields") String fields, 
                @QueryParam("secure-urls") Boolean secure_urls);

    @GET
    @Produces("application/xml")
    @Path("/~/network/updates/key={update-key}/update-comments{fields}")
    UpdateComments getUpdateComments(@PathParam("update-key") String update_key, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @POST
    @Consumes("application/xml")
    @Path("/~/network/updates/key={update-key}/update-comments")
    void addUpdateComment(@PathParam("update-key") String update_key, UpdateComment updatecomment);

    @GET
    @Produces("application/xml")
    @Path("/~/network/updates/key={update-key}/likes{fields}")
    Likes getUpdateLikes(@PathParam("update-key") String update_key, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @PUT
    @Consumes("application/xml")
    @Path("/~/network/updates/key={update-key}/is-liked")
    void likeUpdate(@PathParam("update-key") String update_key, IsLiked isliked);

    @GET
    @Produces("application/xml")
    @Path("/~/network/network-stats")
    NetworkStats getNetworkStats();

    @POST
    @Consumes("application/xml")
    @Path("/~/person-activities")
    void addActivity(Activity activity);

    @POST
    @Consumes("application/xml")
    @Path("/~/mailbox")
    void addInvite(MailboxItem mailboxitem);

    @GET
    @Produces("application/xml")
    @Path("/~/group-memberships{fields}")
    GroupMemberships getGroupMemberships(@QueryParam("membership-state") MembershipStateCode membership_state, @PathParam("fields") String fields, @QueryParam("count") Long count, @QueryParam("start") Long start);

    @POST
    @Consumes("application/xml")
    @Path("/~/group-memberships")
    void addGroupMembership(GroupMembership groupmembership);

    @GET
    @Produces("application/xml")
    @Path("/~/group-memberships/{group-id}{fields}")
    GroupMembership getGroupMembershipSettings(@PathParam("group-id") long group_id, @PathParam("fields") String fields);

    @PUT
    @Consumes("application/xml")
    @Path("/~/group-memberships/{group-id}")
    void updateGroupMembership(@PathParam("group-id") long group_id, GroupMembership groupmembership);

    @DELETE
    @Path("/~/group-memberships/{group-id}")
    void removeGroupMembership(@PathParam("group-id") long group_id);

    @GET
    @Produces("application/xml")
    @Path("/~/group-memberships/{group-id}/posts{fields}")
    Posts getPosts(@PathParam("group-id") long group_id, @QueryParam("start") Long start, @QueryParam("count") Long count, @QueryParam("order") Order order, 
                @QueryParam("role") PostRole role, @QueryParam("category") PostCategoryCode category, @QueryParam("modified-since") Long modified_since, @PathParam("fields") String fields);

    @GET
    @Produces("application/xml")
    @Path("/~/job-bookmarks")
    JobBookmarks getJobBookmarks();

    @POST
    @Consumes("application/xml")
    @Path("/~/job-bookmarks")
    void addJobBookmark(JobBookmark jobbookmark);

    @DELETE
    @Path("/~/job-bookmarks/{job-id}")
    void removeJobBookmark(@PathParam("job-id") long job_id);

    @GET
    @Produces("application/xml")
    @Path("/~/suggestions/groups{fields}")
    Groups getSuggestedGroups(@PathParam("fields") String fields);

    @DELETE
    @Path("/~/suggestions/groups/{group-id}")
    void removeGroupSuggestion(@PathParam("group-id") long group_id);

    @GET
    @Produces("application/xml")
    @Path("/~/suggestions/groups/{group-id}/posts{fields}")
    Posts getSuggestedGroupPosts(@PathParam("group-id") long group_id, @QueryParam("start") Long start, @QueryParam("count") Long count, @QueryParam("order") Order order, 
                @QueryParam("category") PostCategoryCode category, @QueryParam("modified-since") Long modified_since, @PathParam("fields") String fields);

    @GET
    @Produces("application/xml")
    @Path("/~/suggestions/to-follow/companies{fields}")
    Companies getSuggestedCompanies(@PathParam("fields") String fields);

    @GET
    @Produces("application/xml")
    @Path("/~/suggestions/job-suggestions{fields}")
    JobSuggestions getSuggestedJobs(@PathParam("fields") String fields);

    @GET
    @Produces("application/xml")
    @Path("/~/following/companies{fields}")
    Companies getFollowedCompanies(@PathParam("fields") String fields);

    @POST
    @Consumes("application/xml")
    @Path("/~/following/companies")
    void followCompany(Company company);

    @DELETE
    @Path("/~/following/companies/id={company-id}")
    void stopFollowingCompany(@PathParam("company-id") long company_id);

    @GET
    @Produces("application/xml")
    @Path("/id={person-id}{fields}")
    Person getPersonById(@PathParam("person-id") String person_id, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @GET
    @Produces("application/xml")
    @Path("/id={person-id}/connections{fields}")
    Connections getConnectionsById(@PathParam("person-id") String person_id, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @GET
    @Produces("application/xml")
    @Path("/id={person-id}/network/updates{fields}")
    Updates getNetworkUpdatesById(@QueryParam("scope") String scope, @QueryParam("type") NetworkUpdateReturnType type, @QueryParam("count") Long count, @QueryParam("start") Long start, 
                @QueryParam("after") Long after, @QueryParam("before") Long before, @QueryParam("show-hidden-members") Boolean show_hidden_members, @PathParam("person-id") String person_id, 
                @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @GET
    @Produces("application/xml")
    @Path("/url={public-profile-url}{fields}")
    Person getPersonByUrl(@PathParam("public-profile-url") String public_profile_url, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

    @GET
    @Produces("application/xml")
    @Path("/url={public-profile-url}/connections{fields}")
    Connections getConnectionsByUrl(@PathParam("public-profile-url") String public_profile_url, @PathParam("fields") String fields, @QueryParam("secure-urls") Boolean secure_urls);

}