package org.hpccsystems.ws.client;

//This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class ECLWorkunit extends org.hpccsystems.ws.client.soap.wsworkunits.ECLWorkunit implements Comparable<org.hpccsystems.ws.client.ECLWorkunit> {
	
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create an ECL workunit from a axis-generated soap class ECL Workunit
	 * @param base
	 */
	public ECLWorkunit(org.hpccsystems.ws.client.soap.wsworkunits.ECLWorkunit base) 
	{
		copy(base);
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(org.hpccsystems.ws.client.ECLWorkunit o) 
	{
		// TODO Auto-generated method stub
		if (o==null || o.getWuid()==null) {
			return 0;
		} else {
			//by default, sort by wuid descending, like ECL Watch
			return o.getWuid().compareTo(this.getWuid());
		}
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{	
		StringBuilder sb=new StringBuilder();
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
		sb.append("totalThorTime:").append(String.valueOf(getTotalThorTime())).append("\n");
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
		//TODO: include the content of unappended objects to the string
		return sb.toString();
	}

	/**
	 * Copy a soap ecl workunit object into the wrapper
	 * @param base
	 */
	private void copy(org.hpccsystems.ws.client.soap.wsworkunits.ECLWorkunit base) 
	{
		this.setWuid(base.getWuid());
		this.setOwner(base.getOwner());
		this.setCluster(base.getCluster());
		this.setRoxieCluster(base.getRoxieCluster());
		this.setJobname(base.getJobname());
		this.setQueue(base.getQueue());
		this.setStateID(base.getStateID());
		this.setState(base.getState());
		this.setStateEx(base.getStateEx());
		this.setDescription(base.getDescription());
		this.setAction(base.getAction());
		this.setActionEx(base.getActionEx());
		this.setDateTimeScheduled(base.getDateTimeScheduled());
		this.setPriorityClass(base.getPriorityClass());
		this.setPriorityLevel(base.getPriorityLevel());
		this.setScope(base.getScope());
		this.setSnapshot(base.getSnapshot());
		this.setResultLimit(base.getResultLimit());
		this.setEventSchedule(base.getEventSchedule());
		this.setTotalThorTime(base.getTotalThorTime());
		this.setErrorCount(base.getErrorCount());
		this.setWarningCount(base.getWarningCount());
		this.setInfoCount(base.getInfoCount());
		this.setGraphCount(base.getGraphCount());
		this.setSourceFileCount(base.getSourceFileCount());
		this.setResultCount(base.getResultCount());
		this.setVariableCount(base.getVariableCount());
		this.setTimerCount(base.getTimerCount());
		this.setHasDebugValue(base.getHasDebugValue());
		this.setApplicationValueCount(base.getApplicationValueCount());
		this.setXmlParams(base.getXmlParams());
		this.setAccessFlag(base.getAccessFlag());
		this.setClusterFlag(base.getClusterFlag());
		this.setHelpersDesc(base.getHelpersDesc());
		this.setGraphsDesc(base.getGraphsDesc());
		this.setSourceFilesDesc(base.getSourceFilesDesc());
		this.setResultsDesc(base.getResultsDesc());
		this.setVariablesDesc(base.getVariablesDesc());
		this.setTimersDesc(base.getTimersDesc());
		this.setDebugValuesDesc(base.getDebugValuesDesc());
		this.setApplicationValuesDesc(base.getApplicationValuesDesc());
		this.setWorkflowsDesc(base.getWorkflowsDesc());
		this.setHasArchiveQuery(base.getHasArchiveQuery());
		this.setExceptions(base.getExceptions());
		this.setSourceFiles(base.getSourceFiles());
		this.setResults(base.getResults());
		this.setVariables(base.getVariables());
		this.setDebugValues(base.getDebugValues());
		this.setApplicationValues(base.getApplicationValues());
		this.setAllowedClusters(base.getAllowedClusters());
	}

}
