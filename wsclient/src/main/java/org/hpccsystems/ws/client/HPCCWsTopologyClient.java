package org.hpccsystems.ws.client;

import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpClusterInfoRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpClusterInfoResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogicalCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogicalClusterQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogicalClusterQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpServiceQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpServiceQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpServices;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpTargetCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.WsTopologyServiceSoap;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.WsTopologyServiceSoapProxy;
import org.hpccsystems.ws.client.platform.DataSingleton;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;

/**
* Use as soap client for HPCC WsTopology web service.
* This client can be used for fetching topology information regarding the target HPCCSystem
* of special interest are the cluster groups, and the target clusters within those groups.
*
*/
public class HPCCWsTopologyClient extends DataSingleton
{
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
        return (new org.hpccsystems.ws.client.gen.wstopology.v1_22.WsTopologyLocator()).getWsTopologyServiceSoapAddress();
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

        if (wsTopologyServiceSoapProxy == null)
            throw new Exception("wsTopologyServiceSoapProxy not available");

        if (wsTopologyServiceSoapProxy != null)
        {
            TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
            tptargetclusterparams.setType("ROOT");
            tptargetclusterparams.setShowDetails(false);

            try
            {
                TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

                if (targetClusterQueryResponse.getExceptions() != null)
                {
                    //something went wrong
                    Utils.println(System.out, "Could Not fetch target groups.", false, true);
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
                Utils.println(System.out, e.getLocalizedMessage(), false, true);
            }
        }
        else
        {
            Utils.println(System.out, "Could Not create WSTopology SOAP from WSDL", false, true);
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

        if (wsTopologyServiceSoapProxy == null)
            throw new Exception("wsTopologyServiceSoapProxy not available");

        if (wsTopologyServiceSoapProxy != null)
        {
            TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
            tptargetclusterparams.setType("ROOT");
            tptargetclusterparams.setShowDetails(false);

            try
            {
                TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

                if (targetClusterQueryResponse.getExceptions() != null)
                {
                    //something went wrong
                    Utils.println(System.out, "Could Not fetch target groups.", false, true);
                }
                else
                {
                    tpTargetClusters = targetClusterQueryResponse.getTpTargetClusters();
                }
            }
            catch (Exception e)
            {
                Utils.println(System.out, e.getLocalizedMessage(), false, true);
            }
        }
        else
        {
            Utils.println(System.out, "Could Not create WSTopology SOAP from WSDL", false, true);
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

        if (wsTopologyServiceSoapProxy == null)
            throw new Exception("wsTopologyServiceSoapProxy not available");

        if (wsTopologyServiceSoapProxy != null)
        {
            TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
            tptargetclusterparams.setType("ROOT");
            tptargetclusterparams.setShowDetails(false);

            try
            {
                TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

                if (targetClusterQueryResponse.getExceptions() != null)
                {
                    //something went wrong
                    Utils.println(System.out, "Could Not fetch target groups.", false, true);
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
                Utils.println(System.out, e.getLocalizedMessage(), false, true);
            }
        }
        else
        {
            Utils.println(System.out, "Could Not create WSTopology SOAP from WSDL", false, true);
        }
        return tpTargetClusterNames;
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

        if (wsTopologyServiceSoapProxy == null)
            throw new Exception("wsTopologyServiceSoapProxy not available");

        if (wsTopologyServiceSoapProxy != null)
        {
            TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
            tptargetclusterparams.setType("ROOT");
            tptargetclusterparams.setShowDetails(false);

            try
            {
                TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

                if (targetClusterQueryResponse.getExceptions() != null)
                {
                    //something went wrong
                    Utils.println(System.out, "Could Not fetch target groups.", false, true);
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
                Utils.println(System.out, e.getLocalizedMessage(), false, true);
            }
        }
        else
        {
            Utils.println(System.out, "Could Not create WSTopology SOAP from WSDL", false, true);
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
        if (wsTopologyServiceSoapProxy == null)
            throw new Exception("wsTopologyServiceSoapProxy not available");

        if (wsTopologyServiceSoapProxy != null)
        {
            TpTargetClusterQueryRequest tptargetclusterparams = new TpTargetClusterQueryRequest();
            tptargetclusterparams.setType("ROOT");
            tptargetclusterparams.setShowDetails(false);

            try
            {
                TpTargetClusterQueryResponse targetClusterQueryResponse = wsTopologyServiceSoapProxy.tpTargetClusterQuery(tptargetclusterparams);

                if (targetClusterQueryResponse.getExceptions() != null)
                {
                    //something went wrong
                    Utils.println(System.out, "Could Not fetch target groups.", false, true);
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
                Utils.println(System.out, e.getLocalizedMessage(), false, true);
            }
        }
        else
        {
            Utils.println(System.out, "Could Not create WSTopology SOAP from WSDL", false, true);
        }
        return clusternames;
    }

    public TpServices  getServices() throws Exception
    {
        if (wsTopologyServiceSoapProxy == null)
            throw new Exception("wsTopologyServiceSoapProxy not available");

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

    public TpClusterInfoResponse getClusterInfo(String clusterName) throws ArrayOfEspException, RemoteException
    {
        TpClusterInfoResponse respsone = null;
        if (wsTopologyServiceSoapProxy != null)
        {
            TpClusterInfoRequest request = new TpClusterInfoRequest();
            request.setName(clusterName);
            respsone = wsTopologyServiceSoapProxy.tpClusterInfo(request);

        }
        else
        {
            Utils.println(System.out, "Could Not create WSTopology SOAP from WSDL", false, true);
        }

        return respsone;
    }

    public TpLogicalCluster[] getLogicalClusters() throws Exception
    {
        if (wsTopologyServiceSoapProxy == null)
            throw new Exception("wsTopologyServiceSoapProxy not available");

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
