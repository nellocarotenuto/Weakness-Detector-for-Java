
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="like-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="impression-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="click-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="comment-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="share-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="engagement" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="unique-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "time",
    "likeCount",
    "impressionCount",
    "clickCount",
    "commentCount",
    "shareCount",
    "engagement",
    "uniqueCount"
})
public class HistoricalStatusUpdateStatistic {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long time;
    @XmlElement(name = "like-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long likeCount;
    @XmlElement(name = "impression-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long impressionCount;
    @XmlElement(name = "click-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long clickCount;
    @XmlElement(name = "comment-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long commentCount;
    @XmlElement(name = "share-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long shareCount;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long engagement;
    @XmlElement(name = "unique-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long uniqueCount;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(Long value) {
        this.time = value;
    }

    /**
     * Gets the value of the likeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * Sets the value of the likeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLikeCount(Long value) {
        this.likeCount = value;
    }

    /**
     * Gets the value of the impressionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getImpressionCount() {
        return impressionCount;
    }

    /**
     * Sets the value of the impressionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpressionCount(Long value) {
        this.impressionCount = value;
    }

    /**
     * Gets the value of the clickCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getClickCount() {
        return clickCount;
    }

    /**
     * Sets the value of the clickCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClickCount(Long value) {
        this.clickCount = value;
    }

    /**
     * Gets the value of the commentCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * Sets the value of the commentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentCount(Long value) {
        this.commentCount = value;
    }

    /**
     * Gets the value of the shareCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getShareCount() {
        return shareCount;
    }

    /**
     * Sets the value of the shareCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareCount(Long value) {
        this.shareCount = value;
    }

    /**
     * Gets the value of the engagement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEngagement() {
        return engagement;
    }

    /**
     * Sets the value of the engagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngagement(Long value) {
        this.engagement = value;
    }

    /**
     * Gets the value of the uniqueCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getUniqueCount() {
        return uniqueCount;
    }

    /**
     * Sets the value of the uniqueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCount(Long value) {
        this.uniqueCount = value;
    }

}
