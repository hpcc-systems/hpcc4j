package org.hpccsystems.ws.client.wrappers.wsworkunits;

public class WUInfoDetailsRequestWrapper
{

    private String wuid;

    private Boolean truncateEclTo64K;

    private String type;

    private Boolean includeExceptions;

    private Boolean includeGraphs;

    private Boolean includeSourceFiles;

    private Boolean includeResults;

    private Boolean includeResultsViewNames;

    private Boolean includeVariables;

    private Boolean includeTimers;

    private Boolean includeDebugValues;

    private Boolean includeApplicationValues;

    private Boolean includeWorkflows;

    private Boolean includeXmlSchemas;

    private Boolean includeResourceURLs;

    private Boolean includeECL;

    private Boolean includeHelpers;

    private Boolean includeAllowedClusters;

    private Boolean includeTotalClusterTime;

    private Boolean suppressResultSchemas;

    private String thorSlaveIP;

    /**
     * @return the wuid
     */
    public String getWuid()
    {
        return wuid;
    }

    /**
     * @param wuid the wuid to set
     */
    public void setWuid(String wuid)
    {
        this.wuid = wuid;
    }

    /**
     * @return the truncateEclTo64K
     */
    public Boolean getTruncateEclTo64K()
    {
        return truncateEclTo64K;
    }

