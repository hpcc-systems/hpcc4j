/**
 * WsFileIO.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.1 Built on : Jun 07,
 * 2022 (03:46:59 EDT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsfileio.latest;

/*
 *  WsFileIO java interface
 */

public interface WsFileIO {

  /**
   * Auto generated method signature
   *
   * @param wsFileIOPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WsFileIOPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WsFileIOPingRequest wsFileIOPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param writeFileDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse writeFileData(
      org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest writeFileDataRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param createFileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse createFile(
      org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest createFileRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param readFileDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse readFileData(
      org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest readFileDataRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspSoapFault;

  //
}
