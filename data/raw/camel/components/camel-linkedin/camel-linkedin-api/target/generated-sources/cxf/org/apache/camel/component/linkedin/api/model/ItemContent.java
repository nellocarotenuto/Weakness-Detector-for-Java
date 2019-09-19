
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
 *         &lt;element ref="{}invitation-request"/&gt;
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
    "invitationRequest"
})
@XmlRootElement(name = "item-content")
public class ItemContent {

    @XmlElement(name = "invitation-request", required = true)
    protected InvitationRequest invitationRequest;

    /**
     * Gets the value of the invitationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InvitationRequest }
     *     
     */
    public InvitationRequest getInvitationRequest() {
        return invitationRequest;
    }

    /**
     * Sets the value of the invitationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvitationRequest }
     *     
     */
    public void setInvitationRequest(InvitationRequest value) {
        this.invitationRequest = value;
    }

}
