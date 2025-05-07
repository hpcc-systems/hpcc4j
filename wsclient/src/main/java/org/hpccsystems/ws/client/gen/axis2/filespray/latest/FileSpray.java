/**
 * FileSpray.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.latest;

/*
 *  FileSpray java interface
 */

public interface FileSpray {

  /**
   * Auto generated method signature
   *
   * @param sprayVariable
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayResponse sprayVariable(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayVariable sprayVariable)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUWUFileRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileResponse dFUWUFile(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileRequest dFUWUFileRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param fileSprayPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileSprayPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileSprayPingRequest
          fileSprayPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param copy
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.CopyResponse copy(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.Copy copy)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param replicate
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ReplicateResponse replicate(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.Replicate replicate)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param createDFUWorkunit
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunitResponse
      createDFUWorkunit(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUWorkunit createDFUWorkunit)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getDFUWorkunit
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse getDFUWorkunit(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunit getDFUWorkunit)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param rename
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.RenameResponse rename(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.Rename rename)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param sprayFixed
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixedResponse sprayFixed(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.SprayFixed sprayFixed)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param showResultRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultResponse showResult(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultRequest showResultRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param abortDFUWorkunit
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunitResponse
      abortDFUWorkunit(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.AbortDFUWorkunit abortDFUWorkunit)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dropZoneFileSearchRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFileSearchResponse
      dropZoneFileSearch(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFileSearchRequest
              dropZoneFileSearchRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getRemoteTargetsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsResponse
      getRemoteTargets(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetRemoteTargetsRequest
              getRemoteTargetsRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getDFUServerQueuesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesResponse
      getDFUServerQueues(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesRequest
              getDFUServerQueuesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteDFUWorkunits
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitsResponse
      deleteDFUWorkunits(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunits
              deleteDFUWorkunits)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param despray
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DesprayResponse despray(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.Despray despray)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param fileListRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListResponse fileList(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.FileListRequest fileListRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUWorkunitsActionRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse
      dFUWorkunitsAction(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionRequest
              dFUWorkunitsActionRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dropZoneFilesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse dropZoneFiles(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesRequest
          dropZoneFilesRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteDFUWorkunit
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitResponse
      deleteDFUWorkunit(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunit deleteDFUWorkunit)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param submitDFUWorkunit
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.SubmitDFUWorkunitResponse
      submitDFUWorkunit(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.SubmitDFUWorkunit submitDFUWorkunit)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dfuMonitorRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DfuMonitorResponse dfuMonitor(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.DfuMonitorRequest dfuMonitorRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param dFUWUSearchRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchResponse dFUWUSearch(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchRequest dFUWUSearchRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getDFUWorkunits
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse
      getDFUWorkunits(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits getDFUWorkunits)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteDropZoneFilesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWorkunitsActionResponse
      deleteDropZoneFiles(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDropZoneFilesRequest
              deleteDropZoneFilesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getSprayTargetsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetSprayTargetsResponse
      getSprayTargets(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetSprayTargetsRequest
              getSprayTargetsRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getDFUExceptions
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUExceptionsResponse
      getDFUExceptions(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUExceptions getDFUExceptions)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param echoDateTime
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTimeResponse echoDateTime(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTime echoDateTime)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param createDFUPublisherWorkunit
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunitResponse
      createDFUPublisherWorkunit(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.CreateDFUPublisherWorkunit
              createDFUPublisherWorkunit)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param updateDFUWorkunit
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunitResponse
      updateDFUWorkunit(
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.UpdateDFUWorkunit updateDFUWorkunit)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param progressRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse getDFUProgress(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressRequest progressRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param openSaveRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveResponse openSave(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.OpenSaveRequest openSaveRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspSoapFault;

  //
}
