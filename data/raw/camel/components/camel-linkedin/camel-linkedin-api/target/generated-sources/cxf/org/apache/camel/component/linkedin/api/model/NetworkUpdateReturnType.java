
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
 *     &lt;enumeration value="ANSW"/&gt;
 *     &lt;enumeration value="APPM"/&gt;
 *     &lt;enumeration value="APPS"/&gt;
 *     &lt;enumeration value="CMPY"/&gt;
 *     &lt;enumeration value="CONN"/&gt;
 *     &lt;enumeration value="NCON"/&gt;
 *     &lt;enumeration value="CCEM"/&gt;
 *     &lt;enumeration value="JOBP"/&gt;
 *     &lt;enumeration value="JGRP"/&gt;
 *     &lt;enumeration value="MSFC"/&gt;
 *     &lt;enumeration value="PFOL"/&gt;
 *     &lt;enumeration value="PICU"/&gt;
 *     &lt;enumeration value="PREC"/&gt;
 *     &lt;enumeration value="PRFU"/&gt;
 *     &lt;enumeration value="PROF"/&gt;
 *     &lt;enumeration value="QSTN"/&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="SVPR"/&gt;
 *     &lt;enumeration value="PRFX"/&gt;
 *     &lt;enumeration value="SHAR"/&gt;
 *     &lt;enumeration value="VIRL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum NetworkUpdateReturnType {

    @XmlEnumValue("ANSW")
    ANSWER_UPDATE("ANSW"),
    @XmlEnumValue("APPM")
    APPLICATION_CONNECTION_UPDATE("APPM"),
    @XmlEnumValue("APPS")
    APPLICATION_TO_MEMBER_UPDATE("APPS"),
    @XmlEnumValue("CMPY")
    COMPANY_UPDATED("CMPY"),
    @XmlEnumValue("CONN")
    CONNECTION_ADDED_CONNECTIONS("CONN"),
    @XmlEnumValue("NCON")
    NEW_CONNECTIONS("NCON"),
    @XmlEnumValue("CCEM")
    CONTACT_JOINED("CCEM"),
    @XmlEnumValue("JOBP")
    JOB_POSTED("JOBP"),
    @XmlEnumValue("JGRP")
    CONNECTION_JOINED_GROUP("JGRP"),
    @XmlEnumValue("MSFC")
    MEMBER_STARTS_FOLLOWING_COMPANY("MSFC"),
    @XmlEnumValue("PFOL")
    PEOPLE_FOLLOW_UPDATE("PFOL"),
    @XmlEnumValue("PICU")
    CONNECTION_UPDATED_PICTURE("PICU"),
    @XmlEnumValue("PREC")
    CONNECTION_RECOMMENDED("PREC"),
    @XmlEnumValue("PRFU")
    CONNECTION_PROFILE_UPDATE("PRFU"),
    @XmlEnumValue("PROF")
    CONNECTION_UPDATED_PROFILE("PROF"),
    @XmlEnumValue("QSTN")
    QUESTION_UPDATED("QSTN"),
    @XmlEnumValue("STAT")
    STATUS_UPDATED("STAT"),
    @XmlEnumValue("SVPR")
    RECOMMENDATIONS_UPDATE("SVPR"),
    @XmlEnumValue("PRFX")
    EXTENDED_PROFILE_UPDATED("PRFX"),
    @XmlEnumValue("SHAR")
    SHARED_ITEM("SHAR"),
    @XmlEnumValue("VIRL")
    VIRAL_UPDATE("VIRL");
    private final String value;

    NetworkUpdateReturnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkUpdateReturnType fromValue(String v) {
        for (NetworkUpdateReturnType c: NetworkUpdateReturnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
