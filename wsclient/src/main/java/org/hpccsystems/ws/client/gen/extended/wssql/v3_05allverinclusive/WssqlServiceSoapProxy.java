package org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive;

public class WssqlServiceSoapProxy implements org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlServiceSoap wssqlServiceSoap = null;
  
  public WssqlServiceSoapProxy() {
    _initWssqlServiceSoapProxy();
  }
  
  public WssqlServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWssqlServiceSoapProxy();
  }
  
  private void _initWssqlServiceSoapProxy() {
    try {
      wssqlServiceSoap = (new org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlLocator()).getwssqlServiceSoap();
      if (wssqlServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wssqlServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wssqlServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wssqlServiceSoap != null)
      ((javax.xml.rpc.Stub)wssqlServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlServiceSoap getWssqlServiceSoap() {
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadResponse createTableAndLoad(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.CreateTableAndLoadRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.createTableAndLoad(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executePreparedSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executeSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBSystemInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesResponse getRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getRelatedIndexes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getResults(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingResponse ping(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.WssqlPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.prepareSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesResponse setRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.SetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.setRelatedIndexes(parameters);
  }
  
  
}