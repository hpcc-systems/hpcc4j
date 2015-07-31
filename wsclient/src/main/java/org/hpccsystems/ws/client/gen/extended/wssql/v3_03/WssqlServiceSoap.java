/**
 * WssqlServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_03;

public interface WssqlServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.CreateTableAndLoadResponse createTableAndLoad(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.CreateTableAndLoadRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetRelatedIndexesResponse getRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.SetRelatedIndexesResponse setRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.SetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException;
}
