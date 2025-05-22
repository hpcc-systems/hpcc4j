package org.hpccsystems.ws.client.wrappers.gen.wscloud;

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
 * Class name: Ports_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Ports_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscloud
 */
public class Ports_type0Wrapper
{
    protected List<PortWrapper> local_port = null;

    public Ports_type0Wrapper() {}

    public Ports_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Ports_type0 ports_type0)
    {
        copy( ports_type0 );
    }
    public Ports_type0Wrapper( List<PortWrapper> _port )
    {
        this.local_port = _port;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Ports_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getPort() != null)
        {
            this.local_port = new ArrayList<PortWrapper>();
            for ( int i = 0; i < raw.getPort().length; i++)
            {
                this.local_port.add(new PortWrapper(raw.getPort()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Ports_type0Wrapper [" + "port = " + local_port + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Ports_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Ports_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Ports_type0();
        if (this.local_port!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port[] arr = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port[this.local_port.size()];
            for ( int i = 0; i < this.local_port.size(); i++)
            {
                arr[i] = this.local_port.get(i) .getRaw();
            }
            raw.setPort(arr);
        }
        return raw;
    }


    public void setPort( List<PortWrapper> _port )
    {
        this.local_port = _port;
    }
    public List<PortWrapper> getPort( )
    {
        return this.local_port;
    }
}