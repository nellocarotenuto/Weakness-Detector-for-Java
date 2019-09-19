
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="alumni"/&gt;
 *               &lt;enumeration value="corporate"/&gt;
 *               &lt;enumeration value="conference"/&gt;
 *               &lt;enumeration value="network"/&gt;
 *               &lt;enumeration value="philanthropic"/&gt;
 *               &lt;enumeration value="professional"/&gt;
 *               &lt;enumeration value="other"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupCategory", propOrder = {
    "code"
})
public class GroupCategory {

    @XmlElement(required = true)
    protected GroupCategoryCode code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCategoryCode }
     *     
     */
    public GroupCategoryCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCategoryCode }
     *     
     */
    public void setCode(GroupCategoryCode value) {
        this.code = value;
    }

}
