
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
 *     &lt;enumeration value="acct"/&gt;
 *     &lt;enumeration value="adm"/&gt;
 *     &lt;enumeration value="advr"/&gt;
 *     &lt;enumeration value="anls"/&gt;
 *     &lt;enumeration value="art"/&gt;
 *     &lt;enumeration value="bd"/&gt;
 *     &lt;enumeration value="cnsl"/&gt;
 *     &lt;enumeration value="cust"/&gt;
 *     &lt;enumeration value="dist"/&gt;
 *     &lt;enumeration value="dsgn"/&gt;
 *     &lt;enumeration value="edu"/&gt;
 *     &lt;enumeration value="eng"/&gt;
 *     &lt;enumeration value="fin"/&gt;
 *     &lt;enumeration value="genb"/&gt;
 *     &lt;enumeration value="hr"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="lgl"/&gt;
 *     &lt;enumeration value="mgmt"/&gt;
 *     &lt;enumeration value="mnfc"/&gt;
 *     &lt;enumeration value="mrkt"/&gt;
 *     &lt;enumeration value="othr"/&gt;
 *     &lt;enumeration value="pr"/&gt;
 *     &lt;enumeration value="prch"/&gt;
 *     &lt;enumeration value="prdm"/&gt;
 *     &lt;enumeration value="prjm"/&gt;
 *     &lt;enumeration value="prod"/&gt;
 *     &lt;enumeration value="qa"/&gt;
 *     &lt;enumeration value="rsch"/&gt;
 *     &lt;enumeration value="sale"/&gt;
 *     &lt;enumeration value="sci"/&gt;
 *     &lt;enumeration value="stra"/&gt;
 *     &lt;enumeration value="supl"/&gt;
 *     &lt;enumeration value="trng"/&gt;
 *     &lt;enumeration value="wrt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum JobFunctionCode {

    @XmlEnumValue("acct")
    ACCOUNTING_AUDITING("acct"),
    @XmlEnumValue("adm")
    ADMINISTRATIVE("adm"),
    @XmlEnumValue("advr")
    ADVERTISING("advr"),
    @XmlEnumValue("anls")
    ANALYST("anls"),
    @XmlEnumValue("art")
    ART_CREATIVE("art"),
    @XmlEnumValue("bd")
    BUSINESS_DEVELOPMENT("bd"),
    @XmlEnumValue("cnsl")
    CONSULTING("cnsl"),
    @XmlEnumValue("cust")
    CUSTOMER_SERVICE("cust"),
    @XmlEnumValue("dist")
    DISTRIBUTION("dist"),
    @XmlEnumValue("dsgn")
    DESIGN("dsgn"),
    @XmlEnumValue("edu")
    EDUCATION("edu"),
    @XmlEnumValue("eng")
    ENGINEERING("eng"),
    @XmlEnumValue("fin")
    FINANCE("fin"),
    @XmlEnumValue("genb")
    GENERAL_BUSINESS("genb"),
    @XmlEnumValue("hr")
    HUMAN_RESOURCES("hr"),
    @XmlEnumValue("it")
    INFORMATION_TECHNOLOGY("it"),
    @XmlEnumValue("lgl")
    LEGAL("lgl"),
    @XmlEnumValue("mgmt")
    MANAGEMENT("mgmt"),
    @XmlEnumValue("mnfc")
    MANUFACTURING("mnfc"),
    @XmlEnumValue("mrkt")
    MARKETING("mrkt"),
    @XmlEnumValue("othr")
    OTHER("othr"),
    @XmlEnumValue("pr")
    PUBLIC_RELATIONS("pr"),
    @XmlEnumValue("prch")
    PURCHASING("prch"),
    @XmlEnumValue("prdm")
    PRODUCT_MANAGEMENT("prdm"),
    @XmlEnumValue("prjm")
    PROJECT_MANAGEMENT("prjm"),
    @XmlEnumValue("prod")
    PRODUCTION("prod"),
    @XmlEnumValue("qa")
    QUALITY_ASSURANCE("qa"),
    @XmlEnumValue("rsch")
    RESEARCH("rsch"),
    @XmlEnumValue("sale")
    SALES("sale"),
    @XmlEnumValue("sci")
    SCIENCE("sci"),
    @XmlEnumValue("stra")
    STRATEGY_PLANNING("stra"),
    @XmlEnumValue("supl")
    SUPPLY_CHAIN("supl"),
    @XmlEnumValue("trng")
    TRAINING("trng"),
    @XmlEnumValue("wrt")
    WRITING_EDITING("wrt");
    private final String value;

    JobFunctionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobFunctionCode fromValue(String v) {
        for (JobFunctionCode c: JobFunctionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
