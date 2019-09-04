/**
 * WsDfu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51;


/*
 *  WsDfu java interface
 */
public interface WsDfu {
    /**
     * Auto generated method signature
     *
     * @param listHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ListHistoryResponse listHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ListHistoryRequest listHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eraseHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EraseHistoryResponse eraseHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EraseHistoryRequest eraseHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsDfuPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.WsDfuPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.WsDfuPingRequest wsDfuPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUDefFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUDefFileResponse dFUDefFile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUDefFileRequest dFUDefFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetFileMetaDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetFileMetaDataResponse dFUGetFileMetaData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetFileMetaDataRequest dFUGetFileMetaDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileAccessResponse dFUFileAccessV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileAccessV2Request dFUFileAccessV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileViewRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileViewResponse dFUFileView(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileViewRequest dFUFileViewRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSpaceRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSpaceResponse dFUSpace(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSpaceRequest dFUSpaceRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addtoSuperfileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.AddtoSuperfileResponse addtoSuperfile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.AddtoSuperfileRequest addtoSuperfileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileAccessResponse dFUFileAccess(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileAccessRequest dFUFileAccessRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSearchDataResponse dFUSearchData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSearchDataRequest dFUSearchDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUArrayActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUArrayActionResponse dFUArrayAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUArrayActionRequest dFUArrayActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFilePublishRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePublishResponse dFUFilePublish(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePublishRequest dFUFilePublishRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eclRecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EclRecordTypeInfoResponse eclRecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EclRecordTypeInfoRequest eclRecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRemoteRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.AddRemoteResponse addRemote(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.AddRemoteRequest addRemoteRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SuperfileActionResponse superfileAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SuperfileActionRequest superfileActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileCreateResponse dFUFileCreate(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileCreateRequest dFUFileCreateRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetDataColumnsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetDataColumnsResponse dFUGetDataColumns(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetDataColumnsRequest dFUGetDataColumnsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFURecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFURecordTypeInfoResponse dFURecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFURecordTypeInfoRequest dFURecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileListRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SuperfileListResponse superfileList(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SuperfileListRequest superfileListRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileCreateResponse dFUFileCreateV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileCreateV2Request dFUFileCreateV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.AddResponse add(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.AddRequest addRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param savexmlRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SavexmlResponse savexml(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SavexmlRequest savexmlRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUQueryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUQueryResponse dFUQuery(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUQueryRequest dFUQueryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSearchResponse dFUSearch(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSearchRequest dFUSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUBrowseDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUBrowseDataResponse dFUBrowseData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUBrowseDataRequest dFUBrowseDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUInfoResponse dFUInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUInfoRequest dFUInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;

    //
}
