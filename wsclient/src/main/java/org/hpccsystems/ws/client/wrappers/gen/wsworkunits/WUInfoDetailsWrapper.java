package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;

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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUInfoDetailsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoDetails
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUInfoDetailsWrapper
{
    protected String local_wuid;
    protected boolean local_truncateEclTo64K;
    protected String local_type;
    protected boolean local_includeExceptions;
    protected boolean local_includeGraphs;
    protected boolean local_includeSourceFiles;
    protected boolean local_includeResults;
    protected boolean local_includeResultsViewNames;
    protected boolean local_includeVariables;
    protected boolean local_includeTimers;
    protected boolean local_includeDebugValues;
    protected boolean local_includeApplicationValues;
    protected boolean local_includeWorkflows;
    protected boolean local_includeXmlSchemas;
    protected boolean local_includeResourceURLs;
    protected boolean local_includeECL;
    protected boolean local_includeHelpers;
    protected boolean local_includeAllowedClusters;
    protected boolean local_includeTotalClusterTime;
    protected boolean local_includeServiceNames;
    protected boolean local_includeProcesses;
    protected boolean local_suppressResultSchemas;
    protected String local_thorSlaveIP;

    public WUInfoDetailsWrapper() {}

    public WUInfoDetailsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoDetails wuinfodetails)
    {
        copy( wuinfodetails );
    }
    public WUInfoDetailsWrapper( String _wuid, boolean _truncateEclTo64K, String _type, boolean _includeExceptions, boolean _includeGraphs, boolean _includeSourceFiles, boolean _includeResults, boolean _includeResultsViewNames, boolean _includeVariables, boolean _includeTimers, boolean _includeDebugValues, boolean _includeApplicationValues, boolean _includeWorkflows, boolean _includeXmlSchemas, boolean _includeResourceURLs, boolean _includeECL, boolean _includeHelpers, boolean _includeAllowedClusters, boolean _includeTotalClusterTime, boolean _includeServiceNames, boolean _includeProcesses, boolean _suppressResultSchemas, String _thorSlaveIP )
    {
        this.local_wuid = _wuid;
        this.local_truncateEclTo64K = _truncateEclTo64K;
        this.local_type = _type;
        this.local_includeExceptions = _includeExceptions;
        this.local_includeGraphs = _includeGraphs;
        this.local_includeSourceFiles = _includeSourceFiles;
        this.local_includeResults = _includeResults;
        this.local_includeResultsViewNames = _includeResultsViewNames;
        this.local_includeVariables = _includeVariables;
        this.local_includeTimers = _includeTimers;
        this.local_includeDebugValues = _includeDebugValues;
        this.local_includeApplicationValues = _includeApplicationValues;
        this.local_includeWorkflows = _includeWorkflows;
        this.local_includeXmlSchemas = _includeXmlSchemas;
        this.local_includeResourceURLs = _includeResourceURLs;
        this.local_includeECL = _includeECL;
        this.local_includeHelpers = _includeHelpers;
        this.local_includeAllowedClusters = _includeAllowedClusters;
        this.local_includeTotalClusterTime = _includeTotalClusterTime;
        this.local_includeServiceNames = _includeServiceNames;
        this.local_includeProcesses = _includeProcesses;
        this.local_suppressResultSchemas = _suppressResultSchemas;
        this.local_thorSlaveIP = _thorSlaveIP;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoDetails raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_truncateEclTo64K = raw.getTruncateEclTo64K();
        this.local_type = raw.getType();
        this.local_includeExceptions = raw.getIncludeExceptions();
        this.local_includeGraphs = raw.getIncludeGraphs();
        this.local_includeSourceFiles = raw.getIncludeSourceFiles();
        this.local_includeResults = raw.getIncludeResults();
        this.local_includeResultsViewNames = raw.getIncludeResultsViewNames();
        this.local_includeVariables = raw.getIncludeVariables();
        this.local_includeTimers = raw.getIncludeTimers();
        this.local_includeDebugValues = raw.getIncludeDebugValues();
        this.local_includeApplicationValues = raw.getIncludeApplicationValues();
        this.local_includeWorkflows = raw.getIncludeWorkflows();
        this.local_includeXmlSchemas = raw.getIncludeXmlSchemas();
        this.local_includeResourceURLs = raw.getIncludeResourceURLs();
        this.local_includeECL = raw.getIncludeECL();
        this.local_includeHelpers = raw.getIncludeHelpers();
        this.local_includeAllowedClusters = raw.getIncludeAllowedClusters();
        this.local_includeTotalClusterTime = raw.getIncludeTotalClusterTime();
        this.local_includeServiceNames = raw.getIncludeServiceNames();
        this.local_includeProcesses = raw.getIncludeProcesses();
        this.local_suppressResultSchemas = raw.getSuppressResultSchemas();
        this.local_thorSlaveIP = raw.getThorSlaveIP();

    }

    @Override
    public String toString()
    {
        return "WUInfoDetailsWrapper [" + "wuid = " + local_wuid + ", " + "truncateEclTo64K = " + local_truncateEclTo64K + ", " + "type = " + local_type + ", " + "includeExceptions = " + local_includeExceptions + ", " + "includeGraphs = " + local_includeGraphs + ", " + "includeSourceFiles = " + local_includeSourceFiles + ", " + "includeResults = " + local_includeResults + ", " + "includeResultsViewNames = " + local_includeResultsViewNames + ", " + "includeVariables = " + local_includeVariables + ", " + "includeTimers = " + local_includeTimers + ", " + "includeDebugValues = " + local_includeDebugValues + ", " + "includeApplicationValues = " + local_includeApplicationValues + ", " + "includeWorkflows = " + local_includeWorkflows + ", " + "includeXmlSchemas = " + local_includeXmlSchemas + ", " + "includeResourceURLs = " + local_includeResourceURLs + ", " + "includeECL = " + local_includeECL + ", " + "includeHelpers = " + local_includeHelpers + ", " + "includeAllowedClusters = " + local_includeAllowedClusters + ", " + "includeTotalClusterTime = " + local_includeTotalClusterTime + ", " + "includeServiceNames = " + local_includeServiceNames + ", " + "includeProcesses = " + local_includeProcesses + ", " + "suppressResultSchemas = " + local_suppressResultSchemas + ", " + "thorSlaveIP = " + local_thorSlaveIP + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoDetails getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoDetails raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoDetails();
        raw.setWuid( local_wuid);
        raw.setTruncateEclTo64K( local_truncateEclTo64K);
        raw.setType( local_type);
        raw.setIncludeExceptions( local_includeExceptions);
        raw.setIncludeGraphs( local_includeGraphs);
        raw.setIncludeSourceFiles( local_includeSourceFiles);
        raw.setIncludeResults( local_includeResults);
        raw.setIncludeResultsViewNames( local_includeResultsViewNames);
        raw.setIncludeVariables( local_includeVariables);
        raw.setIncludeTimers( local_includeTimers);
        raw.setIncludeDebugValues( local_includeDebugValues);
        raw.setIncludeApplicationValues( local_includeApplicationValues);
        raw.setIncludeWorkflows( local_includeWorkflows);
        raw.setIncludeXmlSchemas( local_includeXmlSchemas);
        raw.setIncludeResourceURLs( local_includeResourceURLs);
        raw.setIncludeECL( local_includeECL);
        raw.setIncludeHelpers( local_includeHelpers);
        raw.setIncludeAllowedClusters( local_includeAllowedClusters);
        raw.setIncludeTotalClusterTime( local_includeTotalClusterTime);
        raw.setIncludeServiceNames( local_includeServiceNames);
        raw.setIncludeProcesses( local_includeProcesses);
        raw.setSuppressResultSchemas( local_suppressResultSchemas);
        raw.setThorSlaveIP( local_thorSlaveIP);
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
    public void setTruncateEclTo64K( boolean _truncateEclTo64K )
    {
        this.local_truncateEclTo64K = _truncateEclTo64K;
    }
    public boolean getTruncateEclTo64K( )
    {
        return this.local_truncateEclTo64K;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setIncludeExceptions( boolean _includeExceptions )
    {
        this.local_includeExceptions = _includeExceptions;
    }
    public boolean getIncludeExceptions( )
    {
        return this.local_includeExceptions;
    }
    public void setIncludeGraphs( boolean _includeGraphs )
    {
        this.local_includeGraphs = _includeGraphs;
    }
    public boolean getIncludeGraphs( )
    {
        return this.local_includeGraphs;
    }
    public void setIncludeSourceFiles( boolean _includeSourceFiles )
    {
        this.local_includeSourceFiles = _includeSourceFiles;
    }
    public boolean getIncludeSourceFiles( )
    {
        return this.local_includeSourceFiles;
    }
    public void setIncludeResults( boolean _includeResults )
    {
        this.local_includeResults = _includeResults;
    }
    public boolean getIncludeResults( )
    {
        return this.local_includeResults;
    }
    public void setIncludeResultsViewNames( boolean _includeResultsViewNames )
    {
        this.local_includeResultsViewNames = _includeResultsViewNames;
    }
    public boolean getIncludeResultsViewNames( )
    {
        return this.local_includeResultsViewNames;
    }
    public void setIncludeVariables( boolean _includeVariables )
    {
        this.local_includeVariables = _includeVariables;
    }
    public boolean getIncludeVariables( )
    {
        return this.local_includeVariables;
    }
    public void setIncludeTimers( boolean _includeTimers )
    {
        this.local_includeTimers = _includeTimers;
    }
    public boolean getIncludeTimers( )
    {
        return this.local_includeTimers;
    }
    public void setIncludeDebugValues( boolean _includeDebugValues )
    {
        this.local_includeDebugValues = _includeDebugValues;
    }
    public boolean getIncludeDebugValues( )
    {
        return this.local_includeDebugValues;
    }
    public void setIncludeApplicationValues( boolean _includeApplicationValues )
    {
        this.local_includeApplicationValues = _includeApplicationValues;
    }
    public boolean getIncludeApplicationValues( )
    {
        return this.local_includeApplicationValues;
    }
    public void setIncludeWorkflows( boolean _includeWorkflows )
    {
        this.local_includeWorkflows = _includeWorkflows;
    }
    public boolean getIncludeWorkflows( )
    {
        return this.local_includeWorkflows;
    }
    public void setIncludeXmlSchemas( boolean _includeXmlSchemas )
    {
        this.local_includeXmlSchemas = _includeXmlSchemas;
    }
    public boolean getIncludeXmlSchemas( )
    {
        return this.local_includeXmlSchemas;
    }
    public void setIncludeResourceURLs( boolean _includeResourceURLs )
    {
        this.local_includeResourceURLs = _includeResourceURLs;
    }
    public boolean getIncludeResourceURLs( )
    {
        return this.local_includeResourceURLs;
    }
    public void setIncludeECL( boolean _includeECL )
    {
        this.local_includeECL = _includeECL;
    }
    public boolean getIncludeECL( )
    {
        return this.local_includeECL;
    }
    public void setIncludeHelpers( boolean _includeHelpers )
    {
        this.local_includeHelpers = _includeHelpers;
    }
    public boolean getIncludeHelpers( )
    {
        return this.local_includeHelpers;
    }
    public void setIncludeAllowedClusters( boolean _includeAllowedClusters )
    {
        this.local_includeAllowedClusters = _includeAllowedClusters;
    }
    public boolean getIncludeAllowedClusters( )
    {
        return this.local_includeAllowedClusters;
    }
    public void setIncludeTotalClusterTime( boolean _includeTotalClusterTime )
    {
        this.local_includeTotalClusterTime = _includeTotalClusterTime;
    }
    public boolean getIncludeTotalClusterTime( )
    {
        return this.local_includeTotalClusterTime;
    }
    public void setIncludeServiceNames( boolean _includeServiceNames )
    {
        this.local_includeServiceNames = _includeServiceNames;
    }
    public boolean getIncludeServiceNames( )
    {
        return this.local_includeServiceNames;
    }
    public void setIncludeProcesses( boolean _includeProcesses )
    {
        this.local_includeProcesses = _includeProcesses;
    }
    public boolean getIncludeProcesses( )
    {
        return this.local_includeProcesses;
    }
    public void setSuppressResultSchemas( boolean _suppressResultSchemas )
    {
        this.local_suppressResultSchemas = _suppressResultSchemas;
    }
    public boolean getSuppressResultSchemas( )
    {
        return this.local_suppressResultSchemas;
    }
    public void setThorSlaveIP( String _thorSlaveIP )
    {
        this.local_thorSlaveIP = _thorSlaveIP;
    }
    public String getThorSlaveIP( )
    {
        return this.local_thorSlaveIP;
    }
}