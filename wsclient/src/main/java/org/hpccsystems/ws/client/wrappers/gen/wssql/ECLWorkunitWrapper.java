package org.hpccsystems.ws.client.wrappers.gen.wssql;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ECLWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class ECLWorkunitWrapper
{
    protected String local_wuid;
    protected String local_owner;
    protected String local_cluster;
    protected String local_roxieCluster;
    protected String local_jobname;
    protected String local_queue;
    protected int local_stateID;
    protected String local_state;
    protected String local_stateEx;
    protected String local_description;
    protected boolean local_protected;
    protected boolean local_active;
    protected int local_action;
    protected String local_actionEx;
    protected Calendar local_dateTimeScheduled;
    protected int local_priorityClass;
    protected int local_priorityLevel;
    protected String local_scope;
    protected String local_snapshot;
    protected int local_resultLimit;
    protected boolean local_archived;
    protected boolean local_isPausing;
    protected boolean local_thorLCR;
    protected int local_eventSchedule;
    protected String local_totalClusterTime;
    protected String local_abortBy;
    protected String local_abortTime;
    protected ECLQueryWrapper local_query;
    protected ArrayOfECLHelpFileWrapper local_helpers;
    protected ArrayOfECLExceptionWrapper local_exceptions;
    protected ArrayOfECLGraphWrapper local_graphs;
    protected ArrayOfECLSourceFileWrapper local_sourceFiles;
    protected ArrayOfECLResultWrapper local_results;
    protected ArrayOfECLResultWrapper local_variables;
    protected ArrayOfECLTimerWrapper local_timers;
    protected ArrayOfDebugValueWrapper local_debugValues;
    protected ArrayOfApplicationValueWrapper local_applicationValues;
    protected ArrayOfECLWorkflowWrapper local_workflows;
    protected ArrayOfECLTimingDataWrapper local_timingData;
    protected AllowedClusters_type0Wrapper local_allowedClusters;
    protected int local_errorCount;
    protected int local_warningCount;
    protected int local_infoCount;
    protected int local_alertCount;
    protected int local_graphCount;
    protected int local_sourceFileCount;
    protected int local_resultCount;
    protected int local_variableCount;
    protected int local_timerCount;
    protected boolean local_hasDebugValue;
    protected int local_applicationValueCount;
    protected String local_xmlParams;
    protected int local_accessFlag;
    protected int local_clusterFlag;
    protected String local_helpersDesc;
    protected String local_graphsDesc;
    protected String local_sourceFilesDesc;
    protected String local_resultsDesc;
    protected String local_variablesDesc;
    protected String local_timersDesc;
    protected String local_debugValuesDesc;
    protected String local_applicationValuesDesc;
    protected String local_workflowsDesc;
    protected boolean local_hasArchiveQuery;
    protected ArrayOfThorLogInfoWrapper local_thorLogList;
    protected ResourceURLs_type0Wrapper local_resourceURLs;
    protected int local_resultViewCount;
    protected int local_resourceURLCount;
    protected int local_debugValueCount;
    protected int local_workflowCount;
    protected int local_helpersCount;
    protected List<String> local_serviceNames = null;
    protected double local_executeCost;
    protected double local_fileAccessCost;
    protected double local_compileCost;
    protected boolean local_noAccess;
    protected ArrayOfECLWUProcessWrapper local_eCLWUProcessList;

    public ECLWorkunitWrapper() {}

    public ECLWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWorkunit eclworkunit)
    {
        copy( eclworkunit );
    }
    public ECLWorkunitWrapper( String _wuid, String _owner, String _cluster, String _roxieCluster, String _jobname, String _queue, int _stateID, String _state, String _stateEx, String _description, boolean _protected, boolean _active, int _action, String _actionEx, Calendar _dateTimeScheduled, int _priorityClass, int _priorityLevel, String _scope, String _snapshot, int _resultLimit, boolean _archived, boolean _isPausing, boolean _thorLCR, int _eventSchedule, String _totalClusterTime, String _abortBy, String _abortTime, ECLQueryWrapper _query, ArrayOfECLHelpFileWrapper _helpers, ArrayOfECLExceptionWrapper _exceptions, ArrayOfECLGraphWrapper _graphs, ArrayOfECLSourceFileWrapper _sourceFiles, ArrayOfECLResultWrapper _results, ArrayOfECLResultWrapper _variables, ArrayOfECLTimerWrapper _timers, ArrayOfDebugValueWrapper _debugValues, ArrayOfApplicationValueWrapper _applicationValues, ArrayOfECLWorkflowWrapper _workflows, ArrayOfECLTimingDataWrapper _timingData, AllowedClusters_type0Wrapper _allowedClusters, int _errorCount, int _warningCount, int _infoCount, int _alertCount, int _graphCount, int _sourceFileCount, int _resultCount, int _variableCount, int _timerCount, boolean _hasDebugValue, int _applicationValueCount, String _xmlParams, int _accessFlag, int _clusterFlag, String _helpersDesc, String _graphsDesc, String _sourceFilesDesc, String _resultsDesc, String _variablesDesc, String _timersDesc, String _debugValuesDesc, String _applicationValuesDesc, String _workflowsDesc, boolean _hasArchiveQuery, ArrayOfThorLogInfoWrapper _thorLogList, ResourceURLs_type0Wrapper _resourceURLs, int _resultViewCount, int _resourceURLCount, int _debugValueCount, int _workflowCount, int _helpersCount, List<String> _serviceNames, double _executeCost, double _fileAccessCost, double _compileCost, boolean _noAccess, ArrayOfECLWUProcessWrapper _eCLWUProcessList )
    {
        this.local_wuid = _wuid;
        this.local_owner = _owner;
        this.local_cluster = _cluster;
        this.local_roxieCluster = _roxieCluster;
        this.local_jobname = _jobname;
        this.local_queue = _queue;
        this.local_stateID = _stateID;
        this.local_state = _state;
        this.local_stateEx = _stateEx;
        this.local_description = _description;
        this.local_protected = _protected;
        this.local_active = _active;
        this.local_action = _action;
        this.local_actionEx = _actionEx;
        this.local_dateTimeScheduled = _dateTimeScheduled;
        this.local_priorityClass = _priorityClass;
        this.local_priorityLevel = _priorityLevel;
        this.local_scope = _scope;
        this.local_snapshot = _snapshot;
        this.local_resultLimit = _resultLimit;
        this.local_archived = _archived;
        this.local_isPausing = _isPausing;
        this.local_thorLCR = _thorLCR;
        this.local_eventSchedule = _eventSchedule;
        this.local_totalClusterTime = _totalClusterTime;
        this.local_abortBy = _abortBy;
        this.local_abortTime = _abortTime;
        this.local_query = _query;
        this.local_helpers = _helpers;
        this.local_exceptions = _exceptions;
        this.local_graphs = _graphs;
        this.local_sourceFiles = _sourceFiles;
        this.local_results = _results;
        this.local_variables = _variables;
        this.local_timers = _timers;
        this.local_debugValues = _debugValues;
        this.local_applicationValues = _applicationValues;
        this.local_workflows = _workflows;
        this.local_timingData = _timingData;
        this.local_allowedClusters = _allowedClusters;
        this.local_errorCount = _errorCount;
        this.local_warningCount = _warningCount;
        this.local_infoCount = _infoCount;
        this.local_alertCount = _alertCount;
        this.local_graphCount = _graphCount;
        this.local_sourceFileCount = _sourceFileCount;
        this.local_resultCount = _resultCount;
        this.local_variableCount = _variableCount;
        this.local_timerCount = _timerCount;
        this.local_hasDebugValue = _hasDebugValue;
        this.local_applicationValueCount = _applicationValueCount;
        this.local_xmlParams = _xmlParams;
        this.local_accessFlag = _accessFlag;
        this.local_clusterFlag = _clusterFlag;
        this.local_helpersDesc = _helpersDesc;
        this.local_graphsDesc = _graphsDesc;
        this.local_sourceFilesDesc = _sourceFilesDesc;
        this.local_resultsDesc = _resultsDesc;
        this.local_variablesDesc = _variablesDesc;
        this.local_timersDesc = _timersDesc;
        this.local_debugValuesDesc = _debugValuesDesc;
        this.local_applicationValuesDesc = _applicationValuesDesc;
        this.local_workflowsDesc = _workflowsDesc;
        this.local_hasArchiveQuery = _hasArchiveQuery;
        this.local_thorLogList = _thorLogList;
        this.local_resourceURLs = _resourceURLs;
        this.local_resultViewCount = _resultViewCount;
        this.local_resourceURLCount = _resourceURLCount;
        this.local_debugValueCount = _debugValueCount;
        this.local_workflowCount = _workflowCount;
        this.local_helpersCount = _helpersCount;
        this.local_serviceNames = _serviceNames;
        this.local_executeCost = _executeCost;
        this.local_fileAccessCost = _fileAccessCost;
        this.local_compileCost = _compileCost;
        this.local_noAccess = _noAccess;
        this.local_eCLWUProcessList = _eCLWUProcessList;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_owner = raw.getOwner();
        this.local_cluster = raw.getCluster();
        this.local_roxieCluster = raw.getRoxieCluster();
        this.local_jobname = raw.getJobname();
        this.local_queue = raw.getQueue();
        this.local_stateID = raw.getStateID();
        this.local_state = raw.getState();
        this.local_stateEx = raw.getStateEx();
        this.local_description = raw.getDescription();
        this.local_protected = raw.getProtected();
        this.local_active = raw.getActive();
        this.local_action = raw.getAction();
        this.local_actionEx = raw.getActionEx();
        this.local_dateTimeScheduled = raw.getDateTimeScheduled();
        this.local_priorityClass = raw.getPriorityClass();
        this.local_priorityLevel = raw.getPriorityLevel();
        this.local_scope = raw.getScope();
        this.local_snapshot = raw.getSnapshot();
        this.local_resultLimit = raw.getResultLimit();
        this.local_archived = raw.getArchived();
        this.local_isPausing = raw.getIsPausing();
        this.local_thorLCR = raw.getThorLCR();
        this.local_eventSchedule = raw.getEventSchedule();
        this.local_totalClusterTime = raw.getTotalClusterTime();
        this.local_abortBy = raw.getAbortBy();
        this.local_abortTime = raw.getAbortTime();
        if (raw.getQuery() != null)
            this.local_query = new ECLQueryWrapper( raw.getQuery());
        if (raw.getHelpers() != null)
            this.local_helpers = new ArrayOfECLHelpFileWrapper( raw.getHelpers());
        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfECLExceptionWrapper( raw.getExceptions());
        if (raw.getGraphs() != null)
            this.local_graphs = new ArrayOfECLGraphWrapper( raw.getGraphs());
        if (raw.getSourceFiles() != null)
            this.local_sourceFiles = new ArrayOfECLSourceFileWrapper( raw.getSourceFiles());
        if (raw.getResults() != null)
            this.local_results = new ArrayOfECLResultWrapper( raw.getResults());
        if (raw.getVariables() != null)
            this.local_variables = new ArrayOfECLResultWrapper( raw.getVariables());
        if (raw.getTimers() != null)
            this.local_timers = new ArrayOfECLTimerWrapper( raw.getTimers());
        if (raw.getDebugValues() != null)
            this.local_debugValues = new ArrayOfDebugValueWrapper( raw.getDebugValues());
        if (raw.getApplicationValues() != null)
            this.local_applicationValues = new ArrayOfApplicationValueWrapper( raw.getApplicationValues());
        if (raw.getWorkflows() != null)
            this.local_workflows = new ArrayOfECLWorkflowWrapper( raw.getWorkflows());
        if (raw.getTimingData() != null)
            this.local_timingData = new ArrayOfECLTimingDataWrapper( raw.getTimingData());
        if (raw.getAllowedClusters() != null)
            this.local_allowedClusters = new AllowedClusters_type0Wrapper( raw.getAllowedClusters());
        this.local_errorCount = raw.getErrorCount();
        this.local_warningCount = raw.getWarningCount();
        this.local_infoCount = raw.getInfoCount();
        this.local_alertCount = raw.getAlertCount();
        this.local_graphCount = raw.getGraphCount();
        this.local_sourceFileCount = raw.getSourceFileCount();
        this.local_resultCount = raw.getResultCount();
        this.local_variableCount = raw.getVariableCount();
        this.local_timerCount = raw.getTimerCount();
        this.local_hasDebugValue = raw.getHasDebugValue();
        this.local_applicationValueCount = raw.getApplicationValueCount();
        this.local_xmlParams = raw.getXmlParams();
        this.local_accessFlag = raw.getAccessFlag();
        this.local_clusterFlag = raw.getClusterFlag();
        this.local_helpersDesc = raw.getHelpersDesc();
        this.local_graphsDesc = raw.getGraphsDesc();
        this.local_sourceFilesDesc = raw.getSourceFilesDesc();
        this.local_resultsDesc = raw.getResultsDesc();
        this.local_variablesDesc = raw.getVariablesDesc();
        this.local_timersDesc = raw.getTimersDesc();
        this.local_debugValuesDesc = raw.getDebugValuesDesc();
        this.local_applicationValuesDesc = raw.getApplicationValuesDesc();
        this.local_workflowsDesc = raw.getWorkflowsDesc();
        this.local_hasArchiveQuery = raw.getHasArchiveQuery();
        if (raw.getThorLogList() != null)
            this.local_thorLogList = new ArrayOfThorLogInfoWrapper( raw.getThorLogList());
        if (raw.getResourceURLs() != null)
            this.local_resourceURLs = new ResourceURLs_type0Wrapper( raw.getResourceURLs());
        this.local_resultViewCount = raw.getResultViewCount();
        this.local_resourceURLCount = raw.getResourceURLCount();
        this.local_debugValueCount = raw.getDebugValueCount();
        this.local_workflowCount = raw.getWorkflowCount();
        this.local_helpersCount = raw.getHelpersCount();
        if (raw.getServiceNames() != null && raw.getServiceNames().getItem() != null)
        {
            this.local_serviceNames = new ArrayList<String>();
            for ( int i = 0; i < raw.getServiceNames().getItem().length; i++)
            {
                this.local_serviceNames.add(new String(raw.getServiceNames().getItem()[i]));
            }
        }        this.local_executeCost = raw.getExecuteCost();
        this.local_fileAccessCost = raw.getFileAccessCost();
        this.local_compileCost = raw.getCompileCost();
        this.local_noAccess = raw.getNoAccess();
        if (raw.getECLWUProcessList() != null)
            this.local_eCLWUProcessList = new ArrayOfECLWUProcessWrapper( raw.getECLWUProcessList());

    }

    @Override
    public String toString()
    {
        return "ECLWorkunitWrapper [" + "wuid = " + local_wuid + ", " + "owner = " + local_owner + ", " + "cluster = " + local_cluster + ", " + "roxieCluster = " + local_roxieCluster + ", " + "jobname = " + local_jobname + ", " + "queue = " + local_queue + ", " + "stateID = " + local_stateID + ", " + "state = " + local_state + ", " + "stateEx = " + local_stateEx + ", " + "description = " + local_description + ", " + "protected = " + local_protected + ", " + "active = " + local_active + ", " + "action = " + local_action + ", " + "actionEx = " + local_actionEx + ", " + "dateTimeScheduled = " + local_dateTimeScheduled + ", " + "priorityClass = " + local_priorityClass + ", " + "priorityLevel = " + local_priorityLevel + ", " + "scope = " + local_scope + ", " + "snapshot = " + local_snapshot + ", " + "resultLimit = " + local_resultLimit + ", " + "archived = " + local_archived + ", " + "isPausing = " + local_isPausing + ", " + "thorLCR = " + local_thorLCR + ", " + "eventSchedule = " + local_eventSchedule + ", " + "totalClusterTime = " + local_totalClusterTime + ", " + "abortBy = " + local_abortBy + ", " + "abortTime = " + local_abortTime + ", " + "query = " + local_query + ", " + "helpers = " + local_helpers + ", " + "exceptions = " + local_exceptions + ", " + "graphs = " + local_graphs + ", " + "sourceFiles = " + local_sourceFiles + ", " + "results = " + local_results + ", " + "variables = " + local_variables + ", " + "timers = " + local_timers + ", " + "debugValues = " + local_debugValues + ", " + "applicationValues = " + local_applicationValues + ", " + "workflows = " + local_workflows + ", " + "timingData = " + local_timingData + ", " + "allowedClusters = " + local_allowedClusters + ", " + "errorCount = " + local_errorCount + ", " + "warningCount = " + local_warningCount + ", " + "infoCount = " + local_infoCount + ", " + "alertCount = " + local_alertCount + ", " + "graphCount = " + local_graphCount + ", " + "sourceFileCount = " + local_sourceFileCount + ", " + "resultCount = " + local_resultCount + ", " + "variableCount = " + local_variableCount + ", " + "timerCount = " + local_timerCount + ", " + "hasDebugValue = " + local_hasDebugValue + ", " + "applicationValueCount = " + local_applicationValueCount + ", " + "xmlParams = " + local_xmlParams + ", " + "accessFlag = " + local_accessFlag + ", " + "clusterFlag = " + local_clusterFlag + ", " + "helpersDesc = " + local_helpersDesc + ", " + "graphsDesc = " + local_graphsDesc + ", " + "sourceFilesDesc = " + local_sourceFilesDesc + ", " + "resultsDesc = " + local_resultsDesc + ", " + "variablesDesc = " + local_variablesDesc + ", " + "timersDesc = " + local_timersDesc + ", " + "debugValuesDesc = " + local_debugValuesDesc + ", " + "applicationValuesDesc = " + local_applicationValuesDesc + ", " + "workflowsDesc = " + local_workflowsDesc + ", " + "hasArchiveQuery = " + local_hasArchiveQuery + ", " + "thorLogList = " + local_thorLogList + ", " + "resourceURLs = " + local_resourceURLs + ", " + "resultViewCount = " + local_resultViewCount + ", " + "resourceURLCount = " + local_resourceURLCount + ", " + "debugValueCount = " + local_debugValueCount + ", " + "workflowCount = " + local_workflowCount + ", " + "helpersCount = " + local_helpersCount + ", " + "serviceNames = " + local_serviceNames + ", " + "executeCost = " + local_executeCost + ", " + "fileAccessCost = " + local_fileAccessCost + ", " + "compileCost = " + local_compileCost + ", " + "noAccess = " + local_noAccess + ", " + "eCLWUProcessList = " + local_eCLWUProcessList + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWorkunit();
        raw.setWuid( local_wuid);
        raw.setOwner( local_owner);
        raw.setCluster( local_cluster);
        raw.setRoxieCluster( local_roxieCluster);
        raw.setJobname( local_jobname);
        raw.setQueue( local_queue);
        raw.setStateID( local_stateID);
        raw.setState( local_state);
        raw.setStateEx( local_stateEx);
        raw.setDescription( local_description);
        raw.setProtected( local_protected);
        raw.setActive( local_active);
        raw.setAction( local_action);
        raw.setActionEx( local_actionEx);
        raw.setDateTimeScheduled( local_dateTimeScheduled);
        raw.setPriorityClass( local_priorityClass);
        raw.setPriorityLevel( local_priorityLevel);
        raw.setScope( local_scope);
        raw.setSnapshot( local_snapshot);
        raw.setResultLimit( local_resultLimit);
        raw.setArchived( local_archived);
        raw.setIsPausing( local_isPausing);
        raw.setThorLCR( local_thorLCR);
        raw.setEventSchedule( local_eventSchedule);
        raw.setTotalClusterTime( local_totalClusterTime);
        raw.setAbortBy( local_abortBy);
        raw.setAbortTime( local_abortTime);
        if (local_query != null)
            raw.setQuery( local_query.getRaw());
        if (local_helpers != null)
            raw.setHelpers( local_helpers.getRaw());
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_graphs != null)
            raw.setGraphs( local_graphs.getRaw());
        if (local_sourceFiles != null)
            raw.setSourceFiles( local_sourceFiles.getRaw());
        if (local_results != null)
            raw.setResults( local_results.getRaw());
        if (local_variables != null)
            raw.setVariables( local_variables.getRaw());
        if (local_timers != null)
            raw.setTimers( local_timers.getRaw());
        if (local_debugValues != null)
            raw.setDebugValues( local_debugValues.getRaw());
        if (local_applicationValues != null)
            raw.setApplicationValues( local_applicationValues.getRaw());
        if (local_workflows != null)
            raw.setWorkflows( local_workflows.getRaw());
        if (local_timingData != null)
            raw.setTimingData( local_timingData.getRaw());
        if (local_allowedClusters != null)
            raw.setAllowedClusters( local_allowedClusters.getRaw());
        raw.setErrorCount( local_errorCount);
        raw.setWarningCount( local_warningCount);
        raw.setInfoCount( local_infoCount);
        raw.setAlertCount( local_alertCount);
        raw.setGraphCount( local_graphCount);
        raw.setSourceFileCount( local_sourceFileCount);
        raw.setResultCount( local_resultCount);
        raw.setVariableCount( local_variableCount);
        raw.setTimerCount( local_timerCount);
        raw.setHasDebugValue( local_hasDebugValue);
        raw.setApplicationValueCount( local_applicationValueCount);
        raw.setXmlParams( local_xmlParams);
        raw.setAccessFlag( local_accessFlag);
        raw.setClusterFlag( local_clusterFlag);
        raw.setHelpersDesc( local_helpersDesc);
        raw.setGraphsDesc( local_graphsDesc);
        raw.setSourceFilesDesc( local_sourceFilesDesc);
        raw.setResultsDesc( local_resultsDesc);
        raw.setVariablesDesc( local_variablesDesc);
        raw.setTimersDesc( local_timersDesc);
        raw.setDebugValuesDesc( local_debugValuesDesc);
        raw.setApplicationValuesDesc( local_applicationValuesDesc);
        raw.setWorkflowsDesc( local_workflowsDesc);
        raw.setHasArchiveQuery( local_hasArchiveQuery);
        if (local_thorLogList != null)
            raw.setThorLogList( local_thorLogList.getRaw());
        if (local_resourceURLs != null)
            raw.setResourceURLs( local_resourceURLs.getRaw());
        raw.setResultViewCount( local_resultViewCount);
        raw.setResourceURLCount( local_resourceURLCount);
        raw.setDebugValueCount( local_debugValueCount);
        raw.setWorkflowCount( local_workflowCount);
        raw.setHelpersCount( local_helpersCount);
        if (this.local_serviceNames!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_serviceNames.size(); i++)
            {
                arr.addItem(this.local_serviceNames.get(i));
            }
            raw.setServiceNames(arr);
        }
        raw.setExecuteCost( local_executeCost);
        raw.setFileAccessCost( local_fileAccessCost);
        raw.setCompileCost( local_compileCost);
        raw.setNoAccess( local_noAccess);
        if (local_eCLWUProcessList != null)
            raw.setECLWUProcessList( local_eCLWUProcessList.getRaw());
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setRoxieCluster( String _roxieCluster )
    {
        this.local_roxieCluster = _roxieCluster;
    }
    public String getRoxieCluster( )
    {
        return this.local_roxieCluster;
    }
    public void setJobname( String _jobname )
    {
        this.local_jobname = _jobname;
    }
    public String getJobname( )
    {
        return this.local_jobname;
    }
    public void setQueue( String _queue )
    {
        this.local_queue = _queue;
    }
    public String getQueue( )
    {
        return this.local_queue;
    }
    public void setStateID( int _stateID )
    {
        this.local_stateID = _stateID;
    }
    public int getStateID( )
    {
        return this.local_stateID;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setStateEx( String _stateEx )
    {
        this.local_stateEx = _stateEx;
    }
    public String getStateEx( )
    {
        return this.local_stateEx;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setProtected( boolean _protected )
    {
        this.local_protected = _protected;
    }
    public boolean getProtected( )
    {
        return this.local_protected;
    }
    public void setActive( boolean _active )
    {
        this.local_active = _active;
    }
    public boolean getActive( )
    {
        return this.local_active;
    }
    public void setAction( int _action )
    {
        this.local_action = _action;
    }
    public int getAction( )
    {
        return this.local_action;
    }
    public void setActionEx( String _actionEx )
    {
        this.local_actionEx = _actionEx;
    }
    public String getActionEx( )
    {
        return this.local_actionEx;
    }
    public void setDateTimeScheduled( Calendar _dateTimeScheduled )
    {
        this.local_dateTimeScheduled = _dateTimeScheduled;
    }
    public Calendar getDateTimeScheduled( )
    {
        return this.local_dateTimeScheduled;
    }
    public void setPriorityClass( int _priorityClass )
    {
        this.local_priorityClass = _priorityClass;
    }
    public int getPriorityClass( )
    {
        return this.local_priorityClass;
    }
    public void setPriorityLevel( int _priorityLevel )
    {
        this.local_priorityLevel = _priorityLevel;
    }
    public int getPriorityLevel( )
    {
        return this.local_priorityLevel;
    }
    public void setScope( String _scope )
    {
        this.local_scope = _scope;
    }
    public String getScope( )
    {
        return this.local_scope;
    }
    public void setSnapshot( String _snapshot )
    {
        this.local_snapshot = _snapshot;
    }
    public String getSnapshot( )
    {
        return this.local_snapshot;
    }
    public void setResultLimit( int _resultLimit )
    {
        this.local_resultLimit = _resultLimit;
    }
    public int getResultLimit( )
    {
        return this.local_resultLimit;
    }
    public void setArchived( boolean _archived )
    {
        this.local_archived = _archived;
    }
    public boolean getArchived( )
    {
        return this.local_archived;
    }
    public void setIsPausing( boolean _isPausing )
    {
        this.local_isPausing = _isPausing;
    }
    public boolean getIsPausing( )
    {
        return this.local_isPausing;
    }
    public void setThorLCR( boolean _thorLCR )
    {
        this.local_thorLCR = _thorLCR;
    }
    public boolean getThorLCR( )
    {
        return this.local_thorLCR;
    }
    public void setEventSchedule( int _eventSchedule )
    {
        this.local_eventSchedule = _eventSchedule;
    }
    public int getEventSchedule( )
    {
        return this.local_eventSchedule;
    }
    public void setTotalClusterTime( String _totalClusterTime )
    {
        this.local_totalClusterTime = _totalClusterTime;
    }
    public String getTotalClusterTime( )
    {
        return this.local_totalClusterTime;
    }
    public void setAbortBy( String _abortBy )
    {
        this.local_abortBy = _abortBy;
    }
    public String getAbortBy( )
    {
        return this.local_abortBy;
    }
    public void setAbortTime( String _abortTime )
    {
        this.local_abortTime = _abortTime;
    }
    public String getAbortTime( )
    {
        return this.local_abortTime;
    }
    public void setQuery( ECLQueryWrapper _query )
    {
        this.local_query = _query;
    }
    public ECLQueryWrapper getQuery( )
    {
        return this.local_query;
    }
    public void setHelpers( ArrayOfECLHelpFileWrapper _helpers )
    {
        this.local_helpers = _helpers;
    }
    public ArrayOfECLHelpFileWrapper getHelpers( )
    {
        return this.local_helpers;
    }
    public void setExceptions( ArrayOfECLExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfECLExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setGraphs( ArrayOfECLGraphWrapper _graphs )
    {
        this.local_graphs = _graphs;
    }
    public ArrayOfECLGraphWrapper getGraphs( )
    {
        return this.local_graphs;
    }
    public void setSourceFiles( ArrayOfECLSourceFileWrapper _sourceFiles )
    {
        this.local_sourceFiles = _sourceFiles;
    }
    public ArrayOfECLSourceFileWrapper getSourceFiles( )
    {
        return this.local_sourceFiles;
    }
    public void setResults( ArrayOfECLResultWrapper _results )
    {
        this.local_results = _results;
    }
    public ArrayOfECLResultWrapper getResults( )
    {
        return this.local_results;
    }
    public void setVariables( ArrayOfECLResultWrapper _variables )
    {
        this.local_variables = _variables;
    }
    public ArrayOfECLResultWrapper getVariables( )
    {
        return this.local_variables;
    }
    public void setTimers( ArrayOfECLTimerWrapper _timers )
    {
        this.local_timers = _timers;
    }
    public ArrayOfECLTimerWrapper getTimers( )
    {
        return this.local_timers;
    }
    public void setDebugValues( ArrayOfDebugValueWrapper _debugValues )
    {
        this.local_debugValues = _debugValues;
    }
    public ArrayOfDebugValueWrapper getDebugValues( )
    {
        return this.local_debugValues;
    }
    public void setApplicationValues( ArrayOfApplicationValueWrapper _applicationValues )
    {
        this.local_applicationValues = _applicationValues;
    }
    public ArrayOfApplicationValueWrapper getApplicationValues( )
    {
        return this.local_applicationValues;
    }
    public void setWorkflows( ArrayOfECLWorkflowWrapper _workflows )
    {
        this.local_workflows = _workflows;
    }
    public ArrayOfECLWorkflowWrapper getWorkflows( )
    {
        return this.local_workflows;
    }
    public void setTimingData( ArrayOfECLTimingDataWrapper _timingData )
    {
        this.local_timingData = _timingData;
    }
    public ArrayOfECLTimingDataWrapper getTimingData( )
    {
        return this.local_timingData;
    }
    public void setAllowedClusters( AllowedClusters_type0Wrapper _allowedClusters )
    {
        this.local_allowedClusters = _allowedClusters;
    }
    public AllowedClusters_type0Wrapper getAllowedClusters( )
    {
        return this.local_allowedClusters;
    }
    public void setErrorCount( int _errorCount )
    {
        this.local_errorCount = _errorCount;
    }
    public int getErrorCount( )
    {
        return this.local_errorCount;
    }
    public void setWarningCount( int _warningCount )
    {
        this.local_warningCount = _warningCount;
    }
    public int getWarningCount( )
    {
        return this.local_warningCount;
    }
    public void setInfoCount( int _infoCount )
    {
        this.local_infoCount = _infoCount;
    }
    public int getInfoCount( )
    {
        return this.local_infoCount;
    }
    public void setAlertCount( int _alertCount )
    {
        this.local_alertCount = _alertCount;
    }
    public int getAlertCount( )
    {
        return this.local_alertCount;
    }
    public void setGraphCount( int _graphCount )
    {
        this.local_graphCount = _graphCount;
    }
    public int getGraphCount( )
    {
        return this.local_graphCount;
    }
    public void setSourceFileCount( int _sourceFileCount )
    {
        this.local_sourceFileCount = _sourceFileCount;
    }
    public int getSourceFileCount( )
    {
        return this.local_sourceFileCount;
    }
    public void setResultCount( int _resultCount )
    {
        this.local_resultCount = _resultCount;
    }
    public int getResultCount( )
    {
        return this.local_resultCount;
    }
    public void setVariableCount( int _variableCount )
    {
        this.local_variableCount = _variableCount;
    }
    public int getVariableCount( )
    {
        return this.local_variableCount;
    }
    public void setTimerCount( int _timerCount )
    {
        this.local_timerCount = _timerCount;
    }
    public int getTimerCount( )
    {
        return this.local_timerCount;
    }
    public void setHasDebugValue( boolean _hasDebugValue )
    {
        this.local_hasDebugValue = _hasDebugValue;
    }
    public boolean getHasDebugValue( )
    {
        return this.local_hasDebugValue;
    }
    public void setApplicationValueCount( int _applicationValueCount )
    {
        this.local_applicationValueCount = _applicationValueCount;
    }
    public int getApplicationValueCount( )
    {
        return this.local_applicationValueCount;
    }
    public void setXmlParams( String _xmlParams )
    {
        this.local_xmlParams = _xmlParams;
    }
    public String getXmlParams( )
    {
        return this.local_xmlParams;
    }
    public void setAccessFlag( int _accessFlag )
    {
        this.local_accessFlag = _accessFlag;
    }
    public int getAccessFlag( )
    {
        return this.local_accessFlag;
    }
    public void setClusterFlag( int _clusterFlag )
    {
        this.local_clusterFlag = _clusterFlag;
    }
    public int getClusterFlag( )
    {
        return this.local_clusterFlag;
    }
    public void setHelpersDesc( String _helpersDesc )
    {
        this.local_helpersDesc = _helpersDesc;
    }
    public String getHelpersDesc( )
    {
        return this.local_helpersDesc;
    }
    public void setGraphsDesc( String _graphsDesc )
    {
        this.local_graphsDesc = _graphsDesc;
    }
    public String getGraphsDesc( )
    {
        return this.local_graphsDesc;
    }
    public void setSourceFilesDesc( String _sourceFilesDesc )
    {
        this.local_sourceFilesDesc = _sourceFilesDesc;
    }
    public String getSourceFilesDesc( )
    {
        return this.local_sourceFilesDesc;
    }
    public void setResultsDesc( String _resultsDesc )
    {
        this.local_resultsDesc = _resultsDesc;
    }
    public String getResultsDesc( )
    {
        return this.local_resultsDesc;
    }
    public void setVariablesDesc( String _variablesDesc )
    {
        this.local_variablesDesc = _variablesDesc;
    }
    public String getVariablesDesc( )
    {
        return this.local_variablesDesc;
    }
    public void setTimersDesc( String _timersDesc )
    {
        this.local_timersDesc = _timersDesc;
    }
    public String getTimersDesc( )
    {
        return this.local_timersDesc;
    }
    public void setDebugValuesDesc( String _debugValuesDesc )
    {
        this.local_debugValuesDesc = _debugValuesDesc;
    }
    public String getDebugValuesDesc( )
    {
        return this.local_debugValuesDesc;
    }
    public void setApplicationValuesDesc( String _applicationValuesDesc )
    {
        this.local_applicationValuesDesc = _applicationValuesDesc;
    }
    public String getApplicationValuesDesc( )
    {
        return this.local_applicationValuesDesc;
    }
    public void setWorkflowsDesc( String _workflowsDesc )
    {
        this.local_workflowsDesc = _workflowsDesc;
    }
    public String getWorkflowsDesc( )
    {
        return this.local_workflowsDesc;
    }
    public void setHasArchiveQuery( boolean _hasArchiveQuery )
    {
        this.local_hasArchiveQuery = _hasArchiveQuery;
    }
    public boolean getHasArchiveQuery( )
    {
        return this.local_hasArchiveQuery;
    }
    public void setThorLogList( ArrayOfThorLogInfoWrapper _thorLogList )
    {
        this.local_thorLogList = _thorLogList;
    }
    public ArrayOfThorLogInfoWrapper getThorLogList( )
    {
        return this.local_thorLogList;
    }
    public void setResourceURLs( ResourceURLs_type0Wrapper _resourceURLs )
    {
        this.local_resourceURLs = _resourceURLs;
    }
    public ResourceURLs_type0Wrapper getResourceURLs( )
    {
        return this.local_resourceURLs;
    }
    public void setResultViewCount( int _resultViewCount )
    {
        this.local_resultViewCount = _resultViewCount;
    }
    public int getResultViewCount( )
    {
        return this.local_resultViewCount;
    }
    public void setResourceURLCount( int _resourceURLCount )
    {
        this.local_resourceURLCount = _resourceURLCount;
    }
    public int getResourceURLCount( )
    {
        return this.local_resourceURLCount;
    }
    public void setDebugValueCount( int _debugValueCount )
    {
        this.local_debugValueCount = _debugValueCount;
    }
    public int getDebugValueCount( )
    {
        return this.local_debugValueCount;
    }
    public void setWorkflowCount( int _workflowCount )
    {
        this.local_workflowCount = _workflowCount;
    }
    public int getWorkflowCount( )
    {
        return this.local_workflowCount;
    }
    public void setHelpersCount( int _helpersCount )
    {
        this.local_helpersCount = _helpersCount;
    }
    public int getHelpersCount( )
    {
        return this.local_helpersCount;
    }
    public void setServiceNames( List<String> _serviceNames )
    {
        this.local_serviceNames = _serviceNames;
    }
    public List<String> getServiceNames( )
    {
        return this.local_serviceNames;
    }
    public void setExecuteCost( double _executeCost )
    {
        this.local_executeCost = _executeCost;
    }
    public double getExecuteCost( )
    {
        return this.local_executeCost;
    }
    public void setFileAccessCost( double _fileAccessCost )
    {
        this.local_fileAccessCost = _fileAccessCost;
    }
    public double getFileAccessCost( )
    {
        return this.local_fileAccessCost;
    }
    public void setCompileCost( double _compileCost )
    {
        this.local_compileCost = _compileCost;
    }
    public double getCompileCost( )
    {
        return this.local_compileCost;
    }
    public void setNoAccess( boolean _noAccess )
    {
        this.local_noAccess = _noAccess;
    }
    public boolean getNoAccess( )
    {
        return this.local_noAccess;
    }
    public void setECLWUProcessList( ArrayOfECLWUProcessWrapper _eCLWUProcessList )
    {
        this.local_eCLWUProcessList = _eCLWUProcessList;
    }
    public ArrayOfECLWUProcessWrapper getECLWUProcessList( )
    {
        return this.local_eCLWUProcessList;
    }
}