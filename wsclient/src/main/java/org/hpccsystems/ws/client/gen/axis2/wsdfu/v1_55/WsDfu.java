/**
 * WsDfu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55;


/*
 *  WsDfu java interface
 */
public interface WsDfu {
    /**
     * Auto generated method signature
     *
     * @param listHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.ListHistoryResponse listHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.ListHistoryRequest listHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eraseHistoryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EraseHistoryResponse eraseHistory(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EraseHistoryRequest eraseHistoryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsDfuPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.WsDfuPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.WsDfuPingRequest wsDfuPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUDefFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUDefFileResponse dFUDefFile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUDefFileRequest dFUDefFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetFileMetaDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUGetFileMetaDataResponse dFUGetFileMetaData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUGetFileMetaDataRequest dFUGetFileMetaDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileAccessResponse dFUFileAccessV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileAccessV2Request dFUFileAccessV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileViewRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileViewResponse dFUFileView(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileViewRequest dFUFileViewRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSpaceRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUSpaceResponse dFUSpace(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUSpaceRequest dFUSpaceRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addtoSuperfileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.AddtoSuperfileResponse addtoSuperfile(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.AddtoSuperfileRequest addtoSuperfileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileAccessRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileAccessResponse dFUFileAccess(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileAccessRequest dFUFileAccessRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUSearchDataResponse dFUSearchData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUSearchDataRequest dFUSearchDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUArrayActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUArrayActionResponse dFUArrayAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUArrayActionRequest dFUArrayActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFilePublishRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePublishResponse dFUFilePublish(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePublishRequest dFUFilePublishRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param eclRecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EclRecordTypeInfoResponse eclRecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EclRecordTypeInfoRequest eclRecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRemoteRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.AddRemoteResponse addRemote(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.AddRemoteRequest addRemoteRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.SuperfileActionResponse superfileAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.SuperfileActionRequest superfileActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileCreateResponse dFUFileCreate(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileCreateRequest dFUFileCreateRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUGetDataColumnsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUGetDataColumnsResponse dFUGetDataColumns(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUGetDataColumnsRequest dFUGetDataColumnsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFURecordTypeInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFURecordTypeInfoResponse dFURecordTypeInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFURecordTypeInfoRequest dFURecordTypeInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param superfileListRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.SuperfileListResponse superfileList(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.SuperfileListRequest superfileListRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUFileCreateV2Request
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileCreateResponse dFUFileCreateV2(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFileCreateV2Request dFUFileCreateV2Request)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.AddResponse add(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.AddRequest addRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param savexmlRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.SavexmlResponse savexml(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.SavexmlRequest savexmlRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUQueryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUQueryResponse dFUQuery(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUQueryRequest dFUQueryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUSearchResponse dFUSearch(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUSearchRequest dFUSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUBrowseDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUBrowseDataResponse dFUBrowseData(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUBrowseDataRequest dFUBrowseDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUInfoResponse dFUInfo(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUInfoRequest dFUInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.EspSoapFault;

    //
}
