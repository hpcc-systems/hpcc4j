/**
 * WsResources.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsresources.latest;

/*
 *  WsResources java interface
 */

public interface WsResources {

  /**
   * Auto generated method signature
   *
   * @param targetQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse targetQuery(
      org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryRequest targetQueryRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wsResourcesPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WsResourcesPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WsResourcesPingRequest
          wsResourcesPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param webLinksQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse webLinksQuery(
      org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryRequest
          webLinksQueryRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param serviceQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryResponse serviceQuery(
      org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest
          serviceQueryRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault;

  //
}
