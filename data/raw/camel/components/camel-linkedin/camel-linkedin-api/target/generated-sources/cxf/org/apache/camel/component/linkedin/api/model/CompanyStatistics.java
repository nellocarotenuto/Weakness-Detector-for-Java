
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
 *         &lt;element name="status-update-statistics"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="views-by-month"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="view-by-month" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="date"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                                                 &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="clicks" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="likes" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="shares" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="engagement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="follow-statistics"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="employee-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="non-employee-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="seniorities"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="seniority" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="entry-key" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="entry-value" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
    "statusUpdateStatistics",
    "followStatistics"
})
@XmlRootElement(name = "company-statistics")
public class CompanyStatistics {

    @XmlElement(name = "status-update-statistics", required = true)
    protected StatusUpdateStatistics statusUpdateStatistics;
    @XmlElement(name = "follow-statistics", required = true)
    protected FollowStatistics followStatistics;

    /**
     * Gets the value of the statusUpdateStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link StatusUpdateStatistics }
     *     
     */
    public StatusUpdateStatistics getStatusUpdateStatistics() {
        return statusUpdateStatistics;
    }

    /**
     * Sets the value of the statusUpdateStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusUpdateStatistics }
     *     
     */
    public void setStatusUpdateStatistics(StatusUpdateStatistics value) {
        this.statusUpdateStatistics = value;
    }

    /**
     * Gets the value of the followStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link FollowStatistics }
     *     
     */
    public FollowStatistics getFollowStatistics() {
        return followStatistics;
    }

    /**
     * Sets the value of the followStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowStatistics }
     *     
     */
    public void setFollowStatistics(FollowStatistics value) {
        this.followStatistics = value;
    }

}
