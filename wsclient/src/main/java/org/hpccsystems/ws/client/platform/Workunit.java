/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.lang.reflect.Field;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLGraph;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLQuery;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLResult;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLSourceFile;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.EspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

public class Workunit extends DataSingleton
{
    public static DataSingletonCollection All = new DataSingletonCollection();

    public static Workunit get(Platform platform, String wuid)
    {
        if (wuid == null || wuid.isEmpty())
        {
            return null;
        }

        return (Workunit) All.get(new Workunit(platform, wuid));
    }

    private Platform                platform;

    private WorkunitInfo            info;
    private Collection<String>      resultViews;
    private Collection<Result>      results;
    private Collection<Graph>       graphs;
    private Collection<LogicalFile> sourceFiles;
    private Map<String, String>     applicationValues;

    public enum Notification
    {
        WORKUNIT, CLUSTER, QUERY, APPLICATIONVALUES, RESULTS, GRAPHS, SOURCEFILES, JOBNAME, OWNER
    }

    private Workunit(Platform platform, String wuid)
    {
        this.platform = platform;
        info = new WorkunitInfo();
        info.setWuid(wuid);
        resultViews = new ArrayList<String>();
        results = new ArrayList<Result>();
        graphs = new ArrayList<Graph>();
        sourceFiles = new ArrayList<LogicalFile>();
        applicationValues = new HashMap<String, String>();
        setChanged();
    }

    public Platform getPlatform()
    {
        return platform;
    }

    public String getWuid()
    {
        return info.getWuid();
    }

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

