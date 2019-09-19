
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
 *         &lt;element ref="{}action"/&gt;
 *         &lt;element ref="{}original-update"/&gt;
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
    "action",
    "originalUpdate"
})
@XmlRootElement(name = "update-action")
public class UpdateAction {

    @XmlElement(required = true)
    protected Action action;
    @XmlElement(name = "original-update", required = true)
    protected OriginalUpdate originalUpdate;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAction(Action value) {
        this.action = value;
    }

    /**
     * Gets the value of the originalUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalUpdate }
     *     
     */
    public OriginalUpdate getOriginalUpdate() {
        return originalUpdate;
    }

    /**
     * Sets the value of the originalUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalUpdate }
     *     
     */
    public void setOriginalUpdate(OriginalUpdate value) {
        this.originalUpdate = value;
    }

}
