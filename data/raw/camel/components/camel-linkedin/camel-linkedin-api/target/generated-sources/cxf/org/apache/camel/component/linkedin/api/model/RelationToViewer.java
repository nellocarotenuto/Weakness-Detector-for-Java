
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}related-connections"/&gt;
 *         &lt;element ref="{}distance"/&gt;
 *         &lt;element ref="{}membership-state" minOccurs="0"/&gt;
 *         &lt;element ref="{}is-following"/&gt;
 *         &lt;element ref="{}is-liked"/&gt;
 *         &lt;element ref="{}available-actions" minOccurs="0"/&gt;
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
    "relatedConnections",
    "distance",
    "membershipState",
    "isFollowing",
    "isLiked",
    "availableActions"
})
@XmlRootElement(name = "relation-to-viewer")
public class RelationToViewer {

    @XmlElement(name = "related-connections", required = true)
    protected RelatedConnections relatedConnections;
    @XmlElement(required = true)
    protected Distance distance;
    @XmlElement(name = "membership-state")
    protected MembershipState membershipState;
    @XmlElement(name = "is-following", required = true)
    protected IsFollowing isFollowing;
    @XmlElement(name = "is-liked", required = true)
    protected IsLiked isLiked;
    @XmlElement(name = "available-actions")
    protected AvailableActions availableActions;

    /**
     * Gets the value of the relatedConnections property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedConnections }
     *     
     */
    public RelatedConnections getRelatedConnections() {
        return relatedConnections;
    }

    /**
     * Sets the value of the relatedConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedConnections }
     *     
     */
    public void setRelatedConnections(RelatedConnections value) {
        this.relatedConnections = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
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
     * Gets the value of the isFollowing property.
     * 
     * @return
     *     possible object is
     *     {@link IsFollowing }
     *     
     */
    public IsFollowing getIsFollowing() {
        return isFollowing;
    }

    /**
     * Sets the value of the isFollowing property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsFollowing }
     *     
     */
    public void setIsFollowing(IsFollowing value) {
        this.isFollowing = value;
    }

    /**
     * Gets the value of the isLiked property.
     * 
     * @return
     *     possible object is
     *     {@link IsLiked }
     *     
     */
    public IsLiked getIsLiked() {
        return isLiked;
    }

    /**
     * Sets the value of the isLiked property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsLiked }
     *     
     */
    public void setIsLiked(IsLiked value) {
        this.isLiked = value;
    }

    /**
     * Gets the value of the availableActions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableActions }
     *     
     */
    public AvailableActions getAvailableActions() {
        return availableActions;
    }

    /**
     * Sets the value of the availableActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableActions }
     *     
     */
    public void setAvailableActions(AvailableActions value) {
        this.availableActions = value;
    }

}
