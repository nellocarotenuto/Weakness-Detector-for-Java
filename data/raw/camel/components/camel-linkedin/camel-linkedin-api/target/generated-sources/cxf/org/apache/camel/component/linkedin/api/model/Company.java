
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}id" minOccurs="0"/&gt;
 *         &lt;element ref="{}universal-name" minOccurs="0"/&gt;
 *         &lt;element ref="{}description"/&gt;
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{}logo-url"/&gt;
 *         &lt;element ref="{}name"/&gt;
 *         &lt;element ref="{}type"/&gt;
 *         &lt;element ref="{}company-type"/&gt;
 *         &lt;element ref="{}size"/&gt;
 *         &lt;element ref="{}stock-exchange"/&gt;
 *         &lt;element ref="{}ticker"/&gt;
 *         &lt;element ref="{}specialties"/&gt;
 *         &lt;element ref="{}blog-rss-url"/&gt;
 *         &lt;element ref="{}twitter-id"/&gt;
 *         &lt;element ref="{}square-logo-url"/&gt;
 *         &lt;element ref="{}locations"/&gt;
 *         &lt;element ref="{}founded-year"/&gt;
 *         &lt;element ref="{}end-year"/&gt;
 *         &lt;element ref="{}num-followers"/&gt;
 *         &lt;element ref="{}email-domains"/&gt;
 *         &lt;element ref="{}website-url"/&gt;
 *         &lt;element name="status" type="{}company-status"/&gt;
 *         &lt;element ref="{}employee-count-range"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
    "universalName",
    "description",
    "industry",
    "logoUrl",
    "name",
    "type",
    "companyType",
    "size",
    "stockExchange",
    "ticker",
    "specialties",
    "blogRssUrl",
    "twitterId",
    "squareLogoUrl",
    "locations",
    "foundedYear",
    "endYear",
    "numFollowers",
    "emailDomains",
    "websiteUrl",
    "status",
    "employeeCountRange"
})
@XmlRootElement(name = "company")
public class Company {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(name = "universal-name")
    protected String universalName;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String industry;
    @XmlElement(name = "logo-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String logoUrl;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "company-type", required = true)
    protected CompanyType companyType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String size;
    @XmlElement(name = "stock-exchange", required = true)
    protected StockExchange stockExchange;
    @XmlElement(required = true)
    protected String ticker;
    @XmlElement(required = true)
    protected Specialties specialties;
    @XmlElement(name = "blog-rss-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String blogRssUrl;
    @XmlElement(name = "twitter-id", required = true)
    protected String twitterId;
    @XmlElement(name = "square-logo-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String squareLogoUrl;
    @XmlElement(required = true)
    protected Locations locations;
    @XmlElement(name = "founded-year", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long foundedYear;
    @XmlElement(name = "end-year", required = true, type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long endYear;
    @XmlElement(name = "num-followers", required = true)
    protected NumFollowers numFollowers;
    @XmlElement(name = "email-domains", required = true)
    protected EmailDomains emailDomains;
    @XmlElement(name = "website-url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String websiteUrl;
    @XmlElement(required = true)
    protected CompanyStatus status;
    @XmlElement(name = "employee-count-range", required = true)
    protected EmployeeCountRange employeeCountRange;
    @XmlAttribute(name = "key")
    @XmlSchemaType(name = "anySimpleType")
    protected String key;

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
     * Gets the value of the universalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalName() {
        return universalName;
    }

    /**
     * Sets the value of the universalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalName(String value) {
        this.universalName = value;
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
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompanyType(CompanyType value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the stockExchange property.
     * 
     * @return
     *     possible object is
     *     {@link StockExchange }
     *     
     */
    public StockExchange getStockExchange() {
        return stockExchange;
    }

    /**
     * Sets the value of the stockExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockExchange }
     *     
     */
    public void setStockExchange(StockExchange value) {
        this.stockExchange = value;
    }

    /**
     * Gets the value of the ticker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicker() {
        return ticker;
    }

    /**
     * Sets the value of the ticker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicker(String value) {
        this.ticker = value;
    }

    /**
     * Gets the value of the specialties property.
     * 
     * @return
     *     possible object is
     *     {@link Specialties }
     *     
     */
    public Specialties getSpecialties() {
        return specialties;
    }

    /**
     * Sets the value of the specialties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Specialties }
     *     
     */
    public void setSpecialties(Specialties value) {
        this.specialties = value;
    }

    /**
     * Gets the value of the blogRssUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlogRssUrl() {
        return blogRssUrl;
    }

    /**
     * Sets the value of the blogRssUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlogRssUrl(String value) {
        this.blogRssUrl = value;
    }

    /**
     * Gets the value of the twitterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterId() {
        return twitterId;
    }

    /**
     * Sets the value of the twitterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterId(String value) {
        this.twitterId = value;
    }

    /**
     * Gets the value of the squareLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareLogoUrl() {
        return squareLogoUrl;
    }

    /**
     * Sets the value of the squareLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareLogoUrl(String value) {
        this.squareLogoUrl = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link Locations }
     *     
     */
    public Locations getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locations }
     *     
     */
    public void setLocations(Locations value) {
        this.locations = value;
    }

    /**
     * Gets the value of the foundedYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFoundedYear() {
        return foundedYear;
    }

    /**
     * Sets the value of the foundedYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundedYear(Long value) {
        this.foundedYear = value;
    }

    /**
     * Gets the value of the endYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEndYear() {
        return endYear;
    }

    /**
     * Sets the value of the endYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndYear(Long value) {
        this.endYear = value;
    }

    /**
     * Gets the value of the numFollowers property.
     * 
     * @return
     *     possible object is
     *     {@link NumFollowers }
     *     
     */
    public NumFollowers getNumFollowers() {
        return numFollowers;
    }

    /**
     * Sets the value of the numFollowers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumFollowers }
     *     
     */
    public void setNumFollowers(NumFollowers value) {
        this.numFollowers = value;
    }

    /**
     * Gets the value of the emailDomains property.
     * 
     * @return
     *     possible object is
     *     {@link EmailDomains }
     *     
     */
    public EmailDomains getEmailDomains() {
        return emailDomains;
    }

    /**
     * Sets the value of the emailDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailDomains }
     *     
     */
    public void setEmailDomains(EmailDomains value) {
        this.emailDomains = value;
    }

    /**
     * Gets the value of the websiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    /**
     * Sets the value of the websiteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteUrl(String value) {
        this.websiteUrl = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyStatus }
     *     
     */
    public CompanyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyStatus }
     *     
     */
    public void setStatus(CompanyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the employeeCountRange property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCountRange }
     *     
     */
    public EmployeeCountRange getEmployeeCountRange() {
        return employeeCountRange;
    }

    /**
     * Sets the value of the employeeCountRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCountRange }
     *     
     */
    public void setEmployeeCountRange(EmployeeCountRange value) {
        this.employeeCountRange = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
