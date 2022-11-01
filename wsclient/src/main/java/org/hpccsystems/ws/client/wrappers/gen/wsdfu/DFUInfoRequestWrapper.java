package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUInfoRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.896Z
 */
public class DFUInfoRequestWrapper
{
    protected String local_name;
    protected String local_cluster;
    protected boolean local_updateDescription;
    protected String local_querySet;
    protected String local_query;
    protected String local_fileDesc;
    protected boolean local_includeJsonTypeInfo;
    protected boolean local_includeBinTypeInfo;
    protected DFUChangeProtectionWrapper local_protect;
    protected DFUChangeRestrictionWrapper local_restrict;

    public DFUInfoRequestWrapper() {}

    public DFUInfoRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest dfuinforequest)
    {
        copy( dfuinforequest );
    }
    public DFUInfoRequestWrapper( String _name, String _cluster, boolean _updateDescription, String _querySet, String _query, String _fileDesc, boolean _includeJsonTypeInfo, boolean _includeBinTypeInfo, DFUChangeProtectionWrapper _protect, DFUChangeRestrictionWrapper _restrict )
    {
        this.local_name = _name;
        this.local_cluster = _cluster;
        this.local_updateDescription = _updateDescription;
        this.local_querySet = _querySet;
        this.local_query = _query;
        this.local_fileDesc = _fileDesc;
        this.local_includeJsonTypeInfo = _includeJsonTypeInfo;
        this.local_includeBinTypeInfo = _includeBinTypeInfo;
        this.local_protect = _protect;
        this.local_restrict = _restrict;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_cluster = raw.getCluster();
        this.local_updateDescription = raw.getUpdateDescription();
        this.local_querySet = raw.getQuerySet();
        this.local_query = raw.getQuery();
        this.local_fileDesc = raw.getFileDesc();
        this.local_includeJsonTypeInfo = raw.getIncludeJsonTypeInfo();
        this.local_includeBinTypeInfo = raw.getIncludeBinTypeInfo();
        if (raw.getProtect() != null)
            this.local_protect = new DFUChangeProtectionWrapper( raw.getProtect());
        if (raw.getRestrict() != null)
            this.local_restrict = new DFUChangeRestrictionWrapper( raw.getRestrict());

    }

    @Override
    public String toString()
    {
        return "DFUInfoRequestWrapper [" + "name = " + local_name + ", " + "cluster = " + local_cluster + ", " + "updateDescription = " + local_updateDescription + ", " + "querySet = " + local_querySet + ", " + "query = " + local_query + ", " + "fileDesc = " + local_fileDesc + ", " + "includeJsonTypeInfo = " + local_includeJsonTypeInfo + ", " + "includeBinTypeInfo = " + local_includeBinTypeInfo + ", " + "protect = " + local_protect + ", " + "restrict = " + local_restrict + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUInfoRequest();
        raw.setName( local_name);
        raw.setCluster( local_cluster);
        raw.setUpdateDescription( local_updateDescription);
        raw.setQuerySet( local_querySet);
        raw.setQuery( local_query);
        raw.setFileDesc( local_fileDesc);
        raw.setIncludeJsonTypeInfo( local_includeJsonTypeInfo);
        raw.setIncludeBinTypeInfo( local_includeBinTypeInfo);
        raw.setProtect( local_protect.getRaw());
        raw.setRestrict( local_restrict.getRaw());
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setUpdateDescription( boolean _updateDescription )
    {
        this.local_updateDescription = _updateDescription;
    }
    public boolean getUpdateDescription( )
    {
        return this.local_updateDescription;
    }
    public void setQuerySet( String _querySet )
    {
        this.local_querySet = _querySet;
    }
    public String getQuerySet( )
    {
        return this.local_querySet;
    }
    public void setQuery( String _query )
    {
        this.local_query = _query;
    }
    public String getQuery( )
    {
        return this.local_query;
    }
    public void setFileDesc( String _fileDesc )
    {
        this.local_fileDesc = _fileDesc;
    }
    public String getFileDesc( )
    {
        return this.local_fileDesc;
    }
    public void setIncludeJsonTypeInfo( boolean _includeJsonTypeInfo )
    {
        this.local_includeJsonTypeInfo = _includeJsonTypeInfo;
    }
    public boolean getIncludeJsonTypeInfo( )
    {
        return this.local_includeJsonTypeInfo;
    }
    public void setIncludeBinTypeInfo( boolean _includeBinTypeInfo )
    {
        this.local_includeBinTypeInfo = _includeBinTypeInfo;
    }
    public boolean getIncludeBinTypeInfo( )
    {
        return this.local_includeBinTypeInfo;
    }
    public void setProtect( DFUChangeProtectionWrapper _protect )
    {
        this.local_protect = _protect;
    }
    public DFUChangeProtectionWrapper getProtect( )
    {
        return this.local_protect;
    }
    public void setRestrict( DFUChangeRestrictionWrapper _restrict )
    {
        this.local_restrict = _restrict;
    }
    public DFUChangeRestrictionWrapper getRestrict( )
    {
        return this.local_restrict;
    }
}