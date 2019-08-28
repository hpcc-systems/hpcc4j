/**
 * WsDfu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50;


/*
 *  WsDfu java interface
 */
public interface WsDfu {
    /**
     * Auto generated method signature
     *
     * @param listHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.ListHistoryResponse listHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.ListHistoryRequest listHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eraseHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EraseHistoryResponse eraseHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EraseHistoryRequest eraseHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsDfuPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.WsDfuPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.WsDfuPingRequest wsDfuPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUDefFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUDefFileResponse dFUDefFile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUDefFileRequest dFUDefFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetFileMetaDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUGetFileMetaDataResponse dFUGetFileMetaData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUGetFileMetaDataRequest dFUGetFileMetaDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileAccessResponse dFUFileAccessV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileAccessV2Request dFUFileAccessV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileViewRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileViewResponse dFUFileView(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileViewRequest dFUFileViewRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSpaceRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUSpaceResponse dFUSpace(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUSpaceRequest dFUSpaceRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addtoSuperfileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.AddtoSuperfileResponse addtoSuperfile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.AddtoSuperfileRequest addtoSuperfileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileAccessResponse dFUFileAccess(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileAccessRequest dFUFileAccessRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUSearchDataResponse dFUSearchData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUSearchDataRequest dFUSearchDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUArrayActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUArrayActionResponse dFUArrayAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUArrayActionRequest dFUArrayActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFilePublishRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFilePublishResponse dFUFilePublish(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFilePublishRequest dFUFilePublishRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eclRecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EclRecordTypeInfoResponse eclRecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EclRecordTypeInfoRequest eclRecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRemoteRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.AddRemoteResponse addRemote(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.AddRemoteRequest addRemoteRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.SuperfileActionResponse superfileAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.SuperfileActionRequest superfileActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileCreateResponse dFUFileCreate(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileCreateRequest dFUFileCreateRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetDataColumnsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUGetDataColumnsResponse dFUGetDataColumns(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUGetDataColumnsRequest dFUGetDataColumnsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFURecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFURecordTypeInfoResponse dFURecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFURecordTypeInfoRequest dFURecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileListRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.SuperfileListResponse superfileList(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.SuperfileListRequest superfileListRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileCreateResponse dFUFileCreateV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUFileCreateV2Request dFUFileCreateV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.AddResponse add(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.AddRequest addRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param savexmlRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.SavexmlResponse savexml(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.SavexmlRequest savexmlRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUQueryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUQueryResponse dFUQuery(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUQueryRequest dFUQueryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUSearchResponse dFUSearch(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUSearchRequest dFUSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUBrowseDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUBrowseDataResponse dFUBrowseData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUBrowseDataRequest dFUBrowseDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUInfoResponse dFUInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.DFUInfoRequest dFUInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_50.EspSoapFault;

    //
}
