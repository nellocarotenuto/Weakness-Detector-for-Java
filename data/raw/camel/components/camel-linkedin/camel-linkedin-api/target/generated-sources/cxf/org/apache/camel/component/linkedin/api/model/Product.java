
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
 *         &lt;element ref="{}name"/&gt;
 *         &lt;element name="type" type="{}product-type"/&gt;
 *         &lt;element ref="{}description"/&gt;
 *         &lt;element ref="{}logo-url"/&gt;
 *         &lt;element ref="{}creation-timestamp"/&gt;
 *         &lt;element ref="{}features"/&gt;
 *         &lt;element ref="{}num-recommendations"/&gt;
 *         &lt;element ref="{}product-deal"/&gt;
 *         &lt;element ref="{}sales-persons"/&gt;
 *         &lt;element ref="{}video"/&gt;
 *         &lt;element ref="{}recommendations" minOccurs="0"/&gt;
 *         &lt;element ref="{}product-category"/&gt;
 *         &lt;element ref="{}website-url"/&gt;
 *         &lt;element ref="{}disclaimer" minOccurs="0"/&gt;
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
    "type",
    "description",
    "logoUrl",
    "creationTimestamp",
    "features",
    "numRecommendations",
    "productDeal",
    "salesPersons",
    "video",
    "recommendations",
    "productCategory",
    "websiteUrl",
    "disclaimer"
})
@XmlRootElement(name = "product")
public class Product {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ProductType type;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "logo-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String logoUrl;
    @XmlElement(name = "creation-timestamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long creationTimestamp;
    @XmlElement(required = true)
    protected Features features;
    @XmlElement(name = "num-recommendations", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long numRecommendations;
    @XmlElement(name = "product-deal", required = true)
    protected ProductDeal productDeal;
    @XmlElement(name = "sales-persons", required = true)
    protected SalesPersons salesPersons;
    @XmlElement(required = true)
    protected Video video;
    protected Recommendations recommendations;
    @XmlElement(name = "product-category", required = true)
    protected ProductCategory productCategory;
    @XmlElement(name = "website-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String websiteUrl;
    protected String disclaimer;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setType(ProductType value) {
        this.type = value;
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
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimestamp(Long value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setFeatures(Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the numRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumRecommendations() {
        return numRecommendations;
    }

    /**
     * Sets the value of the numRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRecommendations(Long value) {
        this.numRecommendations = value;
    }

    /**
     * Gets the value of the productDeal property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDeal }
     *     
     */
    public ProductDeal getProductDeal() {
        return productDeal;
    }

    /**
     * Sets the value of the productDeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDeal }
     *     
     */
    public void setProductDeal(ProductDeal value) {
        this.productDeal = value;
    }

    /**
     * Gets the value of the salesPersons property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersons }
     *     
     */
    public SalesPersons getSalesPersons() {
        return salesPersons;
    }

    /**
     * Sets the value of the salesPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersons }
     *     
     */
    public void setSalesPersons(SalesPersons value) {
        this.salesPersons = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link Video }
     *     
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link Video }
     *     
     */
    public void setVideo(Video value) {
        this.video = value;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link Recommendations }
     *     
     */
    public Recommendations getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recommendations }
     *     
     */
    public void setRecommendations(Recommendations value) {
        this.recommendations = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategory }
     *     
     */
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategory }
     *     
     */
    public void setProductCategory(ProductCategory value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the websiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    /**
     * Sets the value of the websiteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteUrl(String value) {
        this.websiteUrl = value;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

}
