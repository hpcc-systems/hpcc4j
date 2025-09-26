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
import org.hpccsystems.ws.client.utils.HpccContainerizedUnsupportedException;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpGroup;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.ArrayOfTpDropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.ArrayOfTpGroupWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.ArrayOfTpLogicalClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.ArrayOfTpTargetClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpClusterInfoResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpDropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpGroupQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpGroupWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpLogicalClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpMachineWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpServicesWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpTargetClusterWrapper;

import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;

/**
 * Facilitates accessing HPCC Systems instance topology information.
 *
 * This client can be used for fetching topology information regarding the target HPCCSystem
 * of special interest are the cluster groups, and the target clusters within those groups.
 *
 * NOTE: Many WsTopology methods are not supported on Containerized HPCC deployments.
 * The following methods are not supported in containerized HPCC:
 *  TpServiceQuery: support the System Servers page on ECLWatch.
 *  TpClusterQuery: support the Cluster Processes page on ECLWatch.
 *  TpMachineQuery: support the Cluster Details page on ECLWatch Cluster Processes page.
 *  TpTargetClusterQuery: support the Target Clusters page on ECLWatch. (based on Software/Topology/Cluster in environment xml)
 *  TpListTargetClusters: report the names and types of the Target Clusters (based on Software/Topology/Cluster in environment xml)
 *  TpClusterInfo: report thor queues and ecl workunits in the queues. (based on /Status/Servers)
 *  TpThorStatus: report thor server information and ecl workunits in the queues. (based on /Status/Servers – thorname not in for cloud)
 *  TpMachineInfo: report computer information from Hardware/Computer in environment xml.
 *  TpSwapNode: swap nodes
 *  TpGetComponentFile: support the configuration pages and log pages on ECLWatch Operation pages.
 *  SystemLog: download component ** log file from ECLWatch Operation pages.
 *  TpLogFile and TpLogFileDisplay: return a part or whole content of a log file.
 *  TpXMLFile: report thor data in /Status/Servers/Server (thorname not in for cloud).
 */
public class HPCCWsTopologyClient extends BaseHPCCWsClient
{
    private static final Logger log                = LogManager.getLogger(HPCCWsTopologyClient.class);

