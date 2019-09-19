
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="location"/&gt;
 *     &lt;enumeration value="industry"/&gt;
 *     &lt;enumeration value="network"/&gt;
 *     &lt;enumeration value="language"/&gt;
 *     &lt;enumeration value="current-company"/&gt;
 *     &lt;enumeration value="past-company"/&gt;
 *     &lt;enumeration value="school"/&gt;
 *     &lt;enumeration value="company-size"/&gt;
 *     &lt;enumeration value="num-followers-range"/&gt;
 *     &lt;enumeration value="fortune"/&gt;
 *     &lt;enumeration value="company"/&gt;
 *     &lt;enumeration value="date-posted"/&gt;
 *     &lt;enumeration value="job-function"/&gt;
 *     &lt;enumeration value="experience-level"/&gt;
 *     &lt;enumeration value="salary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum FacetType {

    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("industry")
    INDUSTRY("industry"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("language")
    LANGUAGE("language"),
    @XmlEnumValue("current-company")
    CURRENT_COMPANY("current-company"),
    @XmlEnumValue("past-company")
    PAST_COMPANY("past-company"),
    @XmlEnumValue("school")
    SCHOOL("school"),
    @XmlEnumValue("company-size")
    COMPANY_SIZE("company-size"),
    @XmlEnumValue("num-followers-range")
    NUM_FOLLOWERS_RANGE("num-followers-range"),
    @XmlEnumValue("fortune")
    FORTUNE("fortune"),
    @XmlEnumValue("company")
    COMPANY("company"),
    @XmlEnumValue("date-posted")
    DATE_POSTED("date-posted"),
    @XmlEnumValue("job-function")
    JOB_FUNCTION("job-function"),
    @XmlEnumValue("experience-level")
    EXPERIENCE_LEVEL("experience-level"),
    @XmlEnumValue("salary")
    SALARY("salary");
    private final String value;

    FacetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacetType fromValue(String v) {
        for (FacetType c: FacetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
