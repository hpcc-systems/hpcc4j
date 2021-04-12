/**
 * WsDfu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57;


/*
 *  WsDfu java interface
 */
public interface WsDfu {
    /**
     * Auto generated method signature
     *
     * @param listHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ListHistoryResponse listHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ListHistoryRequest listHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eraseHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryResponse eraseHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryRequest eraseHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsDfuPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.WsDfuPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.WsDfuPingRequest wsDfuPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUDefFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileResponse dFUDefFile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileRequest dFUDefFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetFileMetaDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetFileMetaDataResponse dFUGetFileMetaData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetFileMetaDataRequest dFUGetFileMetaDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileAccessResponse dFUFileAccessV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileAccessV2Request dFUFileAccessV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileViewRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileViewResponse dFUFileView(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileViewRequest dFUFileViewRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSpaceRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSpaceResponse dFUSpace(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSpaceRequest dFUSpaceRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addtoSuperfileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddtoSuperfileResponse addtoSuperfile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddtoSuperfileRequest addtoSuperfileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileAccessResponse dFUFileAccess(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileAccessRequest dFUFileAccessRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSearchDataResponse dFUSearchData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSearchDataRequest dFUSearchDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUArrayActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUArrayActionResponse dFUArrayAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUArrayActionRequest dFUArrayActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFilePublishRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishResponse dFUFilePublish(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishRequest dFUFilePublishRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eclRecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EclRecordTypeInfoResponse eclRecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EclRecordTypeInfoRequest eclRecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRemoteRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteResponse addRemote(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteRequest addRemoteRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SuperfileActionResponse superfileAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SuperfileActionRequest superfileActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateResponse dFUFileCreate(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateRequest dFUFileCreateRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetDataColumnsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsResponse dFUGetDataColumns(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsRequest dFUGetDataColumnsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFURecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoResponse dFURecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoRequest dFURecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileListRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SuperfileListResponse superfileList(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SuperfileListRequest superfileListRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateResponse dFUFileCreateV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateV2Request dFUFileCreateV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddResponse add(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRequest addRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param savexmlRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SavexmlResponse savexml(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SavexmlRequest savexmlRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUQueryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUQueryResponse dFUQuery(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUQueryRequest dFUQueryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSearchResponse dFUSearch(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSearchRequest dFUSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUBrowseDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUBrowseDataResponse dFUBrowseData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUBrowseDataRequest dFUBrowseDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoResponse dFUInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoRequest dFUInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspSoapFault;

    //
}
