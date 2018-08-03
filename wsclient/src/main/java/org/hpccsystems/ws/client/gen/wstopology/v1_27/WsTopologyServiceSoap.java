/**
 * WsTopologyServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_27;

public interface WsTopologyServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.WsTopologyPingResponse ping(org.hpccsystems.ws.client.gen.wstopology.v1_27.WsTopologyPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.SystemLogResponse systemLog(org.hpccsystems.ws.client.gen.wstopology.v1_27.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpDropZoneQueryResponse tpDropZoneQuery(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpDropZoneQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpGetServicePluginsResponse tpGetServicePlugins(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpGetServicePluginsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpListTargetClustersResponse tpListTargetClusters(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpListTargetClustersRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpLogFileResponse tpLogFile(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpMachineInfoResponse tpMachineInfo(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpMachineInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpThorStatusResponse tpThorStatus(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpThorStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wstopology.v1_27.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.client.gen.wstopology.v1_27.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_27.ArrayOfEspException;
}
