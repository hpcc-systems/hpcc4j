package org.hpccsystems.ws.client;

import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpTargetCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZoneQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZoneQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpServiceQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpServiceQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpTargetCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.WsTopologyPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.WsTopologyStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.ArrayOfTpDropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.ArrayOfTpLogicalClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.ArrayOfTpTargetClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpClusterInfoResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpDropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpLogicalClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpMachineWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpServicesWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpTargetClusterWrapper;

/**
 * Use as soap client for HPCC WsTopology web service.
 * This client can be used for fetching topology information regarding the target HPCCSystem
 * of special interest are the cluster groups, and the target clusters within those groups.
 *
 */
public class HPCCWsTopologyClient extends BaseHPCCWsClient
{
    private static final Logger log                = LogManager.getLogger(HPCCWsTopologyClient.class);
    // public static final String WSTOPOLOGYWSDLURI = "/WsTopology/TpTargetClusterQuery";
    public static final String  WSTOPOLOGYWSDLURI  = "/WsTopology";

    private static int          DEFAULTSERVICEPORT = -1;
    private static String       WSDLURL            = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsTopologyStub());
            DEFAULTSERVICEPORT = (new URL(WSDLURL)).getPort();
        }
        catch (AxisFault | MalformedURLException e)
        {
            log.error("Unable to establish original WSDL URL");
            log.error(e.getLocalizedMessage());
        }
    }

    /**
     * Gets the service URI.
     *
     * @return the service URI
     */
    public static String getServiceURI()
    {
        return WSTOPOLOGYWSDLURI;
    }

    /**
     * Gets the service WSDLURL.
     *
     * @return the service WSDLURL
     */
    public static String getServiceWSDLURL()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return WSDLURL;
    }

    /**
     * Gets the service WSDL port.
     *
     * @return the service WSDL port
     */
    public static int getServiceWSDLPort()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return DEFAULTSERVICEPORT;
    }

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC ws topology client
     */
    public static HPCCWsTopologyClient get(Connection connection)
    {
        return new HPCCWsTopologyClient(connection);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @return the HPCC ws topology client
     */
    public static HPCCWsTopologyClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsTopologyClient(conn);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @param timeout
     *            the timeout
     * @return the HPCC ws topology client
     */
    public static HPCCWsTopologyClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsTopologyClient(conn);
    }

    /**
     * Instantiates a new HPCC ws topology client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsTopologyClient(Connection baseConnection)
    {
        initWsTopologyStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param connection
     *            the connection
     */
    private void initWsTopologyStub(Connection connection)
    {
        try
        {
            stub = setStubOptions(new WsTopologyStub(connection.getBaseUrl() + WSTOPOLOGYWSDLURI), connection);
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
     * prints available target cluster names to given print stream.
     *
     * @param stream
     *            - Stream to print onto (System.out | System.err)
     * @return - Boolean, success
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean printValidTargetClusters(PrintStream stream) throws Exception, ArrayOfEspExceptionWrapper
    {
        boolean success = false;

        verifyStub(); // Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.printValidTargetClusters(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target groups.");

        ArrayOfTpTargetCluster arrayOfTpTargetCluster = response.getTpTargetClusters();
        if (arrayOfTpTargetCluster != null)
        {
            TpTargetCluster[] tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();

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
     * Get full descriptions of all valid cluster groups on the target HPCC System.
     *
     * @return the valid target groups
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<TpTargetClusterWrapper> getValidTargetGroups() throws Exception, ArrayOfEspExceptionWrapper
    {
        List<TpTargetClusterWrapper> tpTargetClusters = null;

        verifyStub(); // Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.getValidTargetGroups(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target groups.");

        ArrayOfTpTargetClusterWrapper arrayOfTpTargetCluster = new ArrayOfTpTargetClusterWrapper(response.getTpTargetClusters());

        if (arrayOfTpTargetCluster != null) tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();

        return tpTargetClusters;
    }

    /**
     * Get names of all available target clusters on the given HPCC System.
     *
     * @return the valid target group names
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String[] getValidTargetGroupNames() throws Exception, ArrayOfEspExceptionWrapper
    {
        String[] tpTargetClusterNames = null;

        verifyStub(); // Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.getValidTargetGroupNames(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target groups.");
        ArrayOfTpTargetCluster arrayOfTpTargetCluster = response.getTpTargetClusters();

        TpTargetCluster[] tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();
        tpTargetClusterNames = new String[tpTargetClusters.length];

        for (int i = 0; i < tpTargetClusters.length; i++)
        {
            tpTargetClusterNames[i] = tpTargetClusters[i].getName();
        }

        return tpTargetClusterNames;
    }

    /**
     * Query dropzone.
     *
     * @param name
     *            - The target dropzone name
     * @return the tp drop zone wrapper
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public TpDropZoneWrapper queryDropzone(String name) throws Exception, ArrayOfEspExceptionWrapper
    {
        List<TpDropZoneWrapper> dropZones = queryDropzones(name);
        if (dropZones.size() != 1) throw new Exception("Could not query Dropzone: '" + name + "'");

        return dropZones.get(0);
    }

    /**
     * Query dropzones.
     *
     * @param namefilter
     *            - Empty for all dropzones, or specific dropzeon name
     * @return the list
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<TpDropZoneWrapper> queryDropzones(String namefilter) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        TpDropZoneQueryRequest request = new TpDropZoneQueryRequest();

        request.setName(namefilter);

        TpDropZoneQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpDropZoneQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.queryDropzones(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Error fetching dropzone info");

        ArrayOfTpDropZoneWrapper arrayoftpdz = new ArrayOfTpDropZoneWrapper(response.getTpDropZones());

        return arrayoftpdz.getTpDropZone();
    }

    /**
     * Query dropzone machines.
     *
     * @param name
     *            the name
     * @return the list
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<TpMachineWrapper> queryDropzoneMachines(String name) throws Exception, ArrayOfEspExceptionWrapper
    {
        return queryDropzone(name).getTpMachines().getTpMachine();
    }

    /**
     * Extract cluster names.
     *
     * @param clusterGroupType
     *            the cluster group type
     * @param targetClusterNamesOnly
     *            the target cluster names only
     * @return the string[]
     * @throws Exception
     *             the exception
     */
    private String[] extractClusterNames(String clusterGroupType, boolean targetClusterNamesOnly) throws Exception
    {
        List<String> tpClusterNames = new ArrayList<String>();

        verifyStub(); // Throws exception if stub failed

        TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();

        request.setType("ROOT");
        request.setShowDetails(false);

        TpTargetClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpTargetClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.getValidClusterNames(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch valid cluster names.");

        ArrayOfTpTargetCluster arrayOfTpTargetCluster = response.getTpTargetClusters();

        if (arrayOfTpTargetCluster != null)
        {
            TpTargetCluster[] tpTargetClusters = arrayOfTpTargetCluster.getTpTargetCluster();

            for (int i = 0; i < tpTargetClusters.length; i++)
            {
                if (clusterGroupType == null || clusterGroupType.isEmpty()
                        || tpTargetClusters[i].getType().equalsIgnoreCase(clusterGroupType + "cluster")) // type == HoleCluster | ThorCluster , etc.
                {
                    ArrayOfTpCluster arrayOfTpCluster = tpTargetClusters[i].getTpClusters();
                    if (arrayOfTpCluster != null)
                    {
                        TpCluster[] tpClusters = arrayOfTpCluster.getTpCluster();
                        if (tpClusters != null)
                        {
                            for (int k = 0; k < tpClusters.length; k++)
                            {
                                if (clusterGroupType == null || clusterGroupType.isEmpty()
                                        || tpClusters[k].getType().equalsIgnoreCase(clusterGroupType + "cluster"))
                                {
                                    if (targetClusterNamesOnly)
                                    {
                                        if (!tpClusterNames.contains(tpTargetClusters[i].getName()))
                                            tpClusterNames.add(tpTargetClusters[i].getName());
                                    }
                                    else
                                    {
                                        if (!tpClusterNames.contains(tpClusters[k].getName())) tpClusterNames.add(tpClusters[k].getName());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return tpClusterNames.toArray(new String[0]);
    }

    /**
     * Gets the valid cluster names.
     *
     * @param clusterGroupType
     *            the cluster group type
     * @return the valid cluster names
     * @throws Exception
     *             the exception
     */
    public String[] getValidClusterNames(String clusterGroupType) throws Exception
    {
        return extractClusterNames(clusterGroupType, false);
    }

    /**
     * Get the names of all available target clusters from a given cluster group (hthor, thor, roxie, Hole, etc).
     *
     * @param clusterGroupType
     *            -- RoxieCluster, HoleCluster
     * @return the valid target cluster names
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String[] getValidTargetClusterNames(String clusterGroupType) throws Exception, ArrayOfEspExceptionWrapper
    {
        return extractClusterNames(clusterGroupType, true);
    }

    /**
     * Get the names of all available target clusters (mythor, myroxie, etc.) from all cluster groups (hthor, thor, roxie, etc)
     *
     * @return the valid target cluster names array
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String[] getValidTargetClusterNamesArray() throws Exception, ArrayOfEspExceptionWrapper
    {
        return getValidTargetClusterNames("");
    }

    /**
     * Get the names of all available target clusters (mythor, myroxie, etc.) from all cluster groups (hthor, thor, roxie, etc)
     *
     * @return the valid target cluster names
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<String> getValidTargetClusterNames() throws Exception, ArrayOfEspExceptionWrapper
    {
        List<String> names = new ArrayList<String>();
        String[] validTargetClusterNames = getValidTargetClusterNamesArray();
        for (int i = 0; i < validTargetClusterNames.length; i++)
        {
            names.add(validTargetClusterNames[i]);
        }
        return names;
    }

    /**
     * Gets the services.
     *
     * @return the services
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public TpServicesWrapper getServices() throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        TpServiceQueryRequest request = new TpServiceQueryRequest();

        request.setType("ALLSERVICES");

        TpServiceQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpServiceQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.getServices(...) encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch target services.");

        return new TpServicesWrapper(response.getServiceList());
    }

    /**
     * Gets the cluster info.
     *
     * @param clusterName
     *            the cluster name
     * @return the cluster info
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public TpClusterInfoResponseWrapper getClusterInfo(String clusterName) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        TpClusterInfoRequest request = new TpClusterInfoRequest();

        request.setName(clusterName);

        TpClusterInfoResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpClusterInfo(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.getClusterInfo(" + clusterName + ") encountered RemoteException.", e);
        }

        if (response.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()),
                "Could not get getClusterInfo for cluster: '" + clusterName + "'");

        return new TpClusterInfoResponseWrapper(response);
    }

    /**
     * Gets the logical clusters.
     *
     * @return the logical clusters
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<TpLogicalClusterWrapper> getLogicalClusters() throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        List<TpLogicalClusterWrapper> tplogclusters = null;
        TpLogicalClusterQueryRequest request = new TpLogicalClusterQueryRequest();

        TpLogicalClusterQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpLogicalClusterQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.getLogicalClusters() encountered RemoteException.", e);
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not get getLogicalClusters");

        ArrayOfTpLogicalClusterWrapper tpLogicalClusters = new ArrayOfTpLogicalClusterWrapper(response.getTpLogicalClusters());
        if (tpLogicalClusters != null) tplogclusters = tpLogicalClusters.getTpLogicalCluster();

        return tplogclusters;
    }

    /**
     * Ping.
     *
     * @return true, if successful
     * @throws Exception
     *             the exception
     */
    public boolean ping() throws Exception
    {
        verifyStub();

        WsTopologyPingRequest request = new WsTopologyPingRequest();

        try
        {
            ((WsTopologyStub) stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsTopologyStub();
    }
}
