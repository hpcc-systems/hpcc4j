/**
 * EspSoapFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58;

public class EspSoapFault extends java.lang.Exception {
    private static final long serialVersionUID = 1567018786031L;
    private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.Exceptions faultMessage;

    public EspSoapFault() {
        super("EspSoapFault");
    }

    public EspSoapFault(java.lang.String s) {
        super(s);
    }

    public EspSoapFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public EspSoapFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.Exceptions msg) {
        faultMessage = msg;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.Exceptions getFaultMessage() {
        return faultMessage;
    }
}
