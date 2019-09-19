
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}timestamp"/&gt;
 *         &lt;element ref="{}update-key"/&gt;
 *         &lt;element ref="{}update-type"/&gt;
 *         &lt;element ref="{}update-content"/&gt;
 *         &lt;element ref="{}is-commentable"/&gt;
 *         &lt;element ref="{}is-likable"/&gt;
 *         &lt;element ref="{}is-liked"/&gt;
 *         &lt;element ref="{}num-likes"/&gt;
 *         &lt;element ref="{}update-comments" minOccurs="0"/&gt;
 *         &lt;element ref="{}likes" minOccurs="0"/&gt;
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
    "timestamp",
    "updateKey",
    "updateType",
    "updateContent",
    "isCommentable",
    "isLikable",
    "isLiked",
    "numLikes",
    "updateComments",
    "likes"
})
@XmlRootElement(name = "update")
public class Update {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long timestamp;
    @XmlElement(name = "update-key", required = true)
    protected String updateKey;
    @XmlElement(name = "update-type", required = true)
    protected NetworkUpdateReturnType updateType;
    @XmlElement(name = "update-content", required = true)
    protected UpdateContent updateContent;
    @XmlElement(name = "is-commentable")
    protected boolean isCommentable;
    @XmlElement(name = "is-likable")
    protected boolean isLikable;
    @XmlElement(name = "is-liked", required = true)
    protected IsLiked isLiked;
    @XmlElement(name = "num-likes", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long numLikes;
    @XmlElement(name = "update-comments")
    protected UpdateComments updateComments;
    protected Likes likes;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(Long value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the updateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateKey() {
        return updateKey;
    }

    /**
     * Sets the value of the updateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateKey(String value) {
        this.updateKey = value;
    }

    /**
     * Gets the value of the updateType property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkUpdateReturnType }
     *     
     */
    public NetworkUpdateReturnType getUpdateType() {
        return updateType;
    }

    /**
     * Sets the value of the updateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkUpdateReturnType }
     *     
     */
    public void setUpdateType(NetworkUpdateReturnType value) {
        this.updateType = value;
    }

    /**
     * Gets the value of the updateContent property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateContent }
     *     
     */
    public UpdateContent getUpdateContent() {
        return updateContent;
    }

    /**
     * Sets the value of the updateContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateContent }
     *     
     */
    public void setUpdateContent(UpdateContent value) {
        this.updateContent = value;
    }

    /**
     * Gets the value of the isCommentable property.
     * 
     */
    public boolean isIsCommentable() {
        return isCommentable;
    }

    /**
     * Sets the value of the isCommentable property.
     * 
     */
    public void setIsCommentable(boolean value) {
        this.isCommentable = value;
    }

    /**
     * Gets the value of the isLikable property.
     * 
     */
    public boolean isIsLikable() {
        return isLikable;
    }

    /**
     * Sets the value of the isLikable property.
     * 
     */
    public void setIsLikable(boolean value) {
        this.isLikable = value;
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
     * Gets the value of the numLikes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumLikes() {
        return numLikes;
    }

    /**
     * Sets the value of the numLikes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLikes(Long value) {
        this.numLikes = value;
    }

    /**
     * Gets the value of the updateComments property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateComments }
     *     
     */
    public UpdateComments getUpdateComments() {
        return updateComments;
    }

    /**
     * Sets the value of the updateComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateComments }
     *     
     */
    public void setUpdateComments(UpdateComments value) {
        this.updateComments = value;
    }

    /**
     * Gets the value of the likes property.
     * 
     * @return
     *     possible object is
     *     {@link Likes }
     *     
     */
    public Likes getLikes() {
        return likes;
    }

    /**
     * Sets the value of the likes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Likes }
     *     
     */
    public void setLikes(Likes value) {
        this.likes = value;
    }

}
