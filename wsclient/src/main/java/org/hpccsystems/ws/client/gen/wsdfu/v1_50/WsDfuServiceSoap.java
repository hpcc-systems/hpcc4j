/**
 * WsDfuServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_50;

public interface WsDfuServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessResponse DFUFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessResponse DFUFileAccessV2(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateResponse DFUFileCreate(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateResponse DFUFileCreateV2(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFilePublishResponse DFUFilePublish(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFilePublishRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFURecordTypeInfoResponse DFURecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFURecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.EclRecordTypeInfoResponse eclRecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_50.EclRecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_50.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_50.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuPingResponse ping(org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_50.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException;
}
