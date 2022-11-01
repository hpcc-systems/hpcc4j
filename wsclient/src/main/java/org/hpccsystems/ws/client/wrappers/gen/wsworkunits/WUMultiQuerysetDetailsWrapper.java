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
 * Class name: WUMultiQuerysetDetailsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerysetDetails
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.561Z
 */
public class WUMultiQuerysetDetailsWrapper
{
    protected String local_clusterName;
    protected String local_querySetName;
    protected String local_filter;
    protected WUQuerySetFilterTypeWrapper local_filterType;
    protected boolean local_checkAllNodes;

    public WUMultiQuerysetDetailsWrapper() {}

    public WUMultiQuerysetDetailsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerysetDetails wumultiquerysetdetails)
    {
        copy( wumultiquerysetdetails );
    }
    public WUMultiQuerysetDetailsWrapper( String _clusterName, String _querySetName, String _filter, WUQuerySetFilterTypeWrapper _filterType, boolean _checkAllNodes )
    {
        this.local_clusterName = _clusterName;
        this.local_querySetName = _querySetName;
        this.local_filter = _filter;
        this.local_filterType = _filterType;
        this.local_checkAllNodes = _checkAllNodes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerysetDetails raw )
    {
        if (raw == null)
            return;

        this.local_clusterName = raw.getClusterName();
        this.local_querySetName = raw.getQuerySetName();
        this.local_filter = raw.getFilter();
        if (raw.getFilterType() != null)
            this.local_filterType = new WUQuerySetFilterTypeWrapper( raw.getFilterType());
        this.local_checkAllNodes = raw.getCheckAllNodes();

    }

    @Override
    public String toString()
    {
        return "WUMultiQuerysetDetailsWrapper [" + "clusterName = " + local_clusterName + ", " + "querySetName = " + local_querySetName + ", " + "filter = " + local_filter + ", " + "filterType = " + local_filterType + ", " + "checkAllNodes = " + local_checkAllNodes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerysetDetails getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerysetDetails raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUMultiQuerysetDetails();
        raw.setClusterName( local_clusterName);
        raw.setQuerySetName( local_querySetName);
        raw.setFilter( local_filter);
        if (local_filterType != null)
            raw.setFilterType( local_filterType.getRaw());
        raw.setCheckAllNodes( local_checkAllNodes);
        return raw;
    }


    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setQuerySetName( String _querySetName )
    {
        this.local_querySetName = _querySetName;
    }
    public String getQuerySetName( )
    {
        return this.local_querySetName;
    }
    public void setFilter( String _filter )
    {
        this.local_filter = _filter;
    }
    public String getFilter( )
    {
        return this.local_filter;
    }
    public void setFilterType( WUQuerySetFilterTypeWrapper _filterType )
    {
        this.local_filterType = _filterType;
    }
    public WUQuerySetFilterTypeWrapper getFilterType( )
    {
        return this.local_filterType;
    }
    public void setCheckAllNodes( boolean _checkAllNodes )
    {
        this.local_checkAllNodes = _checkAllNodes;
    }
    public boolean getCheckAllNodes( )
    {
        return this.local_checkAllNodes;
    }
}