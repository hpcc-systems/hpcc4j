/**
 * EspSoapFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04;

public class EspSoapFault extends java.lang.Exception {
    private static final long serialVersionUID = 1600833045634L;
    private org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions faultMessage;

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
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions msg) {
        faultMessage = msg;
    }

    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions getFaultMessage() {
        return faultMessage;
    }
}
