/**
 * FileSpray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.v1_16;


/*
 *  FileSpray java interface
 */
public interface FileSpray {
    /**
     * Auto generated method signature
     *
     * @param sprayVariable
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.SprayResponse sprayVariable(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.SprayVariable sprayVariable)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWUFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWUFileResponse dFUWUFile(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWUFileRequest dFUWUFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fileSprayPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.FileSprayPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.FileSprayPingRequest fileSprayPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param copy
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.CopyResponse copy(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.Copy copy)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param replicate
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ReplicateResponse replicate(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.Replicate replicate)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.CreateDFUWorkunitResponse createDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.CreateDFUWorkunit createDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUWorkunitResponse getDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUWorkunit getDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param rename
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.RenameResponse rename(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.Rename rename)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param sprayFixed
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.SprayFixedResponse sprayFixed(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.SprayFixed sprayFixed)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param showResultRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ShowResultResponse showResult(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ShowResultRequest showResultRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param abortDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.AbortDFUWorkunitResponse abortDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.AbortDFUWorkunit abortDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dropZoneFileSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DropZoneFileSearchResponse dropZoneFileSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DropZoneFileSearchRequest dropZoneFileSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUServerQueuesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUServerQueuesResponse getDFUServerQueues(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUServerQueuesRequest getDFUServerQueuesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDFUWorkunits
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DeleteDFUWorkunitsResponse deleteDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DeleteDFUWorkunits deleteDFUWorkunits)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param despray
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DesprayResponse despray(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.Despray despray)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fileListRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.FileListResponse fileList(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.FileListRequest fileListRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWorkunitsActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWorkunitsActionResponse dFUWorkunitsAction(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWorkunitsActionRequest dFUWorkunitsActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dropZoneFilesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DropZoneFilesResponse dropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DropZoneFilesRequest dropZoneFilesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DeleteDFUWorkunitResponse deleteDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DeleteDFUWorkunit deleteDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param submitDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.SubmitDFUWorkunitResponse submitDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.SubmitDFUWorkunit submitDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dfuMonitorRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DfuMonitorResponse dfuMonitor(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DfuMonitorRequest dfuMonitorRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWUSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWUSearchResponse dFUWUSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWUSearchRequest dFUWUSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUWorkunits
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUWorkunitsResponse getDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUWorkunits getDFUWorkunits)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDropZoneFilesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DFUWorkunitsActionResponse deleteDropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.DeleteDropZoneFilesRequest deleteDropZoneFilesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getSprayTargetsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetSprayTargetsResponse getSprayTargets(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetSprayTargetsRequest getSprayTargetsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUExceptions
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUExceptionsResponse getDFUExceptions(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.GetDFUExceptions getDFUExceptions)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param echoDateTime
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EchoDateTimeResponse echoDateTime(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EchoDateTime echoDateTime)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param updateDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.UpdateDFUWorkunitResponse updateDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.UpdateDFUWorkunit updateDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param progressRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ProgressResponse getDFUProgress(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ProgressRequest progressRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param openSaveRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.OpenSaveResponse openSave(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.OpenSaveRequest openSaveRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.EspSoapFault;

    //
}
