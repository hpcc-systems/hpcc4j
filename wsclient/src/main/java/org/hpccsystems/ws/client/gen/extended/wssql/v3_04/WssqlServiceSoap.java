/**
 * WssqlServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_04;

public interface WssqlServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.CreateTableAndLoadResponse createTableAndLoad(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.CreateTableAndLoadRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetRelatedIndexesResponse getRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.SetRelatedIndexesResponse setRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.SetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ArrayOfEspException;
}
