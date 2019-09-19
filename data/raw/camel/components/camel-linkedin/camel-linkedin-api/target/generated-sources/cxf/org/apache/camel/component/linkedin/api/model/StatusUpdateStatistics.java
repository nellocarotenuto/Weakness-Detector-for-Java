
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="views-by-month"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="view-by-month" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="date"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                                       &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="clicks" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="likes" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="shares" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="engagement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
    "viewsByMonth"
})
public class StatusUpdateStatistics {

    @XmlElement(name = "views-by-month", required = true)
    protected ViewsByMonth viewsByMonth;

    /**
     * Gets the value of the viewsByMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ViewsByMonth }
     *     
     */
    public ViewsByMonth getViewsByMonth() {
        return viewsByMonth;
    }

    /**
     * Sets the value of the viewsByMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewsByMonth }
     *     
     */
    public void setViewsByMonth(ViewsByMonth value) {
        this.viewsByMonth = value;
    }

}
