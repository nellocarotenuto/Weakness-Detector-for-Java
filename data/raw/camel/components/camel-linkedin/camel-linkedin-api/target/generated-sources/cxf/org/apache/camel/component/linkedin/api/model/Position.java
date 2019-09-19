
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}id" minOccurs="0"/&gt;
 *         &lt;element ref="{}title" minOccurs="0"/&gt;
 *         &lt;element ref="{}summary" minOccurs="0"/&gt;
 *         &lt;element ref="{}start-date" minOccurs="0"/&gt;
 *         &lt;element ref="{}end-date" minOccurs="0"/&gt;
 *         &lt;element ref="{}is-current"/&gt;
 *         &lt;element ref="{}company"/&gt;
 *         &lt;element ref="{}description"/&gt;
 *         &lt;element ref="{}description-snippet"/&gt;
 *         &lt;element ref="{}skills-and-experience"/&gt;
 *         &lt;element ref="{}location" minOccurs="0"/&gt;
 *         &lt;element ref="{}job-functions"/&gt;
 *         &lt;element ref="{}industries"/&gt;
 *         &lt;element ref="{}job-type"/&gt;
 *         &lt;element ref="{}experience-level"/&gt;
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
    "title",
    "summary",
    "startDate",
    "endDate",
    "isCurrent",
    "company",
    "description",
    "descriptionSnippet",
    "skillsAndExperience",
    "location",
    "jobFunctions",
    "industries",
    "jobType",
    "experienceLevel"
})
@XmlRootElement(name = "position")
public class Position {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    protected String title;
    protected String summary;
    @XmlElement(name = "start-date")
    protected StartDate startDate;
    @XmlElement(name = "end-date")
    protected EndDate endDate;
    @XmlElement(name = "is-current")
    protected boolean isCurrent;
    @XmlElement(required = true)
    protected Company company;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "description-snippet", required = true)
    protected String descriptionSnippet;
    @XmlElement(name = "skills-and-experience", required = true)
    protected String skillsAndExperience;
    protected Location location;
    @XmlElement(name = "job-functions", required = true)
    protected JobFunctions jobFunctions;
    @XmlElement(required = true)
    protected Industries industries;
    @XmlElement(name = "job-type", required = true)
    protected JobType jobType;
    @XmlElement(name = "experience-level", required = true)
    protected ExperienceLevel experienceLevel;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    public StartDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    public void setStartDate(StartDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link EndDate }
     *     
     */
    public EndDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDate }
     *     
     */
    public void setEndDate(EndDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the isCurrent property.
     * 
     */
    public boolean isIsCurrent() {
        return isCurrent;
    }

    /**
     * Sets the value of the isCurrent property.
     * 
     */
    public void setIsCurrent(boolean value) {
        this.isCurrent = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the jobFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link JobFunctions }
     *     
     */
    public JobFunctions getJobFunctions() {
        return jobFunctions;
    }

    /**
     * Sets the value of the jobFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFunctions }
     *     
     */
    public void setJobFunctions(JobFunctions value) {
        this.jobFunctions = value;
    }

    /**
     * Gets the value of the industries property.
     * 
     * @return
     *     possible object is
     *     {@link Industries }
     *     
     */
    public Industries getIndustries() {
        return industries;
    }

    /**
     * Sets the value of the industries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Industries }
     *     
     */
    public void setIndustries(Industries value) {
        this.industries = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
    public JobType getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobType }
     *     
     */
    public void setJobType(JobType value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the experienceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ExperienceLevel }
     *     
     */
    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    /**
     * Sets the value of the experienceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperienceLevel }
     *     
     */
    public void setExperienceLevel(ExperienceLevel value) {
        this.experienceLevel = value;
    }

}
