/**
 * WsDfuServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public interface WsDfuServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessResponse DFUFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessResponse DFUFileAccessV2(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateResponse DFUFileCreate(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateResponse DFUFileCreateV2(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePublishResponse DFUFilePublish(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePublishRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFURecordTypeInfoResponse DFURecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFURecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.EclRecordTypeInfoResponse eclRecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.EclRecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_51.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuPingResponse ping(org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_51.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
}
