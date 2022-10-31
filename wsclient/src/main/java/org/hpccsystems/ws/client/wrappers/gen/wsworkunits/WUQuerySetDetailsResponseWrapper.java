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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUQuerySetDetailsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetailsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.589Z
 */
public class WUQuerySetDetailsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_querySetName;
    protected ArrayOfQuerySetQueryWrapper local_querysetQueries;
    protected ArrayOfQuerySetAliasWrapper local_querysetAliases;
    protected String local_clusterName;
    protected String local_filter;
    protected WUQuerySetFilterTypeWrapper local_filterType;
    protected List<String> local_clusterNames = null;

    public WUQuerySetDetailsResponseWrapper() {}

    public WUQuerySetDetailsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetailsResponse wuquerysetdetailsresponse)
    {
        copy( wuquerysetdetailsresponse );
    }
    public WUQuerySetDetailsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _querySetName, ArrayOfQuerySetQueryWrapper _querysetQueries, ArrayOfQuerySetAliasWrapper _querysetAliases, String _clusterName, String _filter, WUQuerySetFilterTypeWrapper _filterType, List<String> _clusterNames )
    {
        this.local_exceptions = _exceptions;
        this.local_querySetName = _querySetName;
        this.local_querysetQueries = _querysetQueries;
        this.local_querysetAliases = _querysetAliases;
        this.local_clusterName = _clusterName;
        this.local_filter = _filter;
        this.local_filterType = _filterType;
        this.local_clusterNames = _clusterNames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetailsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_querySetName = raw.getQuerySetName();
        if (raw.getQuerysetQueries() != null)
            this.local_querysetQueries = new ArrayOfQuerySetQueryWrapper( raw.getQuerysetQueries());
        if (raw.getQuerysetAliases() != null)
            this.local_querysetAliases = new ArrayOfQuerySetAliasWrapper( raw.getQuerysetAliases());
        this.local_clusterName = raw.getClusterName();
        this.local_filter = raw.getFilter();
        if (raw.getFilterType() != null)
            this.local_filterType = new WUQuerySetFilterTypeWrapper( raw.getFilterType());
        if (raw.getClusterNames() != null)
        {
            this.local_clusterNames = new ArrayList<String>();
            for ( int i = 0; i < raw.getClusterNames().getItem().length; i++)
            {
                this.local_clusterNames.add(new String(raw.getClusterNames().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "WUQuerySetDetailsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "querySetName = " + local_querySetName + ", " + "querysetQueries = " + local_querysetQueries + ", " + "querysetAliases = " + local_querysetAliases + ", " + "clusterName = " + local_clusterName + ", " + "filter = " + local_filter + ", " + "filterType = " + local_filterType + ", " + "clusterNames = " + local_clusterNames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetailsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetailsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetailsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setQuerySetName( local_querySetName);
        if (local_querysetQueries != null)
            raw.setQuerysetQueries( local_querysetQueries.getRaw());
        if (local_querysetAliases != null)
            raw.setQuerysetAliases( local_querysetAliases.getRaw());
        raw.setClusterName( local_clusterName);
        raw.setFilter( local_filter);
        if (local_filterType != null)
            raw.setFilterType( local_filterType.getRaw());
        if (this.local_clusterNames!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_clusterNames.size(); i++)
            {
                arr.addItem(this.local_clusterNames.get(i));
            }
            raw.setClusterNames(arr);
        }
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setQuerySetName( String _querySetName )
    {
        this.local_querySetName = _querySetName;
    }
    public String getQuerySetName( )
    {
        return this.local_querySetName;
    }
    public void setQuerysetQueries( ArrayOfQuerySetQueryWrapper _querysetQueries )
    {
        this.local_querysetQueries = _querysetQueries;
    }
    public ArrayOfQuerySetQueryWrapper getQuerysetQueries( )
    {
        return this.local_querysetQueries;
    }
    public void setQuerysetAliases( ArrayOfQuerySetAliasWrapper _querysetAliases )
    {
        this.local_querysetAliases = _querysetAliases;
    }
    public ArrayOfQuerySetAliasWrapper getQuerysetAliases( )
    {
        return this.local_querysetAliases;
    }
    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
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
    public void setClusterNames( List<String> _clusterNames )
    {
        this.local_clusterNames = _clusterNames;
    }
    public List<String> getClusterNames( )
    {
        return this.local_clusterNames;
    }
}