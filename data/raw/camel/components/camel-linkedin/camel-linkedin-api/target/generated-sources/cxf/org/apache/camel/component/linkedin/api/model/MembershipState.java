
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
 *         &lt;element name="code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="blocked"/&gt;
 *               &lt;enumeration value="non-member"/&gt;
 *               &lt;enumeration value="awaiting-confirmation"/&gt;
 *               &lt;enumeration value="awaiting-parent-group-confirmation"/&gt;
 *               &lt;enumeration value="member"/&gt;
 *               &lt;enumeration value="moderator"/&gt;
 *               &lt;enumeration value="manager"/&gt;
 *               &lt;enumeration value="owner"/&gt;
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
@XmlType(name = "", propOrder = {
    "code"
})
@XmlRootElement(name = "membership-state")
public class MembershipState {

    @XmlElement(required = true)
    protected MembershipStateCode code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link MembershipStateCode }
     *     
     */
    public MembershipStateCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipStateCode }
     *     
     */
    public void setCode(MembershipStateCode value) {
        this.code = value;
    }

}
