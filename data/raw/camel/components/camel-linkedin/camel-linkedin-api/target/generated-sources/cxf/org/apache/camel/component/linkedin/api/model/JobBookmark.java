
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
 *         &lt;element ref="{}is-applied"/&gt;
 *         &lt;element ref="{}is-saved"/&gt;
 *         &lt;element ref="{}saved-timestamp"/&gt;
 *         &lt;element ref="{}applied-timestamp" minOccurs="0"/&gt;
 *         &lt;element ref="{}job"/&gt;
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
    "isApplied",
    "isSaved",
    "savedTimestamp",
    "appliedTimestamp",
    "job"
})
@XmlRootElement(name = "job-bookmark")
public class JobBookmark {

    @XmlElement(name = "is-applied")
    protected boolean isApplied;
    @XmlElement(name = "is-saved")
    protected boolean isSaved;
    @XmlElement(name = "saved-timestamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long savedTimestamp;
    @XmlElement(name = "applied-timestamp", type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long appliedTimestamp;
    @XmlElement(required = true)
    protected Job job;

    /**
     * Gets the value of the isApplied property.
     * 
     */
    public boolean isIsApplied() {
        return isApplied;
    }

    /**
     * Sets the value of the isApplied property.
     * 
     */
    public void setIsApplied(boolean value) {
        this.isApplied = value;
    }

    /**
     * Gets the value of the isSaved property.
     * 
     */
    public boolean isIsSaved() {
        return isSaved;
    }

    /**
     * Sets the value of the isSaved property.
     * 
     */
    public void setIsSaved(boolean value) {
        this.isSaved = value;
    }

    /**
     * Gets the value of the savedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSavedTimestamp() {
        return savedTimestamp;
    }

    /**
     * Sets the value of the savedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedTimestamp(Long value) {
        this.savedTimestamp = value;
    }

    /**
     * Gets the value of the appliedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAppliedTimestamp() {
        return appliedTimestamp;
    }

    /**
     * Sets the value of the appliedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedTimestamp(Long value) {
        this.appliedTimestamp = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link Job }
     *     
     */
    public Job getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link Job }
     *     
     */
    public void setJob(Job value) {
        this.job = value;
    }

}
