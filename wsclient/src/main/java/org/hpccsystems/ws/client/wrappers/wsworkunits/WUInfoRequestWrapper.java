package org.hpccsystems.ws.client.wrappers.wsworkunits;

@Deprecated
public class WUInfoRequestWrapper
{
    private String wuid;
    private Boolean truncateEclTo64K;
    private Boolean unarchive=false;
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
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfo getRaw()
    {
        return getRawLatestVersion();
    }

    /**
     * Gets the raw version 1 81.
     *
     * @return the raw version 1 81
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfo getRawLatestVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfo request = 
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfo();

        if (getIncludeAllowedClusters() != null)
            request.setIncludeAllowedClusters(this.getIncludeAllowedClusters());
        if (getIncludeApplicationValues() != null)
            request.setIncludeApplicationValues(this.getIncludeApplicationValues());
        if (getIncludeDebugValues() != null)
            request.setIncludeDebugValues(this.getIncludeDebugValues());
        if (getIncludeECL() != null)
            request.setIncludeECL(this.getIncludeECL());
        if (getIncludeExceptions() != null)
            request.setIncludeExceptions(this.getIncludeExceptions());
        if (getIncludeGraphs() != null)
            request.setIncludeGraphs(this.getIncludeGraphs());
        if (getIncludeGraphs() != null)
            request.setIncludeHelpers(this.getIncludeGraphs());
        if (getIncludeHelpers() != null)
            request.setIncludeHelpers(this.getIncludeHelpers());
        if (getIncludeResourceURLs() != null)
            request.setIncludeResourceURLs(this.getIncludeResourceURLs());
        if (getIncludeResults() != null)
            request.setIncludeResults(this.getIncludeResults());
        if (getIncludeResultsViewNames() != null)
            request.setIncludeResultsViewNames(this.getIncludeResultsViewNames());
        if (getIncludeSourceFiles() != null)
            request.setIncludeSourceFiles(this.getIncludeSourceFiles());
        if (getIncludeTimers() != null)
            request.setIncludeTimers(this.getIncludeTimers());
        if (getIncludeVariables() != null)
            request.setIncludeVariables(this.getIncludeVariables());
        if (getIncludeWorkflows() != null)
            request.setIncludeWorkflows(this.getIncludeWorkflows());
        if (getIncludeXmlSchemas() != null)
            request.setIncludeXmlSchemas(this.getIncludeXmlSchemas());
        if (getSuppressResultSchemas() != null)
            request.setSuppressResultSchemas(this.getSuppressResultSchemas());
        if (getTruncateEclTo64K() != null)
            request.setTruncateEclTo64K(this.getTruncateEclTo64K());
        if (getType() != null)
            request.setType(this.getType());
        if (getWuid() != null)
            request.setWuid(this.getWuid());

        return request;
    }

    /**
     * Gets the raw version 1 69.
     *
     * @return the raw version 1 69
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo request =
            new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo();

        if (getIncludeAllowedClusters() != null)
            request.setIncludeAllowedClusters(this.getIncludeAllowedClusters());
        if (getIncludeApplicationValues() != null)
            request.setIncludeApplicationValues(this.getIncludeApplicationValues());
        if(getIncludeDebugValues() != null)
            request.setIncludeDebugValues(this.getIncludeDebugValues());
        if(getIncludeECL() != null)
            request.setIncludeECL(this.getIncludeECL());
        if(getIncludeExceptions() != null)
            request.setIncludeExceptions(this.getIncludeExceptions());
        if(getIncludeGraphs() != null)
            request.setIncludeGraphs(this.getIncludeGraphs());
        if(getIncludeHelpers() != null)
            request.setIncludeHelpers(this.getIncludeHelpers());
        if(getIncludeResourceURLs() != null)
            request.setIncludeResourceURLs(this.getIncludeResourceURLs());
        if (getIncludeResults() != null)
            request.setIncludeResults(this.getIncludeResults());
        if (getIncludeResultsViewNames() != null)
            request.setIncludeResultsViewNames(this.getIncludeResultsViewNames());
        if (getIncludeSourceFiles() != null)
            request.setIncludeSourceFiles(this.getIncludeSourceFiles());
        if (getIncludeTimers() != null)
            request.setIncludeTimers(this.getIncludeTimers());
        if (getIncludeVariables() != null)
            request.setIncludeVariables(this.getIncludeVariables());
        if (getIncludeWorkflows() != null)
            request.setIncludeWorkflows(this.getIncludeWorkflows());
        if (getIncludeXmlSchemas() != null)
            request.setIncludeXmlSchemas(this.getIncludeXmlSchemas());
        if (getSuppressResultSchemas() != null)
            request.setSuppressResultSchemas(this.getSuppressResultSchemas());
        if (getTruncateEclTo64K() != null)
            request.setTruncateEclTo64K(this.getTruncateEclTo64K());
        if (getType() != null)
            request.setType(this.getType());
        if (getWuid() != null)
            request.setWuid(this.getWuid());

        //org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDocument requestDoc =
        //        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDocument.Factory.newInstance();

        //requestDoc.setWUInfo(request);

        return request;
    }

    /**
     * Gets the raw version 1 62.
     *
     * @return the raw version 1 62
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUInfo getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUInfo request =
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUInfo();

        if (getIncludeApplicationValues() != null)
            request.setIncludeApplicationValues(this.getIncludeApplicationValues());
        if(getIncludeDebugValues() != null)
            request.setIncludeDebugValues(this.getIncludeDebugValues());
        if(getIncludeExceptions() != null)
            request.setIncludeExceptions(this.getIncludeExceptions());
        if(getIncludeGraphs() != null)
            request.setIncludeGraphs(this.getIncludeGraphs());
        if(getIncludeResourceURLs() != null)
            request.setIncludeResourceURLs(this.getIncludeResourceURLs());
        if (getIncludeResults() != null)
            request.setIncludeResults(this.getIncludeResults());
        if (getIncludeResultsViewNames() != null)
            request.setIncludeResultsViewNames(this.getIncludeResultsViewNames());
        if (getIncludeSourceFiles() != null)
            request.setIncludeSourceFiles(this.getIncludeSourceFiles());
        if (getIncludeTimers() != null)
            request.setIncludeTimers(this.getIncludeTimers());
        if (getIncludeVariables() != null)
            request.setIncludeVariables(this.getIncludeVariables());
        if (getIncludeWorkflows() != null)
            request.setIncludeWorkflows(this.getIncludeWorkflows());
        if (getIncludeXmlSchemas() != null)
            request.setIncludeXmlSchemas(this.getIncludeXmlSchemas());
        if (getSuppressResultSchemas() != null)
            request.setSuppressResultSchemas(this.getSuppressResultSchemas());
        if (getTruncateEclTo64K() != null)
            request.setTruncateEclTo64K(this.getTruncateEclTo64K());
        if (getType() != null)
            request.setType(this.getType());
        if (getWuid() != null)
            request.setWuid(this.getWuid());

        return request;
    }

    /**
     * Gets the raw version 1 58.
     *
     * @return the raw version 1 58
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUInfo getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUInfo request =
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUInfo();

        if (getIncludeApplicationValues() != null)
            request.setIncludeApplicationValues(this.getIncludeApplicationValues());
        if(getIncludeDebugValues() != null)
            request.setIncludeDebugValues(this.getIncludeDebugValues());
        if(getIncludeExceptions() != null)
            request.setIncludeExceptions(this.getIncludeExceptions());
        if(getIncludeGraphs() != null)
            request.setIncludeGraphs(this.getIncludeGraphs());
        if(getIncludeResourceURLs() != null)
            request.setIncludeResourceURLs(this.getIncludeResourceURLs());
        if (getIncludeResults() != null)
            request.setIncludeResults(this.getIncludeResults());
        if (getIncludeResultsViewNames() != null)
            request.setIncludeResultsViewNames(this.getIncludeResultsViewNames());
        if (getIncludeSourceFiles() != null)
            request.setIncludeSourceFiles(this.getIncludeSourceFiles());
        if (getIncludeTimers() != null)
            request.setIncludeTimers(this.getIncludeTimers());
        if (getIncludeVariables() != null)
            request.setIncludeVariables(this.getIncludeVariables());
        if (getIncludeWorkflows() != null)
            request.setIncludeWorkflows(this.getIncludeWorkflows());
        if (getIncludeXmlSchemas() != null)
            request.setIncludeXmlSchemas(this.getIncludeXmlSchemas());
        if (getSuppressResultSchemas() != null)
            request.setSuppressResultSchemas(this.getSuppressResultSchemas());
        if (getTruncateEclTo64K() != null)
            request.setTruncateEclTo64K(this.getTruncateEclTo64K());
        if (getType() != null)
            request.setType(this.getType());
        if (getWuid() != null)
            request.setWuid(this.getWuid());

        return request;
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
     *            the wuid to set
     */
    public void setWuid(String wuid)
    {
        this.wuid = wuid;
    }

