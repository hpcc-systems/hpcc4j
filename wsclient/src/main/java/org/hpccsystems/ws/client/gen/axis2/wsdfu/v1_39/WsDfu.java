/**
 * WsDfu.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39;

/*
 *  WsDfu java interface
 */

public interface WsDfu {

  /**
   * Auto generated method signature
   *
   * @param listHistoryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse listHistory(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest listHistoryRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param eraseHistoryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse eraseHistory(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest eraseHistoryRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wsDfuPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest wsDfuPingRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUDefFileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse dFUDefFile(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest dFUDefFileRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUGetFileMetaDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse
      dFUGetFileMetaData(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest
              dFUGetFileMetaDataRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileViewRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse dFUFileView(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest dFUFileViewRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUSpaceRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse dFUSpace(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest dFUSpaceRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addtoSuperfileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse addtoSuperfile(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest addtoSuperfileRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileAccessRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse dFUFileAccess(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest dFUFileAccessRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUSearchDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse dFUSearchData(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest dFUSearchDataRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUArrayActionRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse dFUArrayAction(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest dFUArrayActionRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFilePublishRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse dFUFilePublish(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest dFUFilePublishRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param eclRecordTypeInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse
      eclRecordTypeInfo(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest
              eclRecordTypeInfoRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addRemoteRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse addRemote(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest addRemoteRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param superfileActionRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse superfileAction(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest superfileActionRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUFileCreateRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse dFUFileCreate(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest dFUFileCreateRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUGetDataColumnsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse
      dFUGetDataColumns(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest
              dFUGetDataColumnsRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFURecordTypeInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse
      dFURecordTypeInfo(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest
              dFURecordTypeInfoRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param superfileListRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse superfileList(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest superfileListRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse add(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest addRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param savexmlRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse savexml(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest savexmlRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUQueryRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse dFUQuery(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest dFUQueryRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUSearchRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse dFUSearch(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest dFUSearchRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUBrowseDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse dFUBrowseData(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest dFUBrowseDataRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse dFUInfo(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest dFUInfoRequest)
      throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault;

  //
}
