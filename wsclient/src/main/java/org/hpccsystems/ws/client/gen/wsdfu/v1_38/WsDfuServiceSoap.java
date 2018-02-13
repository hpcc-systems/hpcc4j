/**
 * WsDfuServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_38;

public interface WsDfuServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_38.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_38.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_38.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFURecordTypeInfoResponse DFURecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFURecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_38.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.EclRecordTypeInfoResponse eclRecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_38.EclRecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_38.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_38.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.WsDfuPingResponse ping(org.hpccsystems.ws.client.gen.wsdfu.v1_38.WsDfuPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_38.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_38.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_38.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_38.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_38.ArrayOfEspException;
}
