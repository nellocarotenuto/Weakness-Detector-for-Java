
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
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum JobTypeCode {

    @XmlEnumValue("F")
    FULL_TIME("F"),
    @XmlEnumValue("P")
    PART_TIME("P"),
    @XmlEnumValue("C")
    CONTRACT("C"),
    @XmlEnumValue("T")
    TEMPORARY("T"),
    @XmlEnumValue("O")
    OTHER("O");
    private final String value;

    JobTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobTypeCode fromValue(String v) {
        for (JobTypeCode c: JobTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
