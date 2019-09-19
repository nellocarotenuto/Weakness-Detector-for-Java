
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}partner-job-id"/&gt;
 *         &lt;element ref="{}contract-id"/&gt;
 *         &lt;element ref="{}customer-job-code" minOccurs="0"/&gt;
 *         &lt;element ref="{}active" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}posting-date"/&gt;
 *           &lt;element ref="{}expiration-date"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}company"/&gt;
 *           &lt;element ref="{}description"/&gt;
 *           &lt;element ref="{}description-snippet"/&gt;
 *           &lt;element ref="{}position"/&gt;
 *           &lt;element ref="{}skills-and-experience"/&gt;
 *           &lt;element ref="{}expiration-timestamp"/&gt;
 *           &lt;element ref="{}job-poster"/&gt;
 *           &lt;element ref="{}location-description"/&gt;
 *           &lt;element ref="{}posting-timestamp"/&gt;
 *           &lt;element ref="{}salary"/&gt;
 *           &lt;element ref="{}site-job-request"/&gt;
 *           &lt;element ref="{}site-job-url"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}referral-bonus"/&gt;
 *           &lt;element ref="{}poster"/&gt;
 *           &lt;element ref="{}how-to-apply"/&gt;
 *           &lt;element ref="{}tracking-pixel-url"/&gt;
 *           &lt;element ref="{}renewal"/&gt;
 *         &lt;/sequence&gt;
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
    "id",
    "partnerJobId",
    "contractId",
    "customerJobCode",
    "active",
    "postingDate",
    "expirationDate",
    "company",
    "description",
    "descriptionSnippet",
    "position",
    "skillsAndExperience",
    "expirationTimestamp",
    "jobPoster",
    "locationDescription",
    "postingTimestamp",
    "salary",
    "siteJobRequest",
    "siteJobUrl",
    "referralBonus",
    "poster",
    "howToApply",
    "trackingPixelUrl",
    "renewal"
})
@XmlRootElement(name = "job")
public class Job {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(name = "partner-job-id", required = true)
    protected String partnerJobId;
    @XmlElement(name = "contract-id", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long contractId;
    @XmlElement(name = "customer-job-code")
    protected String customerJobCode;
    protected Boolean active;
    @XmlElement(name = "posting-date")
    protected PostingDate postingDate;
    @XmlElement(name = "expiration-date")
    protected ExpirationDate expirationDate;
    @XmlElement(required = true)
    protected Company company;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "description-snippet", required = true)
    protected String descriptionSnippet;
    @XmlElement(required = true)
    protected Position position;
    @XmlElement(name = "skills-and-experience", required = true)
    protected String skillsAndExperience;
    @XmlElement(name = "expiration-timestamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long expirationTimestamp;
    @XmlElement(name = "job-poster", required = true)
    protected JobPoster jobPoster;
    @XmlElement(name = "location-description", required = true)
    protected String locationDescription;
    @XmlElement(name = "posting-timestamp", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long postingTimestamp;
    @XmlElement(required = true)
    protected String salary;
    @XmlElement(name = "site-job-request", required = true)
    protected SiteJobRequest siteJobRequest;
    @XmlElement(name = "site-job-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String siteJobUrl;
    @XmlElement(name = "referral-bonus")
    protected String referralBonus;
    protected Poster poster;
    @XmlElement(name = "how-to-apply")
    protected HowToApply howToApply;
    @XmlElement(name = "tracking-pixel-url")
    @XmlSchemaType(name = "anyURI")
    protected String trackingPixelUrl;
    protected Renewal renewal;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the partnerJobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerJobId() {
        return partnerJobId;
    }

    /**
     * Sets the value of the partnerJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerJobId(String value) {
        this.partnerJobId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the customerJobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerJobCode() {
        return customerJobCode;
    }

    /**
     * Sets the value of the customerJobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerJobCode(String value) {
        this.customerJobCode = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the postingDate property.
     * 
     * @return
     *     possible object is
     *     {@link PostingDate }
     *     
     */
    public PostingDate getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingDate }
     *     
     */
    public void setPostingDate(PostingDate value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationDate }
     *     
     */
    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationDate }
     *     
     */
    public void setExpirationDate(ExpirationDate value) {
        this.expirationDate = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionSnippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionSnippet() {
        return descriptionSnippet;
    }

    /**
     * Sets the value of the descriptionSnippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionSnippet(String value) {
        this.descriptionSnippet = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the skillsAndExperience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillsAndExperience() {
        return skillsAndExperience;
    }

    /**
     * Sets the value of the skillsAndExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillsAndExperience(String value) {
        this.skillsAndExperience = value;
    }

    /**
     * Gets the value of the expirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getExpirationTimestamp() {
        return expirationTimestamp;
    }

    /**
     * Sets the value of the expirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTimestamp(Long value) {
        this.expirationTimestamp = value;
    }

    /**
     * Gets the value of the jobPoster property.
     * 
     * @return
     *     possible object is
     *     {@link JobPoster }
     *     
     */
    public JobPoster getJobPoster() {
        return jobPoster;
    }

    /**
     * Sets the value of the jobPoster property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobPoster }
     *     
     */
    public void setJobPoster(JobPoster value) {
        this.jobPoster = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the postingTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPostingTimestamp() {
        return postingTimestamp;
    }

    /**
     * Sets the value of the postingTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingTimestamp(Long value) {
        this.postingTimestamp = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalary(String value) {
        this.salary = value;
    }

    /**
     * Gets the value of the siteJobRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SiteJobRequest }
     *     
     */
    public SiteJobRequest getSiteJobRequest() {
        return siteJobRequest;
    }

    /**
     * Sets the value of the siteJobRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteJobRequest }
     *     
     */
    public void setSiteJobRequest(SiteJobRequest value) {
        this.siteJobRequest = value;
    }

    /**
     * Gets the value of the siteJobUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteJobUrl() {
        return siteJobUrl;
    }

    /**
     * Sets the value of the siteJobUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteJobUrl(String value) {
        this.siteJobUrl = value;
    }

    /**
     * Gets the value of the referralBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralBonus() {
        return referralBonus;
    }

    /**
     * Sets the value of the referralBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralBonus(String value) {
        this.referralBonus = value;
    }

    /**
     * Gets the value of the poster property.
     * 
     * @return
     *     possible object is
     *     {@link Poster }
     *     
     */
    public Poster getPoster() {
        return poster;
    }

    /**
     * Sets the value of the poster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Poster }
     *     
     */
    public void setPoster(Poster value) {
        this.poster = value;
    }

    /**
     * Gets the value of the howToApply property.
     * 
     * @return
     *     possible object is
     *     {@link HowToApply }
     *     
     */
    public HowToApply getHowToApply() {
        return howToApply;
    }

    /**
     * Sets the value of the howToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link HowToApply }
     *     
     */
    public void setHowToApply(HowToApply value) {
        this.howToApply = value;
    }

    /**
     * Gets the value of the trackingPixelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingPixelUrl() {
        return trackingPixelUrl;
    }

    /**
     * Sets the value of the trackingPixelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingPixelUrl(String value) {
        this.trackingPixelUrl = value;
    }

    /**
     * Gets the value of the renewal property.
     * 
     * @return
     *     possible object is
     *     {@link Renewal }
     *     
     */
    public Renewal getRenewal() {
        return renewal;
    }

    /**
     * Sets the value of the renewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Renewal }
     *     
     */
    public void setRenewal(Renewal value) {
        this.renewal = value;
    }

}
