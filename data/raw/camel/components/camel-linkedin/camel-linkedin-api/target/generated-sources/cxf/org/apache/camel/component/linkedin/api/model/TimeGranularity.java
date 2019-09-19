
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
 *     &lt;enumeration value="day"/&gt;
 *     &lt;enumeration value="month"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum TimeGranularity {

    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("month")
    MONTH("month");
    private final String value;

    TimeGranularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeGranularity fromValue(String v) {
        for (TimeGranularity c: TimeGranularity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
