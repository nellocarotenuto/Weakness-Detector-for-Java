
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
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}first-name"/&gt;
 *           &lt;element ref="{}last-name"/&gt;
 *           &lt;element ref="{}headline"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}location"/&gt;
 *           &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}connections"/&gt;
 *           &lt;element ref="{}current-status"/&gt;
 *           &lt;element ref="{}current-share"/&gt;
 *           &lt;element ref="{}distance"/&gt;
 *           &lt;element ref="{}current-status-timestamp"/&gt;
 *           &lt;element ref="{}num-recommenders"/&gt;
 *           &lt;element ref="{}num-connections"/&gt;
 *           &lt;element ref="{}num-connections-capped"/&gt;
 *           &lt;element ref="{}relation-to-viewer"/&gt;
 *           &lt;element ref="{}summary"/&gt;
 *           &lt;element ref="{}public-profile-url"/&gt;
 *           &lt;element ref="{}interests"/&gt;
 *           &lt;element ref="{}associations"/&gt;
 *           &lt;element ref="{}honors"/&gt;
 *           &lt;element name="specialties" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element ref="{}certifications"/&gt;
 *           &lt;element ref="{}patents"/&gt;
 *           &lt;element ref="{}publications"/&gt;
 *           &lt;element ref="{}skills"/&gt;
 *           &lt;element ref="{}languages"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}positions" minOccurs="0"/&gt;
 *         &lt;element ref="{}three-current-positions" minOccurs="0"/&gt;
 *         &lt;element ref="{}three-past-positions" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}educations"/&gt;
 *           &lt;element ref="{}member-url-resources"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}api-standard-profile-request"/&gt;
 *           &lt;element ref="{}site-standard-profile-request"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}picture-url" minOccurs="0"/&gt;
 *         &lt;element ref="{}recommendations-given" minOccurs="0"/&gt;
 *         &lt;element ref="{}recommendations-received" minOccurs="0"/&gt;
 *         &lt;element ref="{}member-groups" minOccurs="0"/&gt;
 *         &lt;element ref="{}person-activities" minOccurs="0"/&gt;
 *         &lt;element ref="{}im-accounts" minOccurs="0"/&gt;
 *         &lt;element ref="{}twitter-accounts" minOccurs="0"/&gt;
 *         &lt;element ref="{}date-of-birth" minOccurs="0"/&gt;
 *         &lt;element ref="{}main-address" minOccurs="0"/&gt;
 *         &lt;element ref="{}phone-numbers" minOccurs="0"/&gt;
 *         &lt;element ref="{}following" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
    "firstName",
    "lastName",
    "headline",
    "location",
    "industry",
    "connections",
    "currentStatus",
    "currentShare",
    "distance",
    "currentStatusTimestamp",
    "numRecommenders",
    "numConnections",
    "numConnectionsCapped",
    "relationToViewer",
    "summary",
    "publicProfileUrl",
    "interests",
    "associations",
    "honors",
    "specialties",
    "certifications",
    "patents",
    "publications",
    "skills",
    "languages",
    "positions",
    "threeCurrentPositions",
    "threePastPositions",
    "educations",
    "memberUrlResources",
    "apiStandardProfileRequest",
    "siteStandardProfileRequest",
    "pictureUrl",
    "recommendationsGiven",
    "recommendationsReceived",
    "memberGroups",
    "personActivities",
    "imAccounts",
    "twitterAccounts",
    "dateOfBirth",
    "mainAddress",
    "phoneNumbers",
    "following"
})
@XmlRootElement(name = "person")
public class Person {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlElement(name = "first-name")
    protected String firstName;
    @XmlElement(name = "last-name")
    protected String lastName;
    protected String headline;
    protected Location location;
    protected String industry;
    protected Connections connections;
    @XmlElement(name = "current-status")
    protected String currentStatus;
    @XmlElement(name = "current-share")
    protected CurrentShare currentShare;
    protected Distance distance;
    @XmlElement(name = "current-status-timestamp", type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long currentStatusTimestamp;
    @XmlElement(name = "num-recommenders", type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long numRecommenders;
    @XmlElement(name = "num-connections", type = String.class)
    @XmlJavaTypeAdapter(LongAdapter.class)
    @XmlSchemaType(name = "integer")
    protected Long numConnections;
    @XmlElement(name = "num-connections-capped")
    protected Boolean numConnectionsCapped;
    @XmlElement(name = "relation-to-viewer")
    protected RelationToViewer relationToViewer;
    protected String summary;
    @XmlElement(name = "public-profile-url")
    @XmlSchemaType(name = "anyURI")
    protected String publicProfileUrl;
    protected String interests;
    protected String associations;
    protected String honors;
    protected String specialties;
    protected Certifications certifications;
    protected Patents patents;
    protected Publications publications;
    protected Skills skills;
    protected Languages languages;
    protected Positions positions;
    @XmlElement(name = "three-current-positions")
    protected ThreeCurrentPositions threeCurrentPositions;
    @XmlElement(name = "three-past-positions")
    protected ThreePastPositions threePastPositions;
    protected Educations educations;
    @XmlElement(name = "member-url-resources")
    protected MemberUrlResources memberUrlResources;
    @XmlElement(name = "api-standard-profile-request")
    protected ApiStandardProfileRequest apiStandardProfileRequest;
    @XmlElement(name = "site-standard-profile-request")
    protected SiteStandardProfileRequest siteStandardProfileRequest;
    @XmlElement(name = "picture-url")
    @XmlSchemaType(name = "anyURI")
    protected String pictureUrl;
    @XmlElement(name = "recommendations-given")
    protected RecommendationsGiven recommendationsGiven;
    @XmlElement(name = "recommendations-received")
    protected RecommendationsReceived recommendationsReceived;
    @XmlElement(name = "member-groups")
    protected MemberGroups memberGroups;
    @XmlElement(name = "person-activities")
    protected PersonActivities personActivities;
    @XmlElement(name = "im-accounts")
    protected ImAccounts imAccounts;
    @XmlElement(name = "twitter-accounts")
    protected TwitterAccounts twitterAccounts;
    @XmlElement(name = "date-of-birth")
    protected DateOfBirth dateOfBirth;
    @XmlElement(name = "main-address")
    protected String mainAddress;
    @XmlElement(name = "phone-numbers")
    protected PhoneNumbers phoneNumbers;
    protected Following following;
    @XmlAttribute(name = "path")
    @XmlSchemaType(name = "anySimpleType")
    protected String path;

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
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
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link Connections }
     *     
     */
    public Connections getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connections }
     *     
     */
    public void setConnections(Connections value) {
        this.connections = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the currentShare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentShare }
     *     
     */
    public CurrentShare getCurrentShare() {
        return currentShare;
    }

