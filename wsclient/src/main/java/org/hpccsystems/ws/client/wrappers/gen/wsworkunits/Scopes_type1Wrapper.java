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
 * Class name: Scopes_type1Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type1
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.865Z
 */
public class Scopes_type1Wrapper
{
    protected List<WUResponseScopeWrapper> local_scope = null;

    public Scopes_type1Wrapper() {}

    public Scopes_type1Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type1 scopes_type1)
    {
        copy( scopes_type1 );
    }
    public Scopes_type1Wrapper( List<WUResponseScopeWrapper> _scope )
    {
        this.local_scope = _scope;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type1 raw )
    {
        if (raw == null)
            return;

        if (raw.getScope() != null)
        {
            this.local_scope = new ArrayList<WUResponseScopeWrapper>();
            for ( int i = 0; i < raw.getScope().length; i++)
            {
                this.local_scope.add(new WUResponseScopeWrapper(raw.getScope()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Scopes_type1Wrapper [" + "scope = " + local_scope + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type1 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type1 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type1();
        if (this.local_scope!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope[this.local_scope.size()];
            for ( int i = 0; i < this.local_scope.size(); i++)
            {
                arr[i] = this.local_scope.get(i) .getRaw();
            }
            raw.setScope(arr);
        }
        return raw;
    }


    public void setScope( List<WUResponseScopeWrapper> _scope )
    {
        this.local_scope = _scope;
    }
    public List<WUResponseScopeWrapper> getScope( )
    {
        return this.local_scope;
    }
}