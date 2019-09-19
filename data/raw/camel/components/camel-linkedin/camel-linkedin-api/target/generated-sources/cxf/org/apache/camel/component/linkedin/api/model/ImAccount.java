
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
 *         &lt;element ref="{}im-account-type"/&gt;
 *         &lt;element ref="{}im-account-name"/&gt;
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
    "imAccountType",
    "imAccountName"
})
@XmlRootElement(name = "im-account")
public class ImAccount {

    @XmlElement(name = "im-account-type", required = true)
    protected ImAccountType imAccountType;
    @XmlElement(name = "im-account-name", required = true)
    protected String imAccountName;

    /**
     * Gets the value of the imAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link ImAccountType }
     *     
     */
    public ImAccountType getImAccountType() {
        return imAccountType;
    }

    /**
     * Sets the value of the imAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImAccountType }
     *     
     */
    public void setImAccountType(ImAccountType value) {
        this.imAccountType = value;
    }

    /**
     * Gets the value of the imAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImAccountName() {
        return imAccountName;
    }

    /**
     * Sets the value of the imAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImAccountName(String value) {
        this.imAccountName = value;
    }

}
