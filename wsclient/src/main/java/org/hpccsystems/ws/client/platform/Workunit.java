/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.DataSingletonCollection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.WUState;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUQueryWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUInfoRequestWrapper;

public class Workunit extends DataSingleton
{
    public static DataSingletonCollection All = new DataSingletonCollection();

    /**
     * Gets the.
     *
     * @param platform
     *            the platform
     * @param wuid
     *            the wuid
     * @return the workunit
     */
    public static Workunit get(Platform platform, String wuid)
    {
        if (wuid == null || wuid.isEmpty())
        {
            return null;
        }

        return (Workunit) All.get(new Workunit(platform, wuid));
    }

    private Platform                platform;

    private WorkunitWrapper            info;
    private Collection<String>      resultViews;
    private Collection<Result>      results;
    private Collection<Graph>       graphs;
    private Collection<LogicalFile> sourceFiles;
    private Map<String, String>     applicationValues;

    public enum Notification
    {
        WORKUNIT, CLUSTER, QUERY, APPLICATIONVALUES, RESULTS, GRAPHS, SOURCEFILES, JOBNAME, OWNER
    }

    /**
     * Instantiates a new workunit.
     *
     * @param platform
     *            the platform
     * @param wuid
     *            the wuid
     */
    private Workunit(Platform platform, String wuid)
    {
        this.platform = platform;
        info = new WorkunitWrapper();
        info.setWuid(wuid);
        resultViews = new ArrayList<String>();
        results = new ArrayList<Result>();
        graphs = new ArrayList<Graph>();
        sourceFiles = new ArrayList<LogicalFile>();
        applicationValues = new HashMap<String, String>();

    }

    /**
     * Gets the platform.
     *
     * @return the platform
     */
    public Platform getPlatform()
    {
        return platform;
    }

    /**
     * Gets the wuid.
     *
     * @return the wuid
     */
    public String getWuid()
    {
        return info.getWuid();
    }

    /**
     * Gets the query text.
     *
     * @return the query text
     */
    public String getQueryText()
    {
        if (info.getQuery() == null)
        {
            fullRefresh(false, false, false, false);
        }
        if (info.getQuery() != null && info.getQuery().getText() != null)
        {
            return info.getQuery().getText();
        }
        return ""; //$NON-NLS-1$
    }

    /**
     * Gets the cluster name.
     *
     * @return the cluster name
     */
    public Object getClusterName()
    {
        if (info.getCluster() == null)
        {
            fullRefresh(false, false, false, false);
        }
        return info.getCluster();
    }

    /*
     * WUStateUnknown = 0, WUStateCompiled,1 WUStateRunning,2 WUStateCompleted,3 WUStateFailed,4 WUStateArchived,5
     * WUStateAborting,6 WUStateAborted,7 WUStateBlocked,8 WUStateSubmitted,9 WUStateScheduled,10 WUStateCompiling,11
     * WUStateWait,12 WUStateWaitingForUpload,13 WUStateDebugPaused,14 WUStateDebugRunning,15 WUStateSize
     *
     * WUStateNoLongerOnServer 999
     */

    /**
     * Gets the state ID.
     *
     * @return the state ID
     */
    public WUState getStateID()
    {
        if (info.getStateID() != null)
        {
            switch (info.getStateID())
            {
                case 1:
                    return WUState.COMPILED;
                case 2:
                    return WUState.RUNNING;
                case 3:
                    return WUState.COMPLETED;
                case 4:
                    return WUState.FAILED;
                case 5:
                    return WUState.ARCHIVED;
                case 6:
                    return WUState.ABORTING;
                case 7:
                    return WUState.ABORTED;
                case 8:
                    return WUState.BLOCKED;
                case 9:
                    return WUState.SUBMITTED;
                case 10:
                    return WUState.SCHEDULED;
                case 11:
                    return WUState.COMPILING;
                case 12:
                    return WUState.WAIT;
                case 13:
                    return WUState.WAIT;
                case 14:
                    return WUState.WAIT;
                case 15:
                    return WUState.RUNNING;
                case 999:
                    return WUState.UNKNOWN_ONSERVER;
            }
        }
        return WUState.UNKNOWN;
    }

