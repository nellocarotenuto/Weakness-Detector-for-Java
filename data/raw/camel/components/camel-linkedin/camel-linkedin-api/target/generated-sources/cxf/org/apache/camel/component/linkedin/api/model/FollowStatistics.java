
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
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="employee-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="non-employee-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="seniorities"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="seniority" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="entry-key" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="entry-value" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "count",
    "employeeCount",
    "nonEmployeeCount",
    "seniorities"
})
public class FollowStatistics {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long count;
    @XmlElement(name = "employee-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long employeeCount;
    @XmlElement(name = "non-employee-count", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long nonEmployeeCount;
    @XmlElement(required = true)
    protected Seniorities seniorities;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the employeeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEmployeeCount() {
        return employeeCount;
    }

    /**
     * Sets the value of the employeeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeCount(Long value) {
        this.employeeCount = value;
    }

    /**
     * Gets the value of the nonEmployeeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNonEmployeeCount() {
        return nonEmployeeCount;
    }

    /**
     * Sets the value of the nonEmployeeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEmployeeCount(Long value) {
        this.nonEmployeeCount = value;
    }

    /**
     * Gets the value of the seniorities property.
     * 
     * @return
     *     possible object is
     *     {@link Seniorities }
     *     
     */
    public Seniorities getSeniorities() {
        return seniorities;
    }

    /**
     * Sets the value of the seniorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seniorities }
     *     
     */
    public void setSeniorities(Seniorities value) {
        this.seniorities = value;
    }

}
