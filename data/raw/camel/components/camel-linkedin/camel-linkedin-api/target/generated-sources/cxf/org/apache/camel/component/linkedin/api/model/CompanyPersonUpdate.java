
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
 *         &lt;element ref="{}person"/&gt;
 *         &lt;element ref="{}action"/&gt;
 *         &lt;element ref="{}old-position"/&gt;
 *         &lt;element ref="{}new-position"/&gt;
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
    "person",
    "action",
    "oldPosition",
    "newPosition"
})
@XmlRootElement(name = "company-person-update")
public class CompanyPersonUpdate {

    @XmlElement(required = true)
    protected Person person;
    @XmlElement(required = true)
    protected Action action;
    @XmlElement(name = "old-position", required = true)
    protected OldPosition oldPosition;
    @XmlElement(name = "new-position", required = true)
    protected NewPosition newPosition;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

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
     * Gets the value of the oldPosition property.
     * 
     * @return
     *     possible object is
     *     {@link OldPosition }
     *     
     */
    public OldPosition getOldPosition() {
        return oldPosition;
    }

    /**
     * Sets the value of the oldPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldPosition }
     *     
     */
    public void setOldPosition(OldPosition value) {
        this.oldPosition = value;
    }

    /**
     * Gets the value of the newPosition property.
     * 
     * @return
     *     possible object is
     *     {@link NewPosition }
     *     
     */
    public NewPosition getNewPosition() {
        return newPosition;
    }

    /**
     * Sets the value of the newPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPosition }
     *     
     */
    public void setNewPosition(NewPosition value) {
        this.newPosition = value;
    }

}