    /**
     * Checks if is failed state.
     *
     * @param state
     *            the state
     * @return true, if is failed state
     */
    public static boolean isFailedState(String state)
    {
        WUState statecode = translateWUState(state);
        switch (statecode)
        {
            case UNKNOWN_ONSERVER:
            case FAILED:
            case ABORTED:
            case ABORTING:
            case BLOCKED:
            case UNKNOWN:
                return true;
            default:
                return false;
        }
    }

    private static Map<String, WUState> WuStateNameMap = new HashMap<String, WUState>();

    static
    {
            WuStateNameMap.put("COMPILED", WUState.COMPILED);
            WuStateNameMap.put("RUNNING", WUState.RUNNING);
            WuStateNameMap.put("COMPLETED", WUState.COMPLETED);
            WuStateNameMap.put("FAILED", WUState.FAILED);
            WuStateNameMap.put("ARCHIVED", WUState.ARCHIVED);
            WuStateNameMap.put("ABORTING", WUState.ABORTING);
            WuStateNameMap.put("ABORTED", WUState.ABORTED);
            WuStateNameMap.put("BLOCKED", WUState.BLOCKED);
            WuStateNameMap.put("SUBMITTED", WUState.SUBMITTED);
            WuStateNameMap.put("SCHEDULED", WUState.SCHEDULED);
            WuStateNameMap.put("COMPILING", WUState.COMPILING);
            WuStateNameMap.put("WAIT", WUState.WAIT);
            WuStateNameMap.put("RUNNING", WUState.RUNNING);
            WuStateNameMap.put("PAUSED", WUState.PAUSED);
    }

