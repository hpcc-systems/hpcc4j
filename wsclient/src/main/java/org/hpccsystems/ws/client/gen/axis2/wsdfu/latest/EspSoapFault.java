/**
 * EspSoapFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

public class EspSoapFault extends java.lang.Exception {
    private static final long serialVersionUID = 1634142149676L;
    private org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Exceptions faultMessage;

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
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Exceptions msg) {
        faultMessage = msg;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Exceptions getFaultMessage() {
        return faultMessage;
    }
}
