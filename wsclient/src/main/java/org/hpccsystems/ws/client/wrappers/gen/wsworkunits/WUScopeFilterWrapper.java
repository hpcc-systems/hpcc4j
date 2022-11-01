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
import java.math.BigInteger;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUScopeFilterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeFilter
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.606Z
 */
public class WUScopeFilterWrapper
{
    protected BigInteger local_maxDepth;
    protected Scopes_type0Wrapper local_scopes;
    protected Ids_type0Wrapper local_ids;
    protected ScopeTypes_type0Wrapper local_scopeTypes;
    protected PropertyFilters_type0Wrapper local_propertyFilters;

    public WUScopeFilterWrapper() {}

    public WUScopeFilterWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeFilter wuscopefilter)
    {
        copy( wuscopefilter );
    }
    public WUScopeFilterWrapper( BigInteger _maxDepth, Scopes_type0Wrapper _scopes, Ids_type0Wrapper _ids, ScopeTypes_type0Wrapper _scopeTypes, PropertyFilters_type0Wrapper _propertyFilters )
    {
        this.local_maxDepth = _maxDepth;
        this.local_scopes = _scopes;
        this.local_ids = _ids;
        this.local_scopeTypes = _scopeTypes;
        this.local_propertyFilters = _propertyFilters;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeFilter raw )
    {
        if (raw == null)
            return;

        this.local_maxDepth = raw.getMaxDepth();
        if (raw.getScopes() != null)
            this.local_scopes = new Scopes_type0Wrapper( raw.getScopes());
        if (raw.getIds() != null)
            this.local_ids = new Ids_type0Wrapper( raw.getIds());
        if (raw.getScopeTypes() != null)
            this.local_scopeTypes = new ScopeTypes_type0Wrapper( raw.getScopeTypes());
        if (raw.getPropertyFilters() != null)
            this.local_propertyFilters = new PropertyFilters_type0Wrapper( raw.getPropertyFilters());

    }

    @Override
    public String toString()
    {
        return "WUScopeFilterWrapper [" + "maxDepth = " + local_maxDepth + ", " + "scopes = " + local_scopes + ", " + "ids = " + local_ids + ", " + "scopeTypes = " + local_scopeTypes + ", " + "propertyFilters = " + local_propertyFilters + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeFilter getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeFilter raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeFilter();
        raw.setMaxDepth( local_maxDepth);
        if (local_scopes != null)
            raw.setScopes( local_scopes.getRaw());
        if (local_ids != null)
            raw.setIds( local_ids.getRaw());
        if (local_scopeTypes != null)
            raw.setScopeTypes( local_scopeTypes.getRaw());
        if (local_propertyFilters != null)
            raw.setPropertyFilters( local_propertyFilters.getRaw());
        return raw;
    }


    public void setMaxDepth( BigInteger _maxDepth )
    {
        this.local_maxDepth = _maxDepth;
    }
    public BigInteger getMaxDepth( )
    {
        return this.local_maxDepth;
    }
    public void setScopes( Scopes_type0Wrapper _scopes )
    {
        this.local_scopes = _scopes;
    }
    public Scopes_type0Wrapper getScopes( )
    {
        return this.local_scopes;
    }
    public void setIds( Ids_type0Wrapper _ids )
    {
        this.local_ids = _ids;
    }
    public Ids_type0Wrapper getIds( )
    {
        return this.local_ids;
    }
    public void setScopeTypes( ScopeTypes_type0Wrapper _scopeTypes )
    {
        this.local_scopeTypes = _scopeTypes;
    }
    public ScopeTypes_type0Wrapper getScopeTypes( )
    {
        return this.local_scopeTypes;
    }
    public void setPropertyFilters( PropertyFilters_type0Wrapper _propertyFilters )
    {
        this.local_propertyFilters = _propertyFilters;
    }
    public PropertyFilters_type0Wrapper getPropertyFilters( )
    {
        return this.local_propertyFilters;
    }
}