    /** Constant <code>WSTOPOLOGYWSDLURI="/WsTopology"</code> */
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
    public String getServiceURI()
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
        initBaseWsClient(connection, true); //Preemptively fetch HPCC build version, Containerized mode
        try
        {
            stub = setStubOptions(new WsTopologyStub(connection.getBaseUrl() + WSTOPOLOGYWSDLURI), connection);
        }
        catch (AxisFault e)
        {
            String hostname = (connection != null && connection.getHost() != null) ? connection.getHost() : "unknown";
            initErrMessage = "Could not initialize WsTopologyStub - Review all HPCC connection values (host: " + hostname + ")";
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage += "\n" + e.getLocalizedMessage();
            }
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);
    }

    static public enum TopologyGroupQueryKind
    {
        PLANE,
        HTHOR,
        THOR,
        ROXIE;

        public String getText() throws Exception
        {
            switch (this)
            {
            case PLANE:
                return "Plane";
            case HTHOR:
                return "hthor";
            case THOR:
                return "Thor";
            case ROXIE:
                return "Roxie";
            default:
                throw new Exception("Unknown TopologyGroupQueryKind");
            }
        }
    }

    /**
     * Fetch HPCC Topology Groups - assumes Containerized Plane filter (data storage planes in containerized mode)
     *
     * @return list of wrapped groups object
     * @throws HpccContainerizedUnsupportedException if targeting baremetal HPCC environment
     * @throws Exception if error encountered
     */
    public List<TpGroupWrapper> getTopologyGroups() throws HpccContainerizedUnsupportedException, Exception
    {
        if (!isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("getDataStoragePlanes(): Only supported in CONTAINERIZED mode");

        return getTopologyGroups(TopologyGroupQueryKind.PLANE.getText());
    }

    /**
     * Fetch HPCC Topology Groups (data storage planes in containerized mode)
     *
     * @param kind enumerated options
     * @return list of wrapped groups object
     * @throws HpccContainerizedUnsupportedException if kind not provided while targeting baremetal HPCC environment
     * @throws Exception if error encountered
     */
    public List<TpGroupWrapper> getTopologyGroups(TopologyGroupQueryKind kind) throws HpccContainerizedUnsupportedException, Exception
    {
        return getTopologyGroups(kind.getText());
    }

    /**
     * Fetch HPCC Topology Groups (data storage planes in containerized mode)
     *
     * @param kind - Storage plane kind filter.
     *               Ignored in Containerized mode 'Plane'.
     *               Baremetal options: 'hthor', 'Thor', or 'Roxie'.
     * @return list of wrapped groups object
     * @throws HpccContainerizedUnsupportedException if kind not provided while targeting baremetal HPCC environment
     * @throws Exception if error encountered
     */
    @WithSpan
    public List<TpGroupWrapper> getTopologyGroups(@SpanAttribute String kind) throws HpccContainerizedUnsupportedException, Exception
    {
        if (kind == null || kind.isEmpty())
        {
            if (!isTargetHPCCContainerized())
                throw new HpccContainerizedUnsupportedException("getTopologyGroups(kind): 'kind' must be provided when targeting non-containerized HPCC");
        }

        verifyStub(); // Throws exception if stub failed

        TpGroupQueryRequest request = new TpGroupQueryRequest();

        request.setKind(kind);

        TpGroupQueryResponse response = null;

        try
        {
            response = ((WsTopologyStub) stub).tpGroupQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsTopologyClient.getTopologyGroups(kind) encountered RemoteException for topology kind " + kind, e);
        }

        if (response == null)
            throw new Exception("HPCCWsTopologyClient.getTopologyGroups(kind) encountered null response.");

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not fetch Topology Groups.");

        ArrayOfTpGroup arrayOfTpGroup = response.getTpGroups();
        if (arrayOfTpGroup != null)
        {
            ArrayOfTpGroupWrapper arrayOfGroupWrapper = new ArrayOfTpGroupWrapper(arrayOfTpGroup);
            if (arrayOfGroupWrapper != null)
                return arrayOfGroupWrapper.getTpGroup();
        }

        return null;
    }

    /**
     * prints available target cluster names to given print stream.
     *
     * @param stream
     *            - Stream to print onto (System.out | System.err)
     * @return - Boolean, success
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public boolean printValidTargetClusters(PrintStream stream) throws Exception, ArrayOfEspExceptionWrapper
    {
        boolean success = false;

        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("printValidTargetClusters: WsTopology.TpTargetClusterQuery not supported in CONTAINERIZED mode");

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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public String[] getValidTargetGroupNames() throws Exception, ArrayOfEspExceptionWrapper
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("getValidTargetGroupNames: WsTopology.TpTargetClusterQuery not supported in CONTAINERIZED mode");

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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public List<TpDropZoneWrapper> queryDropzones(@SpanAttribute String namefilter) throws Exception, ArrayOfEspExceptionWrapper
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
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
    @WithSpan
    private String[] extractClusterNames(@SpanAttribute String clusterGroupType, @SpanAttribute boolean targetClusterNamesOnly) throws Exception
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
     * @throws java.lang.Exception
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public TpServicesWrapper getServices() throws Exception, ArrayOfEspExceptionWrapper
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("WsTopology.tpServiceQuery not supported in CONTAINERIZED mode");

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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public TpClusterInfoResponseWrapper getClusterInfo(@SpanAttribute String clusterName) throws Exception, ArrayOfEspExceptionWrapper
    {
        if (isTargetHPCCContainerized())
            throw new HpccContainerizedUnsupportedException("getClusterInfo: WsTopology.tpClusterInfo() not supported in CONTAINERIZED mode");

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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
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
     * @throws java.lang.Exception
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
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    /** {@inheritDoc} */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsTopologyStub();
    }
}
