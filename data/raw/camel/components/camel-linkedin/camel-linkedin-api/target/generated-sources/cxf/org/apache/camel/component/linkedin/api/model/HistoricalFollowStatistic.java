
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
 *         &lt;element name="total-follower-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="organic-follower-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="paid-follower-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "totalFollowerCount",
    "organicFollowerCount",
    "paidFollowerCount"
})
public class HistoricalFollowStatistic {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long time;
    @XmlElement(name = "total-follower-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long totalFollowerCount;
    @XmlElement(name = "organic-follower-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long organicFollowerCount;
    @XmlElement(name = "paid-follower-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long paidFollowerCount;

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
     * Gets the value of the totalFollowerCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTotalFollowerCount() {
        return totalFollowerCount;
    }

    /**
     * Sets the value of the totalFollowerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFollowerCount(Long value) {
        this.totalFollowerCount = value;
    }

    /**
     * Gets the value of the organicFollowerCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOrganicFollowerCount() {
        return organicFollowerCount;
    }

    /**
     * Sets the value of the organicFollowerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganicFollowerCount(Long value) {
        this.organicFollowerCount = value;
    }

    /**
     * Gets the value of the paidFollowerCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPaidFollowerCount() {
        return paidFollowerCount;
    }

    /**
     * Sets the value of the paidFollowerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidFollowerCount(Long value) {
        this.paidFollowerCount = value;
    }

}
