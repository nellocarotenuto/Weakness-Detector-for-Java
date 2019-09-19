
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
 *     &lt;enumeration value="OPR"/&gt;
 *     &lt;enumeration value="OPS"/&gt;
 *     &lt;enumeration value="RRG"/&gt;
 *     &lt;enumeration value="OOB"/&gt;
 *     &lt;enumeration value="ACQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum CompanyStatusCode {

    @XmlEnumValue("OPR")
    OPERATING("OPR"),
    @XmlEnumValue("OPS")
    OPERATING_SUBSIDIARY("OPS"),
    @XmlEnumValue("RRG")
    REORGANIZING("RRG"),
    @XmlEnumValue("OOB")
    OUT_OF_BUSINESS("OOB"),
    @XmlEnumValue("ACQ")
    ACQUIRED("ACQ");
    private final String value;

    CompanyStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyStatusCode fromValue(String v) {
        for (CompanyStatusCode c: CompanyStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
