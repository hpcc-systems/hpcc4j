package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: ArrayOfHPCCResourceWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResource
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-10-27T20:17:20.565Z
 */
public class ArrayOfHPCCResourceWrapper
{
    protected List<HPCCResourceWrapper> local_hPCCResource = null;

    public ArrayOfHPCCResourceWrapper() {}

    public ArrayOfHPCCResourceWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResource arrayofhpccresource)
    {
        copy( arrayofhpccresource );
    }
    public ArrayOfHPCCResourceWrapper( List<HPCCResourceWrapper> _hPCCResource )
    {
        this.local_hPCCResource = _hPCCResource;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResource raw )
    {
        if (raw == null)
            return;

        if (raw.getHPCCResource() != null)
        {
            this.local_hPCCResource = new ArrayList<HPCCResourceWrapper>();
            for ( int i = 0; i < raw.getHPCCResource().length; i++)
            {
                this.local_hPCCResource.add(new HPCCResourceWrapper(raw.getHPCCResource()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfHPCCResourceWrapper [" + "hPCCResource = " + local_hPCCResource + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResource getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResource raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfHPCCResource();
        if (this.local_hPCCResource!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource[this.local_hPCCResource.size()];
            for ( int i = 0; i < this.local_hPCCResource.size(); i++)
            {
                arr[i] = this.local_hPCCResource.get(i) .getRaw();
            }
            raw.setHPCCResource(arr);
        }
        return raw;
    }


    public void setHPCCResource( List<HPCCResourceWrapper> _hPCCResource )
    {
        this.local_hPCCResource = _hPCCResource;
    }
    public List<HPCCResourceWrapper> getHPCCResource( )
    {
        return this.local_hPCCResource;
    }
}