package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.AllowedClusters_type0;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfDebugValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLGraph;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLHelpFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLSourceFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLTimingData;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLWorkflow;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfThorLogInfo;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLGraph;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLHelpFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLSourceFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLTimingData;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkflow;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ResourceURLs_type0;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ThorLogInfo;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.DebugValueWrapper;
import org.hpccsystems.ws.client.wrappers.WUExceptionWrapper;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class WorkunitWrapper implements Comparable<org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper>
{
    private int                           maxMonitorTime      = HPCCWsWorkUnitsClient.defaultMaxWaitTime;
    private int                           sleepMillis         = HPCCWsWorkUnitsClient.defaultWaitTime;
    private List<NamedValueWrapper>       namedValues         = null;
    private String                        originalEclWatchUrl = null;
    private List<ApplicationValueWrapper> applicationValues   = new ArrayList<ApplicationValueWrapper>();
    private List<ECLResultWrapper>         eclResults          = new ArrayList<ECLResultWrapper>();
    private Integer                       accessFlag;
    private Integer                       action;
    private String                        actionEx;
    private Boolean                       active;
    private Integer                       alertcount;
    private String[]                      allowedClusters;
    private Integer                       applicationValueCount;
    private String                        applicationValuesDesc;
    private Boolean                       archived;
    private String                        cluster;
    private Integer                       clusterFlag;
    private Calendar                      dateTimeScheduled;
    private Integer                       debugValueCount;
    private List<DebugValueWrapper>       debugValues         = new ArrayList<DebugValueWrapper>();
    private String                        debugValuesDesc;
    private String                        description;
    private Integer                       errorCount;
    private Integer                       eventSchedule;
    private List<WUExceptionWrapper>      exceptions          = new ArrayList<WUExceptionWrapper>();
    private Integer                       graphCount;
    private List<ECLGraphWrapper>         graphs              = new ArrayList<ECLGraphWrapper>();
    private String                        graphsDesc;
    private Boolean                       hasArchiveQuery;
    private Boolean                       hasDebugValue;
    private List<ECLHelpFileWrapper>      helpers             = new ArrayList<ECLHelpFileWrapper>();
    private String                        helpersDesc;
    private Integer                       infoCount;
    private Boolean                       isPausing           = false;
    private Boolean                       isProtected         = false;
    private String                        jobname;
    private String                        owner;
    private Integer                       priorityClass;
    private Integer                       priorityLevel;
    private ECLQueryWrapper               query;
    private String                        queue;
    private Integer                       resourceURLCount;
    private String[]                      resourceURLs;
    private Integer                       resultCount;
    private Integer                       resultLimit;
    private String                        resultsDesc;
    private String                        roxieCluster;
    private String                        scope;
    private String                        snapshot;
    private List<ECLSourceFileWrapper>    sourceFiles         = new ArrayList<ECLSourceFileWrapper>();
    private String                        sourceFilelsDesc;
    private String                        state;
    private String                        stateEx;
    private Integer                       stateID;
    private Integer                       sourceFileCount;
    private String                        sourceFileDesc;
    private Integer                       timerCount;
    private String                        timersDesc;
    private List<ECLTimingDataWrapper>    timingData          = new ArrayList<ECLTimingDataWrapper>();
    private String                        totalClusterTime;
    private Integer                       variableCount;
    private List<ECLResultWrapper>         variables;
    private boolean                       thorLCR;
    private List<ThorLogInfoWrapper>      thorLogList         = new ArrayList<ThorLogInfoWrapper>();
    private String                        variablesDesc;
    private Integer                       warningCount;
    private Integer                       workflowCount;
    private List<ECLWorkflowWrapper>      workflows           = new ArrayList<ECLWorkflowWrapper>();
    private String                        workflowsDesc;
    private String                        wuid;
    private String                        xmlParams;
    private String[]                      resultViews;

    public WorkunitWrapper()
    {
    }

    public WorkunitWrapper(ECLWorkunit base)
    {
        copy(base);
    }

    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit base)
    {
        copy(base);
    }

    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLWorkunit base)
    {
        copy(base);
    }

    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLWorkunit base)
    {
        copy(base);
    }

    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit base)
    {
        copy(base);
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit base)
    {
        if (base == null)
        {
            return;
        }

        this.setAccessFlag(base.getAccessFlag());
        this.setAction(base.getAction());
        this.setActionEx(base.getActionEx());
        this.setActive(base.getActive());
        this.setAlertCount(base.getAlertCount());
        if (base.getAllowedClusters() != null)
            this.setAllowedClusters(base.getAllowedClusters().getAllowedCluster());
        this.setApplicationValueCount(base.getApplicationValueCount());
        if (base.getApplicationValues() != null)
            this.setApplicationValues(base.getApplicationValues().getApplicationValue());
        this.setApplicationValuesDesc(base.getApplicationValuesDesc());
        this.setArchived(base.getArchived());
        this.setCluster(base.getCluster());
        this.setClusterFlag(base.getClusterFlag());
        this.setDateTimeScheduled(base.getDateTimeScheduled());
        this.setDebugValueCount(base.getDebugValueCount());
        if (base.getDebugValues() != null)
            this.setDebugValues(base.getDebugValues().getDebugValue());
        this.setDebugValuesDesc(base.getDebugValuesDesc());
        this.setDescription(base.getDescription());
        this.setErrorCount(base.getErrorCount());
        this.setEventSchedule(base.getEventSchedule());
        if (base.getExceptions() != null)
            this.setExceptions(base.getExceptions().getECLException());
        this.setGraphCount(base.getGraphCount());
        this.setGraphsDesc(base.getGraphsDesc());
        if (base.getGraphs() != null)
            this.setGraphs(base.getGraphs().getECLGraph());
        this.setHasArchiveQuery(base.getHasArchiveQuery());
        this.setHasDebugValue(base.getHasDebugValue());
        if (base.getHelpers() != null)
            this.setHelpers(base.getHelpers().getECLHelpFile());
        this.setHelpersDesc(base.getHelpersDesc());
        this.setInfoCount(base.getInfoCount());
        this.setIsPausing(base.getIsPausing());
        this.setJobname(base.getJobname());
        this.setOwner(base.getOwner());
        this.setPriorityClass(base.getPriorityClass());
        this.setPriorityLevel(base.getPriorityLevel());
        this.setProtected(base.getProtected());
        this.setQuery(base.getQuery());
        this.setQueue(base.getQueue());
        this.setResourceURLCount(base.getResourceURLCount());
        if (base.getResourceURLs() != null)
            this.setResourceURLs(base.getResourceURLs().getURL());
        this.setResultCount(base.getResultCount());
        this.setResultLimit(base.getResultLimit());
        setResults(base.getResults());
        this.setResultsDesc(base.getResultsDesc());
        this.setRoxieCluster(base.getRoxieCluster());
        this.setScope(base.getScope());
        this.setSnapshot(base.getSnapshot());
        this.setSourceFileCount(base.getSourceFileCount());
        if (base.getSourceFiles() != null)
            this.setSourceFiles(base.getSourceFiles().getECLSourceFile());
        this.setSourceFilesDesc(base.getSourceFilesDesc());
        this.setState(base.getState());
        this.setStateEx(base.getStateEx());
        this.setStateID(base.getStateID());
        this.setTimerCount(base.getTimerCount());
        this.setTimersDesc(base.getTimersDesc());
        if (base.getTimingData() != null)
            this.setTimingData(base.getTimingData().getECLTimingData());
        this.setTotalClusterTime(base.getTotalClusterTime());
        this.setVariableCount(base.getVariableCount());
        setVariables(base.getVariables());
        this.setThorLCR(base.getThorLCR());
        if (base.getThorLogList() != null)
            this.setThorLogList(base.getThorLogList().getThorLogInfo());
        this.setVariablesDesc(base.getVariablesDesc());
        this.setWarningCount(base.getWarningCount());
        this.setWorkflowCount(base.getWorkflowCount());
        if (base.getWorkflows() != null)
            this.setWorkflows(base.getWorkflows().getECLWorkflow());
        this.setWorkflowsDesc(base.getWorkflowsDesc());
        this.setWuid(base.getWuid());
        this.setXmlParams(base.getXmlParams());
    }

    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    public WorkunitWrapper setResults(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.eclResults = new ArrayList<ECLResultWrapper>();
            for (int i = 0; i < eclResultArray.length; i++)
            {
                eclResults.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setWorkflows(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkflow[] eclWorkflowArray)
    {
        this.workflows.clear();
        if (eclWorkflowArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclWorkflowArray.length; i++)
        {
            this.workflows.add(new ECLWorkflowWrapper(eclWorkflowArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setThorLogList(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ThorLogInfo[] thorLogInfoArray)
    {
        this.thorLogList.clear();
        if (thorLogInfoArray == null)
        {
            return this;
        }
        for (int i = 0; i < thorLogInfoArray.length; i++)
        {
            this.thorLogList.add(new ThorLogInfoWrapper(thorLogInfoArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setVariables(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.variables = new ArrayList<ECLResultWrapper>();

            for (int i = 0; i < eclResultArray.length; i++)
            {
                variables.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setTimingData(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLTimingData[] eclTimingDatas)
    {
        this.timingData.clear();
        if (eclTimingDatas == null)
        {
            return this;
        }
        for (int i = 0; i < eclTimingDatas.length; i++)
        {
            this.timingData.add(new ECLTimingDataWrapper(eclTimingDatas[i]));
        }
        return this;
    }

    public WorkunitWrapper setSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLSourceFile[] eclSourceFileArray)
    {
        this.sourceFiles.clear();
        if (eclSourceFileArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            this.sourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setHelpers(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLHelpFile[] eclHelpFileArray)
    {
        this.helpers.clear();
        if (eclHelpFileArray != null)
        {
            for (int i = 0; i < eclHelpFileArray.length; i++)
            {
                this.helpers.add(new ECLHelpFileWrapper(eclHelpFileArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setGraphs(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLGraph[] eclGraphArray)
    {
        this.getGraphs().clear();
        if (eclGraphArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclGraphArray.length; i++)
        {
            this.getGraphs().add(new ECLGraphWrapper(eclGraphArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            this.exceptions = new ArrayList<WUExceptionWrapper>();
            for (int i = 0; i < eclExceptions.length; i++)
            {
                this.exceptions.add(new WUExceptionWrapper(eclExceptions[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setDebugValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.DebugValue[] debugValueArray)
    {
        this.debugValues.clear();
        if (debugValueArray == null)
        {
            return this;
        }

        for (int i = 0; i < debugValueArray.length; i++)
        {
            this.debugValues.add(new DebugValueWrapper(debugValueArray[i]));
        }
        return this;
        
    }

    public WorkunitWrapper setApplicationValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ApplicationValue[] applicationValue)
    {
        if (applicationValue != null)
        {
            applicationValues = new ArrayList<ApplicationValueWrapper>();
            for (int i = 0; i < applicationValue.length; i++)
            {
                applicationValues.add(new ApplicationValueWrapper(applicationValue[i]));
            }
        }

        return this;
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLWorkunit base)
    {
        if (base == null)
        {
            return;
        }

        this.setAccessFlag(base.getAccessFlag());
        this.setAction(base.getAction());
        this.setActionEx(base.getActionEx());
        this.setActive(base.getActive());
        this.setAlertCount(base.getAlertCount());
        if (base.getAllowedClusters() != null) this.setAllowedClusters(base.getAllowedClusters().getAllowedCluster());
        this.setApplicationValueCount(base.getApplicationValueCount());
        if (base.getApplicationValues() != null) this.setApplicationValues(base.getApplicationValues().getApplicationValue());
        this.setApplicationValuesDesc(base.getApplicationValuesDesc());
        this.setArchived(base.getArchived());
        this.setCluster(base.getCluster());
        this.setClusterFlag(base.getClusterFlag());
        this.setDateTimeScheduled(base.getDateTimeScheduled());
        this.setDebugValueCount(base.getDebugValueCount());
        if (base.getDebugValues() != null) this.setDebugValues(base.getDebugValues().getDebugValue());
        this.setDebugValuesDesc(base.getDebugValuesDesc());
        this.setDescription(base.getDescription());
        this.setErrorCount(base.getErrorCount());
        this.setEventSchedule(base.getEventSchedule());
        if (base.getExceptions() != null) this.setExceptions(base.getExceptions().getECLException());
        this.setGraphCount(base.getGraphCount());
        this.setGraphsDesc(base.getGraphsDesc());
        if (base.getGraphs() != null) this.setGraphs(base.getGraphs().getECLGraph());
        this.setHasArchiveQuery(base.getHasArchiveQuery());
        this.setHasDebugValue(base.getHasDebugValue());
        if (base.getHelpers() != null) this.setHelpers(base.getHelpers().getECLHelpFile());
        this.setHelpersDesc(base.getHelpersDesc());
        this.setInfoCount(base.getInfoCount());
        this.setIsPausing(base.getIsPausing());
        this.setJobname(base.getJobname());
        this.setOwner(base.getOwner());
        this.setPriorityClass(base.getPriorityClass());
        this.setPriorityLevel(base.getPriorityLevel());
        this.setProtected(base.getProtected());
        this.setQuery(base.getQuery());
        this.setQueue(base.getQueue());
        this.setResourceURLCount(base.getResourceURLCount());
        if (base.getResourceURLs() != null) this.setResourceURLs(base.getResourceURLs().getURL());
        this.setResultCount(base.getResultCount());
        this.setResultLimit(base.getResultLimit());
        setResults(base.getResults());
        this.setResultsDesc(base.getResultsDesc());
        this.setRoxieCluster(base.getRoxieCluster());
        this.setScope(base.getScope());
        this.setSnapshot(base.getSnapshot());
        this.setSourceFileCount(base.getSourceFileCount());
        if (base.getSourceFiles() != null) this.setSourceFiles(base.getSourceFiles().getECLSourceFile());
        this.setSourceFilesDesc(base.getSourceFilesDesc());
        this.setState(base.getState());
        this.setStateEx(base.getStateEx());
        this.setStateID(base.getStateID());
        this.setTimerCount(base.getTimerCount());
        this.setTimersDesc(base.getTimersDesc());
        if (base.getTimingData() != null) this.setTimingData(base.getTimingData().getECLTimingData());
        this.setTotalClusterTime(base.getTotalClusterTime());
        this.setVariableCount(base.getVariableCount());
        setVariables(base.getVariables());
        this.setThorLCR(base.getThorLCR());
        if (base.getThorLogList() != null) this.setThorLogList(base.getThorLogList().getThorLogInfo());
        this.setVariablesDesc(base.getVariablesDesc());
        this.setWarningCount(base.getWarningCount());
        this.setWorkflowCount(base.getWorkflowCount());
        if (base.getWorkflows() != null) this.setWorkflows(base.getWorkflows().getECLWorkflow());
        this.setWorkflowsDesc(base.getWorkflowsDesc());
        this.setWuid(base.getWuid());
        this.setXmlParams(base.getXmlParams());
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLWorkunit base)
    {
        if (base == null)
        {
            return;
        }

        this.setAccessFlag(base.getAccessFlag());
        this.setAction(base.getAction());
        this.setActionEx(base.getActionEx());
        this.setActive(base.getActive());
        this.setAlertCount(base.getAlertCount());
        if (base.getAllowedClusters() != null) this.setAllowedClusters(base.getAllowedClusters().getAllowedCluster());
        this.setApplicationValueCount(base.getApplicationValueCount());
        if (base.getApplicationValues() != null) this.setApplicationValues(base.getApplicationValues().getApplicationValue());
        this.setApplicationValuesDesc(base.getApplicationValuesDesc());
        this.setArchived(base.getArchived());
        this.setCluster(base.getCluster());
        this.setClusterFlag(base.getClusterFlag());
        this.setDateTimeScheduled(base.getDateTimeScheduled());
        this.setDebugValueCount(base.getDebugValueCount());
        if (base.getDebugValues() != null) this.setDebugValues(base.getDebugValues().getDebugValue());
        this.setDebugValuesDesc(base.getDebugValuesDesc());
        this.setDescription(base.getDescription());
        this.setErrorCount(base.getErrorCount());
        this.setEventSchedule(base.getEventSchedule());
        if (base.getExceptions() != null) this.setExceptions(base.getExceptions().getECLException());
        this.setGraphCount(base.getGraphCount());
        this.setGraphsDesc(base.getGraphsDesc());
        if (base.getGraphs() != null) this.setGraphs(base.getGraphs().getECLGraph());
        this.setHasArchiveQuery(base.getHasArchiveQuery());
        this.setHasDebugValue(base.getHasDebugValue());
        if (base.getHelpers() != null) this.setHelpers(base.getHelpers().getECLHelpFile());
        this.setHelpersDesc(base.getHelpersDesc());
        this.setInfoCount(base.getInfoCount());
        this.setIsPausing(base.getIsPausing());
        this.setJobname(base.getJobname());
        this.setOwner(base.getOwner());
        this.setPriorityClass(base.getPriorityClass());
        this.setPriorityLevel(base.getPriorityLevel());
        this.setProtected(base.getProtected());
        this.setQuery(base.getQuery());
        this.setQueue(base.getQueue());
        this.setResourceURLCount(base.getResourceURLCount());
        if (base.getResourceURLs() != null) this.setResourceURLs(base.getResourceURLs().getURL());
        this.setResultCount(base.getResultCount());
        this.setResultLimit(base.getResultLimit());
        setResults(base.getResults());
        this.setResultsDesc(base.getResultsDesc());
        this.setRoxieCluster(base.getRoxieCluster());
        this.setScope(base.getScope());
        this.setSnapshot(base.getSnapshot());
        this.setSourceFileCount(base.getSourceFileCount());
        if (base.getSourceFiles() != null) this.setSourceFiles(base.getSourceFiles().getECLSourceFile());
        this.setSourceFilesDesc(base.getSourceFilesDesc());
        this.setState(base.getState());
        this.setStateEx(base.getStateEx());
        this.setStateID(base.getStateID());
        this.setTimerCount(base.getTimerCount());
        this.setTimersDesc(base.getTimersDesc());
        if (base.getTimingData() != null) this.setTimingData(base.getTimingData().getECLTimingData());
        this.setTotalClusterTime(base.getTotalClusterTime());
        this.setVariableCount(base.getVariableCount());
        setVariables(base.getVariables());
        this.setThorLCR(base.getThorLCR());
        if (base.getThorLogList() != null) this.setThorLogList(base.getThorLogList().getThorLogInfo());
        this.setVariablesDesc(base.getVariablesDesc());
        this.setWarningCount(base.getWarningCount());
        this.setWorkflowCount(base.getWorkflowCount());
        if (base.getWorkflows() != null) this.setWorkflows(base.getWorkflows().getECLWorkflow());
        this.setWorkflowsDesc(base.getWorkflowsDesc());
        this.setWuid(base.getWuid());
        this.setXmlParams(base.getXmlParams());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper wu)
    {
        if (wu == null || wu.getWuid() == null)
        {
            return 0;
        }
        else
        {
            // by default, sort by wuid descending, like ECL Watch
            return wu.getWuid().compareTo(this.getWuid());
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("wuid:").append(String.valueOf(getWuid())).append("\n");
        sb.append("owner:").append(String.valueOf(getOwner())).append("\n");
        sb.append("cluster:").append(String.valueOf(getCluster())).append("\n");
        sb.append("roxieCluster:").append(String.valueOf(getRoxieCluster())).append("\n");
        sb.append("jobname:").append(String.valueOf(getJobname())).append("\n");
        sb.append("queue:").append(String.valueOf(getQueue())).append("\n");
        sb.append(" stateID:").append(String.valueOf(getStateID())).append("\n");
        sb.append("state:").append(String.valueOf(getState())).append("\n");
        sb.append("stateEx:").append(String.valueOf(getStateEx())).append("\n");
        sb.append("description:").append(String.valueOf(getDescription())).append("\n");
        sb.append(" action:").append(String.valueOf(getAction())).append("\n");
        sb.append("actionEx:").append(String.valueOf(getActionEx())).append("\n");
        sb.append("dateTimeScheduled:").append(String.valueOf(getDateTimeScheduled())).append("\n");
        sb.append(" priorityClass:").append(String.valueOf(getPriorityClass())).append("\n");
        sb.append(" priorityLevel:").append(String.valueOf(getPriorityLevel())).append("\n");
        sb.append("scope:").append(String.valueOf(getScope())).append("\n");
        sb.append("snapshot:").append(String.valueOf(getSnapshot())).append("\n");
        sb.append(" resultLimit:").append(String.valueOf(getResultLimit())).append("\n");
        sb.append(" eventSchedule:").append(String.valueOf(getEventSchedule())).append("\n");
        sb.append("totalThorTime:").append(String.valueOf(getTotalClusterTime())).append("\n");
        sb.append(" errorCount:").append(String.valueOf(getErrorCount())).append("\n");
        sb.append(" warningCount:").append(String.valueOf(getWarningCount())).append("\n");
        sb.append(" infoCount:").append(String.valueOf(getInfoCount())).append("\n");
        sb.append(" graphCount:").append(String.valueOf(getGraphCount())).append("\n");
        sb.append(" sourceFileCount:").append(String.valueOf(getSourceFileCount())).append("\n");
        sb.append(" resultCount:").append(String.valueOf(getResultCount())).append("\n");
        sb.append(" variableCount:").append(String.valueOf(getVariableCount())).append("\n");
        sb.append(" timerCount:").append(String.valueOf(getTimerCount())).append("\n");
        sb.append("hasDebugValue:").append(String.valueOf(this.getHasDebugValue())).append("\n");
        sb.append(" applicationValueCount:").append(String.valueOf(getApplicationValueCount())).append("\n");
        sb.append("xmlParams:").append(String.valueOf(getXmlParams())).append("\n");
        sb.append(" accessFlag:").append(String.valueOf(getAccessFlag())).append("\n");
        sb.append(" clusterFlag:").append(String.valueOf(getClusterFlag())).append("\n");
        sb.append("helpersDesc:").append(String.valueOf(getHelpersDesc())).append("\n");
        sb.append("graphsDesc:").append(String.valueOf(getGraphsDesc())).append("\n");
        sb.append("sourceFilesDesc:").append(String.valueOf(getSourceFilesDesc())).append("\n");
        sb.append("resultsDesc:").append(String.valueOf(getResultsDesc())).append("\n");
        sb.append("variablesDesc:").append(String.valueOf(getVariablesDesc())).append("\n");
        sb.append("timersDesc:").append(String.valueOf(getTimersDesc())).append("\n");
        sb.append("debugValuesDesc:").append(String.valueOf(getDebugValuesDesc())).append("\n");
        sb.append("applicationValuesDesc:").append(String.valueOf(getApplicationValuesDesc())).append("\n");
        sb.append("workflowsDesc:").append(String.valueOf(getWorkflowsDesc())).append("\n");
        sb.append("hasArchiveQuery:").append(String.valueOf(this.getHasArchiveQuery())).append("\n");
        // TODO: include the content of unappended objects to the string
        return sb.toString();
    }

    /**
     * Copy a soap ecl workunit object into the wrapper
     *
     * @param base
     */
    private void copy(ECLWorkunit base)
    {
        if (base == null)
        {
            return;
        }

        this.setAccessFlag(base.getAccessFlag());
        this.setAction(base.getAction());
        this.setActionEx(base.getActionEx());
        this.setActive(base.getActive());
        this.setAlertCount(base.getAlertCount());
        if (base.getAllowedClusters() != null) this.setAllowedClusters(base.getAllowedClusters().getAllowedCluster());
        this.setApplicationValueCount(base.getApplicationValueCount());
        if (base.getApplicationValues() != null) this.setApplicationValues(base.getApplicationValues().getApplicationValue());
        this.setApplicationValuesDesc(base.getApplicationValuesDesc());
        this.setArchived(base.getArchived());
        this.setCluster(base.getCluster());
        this.setClusterFlag(base.getClusterFlag());
        this.setDateTimeScheduled(base.getDateTimeScheduled());
        this.setDebugValueCount(base.getDebugValueCount());
        if (base.getDebugValues() != null) this.setDebugValues(base.getDebugValues().getDebugValue());
        this.setDebugValuesDesc(base.getDebugValuesDesc());
        this.setDescription(base.getDescription());
        this.setErrorCount(base.getErrorCount());
        this.setEventSchedule(base.getEventSchedule());
        if (base.getExceptions() != null) this.setExceptions(base.getExceptions().getECLException());
        this.setGraphCount(base.getGraphCount());
        if (base.getGraphs() != null) this.setGraphs(base.getGraphs().getECLGraph());
        this.setGraphsDesc(base.getGraphsDesc());
        this.setHasArchiveQuery(base.getHasArchiveQuery());
        this.setHasDebugValue(base.getHasDebugValue());
        if (base.getHelpers() != null) this.setHelpers(base.getHelpers().getECLHelpFile());
        this.setHelpersDesc(base.getHelpersDesc());
        this.setInfoCount(base.getInfoCount());
        this.setIsPausing(base.getIsPausing());
        this.setJobname(base.getJobname());
        this.setOwner(base.getOwner());
        this.setPriorityClass(base.getPriorityClass());
        this.setPriorityLevel(base.getPriorityLevel());
        this.setProtected(base.getProtected());
        this.setQuery(base.getQuery());
        this.setQueue(base.getQueue());
        this.setResourceURLCount(base.getResourceURLCount());
        if (base.getResourceURLs() != null) this.setResourceURLs(base.getResourceURLs().getURL());
        this.setResultCount(base.getResultCount());
        this.setResultLimit(base.getResultLimit());
        setResults(base.getResults());
        this.setResultsDesc(base.getResultsDesc());
        this.setRoxieCluster(base.getRoxieCluster());
        this.setScope(base.getScope());
        this.setSnapshot(base.getSnapshot());
        this.setSourceFileCount(base.getSourceFileCount());
        if (base.getSourceFiles() != null) this.setSourceFiles(base.getSourceFiles().getECLSourceFile());
        this.setSourceFilesDesc(base.getSourceFilesDesc());
        this.setState(base.getState());
        this.setStateEx(base.getStateEx());
        this.setStateID(base.getStateID());
        this.setTimerCount(base.getTimerCount());
        this.setTimersDesc(base.getTimersDesc());
        if (base.getTimingData() != null) this.setTimingData(base.getTimingData().getECLTimingData());
        this.setTotalClusterTime(base.getTotalClusterTime());
        this.setVariableCount(base.getVariableCount());
        setVariables(base.getVariables());
        this.setThorLCR(base.getThorLCR());
        if (base.getThorLogList() != null) this.setThorLogList(base.getThorLogList().getThorLogInfo());
        this.setVariablesDesc(base.getVariablesDesc());
        this.setWarningCount(base.getWarningCount());
        this.setWorkflowCount(base.getWorkflowCount());
        if (base.getWorkflows() != null) this.setWorkflows(base.getWorkflows().getECLWorkflow());
        this.setWorkflowsDesc(base.getWorkflowsDesc());
        this.setWuid(base.getWuid());
        this.setXmlParams(base.getXmlParams());
    }

    private void setProtected(Boolean get_protected)
    {
        this.isProtected = get_protected;
    }

    /**
     * Copy a soap ecl workunit object into the wrapper
     *
     * @param base
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit base)
    {
        if (base == null)
        {
            return;
        }
        this.setAccessFlag(base.getAccessFlag());
        this.setAction(base.getAction());
        this.setActionEx(base.getActionEx());
        this.setActive(base.getActive());
        this.setAlertCount(base.getAlertCount());
        if (base.getAllowedClusters() != null) this.setAllowedClusters(base.getAllowedClusters().getAllowedCluster());
        this.setApplicationValueCount(base.getApplicationValueCount());
        if (base.getApplicationValues() != null) this.setApplicationValues(base.getApplicationValues().getApplicationValue());
        this.setApplicationValuesDesc(base.getApplicationValuesDesc());
        this.setArchived(base.getArchived());
        this.setCluster(base.getCluster());
        this.setClusterFlag(base.getClusterFlag());
        this.setDateTimeScheduled(base.getDateTimeScheduled());
        this.setDebugValueCount(base.getDebugValueCount());
        if (base.getDebugValues() != null) this.setDebugValues(base.getDebugValues().getDebugValue());
        this.setDebugValuesDesc(base.getDebugValuesDesc());
        this.setDescription(base.getDescription());
        this.setErrorCount(base.getErrorCount());
        this.setEventSchedule(base.getEventSchedule());
        if (base.getExceptions() != null) this.setExceptions(base.getExceptions().getECLException());
        this.setGraphCount(base.getGraphCount());
        this.setGraphsDesc(base.getGraphsDesc());
        if (base.getGraphs() != null) this.setGraphs(base.getGraphs().getECLGraph());
        this.setHasArchiveQuery(base.getHasArchiveQuery());
        this.setHasDebugValue(base.getHasDebugValue());
        if (base.getHelpers() != null) this.setHelpers(base.getHelpers().getECLHelpFile());
        this.setHelpersDesc(base.getHelpersDesc());
        this.setInfoCount(base.getInfoCount());
        this.setIsPausing(base.getIsPausing());
        this.setJobname(base.getJobname());
        this.setOwner(base.getOwner());
        this.setPriorityClass(base.getPriorityClass());
        this.setPriorityLevel(base.getPriorityLevel());
        this.setProtected(base.getProtected());
        this.setQuery(base.getQuery());
        this.setQueue(base.getQueue());
        this.setResourceURLCount(base.getResourceURLCount());
        if (base.getResourceURLs() != null) this.setResourceURLs(base.getResourceURLs().getURL());
        this.setResultCount(base.getResultCount());
        this.setResultLimit(base.getResultLimit());
        setResults(base.getResults());
        this.setResultsDesc(base.getResultsDesc());
        this.setRoxieCluster(base.getRoxieCluster());
        this.setScope(base.getScope());
        this.setSnapshot(base.getSnapshot());
        this.setSourceFileCount(base.getSourceFileCount());
        if (base.getSourceFiles() != null) this.setSourceFiles(base.getSourceFiles().getECLSourceFile());
        this.setSourceFilesDesc(base.getSourceFilesDesc());
        this.setState(base.getState());
        this.setStateEx(base.getStateEx());
        this.setStateID(base.getStateID());
        this.setTimerCount(base.getTimerCount());
        this.setTimersDesc(base.getTimersDesc());
        if (base.getTimingData() != null) this.setTimingData(base.getTimingData().getECLTimingData());
        this.setTotalClusterTime(base.getTotalClusterTime());
        this.setVariableCount(base.getVariableCount());
        setVariables(base.getVariables());
        this.setThorLCR(base.getThorLCR());
        if (base.getThorLogList() != null) this.setThorLogList(base.getThorLogList().getThorLogInfo());
        this.setVariablesDesc(base.getVariablesDesc());
        this.setWarningCount(base.getWarningCount());
        this.setWorkflowCount(base.getWorkflowCount());
        if (base.getWorkflows() != null) this.setWorkflows(base.getWorkflows().getECLWorkflow());
        this.setWorkflowsDesc(base.getWorkflowsDesc());
        this.setWuid(base.getWuid());
        this.setXmlParams(base.getXmlParams());
    }

    public WorkunitWrapper setVariables(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.variables = new ArrayList<ECLResultWrapper>();

            for (int i = 0; i < eclResultArray.length; i++)
            {
                variables.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setVariables(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.variables = new ArrayList<ECLResultWrapper>();

            for (int i = 0; i < eclResultArray.length; i++)
            {
                variables.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setVariables(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.variables = new ArrayList<ECLResultWrapper>();

            for (int i = 0; i < eclResultArray.length; i++)
            {
                variables.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setVariables(ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.variables = new ArrayList<ECLResultWrapper>();

            for (int i = 0; i < eclResultArray.length; i++)
            {
                variables.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setResults(ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.eclResults = new ArrayList<ECLResultWrapper>();
            for (int i = 0; i < eclResultArray.length; i++)
            {
                eclResults.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setResults(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.eclResults = new ArrayList<ECLResultWrapper>();
            for (int i = 0; i < eclResultArray.length; i++)
            {
                eclResults.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setResults(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.eclResults = new ArrayList<ECLResultWrapper>();
            for (int i = 0; i < eclResultArray.length; i++)
            {
                eclResults.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setResults(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfECLResult arrayOfECLResult)
    {
        if (arrayOfECLResult != null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLResult[] eclResultArray = arrayOfECLResult.getECLResult();
            this.eclResults = new ArrayList<ECLResultWrapper>();
            for (int i = 0; i < eclResultArray.length; i++)
            {
                eclResults.add(new ECLResultWrapper(eclResultArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setGraphs(ECLGraph[] eclGraphs)
    {
        this.getGraphs().clear();
        if (eclGraphs == null)
        {
            return this;
        }
        for (int i = 0; i < eclGraphs.length; i++)
        {
            this.getGraphs().add(new ECLGraphWrapper(eclGraphs[i]));
        }
        return this;
    }

    public WorkunitWrapper setGraphs(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLGraph[] eclGraphArray)
    {
        this.getGraphs().clear();
        if (eclGraphArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclGraphArray.length; i++)
        {
            this.getGraphs().add(new ECLGraphWrapper(eclGraphArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setGraphs(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLGraph[] eclGraphArray)
    {
        this.getGraphs().clear();
        if (eclGraphArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclGraphArray.length; i++)
        {
            this.getGraphs().add(new ECLGraphWrapper(eclGraphArray[i]));
        }
        return this;

    }

    public WorkunitWrapper setGraphs(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLGraph[] eclGraphArray)
    {
        this.getGraphs().clear();
        if (eclGraphArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclGraphArray.length; i++)
        {
            this.getGraphs().add(new ECLGraphWrapper(eclGraphArray[i]));
        }
        return this;

    }

    public WorkunitWrapper setQuery(ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    public boolean update(ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && this.getWuid().equals(wu.getWuid()) && !this.equals(wu))
        {
            if (updateState(wu))
            {
                retVal = true;
            }
        }
        return retVal;
    }

    public boolean update(WorkunitWrapper wu)
    {
        boolean retVal = false;
        if (wu != null && this.getWuid().equals(wu.getWuid()) && !this.equals(wu))
        {
            if (updateState(wu))
            {
                retVal = true;
            }
        }
        return retVal;
    }

    synchronized boolean updateState(ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && this.getWuid().equals(wu.getWuid()))// && this.compareTo(wu))
        {
            this.setStateID(wu.getStateID());
            this.setStateEx(wu.getStateEx());
            this.setState(wu.getState());
            // setChanged();
            retVal = true;
        }
        return retVal;
    }

    synchronized boolean updateState(WorkunitWrapper wu)
    {
        boolean retVal = false;
        if (wu != null && this.getWuid().equals(wu.getWuid()))// && this.compareTo(wu))
        {
            this.setStateID(wu.getStateID());
            this.setStateEx(wu.getStateEx());
            this.setState(wu.getState());
            // setChanged();
            retVal = true;
        }
        return retVal;
    }

    public WorkunitWrapper setMaxMonitorMillis(int time)
    {
        maxMonitorTime = time;
        return this;
    }

    public int getMaxMonitorMillis()
    {
        return maxMonitorTime;
    }

    public Integer getSleepMillis()
    {
        return sleepMillis;
    }

    public WorkunitWrapper setSleepMillis(Integer sleepTime)
    {
        this.sleepMillis = sleepTime;
        return this;
    }

    /**
     * Gets the resultLimit value for this ECLWorkunit.
     *
     * @return resultLimit
     */
    public Integer getResultLimit()
    {
        if (resultLimit == null)
        {
            return HPCCWsWorkUnitsClient.defaultResultLimit;
        }
        return resultLimit;
    }

    public List<NamedValueWrapper> getNamedValues()
    {
        return namedValues;
    }

    public WorkunitWrapper setNamedValues(List<NamedValueWrapper> namedValues)
    {
        this.namedValues = namedValues;
        return this;
    }

    public WorkunitWrapper setECL(String ecl)
    {
        if (this.getQuery() == null)
        {
            this.setQuery(new ECLQueryWrapper());
        }
        this.getQuery().setText(ecl);

        return this;
    }

    private void setQuery(ECLQueryWrapper eclQueryWrapper)
    {
        this.query = eclQueryWrapper;
    }

    public String getECL()
    {
        if (this.getQuery() == null)
        {
            return "";
        }
        return this.getQuery().getText();
    }

    public String getOriginalEclWatchUrl()
    {
        return originalEclWatchUrl;
    }

    public WorkunitWrapper setOriginalEclWatchUrl(String serverhost)
    {
        this.originalEclWatchUrl = serverhost;
        return this;
    }

    public List<ApplicationValueWrapper> getApplicationValues()
    {
        return applicationValues;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLException getRawExceptions()
    {
        if (this.exceptions.size() == 0) return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLException raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLException();

        for (int i = 0; i < exceptions.size(); i++)
        {
            raw.addECLException(exceptions.get(i).getRawVersion1_75());
        }
        return raw;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfNamedValue getRawNamedValues()
    {
        if (namedValues == null) return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfNamedValue raw = new ArrayOfNamedValue();
        for (NamedValueWrapper item : namedValues)
        {
            raw.addNamedValue(item.get1_75());
        }
        return raw;
    }

    public int getMaxMonitorTime()
    {
        return maxMonitorTime;
    }

    public WorkunitWrapper setMaxMonitorTime(int maxMonitorTime)
    {
        this.maxMonitorTime = maxMonitorTime;
        return this;
    }

    public List<ECLResultWrapper> getResults()
    {
        return eclResults;
    }

    public WorkunitWrapper setResults(List<ECLResultWrapper> eclResults)
    {
        this.eclResults = eclResults;
        return this;
    }

    public Integer getAccessFlag()
    {
        return accessFlag;
    }

    public WorkunitWrapper setAccessFlag(Integer accessFlag)
    {
        this.accessFlag = accessFlag;
        return this;
    }

    public Integer getAction()
    {
        return action;
    }

    public WorkunitWrapper setAction(Integer action)
    {
        this.action = action;
        return this;
    }

    public String getActionEx()
    {
        return actionEx;
    }

    public WorkunitWrapper setActionEx(String actionEx)
    {
        this.actionEx = actionEx;
        return this;
    }

    public Boolean getActive()
    {
        return active;
    }

    public WorkunitWrapper setActive(Boolean active)
    {
        this.active = active;
        return this;
    }

    public Integer getAlertCount()
    {
        return alertcount;
    }

    public WorkunitWrapper setAlertCount(Integer alertcount)
    {
        this.alertcount = alertcount;
        return this;
    }

    public String[] getAllowedClusters()
    {
        return allowedClusters;
    }

    public WorkunitWrapper setAllowedClusters(String[] allowedClusters)
    {
        this.allowedClusters = allowedClusters;
        return this;
    }

    public Integer getApplicationValueCount()
    {
        return applicationValueCount;
    }

    public WorkunitWrapper setApplicationValueCount(Integer applicationValueCount)
    {
        this.applicationValueCount = applicationValueCount;
        return this;
    }

    public String getApplicationValuesDesc()
    {
        return applicationValuesDesc;
    }

    public WorkunitWrapper setApplicationValuesDesc(String applicationValuesDesc)
    {
        this.applicationValuesDesc = applicationValuesDesc;
        return this;
    }

    public Boolean getArchived()
    {
        return archived;
    }

    public WorkunitWrapper setArchived(Boolean archived)
    {
        this.archived = archived;
        return this;
    }

    public String getCluster()
    {
        return cluster;
    }

    public WorkunitWrapper setCluster(String cluster)
    {
        this.cluster = cluster;
        return this;
    }

    public Integer getClusterFlag()
    {
        return clusterFlag;
    }

    public WorkunitWrapper setClusterFlag(Integer clusterFlag)
    {
        this.clusterFlag = clusterFlag;
        return this;
    }

    public Calendar getDateTimeScheduled()
    {
        return dateTimeScheduled;
    }

    public WorkunitWrapper setDateTimeScheduled(Calendar dateTimeScheduled)
    {
        this.dateTimeScheduled = dateTimeScheduled;
        return this;
    }

    public Integer getDebugValueCount()
    {
        return debugValueCount;
    }

    public WorkunitWrapper setDebugValueCount(Integer debugValueCount)
    {
        this.debugValueCount = debugValueCount;
        return this;
    }

    public WorkunitWrapper setSleepMillis(int sleepMillis)
    {
        this.sleepMillis = sleepMillis;
        return this;
    }

    public WorkunitWrapper setApplicationValues(ApplicationValue[] applicationValues2)
    {
        if (applicationValues2 != null)
        {
            applicationValues = new ArrayList<ApplicationValueWrapper>();
            for (int i = 0; i < applicationValues2.length; i++)
            {
                applicationValues.add(new ApplicationValueWrapper(applicationValues2[i]));
            }
        }

        return this;
    }

    public WorkunitWrapper setApplicationValues(List<ApplicationValueWrapper> appVals)
    {
        applicationValues = appVals;
        return this;
    }

    public WorkunitWrapper setApplicationValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue[] vals)
    {
        if (vals == null)
        {
            return this;
        }

        applicationValues = new ArrayList<ApplicationValueWrapper>();
        for (int i = 0; i < vals.length; i++)
        {
            applicationValues.add(new ApplicationValueWrapper(vals[i]));
        }

        return this;
    }

    public WorkunitWrapper setApplicationValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue[] vals)
    {
        if (vals == null)
        {
            return this;
        }

        applicationValues = new ArrayList<ApplicationValueWrapper>();
        for (int i = 0; i < vals.length; i++)
        {
            applicationValues.add(new ApplicationValueWrapper(vals[i]));
        }

        return this;
    }

    public WorkunitWrapper setApplicationValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue[] vals)
    {
        if (vals == null)
        {
            return this;
        }

        applicationValues = new ArrayList<ApplicationValueWrapper>();
        for (int i = 0; i < vals.length; i++)
        {
            applicationValues.add(new ApplicationValueWrapper(vals[i]));
        }

        return this;
    }

    public Integer getAlertcount()
    {
        return alertcount;
    }

    public WorkunitWrapper setAlertcount(Integer alertcount)
    {
        this.alertcount = alertcount;
        return this;
    }

    public List<DebugValueWrapper> getDebugValues()
    {
        return debugValues;
    }

    public WorkunitWrapper setDebugValues(DebugValue[] debugValues2)
    {
        this.debugValues.clear();
        if (debugValues2 == null)
        {
            return this;
        }

        for (int i = 0; i < debugValues2.length; i++)
        {
            this.debugValues.add(new DebugValueWrapper(debugValues2[i]));
        }
        return this;
    }

    public WorkunitWrapper setDebugValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue[] debugValueArray)
    {
        this.debugValues.clear();
        if (debugValueArray == null)
        {
            return this;
        }

        for (int i = 0; i < debugValueArray.length; i++)
        {
            this.debugValues.add(new DebugValueWrapper(debugValueArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setDebugValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue[] debugValueArray)
    {
        this.debugValues.clear();
        if (debugValueArray == null)
        {
            return this;
        }

        for (int i = 0; i < debugValueArray.length; i++)
        {
            this.debugValues.add(new DebugValueWrapper(debugValueArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setDebugValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue[] debugValueArray)
    {
        this.debugValues.clear();
        if (debugValueArray == null)
        {
            return this;
        }

        for (int i = 0; i < debugValueArray.length; i++)
        {
            this.debugValues.add(new DebugValueWrapper(debugValueArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setDebugValues(List<DebugValueWrapper> debugValues)
    {
        this.debugValues = debugValues;
        return this;
    }

    public String getDebugValuesDesc()
    {
        return debugValuesDesc;
    }

    public WorkunitWrapper setDebugValuesDesc(String debugValuesDesc)
    {
        this.debugValuesDesc = debugValuesDesc;
        return this;
    }

    public String getDescription()
    {
        return description;
    }

    public WorkunitWrapper setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public Integer getErrorCount()
    {
        return errorCount;
    }

    public WorkunitWrapper setErrorCount(Integer errorCount)
    {
        this.errorCount = errorCount;
        return this;
    }

    public Integer getEventSchedule()
    {
        return eventSchedule;
    }

    public WorkunitWrapper setEventSchedule(Integer eventSchedule)
    {
        this.eventSchedule = eventSchedule;
        return this;
    }

    public List<WUExceptionWrapper> getExceptions()
    {
        return exceptions;
    }

    public WorkunitWrapper setExceptions(ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            this.exceptions = new ArrayList<WUExceptionWrapper>();
            for (int i = 0; i < eclExceptions.length; i++)
            {
                this.exceptions.add(new WUExceptionWrapper(eclExceptions[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            this.exceptions = new ArrayList<WUExceptionWrapper>();
            for (int i = 0; i < eclExceptions.length; i++)
            {
                this.exceptions.add(new WUExceptionWrapper(eclExceptions[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            this.exceptions = new ArrayList<WUExceptionWrapper>();
            for (int i = 0; i < eclExceptions.length; i++)
            {
                this.exceptions.add(new WUExceptionWrapper(eclExceptions[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            this.exceptions = new ArrayList<WUExceptionWrapper>();
            for (int i = 0; i < eclExceptions.length; i++)
            {
                this.exceptions.add(new WUExceptionWrapper(eclExceptions[i]));
            }
        }
        return this;
    }

    public Integer getGraphCount()
    {
        return graphCount;
    }

    public WorkunitWrapper setGraphCount(Integer graphCount)
    {
        this.graphCount = graphCount;
        return this;
    }

    public List<ECLGraphWrapper> getGraphs()
    {
        return graphs;
    }

    public String getGraphsDesc()
    {
        return graphsDesc;
    }

    public WorkunitWrapper setGraphsDesc(String graphsDesc)
    {
        this.graphsDesc = graphsDesc;
        return this;
    }

    public Boolean getHasArchiveQuery()
    {
        return hasArchiveQuery;
    }

    public WorkunitWrapper setHasArchiveQuery(Boolean hasArchiveQuery)
    {
        this.hasArchiveQuery = hasArchiveQuery;
        return this;
    }

    public Boolean getHasDebugValue()
    {
        return hasDebugValue;
    }

    public WorkunitWrapper setHasDebugValue(Boolean hasDebugValue)
    {
        this.hasDebugValue = hasDebugValue;
        return this;
    }

    public List<ECLHelpFileWrapper> getHelpers()
    {
        return helpers;
    }

    public WorkunitWrapper setHelpers(ECLHelpFile[] eclHelpFiles)
    {
        this.helpers.clear();
        if (eclHelpFiles != null)
        {
            for (int i = 0; i < eclHelpFiles.length; i++)
            {
                this.helpers.add(new ECLHelpFileWrapper(eclHelpFiles[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setHelpers(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLHelpFile[] eclHelpFileArray)
    {
        this.helpers.clear();
        if (eclHelpFileArray != null)
        {
            for (int i = 0; i < eclHelpFileArray.length; i++)
            {
                this.helpers.add(new ECLHelpFileWrapper(eclHelpFileArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setHelpers(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLHelpFile[] eclHelpFileArray)
    {
        this.helpers.clear();
        if (eclHelpFileArray != null)
        {
            for (int i = 0; i < eclHelpFileArray.length; i++)
            {
                this.helpers.add(new ECLHelpFileWrapper(eclHelpFileArray[i]));
            }
        }
        return this;
    }

    public WorkunitWrapper setHelpers(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLHelpFile[] eclHelpFileArray)
    {
        this.helpers.clear();
        if (eclHelpFileArray != null)
        {
            for (int i = 0; i < eclHelpFileArray.length; i++)
            {
                this.helpers.add(new ECLHelpFileWrapper(eclHelpFileArray[i]));
            }
        }
        return this;
    }

    public String getHelpersDesc()
    {
        return helpersDesc;
    }

    public WorkunitWrapper setHelpersDesc(String helpersDesc)
    {
        this.helpersDesc = helpersDesc;
        return this;
    }

    public Integer getInfoCount()
    {
        return infoCount;
    }

    public WorkunitWrapper setInfoCount(Integer infoCount)
    {
        this.infoCount = infoCount;
        return this;
    }

    public Boolean getIsPausing()
    {
        return isPausing;
    }

    public WorkunitWrapper setIsPausing(Boolean isPausing)
    {
        this.isPausing = isPausing;
        return this;
    }

    public String getJobname()
    {
        return jobname;
    }

    public WorkunitWrapper setJobname(String jobname)
    {
        this.jobname = jobname;
        return this;
    }

    public String getOwner()
    {
        return owner;
    }

    public WorkunitWrapper setOwner(String owner)
    {
        this.owner = owner;
        return this;
    }

    public Integer getPriorityClass()
    {
        return priorityClass;
    }

    public WorkunitWrapper setPriorityClass(Integer priorityClass)
    {
        this.priorityClass = priorityClass;
        return this;
    }

    public Integer getPriorityLevel()
    {
        return priorityLevel;
    }

    public WorkunitWrapper setPriorityLevel(Integer priorityLevel)
    {
        this.priorityLevel = priorityLevel;
        return this;
    }

    public ECLQueryWrapper getQuery()
    {
        return query;
    }

    public String getQueue()
    {
        return queue;
    }

    public WorkunitWrapper setQueue(String queue)
    {
        this.queue = queue;
        return this;
    }

    public Integer getResourceURLCount()
    {
        return resourceURLCount;
    }

    public WorkunitWrapper setResourceURLCount(Integer resourceURLCount)
    {
        this.resourceURLCount = resourceURLCount;
        return this;
    }

    public String[] getResourceURLs()
    {
        return resourceURLs;
    }

    public WorkunitWrapper setResourceURLs(String[] resourceURLs)
    {
        this.resourceURLs = resourceURLs;
        return this;
    }

    public Integer getResultCount()
    {
        return resultCount;
    }

    public WorkunitWrapper setResultCount(Integer resultCount)
    {
        this.resultCount = resultCount;
        return this;
    }

    public WorkunitWrapper setResultLimit(Integer resultLimit)
    {
        this.resultLimit = resultLimit;
        return this;
    }

    public String getResultsDesc()
    {
        return resultsDesc;
    }

    public WorkunitWrapper setResultsDesc(String resultsDesc)
    {
        this.resultsDesc = resultsDesc;
        return this;
    }

    public String getRoxieCluster()
    {
        return roxieCluster;
    }

    public WorkunitWrapper setRoxieCluster(String roxieCluster)
    {
        this.roxieCluster = roxieCluster;
        return this;
    }

    public String getScope()
    {
        return scope;
    }

    public WorkunitWrapper setScope(String scope)
    {
        this.scope = scope;
        return this;
    }

    public String getSnapshot()
    {
        return snapshot;
    }

    public WorkunitWrapper setSnapshot(String snapshot)
    {
        this.snapshot = snapshot;
        return this;
    }

    public List<ECLSourceFileWrapper> getSourceFiles()
    {
        return sourceFiles;
    }

    public WorkunitWrapper setSourceFiles(ECLSourceFile[] eclSourceFiles)
    {
        this.sourceFiles.clear();
        if (eclSourceFiles == null)
        {
            return this;
        }
        for (int i = 0; i < eclSourceFiles.length; i++)
        {
            this.sourceFiles.add(new ECLSourceFileWrapper(eclSourceFiles[i]));
        }
        return this;
    }

    public WorkunitWrapper setSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLSourceFile[] eclSourceFileArray)
    {
        this.sourceFiles.clear();
        if (eclSourceFileArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            this.sourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLSourceFile[] eclSourceFileArray)
    {
        this.sourceFiles.clear();
        if (eclSourceFileArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            this.sourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setSourceFiles(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLSourceFile[] eclSourceFileArray)
    {
        this.sourceFiles.clear();
        if (eclSourceFileArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclSourceFileArray.length; i++)
        {
            this.sourceFiles.add(new ECLSourceFileWrapper(eclSourceFileArray[i]));
        }
        return this;
    }

    public String getSourceFilelsDesc()
    {
        return sourceFilelsDesc;
    }

    public WorkunitWrapper setSourceFilelsDesc(String sourceFilelsDesc)
    {
        this.sourceFilelsDesc = sourceFilelsDesc;
        return this;
    }

    public String getState()
    {
        return state;
    }

    public WorkunitWrapper setState(String state)
    {
        this.state = state;
        return this;
    }

    public String getStateEx()
    {
        return stateEx;
    }

    public WorkunitWrapper setStateEx(String stateEx)
    {
        this.stateEx = stateEx;
        return this;
    }

    public Integer getStateID()
    {
        return stateID;
    }

    public WorkunitWrapper setStateID(Integer stateID)
    {
        this.stateID = stateID;
        return this;
    }

    public Integer getTimerCount()
    {
        return timerCount;
    }

    public WorkunitWrapper setTimerCount(Integer timerCount)
    {
        this.timerCount = timerCount;
        return this;
    }

    public String getTimersDesc()
    {
        return timersDesc;
    }

    public WorkunitWrapper setTimersDesc(String timersDesc)
    {
        this.timersDesc = timersDesc;
        return this;
    }

    public List<ECLTimingDataWrapper> getTimingData()
    {
        return timingData;
    }

    public WorkunitWrapper setTimingData(ECLTimingData[] eclTimingDatas)
    {
        this.timingData.clear();
        if (eclTimingDatas == null)
        {
            return this;
        }
        for (int i = 0; i < eclTimingDatas.length; i++)
        {
            this.timingData.add(new ECLTimingDataWrapper(eclTimingDatas[i]));
        }
        return this;
    }

    public WorkunitWrapper setTimingData(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLTimingData[] eclTimingDataArray)
    {
        this.timingData.clear();
        if (eclTimingDataArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclTimingDataArray.length; i++)
        {
            this.timingData.add(new ECLTimingDataWrapper(eclTimingDataArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setTimingData(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLTimingData[] eclTimingDataArray)
    {
        this.timingData.clear();
        if (eclTimingDataArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclTimingDataArray.length; i++)
        {
            this.timingData.add(new ECLTimingDataWrapper(eclTimingDataArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setTimingData(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLTimingData[] eclTimingDataArray)
    {
        this.timingData.clear();
        if (eclTimingDataArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclTimingDataArray.length; i++)
        {
            this.timingData.add(new ECLTimingDataWrapper(eclTimingDataArray[i]));
        }
        return this;
    }

    public String getTotalClusterTime()
    {
        return totalClusterTime;
    }

    public WorkunitWrapper setTotalClusterTime(String totalClusterTime)
    {
        this.totalClusterTime = totalClusterTime;
        return this;
    }

    public Integer getVariableCount()
    {
        return variableCount;
    }

    public WorkunitWrapper setVariableCount(Integer variableCount)
    {
        this.variableCount = variableCount;
        return this;
    }

    public List<ECLResultWrapper> getVariables()
    {
        return variables;
    }

    public WorkunitWrapper setVariables(List<ECLResultWrapper> variables)
    {
        this.variables = variables;
        return this;
    }

    public boolean isThorLCR()
    {
        return thorLCR;
    }

    public WorkunitWrapper setThorLCR(boolean thorLCR)
    {
        this.thorLCR = thorLCR;
        return this;
    }

    public List<ThorLogInfoWrapper> getThorLogList()
    {
        return thorLogList;
    }

    public WorkunitWrapper setThorLogList(ThorLogInfo[] thorLogInfos)
    {
        this.thorLogList.clear();
        if (thorLogInfos == null)
        {
            return this;
        }
        for (int i = 0; i < thorLogInfos.length; i++)
        {
            this.thorLogList.add(new ThorLogInfoWrapper(thorLogInfos[i]));
        }
        return this;
    }

    public WorkunitWrapper setThorLogList(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ThorLogInfo[] thorLogInfoArray)
    {
        this.thorLogList.clear();
        if (thorLogInfoArray == null)
        {
            return this;
        }
        for (int i = 0; i < thorLogInfoArray.length; i++)
        {
            this.thorLogList.add(new ThorLogInfoWrapper(thorLogInfoArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setThorLogList(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ThorLogInfo[] thorLogInfoArray)
    {
        this.thorLogList.clear();
        if (thorLogInfoArray == null)
        {
            return this;
        }
        for (int i = 0; i < thorLogInfoArray.length; i++)
        {
            this.thorLogList.add(new ThorLogInfoWrapper(thorLogInfoArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setThorLogList(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ThorLogInfo[] thorLogList)
    {
        this.thorLogList.clear();
        if (thorLogList == null)
        {
            return this;
        }
        for (int i = 0; i < thorLogList.length; i++)
        {
            this.thorLogList.add(new ThorLogInfoWrapper(thorLogList[i]));
        }
        return this;
    }

    public String getVariablesDesc()
    {
        return variablesDesc;
    }

    public WorkunitWrapper setVariablesDesc(String variablesDesc)
    {
        this.variablesDesc = variablesDesc;
        return this;
    }

    public Integer getWarningCount()
    {
        return warningCount;
    }

    public WorkunitWrapper setWarningCount(Integer warningCount)
    {
        this.warningCount = warningCount;
        return this;
    }

    public Integer getWorkflowCount()
    {
        return workflowCount;
    }

    public WorkunitWrapper setWorkflowCount(Integer workflowCount)
    {
        this.workflowCount = workflowCount;
        return this;
    }

    public List<ECLWorkflowWrapper> getWorkflows()
    {
        return workflows;
    }

    public WorkunitWrapper setWorkflows(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLWorkflow[] eclWorkflowArray)
    {
        this.workflows.clear();
        if (eclWorkflowArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclWorkflowArray.length; i++)
        {
            this.workflows.add(new ECLWorkflowWrapper(eclWorkflowArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setWorkflows(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLWorkflow[] eclWorkflowArray)
    {
        this.workflows.clear();
        if (eclWorkflowArray == null)
        {
            return this;
        }
        for (int i = 0; i < eclWorkflowArray.length; i++)
        {
            this.workflows.add(new ECLWorkflowWrapper(eclWorkflowArray[i]));
        }
        return this;
    }

    public WorkunitWrapper setWorkflows(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkflow[] eclWorkflows)
    {
        this.workflows.clear();
        if (eclWorkflows == null)
        {
            return this;
        }
        for (int i = 0; i < eclWorkflows.length; i++)
        {
            this.workflows.add(new ECLWorkflowWrapper(eclWorkflows[i]));
        }
        return this;
    }

    public WorkunitWrapper setWorkflows(ECLWorkflow[] eclWorkflows)
    {
        this.workflows.clear();
        if (eclWorkflows == null)
        {
            return this;
        }
        for (int i = 0; i < eclWorkflows.length; i++)
        {
            this.workflows.add(new ECLWorkflowWrapper(eclWorkflows[i]));
        }
        return this;
    }

    public String getWorkflowsDesc()
    {
        return workflowsDesc;
    }

    public WorkunitWrapper setWorkflowsDesc(String workflowsDesc)
    {
        this.workflowsDesc = workflowsDesc;
        return this;
    }

    public String getWuid()
    {
        return wuid;
    }

    public WorkunitWrapper setWuid(String wuid)
    {
        this.wuid = wuid;
        return this;
    }

    public String getXmlParams()
    {
        return xmlParams;
    }

    public WorkunitWrapper setXmlParams(String xmlParams)
    {
        this.xmlParams = xmlParams;
        return this;
    }

    public Integer getSourceFileCount()
    {
        return sourceFileCount;
    }

    public WorkunitWrapper setSourceFileCount(Integer sourceFileCount)
    {
        this.sourceFileCount = sourceFileCount;
        return this;
    }

    public String getSourceFilesDesc()
    {
        return sourceFileDesc;
    }

    public WorkunitWrapper setSourceFilesDesc(String sourceFileDesc)
    {
        this.sourceFileDesc = sourceFileDesc;
        return this;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkunit getEclWorkunit()
    {
        return getEclWorkunitVersion75();
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkunit getEclWorkunitVersion75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkunit eclWorkunit = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkunit();

        eclWorkunit.setAccessFlag(this.getAccessFlag());
        eclWorkunit.setAction(this.getAction());
        eclWorkunit.setActionEx(this.getActionEx());
        eclWorkunit.setActive(this.getActive());
        eclWorkunit.setAlertCount(this.getAlertCount());
        AllowedClusters_type0 allowedClustersarray = new AllowedClusters_type0();
        allowedClustersarray.setAllowedCluster(allowedClusters);
        eclWorkunit.setAllowedClusters(allowedClustersarray);
        eclWorkunit.setApplicationValueCount(this.getApplicationValueCount());
        if (this.getApplicationValues() != null && this.getApplicationValues().size() != 0)
        {
            ArrayOfApplicationValue arrayofapplicationValues = new ArrayOfApplicationValue();

            List<ApplicationValueWrapper> applicationValuesList = this.getApplicationValues();
            for (int i = 0; i < applicationValuesList.size(); i++)
            {
                ApplicationValueWrapper applicationValueWrapper = applicationValuesList.get(i);

                ApplicationValue applicationvalue = new ApplicationValue();
                applicationvalue.setApplication(applicationValueWrapper.getApplication());
                applicationvalue.setName(applicationValueWrapper.getName());
                applicationvalue.setValue(applicationValueWrapper.getValue());

                arrayofapplicationValues.addApplicationValue(applicationvalue);
            }
            eclWorkunit.setApplicationValues(arrayofapplicationValues);
        }
        eclWorkunit.setApplicationValuesDesc(this.getApplicationValuesDesc());
        eclWorkunit.setArchived(this.getArchived());
        eclWorkunit.setCluster(this.getCluster());
        eclWorkunit.setClusterFlag(this.getClusterFlag());
        eclWorkunit.setDateTimeScheduled(this.getDateTimeScheduled());
        eclWorkunit.setDebugValueCount(this.getDebugValueCount());
        if (this.getDebugValues() != null && this.getDebugValues().size() != 0)
        {
            ArrayOfDebugValue arrayofdebugvalues = new ArrayOfDebugValue();
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                DebugValue debugValue = new DebugValue();
                debugValue.setName(this.getDebugValues().get(i).getName());
                debugValue.setValue(this.getDebugValues().get(i).getValue());
                arrayofdebugvalues.addDebugValue(debugValue);
            }

            eclWorkunit.setDebugValues(arrayofdebugvalues);
        }
        eclWorkunit.setDebugValuesDesc(this.getDebugValuesDesc());
        eclWorkunit.setDescription(this.getDescription());
        eclWorkunit.setErrorCount(this.getErrorCount());
        eclWorkunit.setEventSchedule(this.getEventSchedule());
        if (this.getExceptions() != null && this.getExceptions().size() > 0)
        {
            ArrayOfECLException arrayofeclexceptions = new ArrayOfECLException();
            for (int i = 0; i < this.getExceptions().size(); i++)
            {
                arrayofeclexceptions.addECLException(this.getExceptions().get(i).getRawVersion1_75());
            }
            eclWorkunit.setExceptions(arrayofeclexceptions);
        }
        eclWorkunit.setGraphCount(this.getGraphCount());
        if (this.getGraphs().size() > 0)
        {
            ArrayOfECLGraph arrayofeclgraphs = new ArrayOfECLGraph();
            for (int i = 0; i < this.getGraphs().size(); i++)
            {
                arrayofeclgraphs.addECLGraph(this.getGraphs().get(i).getRaw());
            }

            eclWorkunit.setGraphs(arrayofeclgraphs);
        }
        eclWorkunit.setGraphsDesc(this.getGraphsDesc());
        eclWorkunit.setHasArchiveQuery(this.getHasArchiveQuery());
        eclWorkunit.setHasDebugValue(this.getHasDebugValue());
        if (this.getHelpers() != null && this.getHelpers().size() > 0)
        {
            ArrayOfECLHelpFile arrayofeclhelpers = new ArrayOfECLHelpFile();
            for (int i = 0; i < this.getHelpers().size(); i++)
            {
                arrayofeclhelpers.addECLHelpFile(this.getHelpers().get(i).getRaw());
            }

            eclWorkunit.setHelpers(arrayofeclhelpers);
        }
        eclWorkunit.setHelpersDesc(this.getHelpersDesc());
        eclWorkunit.setInfoCount(this.getInfoCount());
        eclWorkunit.setIsPausing(this.getIsPausing());
        eclWorkunit.setJobname(this.getJobname());
        eclWorkunit.setOwner(this.getOwner());
        eclWorkunit.setPriorityClass(this.getPriorityClass());
        eclWorkunit.setPriorityLevel(this.getPriorityLevel());
        eclWorkunit.setProtected(this.isProtected());
        eclWorkunit.setQuery(this.getQuery().getRaw());
        eclWorkunit.setQueue(this.getQueue());
        eclWorkunit.setResourceURLCount(this.getResourceURLCount());
        ResourceURLs_type0 resourceurls = new ResourceURLs_type0();
        resourceurls.setURL(this.getResourceURLs());
        eclWorkunit.setResourceURLs(resourceurls);
        eclWorkunit.setResultCount(this.getResultCount());
        eclWorkunit.setResultLimit(this.getResultLimit());
        if (this.getResults() != null && this.getResults().size() > 0)
        {
            ArrayOfECLResult arraofeclresults = new ArrayOfECLResult();
            for (int i = 0; i < this.getResults().size(); i++)
            {
                arraofeclresults.addECLResult(this.getResults().get(i).getRawVersion1_75());
            }

            eclWorkunit.setResults(arraofeclresults);
        }
        eclWorkunit.setResultsDesc(this.getResultsDesc());
        eclWorkunit.setRoxieCluster(this.getRoxieCluster());
        eclWorkunit.setScope(this.getScope());
        eclWorkunit.setSnapshot(this.getSnapshot());
        eclWorkunit.setSourceFileCount(this.getSourceFileCount());
        if (this.getSourceFiles() != null && this.getSourceFiles().size() > 0)
        {
            ArrayOfECLSourceFile arrayofeclsourcefiles = new ArrayOfECLSourceFile();
            for (int i = 0; i < this.getSourceFiles().size(); i++)
            {
                arrayofeclsourcefiles.addECLSourceFile(this.getSourceFiles().get(i).getRaw());
            }

            eclWorkunit.setSourceFiles(arrayofeclsourcefiles);
        }
        eclWorkunit.setSourceFilesDesc(this.getSourceFilesDesc());
        eclWorkunit.setState(this.getState());
        eclWorkunit.setStateEx(this.getStateEx());
        eclWorkunit.setStateID(this.getStateID());
        eclWorkunit.setTimerCount(this.getTimerCount());
        eclWorkunit.setTimersDesc(this.getTimersDesc());
        if (this.getTimingData() != null && this.getTimingData().size() > 0)
        {
            ArrayOfECLTimingData arrayofectimingdata = new ArrayOfECLTimingData();
            for (int i = 0; i < this.getTimingData().size(); i++)
            {
                arrayofectimingdata.addECLTimingData(this.getTimingData().get(i).getRaw());
            }

            eclWorkunit.setTimingData(arrayofectimingdata);
        }
        eclWorkunit.setTotalClusterTime(this.getTotalClusterTime());
        eclWorkunit.setVariableCount(this.getVariableCount());
        if (this.getVariables() != null && this.getVariables().size() > 0)
        {
            ArrayOfECLResult arrayofvariables = new ArrayOfECLResult();
            for (int i = 0; i < this.getVariables().size(); i++)
            {
                arrayofvariables.addECLResult(this.getVariables().get(i).getRaw());
            }

            eclWorkunit.setVariables(arrayofvariables);
        }
        eclWorkunit.setThorLCR(this.getThorLCR());
        if (this.getThorLogList() != null && this.getThorLogList().size() > 0)
        {
            ArrayOfThorLogInfo arrayofthorloglist = new ArrayOfThorLogInfo();
            for (int i = 0; i < this.getThorLogList().size(); i++)
            {
                arrayofthorloglist.addThorLogInfo(this.getThorLogList().get(i).getRaw());
            }

            eclWorkunit.setThorLogList(arrayofthorloglist);
        }
        eclWorkunit.setVariablesDesc(this.getVariablesDesc());
        eclWorkunit.setWarningCount(this.getWarningCount());
        eclWorkunit.setWorkflowCount(this.getWorkflowCount());
        if (this.getWorkflows() != null && this.getWorkflows().size() > 0)
        {
            ArrayOfECLWorkflow arraofeclworkflows = new ArrayOfECLWorkflow();
            for (int i = 0; i < this.getWorkflows().size(); i++)
            {
                arraofeclworkflows.addECLWorkflow(this.getWorkflows().get(i).getRaw());
            }

            eclWorkunit.setWorkflows(arraofeclworkflows);
        }

        eclWorkunit.setWorkflowsDesc(this.getWorkflowsDesc());
        eclWorkunit.setWuid(this.getWuid());
        eclWorkunit.setXmlParams(this.getXmlParams());

        return eclWorkunit;
    }

    private Boolean isProtected()
    {
        return isProtected;
    }

    private Boolean getThorLCR()
    {
        return this.thorLCR;
    }

    public String[] getResultViews()
    {
        return resultViews;
    }

    public WorkunitWrapper setResultViews(String[] resultViews)
    {
        this.resultViews = resultViews;
        return this;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException getRawArrayOfEspExceptions()
    {
        if (exceptions.size() == 0) return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException();
        for (int i = 0; i < exceptions.size(); i++)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException esp = new EspException();
            esp.setAudience(exceptions.get(i).getAudience());
            esp.setMessage(exceptions.get(i).getMessage());
            esp.setSource(exceptions.get(i).getSource());
            esp.setCode(exceptions.get(i).getEspCode());
            result.addException(esp);
        }

        return result;
    }
}