    /**
     * Gets the truncate ecl to 64 K.
     *
     * @return the truncateEclTo64K
     */
    public Boolean getTruncateEclTo64K()
    {
        return truncateEclTo64K;
    }

    /**
     * Sets the truncate ecl to 64 K.
     *
     * @param truncateEclTo64K
     *            the truncateEclTo64K to set
     */
    public void setTruncateEclTo64K(Boolean truncateEclTo64K)
    {
        this.truncateEclTo64K = truncateEclTo64K;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Gets the include exceptions.
     *
     * @return the includeExceptions
     */
    public Boolean getIncludeExceptions()
    {
        return includeExceptions;
    }

    /**
     * Sets the include exceptions.
     *
     * @param includeExceptions
     *            the includeExceptions to set
     */
    public void setIncludeExceptions(Boolean includeExceptions)
    {
        this.includeExceptions = includeExceptions;
    }

    /**
     * Gets the include graphs.
     *
     * @return the includeGraphs
     */
    public Boolean getIncludeGraphs()
    {
        return includeGraphs;
    }

    /**
     * Sets the include graphs.
     *
     * @param includeGraphs
     *            the includeGraphs to set
     */
    public void setIncludeGraphs(Boolean includeGraphs)
    {
        this.includeGraphs = includeGraphs;
    }

    /**
     * Gets the include source files.
     *
     * @return the includeSourceFiles
     */
    public Boolean getIncludeSourceFiles()
    {
        return includeSourceFiles;
    }

    /**
     * Sets the include source files.
     *
     * @param includeSourceFiles
     *            the includeSourceFiles to set
     */
    public void setIncludeSourceFiles(Boolean includeSourceFiles)
    {
        this.includeSourceFiles = includeSourceFiles;
    }

    /**
     * Gets the include results.
     *
     * @return the includeResults
     */
    public Boolean getIncludeResults()
    {
        return includeResults;
    }

    /**
     * Sets the include results.
     *
     * @param includeResults
     *            the includeResults to set
     */
    public void setIncludeResults(Boolean includeResults)
    {
        this.includeResults = includeResults;
    }

    /**
     * Gets the include results view names.
     *
     * @return the includeResultsViewNames
     */
    public Boolean getIncludeResultsViewNames()
    {
        return includeResultsViewNames;
    }

    /**
     * Sets the include results view names.
     *
     * @param includeResultsViewNames
     *            the includeResultsViewNames to set
     */
    public void setIncludeResultsViewNames(Boolean includeResultsViewNames)
    {
        this.includeResultsViewNames = includeResultsViewNames;
    }

    /**
     * Gets the include variables.
     *
     * @return the includeVariables
     */
    public Boolean getIncludeVariables()
    {
        return includeVariables;
    }

    /**
     * Sets the include variables.
     *
     * @param includeVariables
     *            the includeVariables to set
     */
    public void setIncludeVariables(Boolean includeVariables)
    {
        this.includeVariables = includeVariables;
    }

    /**
     * Gets the include timers.
     *
     * @return the includeTimers
     */
    public Boolean getIncludeTimers()
    {
        return includeTimers;
    }

    /**
     * Sets the include timers.
     *
     * @param includeTimers
     *            the includeTimers to set
     */
    public void setIncludeTimers(Boolean includeTimers)
    {
        this.includeTimers = includeTimers;
    }

    /**
     * Gets the include debug values.
     *
     * @return the includeDebugValues
     */
    public Boolean getIncludeDebugValues()
    {
        return includeDebugValues;
    }

    /**
     * Sets the include debug values.
     *
     * @param includeDebugValues
     *            the includeDebugValues to set
     */
    public void setIncludeDebugValues(Boolean includeDebugValues)
    {
        this.includeDebugValues = includeDebugValues;
    }

    /**
     * Gets the include application values.
     *
     * @return the includeApplicationValues
     */
    public Boolean getIncludeApplicationValues()
    {
        return includeApplicationValues;
    }

    /**
     * Sets the include application values.
     *
     * @param includeApplicationValues
     *            the includeApplicationValues to set
     */
    public void setIncludeApplicationValues(Boolean includeApplicationValues)
    {
        this.includeApplicationValues = includeApplicationValues;
    }

    /**
     * Gets the include workflows.
     *
     * @return the includeWorkflows
     */
    public Boolean getIncludeWorkflows()
    {
        return includeWorkflows;
    }

    /**
     * Sets the include workflows.
     *
     * @param includeWorkflows
     *            the includeWorkflows to set
     */
    public void setIncludeWorkflows(Boolean includeWorkflows)
    {
        this.includeWorkflows = includeWorkflows;
    }

    /**
     * Gets the include xml schemas.
     *
     * @return the includeXmlSchemas
     */
    public Boolean getIncludeXmlSchemas()
    {
        return includeXmlSchemas;
    }

    /**
     * Sets the include xml schemas.
     *
     * @param includeXmlSchemas
     *            the includeXmlSchemas to set
     */
    public void setIncludeXmlSchemas(Boolean includeXmlSchemas)
    {
        this.includeXmlSchemas = includeXmlSchemas;
    }

    /**
     * Gets the include resource UR ls.
     *
     * @return the includeResourceURLs
     */
    public Boolean getIncludeResourceURLs()
    {
        return includeResourceURLs;
    }

    /**
     * Sets the include resource UR ls.
     *
     * @param includeResourceURLs
     *            the includeResourceURLs to set
     */
    public void setIncludeResourceURLs(Boolean includeResourceURLs)
    {
        this.includeResourceURLs = includeResourceURLs;
    }

    /**
     * Gets the include ECL.
     *
     * @return the includeECL
     */
    public Boolean getIncludeECL()
    {
        return includeECL;
    }

    /**
     * Sets the include ECL.
     *
     * @param includeECL
     *            the includeECL to set
     */
    public void setIncludeECL(Boolean includeECL)
    {
        this.includeECL = includeECL;
    }

    /**
     * Gets the include helpers.
     *
     * @return the includeHelpers
     */
    public Boolean getIncludeHelpers()
    {
        return includeHelpers;
    }

    /**
     * Sets the include helpers.
     *
     * @param includeHelpers
     *            the includeHelpers to set
     */
    public void setIncludeHelpers(Boolean includeHelpers)
    {
        this.includeHelpers = includeHelpers;
    }

    /**
     * Gets the include allowed clusters.
     *
     * @return the includeAllowedClusters
     */
    public Boolean getIncludeAllowedClusters()
    {
        return includeAllowedClusters;
    }

    /**
     * Sets the include allowed clusters.
     *
     * @param includeAllowedClusters
     *            the includeAllowedClusters to set
     */
    public void setIncludeAllowedClusters(Boolean includeAllowedClusters)
    {
        this.includeAllowedClusters = includeAllowedClusters;
    }

    /**
     * Gets the include total cluster time.
     *
     * @return the includeTotalClusterTime
     */
    public Boolean getIncludeTotalClusterTime()
    {
        return includeTotalClusterTime;
    }

    /**
     * Sets the include total cluster time.
     *
     * @param includeTotalClusterTime
     *            the includeTotalClusterTime to set
     */
    public void setIncludeTotalClusterTime(Boolean includeTotalClusterTime)
    {
        this.includeTotalClusterTime = includeTotalClusterTime;
    }

    /**
     * Gets the suppress result schemas.
     *
     * @return the suppressResultSchemas
     */
    public Boolean getSuppressResultSchemas()
    {
        return suppressResultSchemas;
    }

    /**
     * Sets the suppress result schemas.
     *
     * @param suppressResultSchemas
     *            the suppressResultSchemas to set
     */
    public void setSuppressResultSchemas(Boolean suppressResultSchemas)
    {
        this.suppressResultSchemas = suppressResultSchemas;
    }

    /**
     * Gets the thor slave IP.
     *
     * @return the thorSlaveIP
     */
    public String getThorSlaveIP()
    {
        return thorSlaveIP;
    }

    /**
     * Sets the thor slave IP.
     *
     * @param thorSlaveIP
     *            the thorSlaveIP to set
     */
    public void setThorSlaveIP(String thorSlaveIP)
    {
        this.thorSlaveIP = thorSlaveIP;
    }

    /**
     * @return the unarchive
     */
    public boolean attemptUnarchive()
    {
        return unarchive;
    }

    /**
     * @param unarchive the unarchive to set
     */
    public void setAttemptUnarchive(boolean unarchive)
    {
        this.unarchive = unarchive;
    }
}