    /**
     * Sets the value of the currentShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentShare }
     *     
     */
    public void setCurrentShare(CurrentShare value) {
        this.currentShare = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the currentStatusTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCurrentStatusTimestamp() {
        return currentStatusTimestamp;
    }

    /**
     * Sets the value of the currentStatusTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatusTimestamp(Long value) {
        this.currentStatusTimestamp = value;
    }

    /**
     * Gets the value of the numRecommenders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumRecommenders() {
        return numRecommenders;
    }

    /**
     * Sets the value of the numRecommenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRecommenders(Long value) {
        this.numRecommenders = value;
    }

    /**
     * Gets the value of the numConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumConnections() {
        return numConnections;
    }

    /**
     * Sets the value of the numConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumConnections(Long value) {
        this.numConnections = value;
    }

    /**
     * Gets the value of the numConnectionsCapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNumConnectionsCapped() {
        return numConnectionsCapped;
    }

    /**
     * Sets the value of the numConnectionsCapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumConnectionsCapped(Boolean value) {
        this.numConnectionsCapped = value;
    }

    /**
     * Gets the value of the relationToViewer property.
     * 
     * @return
     *     possible object is
     *     {@link RelationToViewer }
     *     
     */
    public RelationToViewer getRelationToViewer() {
        return relationToViewer;
    }

    /**
     * Sets the value of the relationToViewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationToViewer }
     *     
     */
    public void setRelationToViewer(RelationToViewer value) {
        this.relationToViewer = value;
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
     * Gets the value of the publicProfileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicProfileUrl() {
        return publicProfileUrl;
    }

    /**
     * Sets the value of the publicProfileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicProfileUrl(String value) {
        this.publicProfileUrl = value;
    }

    /**
     * Gets the value of the interests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterests() {
        return interests;
    }

    /**
     * Sets the value of the interests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterests(String value) {
        this.interests = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociations(String value) {
        this.associations = value;
    }

    /**
     * Gets the value of the honors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHonors() {
        return honors;
    }

    /**
     * Sets the value of the honors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHonors(String value) {
        this.honors = value;
    }

    /**
     * Gets the value of the specialties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialties() {
        return specialties;
    }

    /**
     * Sets the value of the specialties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialties(String value) {
        this.specialties = value;
    }

    /**
     * Gets the value of the certifications property.
     * 
     * @return
     *     possible object is
     *     {@link Certifications }
     *     
     */
    public Certifications getCertifications() {
        return certifications;
    }

    /**
     * Sets the value of the certifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Certifications }
     *     
     */
    public void setCertifications(Certifications value) {
        this.certifications = value;
    }

    /**
     * Gets the value of the patents property.
     * 
     * @return
     *     possible object is
     *     {@link Patents }
     *     
     */
    public Patents getPatents() {
        return patents;
    }

    /**
     * Sets the value of the patents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patents }
     *     
     */
    public void setPatents(Patents value) {
        this.patents = value;
    }

    /**
     * Gets the value of the publications property.
     * 
     * @return
     *     possible object is
     *     {@link Publications }
     *     
     */
    public Publications getPublications() {
        return publications;
    }

    /**
     * Sets the value of the publications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Publications }
     *     
     */
    public void setPublications(Publications value) {
        this.publications = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * @return
     *     possible object is
     *     {@link Skills }
     *     
     */
    public Skills getSkills() {
        return skills;
    }

    /**
     * Sets the value of the skills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Skills }
     *     
     */
    public void setSkills(Skills value) {
        this.skills = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link Languages }
     *     
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Languages }
     *     
     */
    public void setLanguages(Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link Positions }
     *     
     */
    public Positions getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Positions }
     *     
     */
    public void setPositions(Positions value) {
        this.positions = value;
    }

    /**
     * Gets the value of the threeCurrentPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeCurrentPositions }
     *     
     */
    public ThreeCurrentPositions getThreeCurrentPositions() {
        return threeCurrentPositions;
    }

    /**
     * Sets the value of the threeCurrentPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeCurrentPositions }
     *     
     */
    public void setThreeCurrentPositions(ThreeCurrentPositions value) {
        this.threeCurrentPositions = value;
    }

    /**
     * Gets the value of the threePastPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ThreePastPositions }
     *     
     */
    public ThreePastPositions getThreePastPositions() {
        return threePastPositions;
    }

    /**
     * Sets the value of the threePastPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreePastPositions }
     *     
     */
    public void setThreePastPositions(ThreePastPositions value) {
        this.threePastPositions = value;
    }

    /**
     * Gets the value of the educations property.
     * 
     * @return
     *     possible object is
     *     {@link Educations }
     *     
     */
    public Educations getEducations() {
        return educations;
    }

    /**
     * Sets the value of the educations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Educations }
     *     
     */
    public void setEducations(Educations value) {
        this.educations = value;
    }

    /**
     * Gets the value of the memberUrlResources property.
     * 
     * @return
     *     possible object is
     *     {@link MemberUrlResources }
     *     
     */
    public MemberUrlResources getMemberUrlResources() {
        return memberUrlResources;
    }

    /**
     * Sets the value of the memberUrlResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberUrlResources }
     *     
     */
    public void setMemberUrlResources(MemberUrlResources value) {
        this.memberUrlResources = value;
    }

    /**
     * Gets the value of the apiStandardProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ApiStandardProfileRequest }
     *     
     */
    public ApiStandardProfileRequest getApiStandardProfileRequest() {
        return apiStandardProfileRequest;
    }

    /**
     * Sets the value of the apiStandardProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiStandardProfileRequest }
     *     
     */
    public void setApiStandardProfileRequest(ApiStandardProfileRequest value) {
        this.apiStandardProfileRequest = value;
    }

    /**
     * Gets the value of the siteStandardProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SiteStandardProfileRequest }
     *     
     */
    public SiteStandardProfileRequest getSiteStandardProfileRequest() {
        return siteStandardProfileRequest;
    }

    /**
     * Sets the value of the siteStandardProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteStandardProfileRequest }
     *     
     */
    public void setSiteStandardProfileRequest(SiteStandardProfileRequest value) {
        this.siteStandardProfileRequest = value;
    }

    /**
     * Gets the value of the pictureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * Sets the value of the pictureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureUrl(String value) {
        this.pictureUrl = value;
    }

    /**
     * Gets the value of the recommendationsGiven property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationsGiven }
     *     
     */
    public RecommendationsGiven getRecommendationsGiven() {
        return recommendationsGiven;
    }

    /**
     * Sets the value of the recommendationsGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationsGiven }
     *     
     */
    public void setRecommendationsGiven(RecommendationsGiven value) {
        this.recommendationsGiven = value;
    }

    /**
     * Gets the value of the recommendationsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationsReceived }
     *     
     */
    public RecommendationsReceived getRecommendationsReceived() {
        return recommendationsReceived;
    }

    /**
     * Sets the value of the recommendationsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationsReceived }
     *     
     */
    public void setRecommendationsReceived(RecommendationsReceived value) {
        this.recommendationsReceived = value;
    }

    /**
     * Gets the value of the memberGroups property.
     * 
     * @return
     *     possible object is
     *     {@link MemberGroups }
     *     
     */
    public MemberGroups getMemberGroups() {
        return memberGroups;
    }

    /**
     * Sets the value of the memberGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberGroups }
     *     
     */
    public void setMemberGroups(MemberGroups value) {
        this.memberGroups = value;
    }

    /**
     * Gets the value of the personActivities property.
     * 
     * @return
     *     possible object is
     *     {@link PersonActivities }
     *     
     */
    public PersonActivities getPersonActivities() {
        return personActivities;
    }

    /**
     * Sets the value of the personActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonActivities }
     *     
     */
    public void setPersonActivities(PersonActivities value) {
        this.personActivities = value;
    }

    /**
     * Gets the value of the imAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ImAccounts }
     *     
     */
    public ImAccounts getImAccounts() {
        return imAccounts;
    }

    /**
     * Sets the value of the imAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImAccounts }
     *     
     */
    public void setImAccounts(ImAccounts value) {
        this.imAccounts = value;
    }

    /**
     * Gets the value of the twitterAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link TwitterAccounts }
     *     
     */
    public TwitterAccounts getTwitterAccounts() {
        return twitterAccounts;
    }

    /**
     * Sets the value of the twitterAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwitterAccounts }
     *     
     */
    public void setTwitterAccounts(TwitterAccounts value) {
        this.twitterAccounts = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfBirth }
     *     
     */
    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfBirth }
     *     
     */
    public void setDateOfBirth(DateOfBirth value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the mainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the value of the mainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainAddress(String value) {
        this.mainAddress = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumbers }
     *     
     */
    public PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumbers }
     *     
     */
    public void setPhoneNumbers(PhoneNumbers value) {
        this.phoneNumbers = value;
    }

    /**
     * Gets the value of the following property.
     * 
     * @return
     *     possible object is
     *     {@link Following }
     *     
     */
    public Following getFollowing() {
        return following;
    }

    /**
     * Sets the value of the following property.
     * 
     * @param value
     *     allowed object is
     *     {@link Following }
     *     
     */
    public void setFollowing(Following value) {
        this.following = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
