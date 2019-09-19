
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}provider-account-id"/&gt;
 *         &lt;element ref="{}provider-account-name"/&gt;
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
    "providerAccountId",
    "providerAccountName"
})
@XmlRootElement(name = "twitter-account")
public class TwitterAccount {

    @XmlElement(name = "provider-account-id", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long providerAccountId;
    @XmlElement(name = "provider-account-name", required = true)
    protected String providerAccountName;

    /**
     * Gets the value of the providerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getProviderAccountId() {
        return providerAccountId;
    }

    /**
     * Sets the value of the providerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAccountId(Long value) {
        this.providerAccountId = value;
    }

    /**
     * Gets the value of the providerAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAccountName() {
        return providerAccountName;
    }

    /**
     * Sets the value of the providerAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAccountName(String value) {
        this.providerAccountName = value;
    }

}
