/**
 * WsDFUXRef.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest;

/*
 *  WsDFUXRef java interface
 */

public interface WsDFUXRef {

  /**
   * Auto generated method signature
   *
   * @param dFUXRefOrphanFilesQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryResponse
      dFUXRefOrphanFiles(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest
              dFUXRefOrphanFilesQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefListRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefListResponse dFUXRefList(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefListRequest dFUXRefListRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefFoundFilesQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryResponse
      dFUXRefFoundFiles(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefFoundFilesQueryRequest
              dFUXRefFoundFilesQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefBuildCancelRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelResponse
      dFUXRefBuildCancel(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildCancelRequest
              dFUXRefBuildCancelRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefArrayActionRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionResponse
      dFUXRefArrayAction(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest
              dFUXRefArrayActionRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefLostFilesQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefLostFilesQueryResponse
      dFUXRefLostFiles(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefLostFilesQueryRequest
              dFUXRefLostFilesQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefMessagesQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefMessagesQueryResponse
      dFUXRefMessages(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefMessagesQueryRequest
              dFUXRefMessagesQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wsDFUXRefPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.WsDFUXRefPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.WsDFUXRefPingRequest
          wsDFUXRefPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefDirectoriesQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryResponse
      dFUXRefDirectories(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefDirectoriesQueryRequest
              dFUXRefDirectoriesQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefUnusedFilesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse
      dFUXRefUnusedFiles(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest
              dFUXRefUnusedFilesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefCleanDirectoriesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefCleanDirectoriesResponse
      dFUXRefCleanDirectories(
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefCleanDirectoriesRequest
              dFUXRefCleanDirectoriesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUXRefBuildRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildResponse dFUXRefBuild(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefBuildRequest dFUXRefBuildRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspSoapFault;

  //
}
