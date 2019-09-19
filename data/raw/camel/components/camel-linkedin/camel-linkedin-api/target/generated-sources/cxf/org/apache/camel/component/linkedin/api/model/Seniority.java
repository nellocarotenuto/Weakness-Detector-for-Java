
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="entry-key" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="entry-value" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "entryKey",
    "entryValue"
})
public class Seniority {

    @XmlElement(name = "entry-key", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long entryKey;
    @XmlElement(name = "entry-value", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long entryValue;

    /**
     * Gets the value of the entryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEntryKey() {
        return entryKey;
    }

    /**
     * Sets the value of the entryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryKey(Long value) {
        this.entryKey = value;
    }

    /**
     * Gets the value of the entryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEntryValue() {
        return entryValue;
    }

    /**
     * Sets the value of the entryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryValue(Long value) {
        this.entryValue = value;
    }

}
