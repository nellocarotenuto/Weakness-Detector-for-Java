
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
 *     &lt;enumeration value="alumni"/&gt;
 *     &lt;enumeration value="corporate"/&gt;
 *     &lt;enumeration value="conference"/&gt;
 *     &lt;enumeration value="network"/&gt;
 *     &lt;enumeration value="philanthropic"/&gt;
 *     &lt;enumeration value="professional"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum GroupCategoryCode {

    @XmlEnumValue("alumni")
    ALUMNI("alumni"),
    @XmlEnumValue("corporate")
    CORPORATE("corporate"),
    @XmlEnumValue("conference")
    CONFERENCE("conference"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("philanthropic")
    PHILANTHROPIC("philanthropic"),
    @XmlEnumValue("professional")
    PROFESSIONAL("professional"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    GroupCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupCategoryCode fromValue(String v) {
        for (GroupCategoryCode c: GroupCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
