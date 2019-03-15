/**
 * WsTopologyServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_28;

public interface WsTopologyServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyPingResponse ping(org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.SystemLogResponse systemLog(org.hpccsystems.ws.client.gen.wstopology.v1_28.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZoneQueryResponse tpDropZoneQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZoneQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetServicePluginsResponse tpGetServicePlugins(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetServicePluginsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpListTargetClustersResponse tpListTargetClusters(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpListTargetClustersRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileResponse tpLogFile(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineInfoResponse tpMachineInfo(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpThorStatusResponse tpThorStatus(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpThorStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
}
