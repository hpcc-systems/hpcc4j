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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;

import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsClientPool;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsSMCClient;
import org.hpccsystems.ws.client.HPCCWsTopologyClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFULogicalFile;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.ArrayOfDFUWorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DFUWorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.GetDFUWorkunitsResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpDropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpLogicalClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpServicesWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUQueryWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;

import io.opentelemetry.instrumentation.annotations.WithSpan;

public class Platform extends DataSingleton
{
    public static final String API_ID = "org.hpccsystems.ws.client"; //$NON-NLS-1$

    public static DataSingletonCollection All = new DataSingletonCollection();

    /**
     * Gets the.
     *
     * @param conn
     *            the conn
     * @return the platform
     */
    @WithSpan
    public static Platform get(Connection conn)
    {
        if (conn == null)
            return null;

        return (Platform) All.get(new Platform(conn));
    }

    /**
     * Gets a representation of the target HPCC Systems platform based on the connection parameter.
     *
     * @param protocol
     *            the protocol
     * @param ip
     *            the ip
     * @param port
     *            the port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @return the platform
     */
    @WithSpan
    public static Platform get(String protocol, String ip, int port, String user, String pass)
    {
        if (ip == null || ip.isEmpty() || port <= 0)
        {
            return null;
        }

        Connection conn = new Connection(protocol, ip, String.valueOf(port));
        conn.setCredentials(user, pass);

        return (Platform) All.get(new Platform(conn));
    }

    /**
     * Gets the.
     *
     * @param address
     *            the address
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @return the platform
     */
    public static Platform get(String address, String user, String pass)
    {
        if (address == null || address.isEmpty())
        {
            return null;
        }

        Connection conn;
        try
        {
            conn = new Connection(address);
            conn.setCredentials(user, pass);
        }
        catch (Exception e)
        {
           return null;
        }

        return (Platform) All.get(new Platform(conn));
    }

    /**
     * Gets the no create.
     *
     * @param protocol
     *            the protocol
     * @param ip
     *            the ip
     * @param port
     *            the port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @return the no create
     */
    @Deprecated
    public static Platform getNoCreate(String protocol, String ip, int port, String user, String pass)
    {
        return null;
    }

    /**
     * Removes the.
     *
     * @param p
     *            the p
     */
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

    protected HPCCWsClient                  platformHPCCClient = null;
    protected HPCCWsClientPool              hpccClientPool = null;
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
    private Boolean                         isContainerized;

    static int                              LATENCY_TEST = 0;

    /**
     * Instantiates a new platform.
     *
     * @param hpccconn
     *            the hpccconn
     */
    @WithSpan
    protected Platform(Connection hpccconn)
    {
        this(hpccconn, HPCCWsClientPool.DEFAULT_EXPIRE_MILLIS);
    }

    /**
     * Instantiates a new platform.
     *
     * @param hpccconn
     *            the hpccconn
     * @param pooltimeoutmillis
     *            the pooltimeoutmillis
     */
    @WithSpan
    protected Platform(Connection hpccconn, long pooltimeoutmillis)
    {
        hpccClientPool = new HPCCWsClientPool(hpccconn, pooltimeoutmillis);
        platformHPCCClient = hpccClientPool.checkOut();

        isDisabled = false;
        isTempDisabled = false;

        clusters = new HashSet<Cluster>();
        dropZones = new HashSet<DropZone>();
        workunits = new HashSet<Workunit>();
        fileSprayWorkunits = new HashSet<FileSprayWorkunit>();
        dataQuerySets = new HashSet<DataQuerySet>();
        logicalFiles = new HashSet<LogicalFile>();
        isContainerized = null;
    }

    /**
     * Confirm disable.
     */
    protected synchronized void confirmDisable()
    {
    }

    /**
     * Clear temp disabled.
     */
    public void clearTempDisabled()
    {
        isTempDisabled = false;
        serverExists = SERVER_EXISTS.UNKNOWN;
        build = ""; //$NON-NLS-1$
    }

