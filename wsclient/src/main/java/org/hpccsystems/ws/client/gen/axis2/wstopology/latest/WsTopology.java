/**
 * WsTopology.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.latest;

/*
 *  WsTopology java interface
 */

public interface WsTopology {

  /**
   * Auto generated method signature
   *
   * @param tpServiceQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse
      tpServiceQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest
              tpServiceQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpGetServicePluginsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse
      tpGetServicePlugins(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest
              tpGetServicePluginsRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpClusterQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse
      tpClusterQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest
              tpClusterQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpLogicalClusterQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse
      tpLogicalClusterQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest
              tpLogicalClusterQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpListTargetClustersRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse
      tpListTargetClusters(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest
              tpListTargetClustersRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpThorStatusRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse tpThorStatus(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest tpThorStatusRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpGetComponentFileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse
      tpGetComponentFile(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest
              tpGetComponentFileRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpClusterInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse tpClusterInfo(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest
          tpClusterInfoRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpListLogFilesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse
      tpListLogFiles(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest
              tpListLogFilesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpGroupQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse tpGroupQuery(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest tpGroupQueryRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpDropZoneQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse
      tpDropZoneQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest
              tpDropZoneQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpSetMachineStatusRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse
      tpSetMachineStatus(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest
              tpSetMachineStatusRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wsTopologyPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest
          wsTopologyPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpSwapNodeRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse tpSwapNode(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest tpSwapNodeRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param systemLogRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse systemLog(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest systemLogRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpLogFileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse tpLogFileDisplay(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest tpLogFileRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpLogFileRequest0
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse tpLogFile(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest tpLogFileRequest0)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpMachineQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse
      tpMachineQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest
              tpMachineQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpTargetClusterQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse
      tpTargetClusterQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest
              tpTargetClusterQueryRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpMachineInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse tpMachineInfo(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest
          tpMachineInfoRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param tpXMLFileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse tpXMLFile(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest tpXMLFileRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault;

  //
}
