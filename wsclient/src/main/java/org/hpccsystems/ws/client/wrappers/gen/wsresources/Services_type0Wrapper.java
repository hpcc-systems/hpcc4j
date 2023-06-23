package org.hpccsystems.ws.client.wrappers.gen.wsresources;

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
 * Class name: Services_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Services_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class Services_type0Wrapper
{
    protected List<HPCCServiceWrapper> local_service = null;

    public Services_type0Wrapper() {}

    public Services_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Services_type0 services_type0)
    {
        copy( services_type0 );
    }
    public Services_type0Wrapper( List<HPCCServiceWrapper> _service )
    {
        this.local_service = _service;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Services_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getService() != null)
        {
            this.local_service = new ArrayList<HPCCServiceWrapper>();
            for ( int i = 0; i < raw.getService().length; i++)
            {
                this.local_service.add(new HPCCServiceWrapper(raw.getService()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Services_type0Wrapper [" + "service = " + local_service + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Services_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Services_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.Services_type0();
        if (this.local_service!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService[] arr = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService[this.local_service.size()];
            for ( int i = 0; i < this.local_service.size(); i++)
            {
                arr[i] = this.local_service.get(i) .getRaw();
            }
            raw.setService(arr);
        }
        return raw;
    }


    public void setService( List<HPCCServiceWrapper> _service )
    {
        this.local_service = _service;
    }
    public List<HPCCServiceWrapper> getService( )
    {
        return this.local_service;
    }
}