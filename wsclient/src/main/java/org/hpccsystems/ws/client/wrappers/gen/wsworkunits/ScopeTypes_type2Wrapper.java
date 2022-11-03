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
 * WrapperMaker version: 1.7
 * Class name: ScopeTypes_type2Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type2
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * Service version: 1.92
 */
public class ScopeTypes_type2Wrapper
{
    protected List<String> local_scopeType = null;

    public ScopeTypes_type2Wrapper() {}

    public ScopeTypes_type2Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type2 scopetypes_type2)
    {
        copy( scopetypes_type2 );
    }
    public ScopeTypes_type2Wrapper( List<String> _scopeType )
    {
        this.local_scopeType = _scopeType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type2 raw )
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
        return "ScopeTypes_type2Wrapper [" + "scopeType = " + local_scopeType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type2 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type2 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type2();
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