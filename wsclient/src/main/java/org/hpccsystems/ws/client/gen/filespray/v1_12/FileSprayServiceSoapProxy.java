package org.hpccsystems.ws.client.gen.filespray.v1_12;

public class FileSprayServiceSoapProxy implements org.hpccsystems.ws.client.gen.filespray.v1_12.FileSprayServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.filespray.v1_12.FileSprayServiceSoap fileSprayServiceSoap = null;
  
  public FileSprayServiceSoapProxy() {
    _initFileSprayServiceSoapProxy();
  }
  
  public FileSprayServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFileSprayServiceSoapProxy();
  }
  
  private void _initFileSprayServiceSoapProxy() {
    try {
      fileSprayServiceSoap = (new org.hpccsystems.ws.client.gen.filespray.v1_12.FileSprayLocator()).getFileSprayServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.FileSprayServiceSoap getFileSprayServiceSoap() {
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.abortDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.CopyResponse copy(org.hpccsystems.ws.client.gen.filespray.v1_12.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.copy(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.createDFUWorkunit();
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWorkunitsAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DesprayResponse despray(org.hpccsystems.ws.client.gen.filespray.v1_12.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.despray(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.gen.filespray.v1_12.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dfuMonitor(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_12.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.gen.filespray.v1_12.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.echoDateTime(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.FileListResponse fileList(org.hpccsystems.ws.client.gen.filespray.v1_12.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.fileList(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUExceptions(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.gen.filespray.v1_12.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUProgress(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.GetSprayTargetsResponse getSprayTargets(org.hpccsystems.ws.client.gen.filespray.v1_12.GetSprayTargetsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getSprayTargets(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.OpenSaveResponse openSave(org.hpccsystems.ws.client.gen.filespray.v1_12.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.openSave(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.RenameResponse rename(org.hpccsystems.ws.client.gen.filespray.v1_12.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.rename(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.ReplicateResponse replicate(org.hpccsystems.ws.client.gen.filespray.v1_12.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.replicate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.ShowResultResponse showResult(org.hpccsystems.ws.client.gen.filespray.v1_12.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.showResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.gen.filespray.v1_12.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayFixed(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.SprayResponse sprayVariable(org.hpccsystems.ws.client.gen.filespray.v1_12.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayVariable(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.submitDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_12.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.updateDFUWorkunit(parameters);
  }
  
  
}