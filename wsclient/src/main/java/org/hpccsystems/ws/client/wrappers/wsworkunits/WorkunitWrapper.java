package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.AllowedClusters_type0;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfDebugValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraph;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLHelpFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLSourceFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimingData;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkflow;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfThorLogInfo;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DebugValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResourceURLs_type0;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorLogInfo;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.DebugValueWrapper;
import org.hpccsystems.ws.client.wrappers.ECLExceptionWrapper;

@Deprecated
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
    private ArrayOfECLExceptionWrapper    exceptions = null;
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

    /**
     * Instantiates a new workunit wrapper.
     */
    public WorkunitWrapper()
    {
    }

    /**
     * Instantiates a new workunit wrapper.
     *
     * @param base
     *            the base
     */
    public WorkunitWrapper(ECLWorkunit base)
    {
        copy(base);
    }

    /**
     * Instantiates a new workunit wrapper.
     *
     * @param base
     *            the base
     */
    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit base)
    {
        copy(base);
    }

    /**
     * Instantiates a new workunit wrapper.
     *
     * @param base
     *            the base
     */
    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLWorkunit base)
    {
        copy(base);
    }

    /**
     * Instantiates a new workunit wrapper.
     *
     * @param base
     *            the base
     */
    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLWorkunit base)
    {
        copy(base);
    }

    /**
     * Instantiates a new workunit wrapper.
     *
     * @param base
     *            the base
     */
    public WorkunitWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit base)
    {
        copy(base);
    }

    /**
     * Copy.
     *
     * @param base
     *            the base
     */
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

    /**
     * Sets the query.
     *
     * @param eclQuery
     *            the ecl query
     * @return the workunit wrapper
     */
    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    /**
     * Sets the results.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the workflows.
     *
     * @param eclWorkflowArray
     *            the ecl workflow array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the thor log list.
     *
     * @param thorLogInfoArray
     *            the thor log info array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the variables.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the timing data.
     *
     * @param eclTimingDatas
     *            the ecl timing datas
     * @return the workunit wrapper
     */
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

    /**
     * Sets the source files.
     *
     * @param eclSourceFileArray
     *            the ecl source file array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the helpers.
     *
     * @param eclHelpFileArray
     *            the ecl help file array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the graphs.
     *
     * @param eclGraphArray
     *            the ecl graph array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the exceptions.
     *
     * @param eclExceptions
     *            the ecl exceptions
     * @return the workunit wrapper
     */
    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            exceptions = new ArrayOfECLExceptionWrapper(eclExceptions);
        }
        return this;
    }

    /**
     * Sets the debug values.
     *
     * @param debugValueArray
     *            the debug value array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the application values.
     *
     * @param applicationValue
     *            the application value
     * @return the workunit wrapper
     */
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

    /**
     * Copy.
     *
     * @param base
     *            the base
     */
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

    /**
     * Copy.
     *
     * @param base
     *            the base
     */
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
     * Copy a soap ecl workunit object into the wrapper.
     *
     * @param base
     *            the base
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

    /**
     * Sets the protected.
     *
     * @param get_protected
     *            the new protected
     */
    private void setProtected(Boolean get_protected)
    {
        this.isProtected = get_protected;
    }

    /**
     * Copy a soap ecl workunit object into the wrapper.
     *
     * @param base
     *            the base
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

    /**
     * Sets the variables.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the variables.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the variables.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the variables.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the results.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the results.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the results.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the results.
     *
     * @param arrayOfECLResult
     *            the array of ECL result
     * @return the workunit wrapper
     */
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

    /**
     * Sets the graphs.
     *
     * @param eclGraphs
     *            the ecl graphs
     * @return the workunit wrapper
     */
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

    /**
     * Sets the graphs.
     *
     * @param eclGraphArray
     *            the ecl graph array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the graphs.
     *
     * @param eclGraphArray
     *            the ecl graph array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the graphs.
     *
     * @param eclGraphArray
     *            the ecl graph array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the query.
     *
     * @param eclQuery
     *            the ecl query
     * @return the workunit wrapper
     */
    public WorkunitWrapper setQuery(ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    /**
     * Sets the query.
     *
     * @param eclQuery
     *            the ecl query
     * @return the workunit wrapper
     */
    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    /**
     * Sets the query.
     *
     * @param eclQuery
     *            the ecl query
     * @return the workunit wrapper
     */
    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    /**
     * Sets the query.
     *
     * @param eclQuery
     *            the ecl query
     * @return the workunit wrapper
     */
    public WorkunitWrapper setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLQuery eclQuery)
    {
        this.query = new ECLQueryWrapper(eclQuery);
        return this;
    }

    /**
     * Update.
     *
     * @param wu
     *            the wu
     * @return true, if successful
     */
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

    /**
     * Update.
     *
     * @param wu
     *            the wu
     * @return true, if successful
     */
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
        if (wu != null && this.getWuid().equals(wu.getWuid()))// && this.compareTo(wu))
        {
            this.setStateID(wu.getStateID());
            this.setStateEx(wu.getStateEx());
            this.setState(wu.getState());
            // Update additional fields from ECLWorkunit response
            if (wu.getOwner() != null && !wu.getOwner().isEmpty())
            {
                this.setOwner(wu.getOwner());
            }
            if (wu.getJobname() != null && !wu.getJobname().isEmpty())
            {
                this.setJobname(wu.getJobname());
            }
            // setChanged();
            retVal = true;
        }
        return retVal;
    }

    /**
     * Update state.
     *
     * @param wu
     *            the wu
     * @return true, if successful
     */
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

    /**
     * Sets the max monitor millis.
     *
     * @param time
     *            the time
     * @return the workunit wrapper
     */
    public WorkunitWrapper setMaxMonitorMillis(int time)
    {
        maxMonitorTime = time;
        return this;
    }

    /**
     * Gets the max monitor millis.
     *
     * @return the max monitor millis
     */
    public int getMaxMonitorMillis()
    {
        return maxMonitorTime;
    }

    /**
     * Gets the sleep millis.
     *
     * @return the sleep millis
     */
    public Integer getSleepMillis()
    {
        return sleepMillis;
    }

    /**
     * Sets the sleep millis.
     *
     * @param sleepTime
     *            the sleep time
     * @return the workunit wrapper
     */
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

    /**
     * Gets the named values.
     *
     * @return the named values
     */
    public List<NamedValueWrapper> getNamedValues()
    {
        return namedValues;
    }

    /**
     * Sets the named values.
     *
     * @param namedValues
     *            the named values
     * @return the workunit wrapper
     */
    public WorkunitWrapper setNamedValues(List<NamedValueWrapper> namedValues)
    {
        this.namedValues = namedValues;
        return this;
    }

    /**
     * Sets the ECL.
     *
     * @param ecl
     *            the ecl
     * @return the workunit wrapper
     */
    public WorkunitWrapper setECL(String ecl)
    {
        if (this.getQuery() == null)
        {
            this.setQuery(new ECLQueryWrapper());
        }
        this.getQuery().setText(ecl);

        return this;
    }

    /**
     * Sets the query.
     *
     * @param eclQueryWrapper
     *            the new query
     */
    private void setQuery(ECLQueryWrapper eclQueryWrapper)
    {
        this.query = eclQueryWrapper;
    }

    /**
     * Gets the ecl.
     *
     * @return the ecl
     */
    public String getECL()
    {
        if (this.getQuery() == null)
        {
            return "";
        }
        return this.getQuery().getText();
    }

    /**
     * Gets the original ecl watch url.
     *
     * @return the original ecl watch url
     */
    public String getOriginalEclWatchUrl()
    {
        return originalEclWatchUrl;
    }

    /**
     * Sets the original ecl watch url.
     *
     * @param serverhost
     *            the serverhost
     * @return the workunit wrapper
     */
    public WorkunitWrapper setOriginalEclWatchUrl(String serverhost)
    {
        this.originalEclWatchUrl = serverhost;
        return this;
    }

    /**
     * Gets the application values.
     *
     * @return the application values
     */
    public List<ApplicationValueWrapper> getApplicationValues()
    {
        return applicationValues;
    }

    /**
     * Gets the raw exceptions.
     *
     * @return the raw exceptions
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException getRawExceptions()
    {
        if (exceptions == null)
            return null;

        return exceptions.getRaw();
    }

    /**
     * Gets the raw named values.
     *
     * @return the raw named values
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue getRawNamedValues()
    {
        if (namedValues == null) return null;

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue raw = new ArrayOfNamedValue();
        for (NamedValueWrapper item : namedValues)
        {
            raw.addNamedValue(item.getRaw());
        }
        return raw;
    }

    /**
     * Gets the max monitor time.
     *
     * @return the max monitor time
     */
    public int getMaxMonitorTime()
    {
        return maxMonitorTime;
    }

    /**
     * Sets the max monitor time.
     *
     * @param maxMonitorTime
     *            the max monitor time
     * @return the workunit wrapper
     */
    public WorkunitWrapper setMaxMonitorTime(int maxMonitorTime)
    {
        this.maxMonitorTime = maxMonitorTime;
        return this;
    }

    /**
     * Gets the results.
     *
     * @return the results
     */
    public List<ECLResultWrapper> getResults()
    {
        return eclResults;
    }

    /**
     * Sets the results.
     *
     * @param eclResults
     *            the ecl results
     * @return the workunit wrapper
     */
    public WorkunitWrapper setResults(List<ECLResultWrapper> eclResults)
    {
        this.eclResults = eclResults;
        return this;
    }

    /**
     * Gets the access flag.
     *
     * @return the access flag
     */
    public Integer getAccessFlag()
    {
        return accessFlag;
    }

    /**
     * Sets the access flag.
     *
     * @param accessFlag
     *            the access flag
     * @return the workunit wrapper
     */
    public WorkunitWrapper setAccessFlag(Integer accessFlag)
    {
        this.accessFlag = accessFlag;
        return this;
    }

    /**
     * Gets the action.
     *
     * @return the action
     */
    public Integer getAction()
    {
        return action;
    }

    /**
     * Sets the action.
     *
     * @param action
     *            the action
     * @return the workunit wrapper
     */
    public WorkunitWrapper setAction(Integer action)
    {
        this.action = action;
        return this;
    }

    /**
     * Gets the action ex.
     *
     * @return the action ex
     */
    public String getActionEx()
    {
        return actionEx;
    }

    /**
     * Sets the action ex.
     *
     * @param actionEx
     *            the action ex
     * @return the workunit wrapper
     */
    public WorkunitWrapper setActionEx(String actionEx)
    {
        this.actionEx = actionEx;
        return this;
    }

    /**
     * Gets the active.
     *
     * @return the active
     */
    public Boolean getActive()
    {
        return active;
    }

    /**
     * Sets the active.
     *
     * @param active
     *            the active
     * @return the workunit wrapper
     */
    public WorkunitWrapper setActive(Boolean active)
    {
        this.active = active;
        return this;
    }

    /**
     * Gets the alert count.
     *
     * @return the alert count
     */
    public Integer getAlertCount()
    {
        return alertcount;
    }

    /**
     * Sets the alert count.
     *
     * @param alertcount
     *            the alertcount
     * @return the workunit wrapper
     */
    public WorkunitWrapper setAlertCount(Integer alertcount)
    {
        this.alertcount = alertcount;
        return this;
    }

    /**
     * Gets the allowed clusters.
     *
     * @return the allowed clusters
     */
    public String[] getAllowedClusters()
    {
        return allowedClusters;
    }

    /**
     * Sets the allowed clusters.
     *
     * @param allowedClusters
     *            the allowed clusters
     * @return the workunit wrapper
     */
    public WorkunitWrapper setAllowedClusters(String[] allowedClusters)
    {
        this.allowedClusters = allowedClusters;
        return this;
    }

    /**
     * Gets the application value count.
     *
     * @return the application value count
     */
    public Integer getApplicationValueCount()
    {
        return applicationValueCount;
    }

    /**
     * Sets the application value count.
     *
     * @param applicationValueCount
     *            the application value count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setApplicationValueCount(Integer applicationValueCount)
    {
        this.applicationValueCount = applicationValueCount;
        return this;
    }

    /**
     * Gets the application values desc.
     *
     * @return the application values desc
     */
    public String getApplicationValuesDesc()
    {
        return applicationValuesDesc;
    }

    /**
     * Sets the application values desc.
     *
     * @param applicationValuesDesc
     *            the application values desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setApplicationValuesDesc(String applicationValuesDesc)
    {
        this.applicationValuesDesc = applicationValuesDesc;
        return this;
    }

    /**
     * Gets the archived.
     *
     * @return the archived
     */
    public Boolean getArchived()
    {
        return archived;
    }

    /**
     * Sets the archived.
     *
     * @param archived
     *            the archived
     * @return the workunit wrapper
     */
    public WorkunitWrapper setArchived(Boolean archived)
    {
        this.archived = archived;
        return this;
    }

    /**
     * Gets the cluster.
     *
     * @return the cluster
     */
    public String getCluster()
    {
        return cluster;
    }

    /**
     * Sets the cluster.
     *
     * @param cluster
     *            the cluster
     * @return the workunit wrapper
     */
    public WorkunitWrapper setCluster(String cluster)
    {
        this.cluster = cluster;
        return this;
    }

    /**
     * Gets the cluster flag.
     *
     * @return the cluster flag
     */
    public Integer getClusterFlag()
    {
        return clusterFlag;
    }

    /**
     * Sets the cluster flag.
     *
     * @param clusterFlag
     *            the cluster flag
     * @return the workunit wrapper
     */
    public WorkunitWrapper setClusterFlag(Integer clusterFlag)
    {
        this.clusterFlag = clusterFlag;
        return this;
    }

    /**
     * Gets the date time scheduled.
     *
     * @return the date time scheduled
     */
    public Calendar getDateTimeScheduled()
    {
        return dateTimeScheduled;
    }

    /**
     * Sets the date time scheduled.
     *
     * @param dateTimeScheduled
     *            the date time scheduled
     * @return the workunit wrapper
     */
    public WorkunitWrapper setDateTimeScheduled(Calendar dateTimeScheduled)
    {
        this.dateTimeScheduled = dateTimeScheduled;
        return this;
    }

    /**
     * Gets the debug value count.
     *
     * @return the debug value count
     */
    public Integer getDebugValueCount()
    {
        return debugValueCount;
    }

    /**
     * Sets the debug value count.
     *
     * @param debugValueCount
     *            the debug value count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setDebugValueCount(Integer debugValueCount)
    {
        this.debugValueCount = debugValueCount;
        return this;
    }

    /**
     * Sets the sleep millis.
     *
     * @param sleepMillis
     *            the sleep millis
     * @return the workunit wrapper
     */
    public WorkunitWrapper setSleepMillis(int sleepMillis)
    {
        this.sleepMillis = sleepMillis;
        return this;
    }

    /**
     * Sets the application values.
     *
     * @param applicationValues2
     *            the application values 2
     * @return the workunit wrapper
     */
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

    /**
     * Sets the application values.
     *
     * @param appVals
     *            the app vals
     * @return the workunit wrapper
     */
    public WorkunitWrapper setApplicationValues(List<ApplicationValueWrapper> appVals)
    {
        applicationValues = appVals;
        return this;
    }

    /**
     * Sets the application values.
     *
     * @param vals
     *            the vals
     * @return the workunit wrapper
     */
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

    /**
     * Sets the application values.
     *
     * @param vals
     *            the vals
     * @return the workunit wrapper
     */
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

    /**
     * Sets the application values.
     *
     * @param vals
     *            the vals
     * @return the workunit wrapper
     */
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

    /**
     * Gets the alertcount.
     *
     * @return the alertcount
     */
    public Integer getAlertcount()
    {
        return alertcount;
    }

    /**
     * Sets the alertcount.
     *
     * @param alertcount
     *            the alertcount
     * @return the workunit wrapper
     */
    public WorkunitWrapper setAlertcount(Integer alertcount)
    {
        this.alertcount = alertcount;
        return this;
    }

    /**
     * Gets the debug values.
     *
     * @return the debug values
     */
    public List<DebugValueWrapper> getDebugValues()
    {
        return debugValues;
    }

    /**
     * Sets the debug values.
     *
     * @param debugValues2
     *            the debug values 2
     * @return the workunit wrapper
     */
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

    /**
     * Sets the debug values.
     *
     * @param debugValueArray
     *            the debug value array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the debug values.
     *
     * @param debugValueArray
     *            the debug value array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the debug values.
     *
     * @param debugValueArray
     *            the debug value array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the debug values.
     *
     * @param debugValues
     *            the debug values
     * @return the workunit wrapper
     */
    public WorkunitWrapper setDebugValues(List<DebugValueWrapper> debugValues)
    {
        this.debugValues = debugValues;
        return this;
    }

    /**
     * Gets the debug values desc.
     *
     * @return the debug values desc
     */
    public String getDebugValuesDesc()
    {
        return debugValuesDesc;
    }

    /**
     * Sets the debug values desc.
     *
     * @param debugValuesDesc
     *            the debug values desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setDebugValuesDesc(String debugValuesDesc)
    {
        this.debugValuesDesc = debugValuesDesc;
        return this;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description
     *            the description
     * @return the workunit wrapper
     */
    public WorkunitWrapper setDescription(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * Gets the error count.
     *
     * @return the error count
     */
    public Integer getErrorCount()
    {
        return errorCount;
    }

    /**
     * Sets the error count.
     *
     * @param errorCount
     *            the error count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setErrorCount(Integer errorCount)
    {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * Gets the event schedule.
     *
     * @return the event schedule
     */
    public Integer getEventSchedule()
    {
        return eventSchedule;
    }

    /**
     * Sets the event schedule.
     *
     * @param eventSchedule
     *            the event schedule
     * @return the workunit wrapper
     */
    public WorkunitWrapper setEventSchedule(Integer eventSchedule)
    {
        this.eventSchedule = eventSchedule;
        return this;
    }

    /**
     * Gets the exceptions.
     *
     * @return the exceptions
     */
    public ArrayOfECLExceptionWrapper getExceptions()
    {
        return exceptions;
    }

    /**
     * Sets the exceptions.
     *
     * @param eclExceptions
     *            the ecl exceptions
     * @return the workunit wrapper
     */
    public WorkunitWrapper setExceptions(ECLException[] eclExceptions)
    {
        if (eclExceptions != null && eclExceptions.length > 0)
        {
            exceptions = new ArrayOfECLExceptionWrapper(eclExceptions);
        }
        return this;
    }

    /**
     * Sets the exceptions.
     *
     * @param eclExceptions
     *            the ecl exceptions
     * @return the workunit wrapper
     */
    public WorkunitWrapper setExceptions(ArrayOfECLExceptionWrapper eclExceptions)
    {
        exceptions = eclExceptions;
        return this;
    }
    
    /**
     * Sets the exceptions.
     *
     * @param eclExceptions
     *            the ecl exceptions
     * @return the workunit wrapper
     */
    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            exceptions = new ArrayOfECLExceptionWrapper(eclExceptions);
        }
        return this;
    }

    /**
     * Sets the exceptions.
     *
     * @param eclExceptions
     *            the ecl exceptions
     * @return the workunit wrapper
     */
    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            exceptions = new ArrayOfECLExceptionWrapper(eclExceptions);
        }
        return this;
    }

    /**
     * Sets the exceptions.
     *
     * @param eclExceptions
     *            the ecl exceptions
     * @return the workunit wrapper
     */
    public WorkunitWrapper setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException[] eclExceptions)
    {
        if (eclExceptions != null)
        {
            exceptions = new ArrayOfECLExceptionWrapper(eclExceptions);
        }
        return this;
    }

    /**
     * Gets the graph count.
     *
     * @return the graph count
     */
    public Integer getGraphCount()
    {
        return graphCount;
    }

    /**
     * Sets the graph count.
     *
     * @param graphCount
     *            the graph count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setGraphCount(Integer graphCount)
    {
        this.graphCount = graphCount;
        return this;
    }

    /**
     * Gets the graphs.
     *
     * @return the graphs
     */
    public List<ECLGraphWrapper> getGraphs()
    {
        return graphs;
    }

    /**
     * Gets the graphs desc.
     *
     * @return the graphs desc
     */
    public String getGraphsDesc()
    {
        return graphsDesc;
    }

    /**
     * Sets the graphs desc.
     *
     * @param graphsDesc
     *            the graphs desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setGraphsDesc(String graphsDesc)
    {
        this.graphsDesc = graphsDesc;
        return this;
    }

    /**
     * Gets the checks for archive query.
     *
     * @return the checks for archive query
     */
    public Boolean getHasArchiveQuery()
    {
        return hasArchiveQuery;
    }

    /**
     * Sets the has archive query.
     *
     * @param hasArchiveQuery
     *            the has archive query
     * @return the workunit wrapper
     */
    public WorkunitWrapper setHasArchiveQuery(Boolean hasArchiveQuery)
    {
        this.hasArchiveQuery = hasArchiveQuery;
        return this;
    }

    /**
     * Gets the checks for debug value.
     *
     * @return the checks for debug value
     */
    public Boolean getHasDebugValue()
    {
        return hasDebugValue;
    }

    /**
     * Sets the has debug value.
     *
     * @param hasDebugValue
     *            the has debug value
     * @return the workunit wrapper
     */
    public WorkunitWrapper setHasDebugValue(Boolean hasDebugValue)
    {
        this.hasDebugValue = hasDebugValue;
        return this;
    }

    /**
     * Gets the helpers.
     *
     * @return the helpers
     */
    public List<ECLHelpFileWrapper> getHelpers()
    {
        return helpers;
    }

    /**
     * Sets the helpers.
     *
     * @param eclHelpFiles
     *            the ecl help files
     * @return the workunit wrapper
     */
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

    /**
     * Sets the helpers.
     *
     * @param eclHelpFileArray
     *            the ecl help file array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the helpers.
     *
     * @param eclHelpFileArray
     *            the ecl help file array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the helpers.
     *
     * @param eclHelpFileArray
     *            the ecl help file array
     * @return the workunit wrapper
     */
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

    /**
     * Gets the helpers desc.
     *
     * @return the helpers desc
     */
    public String getHelpersDesc()
    {
        return helpersDesc;
    }

    /**
     * Sets the helpers desc.
     *
     * @param helpersDesc
     *            the helpers desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setHelpersDesc(String helpersDesc)
    {
        this.helpersDesc = helpersDesc;
        return this;
    }

    /**
     * Gets the info count.
     *
     * @return the info count
     */
    public Integer getInfoCount()
    {
        return infoCount;
    }

    /**
     * Sets the info count.
     *
     * @param infoCount
     *            the info count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setInfoCount(Integer infoCount)
    {
        this.infoCount = infoCount;
        return this;
    }

    /**
     * Gets the checks if is pausing.
     *
     * @return the checks if is pausing
     */
    public Boolean getIsPausing()
    {
        return isPausing;
    }

    /**
     * Sets the is pausing.
     *
     * @param isPausing
     *            the is pausing
     * @return the workunit wrapper
     */
    public WorkunitWrapper setIsPausing(Boolean isPausing)
    {
        this.isPausing = isPausing;
        return this;
    }

    /**
     * Gets the jobname.
     *
     * @return the jobname
     */
    public String getJobname()
    {
        return jobname;
    }

    /**
     * Sets the jobname.
     *
     * @param jobname
     *            the jobname
     * @return the workunit wrapper
     */
    public WorkunitWrapper setJobname(String jobname)
    {
        this.jobname = jobname;
        return this;
    }

    /**
     * Gets the owner.
     *
     * @return the owner
     */
    public String getOwner()
    {
        return owner;
    }

    /**
     * Sets the owner.
     *
     * @param owner
     *            the owner
     * @return the workunit wrapper
     */
    public WorkunitWrapper setOwner(String owner)
    {
        this.owner = owner;
        return this;
    }

    /**
     * Gets the priority class.
     *
     * @return the priority class
     */
    public Integer getPriorityClass()
    {
        return priorityClass;
    }

    /**
     * Sets the priority class.
     *
     * @param priorityClass
     *            the priority class
     * @return the workunit wrapper
     */
    public WorkunitWrapper setPriorityClass(Integer priorityClass)
    {
        this.priorityClass = priorityClass;
        return this;
    }

    /**
     * Gets the priority level.
     *
     * @return the priority level
     */
    public Integer getPriorityLevel()
    {
        return priorityLevel;
    }

    /**
     * Sets the priority level.
     *
     * @param priorityLevel
     *            the priority level
     * @return the workunit wrapper
     */
    public WorkunitWrapper setPriorityLevel(Integer priorityLevel)
    {
        this.priorityLevel = priorityLevel;
        return this;
    }

    /**
     * Gets the query.
     *
     * @return the query
     */
    public ECLQueryWrapper getQuery()
    {
        return query;
    }

    /**
     * Gets the queue.
     *
     * @return the queue
     */
    public String getQueue()
    {
        return queue;
    }

    /**
     * Sets the queue.
     *
     * @param queue
     *            the queue
     * @return the workunit wrapper
     */
    public WorkunitWrapper setQueue(String queue)
    {
        this.queue = queue;
        return this;
    }

    /**
     * Gets the resource URL count.
     *
     * @return the resource URL count
     */
    public Integer getResourceURLCount()
    {
        return resourceURLCount;
    }

    /**
     * Sets the resource URL count.
     *
     * @param resourceURLCount
     *            the resource URL count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setResourceURLCount(Integer resourceURLCount)
    {
        this.resourceURLCount = resourceURLCount;
        return this;
    }

    /**
     * Gets the resource UR ls.
     *
     * @return the resource UR ls
     */
    public String[] getResourceURLs()
    {
        return resourceURLs;
    }

    /**
     * Sets the resource UR ls.
     *
     * @param resourceURLs
     *            the resource UR ls
     * @return the workunit wrapper
     */
    public WorkunitWrapper setResourceURLs(String[] resourceURLs)
    {
        this.resourceURLs = resourceURLs;
        return this;
    }

    /**
     * Gets the result count.
     *
     * @return the result count
     */
    public Integer getResultCount()
    {
        return resultCount;
    }

    /**
     * Sets the result count.
     *
     * @param resultCount
     *            the result count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setResultCount(Integer resultCount)
    {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * Sets the result limit.
     *
     * @param resultLimit
     *            the result limit
     * @return the workunit wrapper
     */
    public WorkunitWrapper setResultLimit(Integer resultLimit)
    {
        this.resultLimit = resultLimit;
        return this;
    }

    /**
     * Gets the results desc.
     *
     * @return the results desc
     */
    public String getResultsDesc()
    {
        return resultsDesc;
    }

    /**
     * Sets the results desc.
     *
     * @param resultsDesc
     *            the results desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setResultsDesc(String resultsDesc)
    {
        this.resultsDesc = resultsDesc;
        return this;
    }

    /**
     * Gets the roxie cluster.
     *
     * @return the roxie cluster
     */
    public String getRoxieCluster()
    {
        return roxieCluster;
    }

    /**
     * Sets the roxie cluster.
     *
     * @param roxieCluster
     *            the roxie cluster
     * @return the workunit wrapper
     */
    public WorkunitWrapper setRoxieCluster(String roxieCluster)
    {
        this.roxieCluster = roxieCluster;
        return this;
    }

    /**
     * Gets the scope.
     *
     * @return the scope
     */
    public String getScope()
    {
        return scope;
    }

    /**
     * Sets the scope.
     *
     * @param scope
     *            the scope
     * @return the workunit wrapper
     */
    public WorkunitWrapper setScope(String scope)
    {
        this.scope = scope;
        return this;
    }

    /**
     * Gets the snapshot.
     *
     * @return the snapshot
     */
    public String getSnapshot()
    {
        return snapshot;
    }

    /**
     * Sets the snapshot.
     *
     * @param snapshot
     *            the snapshot
     * @return the workunit wrapper
     */
    public WorkunitWrapper setSnapshot(String snapshot)
    {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Gets the source files.
     *
     * @return the source files
     */
    public List<ECLSourceFileWrapper> getSourceFiles()
    {
        return sourceFiles;
    }

    /**
     * Sets the source files.
     *
     * @param eclSourceFiles
     *            the ecl source files
     * @return the workunit wrapper
     */
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

    /**
     * Sets the source files.
     *
     * @param eclSourceFileArray
     *            the ecl source file array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the source files.
     *
     * @param eclSourceFileArray
     *            the ecl source file array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the source files.
     *
     * @param eclSourceFileArray
     *            the ecl source file array
     * @return the workunit wrapper
     */
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

    /**
     * Gets the source filels desc.
     *
     * @return the source filels desc
     */
    public String getSourceFilelsDesc()
    {
        return sourceFilelsDesc;
    }

    /**
     * Sets the source filels desc.
     *
     * @param sourceFilelsDesc
     *            the source filels desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setSourceFilelsDesc(String sourceFilelsDesc)
    {
        this.sourceFilelsDesc = sourceFilelsDesc;
        return this;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state
     *            the state
     * @return the workunit wrapper
     */
    public WorkunitWrapper setState(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Gets the state ex.
     *
     * @return the state ex
     */
    public String getStateEx()
    {
        return stateEx;
    }

    /**
     * Sets the state ex.
     *
     * @param stateEx
     *            the state ex
     * @return the workunit wrapper
     */
    public WorkunitWrapper setStateEx(String stateEx)
    {
        this.stateEx = stateEx;
        return this;
    }

    /**
     * Gets the state ID.
     *
     * @return the state ID
     */
    public Integer getStateID()
    {
        return stateID;
    }

    /**
     * Sets the state ID.
     *
     * @param stateID
     *            the state ID
     * @return the workunit wrapper
     */
    public WorkunitWrapper setStateID(Integer stateID)
    {
        this.stateID = stateID;
        return this;
    }

    /**
     * Gets the timer count.
     *
     * @return the timer count
     */
    public Integer getTimerCount()
    {
        return timerCount;
    }

    /**
     * Sets the timer count.
     *
     * @param timerCount
     *            the timer count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setTimerCount(Integer timerCount)
    {
        this.timerCount = timerCount;
        return this;
    }

    /**
     * Gets the timers desc.
     *
     * @return the timers desc
     */
    public String getTimersDesc()
    {
        return timersDesc;
    }

    /**
     * Sets the timers desc.
     *
     * @param timersDesc
     *            the timers desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setTimersDesc(String timersDesc)
    {
        this.timersDesc = timersDesc;
        return this;
    }

    /**
     * Gets the timing data.
     *
     * @return the timing data
     */
    public List<ECLTimingDataWrapper> getTimingData()
    {
        return timingData;
    }

    /**
     * Sets the timing data.
     *
     * @param eclTimingDatas
     *            the ecl timing datas
     * @return the workunit wrapper
     */
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

    /**
     * Sets the timing data.
     *
     * @param eclTimingDataArray
     *            the ecl timing data array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the timing data.
     *
     * @param eclTimingDataArray
     *            the ecl timing data array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the timing data.
     *
     * @param eclTimingDataArray
     *            the ecl timing data array
     * @return the workunit wrapper
     */
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

    /**
     * Gets the total cluster time.
     *
     * @return the total cluster time
     */
    public String getTotalClusterTime()
    {
        return totalClusterTime;
    }

    /**
     * Sets the total cluster time.
     *
     * @param totalClusterTime
     *            the total cluster time
     * @return the workunit wrapper
     */
    public WorkunitWrapper setTotalClusterTime(String totalClusterTime)
    {
        this.totalClusterTime = totalClusterTime;
        return this;
    }

    /**
     * Gets the variable count.
     *
     * @return the variable count
     */
    public Integer getVariableCount()
    {
        return variableCount;
    }

    /**
     * Sets the variable count.
     *
     * @param variableCount
     *            the variable count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setVariableCount(Integer variableCount)
    {
        this.variableCount = variableCount;
        return this;
    }

    /**
     * Gets the variables.
     *
     * @return the variables
     */
    public List<ECLResultWrapper> getVariables()
    {
        return variables;
    }

    /**
     * Sets the variables.
     *
     * @param variables
     *            the variables
     * @return the workunit wrapper
     */
    public WorkunitWrapper setVariables(List<ECLResultWrapper> variables)
    {
        this.variables = variables;
        return this;
    }

    /**
     * Checks if is thor LCR.
     *
     * @return true, if is thor LCR
     */
    public boolean isThorLCR()
    {
        return thorLCR;
    }

    /**
     * Sets the thor LCR.
     *
     * @param thorLCR
     *            the thor LCR
     * @return the workunit wrapper
     */
    public WorkunitWrapper setThorLCR(boolean thorLCR)
    {
        this.thorLCR = thorLCR;
        return this;
    }

    /**
     * Gets the thor log list.
     *
     * @return the thor log list
     */
    public List<ThorLogInfoWrapper> getThorLogList()
    {
        return thorLogList;
    }

    /**
     * Sets the thor log list.
     *
     * @param thorLogInfos
     *            the thor log infos
     * @return the workunit wrapper
     */
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

    /**
     * Sets the thor log list.
     *
     * @param thorLogInfoArray
     *            the thor log info array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the thor log list.
     *
     * @param thorLogInfoArray
     *            the thor log info array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the thor log list.
     *
     * @param thorLogList
     *            the thor log list
     * @return the workunit wrapper
     */
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

    /**
     * Gets the variables desc.
     *
     * @return the variables desc
     */
    public String getVariablesDesc()
    {
        return variablesDesc;
    }

    /**
     * Sets the variables desc.
     *
     * @param variablesDesc
     *            the variables desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setVariablesDesc(String variablesDesc)
    {
        this.variablesDesc = variablesDesc;
        return this;
    }

    /**
     * Gets the warning count.
     *
     * @return the warning count
     */
    public Integer getWarningCount()
    {
        return warningCount;
    }

    /**
     * Sets the warning count.
     *
     * @param warningCount
     *            the warning count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setWarningCount(Integer warningCount)
    {
        this.warningCount = warningCount;
        return this;
    }

    /**
     * Gets the workflow count.
     *
     * @return the workflow count
     */
    public Integer getWorkflowCount()
    {
        return workflowCount;
    }

    /**
     * Sets the workflow count.
     *
     * @param workflowCount
     *            the workflow count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setWorkflowCount(Integer workflowCount)
    {
        this.workflowCount = workflowCount;
        return this;
    }

    /**
     * Gets the workflows.
     *
     * @return the workflows
     */
    public List<ECLWorkflowWrapper> getWorkflows()
    {
        return workflows;
    }

    /**
     * Sets the workflows.
     *
     * @param eclWorkflowArray
     *            the ecl workflow array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the workflows.
     *
     * @param eclWorkflowArray
     *            the ecl workflow array
     * @return the workunit wrapper
     */
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

    /**
     * Sets the workflows.
     *
     * @param eclWorkflows
     *            the ecl workflows
     * @return the workunit wrapper
     */
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

    /**
     * Sets the workflows.
     *
     * @param eclWorkflows
     *            the ecl workflows
     * @return the workunit wrapper
     */
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

    /**
     * Gets the workflows desc.
     *
     * @return the workflows desc
     */
    public String getWorkflowsDesc()
    {
        return workflowsDesc;
    }

    /**
     * Sets the workflows desc.
     *
     * @param workflowsDesc
     *            the workflows desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setWorkflowsDesc(String workflowsDesc)
    {
        this.workflowsDesc = workflowsDesc;
        return this;
    }

    /**
     * Gets the wuid.
     *
     * @return the wuid
     */
    public String getWuid()
    {
        return wuid;
    }

    /**
     * Sets the wuid.
     *
     * @param wuid
     *            the wuid
     * @return the workunit wrapper
     */
    public WorkunitWrapper setWuid(String wuid)
    {
        this.wuid = wuid;
        return this;
    }

    /**
     * Gets the xml params.
     *
     * @return the xml params
     */
    public String getXmlParams()
    {
        return xmlParams;
    }

    /**
     * Sets the xml params.
     *
     * @param xmlParams
     *            the xml params
     * @return the workunit wrapper
     */
    public WorkunitWrapper setXmlParams(String xmlParams)
    {
        this.xmlParams = xmlParams;
        return this;
    }

    /**
     * Gets the source file count.
     *
     * @return the source file count
     */
    public Integer getSourceFileCount()
    {
        return sourceFileCount;
    }

    /**
     * Sets the source file count.
     *
     * @param sourceFileCount
     *            the source file count
     * @return the workunit wrapper
     */
    public WorkunitWrapper setSourceFileCount(Integer sourceFileCount)
    {
        this.sourceFileCount = sourceFileCount;
        return this;
    }

    /**
     * Gets the source files desc.
     *
     * @return the source files desc
     */
    public String getSourceFilesDesc()
    {
        return sourceFileDesc;
    }

    /**
     * Sets the source files desc.
     *
     * @param sourceFileDesc
     *            the source file desc
     * @return the workunit wrapper
     */
    public WorkunitWrapper setSourceFilesDesc(String sourceFileDesc)
    {
        this.sourceFileDesc = sourceFileDesc;
        return this;
    }

    /**
     * Gets the ecl workunit.
     *
     * @return the ecl workunit
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit getEclWorkunit()
    {
        return getLatestEclWorkunitVersion();
    }

    /**
     * Gets the ecl workunit version 79.
     *
     * @return the ecl workunit version 79
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit getLatestEclWorkunitVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit eclWorkunit = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit();

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
        if (this.getExceptions() != null && this.getExceptions().getECLException() != null)
        {
            ArrayOfECLException arrayofeclexceptions = new ArrayOfECLException();
            
            List<ECLExceptionWrapper> eclException = getExceptions().getECLException();
            for (ECLExceptionWrapper eclExceptionWrapper : eclException)
            {
                arrayofeclexceptions.addECLException(eclExceptionWrapper.getRaw());
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
                arraofeclresults.addECLResult(this.getResults().get(i).getRawLatestVersion());
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

    /**
     * Checks if is protected.
     *
     * @return the boolean
     */
    private Boolean isProtected()
    {
        return isProtected;
    }

    /**
     * Gets the thor LCR.
     *
     * @return the thor LCR
     */
    private Boolean getThorLCR()
    {
        return this.thorLCR;
    }

    /**
     * Gets the result views.
     *
     * @return the result views
     */
    public String[] getResultViews()
    {
        return resultViews;
    }

    /**
     * Sets the result views.
     *
     * @param resultViews
     *            the result views
     * @return the workunit wrapper
     */
    public WorkunitWrapper setResultViews(String[] resultViews)
    {
        this.resultViews = resultViews;
        return this;
    }
}
