
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}name"/&gt;
 *         &lt;element ref="{}short-description"/&gt;
 *         &lt;element ref="{}description"/&gt;
 *         &lt;element ref="{}relation-to-viewer"/&gt;
 *         &lt;element ref="{}counts-by-category"/&gt;
 *         &lt;element ref="{}is-open-to-non-members" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{}GroupCategory"/&gt;
 *         &lt;element ref="{}site-group-url"/&gt;
 *         &lt;element ref="{}contact-email"/&gt;
 *         &lt;element ref="{}locale"/&gt;
 *         &lt;element ref="{}allow-member-invites" minOccurs="0"/&gt;
 *         &lt;element ref="{}small-logo-url"/&gt;
 *         &lt;element ref="{}large-logo-url"/&gt;
 *         &lt;element ref="{}posts"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "shortDescription",
    "description",
    "relationToViewer",
    "countsByCategory",
    "isOpenToNonMembers",
    "category",
    "siteGroupUrl",
    "contactEmail",
    "locale",
    "allowMemberInvites",
    "smallLogoUrl",
    "largeLogoUrl",
    "posts"
})
@XmlRootElement(name = "group")
public class Group {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "short-description", required = true)
    protected String shortDescription;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "relation-to-viewer", required = true)
    protected RelationToViewer relationToViewer;
    @XmlElement(name = "counts-by-category", required = true)
    protected CountsByCategory countsByCategory;
    @XmlElement(name = "is-open-to-non-members")
    protected Boolean isOpenToNonMembers;
    @XmlElement(required = true)
    protected GroupCategory category;
    @XmlElement(name = "site-group-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String siteGroupUrl;
    @XmlElement(name = "contact-email", required = true)
    protected String contactEmail;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String locale;
    @XmlElement(name = "allow-member-invites")
    protected Boolean allowMemberInvites;
    @XmlElement(name = "small-logo-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String smallLogoUrl;
    @XmlElement(name = "large-logo-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String largeLogoUrl;
    @XmlElement(required = true)
    protected Posts posts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the relationToViewer property.
     * 
     * @return
     *     possible object is
     *     {@link RelationToViewer }
     *     
     */
    public RelationToViewer getRelationToViewer() {
        return relationToViewer;
    }

    /**
     * Sets the value of the relationToViewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationToViewer }
     *     
     */
    public void setRelationToViewer(RelationToViewer value) {
        this.relationToViewer = value;
    }

    /**
     * Gets the value of the countsByCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CountsByCategory }
     *     
     */
    public CountsByCategory getCountsByCategory() {
        return countsByCategory;
    }

    /**
     * Sets the value of the countsByCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountsByCategory }
     *     
     */
    public void setCountsByCategory(CountsByCategory value) {
        this.countsByCategory = value;
    }

    /**
     * Gets the value of the isOpenToNonMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpenToNonMembers() {
        return isOpenToNonMembers;
    }

    /**
     * Sets the value of the isOpenToNonMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpenToNonMembers(Boolean value) {
        this.isOpenToNonMembers = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCategory }
     *     
     */
    public GroupCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCategory }
     *     
     */
    public void setCategory(GroupCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the siteGroupUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteGroupUrl() {
        return siteGroupUrl;
    }

    /**
     * Sets the value of the siteGroupUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteGroupUrl(String value) {
        this.siteGroupUrl = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the allowMemberInvites property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMemberInvites() {
        return allowMemberInvites;
    }

    /**
     * Sets the value of the allowMemberInvites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMemberInvites(Boolean value) {
        this.allowMemberInvites = value;
    }

    /**
     * Gets the value of the smallLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallLogoUrl() {
        return smallLogoUrl;
    }

    /**
     * Sets the value of the smallLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallLogoUrl(String value) {
        this.smallLogoUrl = value;
    }

    /**
     * Gets the value of the largeLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeLogoUrl() {
        return largeLogoUrl;
    }

    /**
     * Sets the value of the largeLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeLogoUrl(String value) {
        this.largeLogoUrl = value;
    }

    /**
     * Gets the value of the posts property.
     * 
     * @return
     *     possible object is
     *     {@link Posts }
     *     
     */
    public Posts getPosts() {
        return posts;
    }

    /**
     * Sets the value of the posts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Posts }
     *     
     */
    public void setPosts(Posts value) {
        this.posts = value;
    }

}
