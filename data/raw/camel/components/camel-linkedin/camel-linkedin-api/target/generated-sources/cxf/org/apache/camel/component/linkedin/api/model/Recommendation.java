
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}recommendation-type"/&gt;
 *         &lt;element ref="{}recommendation-text" minOccurs="0"/&gt;
 *         &lt;element ref="{}recommendation-snippet" minOccurs="0"/&gt;
 *         &lt;element ref="{}recommender"/&gt;
 *         &lt;element ref="{}recommendee"/&gt;
 *         &lt;element ref="{}web-url" minOccurs="0"/&gt;
 *         &lt;element ref="{}product-id"/&gt;
 *         &lt;element ref="{}timestamp"/&gt;
 *         &lt;element ref="{}text" minOccurs="0"/&gt;
 *         &lt;element ref="{}reply"/&gt;
 *         &lt;element ref="{}likes"/&gt;
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
    "recommendationType",
    "recommendationText",
    "recommendationSnippet",
    "recommender",
    "recommendee",
    "webUrl",
    "productId",
    "timestamp",
    "text",
    "reply",
    "likes"
})
@XmlRootElement(name = "recommendation")
public class Recommendation {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(name = "recommendation-type", required = true)
    protected RecommendationType recommendationType;
    @XmlElement(name = "recommendation-text")
    protected String recommendationText;
    @XmlElement(name = "recommendation-snippet")
    protected String recommendationSnippet;
    @XmlElement(required = true)
    protected Recommender recommender;
    @XmlElement(required = true)
    protected Recommendee recommendee;
    @XmlElement(name = "web-url")
    @XmlSchemaType(name = "anyURI")
    protected String webUrl;
    @XmlElement(name = "product-id", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long productId;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long timestamp;
    protected String text;
    @XmlElement(required = true)
    protected String reply;
    @XmlElement(required = true)
    protected Likes likes;

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
     * Gets the value of the recommendationType property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationType }
     *     
     */
    public RecommendationType getRecommendationType() {
        return recommendationType;
    }

    /**
     * Sets the value of the recommendationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationType }
     *     
     */
    public void setRecommendationType(RecommendationType value) {
        this.recommendationType = value;
    }

    /**
     * Gets the value of the recommendationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationText() {
        return recommendationText;
    }

    /**
     * Sets the value of the recommendationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationText(String value) {
        this.recommendationText = value;
    }

    /**
     * Gets the value of the recommendationSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationSnippet() {
        return recommendationSnippet;
    }

    /**
     * Sets the value of the recommendationSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationSnippet(String value) {
        this.recommendationSnippet = value;
    }

    /**
     * Gets the value of the recommender property.
     * 
     * @return
     *     possible object is
     *     {@link Recommender }
     *     
     */
    public Recommender getRecommender() {
        return recommender;
    }

    /**
     * Sets the value of the recommender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recommender }
     *     
     */
    public void setRecommender(Recommender value) {
        this.recommender = value;
    }

    /**
     * Gets the value of the recommendee property.
     * 
     * @return
     *     possible object is
     *     {@link Recommendee }
     *     
     */
    public Recommendee getRecommendee() {
        return recommendee;
    }

    /**
     * Sets the value of the recommendee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recommendee }
     *     
     */
    public void setRecommendee(Recommendee value) {
        this.recommendee = value;
    }

    /**
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the reply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReply() {
        return reply;
    }

    /**
     * Sets the value of the reply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReply(String value) {
        this.reply = value;
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
