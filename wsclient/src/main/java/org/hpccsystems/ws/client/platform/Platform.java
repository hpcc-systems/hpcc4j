/*******************************************************************************
 * Copyright (c) 2014 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

import org.hpccsystems.ws.client.HPCCFileSprayClient;
import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsSMCClient;
import org.hpccsystems.ws.client.HPCCWsTopologyClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunit;
import org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitsResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFULogicalFile;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpDropZone;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpLogicalCluster;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpServices;
import org.hpccsystems.ws.client.gen.wstopology.v1_19.TpTargetCluster;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSourceFile;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySet;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

public class Platform extends DataSingleton
{
    public static final String API_ID = "org.hpccsystems.ws.client"; //$NON-NLS-1$

    public static DataSingletonCollection All = new DataSingletonCollection();

    public static Platform get(String protocol, String ip, int port, String user, String pass)
    {
        if (ip == null || ip.isEmpty())
        {
            return null;
        }

        return (Platform) All.get(new Platform(protocol, ip, port, user, pass));
    }

    public static Platform get(String address, String user, String pass)
    {
        if (address == null || address.isEmpty())
        {
            return null;
        }
        URL hpccUrl;
        try
        {
            hpccUrl = new URL(address);
        }
        catch (MalformedURLException e)
        {
           return null;
        }

        return (Platform) All.get(new Platform(hpccUrl, user, pass));
    }

    public static Platform getNoCreate(String protocol, String ip, int port, String user, String pass)
    {
        if (ip == null || ip.isEmpty())
        {
            return null;
        }

        return (Platform) All.getNoCreate(new Platform(protocol, ip, port, user, pass));
    }

    public static void remove(Platform p)
    {
        All.remove(p);
    }

    public static final String  P_DISABLED            = "disabledConfig";      //$NON-NLS-1$
    public static final String  P_SSL                 = "sslConfig";           //$NON-NLS-1$
    public static final boolean P_SSL_DEFAULT         = false;
    public static final String  P_IP                  = "ipLaunchConfig";      //$NON-NLS-1$
    public static final String  P_IP_DEFAULT          = "localhost";           //$NON-NLS-1$
    public static final String  P_PORT                = "portLaunchConfig";    //$NON-NLS-1$
    public static final int     P_PORT_DEFAULT        = 8010;
    public static final int     P_SSLPORT_DEFAULT     = 18010;
    public static final String  P_PORT_DEFAULT_STR    = "8010";                //$NON-NLS-1$
    public static final String  P_SSLPORT_DEFAULT_STR = "18010";               //$NON-NLS-1$
    public static final String  P_USER                = "userLaunchConfig";    //$NON-NLS-1$
    public static final String  P_PASSWORD            = "passwordLaunchConfig"; //$NON-NLS-1$
    public static final String  P_CLUSTER             = "clusterLaunchConfig"; //$NON-NLS-1$
    public static final String  P_COMPILEONLY         = "compileOnly";         //$NON-NLS-1$

    private enum SERVER_EXISTS
    {
        UNKNOWN, TESTING, FALSE, TRUE
    }

    protected HPCCWsClient                  hpccclient = null;
    private SERVER_EXISTS                   serverExists = SERVER_EXISTS.UNKNOWN;
    protected boolean                       isDisabled;
    public boolean                          isTempDisabled;
    private String                          build = "";//$NON-NLS-1$
    private Version                         version;

    private Collection<Cluster>             clusters;
    private Collection<DropZone>            dropZones;
    protected Collection<Workunit>          workunits;
    private Collection<FileSprayWorkunit>   fileSprayWorkunits;
    private Collection<DataQuerySet>        dataQuerySets;
    private Collection<LogicalFile>         logicalFiles;

    static int                              LATENCY_TEST = 0;

    protected Platform(URL address, String user, String password)
    {
        this(address.getProtocol(), address.getHost(), address.getPort(), user, password);
    }

    protected Platform(String protocol, String ip, int port, String user, String password)
    {
        hpccclient = HPCCWsClient.get(protocol, ip, port, user, password);

        isDisabled = false;
        isTempDisabled = false;

        clusters = new HashSet<Cluster>();
        dropZones = new HashSet<DropZone>();
        workunits = new HashSet<Workunit>();
        fileSprayWorkunits = new HashSet<FileSprayWorkunit>();
        dataQuerySets = new HashSet<DataQuerySet>();
        logicalFiles = new HashSet<LogicalFile>();
    }

    protected synchronized void confirmDisable()
    {
    }

    public void clearTempDisabled()
    {
        isTempDisabled = false;
        serverExists = SERVER_EXISTS.UNKNOWN;
        build = ""; //$NON-NLS-1$
    }

    protected synchronized void testServer()
    {
        if (serverExists == SERVER_EXISTS.UNKNOWN)
        {
            serverExists = SERVER_EXISTS.TESTING;
            if (pingServer())
            {
                serverExists = SERVER_EXISTS.TRUE;
            }
            else
            {
                serverExists = SERVER_EXISTS.FALSE;
                isTempDisabled = true;
            }
        }
    }

    public boolean isDisabled()
    {
        testServer();
        return isDisabled || isTempDisabled;
    }

    public boolean isEnabled()
    {
        return !isDisabled();
    }

    public String getProtocol()
    {
        return hpccclient.getProtocol();
    }

    public String getIP()
    {
        return hpccclient.getHost();
    }

    public int getPort()
    {
        return hpccclient.getPortInt();
    }

    public String getUser()
    {
        return hpccclient.getUserName();
    }

    public String getPassword()
    {
        return hpccclient.getPassword();
    }

    protected String getBuild()
    {
        if (isEnabled() && build.isEmpty())
        {
            try
            {
                HPCCWsSMCClient wssmc = hpccclient.getWsSMCClient();
                build = wssmc.getHPCCBuild();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return build;
    }

    public synchronized boolean pingServer()
    {
        boolean success = false;
        try
        {
            success = hpccclient.pingServer();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return success;
    }

    //Rodrigo: do we need getbuildversion and get version??
    /*public Version getBuildVersion()
    {
        return new Version(getBuild());
    }*/

    public Version getVersion()
    {
        if (version == null)
        {
            version = new Version(getBuild());
        }
        return version;
    }

    /*
     * enum WUAction:
     *   WUActionUnknown = 0
     *   WUActionCompile = 1
     *   WUActionCheck = 2
     *   WUActionRun = 3
     *   WUActionExecuteExisting = 4
     *   WUActionPause = 5
     *   WUActionPauseNow = 6
     *   WUActionResume = 7
     *   WUActionSize = 8
     */
    protected static String hackUnicodeInXMLForAxisOneAndESP(String src)//Rodrigo: what???
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < src.length(); ++i)
        {
            int charVal = src.codePointAt(i);
            if (charVal > 127)
            {
                sb.append("&#x" + Integer.toString(charVal, 16) + ";"); //$NON-NLS-1$ //$NON-NLS-2$
            }
            else
            {
                sb.append(src.charAt(i));
            }
        }
        return sb.toString();
    }

    public Workunit submit(String cluster, String archiveOrEcl, boolean compileOnly)
    {
        return this.submit(cluster, archiveOrEcl, "", "", 0, compileOnly);
    }

    public Workunit submit(String cluster, String archiveOrEcl, String jobname, String filePath, int inlineResultLimit, boolean compileOnly)
    {
        Workunit wu = null;

        try
        {
            Workunit.All.pushTransaction("Platform.submit"); //$NON-NLS-1$

            try
            {
                HPCCWsWorkUnitsClient wsWorkUnitsClient = getWsWorkunitsClient();

                ApplicationValue[] appVals = new ApplicationValue[1];
                appVals[0] = new ApplicationValue();
                //appVals[0].setApplication(Activator.PLUGIN_ID);
                appVals[0].setApplication(API_ID);
                appVals[0].setName("path"); //$NON-NLS-1$
                appVals[0].setValue(filePath);

                WUUpdateResponse response = wsWorkUnitsClient.createWUFromECL(hackUnicodeInXMLForAxisOneAndESP(archiveOrEcl), inlineResultLimit, appVals, jobname, compileOnly);

                response.getWorkunit().setCluster(cluster); // WUSubmit does not return an updated ECLWorkunit, so set
                                                            // cluster here...
                wu = getWorkunit(response.getWorkunit());
                if (wu != null)
                {
                    workunits.add(wu);
                    wsWorkUnitsClient.submitWU(response.getWorkunit().getWuid(), cluster);
                }

            }
            catch (ArrayOfEspException e)
            {
                e.printStackTrace();
            }
            catch (RemoteException e)
            {
                confirmDisable();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        finally
        {
            Workunit.All.popTransaction();
        }

        return wu;
    }

    @Override
    protected boolean isComplete()
    {
        return true;
    }

    @Override
    protected void fastRefresh()
    {
    }

    @Override
    protected void fullRefresh()
    {
    }

    // Workunit ---
    public Workunit getWorkunit(String wuid)
    {
        if (isEnabled())
        {
            return Workunit.get(this, wuid);
        }
        return null;
    }

    public Workunit getWorkunit(ECLWorkunit wu)
    {
        Workunit workunit = getWorkunit(wu.getWuid());
        workunit.update(wu);
        return workunit;
    }

    Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate)
    {
        return getWorkunits(userOnly, cluster, startDate, endDate, "", "", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate, String jobname)
    {
        return getWorkunits(userOnly, cluster, startDate, endDate, jobname, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
    }

    public Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate, String jobname, String appKey, String appData)
    {
        if (isEnabled())
        {
            Workunit.All.pushTransaction("platform.getWorkunits"); //$NON-NLS-1$
            try
            {
                HPCCWsWorkUnitsClient wsWorkUnitsClient = getWsWorkunitsClient();
                WUQueryResponse response = wsWorkUnitsClient.workUnitUQuery(null, jobname, cluster, null, null, null, endDate, startDate, null, null, 100, userOnly ? getUser() : null, "org.hpccsystems.ws.client", appKey, appData);
                updateWorkunits(response.getWorkunits());
            }
            catch (ArrayOfEspException e)
            {
                e.printStackTrace();
            }
            catch (RemoteException e)
            {
                confirmDisable();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            Workunit.All.popTransaction();
            return new HashSet<Workunit>(workunits);
        }
        return new HashSet<Workunit>();
    }

    public static String toESPString(GregorianCalendar _calendar)
    {
        // 2013-10-02T23:00:00Z
        Calendar now = GregorianCalendar.getInstance();
        Calendar nowUTC = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC")); //$NON-NLS-1$
        int delta = nowUTC.get(Calendar.HOUR_OF_DAY) - now.get(Calendar.HOUR_OF_DAY);
        GregorianCalendar calendar = (GregorianCalendar) _calendar.clone();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); //$NON-NLS-1$
        calendar.add(Calendar.HOUR_OF_DAY, delta);
        return df.format(calendar.getTime());
    }

    public Collection<Workunit> getWorkunits(String owner, String cluster, GregorianCalendar startDate, GregorianCalendar endDate)
    {
        if (isEnabled())
        {
            Workunit.All.pushTransaction("platform.getWorkunits"); //$NON-NLS-1$
            try
            {

                HPCCWsWorkUnitsClient wsWorkUnitsClient = getWsWorkunitsClient();
                WUQueryResponse response = wsWorkUnitsClient.workUnitUQuery(null, null, cluster, null, null, null, toESPString(endDate), toESPString(startDate), null, null, 100, owner, null, null, null);

                updateWorkunits(response.getWorkunits());
            }
            catch (ArrayOfEspException e)
            {
                e.printStackTrace();
            }
            catch (RemoteException e)
            {
                confirmDisable(); //rodrigo: we might need to confirmdisable on all exceptions, or tighten up the exception handling
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            Workunit.All.popTransaction();
            return new HashSet<Workunit>(workunits);
        }
        return new HashSet<Workunit>();
    }

    public Collection<Workunit> getWorkunits(boolean userOnly, String cluster)
    {
        return getWorkunits(userOnly, cluster, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
    }

    public Collection<Workunit> getWorkunits(boolean userOnly)
    {
        return getWorkunits(userOnly, "", "", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    synchronized void updateWorkunits(ECLWorkunit[] rawWorkunits)
    {
        workunits.clear();
        if (rawWorkunits != null)
        {
            for (ECLWorkunit wu : rawWorkunits)
            {
                if (Workunit.isValidWUIDString(wu.getWuid()))
                {
                    workunits.add(getWorkunit(wu)); // Will mark changed if needed ---
                }
            }
        }
    }

    // FileSPrayWorkunit ---
    public FileSprayWorkunit getFileSprayWorkunit(String id)
    {
        return FileSprayWorkunit.get(this, id);
    }

    public FileSprayWorkunit getFileSprayWorkunit(DFUWorkunit wu)
    {
        FileSprayWorkunit workunit = getFileSprayWorkunit(wu.getID());
        workunit.update(wu);
        return workunit;
    }

    public FileSprayWorkunit[] getFileSprayWorkunits(String cluster)
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getFileSprayWorkunits", fileSprayWorkunits);
            try
            {
                HPCCFileSprayClient fileSprayClient = getFileSprayClient();
                GetDFUWorkunitsResponse response = fileSprayClient.getDFUWorkunits(cluster, new Long(100));

                updateFileSprayWorkunits(response.getResults());
            }
            catch (ArrayOfEspException e)
            {
                e.printStackTrace();
            }
            catch (RemoteException e)
            {
                confirmDisable();//rodrigo: we might need to confirmdisable for exception, or tighten up exceptions thrown
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            // TODO notifyObservers(monitor.calcChanges(fileSprayWorkunits));
        }
        return fileSprayWorkunits.toArray(new FileSprayWorkunit[0]);
    }

    public FileSprayWorkunit[] getFileSprayWorkunits()
    {
        return getFileSprayWorkunits(""); //$NON-NLS-1$
    }

    synchronized void updateFileSprayWorkunits(DFUWorkunit[] rawWorkunits)
    {
        fileSprayWorkunits.clear();
        if (rawWorkunits != null)
        {
            for (DFUWorkunit wu : rawWorkunits)
            {
                fileSprayWorkunits.add(getFileSprayWorkunit(wu)); // Will mark changed if needed ---
            }
        }
    }

    // LogicalFile ---
    public DataQuerySet getDataQuerySet(String name)
    {
        return DataQuerySet.get(this, name);
    }

    public DataQuerySet getDataQuerySet(QuerySet qs)
    {
        DataQuerySet dataQuerySet = getDataQuerySet(qs.getQuerySetName());
        dataQuerySet.Update(qs);
        return dataQuerySet;
    }

    public DataQuerySet[] getDataQuerySets()
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getDataQuerySets", dataQuerySets);
            try
            {
                HPCCWsWorkUnitsClient wsWorkunitsClient = getWsWorkunitsClient();
                QuerySet[] queryset = wsWorkunitsClient.getQuerySets();

                updateDataQuerySets(queryset);
            }
            catch (ArrayOfEspException e)
            {
                e.printStackTrace();
            }
            catch (RemoteException e)
            {
                confirmDisable();//rodrigo: we might need to confirmdisable for exception, or tighten up exceptions thrown
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            // TODO notifyObservers(monitor.calcChanges(dataQuerySets));
        }
        return dataQuerySets.toArray(new DataQuerySet[0]);
    }

    synchronized void updateDataQuerySets(QuerySet[] rawQuerySets)
    {
        dataQuerySets.clear();
        if (rawQuerySets != null)
        {
            for (QuerySet qs : rawQuerySets)
            {
                dataQuerySets.add(getDataQuerySet(qs)); // Will mark changed if needed ---
            }
        }
    }

    // LogicalFile ---
    public LogicalFile getLogicalFile(String name)
    {
        return LogicalFile.get(this, name);
    }

    public LogicalFile getLogicalFile(DFULogicalFile lf)
    {
        LogicalFile logicalFile = getLogicalFile(lf.getName());
        logicalFile.update(lf);
        return logicalFile;
    }

    public LogicalFile getLogicalFile(ECLSourceFile sf)
    {
        LogicalFile logicalFile = getLogicalFile(sf.getName());
        logicalFile.Update(sf);
        return logicalFile;
    }

    public LogicalFile[] getLogicalFiles(String cluster)
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getLogicalFiles", logicalFiles);
            try
            {
                HPCCWsDFUClient wsDfuClient = getWsDfuClient();
                updateLogicalFiles(wsDfuClient.getLogicalFiles(null, cluster, 100, 0, 100));
            }
            catch (ArrayOfEspException e)
            {
                e.printStackTrace();
            }
            catch (RemoteException e)
            {
                confirmDisable();//rodrigo: we might need to confirmdisable for exception, or tighten up exceptions thrown
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            // TODO notifyObservers(monitor.calcChanges(logicalFiles));
        }
        return logicalFiles.toArray(new LogicalFile[0]);
    }

    public LogicalFile[] getLogicalFiles()
    {
        return getLogicalFiles(""); //$NON-NLS-1$
    }

    synchronized void updateLogicalFiles(DFULogicalFile[] rawLogicalFiles)
    {
        logicalFiles.clear();
        if (rawLogicalFiles != null)
        {
            for (DFULogicalFile lf : rawLogicalFiles)
            {
                logicalFiles.add(getLogicalFile(lf)); // Will mark changed if needed ---
            }
        }
    }

    // Cluster ---
    public Cluster getCluster(String name)
    {
        return Cluster.get(this, name);
    }

    public Cluster getCluster(TpTargetCluster tc)
    {
        Cluster cluster = getCluster(tc.getName());
        cluster.Update(tc);
        return cluster;
    }

    public Cluster[] getClusters()
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
            try
            {
                HPCCWsTopologyClient wsTopologyClient = getWsTopologyClient();
                updateClusters(wsTopologyClient.getLogicalClusters());
            }
            catch (ArrayOfEspException e)
            {
                e.printStackTrace();
            }
            catch (RemoteException e)
            {
                confirmDisable();//rodrigo: we might need to confirmdisable for exception, or tighten up exceptions thrown
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            // TODO notifyObservers(monitor.calcChanges(clusters));
        }
        return clusters.toArray(new Cluster[0]);
    }

    synchronized void updateClusters(TpLogicalCluster[] tpLogicalClusters)
    {
        if (tpLogicalClusters != null)
        {
            for (TpLogicalCluster c : tpLogicalClusters)
            {
                clusters.add(getCluster(c.getName())); // Will mark changed if needed ---
            }
        }
    }

    // Drop Zones ---
    public DropZone getDropZone(String name)
    {
        return DropZone.get(this, name);
    }

    public DropZone getDropZone(TpDropZone dz)
    {
        DropZone dropZone = getDropZone(dz.getName());
        dropZone.update(dz);
        return dropZone;
    }

    public DropZone[] getDropZones()
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
            try
            {
                HPCCWsTopologyClient topclient = hpccclient.getWsTopologyClient();
                TpServices services = topclient.getServices();
                if (services != null)
                    updateServices(services);
            }
            catch (Exception e)
            {
                e.printStackTrace();
                confirmDisable();
            }
         // TODO notifyObservers(monitor.calcChanges(clusters));
        }
        return dropZones.toArray(new DropZone[0]);
    }

    private void updateServices(TpServices serviceList)
    {
        if (serviceList != null)
        {
            updateDropZones(serviceList.getTpDropZones());
        }

    }

    private void updateDropZones(TpDropZone[] rawDropZones)
    {
        if (rawDropZones != null)
        {
            for (TpDropZone dz : rawDropZones)
            {
                dropZones.add(getDropZone(dz));
            }
        }
    }

    //Rodrigo these geturls should be in Connection...
    // SOAP Stub Helpers ---
    public URL getURL() throws MalformedURLException
    {
        return getURL(""); //$NON-NLS-1$
    }

    public URL getURL(String service) throws MalformedURLException
    {
        return new URL(getProtocol(), getIP(), getPort(), "/" + service); //$NON-NLS-1$
    }

    public URL getURL(String service, String method) throws MalformedURLException
    {
        return getURL(service + "/" + method); //$NON-NLS-1$
    }

    public URL getURL(String service, String method, String params) throws MalformedURLException
    {
        return getURL(service + "/" + method + "?" + params); //$NON-NLS-1$ //$NON-NLS-2$
    }

    public URL getWidgetURL(String widget, String params) throws MalformedURLException
    {
        return getURL("esp/files/stub.htm?Widget=" + widget + (params.isEmpty() ? "" : "&" + params)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    void latencyTest()
    {
        if (LATENCY_TEST == 0)
        {
            return;
        }

        try
        {
            Thread.sleep(LATENCY_TEST);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public HPCCWsClient getHPCCWSClient()
    {
        latencyTest();
        return hpccclient;
    }

    public HPCCWsWorkUnitsClient getWsWorkunitsClient() throws Exception
    {
        latencyTest();
        return hpccclient.getWsWorkunitsClient();
    }

    public HPCCWsDFUClient getWsDfuClient() throws Exception
    {
        latencyTest();
        return hpccclient.getWsDFUClient();
    }

    public HPCCFileSprayClient getFileSprayClient() throws Exception
    {
        latencyTest();
        return hpccclient.getFileSprayClient();
    }

    public HPCCWsTopologyClient getWsTopologyClient() throws Exception
    {
        latencyTest();
        return hpccclient.getWsTopologyClient();
    }

    public HPCCWsSMCClient getWsSMCClient() throws Exception
    {
        latencyTest();
        return hpccclient.getWsSMCClient();
    }

    public HPCCWsClient getWsClient() throws Exception
    {
        latencyTest();
        return hpccclient;
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof Platform))
        {
            return false;
        }

        Platform that = (Platform) aThat;

        return EqualsUtil.areEqual(hpccclient, that.getHPCCWSClient());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, getProtocol());
        result = HashCodeUtil.hash(result, getIP());
        result = HashCodeUtil.hash(result, getPort());
        return result;
    }
}