    /**
     * Translate WU state.
     *
     * @param state
     *            the state
     * @return the WU state
     */
    public static WUState translateWUState(String state)
    {
        if (WuStateNameMap.containsKey((state.toUpperCase())))
                return WuStateNameMap.get(state.toUpperCase());
        else
            return WUState.UNKNOWN;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public String getState()
    {
        if (info.getState() == null)
        {
            fastRefresh();
        }
        return info.getState() != null ? info.getState() : "Unknown";//Messages.Unknown;
    }

    /**
     * Gets the date.
     *
     * @return the date
     */
    public GregorianCalendar getDate()
    {
        String wuid = getWuid();
        int year = Integer.parseInt(wuid.substring(1, 5));
        int month = Integer.parseInt(wuid.substring(5, 7)) - 1;
        int date = Integer.parseInt(wuid.substring(7, 9));
        int hour = Integer.parseInt(wuid.substring(10, 12));
        int min = Integer.parseInt(wuid.substring(12, 14));
        int sec = Integer.parseInt(wuid.substring(14, 16));
        return new GregorianCalendar(year, month, date, hour, min, sec);
    }

    /**
     * Gets the result views.
     *
     * @return the result views
     */
    public String[] getResultViews()
    {
        if (resultViews == null)
        {
            fullRefresh(false, true, false, false);
        }
        return resultViews.toArray(new String[0]);
    }

    /**
     * Checks for application value.
     *
     * @param key
     *            the key
     * @return true, if successful
     */
    public boolean hasApplicationValue(String key)
    {
        if (applicationValues.isEmpty())
        {
            fullRefresh(false, false, false, true);
        }
        if (applicationValues.containsKey(key))
        {
            return true;
        }
        return false;
    }

    /**
     * Gets the application value.
     *
     * @param key
     *            the key
     * @return the application value
     */
    public String getApplicationValue(String key)
    {
        if (applicationValues.isEmpty())
        {
            fullRefresh(false, false, false, true);
        }
        if (applicationValues.containsKey(key))
        {
            return applicationValues.get(key);
        }
        return ""; //$NON-NLS-1$
    }

    /**
     * Gets the result.
     *
     * @param sequence
     *            the sequence
     * @return the result
     */
    // Results ---
    public synchronized Result getResult(Integer sequence)
    {
        return Result.get(this, sequence);
    }

    /**
     * Gets the result.
     *
     * @param r
     *            the r
     * @return the result
     */
    public Result getResult(ECLResult r)
    {
        Result result = getResult(r.getSequence());
        result.update(r);
        return result;
    }

    /**
     * Gets the results.
     *
     * @return the results
     */
    public Result[] getResults()
    {
        fullRefresh(false, true, false, false);
        return results.toArray(new Result[0]);
    }

    /**
     * Gets the graph.
     *
     * @param name
     *            the name
     * @return the graph
     */
    // Graphs ---
    synchronized Graph getGraph(String name)
    {
        return Graph.get(this, name);
    }

    /**
     * Gets the graph.
     *
     * @param g
     *            the g
     * @return the graph
     */
    Graph getGraph(ECLGraph g)
    {
        Graph graph = getGraph(g.getName());
        graph.update(g);
        return graph;
    }

    /**
     * Gets the graphs.
     *
     * @return the graphs
     */
    public Graph[] getGraphs()
    {
        fullRefresh(true, false, false, false);
        return graphs.toArray(new Graph[0]);
    }

    /**
     * Gets the source file.
     *
     * @param name
     *            the name
     * @return the source file
     */
    // Source Files ---
    synchronized LogicalFile getSourceFile(String name)
    {
        return LogicalFile.get(platform, name);
    }

    /**
     * Gets the source file.
     *
     * @param sf
     *            the sf
     * @return the source file
     */
    LogicalFile getSourceFile(ECLSourceFile sf)
    {
        LogicalFile sourceFile = getSourceFile(sf.getName());
        sourceFile.Update(sf);
        return sourceFile;
    }

    /**
     * Gets the source files.
     *
     * @return the source files
     */
    public LogicalFile[] getSourceFiles()
    {
        fullRefresh(false, false, true, false);
        return sourceFiles.toArray(new LogicalFile[0]);
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    @Override
    public boolean isComplete()
    {
        return HPCCWsWorkUnitsClient.isWorkunitComplete(getStateID());
    }

    /**
     * Gets the jobname.
     *
     * @return the jobname
     */
    public String getJobname()
    {
        String retVal = info.getJobname();
        if (retVal == null)
        {
            return ""; //$NON-NLS-1$
        }
        return retVal;
    }

    /**
     * Gets the owner.
     *
     * @return the owner
     */
    public String getOwner()
    {
        String retVal = info.getOwner();
        if (retVal == null)
        {
            return ""; //$NON-NLS-1$
        }
        return retVal;
    }

    /**
     * Abort.
     */
    // Actions ---
    public void abort()
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsClient().getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.abortWU(info.getWuid());
            }
            catch (RemoteException e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    /**
     * Delete.
     */
    public void delete()
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsClient().getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.deleteWU(info.getWuid());
                refreshState();
            }
            catch (RemoteException e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    /**
     * Resubmit.
     *
     * @param restart
     *            the restart
     * @param clone
     *            the clone
     */
    public void resubmit(boolean restart, boolean clone)
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsClient().getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.resubmitWU(info.getWuid(), restart, clone);
                refreshState();
            }
            catch (RemoteException e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    /**
     * Resubmit.
     */
    public void resubmit()
    {
        resubmit(false, false);
    }

    /**
     * Restart.
     */
    public void restart()
    {
        resubmit(true, false);
    }

    /**
     * Clone.
     */
    public void _clone()
    {
        resubmit(false, true);
    }

    /**
     * Publish.
     */
    public void publish()
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsClient().getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.publishWU(info.getWuid());
                refreshState();
            }
            catch (RemoteException e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    /**
     * Refresh state.
     */
    // Refresh ---
    public void refreshState()
    {
        fullRefresh(false, false, false, false);
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fastRefresh()
     */
    @Override
    protected void fastRefresh()
    {
        WUState previousState = getStateID();

        try
        {
            HPCCWsWorkUnitsClient wsWorkunitsClient = platform.getWsClient().getWsWorkunitsClient();
            List<WorkunitWrapper> response = wsWorkunitsClient.workUnitUQuery(new WUQueryWrapper().setWuid(info.getWuid()).setPageSize(Long.valueOf(1)));
            if (response.size() == 1)
            {
                update(response.get(0).getEclWorkunit());
            }
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }

        if (previousState != getStateID())
        {
            fullRefresh();
        }
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fullRefresh()
     */
    @Override
    protected void fullRefresh()
    {
        fullRefresh(true, true, true, true);
    }

    /**
     * Full refresh.
     *
     * @param includeGraphs
     *            the include graphs
     * @param includeResults
     *            the include results
     * @param includeSourceFiles
     *            the include source files
     * @param includeApplicationValues
     *            the include application values
     */
    void fullRefresh(boolean includeGraphs, boolean includeResults, boolean includeSourceFiles, boolean includeApplicationValues)
    {
        try
        {
            HPCCWsWorkUnitsClient wsWorkunitsClient = platform.getWsClient().getWsWorkunitsClient();
            try
            {
                WUInfoRequestWrapper wuinforeq = new WUInfoRequestWrapper();
                wuinforeq.setWuid(info.getWuid());
                wuinforeq.setIncludeResults(includeResults);
                wuinforeq.setIncludeGraphs(includeGraphs);
                wuinforeq.setIncludeSourceFiles(includeSourceFiles);
                wuinforeq.setIncludeApplicationValues(includeApplicationValues);
                wuinforeq.setIncludeDebugValues(false);
                wuinforeq.setIncludeExceptions(false);
                wuinforeq.setIncludeVariables(false);
                wuinforeq.setIncludeXmlSchemas(false);
                wuinforeq.setIncludeTimers(false);
                WorkunitWrapper wi = wsWorkunitsClient.getWUInfo(wuinforeq);
                if (wi != null)
                {
                    update(wi.getEclWorkunit());
                    if (wi.getResultViews() != null)
                    {
                        resultViews = Arrays.asList(wi.getResultViews());
                    }
                }
            } 
            catch (Exception ex)
            {
                //getWUInfo throws the arrayofespexceptions wrapped in an exception;
                //examine this in a catch
                //if (ex.getCause() != null && ex.getCause() instanceof ArrayOfEspException)
                if (ex.getCause() != null)
                {
                    Throwable cause = ex.getCause();
                    System.out.println(cause.getLocalizedMessage());
                    // Call succeeded, but no response...
                   // for (EspException e : ((ArrayOfEspException)ex.getCause()).getException())
                    {
                        //if (e.getCode().equals("20082") || e.getCode().equals("20080"))
                        //{ //  No longer exists... //$NON-NLS-1$ //$NON-NLS-2$
                        //    info.setStateID(999);

                        //    break;
                        //}
                    }       
                }
            }
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    /**
     * Update.
     *
     * @param wu
     *            the wu
     * @return true, if successful
     */
    // Updates ---
    public boolean update(ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && info.getWuid().equals(wu.getWuid()) && !info.equals(wu))
        {
            if (updateState(wu))
            {
                retVal = true;

            }
            if (updateOwner(wu.getOwner()))
            {
                retVal = true;

            }
            if (updateJobname(wu.getJobname()))
            {
                retVal = true;

            }
            if (updateCluster(wu.getCluster()))
            {
                retVal = true;

            }
            if (updateQuery(wu.getQuery()))
            {
                retVal = true;

            }
            if (updateApplicationValues(wu.getApplicationValues().getApplicationValue()))
            {
                retVal = true;

            }
            if (updateResults(wu.getResults().getECLResult()))
            {
                retVal = true;

            }
            if (updateGraphs(wu.getGraphs().getECLGraph()))
            {
                retVal = true;

            }
            if (updateSourceFiles(wu.getSourceFiles().getECLSourceFile()))
            {
                retVal = true;

            }
        }
        monitor();
        return retVal;
    }

    /**
     * Update state.
     *
     * @param wu
     *            the wu
     * @return true, if successful
     */
    synchronized boolean updateState(ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && info.getWuid().equals(wu.getWuid())
                && EqualsUtil.hasChanged(info.getStateID(), wu.getStateID()))
        {
            info.setStateID(wu.getStateID());
            info.setStateEx(wu.getStateEx());
            info.setState(wu.getState());

            retVal = true;
        }
        return retVal;
    }

    /**
     * Update cluster.
     *
     * @param cluster
     *            the cluster
     * @return true, if successful
     */
    synchronized boolean updateCluster(String cluster)
    {
        if (cluster != null && EqualsUtil.hasChanged(info.getCluster(), cluster))
        {
            info.setCluster(cluster);

            return true;
        }
        return false;
    }

    /**
     * Update owner.
     *
     * @param owner
     *            the owner
     * @return true, if successful
     */
    synchronized boolean updateOwner(String owner)
    {
        if (owner != null && EqualsUtil.hasChanged(info.getOwner(), owner))
        {
            info.setOwner(owner);

            return true;
        }
        return false;
    }

    /**
     * Update jobname.
     *
     * @param jobname
     *            the jobname
     * @return true, if successful
     */
    synchronized boolean updateJobname(String jobname)
    {
        if (jobname != null && EqualsUtil.hasChanged(info.getJobname(), jobname))
        {
            info.setJobname(jobname);

            return true;
        }
        return false;
    }

    /**
     * Update query.
     *
     * @param q
     *            the q
     * @return true, if successful
     */
    synchronized boolean updateQuery(ECLQuery q)
    {
        if (q != null && EqualsUtil.hasChanged(info.getQuery(), q))
        {
            info.setQuery(q);

            return true;
        }
        return false;
    }

    /**
     * Update application values.
     *
     * @param rawAppVals
     *            the raw app vals
     * @return true, if successful
     */
    synchronized boolean updateApplicationValues(ApplicationValue[] rawAppVals)
    {
        if (rawAppVals != null)
        {
            int applicationValuesCount = applicationValues.size();
            // Prime results;
            applicationValues.clear();

            //rodrigo: find out if this is eclipse specific
            for (ApplicationValue av : rawAppVals)
            {
                //if (av.getApplication().compareTo(Activator.PLUGIN_ID) == 0)
                if (av.getApplication().compareTo(Platform.API_ID) == 0)
                {
                    applicationValues.put(av.getName(), av.getValue());
                }
            }

            if (applicationValuesCount != applicationValues.size())
            {

                return true;
            }
        }
        return false;
    }

    /**
     * Update results.
     *
     * @param rawResults
     *            the raw results
     * @return true, if successful
     */
    synchronized boolean updateResults(ECLResult[] rawResults)
    {
        if (rawResults != null)
        {
            int resultCount = results.size();
            // Prime results;
            results.clear();
            for (ECLResult r : rawResults)
            {
                results.add(getResult(r)); // Will mark changed if needed ---
            }
            if (resultCount != results.size())
            {

                return true;
            }
        }
        return false;
    }

    /**
     * Update graphs.
     *
     * @param rawGraphs
     *            the raw graphs
     * @return true, if successful
     */
    synchronized boolean updateGraphs(ECLGraph[] rawGraphs)
    {
        if (rawGraphs != null)
        {
            int graphCount = graphs.size();
            // Prime graphs;
            graphs.clear();
            for (ECLGraph g : rawGraphs)
            {
                graphs.add(getGraph(g)); // Will mark changed if needed ---
            }
            if (graphCount != graphs.size())
            {

                return true;
            }
        }
        return false;
    }

    /**
     * Update source files.
     *
     * @param rawSourceFiles
     *            the raw source files
     * @return true, if successful
     */
    synchronized boolean updateSourceFiles(ECLSourceFile[] rawSourceFiles)
    {
        if (rawSourceFiles != null)
        {
            int sourceFileCount = sourceFiles.size();
            // Prime graphs;
            sourceFiles.clear();
            for (ECLSourceFile g : rawSourceFiles)
            {
                sourceFiles.add(getSourceFile(g)); // Will mark changed if needed ---
            }
            if (sourceFileCount != sourceFiles.size())
            {

                return true;
            }
        }
        return false;
    }

    /**
     * Checks if is valid WUID string.
     *
     * @param wuid
     *            the wuid
     * @return true, if is valid WUID string
     */
    static boolean isValidWUIDString(String wuid)
    {
        // W20120816-100734
        if (wuid.length() >= 16)
        {
            if (wuid.startsWith("W"))
            { //$NON-NLS-1$
                for (int i = 1; i < 8; ++i)
                {
                    if (!Character.isDigit(wuid.charAt(i))) return false;
                }
                return true;
            }
        }

        return false;
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

        if (!(aThat instanceof Workunit))
        {
            return false;
        }
        Workunit that = (Workunit) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform) && EqualsUtil.areEqual(info.getWuid(), that.info.getWuid());
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, info.getWuid());
        return result;
    }
}
