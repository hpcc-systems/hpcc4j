package org.hpccsystems.ws.client;

import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.EspException;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterInfoRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterInfoResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZone;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZoneQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZoneQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogicalCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogicalClusterQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogicalClusterQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachine;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpServiceQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpServiceQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpServices;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpTargetCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyLocator;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyServiceSoap;
import org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

/**
* Use as soap client for HPCC WsTopology web service.
* This client can be used for fetching topology information regarding the target HPCCSystem
* of special interest are the cluster groups, and the target clusters within those groups.
*
*/
public class HPCCWsTopologyClient extends DataSingleton
{
    private static final Logger         log = Logger.getLogger(HPCCWsTopologyClient.class.getName());
    private static URL                  originalURL;

    public static URL getOriginalURL() throws MalformedURLException
    {
        if (originalURL == null)
            originalURL = new URL(getOriginalWSDLURL());

        return originalURL;
    }

    public static int getOriginalPort() throws MalformedURLException
    {
        return getOriginalURL().getPort();
    }

    public static HPCCWsTopologyClient get(Connection connection)
    {
        return new HPCCWsTopologyClient(connection);
    }

    public static final String WSTOPOLOGYWSDLURI     = "/WsTopology/TpTargetClusterQuery";
    private WsTopologyServiceSoapProxy wsTopologyServiceSoapProxy    =  null;
    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsFileIOClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCWsFileIOClient
     * @throws Exception if wsTopologyServiceSoapProxy not available.
     */
    public WsTopologyServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsTopologyServiceSoapProxy != null)
            return wsTopologyServiceSoapProxy;
        else
            throw new Exception("wsTopologyServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new WsTopologyLocator()).getWsTopologyServiceSoapAddress();
    }

    protected HPCCWsTopologyClient(WsTopologyServiceSoapProxy wsTopologyServiceSoapProxy)
    {
        this.wsTopologyServiceSoapProxy = wsTopologyServiceSoapProxy;
    }

    protected HPCCWsTopologyClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    protected HPCCWsTopologyClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSTOPOLOGYWSDLURI);
        initWsTopologySoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWsTopologySoapProxy(String baseURL, String user, String pass)
    {
        wsTopologyServiceSoapProxy = new WsTopologyServiceSoapProxy(baseURL);

        if (wsTopologyServiceSoapProxy != null)
        {
                WsTopologyServiceSoap wsTopologyServiceSoap = wsTopologyServiceSoapProxy.getWsTopologyServiceSoap();
                if (user != null && pass != null)
                    Connection.initStub((Stub) wsTopologyServiceSoap, user, pass);
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

        getSoapProxy();
        
        TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
        tptargetclusterparams.setType("ROOT");
        tptargetclusterparams.setShowDetails(false);

        try
        {
            TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

            if (targetClusterQueryResponse.getExceptions() != null)
            {
                //something went wrong
                log.error("Could Not fetch target groups.");
            }
            else
            {
                TpTargetCluster[] tpTargetClusters = targetClusterQueryResponse.getTpTargetClusters();
                for (TpTargetCluster tptargetcluster : tpTargetClusters)
                {
                    TpCluster[] tpClusters = tptargetcluster.getTpClusters();
                    if (tpClusters != null )
                    {
                        for (TpCluster tpcluster : tpClusters)
                        {
                            stream.println(" TPCluster Name: " + tpcluster.getName());
                        }
                    }
                }
            }
            success = true;
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
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
        TpTargetCluster[] tpTargetClusters = null;

        getSoapProxy();

        TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
        tptargetclusterparams.setType("ROOT");
        tptargetclusterparams.setShowDetails(false);

        try
        {
            TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

            if (targetClusterQueryResponse.getExceptions() != null)
            {
                //something went wrong
                log.error("Could Not fetch target groups.");
            }
            else
            {
                tpTargetClusters = targetClusterQueryResponse.getTpTargetClusters();
            }
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
        }
    
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

        getSoapProxy();

        TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
        tptargetclusterparams.setType("ROOT");
        tptargetclusterparams.setShowDetails(false);

        try
        {
            TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

            if (targetClusterQueryResponse.getExceptions() != null)
            {
                //something went wrong
                log.error("Could Not fetch target groups.");
            }
            else
            {
                TpTargetCluster[] tpTargetClusters = targetClusterQueryResponse.getTpTargetClusters();
                tpTargetClusterNames = new String [tpTargetClusters.length];

                for (int i = 0; i < tpTargetClusters.length; i++)
                {
                    tpTargetClusterNames[i] = tpTargetClusters[i].getName();
                }
            }
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
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
         getSoapProxy();

         TpDropZoneQueryResponse resp = wsTopologyServiceSoapProxy.tpDropZoneQuery(new TpDropZoneQueryRequest(namefilter, false));
         ArrayOfEspException exceptions = resp.getExceptions();
         if (exceptions != null)
         {
             for (EspException espexception : exceptions.getException())
             {
                 throw new Exception("Error fetching dropzone info: " + espexception.getSource() + espexception.getMessage());
             }
         }

         return resp.getTpDropZones();
    }

    public TpMachine[] queryDropzoneMachines(String name) throws Exception
    {
        return queryDropzone(name).getTpMachines();
    }

    /**
     * Get the names of all available target clusters from a given cluster group (hthor, thor, roxie, etc)
     * @param clusterGroupType
     * @return
     * @throws Exception
     */
    public String[] getValidTargetClusterNames(String clusterGroupType) throws Exception
    {
        String[] tpTargetClusterNames = null;

        getSoapProxy();
    
        TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
        tptargetclusterparams.setType("ROOT");
        tptargetclusterparams.setShowDetails(false);

        try
        {
            TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

            if (targetClusterQueryResponse.getExceptions() != null)
            {
                //something went wrong
                log.error("Could Not fetch target groups.");
            }
            else
            {
                TpTargetCluster[] tpTargetClusters = targetClusterQueryResponse.getTpTargetClusters();

                for (int i = 0; i < tpTargetClusters.length; i++)
                {
                    if (clusterGroupType.equalsIgnoreCase(tpTargetClusters[i].getName()) )
                    {
                        TpCluster[] tpClusters = tpTargetClusters[i].getTpClusters();
                        if (tpClusters != null )
                        {
                            tpTargetClusterNames = new String[tpClusters.length];
                            for (int k = 0; k < tpClusters.length; k++)
                            {
                                tpTargetClusterNames[k] = tpClusters[k].getName();
                            }
                        }
                        break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
        }

        return tpTargetClusterNames;
    }

    /**
     * Get the names of all available target clusters (mythor, myroxie, etc.) from all cluster groups (hthor, thor, roxie, etc)
     * @return
     * @throws Exception
     */
    public List<String> getValidTargetClusterNames() throws Exception
    {
        List<String> clusternames = new ArrayList<String>();
        
        getSoapProxy();

        TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
        tptargetclusterparams.setType("ROOT");
        tptargetclusterparams.setShowDetails(false);

        try
        {
            TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

            if (targetClusterQueryResponse.getExceptions() != null)
            {
                //something went wrong
                log.error("Could Not fetch target groups.");
            }
            else
            {
                TpTargetCluster[] tpTargetClusters = targetClusterQueryResponse.getTpTargetClusters();
                for (TpTargetCluster tptargetcluster : tpTargetClusters)
                {
                    TpCluster[] tpClusters = tptargetcluster.getTpClusters();
                    if (tpClusters != null )
                    {
                        for (TpCluster tpcluster : tpClusters)
                        {
                            clusternames.add(tpcluster.getName());
                        }
                    }
                }
            }
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
        }
        return clusternames;
    }

    public TpServices  getServices() throws Exception
    {
        getSoapProxy();

        TpServices  tpservices= null;
        if (wsTopologyServiceSoapProxy != null)
        {
            TpServiceQueryRequest request = new TpServiceQueryRequest();
            request.setType("ALLSERVICES"); //$NON-NLS-1$

            TpServiceQueryResponse response = wsTopologyServiceSoapProxy.tpServiceQuery(request);
            if (response != null & response.getExceptions() == null )
                tpservices = response.getServiceList();
        }

        return tpservices;
    }

    public TpClusterInfoResponse getClusterInfo(String clusterName) throws Exception
    {
        TpClusterInfoResponse respsone = null;
        
        getSoapProxy();
        
        TpClusterInfoRequest request = new TpClusterInfoRequest();
        request.setName(clusterName);
        respsone = wsTopologyServiceSoapProxy.tpClusterInfo(request);

        return respsone;
    }

    public TpLogicalCluster[] getLogicalClusters() throws Exception
    {
        getSoapProxy();

        TpLogicalCluster[] tplogclusters = null;

        TpLogicalClusterQueryRequest request = new TpLogicalClusterQueryRequest();
        TpLogicalClusterQueryResponse response = wsTopologyServiceSoapProxy.tpLogicalClusterQuery(request);
        if (response != null)
            tplogclusters = response.getTpLogicalClusters();

        return tplogclusters;
    }

    @Override
    protected boolean isComplete()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void fastRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    protected void fullRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof HPCCWsTopologyClient))
        {
            return false;
        }

        HPCCWsTopologyClient that = (HPCCWsTopologyClient) aThat;
        WsTopologyServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsTopologyServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) wsTopologyServiceSoapProxy.getWsTopologyServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getWsTopologyServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) wsTopologyServiceSoapProxy.getWsTopologyServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getWsTopologyServiceSoap()).getPassword());

    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsTopologyServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  wsTopologyServiceSoapProxy.getWsTopologyServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  wsTopologyServiceSoapProxy.getWsTopologyServiceSoap()).getPassword());
        return result;
    }
}
