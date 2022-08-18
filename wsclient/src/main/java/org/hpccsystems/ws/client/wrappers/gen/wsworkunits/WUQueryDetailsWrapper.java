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
 * Class name: WUQueryDetailsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetails
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.963Z
 */
public class WUQueryDetailsWrapper
{
    protected String local_queryId;
    protected String local_querySet;
    protected boolean local_includeStateOnClusters;
    protected boolean local_includeSuperFiles;
    protected boolean local_includeWsEclAddresses;
    protected boolean local_checkAllNodes;
    protected boolean local_includeWUDetails;
    protected boolean local_includeWUQueryFiles;

    public WUQueryDetailsWrapper() {}

    public WUQueryDetailsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetails wuquerydetails)
    {
        copy( wuquerydetails );
    }
    public WUQueryDetailsWrapper( String _queryId, String _querySet, boolean _includeStateOnClusters, boolean _includeSuperFiles, boolean _includeWsEclAddresses, boolean _checkAllNodes, boolean _includeWUDetails, boolean _includeWUQueryFiles )
    {
        this.local_queryId = _queryId;
        this.local_querySet = _querySet;
        this.local_includeStateOnClusters = _includeStateOnClusters;
        this.local_includeSuperFiles = _includeSuperFiles;
        this.local_includeWsEclAddresses = _includeWsEclAddresses;
        this.local_checkAllNodes = _checkAllNodes;
        this.local_includeWUDetails = _includeWUDetails;
        this.local_includeWUQueryFiles = _includeWUQueryFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetails raw )
    {
        if (raw == null)
            return;

        this.local_queryId = raw.getQueryId();
        this.local_querySet = raw.getQuerySet();
        this.local_includeStateOnClusters = raw.getIncludeStateOnClusters();
        this.local_includeSuperFiles = raw.getIncludeSuperFiles();
        this.local_includeWsEclAddresses = raw.getIncludeWsEclAddresses();
        this.local_checkAllNodes = raw.getCheckAllNodes();
        this.local_includeWUDetails = raw.getIncludeWUDetails();
        this.local_includeWUQueryFiles = raw.getIncludeWUQueryFiles();

    }

    @Override
    public String toString()
    {
        return "WUQueryDetailsWrapper [" + "queryId = " + local_queryId + ", " + "querySet = " + local_querySet + ", " + "includeStateOnClusters = " + local_includeStateOnClusters + ", " + "includeSuperFiles = " + local_includeSuperFiles + ", " + "includeWsEclAddresses = " + local_includeWsEclAddresses + ", " + "checkAllNodes = " + local_checkAllNodes + ", " + "includeWUDetails = " + local_includeWUDetails + ", " + "includeWUQueryFiles = " + local_includeWUQueryFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetails getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetails raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetails();
        raw.setQueryId( local_queryId);
        raw.setQuerySet( local_querySet);
        raw.setIncludeStateOnClusters( local_includeStateOnClusters);
        raw.setIncludeSuperFiles( local_includeSuperFiles);
        raw.setIncludeWsEclAddresses( local_includeWsEclAddresses);
        raw.setCheckAllNodes( local_checkAllNodes);
        raw.setIncludeWUDetails( local_includeWUDetails);
        raw.setIncludeWUQueryFiles( local_includeWUQueryFiles);
        return raw;
    }


    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setQuerySet( String _querySet )
    {
        this.local_querySet = _querySet;
    }
    public String getQuerySet( )
    {
        return this.local_querySet;
    }
    public void setIncludeStateOnClusters( boolean _includeStateOnClusters )
    {
        this.local_includeStateOnClusters = _includeStateOnClusters;
    }
    public boolean getIncludeStateOnClusters( )
    {
        return this.local_includeStateOnClusters;
    }
    public void setIncludeSuperFiles( boolean _includeSuperFiles )
    {
        this.local_includeSuperFiles = _includeSuperFiles;
    }
    public boolean getIncludeSuperFiles( )
    {
        return this.local_includeSuperFiles;
    }
    public void setIncludeWsEclAddresses( boolean _includeWsEclAddresses )
    {
        this.local_includeWsEclAddresses = _includeWsEclAddresses;
    }
    public boolean getIncludeWsEclAddresses( )
    {
        return this.local_includeWsEclAddresses;
    }
    public void setCheckAllNodes( boolean _checkAllNodes )
    {
        this.local_checkAllNodes = _checkAllNodes;
    }
    public boolean getCheckAllNodes( )
    {
        return this.local_checkAllNodes;
    }
    public void setIncludeWUDetails( boolean _includeWUDetails )
    {
        this.local_includeWUDetails = _includeWUDetails;
    }
    public boolean getIncludeWUDetails( )
    {
        return this.local_includeWUDetails;
    }
    public void setIncludeWUQueryFiles( boolean _includeWUQueryFiles )
    {
        this.local_includeWUQueryFiles = _includeWUQueryFiles;
    }
    public boolean getIncludeWUQueryFiles( )
    {
        return this.local_includeWUQueryFiles;
    }
}