
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
 *         &lt;element ref="{}id" minOccurs="0"/&gt;
 *         &lt;element ref="{}title"/&gt;
 *         &lt;element ref="{}submitted-url"/&gt;
 *         &lt;element ref="{}shortened-url" minOccurs="0"/&gt;
 *         &lt;element ref="{}submitted-image-url"/&gt;
 *         &lt;element ref="{}description" minOccurs="0"/&gt;
 *         &lt;element ref="{}thumbnail-url" minOccurs="0"/&gt;
 *         &lt;element ref="{}resolved-url" minOccurs="0"/&gt;
 *         &lt;element ref="{}eyebrow-url" minOccurs="0"/&gt;
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
    "title",
    "submittedUrl",
    "shortenedUrl",
    "submittedImageUrl",
    "description",
    "thumbnailUrl",
    "resolvedUrl",
    "eyebrowUrl"
})
@XmlRootElement(name = "content")
public class Content {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "submitted-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String submittedUrl;
    @XmlElement(name = "shortened-url")
    @XmlSchemaType(name = "anyURI")
    protected String shortenedUrl;
    @XmlElement(name = "submitted-image-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String submittedImageUrl;
    protected String description;
    @XmlElement(name = "thumbnail-url")
    @XmlSchemaType(name = "anyURI")
    protected String thumbnailUrl;
    @XmlElement(name = "resolved-url")
    @XmlSchemaType(name = "anyURI")
    protected String resolvedUrl;
    @XmlElement(name = "eyebrow-url")
    @XmlSchemaType(name = "anyURI")
    protected String eyebrowUrl;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the submittedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedUrl() {
        return submittedUrl;
    }

    /**
     * Sets the value of the submittedUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedUrl(String value) {
        this.submittedUrl = value;
    }

    /**
     * Gets the value of the shortenedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortenedUrl() {
        return shortenedUrl;
    }

    /**
     * Sets the value of the shortenedUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortenedUrl(String value) {
        this.shortenedUrl = value;
    }

    /**
     * Gets the value of the submittedImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedImageUrl() {
        return submittedImageUrl;
    }

    /**
     * Sets the value of the submittedImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedImageUrl(String value) {
        this.submittedImageUrl = value;
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
     * Gets the value of the thumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Sets the value of the thumbnailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailUrl(String value) {
        this.thumbnailUrl = value;
    }

    /**
     * Gets the value of the resolvedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvedUrl() {
        return resolvedUrl;
    }

    /**
     * Sets the value of the resolvedUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvedUrl(String value) {
        this.resolvedUrl = value;
    }

    /**
     * Gets the value of the eyebrowUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEyebrowUrl() {
        return eyebrowUrl;
    }

    /**
     * Sets the value of the eyebrowUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEyebrowUrl(String value) {
        this.eyebrowUrl = value;
    }

}