    public synchronized boolean isContainerized()
    {
        if (isContainerized == null)
        {
            try
            {
                isContainerized = platformHPCCClient.isContainerized();
            }
            catch (Exception e)
            {
                isContainerized = null;
            }
        }
        return isContainerized;
    }

    /**
     * Test server.
     */
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

    /**
     * Checks if is disabled.
     *
     * @return true, if is disabled
     */
    public boolean isDisabled()
    {
        testServer();
        return isDisabled || isTempDisabled;
    }

    /**
     * Checks if is enabled.
     *
     * @return true, if is enabled
     */
    public boolean isEnabled()
    {
        return !isDisabled();
    }

    /**
     * Gets the protocol.
     *
     * @return the protocol
     */
    public String getProtocol()
    {
        return platformHPCCClient.getProtocol();
    }

    /**
     * Gets the ip.
     *
     * @return the ip
     */
    public String getIP()
    {
        return platformHPCCClient.getHost();
    }

    /**
     * Gets the port.
     *
     * @return the port
     */
    public int getPort()
    {
        return platformHPCCClient.getPortInt();
    }

    /**
     * Gets the user.
     *
     * @return the user
     */
    public String getUser()
    {
        return platformHPCCClient.getUserName();
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword()
    {
        return platformHPCCClient.getPassword();
    }

    /**
     * Gets the builds the.
     *
     * @return the builds the
     */
    protected String getBuild()
    {
        if (isEnabled() && build.isEmpty())
        {
            try
            {
                HPCCWsSMCClient wssmc = platformHPCCClient.getWsSMCClient();
                build = wssmc.getHPCCBuild();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return build;
    }

    /**
     * Ping server.
     *
     * @return true, if successful
     */
    public synchronized boolean pingServer()
    {
        boolean success = false;
        try
        {
            success = platformHPCCClient.pingServer();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return success;
    }

    /**
     * Gets the builds the version.
     *
     * @return the builds the version
     */
    public Version getBuildVersion()
    {
        return new Version(getBuild());
    }

    /**
     * Gets the version.
     *
     * @return the version
     */
    public Version getVersion()
    {
        if (version == null)
        {
            version = new Version(getBuild());
        }
        return version;
    }

    /**
     * Hack unicode in XML for axis one and ESP.
     *
     * @param src
     *            the src
     * @return the string
     */
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
    protected static String hackUnicodeInXMLForAxisOneAndESP(String src)
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

    /**
     * Submit.
     *
     * @param cluster
     *            the cluster
     * @param archiveOrEcl
     *            the archive or ecl
     * @param compileOnly
     *            the compile only
     * @return the workunit
     */
    public Workunit submit(String cluster, String archiveOrEcl, boolean compileOnly)
    {
        return this.submit(cluster, archiveOrEcl, "", "", 0, compileOnly);
    }

    /**
     * Submit.
     *
     * @param cluster
     *            the cluster
     * @param archiveOrEcl
     *            the archive or ecl
     * @param jobname
     *            the jobname
     * @param filePath
     *            the file path
     * @param inlineResultLimit
     *            the inline result limit
     * @param compileOnly
     *            the compile only
     * @return the workunit
     */
    public Workunit submit(String cluster, String archiveOrEcl, String jobname, String filePath, int inlineResultLimit, boolean compileOnly)
    {
        Workunit wu = null;

        try
        {
            Workunit.All.pushTransaction("Platform.submit"); //$NON-NLS-1$

            try
            {
                org.hpccsystems.ws.client.HPCCWsWorkUnitsClient wsWorkUnitsClient = platformHPCCClient.getWsWorkunitsClient();

                List<ApplicationValueWrapper> appVals=new ArrayList<ApplicationValueWrapper>();
                appVals.add(new ApplicationValueWrapper(API_ID,"path",filePath));

                WorkunitWrapper response = wsWorkUnitsClient.createWUFromECL(hackUnicodeInXMLForAxisOneAndESP(archiveOrEcl), inlineResultLimit, appVals, jobname, compileOnly);

                //response now has cluster set, no need to set it here

                wu = getWorkunit(response.getWuid());
                if (response != null)
                {
                    workunits.add(wu);
                    wsWorkUnitsClient.submitWU(response.getWuid(), cluster);
                }
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

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    @Override
    protected boolean isComplete()
    {
        return true;
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fastRefresh()
     */
    @Override
    protected void fastRefresh()
    {
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fullRefresh()
     */
    @Override
    protected void fullRefresh()
    {
    }

    /**
     * Gets the workunit.
     *
     * @param wuid
     *            the wuid
     * @return the workunit
     */
    // Workunit ---
    public Workunit getWorkunit(String wuid)
    {
        if (isEnabled())
        {
            return Workunit.get(this, wuid);
        }
        return null;
    }

    /**
     * Gets the workunit.
     *
     * @param wu
     *            the wu
     * @return the workunit
     */
    public Workunit getWorkunit(ECLWorkunit wu)
    {
        Workunit workunit = getWorkunit(wu.getWuid());
        workunit.update(wu);
        return workunit;
    }

    /**
     * Gets the workunits.
     *
     * @param userOnly
     *            the user only
     * @param cluster
     *            the cluster
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @return the workunits
     */
    Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate)
    {
        return getWorkunits(userOnly, cluster, startDate, endDate, "", "", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    /**
     * Gets the workunits.
     *
     * @param userOnly
     *            the user only
     * @param cluster
     *            the cluster
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @param jobname
     *            the jobname
     * @return the workunits
     */
    Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate, String jobname)
    {
        return getWorkunits(userOnly, cluster, startDate, endDate, jobname, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * Gets the workunits.
     *
     * @param userOnly
     *            the user only
     * @param cluster
     *            the cluster
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @param jobname
     *            the jobname
     * @param appKey
     *            the app key
     * @param appData
     *            the app data
     * @return the workunits
     */
    public Collection<Workunit> getWorkunits(boolean userOnly, String cluster, String startDate, String endDate, String jobname, String appKey, String appData)
    {
        if (isEnabled())
        {
            Workunit.All.pushTransaction("platform.getWorkunits"); //$NON-NLS-1$
            try
            {
                org.hpccsystems.ws.client.HPCCWsWorkUnitsClient wsWorkUnitsClient = platformHPCCClient.getWsWorkunitsClient();
                WUQueryWrapper info = new WUQueryWrapper().setJobname(jobname).setCluster(cluster)
                        .setStartDate(Utils.UTCStringToDate(startDate)).setEndDate(Utils.UTCStringToDate(endDate))
                        .setPageSize(Long.valueOf(100)).setOwner(userOnly ? getUser() : null);
                info.getApplicationValues().add(new ApplicationValueWrapper("org.hpccsystems.ws.client", appKey, appData));

                List<WorkunitWrapper> response = wsWorkUnitsClient.workUnitUQuery(info);
                updateWorkunits(response);
            }
//            catch (ArrayOfEspException e)
//            {
//                e.printStackTrace();
//            }
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

    /**
     * To ESP string.
     *
     * @param _calendar
     *            the calendar
     * @return the string
     */
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

    /**
     * Gets the workunits.
     *
     * @param owner
     *            the owner
     * @param cluster
     *            the cluster
     * @param startDate
     *            the start date
     * @param endDate
     *            the end date
     * @return the workunits
     */
    public Collection<Workunit> getWorkunits(String owner, String cluster, GregorianCalendar startDate, GregorianCalendar endDate)
    {
        if (isEnabled())
        {
            Workunit.All.pushTransaction("platform.getWorkunits"); //$NON-NLS-1$
            try
            {
                org.hpccsystems.ws.client.HPCCWsWorkUnitsClient wsWorkUnitsClient = platformHPCCClient.getWsWorkunitsClient();
                WUQueryWrapper info = new WUQueryWrapper();
                info.setCluster(cluster);
                info.setStartDate(startDate.getTime());
                info.setEndDate(endDate.getTime());
                info.setPageSize(Long.valueOf(100));
                info.setOwner(owner);
                List<WorkunitWrapper> response = wsWorkUnitsClient.workUnitUQuery(info);

                updateWorkunits(response);
            }
//            catch (ArrayOfEspException e)
//            {
//                e.printStackTrace();
//            }
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

    /**
     * Gets the workunits.
     *
     * @param userOnly
     *            the user only
     * @param cluster
     *            the cluster
     * @return the workunits
     */
    public Collection<Workunit> getWorkunits(boolean userOnly, String cluster)
    {
        return getWorkunits(userOnly, cluster, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * Gets the workunits.
     *
     * @param userOnly
     *            the user only
     * @return the workunits
     */
    public Collection<Workunit> getWorkunits(boolean userOnly)
    {
        return getWorkunits(userOnly, "", "", ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    /**
     * Update workunits.
     *
     * @param response
     *            the response
     */
    synchronized void updateWorkunits(List<WorkunitWrapper> response)
    {
        workunits.clear();
        if (response != null)
        {
            for (WorkunitWrapper wu : response)
            {
                if (Workunit.isValidWUIDString(wu.getWuid()))
                {
                    workunits.add(getWorkunit(wu.getEclWorkunit())); // Will mark changed if needed ---
                }
            }
        }
    }

    /**
     * Gets the file spray workunit.
     *
     * @param id
     *            the id
     * @return the file spray workunit
     */
    // FileSPrayWorkunit ---
    public FileSprayWorkunit getFileSprayWorkunit(String id)
    {
        return FileSprayWorkunit.get(this, id);
    }

    /**
     * Gets the file spray workunit.
     *
     * @param wu
     *            the wu
     * @return the file spray workunit
     */
    public FileSprayWorkunit getFileSprayWorkunit(DFUWorkunitWrapper wu)
    {
        FileSprayWorkunit workunit = null;
        if (wu != null)
        {
            workunit = getFileSprayWorkunit(wu.getID());
            workunit.update(wu);
        }
        return workunit;
    }

    /**
     * Gets the file spray workunits.
     *
     * @param cluster
     *            the cluster
     * @return the file spray workunits
     */
    public FileSprayWorkunit[] getFileSprayWorkunits(String cluster)
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getFileSprayWorkunits", fileSprayWorkunits);
            try
            {
                org.hpccsystems.ws.client.HPCCFileSprayClient fileSprayClient = platformHPCCClient.getFileSprayClient();
                GetDFUWorkunitsResponseWrapper response = fileSprayClient.getDFUWorkunits(cluster, Long.valueOf(100));
                if (response != null)
                {
                    ArrayOfDFUWorkunitWrapper results = response.getResults();
                    if (results.getDFUWorkunit() != null)
                        updateFileSprayWorkunits(results.getDFUWorkunit());
                }
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

    /**
     * Gets the file spray workunits.
     *
     * @return the file spray workunits
     */
    public FileSprayWorkunit[] getFileSprayWorkunits()
    {
        return getFileSprayWorkunits(""); //$NON-NLS-1$
    }

    /**
     * Update file spray workunits.
     *
     * @param list
     *            the list
     */
    synchronized void updateFileSprayWorkunits(List<DFUWorkunitWrapper> list)
    {
        fileSprayWorkunits.clear();
        if (list != null)
        {
            for (DFUWorkunitWrapper wu : list)
            {
                fileSprayWorkunits.add(getFileSprayWorkunit(wu)); // Will mark changed if needed ---
            }
        }
    }

    /**
     * Gets the data query set.
     *
     * @param name
     *            the name
     * @return the data query set
     */
    // LogicalFile ---
    public DataQuerySet getDataQuerySet(String name)
    {
        return DataQuerySet.get(this, name);
    }

    /**
     * Gets the data query set.
     *
     * @param qs
     *            the qs
     * @return the data query set
     */
    public DataQuerySet getDataQuerySet(QuerySet qs)
    {
        DataQuerySet dataQuerySet = getDataQuerySet(qs.getQuerySetName());
        dataQuerySet.Update(qs);
        return dataQuerySet;
    }

    /**
     * Gets the data query sets.
     *
     * @return the data query sets
     */
    public DataQuerySet[] getDataQuerySets()
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getDataQuerySets", dataQuerySets);
            try
            {
                HPCCWsWorkUnitsClient wsWorkunitsClient = platformHPCCClient.getWsWorkunitsClient();
                QuerySet [] queryset = wsWorkunitsClient.getQuerySets();

                updateDataQuerySets(queryset);
            }
//            catch (ArrayOfEspException e)
//            {
//                e.printStackTrace();
//            }
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

    /**
     * Update data query sets.
     *
     * @param rawQuerySets
     *            the raw query sets
     */
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

    /**
     * Gets the logical file.
     *
     * @param name
     *            the name
     * @return the logical file
     */
    // LogicalFile ---
    public LogicalFile getLogicalFile(String name)
    {
        return LogicalFile.get(this, name);
    }

    /**
     * Gets the logical file.
     *
     * @param lf
     *            the lf
     * @return the logical file
     */
    public LogicalFile getLogicalFile(DFULogicalFile lf)
    {
        LogicalFile logicalFile = getLogicalFile(lf.getName());
        logicalFile.update(lf);
        return logicalFile;
    }

    /**
     * Gets the logical file.
     *
     * @param sf
     *            the sf
     * @return the logical file
     */
    public LogicalFile getLogicalFile(ECLSourceFile sf)
    {
        LogicalFile logicalFile = getLogicalFile(sf.getName());
        logicalFile.Update(sf);
        return logicalFile;
    }

    /**
     * Gets the logical files.
     *
     * @param cluster
     *            the cluster
     * @return the logical files
     */
    public LogicalFile[] getLogicalFiles(String cluster)
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getLogicalFiles", logicalFiles);
            try
            {
                HPCCWsDFUClient wsDfuClient = platformHPCCClient.getWsDFUClient();
                updateLogicalFiles(wsDfuClient.getLogicalFiles(null, cluster, 100, 0, 100));
            }
            catch (ArrayOfEspExceptionWrapper e)
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

    /**
     * Gets the logical files.
     *
     * @return the logical files
     */
    public LogicalFile[] getLogicalFiles()
    {
        return getLogicalFiles(""); //$NON-NLS-1$
    }

    /**
     * Update logical files.
     *
     * @param rawLogicalFiles
     *            the raw logical files
     */
    synchronized void updateLogicalFiles(List<DFULogicalFileWrapper> rawLogicalFiles)
    {
        logicalFiles.clear();
        if (rawLogicalFiles != null)
        {
            for (DFULogicalFileWrapper lf : rawLogicalFiles)
            {
                logicalFiles.add(getLogicalFile(lf.getFileName())); // Will mark changed if needed ---
            }
        }
    }

    /**
     * Gets the cluster.
     *
     * @param name
     *            the name
     * @return the cluster
     */
    // Cluster ---
    public Cluster getCluster(String name)
    {
        return Cluster.get(this, name);
    }

    /**
     * Gets the cluster.
     *
     * @param tc
     *            the tc
     * @return the cluster
     */
    public Cluster getCluster(TpTargetCluster tc)
    {
        Cluster cluster = getCluster(tc.getName());
        cluster.Update(tc);
        return cluster;
    }

    /**
     * Gets the clusters.
     *
     * @return the clusters
     */
    public Cluster[] getClusters()
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
            try
            {
                HPCCWsTopologyClient wsTopologyClient = platformHPCCClient.getWsTopologyClient();
                updateClusters(wsTopologyClient.getLogicalClusters());
            }
            catch (ArrayOfEspExceptionWrapper e)
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

    /**
     * Update clusters.
     *
     * @param tpLogicalClusters
     *            the tp logical clusters
     */
    synchronized void updateClusters(List<TpLogicalClusterWrapper> tpLogicalClusters)
    {
        if (tpLogicalClusters != null)
        {
            for (TpLogicalClusterWrapper clusterwrapper : tpLogicalClusters)
            {
                clusters.add(getCluster(clusterwrapper.getName())); // Will mark changed if needed ---
            }
        }
    }

    /**
     * Gets the drop zone.
     *
     * @param name
     *            the name
     * @return the drop zone
     */
    // Drop Zones ---
    public DropZone getDropZone(String name)
    {
        return DropZone.get(this, name);
    }

    /**
     * Gets the drop zone.
     *
     * @param dz
     *            the dz
     * @return the drop zone
     */
    public DropZone getDropZone(TpDropZone dz)
    {
        DropZone dropZone = getDropZone(dz.getName());
        dropZone.update(dz);
        return dropZone;
    }

    /**
     * Gets the drop zone.
     *
     * @param dz
     *            the dz
     * @return the drop zone
     */
    public DropZone getDropZone(TpDropZoneWrapper dz)
    {
        DropZone dropZone = getDropZone(dz.getName());
        dropZone.update(dz.getRaw());
        return dropZone;
    }

    /**
     * Gets the drop zones.
     *
     * @return the drop zones
     */
    public DropZone[] getDropZones()
    {
        if (isEnabled())
        {
            // TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
            HPCCWsClient hpccclient = null;
            try
            {
                hpccclient = hpccClientPool.checkOut();
                HPCCWsTopologyClient topclient = hpccclient.getWsTopologyClient();
                TpServicesWrapper services = topclient.getServices();
                if (services != null)
                    updateServices(services);
            }
            catch (Exception e)
            {
                e.printStackTrace();
                confirmDisable();
            }
            finally
            {
                hpccClientPool.checkIn(hpccclient);
            }
         // TODO notifyObservers(monitor.calcChanges(clusters));
        }
        return dropZones.toArray(new DropZone[0]);
    }

    /**
     * Update services.
     *
     * @param serviceList
     *            the service list
     */
    private void updateServices(TpServicesWrapper serviceList)
    {
        if (serviceList != null)
        {
            updateDropZones(serviceList.getTpDropZones().getTpDropZone());
        }

    }

    /**
     * Update drop zones.
     *
     * @param rawDropZones
     *            the raw drop zones
     */
    private void updateDropZones(List<TpDropZoneWrapper> rawDropZones)
    {
        if (rawDropZones != null)
        {
            for (TpDropZoneWrapper dz : rawDropZones)
            {
                dropZones.add(getDropZone(dz));
            }
        }
    }

    //Rodrigo these geturls should be in Connection...
    /**
     * Gets the url.
     *
     * @return the url
     * @throws MalformedURLException
     *             the malformed URL exception
     */
    // SOAP Stub Helpers ---
    public URL getURL() throws MalformedURLException
    {
        return getURL(""); //$NON-NLS-1$
    }

    /**
     * Gets the url.
     *
     * @param service
     *            the service
     * @return the url
     * @throws MalformedURLException
     *             the malformed URL exception
     */
    public URL getURL(String service) throws MalformedURLException
    {
        return new URL(getProtocol(), getIP(), getPort(), "/" + service); //$NON-NLS-1$
    }

    /**
     * Gets the url.
     *
     * @param service
     *            the service
     * @param method
     *            the method
     * @return the url
     * @throws MalformedURLException
     *             the malformed URL exception
     */
    public URL getURL(String service, String method) throws MalformedURLException
    {
        return getURL(service + "/" + method); //$NON-NLS-1$
    }

    /**
     * Gets the url.
     *
     * @param service
     *            the service
     * @param method
     *            the method
     * @param params
     *            the params
     * @return the url
     * @throws MalformedURLException
     *             the malformed URL exception
     */
    public URL getURL(String service, String method, String params) throws MalformedURLException
    {
        return getURL(service + "/" + method + "?" + params); //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * Gets the widget URL.
     *
     * @param widget
     *            the widget
     * @param params
     *            the params
     * @return the widget URL
     * @throws MalformedURLException
     *             the malformed URL exception
     */
    public URL getWidgetURL(String widget, String params) throws MalformedURLException
    {
        return getURL("esp/files/stub.htm?Widget=" + widget + (params.isEmpty() ? "" : "&" + params)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    /**
     * Latency test.
     */
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

//    /**
//     * @return HPCCWsWorkUnitsClient  - not thread safe - Use checkOutWsClient(), then getWsWorkunitsClient() for multi-thread use
//     * @throws Exception
//     */
//    public HPCCWsWorkUnitsClient getWsWorkunitsClient() throws Exception
//    {
//        latencyTest();
//        return platformHPCCClient.getWsWorkunitsClient();
//    }
//
//    /**
//     * @return HPCCWsDFUClient - not thread safe - Use checkOutWsClient(), then getWsDFUClient() for multi-thread use
//     * @throws Exception
//     */
//    public HPCCWsDFUClient getWsDfuClient() throws Exception
//    {
//        latencyTest();
//        return platformHPCCClient.getWsDFUClient();
//    }
//
//    /**
//     * @return HPCCFileSprayClient - not thread safe - Use checkOutWsClient(), then getFileSprayClient() for multi-thread use
//     * @throws Exception
//     */
//    public HPCCFileSprayClient getFileSprayClient() throws Exception
//    {
//        latencyTest();
//        return platformHPCCClient.getFileSprayClient();
//    }
//
//    /**
//     * @return HPCCWsTopologyClient - not thread safe - Use checkOutWsClient(), then getWsTopologyClient() for multi-thread use
//     * @throws Exception
//     */
//    public HPCCWsTopologyClient getWsTopologyClient() throws Exception
//    {
//        latencyTest();
//        return platformHPCCClient.getWsTopologyClient();
//    }
//
//    /**
//     * @return HPCCWsSMCClient - not thread safe - Use checkOutWsClient(), then getWsSMCClient() for multi-thread use
//     * @throws Exception
//     */
//    public HPCCWsSMCClient getWsSMCClient() throws Exception
//    {
//        latencyTest();
//        return platformHPCCClient.getWsSMCClient();
//    }

    /**
 * Gets the ws client.
 *
 * @return HPCCWsClient instance - not thread safe - Use checkoutWsClient for multi-thread use
 * @throws Exception
 *             the exception
 */
    public HPCCWsClient getWsClient() throws Exception
    {
        latencyTest();
        return platformHPCCClient;
    }

    /**
     * Check out HPCC ws client.
     *
     * @return HPCCWsClient from HPCCClient pool, caller responsible for checking client back in
     * @throws Exception
     *             the exception
     */
    public HPCCWsClient checkOutHPCCWsClient() throws Exception
    {
        return hpccClientPool.checkOut();
    }

    /**
     * Check in HPCC ws client.
     *
     * @param client
     *            - returns hpccWsClient to pool for use by other threads
     * @throws Exception
     *             the exception
     */
    public void checkInHPCCWsClient(HPCCWsClient client) throws Exception
    {
        hpccClientPool.checkIn(client);
    }

    /**
     * Validate HPCC ws client.
     *
     * @param client
     *            the client
     * @return true, if successful
     */
    public boolean validateHPCCWsClient(HPCCWsClient client)
    {
        return hpccClientPool.validate(client);
    }

    /**
     * Expire HPCC ws client.
     *
     * @param client
     *            the client
     */
    public void expireHPCCWsClient(HPCCWsClient client)
    {
        hpccClientPool.expire(client);
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#equals(java.lang.Object)
     */
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

        return EqualsUtil.areEqual(platformHPCCClient, that.platformHPCCClient);
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, getProtocol());
        result = HashCodeUtil.hash(result, getIP());
        result = HashCodeUtil.hash(result, getPort());
        result = HashCodeUtil.hash(result, getUser());
        return result;
    }
}
