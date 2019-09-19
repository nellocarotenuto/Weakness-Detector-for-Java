
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
 *         &lt;element ref="{}connect-type"/&gt;
 *         &lt;element ref="{}authorization"/&gt;
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
    "connectType",
    "authorization"
})
@XmlRootElement(name = "invitation-request")
public class InvitationRequest {

    @XmlElement(name = "connect-type", required = true)
    protected InviteConnectType connectType;
    @XmlElement(required = true)
    protected Authorization authorization;

    /**
     * Gets the value of the connectType property.
     * 
     * @return
     *     possible object is
     *     {@link InviteConnectType }
     *     
     */
    public InviteConnectType getConnectType() {
        return connectType;
    }

    /**
     * Sets the value of the connectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InviteConnectType }
     *     
     */
    public void setConnectType(InviteConnectType value) {
        this.connectType = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link Authorization }
     *     
     */
    public Authorization getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorization }
     *     
     */
    public void setAuthorization(Authorization value) {
        this.authorization = value;
    }

}
