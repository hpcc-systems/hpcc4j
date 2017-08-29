/**
 * WsDfuServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_36;

public interface WsDfuServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_36.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_36.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_36.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException;
}
