
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
 *     &lt;enumeration value="aim"/&gt;
 *     &lt;enumeration value="gtalk"/&gt;
 *     &lt;enumeration value="icq"/&gt;
 *     &lt;enumeration value="msn"/&gt;
 *     &lt;enumeration value="skype"/&gt;
 *     &lt;enumeration value="yahoo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum ImAccountType {

    @XmlEnumValue("aim")
    AIM("aim"),
    @XmlEnumValue("gtalk")
    GTALK("gtalk"),
    @XmlEnumValue("icq")
    ICQ("icq"),
    @XmlEnumValue("msn")
    MSN("msn"),
    @XmlEnumValue("skype")
    SKYPE("skype"),
    @XmlEnumValue("yahoo")
    YAHOO("yahoo");
    private final String value;

    ImAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImAccountType fromValue(String v) {
        for (ImAccountType c: ImAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
