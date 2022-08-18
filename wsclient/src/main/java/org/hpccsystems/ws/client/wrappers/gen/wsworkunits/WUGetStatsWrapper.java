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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUGetStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.921Z
 */
public class WUGetStatsWrapper
{
    protected String local_wUID;
    protected String local_creatorType;
    protected String local_creator;
    protected String local_scopeType;
    protected String local_scope;
    protected String local_kind;
    protected String local_measure;
    protected UnsignedInt local_minScopeDepth;
    protected UnsignedInt local_maxScopeDepth;
    protected boolean local_includeGraphs;
    protected boolean local_createDescriptions;
    protected long local_minValue;
    protected long local_maxValue;
    protected String local_filter;

    public WUGetStatsWrapper() {}

    public WUGetStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStats wugetstats)
    {
        copy( wugetstats );
    }
    public WUGetStatsWrapper( String _wUID, String _creatorType, String _creator, String _scopeType, String _scope, String _kind, String _measure, UnsignedInt _minScopeDepth, UnsignedInt _maxScopeDepth, boolean _includeGraphs, boolean _createDescriptions, long _minValue, long _maxValue, String _filter )
    {
        this.local_wUID = _wUID;
        this.local_creatorType = _creatorType;
        this.local_creator = _creator;
        this.local_scopeType = _scopeType;
        this.local_scope = _scope;
        this.local_kind = _kind;
        this.local_measure = _measure;
        this.local_minScopeDepth = _minScopeDepth;
        this.local_maxScopeDepth = _maxScopeDepth;
        this.local_includeGraphs = _includeGraphs;
        this.local_createDescriptions = _createDescriptions;
        this.local_minValue = _minValue;
        this.local_maxValue = _maxValue;
        this.local_filter = _filter;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStats raw )
    {
        if (raw == null)
            return;

        this.local_wUID = raw.getWUID();
        this.local_creatorType = raw.getCreatorType();
        this.local_creator = raw.getCreator();
        this.local_scopeType = raw.getScopeType();
        this.local_scope = raw.getScope();
        this.local_kind = raw.getKind();
        this.local_measure = raw.getMeasure();
        this.local_minScopeDepth = raw.getMinScopeDepth();
        this.local_maxScopeDepth = raw.getMaxScopeDepth();
        this.local_includeGraphs = raw.getIncludeGraphs();
        this.local_createDescriptions = raw.getCreateDescriptions();
        this.local_minValue = raw.getMinValue();
        this.local_maxValue = raw.getMaxValue();
        this.local_filter = raw.getFilter();

    }

    @Override
    public String toString()
    {
        return "WUGetStatsWrapper [" + "wUID = " + local_wUID + ", " + "creatorType = " + local_creatorType + ", " + "creator = " + local_creator + ", " + "scopeType = " + local_scopeType + ", " + "scope = " + local_scope + ", " + "kind = " + local_kind + ", " + "measure = " + local_measure + ", " + "minScopeDepth = " + local_minScopeDepth + ", " + "maxScopeDepth = " + local_maxScopeDepth + ", " + "includeGraphs = " + local_includeGraphs + ", " + "createDescriptions = " + local_createDescriptions + ", " + "minValue = " + local_minValue + ", " + "maxValue = " + local_maxValue + ", " + "filter = " + local_filter + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetStats();
        raw.setWUID( local_wUID);
        raw.setCreatorType( local_creatorType);
        raw.setCreator( local_creator);
        raw.setScopeType( local_scopeType);
        raw.setScope( local_scope);
        raw.setKind( local_kind);
        raw.setMeasure( local_measure);
        raw.setMinScopeDepth( local_minScopeDepth);
        raw.setMaxScopeDepth( local_maxScopeDepth);
        raw.setIncludeGraphs( local_includeGraphs);
        raw.setCreateDescriptions( local_createDescriptions);
        raw.setMinValue( local_minValue);
        raw.setMaxValue( local_maxValue);
        raw.setFilter( local_filter);
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
    public void setCreatorType( String _creatorType )
    {
        this.local_creatorType = _creatorType;
    }
    public String getCreatorType( )
    {
        return this.local_creatorType;
    }
    public void setCreator( String _creator )
    {
        this.local_creator = _creator;
    }
    public String getCreator( )
    {
        return this.local_creator;
    }
    public void setScopeType( String _scopeType )
    {
        this.local_scopeType = _scopeType;
    }
    public String getScopeType( )
    {
        return this.local_scopeType;
    }
    public void setScope( String _scope )
    {
        this.local_scope = _scope;
    }
    public String getScope( )
    {
        return this.local_scope;
    }
    public void setKind( String _kind )
    {
        this.local_kind = _kind;
    }
    public String getKind( )
    {
        return this.local_kind;
    }
    public void setMeasure( String _measure )
    {
        this.local_measure = _measure;
    }
    public String getMeasure( )
    {
        return this.local_measure;
    }
    public void setMinScopeDepth( UnsignedInt _minScopeDepth )
    {
        this.local_minScopeDepth = _minScopeDepth;
    }
    public UnsignedInt getMinScopeDepth( )
    {
        return this.local_minScopeDepth;
    }
    public void setMaxScopeDepth( UnsignedInt _maxScopeDepth )
    {
        this.local_maxScopeDepth = _maxScopeDepth;
    }
    public UnsignedInt getMaxScopeDepth( )
    {
        return this.local_maxScopeDepth;
    }
    public void setIncludeGraphs( boolean _includeGraphs )
    {
        this.local_includeGraphs = _includeGraphs;
    }
    public boolean getIncludeGraphs( )
    {
        return this.local_includeGraphs;
    }
    public void setCreateDescriptions( boolean _createDescriptions )
    {
        this.local_createDescriptions = _createDescriptions;
    }
    public boolean getCreateDescriptions( )
    {
        return this.local_createDescriptions;
    }
    public void setMinValue( long _minValue )
    {
        this.local_minValue = _minValue;
    }
    public long getMinValue( )
    {
        return this.local_minValue;
    }
    public void setMaxValue( long _maxValue )
    {
        this.local_maxValue = _maxValue;
    }
    public long getMaxValue( )
    {
        return this.local_maxValue;
    }
    public void setFilter( String _filter )
    {
        this.local_filter = _filter;
    }
    public String getFilter( )
    {
        return this.local_filter;
    }
}