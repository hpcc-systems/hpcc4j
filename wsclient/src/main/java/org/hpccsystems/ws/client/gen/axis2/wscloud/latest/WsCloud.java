/**
 * WsCloud.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wscloud.latest;

/*
 *  WsCloud java interface
 */

public interface WsCloud {

  /**
   * Auto generated method signature
   *
   * @param wsCloudPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wscloud.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.WsCloudPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wscloud.latest.WsCloudPingRequest wsCloudPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wscloud.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getPODsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wscloud.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse getPODs(
      org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsRequest getPODsRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wscloud.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getServicesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wscloud.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesResponse getServices(
      org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesRequest getServicesRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wscloud.latest.EspSoapFault;

  //
}