    public static boolean isFailedState(String state) throws Exception
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
            WuStateNameMap.put("COMPILING", WUState.COMPILED);
            WuStateNameMap.put("WAIT", WUState.WAIT);
            WuStateNameMap.put("RUNNING", WUState.RUNNING);
    }

    public static WUState translateWUState(String state) throws Exception
    {
        if (WuStateNameMap.size() <= 0)
            throw new Exception("WUStates were not loaded, cannot translate");

        if (WuStateNameMap.containsKey((state.toUpperCase())))
                return WuStateNameMap.get(state.toUpperCase());
        else
            return WUState.UNKNOWN;
    }

    public String getState()
    {
        if (info.getState() == null)
        {
            fastRefresh();
        }
        return info.getState() != null ? info.getState() : "Unknown";//Messages.Unknown;
    }

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

    public String[] getResultViews()
    {
        if (resultViews == null)
        {
            fullRefresh(false, true, false, false);
        }
        return resultViews.toArray(new String[0]);
    }

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

    // Results ---
    public synchronized Result getResult(Integer sequence)
    {
        return Result.get(this, sequence);
    }

    public Result getResult(ECLResult r)
    {
        Result result = getResult(r.getSequence());
        result.update(r);
        return result;
    }

    public Result[] getResults()
    {
        fullRefresh(false, true, false, false);
        return results.toArray(new Result[0]);
    }

    // Graphs ---
    synchronized Graph getGraph(String name)
    {
        return Graph.get(this, name);
    }

    Graph getGraph(ECLGraph g)
    {
        Graph graph = getGraph(g.getName());
        graph.update(g);
        return graph;
    }

    public Graph[] getGraphs()
    {
        fullRefresh(true, false, false, false);
        return graphs.toArray(new Graph[0]);
    }

    // Source Files ---
    synchronized LogicalFile getSourceFile(String name)
    {
        return LogicalFile.get(platform, name);
    }

    LogicalFile getSourceFile(ECLSourceFile sf)
    {
        LogicalFile sourceFile = getSourceFile(sf.getName());
        sourceFile.Update(sf);
        return sourceFile;
    }

    public LogicalFile[] getSourceFiles()
    {
        fullRefresh(false, false, true, false);
        return sourceFiles.toArray(new LogicalFile[0]);
    }

    @Override
    public boolean isComplete()
    {
        return HPCCWsWorkUnitsClient.isWorkunitComplete(getStateID());
    }

    public String getJobname()
    {
        String retVal = info.getJobname();
        if (retVal == null)
        {
            return ""; //$NON-NLS-1$
        }
        return retVal;
    }

    public String getOwner()
    {
        String retVal = info.getOwner();
        if (retVal == null)
        {
            return ""; //$NON-NLS-1$
        }
        return retVal;
    }

    // Actions ---
    public void abort()
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.abortWU(info.getWuid());
            }
            catch (ArrayOfEspException e)
            {
                assert false;
                e.printStackTrace();
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

    public void delete()
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.deleteWU(info.getWuid());
                refreshState();
            }
            catch (ArrayOfEspException e)
            {
                assert false;
                e.printStackTrace();
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

    public void resubmit(boolean restart, boolean clone)
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.resubmitWU(info.getWuid(), restart, clone);
                refreshState();
            }
            catch (ArrayOfEspException e)
            {
                assert false;
                e.printStackTrace();
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

    public void resubmit()
    {
        resubmit(false, false);
    }

    public void restart()
    {
        resubmit(true, false);
    }

    public void _clone()
    {
        resubmit(false, true);
    }

    public void publish()
    {
        HPCCWsWorkUnitsClient wsWorkunitsClient;
        try
        {
            wsWorkunitsClient = platform.getWsWorkunitsClient();
            try
            {
                wsWorkunitsClient.publishWU(info.getWuid());
                refreshState();
            }
            catch (ArrayOfEspException e)
            {
                assert false;
                e.printStackTrace();
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

    // Refresh ---
    public void refreshState()
    {
        fullRefresh(false, false, false, false);
    }

    @Override
    protected void fastRefresh()
    {
        WUState previousState = getStateID();

        try
        {
            HPCCWsWorkUnitsClient wsWorkunitsClient = platform.getWsWorkunitsClient();
            WUQueryResponse response = wsWorkunitsClient.workUnitUQuery(info.getWuid(), null, null, null, null, null, null, null, null, null, 1, null, null, null, null);
            if (response.getWorkunits() != null && response.getWorkunits().length == 1)
            {
                update(response.getWorkunits()[0]);
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

    @Override
    protected void fullRefresh()
    {
        fullRefresh(true, true, true, true);
    }

    void fullRefresh(boolean includeGraphs, boolean includeResults, boolean includeSourceFiles, boolean includeApplicationValues)
    {
        try
        {
            HPCCWsWorkUnitsClient wsWorkunitsClient = platform.getWsWorkunitsClient();
            WUInfoResponse response = wsWorkunitsClient.getWUInfo(info.getWuid(), includeResults, includeGraphs, includeSourceFiles, includeApplicationValues, false, false, false, false, false);

            if (response.getWorkunit() == null)
            { // Call succeeded, but no response...
                for (EspException e : response.getExceptions().getException())
                {
                    if (e.getCode().equals("20082") || e.getCode().equals("20080"))
                    { //  No longer exists... //$NON-NLS-1$ //$NON-NLS-2$
                        info.setStateID(999);
                        setChanged();
                        notifyObservers(Notification.WORKUNIT);
                        break;
                    }
                }
            }
            else
            {
                update(response.getWorkunit());
            }

            if (response.getResultViews() != null)
            {
                resultViews = Arrays.asList(response.getResultViews());
            }
        }
        catch (ArrayOfEspException e)
        {
            assert false;
            e.printStackTrace();
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

    // Updates ---
    public boolean update(ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && info.getWuid().equals(wu.getWuid()) && !info.equals(wu))
        {
            if (updateState(wu))
            {
                retVal = true;
                notifyObservers(Notification.WORKUNIT);
            }
            if (updateOwner(wu.getOwner()))
            {
                retVal = true;
                notifyObservers(Notification.OWNER);
            }
            if (updateJobname(wu.getJobname()))
            {
                retVal = true;
                notifyObservers(Notification.JOBNAME);
            }
            if (updateCluster(wu.getCluster()))
            {
                retVal = true;
                notifyObservers(Notification.CLUSTER);
            }
            if (updateQuery(wu.getQuery()))
            {
                retVal = true;
                notifyObservers(Notification.QUERY);
            }
            if (updateApplicationValues(wu.getApplicationValues()))
            {
                retVal = true;
                notifyObservers(Notification.APPLICATIONVALUES);
            }
            if (updateResults(wu.getResults()))
            {
                retVal = true;
                notifyObservers(Notification.RESULTS);
            }
            if (updateGraphs(wu.getGraphs()))
            {
                retVal = true;
                notifyObservers(Notification.GRAPHS);
            }
            if (updateSourceFiles(wu.getSourceFiles()))
            {
                retVal = true;
                notifyObservers(Notification.SOURCEFILES);
            }
        }
        monitor();
        return retVal;
    }

    synchronized boolean updateState(ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && info.getWuid().equals(wu.getWuid())
                && EqualsUtil.hasChanged(info.getStateID(), wu.getStateID()))
        {
            info.setStateID(wu.getStateID());
            info.setStateEx(wu.getStateEx());
            info.setState(wu.getState());
            setChanged();
            retVal = true;
        }
        return retVal;
    }

    synchronized boolean updateCluster(String cluster)
    {
        if (cluster != null && EqualsUtil.hasChanged(info.getCluster(), cluster))
        {
            info.setCluster(cluster);
            setChanged();
            return true;
        }
        return false;
    }

    synchronized boolean updateOwner(String owner)
    {
        if (owner != null && EqualsUtil.hasChanged(info.getOwner(), owner))
        {
            info.setOwner(owner);
            setChanged();
            return true;
        }
        return false;
    }

    synchronized boolean updateJobname(String jobname)
    {
        if (jobname != null && EqualsUtil.hasChanged(info.getJobname(), jobname))
        {
            info.setJobname(jobname);
            setChanged();
            return true;
        }
        return false;
    }

    synchronized boolean updateQuery(ECLQuery q)
    {
        if (q != null && EqualsUtil.hasChanged(info.getQuery(), q))
        {
            info.setQuery(q);
            setChanged();
            return true;
        }
        return false;
    }

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
                setChanged();
                return true;
            }
        }
        return false;
    }

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
                setChanged();
                return true;
            }
        }
        return false;
    }

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
                setChanged();
                return true;
            }
        }
        return false;
    }

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
                setChanged();
                return true;
            }
        }
        return false;
    }

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

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, info.getWuid());
        return result;
    }
}
