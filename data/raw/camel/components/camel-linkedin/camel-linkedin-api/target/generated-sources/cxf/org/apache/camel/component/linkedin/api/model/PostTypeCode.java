
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
 *     &lt;enumeration value="standard"/&gt;
 *     &lt;enumeration value="news"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum PostTypeCode {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("news")
    NEWS("news");
    private final String value;

    PostTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostTypeCode fromValue(String v) {
        for (PostTypeCode c: PostTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
