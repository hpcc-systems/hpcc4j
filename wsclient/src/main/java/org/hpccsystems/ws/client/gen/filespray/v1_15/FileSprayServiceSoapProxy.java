package org.hpccsystems.ws.client.gen.filespray.v1_15;

public class FileSprayServiceSoapProxy implements org.hpccsystems.ws.client.gen.filespray.v1_15.FileSprayServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.filespray.v1_15.FileSprayServiceSoap fileSprayServiceSoap = null;
  
  public FileSprayServiceSoapProxy() {
    _initFileSprayServiceSoapProxy();
  }
  
  public FileSprayServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFileSprayServiceSoapProxy();
  }
  
  private void _initFileSprayServiceSoapProxy() {
    try {
      fileSprayServiceSoap = (new org.hpccsystems.ws.client.gen.filespray.v1_15.FileSprayLocator()).getFileSprayServiceSoap();
      if (fileSprayServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fileSprayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fileSprayServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fileSprayServiceSoap != null)
      ((javax.xml.rpc.Stub)fileSprayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.FileSprayServiceSoap getFileSprayServiceSoap() {
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_15.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.abortDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.CopyResponse copy(org.hpccsystems.ws.client.gen.filespray.v1_15.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.copy(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.CreateDFUWorkunitResponse createDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_15.CreateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.createDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.gen.filespray.v1_15.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.gen.filespray.v1_15.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.gen.filespray.v1_15.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWorkunitsAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_15.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_15.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_15.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DesprayResponse despray(org.hpccsystems.ws.client.gen.filespray.v1_15.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.despray(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.gen.filespray.v1_15.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dfuMonitor(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DropZoneFileSearchResponse dropZoneFileSearch(org.hpccsystems.ws.client.gen.filespray.v1_15.DropZoneFileSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dropZoneFileSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_15.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.gen.filespray.v1_15.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.echoDateTime(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.FileListResponse fileList(org.hpccsystems.ws.client.gen.filespray.v1_15.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.fileList(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUExceptions(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.gen.filespray.v1_15.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUProgress(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUServerQueuesResponse getDFUServerQueues(org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUServerQueuesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUServerQueues(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_15.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.GetSprayTargetsResponse getSprayTargets(org.hpccsystems.ws.client.gen.filespray.v1_15.GetSprayTargetsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getSprayTargets(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.OpenSaveResponse openSave(org.hpccsystems.ws.client.gen.filespray.v1_15.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.openSave(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.RenameResponse rename(org.hpccsystems.ws.client.gen.filespray.v1_15.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.rename(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.ReplicateResponse replicate(org.hpccsystems.ws.client.gen.filespray.v1_15.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.replicate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.ShowResultResponse showResult(org.hpccsystems.ws.client.gen.filespray.v1_15.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.showResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.gen.filespray.v1_15.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayFixed(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.SprayResponse sprayVariable(org.hpccsystems.ws.client.gen.filespray.v1_15.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayVariable(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_15.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.submitDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_15.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_15.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_15.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.updateDFUWorkunit(parameters);
  }
  
  
}