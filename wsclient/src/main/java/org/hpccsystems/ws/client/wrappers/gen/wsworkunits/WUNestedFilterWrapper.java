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
 * Class name: WUNestedFilterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUNestedFilter
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.563Z
 */
public class WUNestedFilterWrapper
{
    protected UnsignedInt local_depth;
    protected ScopeTypes_type1Wrapper local_scopeTypes;

    public WUNestedFilterWrapper() {}

    public WUNestedFilterWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUNestedFilter wunestedfilter)
    {
        copy( wunestedfilter );
    }
    public WUNestedFilterWrapper( UnsignedInt _depth, ScopeTypes_type1Wrapper _scopeTypes )
    {
        this.local_depth = _depth;
        this.local_scopeTypes = _scopeTypes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUNestedFilter raw )
    {
        if (raw == null)
            return;

        this.local_depth = raw.getDepth();
        if (raw.getScopeTypes() != null)
            this.local_scopeTypes = new ScopeTypes_type1Wrapper( raw.getScopeTypes());

    }

    @Override
    public String toString()
    {
        return "WUNestedFilterWrapper [" + "depth = " + local_depth + ", " + "scopeTypes = " + local_scopeTypes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUNestedFilter getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUNestedFilter raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUNestedFilter();
        raw.setDepth( local_depth);
        if (local_scopeTypes != null)
            raw.setScopeTypes( local_scopeTypes.getRaw());
        return raw;
    }


    public void setDepth( UnsignedInt _depth )
    {
        this.local_depth = _depth;
    }
    public UnsignedInt getDepth( )
    {
        return this.local_depth;
    }
    public void setScopeTypes( ScopeTypes_type1Wrapper _scopeTypes )
    {
        this.local_scopeTypes = _scopeTypes;
    }
    public ScopeTypes_type1Wrapper getScopeTypes( )
    {
        return this.local_scopeTypes;
    }
}