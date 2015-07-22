package org.hpccsystems.ws.client.gen.filespray.v1_06;

public class FileSprayServiceSoapProxy implements org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap fileSprayServiceSoap = null;
  
  public FileSprayServiceSoapProxy() {
    _initFileSprayServiceSoapProxy();
  }
  
  public FileSprayServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFileSprayServiceSoapProxy();
  }
  
  private void _initFileSprayServiceSoapProxy() {
    try {
      fileSprayServiceSoap = (new org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayLocator()).getFileSprayServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap getFileSprayServiceSoap() {
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.abortDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.CopyResponse copy(org.hpccsystems.ws.client.gen.filespray.v1_06.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.copy(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.createDFUWorkunit();
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWorkunitsAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DesprayResponse despray(org.hpccsystems.ws.client.gen.filespray.v1_06.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.despray(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.gen.filespray.v1_06.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dfuMonitor(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_06.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.gen.filespray.v1_06.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.echoDateTime(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.FileListResponse fileList(org.hpccsystems.ws.client.gen.filespray.v1_06.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.fileList(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUExceptions(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUProgress(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.OpenSaveResponse openSave(org.hpccsystems.ws.client.gen.filespray.v1_06.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.openSave(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.RenameResponse rename(org.hpccsystems.ws.client.gen.filespray.v1_06.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.rename(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.ReplicateResponse replicate(org.hpccsystems.ws.client.gen.filespray.v1_06.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.replicate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.ShowResultResponse showResult(org.hpccsystems.ws.client.gen.filespray.v1_06.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.showResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.gen.filespray.v1_06.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayFixed(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.SprayResponse sprayVariable(org.hpccsystems.ws.client.gen.filespray.v1_06.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayVariable(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.submitDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.filespray.v1_06.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.updateDFUWorkunit(parameters);
  }
  
  
}