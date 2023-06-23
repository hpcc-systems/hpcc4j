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
 * Class name: Dependencies_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class Dependencies_type0Wrapper
{
    protected List<WUResponseScopeWrapper> local_dependency = null;

    public Dependencies_type0Wrapper() {}

    public Dependencies_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 dependencies_type0)
    {
        copy( dependencies_type0 );
    }
    public Dependencies_type0Wrapper( List<WUResponseScopeWrapper> _dependency )
    {
        this.local_dependency = _dependency;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getDependency() != null)
        {
            this.local_dependency = new ArrayList<WUResponseScopeWrapper>();
            for ( int i = 0; i < raw.getDependency().length; i++)
            {
                this.local_dependency.add(new WUResponseScopeWrapper(raw.getDependency()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Dependencies_type0Wrapper [" + "dependency = " + local_dependency + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0();
        if (this.local_dependency!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope[this.local_dependency.size()];
            for ( int i = 0; i < this.local_dependency.size(); i++)
            {
                arr[i] = this.local_dependency.get(i) .getRaw();
            }
            raw.setDependency(arr);
        }
        return raw;
    }


    public void setDependency( List<WUResponseScopeWrapper> _dependency )
    {
        this.local_dependency = _dependency;
    }
    public List<WUResponseScopeWrapper> getDependency( )
    {
        return this.local_dependency;
    }
}