/**
 * WsDfu.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/*
 *  WsDfu java interface
 */

public interface WsDfu {

  /**
   * Auto generated method signature
   *
   * @param listHistoryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ListHistoryResponse listHistory(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ListHistoryRequest listHistoryRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param eraseHistoryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EraseHistoryResponse eraseHistory(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EraseHistoryRequest eraseHistoryRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wsDfuPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.WsDfuPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.WsDfuPingRequest wsDfuPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUDefFileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDefFileResponse dFUDefFile(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDefFileRequest dFUDefFileRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUGetFileMetaDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse
      dFUGetFileMetaData(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest
              dFUGetFileMetaDataRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileAccessV2Request
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse dFUFileAccessV2(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessV2Request
          dFUFileAccessV2Request)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileViewRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse dFUFileView(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest dFUFileViewRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUSpaceRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceResponse dFUSpace(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceRequest dFUSpaceRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addtoSuperfileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse addtoSuperfile(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileRequest addtoSuperfileRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileAccessRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse dFUFileAccess(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequest dFUFileAccessRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUSearchDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataResponse dFUSearchData(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest dFUSearchDataRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUArrayActionRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse dFUArrayAction(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionRequest dFUArrayActionRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFilePublishRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishResponse dFUFilePublish(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest dFUFilePublishRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param eclRecordTypeInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoResponse
      eclRecordTypeInfo(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoRequest
              eclRecordTypeInfoRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addRemoteRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteResponse addRemote(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteRequest addRemoteRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param superfileActionRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse superfileAction(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionRequest
          superfileActionRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileCreateRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse dFUFileCreate(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateRequest dFUFileCreateRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUGetDataColumnsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetDataColumnsResponse
      dFUGetDataColumns(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetDataColumnsRequest
              dFUGetDataColumnsRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFURecordTypeInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFURecordTypeInfoResponse
      dFURecordTypeInfo(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFURecordTypeInfoRequest
              dFURecordTypeInfoRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param superfileListRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse superfileList(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListRequest superfileListRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileCreateV2Request
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse dFUFileCreateV2(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request
          dFUFileCreateV2Request)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddResponse add(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRequest addRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param savexmlRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlResponse savexml(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlRequest savexmlRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse dFUQuery(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest dFUQueryRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUSearchRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchResponse dFUSearch(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchRequest dFUSearchRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUBrowseDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse dFUBrowseData(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest dFUBrowseDataRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoResponse dFUInfo(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest dFUInfoRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspSoapFault;

  //
}
