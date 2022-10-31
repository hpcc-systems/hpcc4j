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
 * Class name: WUDetailsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetails
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.523Z
 */
public class WUDetailsWrapper
{
    protected String local_wUID;
    protected WUScopeFilterWrapper local_scopeFilter;
    protected WUNestedFilterWrapper local_nestedFilter;
    protected WUPropertiesToReturnWrapper local_propertiesToReturn;
    protected String local_filter;
    protected WUScopeOptionsWrapper local_scopeOptions;
    protected WUPropertyOptionsWrapper local_propertyOptions;

    public WUDetailsWrapper() {}

    public WUDetailsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetails wudetails)
    {
        copy( wudetails );
    }
    public WUDetailsWrapper( String _wUID, WUScopeFilterWrapper _scopeFilter, WUNestedFilterWrapper _nestedFilter, WUPropertiesToReturnWrapper _propertiesToReturn, String _filter, WUScopeOptionsWrapper _scopeOptions, WUPropertyOptionsWrapper _propertyOptions )
    {
        this.local_wUID = _wUID;
        this.local_scopeFilter = _scopeFilter;
        this.local_nestedFilter = _nestedFilter;
        this.local_propertiesToReturn = _propertiesToReturn;
        this.local_filter = _filter;
        this.local_scopeOptions = _scopeOptions;
        this.local_propertyOptions = _propertyOptions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetails raw )
    {
        if (raw == null)
            return;

        this.local_wUID = raw.getWUID();
        if (raw.getScopeFilter() != null)
            this.local_scopeFilter = new WUScopeFilterWrapper( raw.getScopeFilter());
        if (raw.getNestedFilter() != null)
            this.local_nestedFilter = new WUNestedFilterWrapper( raw.getNestedFilter());
        if (raw.getPropertiesToReturn() != null)
            this.local_propertiesToReturn = new WUPropertiesToReturnWrapper( raw.getPropertiesToReturn());
        this.local_filter = raw.getFilter();
        if (raw.getScopeOptions() != null)
            this.local_scopeOptions = new WUScopeOptionsWrapper( raw.getScopeOptions());
        if (raw.getPropertyOptions() != null)
            this.local_propertyOptions = new WUPropertyOptionsWrapper( raw.getPropertyOptions());

    }

    @Override
    public String toString()
    {
        return "WUDetailsWrapper [" + "wUID = " + local_wUID + ", " + "scopeFilter = " + local_scopeFilter + ", " + "nestedFilter = " + local_nestedFilter + ", " + "propertiesToReturn = " + local_propertiesToReturn + ", " + "filter = " + local_filter + ", " + "scopeOptions = " + local_scopeOptions + ", " + "propertyOptions = " + local_propertyOptions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetails getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetails raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetails();
        raw.setWUID( local_wUID);
        if (local_scopeFilter != null)
            raw.setScopeFilter( local_scopeFilter.getRaw());
        if (local_nestedFilter != null)
            raw.setNestedFilter( local_nestedFilter.getRaw());
        if (local_propertiesToReturn != null)
            raw.setPropertiesToReturn( local_propertiesToReturn.getRaw());
        raw.setFilter( local_filter);
        if (local_scopeOptions != null)
            raw.setScopeOptions( local_scopeOptions.getRaw());
        if (local_propertyOptions != null)
            raw.setPropertyOptions( local_propertyOptions.getRaw());
        return raw;
    }


    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setScopeFilter( WUScopeFilterWrapper _scopeFilter )
    {
        this.local_scopeFilter = _scopeFilter;
    }
    public WUScopeFilterWrapper getScopeFilter( )
    {
        return this.local_scopeFilter;
    }
    public void setNestedFilter( WUNestedFilterWrapper _nestedFilter )
    {
        this.local_nestedFilter = _nestedFilter;
    }
    public WUNestedFilterWrapper getNestedFilter( )
    {
        return this.local_nestedFilter;
    }
    public void setPropertiesToReturn( WUPropertiesToReturnWrapper _propertiesToReturn )
    {
        this.local_propertiesToReturn = _propertiesToReturn;
    }
    public WUPropertiesToReturnWrapper getPropertiesToReturn( )
    {
        return this.local_propertiesToReturn;
    }
    public void setFilter( String _filter )
    {
        this.local_filter = _filter;
    }
    public String getFilter( )
    {
        return this.local_filter;
    }
    public void setScopeOptions( WUScopeOptionsWrapper _scopeOptions )
    {
        this.local_scopeOptions = _scopeOptions;
    }
    public WUScopeOptionsWrapper getScopeOptions( )
    {
        return this.local_scopeOptions;
    }
    public void setPropertyOptions( WUPropertyOptionsWrapper _propertyOptions )
    {
        this.local_propertyOptions = _propertyOptions;
    }
    public WUPropertyOptionsWrapper getPropertyOptions( )
    {
        return this.local_propertyOptions;
    }
}