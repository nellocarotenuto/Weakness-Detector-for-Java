
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
 *         &lt;element ref="{}recipients"/&gt;
 *         &lt;element ref="{}subject"/&gt;
 *         &lt;element ref="{}body"/&gt;
 *         &lt;element ref="{}item-content" minOccurs="0"/&gt;
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
    "recipients",
    "subject",
    "body",
    "itemContent"
})
@XmlRootElement(name = "mailbox-item")
public class MailboxItem {

    @XmlElement(required = true)
    protected Recipients recipients;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String body;
    @XmlElement(name = "item-content")
    protected ItemContent itemContent;

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link Recipients }
     *     
     */
    public Recipients getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipients }
     *     
     */
    public void setRecipients(Recipients value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the itemContent property.
     * 
     * @return
     *     possible object is
     *     {@link ItemContent }
     *     
     */
    public ItemContent getItemContent() {
        return itemContent;
    }

    /**
     * Sets the value of the itemContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemContent }
     *     
     */
    public void setItemContent(ItemContent value) {
        this.itemContent = value;
    }

}
