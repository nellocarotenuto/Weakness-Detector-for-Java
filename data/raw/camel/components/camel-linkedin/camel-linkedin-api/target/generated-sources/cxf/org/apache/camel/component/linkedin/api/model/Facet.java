
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
 *         &lt;element ref="{}name"/&gt;
 *         &lt;element name="code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="location"/&gt;
 *               &lt;enumeration value="industry"/&gt;
 *               &lt;enumeration value="network"/&gt;
 *               &lt;enumeration value="language"/&gt;
 *               &lt;enumeration value="current-company"/&gt;
 *               &lt;enumeration value="past-company"/&gt;
 *               &lt;enumeration value="school"/&gt;
 *               &lt;enumeration value="company-size"/&gt;
 *               &lt;enumeration value="num-followers-range"/&gt;
 *               &lt;enumeration value="fortune"/&gt;
 *               &lt;enumeration value="company"/&gt;
 *               &lt;enumeration value="date-posted"/&gt;
 *               &lt;enumeration value="job-function"/&gt;
 *               &lt;enumeration value="experience-level"/&gt;
 *               &lt;enumeration value="salary"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}buckets" minOccurs="0"/&gt;
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
    "name",
    "code",
    "buckets"
})
@XmlRootElement(name = "facet")
public class Facet {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected FacetType code;
    protected Buckets buckets;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link FacetType }
     *     
     */
    public FacetType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacetType }
     *     
     */
    public void setCode(FacetType value) {
        this.code = value;
    }

    /**
     * Gets the value of the buckets property.
     * 
     * @return
     *     possible object is
     *     {@link Buckets }
     *     
     */
    public Buckets getBuckets() {
        return buckets;
    }

    /**
     * Sets the value of the buckets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Buckets }
     *     
     */
    public void setBuckets(Buckets value) {
        this.buckets = value;
    }

}
