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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ScopeTypes_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class ScopeTypes_type0Wrapper
{
    protected List<String> local_scopeType = null;

    public ScopeTypes_type0Wrapper() {}

    public ScopeTypes_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0 scopetypes_type0)
    {
        copy( scopetypes_type0 );
    }
    public ScopeTypes_type0Wrapper( List<String> _scopeType )
    {
        this.local_scopeType = _scopeType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getScopeType() != null)
        {
            this.local_scopeType = new ArrayList<String>();
            for ( int i = 0; i < raw.getScopeType().length; i++)
            {
                this.local_scopeType.add(new String(raw.getScopeType()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ScopeTypes_type0Wrapper [" + "scopeType = " + local_scopeType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0();
        if (this.local_scopeType!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_scopeType.size()];
            for ( int i = 0; i < this.local_scopeType.size(); i++)
            {
                arr[i] = this.local_scopeType.get(i) ;
            }
            raw.setScopeType(arr);
        }
        return raw;
    }


    public void setScopeType( List<String> _scopeType )
    {
        this.local_scopeType = _scopeType;
    }
    public List<String> getScopeType( )
    {
        return this.local_scopeType;
    }
}