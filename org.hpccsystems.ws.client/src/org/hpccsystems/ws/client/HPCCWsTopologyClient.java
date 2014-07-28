package org.hpccsystems.ws.client;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.soap.wsfileio.WsFileIOServiceSoapProxy;
import org.hpccsystems.ws.client.soap.wstopology.TpCluster;
import org.hpccsystems.ws.client.soap.wstopology.TpTargetCluster;
import org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.client.soap.wstopology.WsTopologyServiceSoap;
import org.hpccsystems.ws.client.soap.wstopology.WsTopologyServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;

/**
* Use as soap client for HPCC WsTopology web service.
* This client can be used for fetching topology information regarding the target HPCCSystem
* of special interest are the cluster groups, and the target clusters within those groups.
*
*/
public class HPCCWsTopologyClient
{
    public static final String WSTOPOLOGYWSDLURI     = "/WsTopology/TpTargetClusterQuery";
    private WsTopologyServiceSoapProxy wsTopologyServiceSoapProxy    =  null;
    private boolean verbosemode = false;

    public WsTopologyServiceSoapProxy getSoapProxy()
    {
        return wsTopologyServiceSoapProxy;
    }

    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.soap.wstopology.WsTopologyLocator()).getWsTopologyServiceSoapAddress();
    }

    public HPCCWsTopologyClient(WsTopologyServiceSoapProxy wsTopologyServiceSoapProxy)
    {
        this.wsTopologyServiceSoapProxy = wsTopologyServiceSoapProxy;
    }

    public HPCCWsTopologyClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    public HPCCWsTopologyClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSTOPOLOGYWSDLURI);
        initWsTopologySoapProxy(address, user, pass);
    }

    public void initWsTopologySoapProxy(String baseURL, String user, String pass)
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
}
