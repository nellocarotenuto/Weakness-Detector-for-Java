
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="acct"/&gt;
 *               &lt;enumeration value="adm"/&gt;
 *               &lt;enumeration value="advr"/&gt;
 *               &lt;enumeration value="anls"/&gt;
 *               &lt;enumeration value="art"/&gt;
 *               &lt;enumeration value="bd"/&gt;
 *               &lt;enumeration value="cnsl"/&gt;
 *               &lt;enumeration value="cust"/&gt;
 *               &lt;enumeration value="dist"/&gt;
 *               &lt;enumeration value="dsgn"/&gt;
 *               &lt;enumeration value="edu"/&gt;
 *               &lt;enumeration value="eng"/&gt;
 *               &lt;enumeration value="fin"/&gt;
 *               &lt;enumeration value="genb"/&gt;
 *               &lt;enumeration value="hr"/&gt;
 *               &lt;enumeration value="it"/&gt;
 *               &lt;enumeration value="lgl"/&gt;
 *               &lt;enumeration value="mgmt"/&gt;
 *               &lt;enumeration value="mnfc"/&gt;
 *               &lt;enumeration value="mrkt"/&gt;
 *               &lt;enumeration value="othr"/&gt;
 *               &lt;enumeration value="pr"/&gt;
 *               &lt;enumeration value="prch"/&gt;
 *               &lt;enumeration value="prdm"/&gt;
 *               &lt;enumeration value="prjm"/&gt;
 *               &lt;enumeration value="prod"/&gt;
 *               &lt;enumeration value="qa"/&gt;
 *               &lt;enumeration value="rsch"/&gt;
 *               &lt;enumeration value="sale"/&gt;
 *               &lt;enumeration value="sci"/&gt;
 *               &lt;enumeration value="stra"/&gt;
 *               &lt;enumeration value="supl"/&gt;
 *               &lt;enumeration value="trng"/&gt;
 *               &lt;enumeration value="wrt"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}name"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "name"
})
@XmlRootElement(name = "job-function")
public class JobFunction {

    @XmlElement(required = true)
    protected JobFunctionCode code;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JobFunctionCode }
     *     
     */
    public JobFunctionCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFunctionCode }
     *     
     */
    public void setCode(JobFunctionCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
