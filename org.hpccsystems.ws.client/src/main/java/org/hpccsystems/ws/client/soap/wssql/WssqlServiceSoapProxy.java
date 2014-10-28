package org.hpccsystems.ws.client.soap.wssql;

public class WssqlServiceSoapProxy implements org.hpccsystems.ws.client.soap.wssql.WssqlServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.soap.wssql.WssqlServiceSoap wssqlServiceSoap = null;
  
  public WssqlServiceSoapProxy() {
    _initWssqlServiceSoapProxy();
  }
  
  public WssqlServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWssqlServiceSoapProxy();
  }
  
  private void _initWssqlServiceSoapProxy() {
    try {
      wssqlServiceSoap = (new org.hpccsystems.ws.client.soap.wssql.WssqlLocator()).getwssqlServiceSoap();
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
  
  public org.hpccsystems.ws.client.soap.wssql.WssqlServiceSoap getWssqlServiceSoap() {
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap;
  }
  
  public org.hpccsystems.ws.client.soap.wssql.EchoResponse echo(org.hpccsystems.ws.client.soap.wssql.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wssql.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.soap.wssql.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executePreparedSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wssql.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.soap.wssql.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executeSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wssql.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.soap.wssql.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wssql.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.soap.wssql.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBSystemInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wssql.GetResultsResponse getResults(org.hpccsystems.ws.client.soap.wssql.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getResults(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wssql.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.soap.wssql.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.prepareSQL(parameters);
  }
  
  
}