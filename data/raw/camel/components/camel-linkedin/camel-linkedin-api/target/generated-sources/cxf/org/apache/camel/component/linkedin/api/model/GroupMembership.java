
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.camel.component.linkedin.api.LongAdapter;


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
 *         &lt;element ref="{}group"/&gt;
 *         &lt;element ref="{}person"/&gt;
 *         &lt;element ref="{}membership-state"/&gt;
 *         &lt;element ref="{}contact-email"/&gt;
 *         &lt;element ref="{}show-group-logo-in-profile"/&gt;
 *         &lt;element ref="{}allow-messages-from-members"/&gt;
 *         &lt;element ref="{}email-digest-frequency"/&gt;
 *         &lt;element ref="{}email-announcements-from-managers"/&gt;
 *         &lt;element ref="{}email-for-every-new-post"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "group",
    "person",
    "membershipState",
    "contactEmail",
    "showGroupLogoInProfile",
    "allowMessagesFromMembers",
    "emailDigestFrequency",
    "emailAnnouncementsFromManagers",
    "emailForEveryNewPost"
})
@XmlRootElement(name = "group-membership")
public class GroupMembership {

    @XmlElement(required = true)
    protected Group group;
    @XmlElement(required = true)
    protected Person person;
    @XmlElement(name = "membership-state", required = true)
    protected MembershipState membershipState;
    @XmlElement(name = "contact-email", required = true)
    protected String contactEmail;
    @XmlElement(name = "show-group-logo-in-profile")
    protected boolean showGroupLogoInProfile;
    @XmlElement(name = "allow-messages-from-members")
    protected boolean allowMessagesFromMembers;
    @XmlElement(name = "email-digest-frequency", required = true)
    protected EmailDigestFrequency emailDigestFrequency;
    @XmlElement(name = "email-announcements-from-managers")
    protected boolean emailAnnouncementsFromManagers;
    @XmlElement(name = "email-for-every-new-post")
    protected boolean emailForEveryNewPost;
    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long key;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the membershipState property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipState }
     *     
     */
    public MembershipState getMembershipState() {
        return membershipState;
    }

    /**
     * Sets the value of the membershipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipState }
     *     
     */
    public void setMembershipState(MembershipState value) {
        this.membershipState = value;
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
     * Gets the value of the showGroupLogoInProfile property.
     * 
     */
    public boolean isShowGroupLogoInProfile() {
        return showGroupLogoInProfile;
    }

    /**
     * Sets the value of the showGroupLogoInProfile property.
     * 
     */
    public void setShowGroupLogoInProfile(boolean value) {
        this.showGroupLogoInProfile = value;
    }

    /**
     * Gets the value of the allowMessagesFromMembers property.
     * 
     */
    public boolean isAllowMessagesFromMembers() {
        return allowMessagesFromMembers;
    }

    /**
     * Sets the value of the allowMessagesFromMembers property.
     * 
     */
    public void setAllowMessagesFromMembers(boolean value) {
        this.allowMessagesFromMembers = value;
    }

    /**
     * Gets the value of the emailDigestFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link EmailDigestFrequency }
     *     
     */
    public EmailDigestFrequency getEmailDigestFrequency() {
        return emailDigestFrequency;
    }

    /**
     * Sets the value of the emailDigestFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailDigestFrequency }
     *     
     */
    public void setEmailDigestFrequency(EmailDigestFrequency value) {
        this.emailDigestFrequency = value;
    }

    /**
     * Gets the value of the emailAnnouncementsFromManagers property.
     * 
     */
    public boolean isEmailAnnouncementsFromManagers() {
        return emailAnnouncementsFromManagers;
    }

    /**
     * Sets the value of the emailAnnouncementsFromManagers property.
     * 
     */
    public void setEmailAnnouncementsFromManagers(boolean value) {
        this.emailAnnouncementsFromManagers = value;
    }

    /**
     * Gets the value of the emailForEveryNewPost property.
     * 
     */
    public boolean isEmailForEveryNewPost() {
        return emailForEveryNewPost;
    }

    /**
     * Sets the value of the emailForEveryNewPost property.
     * 
     */
    public void setEmailForEveryNewPost(boolean value) {
        this.emailForEveryNewPost = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(Long value) {
        this.key = value;
    }

}
