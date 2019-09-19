
package org.apache.camel.component.linkedin.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="statistic" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="like-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="impression-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="click-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="comment-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="share-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="engagement" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="unique-count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statisticList"
})
@XmlRootElement(name = "historical-status-update-statistics")
public class HistoricalStatusUpdateStatistics {

    @XmlElement(name = "statistic")
    protected List<HistoricalStatusUpdateStatistic> statisticList;
    @XmlAttribute(name = "total", required = true)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long total;

    /**
     * Gets the value of the statisticList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricalStatusUpdateStatistic }
     * 
     * 
     */
    public List<HistoricalStatusUpdateStatistic> getStatisticList() {
        if (statisticList == null) {
            statisticList = new ArrayList<HistoricalStatusUpdateStatistic>();
        }
        return this.statisticList;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(Long value) {
        this.total = value;
    }

}