    /**
     * @param truncateEclTo64K the truncateEclTo64K to set
     */
    public void setTruncateEclTo64K(Boolean truncateEclTo64K)
    {
        this.truncateEclTo64K = truncateEclTo64K;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @return the includeExceptions
     */
    public Boolean getIncludeExceptions()
    {
        return includeExceptions;
    }

    /**
     * @param includeExceptions the includeExceptions to set
     */
    public void setIncludeExceptions(Boolean includeExceptions)
    {
        this.includeExceptions = includeExceptions;
    }

    /**
     * @return the includeGraphs
     */
    public Boolean getIncludeGraphs()
    {
        return includeGraphs;
    }

    /**
     * @param includeGraphs the includeGraphs to set
     */
    public void setIncludeGraphs(Boolean includeGraphs)
    {
        this.includeGraphs = includeGraphs;
    }

    /**
     * @return the includeSourceFiles
     */
    public Boolean getIncludeSourceFiles()
    {
        return includeSourceFiles;
    }

    /**
     * @param includeSourceFiles the includeSourceFiles to set
     */
    public void setIncludeSourceFiles(Boolean includeSourceFiles)
    {
        this.includeSourceFiles = includeSourceFiles;
    }

    /**
     * @return the includeResults
     */
    public Boolean getIncludeResults()
    {
        return includeResults;
    }

    /**
     * @param includeResults the includeResults to set
     */
    public void setIncludeResults(Boolean includeResults)
    {
        this.includeResults = includeResults;
    }

    /**
     * @return the includeResultsViewNames
     */
    public Boolean getIncludeResultsViewNames()
    {
        return includeResultsViewNames;
    }

    /**
     * @param includeResultsViewNames the includeResultsViewNames to set
     */
    public void setIncludeResultsViewNames(Boolean includeResultsViewNames)
    {
        this.includeResultsViewNames = includeResultsViewNames;
    }

    /**
     * @return the includeVariables
     */
    public Boolean getIncludeVariables()
    {
        return includeVariables;
    }

    /**
     * @param includeVariables the includeVariables to set
     */
    public void setIncludeVariables(Boolean includeVariables)
    {
        this.includeVariables = includeVariables;
    }

    /**
     * @return the includeTimers
     */
    public Boolean getIncludeTimers()
    {
        return includeTimers;
    }

    /**
     * @param includeTimers the includeTimers to set
     */
    public void setIncludeTimers(Boolean includeTimers)
    {
        this.includeTimers = includeTimers;
    }

    /**
     * @return the includeDebugValues
     */
    public Boolean getIncludeDebugValues()
    {
        return includeDebugValues;
    }

    /**
     * @param includeDebugValues the includeDebugValues to set
     */
    public void setIncludeDebugValues(Boolean includeDebugValues)
    {
        this.includeDebugValues = includeDebugValues;
    }

    /**
     * @return the includeApplicationValues
     */
    public Boolean getIncludeApplicationValues()
    {
        return includeApplicationValues;
    }

    /**
     * @param includeApplicationValues the includeApplicationValues to set
     */
    public void setIncludeApplicationValues(Boolean includeApplicationValues)
    {
        this.includeApplicationValues = includeApplicationValues;
    }

    /**
     * @return the includeWorkflows
     */
    public Boolean getIncludeWorkflows()
    {
        return includeWorkflows;
    }

    /**
     * @param includeWorkflows the includeWorkflows to set
     */
    public void setIncludeWorkflows(Boolean includeWorkflows)
    {
        this.includeWorkflows = includeWorkflows;
    }

    /**
     * @return the includeXmlSchemas
     */
    public Boolean getIncludeXmlSchemas()
    {
        return includeXmlSchemas;
    }

    /**
     * @param includeXmlSchemas the includeXmlSchemas to set
     */
    public void setIncludeXmlSchemas(Boolean includeXmlSchemas)
    {
        this.includeXmlSchemas = includeXmlSchemas;
    }

    /**
     * @return the includeResourceURLs
     */
    public Boolean getIncludeResourceURLs()
    {
        return includeResourceURLs;
    }

    /**
     * @param includeResourceURLs the includeResourceURLs to set
     */
    public void setIncludeResourceURLs(Boolean includeResourceURLs)
    {
        this.includeResourceURLs = includeResourceURLs;
    }

    /**
     * @return the includeECL
     */
    public Boolean getIncludeECL()
    {
        return includeECL;
    }

    /**
     * @param includeECL the includeECL to set
     */
    public void setIncludeECL(Boolean includeECL)
    {
        this.includeECL = includeECL;
    }

    /**
     * @return the includeHelpers
     */
    public Boolean getIncludeHelpers()
    {
        return includeHelpers;
    }

    /**
     * @param includeHelpers the includeHelpers to set
     */
    public void setIncludeHelpers(Boolean includeHelpers)
    {
        this.includeHelpers = includeHelpers;
    }

    /**
     * @return the includeAllowedClusters
     */
    public Boolean getIncludeAllowedClusters()
    {
        return includeAllowedClusters;
    }

    /**
     * @param includeAllowedClusters the includeAllowedClusters to set
     */
    public void setIncludeAllowedClusters(Boolean includeAllowedClusters)
    {
        this.includeAllowedClusters = includeAllowedClusters;
    }

    /**
     * @return the includeTotalClusterTime
     */
    public Boolean getIncludeTotalClusterTime()
    {
        return includeTotalClusterTime;
    }

    /**
     * @param includeTotalClusterTime the includeTotalClusterTime to set
     */
    public void setIncludeTotalClusterTime(Boolean includeTotalClusterTime)
    {
        this.includeTotalClusterTime = includeTotalClusterTime;
    }

    /**
     * @return the suppressResultSchemas
     */
    public Boolean getSuppressResultSchemas()
    {
        return suppressResultSchemas;
    }

    /**
     * @param suppressResultSchemas the suppressResultSchemas to set
     */
    public void setSuppressResultSchemas(Boolean suppressResultSchemas)
    {
        this.suppressResultSchemas = suppressResultSchemas;
    }

    /**
     * @return the thorSlaveIP
     */
    public String getThorSlaveIP()
    {
        return thorSlaveIP;
    }

    /**
     * @param thorSlaveIP the thorSlaveIP to set
     */
    public void setThorSlaveIP(String thorSlaveIP)
    {
        this.thorSlaveIP = thorSlaveIP;
    }
}
