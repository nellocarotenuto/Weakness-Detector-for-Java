
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
 *     &lt;enumeration value="elementary"/&gt;
 *     &lt;enumeration value="limited_working"/&gt;
 *     &lt;enumeration value="professional_working"/&gt;
 *     &lt;enumeration value="full_professional"/&gt;
 *     &lt;enumeration value="native_or_bilingual"/&gt;
 *     &lt;enumeration value="beginner"/&gt;
 *     &lt;enumeration value="intermediate"/&gt;
 *     &lt;enumeration value="advanced"/&gt;
 *     &lt;enumeration value="expert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum ProficiencyLevelType {

    @XmlEnumValue("elementary")
    ELEMENTARY("elementary"),
    @XmlEnumValue("limited_working")
    LIMITED_WORKING("limited_working"),
    @XmlEnumValue("professional_working")
    PROFESSIONAL_WORKING("professional_working"),
    @XmlEnumValue("full_professional")
    FULL_PROFESSIONAL("full_professional"),
    @XmlEnumValue("native_or_bilingual")
    NATIVE_BILINGUAL("native_or_bilingual"),
    @XmlEnumValue("beginner")
    BEGINNER("beginner"),
    @XmlEnumValue("intermediate")
    INTERMEDIATE("intermediate"),
    @XmlEnumValue("advanced")
    ADVANCED("advanced"),
    @XmlEnumValue("expert")
    EXPERT("expert");
    private final String value;

    ProficiencyLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProficiencyLevelType fromValue(String v) {
        for (ProficiencyLevelType c: ProficiencyLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
