/**
 * EspSoapFault.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62;

public class EspSoapFault extends java.lang.Exception {

  private static final long serialVersionUID = 1L;

  private org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.Exceptions faultMessage;

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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.Exceptions msg) {
    faultMessage = msg;
  }

  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.Exceptions getFaultMessage() {
    return faultMessage;
  }
}
