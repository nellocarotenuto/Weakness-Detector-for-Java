
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
 *     &lt;enumeration value="discussion"/&gt;
 *     &lt;enumeration value="job"/&gt;
 *     &lt;enumeration value="promotion"/&gt;
 *     &lt;enumeration value="linkedin-job"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum PostCategoryCode {

    @XmlEnumValue("discussion")
    DISCUSSION("discussion"),
    @XmlEnumValue("job")
    JOB("job"),
    @XmlEnumValue("promotion")
    PROMOTION("promotion"),
    @XmlEnumValue("linkedin-job")
    LINKEDIN_JOB("linkedin-job");
    private final String value;

    PostCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostCategoryCode fromValue(String v) {
        for (PostCategoryCode c: PostCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
