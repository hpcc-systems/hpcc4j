/**
 * EspSoapFault.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.1 Built on : Jun 07,
 * 2022 (03:46:59 EDT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsresources.latest;

public class EspSoapFault extends java.lang.Exception {

  private static final long serialVersionUID = 1658772146923L;

  private org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Exceptions faultMessage;

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
      org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Exceptions msg) {
    faultMessage = msg;
  }

  public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Exceptions getFaultMessage() {
    return faultMessage;
  }
}
