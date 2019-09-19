
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
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum CompanyTypeCode {

    @XmlEnumValue("C")
    PUBLIC_COMPANY("C"),
    @XmlEnumValue("D")
    EDUCATIONAL("D"),
    @XmlEnumValue("E")
    SELF_EMPLOYED("E"),
    @XmlEnumValue("G")
    GOVT_AGENCY("G"),
    @XmlEnumValue("N")
    NON_PROFIT("N"),
    @XmlEnumValue("O")
    SELF_OWNED("O"),
    @XmlEnumValue("P")
    PRIVATELY_HELD("P"),
    @XmlEnumValue("S")
    PARTNERSHIP("S");
    private final String value;

    CompanyTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyTypeCode fromValue(String v) {
        for (CompanyTypeCode c: CompanyTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
