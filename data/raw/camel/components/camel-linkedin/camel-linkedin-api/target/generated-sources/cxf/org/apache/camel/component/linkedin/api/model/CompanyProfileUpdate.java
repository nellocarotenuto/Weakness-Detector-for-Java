
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
 *         &lt;element ref="{}editor"/&gt;
 *         &lt;element ref="{}action"/&gt;
 *         &lt;element ref="{}profile-field"/&gt;
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
    "editor",
    "action",
    "profileField"
})
@XmlRootElement(name = "company-profile-update")
public class CompanyProfileUpdate {

    @XmlElement(required = true)
    protected Editor editor;
    @XmlElement(required = true)
    protected Action action;
    @XmlElement(name = "profile-field", required = true)
    protected ProfileField profileField;

    /**
     * Gets the value of the editor property.
     * 
     * @return
     *     possible object is
     *     {@link Editor }
     *     
     */
    public Editor getEditor() {
        return editor;
    }

    /**
     * Sets the value of the editor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Editor }
     *     
     */
    public void setEditor(Editor value) {
        this.editor = value;
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
     * Gets the value of the profileField property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileField }
     *     
     */
    public ProfileField getProfileField() {
        return profileField;
    }

    /**
     * Sets the value of the profileField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileField }
     *     
     */
    public void setProfileField(ProfileField value) {
        this.profileField = value;
    }

}
