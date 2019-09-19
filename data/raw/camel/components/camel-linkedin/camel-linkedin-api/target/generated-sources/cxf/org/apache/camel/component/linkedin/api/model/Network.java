
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
 *         &lt;element ref="{}network-stats"/&gt;
 *         &lt;element ref="{}updates"/&gt;
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
    "networkStats",
    "updates"
})
@XmlRootElement(name = "network")
public class Network {

    @XmlElement(name = "network-stats", required = true)
    protected NetworkStats networkStats;
    @XmlElement(required = true)
    protected Updates updates;

    /**
     * Gets the value of the networkStats property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkStats }
     *     
     */
    public NetworkStats getNetworkStats() {
        return networkStats;
    }

    /**
     * Sets the value of the networkStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkStats }
     *     
     */
    public void setNetworkStats(NetworkStats value) {
        this.networkStats = value;
    }

    /**
     * Gets the value of the updates property.
     * 
     * @return
     *     possible object is
     *     {@link Updates }
     *     
     */
    public Updates getUpdates() {
        return updates;
    }

    /**
     * Sets the value of the updates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Updates }
     *     
     */
    public void setUpdates(Updates value) {
        this.updates = value;
    }

}
