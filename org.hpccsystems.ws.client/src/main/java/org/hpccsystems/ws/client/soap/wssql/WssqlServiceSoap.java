/**
 * WssqlServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public interface WssqlServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.soap.wssql.EchoResponse echo(org.hpccsystems.ws.client.soap.wssql.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wssql.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.soap.wssql.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wssql.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.soap.wssql.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wssql.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.soap.wssql.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wssql.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.soap.wssql.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wssql.GetResultsResponse getResults(org.hpccsystems.ws.client.soap.wssql.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wssql.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.soap.wssql.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
}
