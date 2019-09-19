
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
 *         &lt;element ref="{}person" minOccurs="0"/&gt;
 *         &lt;element ref="{}update-action" minOccurs="0"/&gt;
 *         &lt;element ref="{}job" minOccurs="0"/&gt;
 *         &lt;element ref="{}question" minOccurs="0"/&gt;
 *         &lt;element ref="{}company" minOccurs="0"/&gt;
 *         &lt;element ref="{}company-job-update" minOccurs="0"/&gt;
 *         &lt;element ref="{}company-status-update" minOccurs="0"/&gt;
 *         &lt;element ref="{}company-person-update" minOccurs="0"/&gt;
 *         &lt;element ref="{}company-profile-update" minOccurs="0"/&gt;
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
    "person",
    "updateAction",
    "job",
    "question",
    "company",
    "companyJobUpdate",
    "companyStatusUpdate",
    "companyPersonUpdate",
    "companyProfileUpdate"
})
@XmlRootElement(name = "update-content")
public class UpdateContent {

    protected Person person;
    @XmlElement(name = "update-action")
    protected UpdateAction updateAction;
    protected Job job;
    protected Question question;
    protected Company company;
    @XmlElement(name = "company-job-update")
    protected CompanyJobUpdate companyJobUpdate;
    @XmlElement(name = "company-status-update")
    protected CompanyStatusUpdate companyStatusUpdate;
    @XmlElement(name = "company-person-update")
    protected CompanyPersonUpdate companyPersonUpdate;
    @XmlElement(name = "company-profile-update")
    protected CompanyProfileUpdate companyProfileUpdate;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAction }
     *     
     */
    public UpdateAction getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAction }
     *     
     */
    public void setUpdateAction(UpdateAction value) {
        this.updateAction = value;
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

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link Question }
     *     
     */
    public Question getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link Question }
     *     
     */
    public void setQuestion(Question value) {
        this.question = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

    /**
     * Gets the value of the companyJobUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyJobUpdate }
     *     
     */
    public CompanyJobUpdate getCompanyJobUpdate() {
        return companyJobUpdate;
    }

    /**
     * Sets the value of the companyJobUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyJobUpdate }
     *     
     */
    public void setCompanyJobUpdate(CompanyJobUpdate value) {
        this.companyJobUpdate = value;
    }

    /**
     * Gets the value of the companyStatusUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyStatusUpdate }
     *     
     */
    public CompanyStatusUpdate getCompanyStatusUpdate() {
        return companyStatusUpdate;
    }

    /**
     * Sets the value of the companyStatusUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyStatusUpdate }
     *     
     */
    public void setCompanyStatusUpdate(CompanyStatusUpdate value) {
        this.companyStatusUpdate = value;
    }

    /**
     * Gets the value of the companyPersonUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyPersonUpdate }
     *     
     */
    public CompanyPersonUpdate getCompanyPersonUpdate() {
        return companyPersonUpdate;
    }

    /**
     * Sets the value of the companyPersonUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyPersonUpdate }
     *     
     */
    public void setCompanyPersonUpdate(CompanyPersonUpdate value) {
        this.companyPersonUpdate = value;
    }

    /**
     * Gets the value of the companyProfileUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyProfileUpdate }
     *     
     */
    public CompanyProfileUpdate getCompanyProfileUpdate() {
        return companyProfileUpdate;
    }

    /**
     * Sets the value of the companyProfileUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyProfileUpdate }
     *     
     */
    public void setCompanyProfileUpdate(CompanyProfileUpdate value) {
        this.companyProfileUpdate = value;
    }

}
