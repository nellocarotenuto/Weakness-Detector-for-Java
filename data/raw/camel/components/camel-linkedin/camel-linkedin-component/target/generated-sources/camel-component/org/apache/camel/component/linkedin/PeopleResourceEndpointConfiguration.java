/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 * Generated on: Wed Sep 11 15:20:08 CEST 2019
 */
package org.apache.camel.component.linkedin;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.linkedin.api.PeopleResource
 */
@UriParams
public final class PeopleResourceEndpointConfiguration extends LinkedInConfiguration {

    @UriParam
    private org.apache.camel.component.linkedin.api.model.Activity activity;

    @UriParam
    private Long after;

    @UriParam
    private Long before;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.PostCategoryCode category;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.Company company;

    @UriParam
    private Long company_id;

    @UriParam
    private Long count;

    @UriParam
    private String fields;

    @UriParam
    private Long group_id;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.GroupMembership groupmembership;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.IsLiked isliked;

    @UriParam
    private Long job_id;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.JobBookmark jobbookmark;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.MailboxItem mailboxitem;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.MembershipStateCode membership_state;

    @UriParam
    private Long modified_since;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.Order order;

    @UriParam
    private String person_id;

    @UriParam
    private String public_profile_url;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.PostRole role;

    @UriParam
    private String scope;

    @UriParam
    private Boolean secure_urls;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.Share share;

    @UriParam
    private Boolean show_hidden_members;

    @UriParam
    private Long start;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.NetworkUpdateReturnType type;

    @UriParam
    private String update_key;

    @UriParam
    private org.apache.camel.component.linkedin.api.model.UpdateComment updatecomment;

    public org.apache.camel.component.linkedin.api.model.Activity getActivity() {
        return activity;
    }

    public void setActivity(org.apache.camel.component.linkedin.api.model.Activity activity) {
        this.activity = activity;
    }

    public Long getAfter() {
        return after;
    }

    public void setAfter(Long after) {
        this.after = after;
    }

    public Long getBefore() {
        return before;
    }

    public void setBefore(Long before) {
        this.before = before;
    }

    public org.apache.camel.component.linkedin.api.model.PostCategoryCode getCategory() {
        return category;
    }

    public void setCategory(org.apache.camel.component.linkedin.api.model.PostCategoryCode category) {
        this.category = category;
    }

    public org.apache.camel.component.linkedin.api.model.Company getCompany() {
        return company;
    }

    public void setCompany(org.apache.camel.component.linkedin.api.model.Company company) {
        this.company = company;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public org.apache.camel.component.linkedin.api.model.GroupMembership getGroupmembership() {
        return groupmembership;
    }

    public void setGroupmembership(org.apache.camel.component.linkedin.api.model.GroupMembership groupmembership) {
        this.groupmembership = groupmembership;
    }

    public org.apache.camel.component.linkedin.api.model.IsLiked getIsliked() {
        return isliked;
    }

    public void setIsliked(org.apache.camel.component.linkedin.api.model.IsLiked isliked) {
        this.isliked = isliked;
    }

    public Long getJob_id() {
        return job_id;
    }

    public void setJob_id(Long job_id) {
        this.job_id = job_id;
    }

    public org.apache.camel.component.linkedin.api.model.JobBookmark getJobbookmark() {
        return jobbookmark;
    }

    public void setJobbookmark(org.apache.camel.component.linkedin.api.model.JobBookmark jobbookmark) {
        this.jobbookmark = jobbookmark;
    }

    public org.apache.camel.component.linkedin.api.model.MailboxItem getMailboxitem() {
        return mailboxitem;
    }

    public void setMailboxitem(org.apache.camel.component.linkedin.api.model.MailboxItem mailboxitem) {
        this.mailboxitem = mailboxitem;
    }

    public org.apache.camel.component.linkedin.api.model.MembershipStateCode getMembership_state() {
        return membership_state;
    }

    public void setMembership_state(org.apache.camel.component.linkedin.api.model.MembershipStateCode membership_state) {
        this.membership_state = membership_state;
    }

    public Long getModified_since() {
        return modified_since;
    }

    public void setModified_since(Long modified_since) {
        this.modified_since = modified_since;
    }

    public org.apache.camel.component.linkedin.api.model.Order getOrder() {
        return order;
    }

    public void setOrder(org.apache.camel.component.linkedin.api.model.Order order) {
        this.order = order;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getPublic_profile_url() {
        return public_profile_url;
    }

    public void setPublic_profile_url(String public_profile_url) {
        this.public_profile_url = public_profile_url;
    }

    public org.apache.camel.component.linkedin.api.model.PostRole getRole() {
        return role;
    }

    public void setRole(org.apache.camel.component.linkedin.api.model.PostRole role) {
        this.role = role;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Boolean getSecure_urls() {
        return secure_urls;
    }

    public void setSecure_urls(Boolean secure_urls) {
        this.secure_urls = secure_urls;
    }

    public org.apache.camel.component.linkedin.api.model.Share getShare() {
        return share;
    }

    public void setShare(org.apache.camel.component.linkedin.api.model.Share share) {
        this.share = share;
    }

    public Boolean getShow_hidden_members() {
        return show_hidden_members;
    }

    public void setShow_hidden_members(Boolean show_hidden_members) {
        this.show_hidden_members = show_hidden_members;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public org.apache.camel.component.linkedin.api.model.NetworkUpdateReturnType getType() {
        return type;
    }

    public void setType(org.apache.camel.component.linkedin.api.model.NetworkUpdateReturnType type) {
        this.type = type;
    }

    public String getUpdate_key() {
        return update_key;
    }

    public void setUpdate_key(String update_key) {
        this.update_key = update_key;
    }

    public org.apache.camel.component.linkedin.api.model.UpdateComment getUpdatecomment() {
        return updatecomment;
    }

    public void setUpdatecomment(org.apache.camel.component.linkedin.api.model.UpdateComment updatecomment) {
        this.updatecomment = updatecomment;
    }
}
