/**
 * WssqlServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_05;

public interface WssqlServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.CreateTableAndLoadResponse createTableAndLoad(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.CreateTableAndLoadRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetRelatedIndexesResponse getRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.SetRelatedIndexesResponse setRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.SetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException;
}
