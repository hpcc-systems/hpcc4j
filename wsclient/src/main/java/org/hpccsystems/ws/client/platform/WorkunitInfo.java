package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_69.*;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class WorkunitInfo implements
        Comparable<org.hpccsystems.ws.client.platform.WorkunitInfo>
{
    private int               maxMonitorTime   = HPCCWsWorkUnitsClient.defaultMaxWaitTime;
    private int               sleepMillis      = HPCCWsWorkUnitsClient.defaultWaitTime;
    private List<NamedValueInfo>      namedValues      = null;
    private String originalEclWatchUrl=null;
    private List<ApplicationValueInfo> applicationValues;
    private List<ECLResultInfo> eclResults;
    private Integer accessFlag;
    private Integer action;
    private String actionEx;
    private Boolean active;
    private Integer alertcount;
    private String[] allowedClusters;
    private Integer applicationValueCount;
    private String applicationValuesDesc;
    private Boolean archived;
    private String cluster;
    private Integer clusterFlag;
    private Calendar dateTimeScheduled;
    private Integer debugValueCount;
    private DebugValue[] debugValues;
    private String debugValuesDesc;
    private String description;
    private Integer errorCount;
    private Integer eventSchedule;
    private List<ECLExceptionInfo> exceptions;
    private Integer graphCount;
    private ECLGraph[] graphs;
    private String graphsDesc;
    private Boolean hasArchiveQuery;
    private Boolean hasDebugValue;
    private ECLHelpFile[] helpers;
    private String helpersDesc;
    private Integer infoCount;
    private Boolean isPausing;
    private String jobname;
    private String owner;
    private Integer priorityClass;
    private Integer priorityLevel;
    private ECLQuery query;
    private String queue;
    private Integer resourceURLCount;
    private String[] resourceURLs;
    private Integer resultCount;
    private Integer resultLimit;
    private String resultsDesc;
    private String roxieCluster;
    private String scope;
    private String snapshot;
    private ECLSourceFile[] sourceFiles;
    private String sourceFilelsDesc;
    private String state;
    private String stateEx;
    private Integer stateID;
    private Integer sourceFileCount;
    private String sourceFileDesc;
    private Integer timerCount;
    private String timersDesc;
    private ECLTimingData[] timingData;
    private String totalClusterTime;
    private Integer variableCount;
    private List<ECLResultInfo> variables;
    private boolean thorLCR;
    private ThorLogInfo[] thorLogList;
    private String variablesDesc;
    private Integer warningCount;
    private Integer workflowCount;
    private ECLWorkflow[] workflows;
    private String workflowsDesc;
    private String wuid;
    private String xmlParams;
    /**
     * Create an ECL workunit from a axis-generated soap class ECL Workunit
     * 
     * @param base
     */
    public WorkunitInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLWorkunit base)
    {
        copy(base);
    }

    public WorkunitInfo() {}

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(org.hpccsystems.ws.client.platform.WorkunitInfo wu)
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
    private void copy(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLWorkunit base)
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
        this.setAllowedClusters(base.getAllowedClusters());
        this.setApplicationValueCount(base.getApplicationValueCount());
        if (base.getApplicationValues() != null)
        {
            this.applicationValues=new ArrayList<ApplicationValueInfo>();
            for (int i=0; i < base.getApplicationValues().length;i++) {
                applicationValues.add(new ApplicationValueInfo(base.getApplicationValues()[i]));
            }
        }
        this.setApplicationValuesDesc(base.getApplicationValuesDesc());
        this.setArchived(base.getArchived());
        this.setCluster(base.getCluster());
        this.setClusterFlag(base.getClusterFlag());
        this.setDateTimeScheduled(base.getDateTimeScheduled());
        this.setDebugValueCount(base.getDebugValueCount());
        this.setDebugValues(base.getDebugValues());
        this.setDebugValuesDesc(base.getDebugValuesDesc());
        this.setDescription(base.getDescription());        
        this.setErrorCount(base.getErrorCount());
        this.setEventSchedule(base.getEventSchedule());
        if (base.getExceptions() != null ) {
            this.exceptions=new ArrayList<ECLExceptionInfo>();
            for (int i=0; i < base.getExceptions().length;i++) {
                exceptions.add(new ECLExceptionInfo(base.getExceptions()[i]));
            }
        }
        this.setGraphCount(base.getGraphCount());
        this.setGraphs(base.getGraphs());
        this.setGraphsDesc(base.getGraphsDesc());
        this.setHasArchiveQuery(base.getHasArchiveQuery());
        this.setHasDebugValue(base.getHasDebugValue());
        this.setHelpers(base.getHelpers());
        this.setHelpersDesc(base.getHelpersDesc());
        this.setInfoCount(base.getInfoCount());
        this.setIsPausing(base.getIsPausing());
        this.setJobname(base.getJobname());
        this.setOwner(base.getOwner());
        this.setPriorityClass(base.getPriorityClass());
        this.setPriorityLevel(base.getPriorityLevel());
        this.setQuery(base.getQuery());
        this.setQueue(base.getQueue());
        this.setResourceURLCount(base.getResourceURLCount());
        this.setResourceURLs(base.getResourceURLs());
        this.setResultCount(base.getResultCount());
        this.setResultLimit(base.getResultLimit());
        if (base.getResults() != null)
        {
            this.eclResults=new ArrayList<ECLResultInfo>();
            for (int i=0; i < base.getResults().length;i++) {
                eclResults.add(new ECLResultInfo(base.getResults()[i]));
            }
        }
        this.setResultsDesc(base.getResultsDesc());
        this.setRoxieCluster(base.getRoxieCluster());
        this.setScope(base.getScope());
        this.setSnapshot(base.getSnapshot());
        this.setSourceFileCount(base.getSourceFileCount());
        this.setSourceFiles(base.getSourceFiles());
        this.setSourceFilesDesc(base.getSourceFilesDesc());
        this.setState(base.getState());
        this.setStateEx(base.getStateEx());
        this.setStateID(base.getStateID());
        this.setTimerCount(base.getTimerCount());
        this.setTimersDesc(base.getTimersDesc());
        this.setTimingData(base.getTimingData());
        this.setTotalClusterTime(base.getTotalClusterTime());
        this.setVariableCount(base.getVariableCount());
        if (base.getVariables() != null)
        {
            this.variables=new ArrayList<ECLResultInfo>();
            for (int i=0; i < base.getVariables().length;i++) {
                variables.add(new ECLResultInfo(base.getVariables()[i]));
            }
        }
        this.setThorLCR(base.getThorLCR());
        this.setThorLogList(base.getThorLogList());        
        this.setVariablesDesc(base.getVariablesDesc());
        this.setWarningCount(base.getWarningCount());
        this.setWorkflowCount(base.getWorkflowCount());
        this.setWorkflows(base.getWorkflows());
        this.setWorkflowsDesc(base.getWorkflowsDesc());
        this.setWuid(base.getWuid());
        this.setXmlParams(base.getXmlParams());

    }

    public boolean update(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLWorkunit wu)
    {
        boolean retVal = false;
        if (wu != null && this.getWuid().equals(wu.getWuid()) && !this.equals(wu))
        {
            if (updateState(wu))
            {
                retVal = true;
            }
            // RODRIGO other updates missing here...
        }
        return retVal;
    }

    synchronized boolean updateState(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLWorkunit wu)
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


    public void setMaxMonitorMillis(int time)
    {
        maxMonitorTime = time;
    }

    public int getMaxMonitorMillis()
    {
        return maxMonitorTime;
    }

    public Integer getSleepMillis()
    {
        return sleepMillis;
    }

    public void setSleepMillis(Integer sleepTime)
    {
        this.sleepMillis = sleepTime;
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

    public List<NamedValueInfo> getNamedValues()
    {
        return namedValues;
    }

    public void setNamedValues(List<NamedValueInfo> namedValues)
    {
        this.namedValues = namedValues;
    }

    public void setECL(String ecl)
    {
        if (this.getQuery() == null)
        {
            this.setQuery(new ECLQuery());
        }
        this.getQuery().setText(ecl);
    }

    public String getECL()
    {
        if (this.getQuery() == null)
        {
            return "";
        }
        return this.getQuery().getText();
    }

	public String getOriginalEclWatchUrl() {
		return originalEclWatchUrl;
	}

	public void setOriginalEclWatchUrl(String serverhost) {
		this.originalEclWatchUrl=serverhost;
	}
    
	public List<ApplicationValueInfo> getApplicationValues() 
	{
	    return applicationValues;
	}
	
	public ApplicationValue[] getRawApplicationValues() 
	{
	    if (applicationValues==null)
	    {
	        return null;
	    }
	    ApplicationValue[] raw=new ApplicationValue[applicationValues.size()];
	    int i=0;
	    for (ApplicationValueInfo item:applicationValues) {
	        raw[i]=item.getRaw();
	        i++;
	    }
	    return raw;
	}
	
	public NamedValue[] getRawNamedValues() 
    {
        if (namedValues==null)
        {
            return null;
        }
        NamedValue[] raw=new NamedValue[namedValues.size()];
        int i=0;
        for (NamedValueInfo item:namedValues) {
            raw[i]=item.getRaw();
            i++;
        }
        return raw;
    }
	
	public void setNamedValues(NamedValue[] raw) 
	{
	    if (raw==null) 
	    {
	        return;
	    }
	    namedValues=new ArrayList<NamedValueInfo>();
	    for (int i=0; i < raw.length;i++) 
	    {
	        namedValues.add(new NamedValueInfo(raw[i]));
	    }
	}
    public int getMaxMonitorTime() {
        return maxMonitorTime;
    }

    public void setMaxMonitorTime(int maxMonitorTime) {
        this.maxMonitorTime = maxMonitorTime;
    }

    public List<ECLResultInfo> getResults() {
        return eclResults;
    }

    public void setResults(List<ECLResultInfo> eclResults) {
        this.eclResults = eclResults;
    }

    public Integer getAccessFlag() {
        return accessFlag;
    }

    public void setAccessFlag(Integer accessFlag) {
        this.accessFlag = accessFlag;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getActionEx() {
        return actionEx;
    }

    public void setActionEx(String actionEx) {
        this.actionEx = actionEx;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getAlertCount() {
        return alertcount;
    }

    public void setAlertCount(Integer alertcount) {
        this.alertcount = alertcount;
    }

    public String[] getAllowedClusters() {
        return allowedClusters;
    }

    public void setAllowedClusters(String[] allowedClusters) {
        this.allowedClusters = allowedClusters;
    }

    public Integer getApplicationValueCount() {
        return applicationValueCount;
    }

    public void setApplicationValueCount(Integer applicationValueCount) {
        this.applicationValueCount = applicationValueCount;
    }

    public String getApplicationValuesDesc() {
        return applicationValuesDesc;
    }

    public void setApplicationValuesDesc(String applicationValuesDesc) {
        this.applicationValuesDesc = applicationValuesDesc;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public Integer getClusterFlag() {
        return clusterFlag;
    }

    public void setClusterFlag(Integer clusterFlag) {
        this.clusterFlag = clusterFlag;
    }

    public Calendar getDateTimeScheduled() {
        return dateTimeScheduled;
    }

    public void setDateTimeScheduled(Calendar dateTimeScheduled) {
        this.dateTimeScheduled = dateTimeScheduled;
    }

    public Integer getDebugValueCount() {
        return debugValueCount;
    }

    public void setDebugValueCount(Integer debugValueCount) {
        this.debugValueCount = debugValueCount;
    }

    public void setSleepMillis(int sleepMillis) {
        this.sleepMillis = sleepMillis;
    }

    public void setApplicationValues(List<ApplicationValueInfo> applicationValues) {
        this.applicationValues = applicationValues;
    }

    public void setApplicationValues(ApplicationValue[] vals)
    {
        if (vals==null)
        {
            return;
        }
        applicationValues=new ArrayList<ApplicationValueInfo>();
        for (int i=0; i < vals.length;i++) {
            applicationValues.add(new ApplicationValueInfo(vals[i]));
        }
    }
    public Integer getAlertcount() {
        return alertcount;
    }

    public void setAlertcount(Integer alertcount) {
        this.alertcount = alertcount;
    }

    public DebugValue[] getDebugValues() {
        return debugValues;
    }

    public void setDebugValues(DebugValue[] debugValues) {
        this.debugValues = debugValues;
    }

    public String getDebugValuesDesc() {
        return debugValuesDesc;
    }

    public void setDebugValuesDesc(String debugValuesDesc) {
        this.debugValuesDesc = debugValuesDesc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Integer getEventSchedule() {
        return eventSchedule;
    }

    public void setEventSchedule(Integer eventSchedule) {
        this.eventSchedule = eventSchedule;
    }

    public List<ECLExceptionInfo> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<ECLExceptionInfo> exceptions) {
        this.exceptions = exceptions;
    }

    public Integer getGraphCount() {
        return graphCount;
    }

    public void setGraphCount(Integer graphCount) {
        this.graphCount = graphCount;
    }

    public ECLGraph[] getGraphs() {
        return graphs;
    }

    public void setGraphs(ECLGraph[] graphs) {
        this.graphs = graphs;
    }

    public String getGraphsDesc() {
        return graphsDesc;
    }

    public void setGraphsDesc(String graphsDesc) {
        this.graphsDesc = graphsDesc;
    }

    public Boolean getHasArchiveQuery() {
        return hasArchiveQuery;
    }

    public void setHasArchiveQuery(Boolean hasArchiveQuery) {
        this.hasArchiveQuery = hasArchiveQuery;
    }

    public Boolean getHasDebugValue() {
        return hasDebugValue;
    }

    public void setHasDebugValue(Boolean hasDebugValue) {
        this.hasDebugValue = hasDebugValue;
    }

    public ECLHelpFile[] getHelpers() {
        return helpers;
    }

    public void setHelpers(ECLHelpFile[] helpers) {
        this.helpers = helpers;
    }

    public String getHelpersDesc() {
        return helpersDesc;
    }

    public void setHelpersDesc(String helpersDesc) {
        this.helpersDesc = helpersDesc;
    }

    public Integer getInfoCount() {
        return infoCount;
    }

    public void setInfoCount(Integer infoCount) {
        this.infoCount = infoCount;
    }

    public Boolean getIsPausing() {
        return isPausing;
    }

    public void setIsPausing(Boolean isPausing) {
        this.isPausing = isPausing;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getPriorityClass() {
        return priorityClass;
    }

    public void setPriorityClass(Integer priorityClass) {
        this.priorityClass = priorityClass;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public ECLQuery getQuery() {
        return query;
    }

    public void setQuery(ECLQuery query) {
        this.query = query;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public Integer getResourceURLCount() {
        return resourceURLCount;
    }

    public void setResourceURLCount(Integer resourceURLCount) {
        this.resourceURLCount = resourceURLCount;
    }

    public String[] getResourceURLs() {
        return resourceURLs;
    }

    public void setResourceURLs(String[] resourceURLs) {
        this.resourceURLs = resourceURLs;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public void setResultLimit(Integer resultLimit) {
        this.resultLimit = resultLimit;
    }

    public String getResultsDesc() {
        return resultsDesc;
    }

    public void setResultsDesc(String resultsDesc) {
        this.resultsDesc = resultsDesc;
    }

    public String getRoxieCluster() {
        return roxieCluster;
    }

    public void setRoxieCluster(String roxieCluster) {
        this.roxieCluster = roxieCluster;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public ECLSourceFile[] getSourceFiles() {
        return sourceFiles;
    }

    public void setSourceFiles(ECLSourceFile[] sourceFiles) {
        this.sourceFiles = sourceFiles;
    }

    public String getSourceFilelsDesc() {
        return sourceFilelsDesc;
    }

    public void setSourceFilelsDesc(String sourceFilelsDesc) {
        this.sourceFilelsDesc = sourceFilelsDesc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateEx() {
        return stateEx;
    }

    public void setStateEx(String stateEx) {
        this.stateEx = stateEx;
    }

    public Integer getStateID() {
        return stateID;
    }

    public void setStateID(Integer stateID) {
        this.stateID = stateID;
    }

    public Integer getTimerCount() {
        return timerCount;
    }

    public void setTimerCount(Integer timerCount) {
        this.timerCount = timerCount;
    }

    public String getTimersDesc() {
        return timersDesc;
    }

    public void setTimersDesc(String timersDesc) {
        this.timersDesc = timersDesc;
    }

    public ECLTimingData[] getTimingData() {
        return timingData;
    }

    public void setTimingData(ECLTimingData[] timingData) {
        this.timingData = timingData;
    }

    public String getTotalClusterTime() {
        return totalClusterTime;
    }

    public void setTotalClusterTime(String totalClusterTime) {
        this.totalClusterTime = totalClusterTime;
    }

    public Integer getVariableCount() {
        return variableCount;
    }

    public void setVariableCount(Integer variableCount) {
        this.variableCount = variableCount;
    }

    public List<ECLResultInfo> getVariables() {
        return variables;
    }

    public void setVariables(List<ECLResultInfo> variables) {
        this.variables = variables;
    }

    public boolean isThorLCR() {
        return thorLCR;
    }

    public void setThorLCR(boolean thorLCR) {
        this.thorLCR = thorLCR;
    }

    public ThorLogInfo[] getThorLogList() {
        return thorLogList;
    }

    public void setThorLogList(ThorLogInfo[] thorLogList) {
        this.thorLogList = thorLogList;
    }

    public String getVariablesDesc() {
        return variablesDesc;
    }

    public void setVariablesDesc(String variablesDesc) {
        this.variablesDesc = variablesDesc;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
    }

    public Integer getWorkflowCount() {
        return workflowCount;
    }

    public void setWorkflowCount(Integer workflowCount) {
        this.workflowCount = workflowCount;
    }

    public ECLWorkflow[] getWorkflows() {
        return workflows;
    }

    public void setWorkflows(ECLWorkflow[] workflows) {
        this.workflows = workflows;
    }

    public String getWorkflowsDesc() {
        return workflowsDesc;
    }

    public void setWorkflowsDesc(String workflowsDesc) {
        this.workflowsDesc = workflowsDesc;
    }

    public String getWuid() {
        return wuid;
    }

    public void setWuid(String wuid) {
        this.wuid = wuid;
    }

    public String getXmlParams() {
        return xmlParams;
    }

    public void setXmlParams(String xmlParams) {
        this.xmlParams = xmlParams;
    }

    public Integer getSourceFileCount() {
        return sourceFileCount;
    }

    public void setSourceFileCount(Integer sourceFileCount) {
        this.sourceFileCount = sourceFileCount;
    }

    public String getSourceFilesDesc() {
        return sourceFileDesc;
    }

    public void setSourceFilesDesc(String sourceFileDesc) {
        this.sourceFileDesc = sourceFileDesc;
    }


}
