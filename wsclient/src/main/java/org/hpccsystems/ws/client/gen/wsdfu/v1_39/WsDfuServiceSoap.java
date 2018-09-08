/**
 * WsDfuServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_39;

public interface WsDfuServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessResponse DFUFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFURecordTypeInfoResponse DFURecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFURecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.EclRecordTypeInfoResponse eclRecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_39.EclRecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_39.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_39.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuPingResponse ping(org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException;
}
