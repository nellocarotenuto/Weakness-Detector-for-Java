
package org.apache.hello_world_soap_http;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-09-11T15:43:32.959+02:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "faultDetail", targetNamespace = "http://apache.org/hello_world_soap_http/types")
public class PingMeFault extends Exception {
    public static final long serialVersionUID = 1L;
    
    private org.apache.hello_world_soap_http.types.FaultDetail faultDetail;

    public PingMeFault() {
        super();
    }
    
    public PingMeFault(String message) {
        super(message);
    }
    
    public PingMeFault(String message, Throwable cause) {
        super(message, cause);
    }

    public PingMeFault(String message, org.apache.hello_world_soap_http.types.FaultDetail faultDetail) {
        super(message);
        this.faultDetail = faultDetail;
    }

    public PingMeFault(String message, org.apache.hello_world_soap_http.types.FaultDetail faultDetail, Throwable cause) {
        super(message, cause);
        this.faultDetail = faultDetail;
    }

    public org.apache.hello_world_soap_http.types.FaultDetail getFaultInfo() {
        return this.faultDetail;
    }
}
