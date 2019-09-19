
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
 *     &lt;enumeration value="blocked"/&gt;
 *     &lt;enumeration value="non-member"/&gt;
 *     &lt;enumeration value="awaiting-confirmation"/&gt;
 *     &lt;enumeration value="awaiting-parent-group-confirmation"/&gt;
 *     &lt;enumeration value="member"/&gt;
 *     &lt;enumeration value="moderator"/&gt;
 *     &lt;enumeration value="manager"/&gt;
 *     &lt;enumeration value="owner"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum MembershipStateCode {

    @XmlEnumValue("blocked")
    BLOCKED("blocked"),
    @XmlEnumValue("non-member")
    NON_MEMBER("non-member"),
    @XmlEnumValue("awaiting-confirmation")
    AWAITING_CONFIRMATION("awaiting-confirmation"),
    @XmlEnumValue("awaiting-parent-group-confirmation")
    AWAITING_PARENT_GROUP_CONFIRMATION("awaiting-parent-group-confirmation"),
    @XmlEnumValue("member")
    MEMBER("member"),
    @XmlEnumValue("moderator")
    MODERATOR("moderator"),
    @XmlEnumValue("manager")
    MANAGER("manager"),
    @XmlEnumValue("owner")
    OWNER("owner");
    private final String value;

    MembershipStateCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MembershipStateCode fromValue(String v) {
        for (MembershipStateCode c: MembershipStateCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
