
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
 *     &lt;enumeration value="description"/&gt;
 *     &lt;enumeration value="speciality"/&gt;
 *     &lt;enumeration value="logo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum ProfileFieldCode {

    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("speciality")
    SPECIALITY("speciality"),
    @XmlEnumValue("logo")
    LOGO("logo");
    private final String value;

    ProfileFieldCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileFieldCode fromValue(String v) {
        for (ProfileFieldCode c: ProfileFieldCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
