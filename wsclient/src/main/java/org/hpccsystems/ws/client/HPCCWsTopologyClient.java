package org.hpccsystems.ws.client;

import java.io.PrintStream;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDropZone;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpLogicalCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpTargetCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZone;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZoneQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZoneQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpServiceQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpServiceQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpServices;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpTargetCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.WsTopologyPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.WsTopologyStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;

/**
* Use as soap client for HPCC WsTopology web service.
* This client can be used for fetching topology information regarding the target HPCCSystem
* of special interest are the cluster groups, and the target clusters within those groups.
*
*/
public class HPCCWsTopologyClient extends BaseHPCCWsClient
{
    private static final Logger log                   = Logger.getLogger(HPCCWsTopologyClient.class.getName());
    //public  static final String WSTOPOLOGYWSDLURI     = "/WsTopology/TpTargetClusterQuery";
    public  static final String WSTOPOLOGYWSDLURI     = "/WsTopology";

    public static HPCCWsTopologyClient get(Connection connection)
    {
        return new HPCCWsTopologyClient(connection);
    }

    public static HPCCWsTopologyClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsTopologyClient(conn);
    }

    public static HPCCWsTopologyClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsTopologyClient(conn);
    }

    protected HPCCWsTopologyClient(Connection baseConnection)
    {
        initWsTopologyStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWsTopologyStub(Connection connection)
    {
        try
        {
            stub = setStubOptions(new WsTopologyStub(connection.getBaseUrl()+WSTOPOLOGYWSDLURI),connection);
        }
        catch (AxisFault e)
        {
            log.error("Could not initialize WsTopologyStub - Review all HPCC connection values");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            log.error("Could not initialize WsTopologyStub - Review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error(e.getLocalizedMessage());
            }
        }
    }

    /**
     * prints available target cluster names to given print stream
     * @param stream       - Stream to print onto (System.out | System.err)
     * @return               - Boolean, success
     * @throws Exception
     */
    public boolean printValidTargetClusters(PrintStream stream) throws Exception
    {
        boolean success = false;

        verifyStub(); //Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.printValidTargetClusters(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target groups.");

        ArrayOfTpTargetCluster arrayOfTpTargetCluster = response.getTpTargetClusters();
        if (arrayOfTpTargetCluster != null)
        {
            TpTargetCluster [] tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();

            for (TpTargetCluster tptargetcluster : tpTargetClusters)
            {
                ArrayOfTpCluster tpClusters = tptargetcluster.getTpClusters();
                if (tpClusters != null)
                {
                    for (TpCluster tpcluster : tpClusters.getTpCluster())
                    {
                        stream.println(" TPCluster Name: " + tpcluster.getName());
                    }
                }
            }
            success = true;
        }
        return success;
    }

    /**
     * Get full descriptions of all valid cluster groups on the target HPCC System
     * @return
     * @throws Exception
     */
    public TpTargetCluster[] getValidTargetGroups() throws Exception
    {
        TpTargetCluster [] tpTargetClusters = null;

        verifyStub(); //Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.getValidTargetGroups(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target groups.");

        ArrayOfTpTargetCluster arrayOfTpTargetCluster = response.getTpTargetClusters();

        if (arrayOfTpTargetCluster != null)
            tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();

        return tpTargetClusters;
    }

    /**
     * Get names of all available target clusters on the given HPCC System
     * @return
     * @throws Exception
     */
    public String[] getValidTargetGroupNames() throws Exception
    {
        String[] tpTargetClusterNames = null;

        verifyStub(); //Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.getValidTargetGroupNames(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target groups.");
        ArrayOfTpTargetCluster arrayOfTpTargetCluster = response.getTpTargetClusters();

        TpTargetCluster[] tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();
        tpTargetClusterNames = new String [tpTargetClusters.length];

        for (int i = 0; i < tpTargetClusters.length; i++)
        {
            tpTargetClusterNames[i] = tpTargetClusters[i].getName();
        }

        return tpTargetClusterNames;
    }

    /**
     * @param name - The target dropzone name
     * @return
     * @throws Exception
     */
    public TpDropZone queryDropzone(String name) throws Exception
    {
        TpDropZone[] dropZones = queryDropzones(name);
        if (dropZones.length != 1)
             throw new Exception ("Could not query Dropzone: '" + name + "'");
        return dropZones[0];
    }

    /**
     * @param namefilter - Empty for all dropzones, or specific dropzeon name
     * @return
     * @throws Exception
     */
    public TpDropZone[] queryDropzones(String namefilter) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        TpDropZoneQueryRequest request = new TpDropZoneQueryRequest();

        request.setName(namefilter);

        TpDropZoneQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpDropZoneQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.queryDropzones(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Error fetching dropzone info");

        ArrayOfTpDropZone arrayoftpdz = response.getTpDropZones();

         return arrayoftpdz.getTpDropZone();
    }

    public TpMachine[] queryDropzoneMachines(String name) throws Exception
    {
        return queryDropzone(name).getTpMachines().getTpMachine();
    }

    /**
     * Get the names of all available target clusters from a given cluster group (hthor, thor, roxie, Hole,  etc)
     * @param clusterGroupType -- RoxieCluster, HoleCluster
     * @return
     * @throws Exception
     */
    public String[] getValidTargetClusterNames(String clusterGroupType) throws Exception
    {
        List<String> tpTargetClusterNames = new ArrayList<String>();

        verifyStub(); //Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.getValidTargetGroupNames(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target groups.");

        ArrayOfTpTargetCluster arrayOfTpTargetCluster = response.getTpTargetClusters();

        if (arrayOfTpTargetCluster != null)
        {
            TpTargetCluster[] tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();

            for (int i = 0; i < tpTargetClusters.length; i++)
            {
                if (clusterGroupType == null || clusterGroupType.isEmpty() || tpTargetClusters[i].getType().equalsIgnoreCase(clusterGroupType+"cluster" )) //type == HoleCluster | ThorCluster , etc.
                {
                    ArrayOfTpCluster arrayOfTpCluster = tpTargetClusters[i].getTpClusters();
                    if (arrayOfTpCluster != null)
                    {
                        TpCluster[] tpClusters = arrayOfTpCluster.getTpCluster();
                        if (tpClusters != null )
                        {
                            for (int k = 0; k < tpClusters.length; k++)
                            {
                                if (clusterGroupType == null || clusterGroupType.isEmpty() || tpClusters[k].getType().equalsIgnoreCase(clusterGroupType+"cluster" ))
                                {
                                    if (!tpTargetClusterNames.contains(tpClusters[k].getName()))
                                        tpTargetClusterNames.add(tpClusters[k].getName());
                                }
                            }
                        }
                    }
                }
            }
        }

        return tpTargetClusterNames.toArray(new String [0]);
    }


    /**
     * Get the names of all available target clusters (mythor, myroxie, etc.) from all cluster groups (hthor, thor, roxie, etc)
     * @return
     * @throws Exception
     */
    public String [] getValidTargetClusterNamesArray() throws Exception
    {
        return getValidTargetClusterNames("");
    }

    /**
     * Get the names of all available target clusters (mythor, myroxie, etc.) from all cluster groups (hthor, thor, roxie, etc)
     * @return
     * @throws Exception
     */
    public List<String> getValidTargetClusterNames() throws Exception
    {
        List<String> names = new ArrayList<String>();
        String[] validTargetClusterNames = getValidTargetClusterNamesArray();
        for (int i = 0; i < validTargetClusterNames.length; i++)
        {
            names.add(validTargetClusterNames[i]);
        }
        return names;
    }

    public TpServices getServices() throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        TpServiceQueryRequest request = new TpServiceQueryRequest();

        request.setType("ALLSERVICES");

        TpServiceQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpServiceQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.getServices(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target services.");

        TpServices serviceList = response.getServiceList();

        return serviceList;
    }

    public TpClusterInfoResponse getClusterInfo(String clusterName) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        TpClusterInfoRequest request = new TpClusterInfoRequest();

        request.setName(clusterName);

        TpClusterInfoResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpClusterInfo(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.getClusterInfo("+clusterName+") encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not get getClusterInfo for cluster: '"+clusterName+"'");

        return response;
    }

    public TpLogicalCluster[] getLogicalClusters() throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        TpLogicalCluster[] tplogclusters = null;
        TpLogicalClusterQueryRequest request = new TpLogicalClusterQueryRequest();

        TpLogicalClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub)stub).tpLogicalClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsTopologyClient.getLogicalClusters() encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not get getLogicalClusters");

        ArrayOfTpLogicalCluster tpLogicalClusters = response.getTpLogicalClusters();
        if (tpLogicalClusters != null)
            tplogclusters = tpLogicalClusters.getTpLogicalCluster();

        return tplogclusters;
    }

    public boolean ping() throws Exception
    {
        verifyStub();

        WsTopologyPingRequest request = new WsTopologyPingRequest();

        try
        {
            ((WsTopologyStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }
}
