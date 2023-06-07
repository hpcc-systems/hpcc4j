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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ServicePortsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class ServicePortsWrapper
{
    protected String local_name;
    protected String local_protocol;
    protected UnsignedInt local_port;

    public ServicePortsWrapper() {}

    public ServicePortsWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts serviceports)
    {
        copy( serviceports );
    }
    public ServicePortsWrapper( String _name, String _protocol, UnsignedInt _port )
    {
        this.local_name = _name;
        this.local_protocol = _protocol;
        this.local_port = _port;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_protocol = raw.getProtocol();
        this.local_port = raw.getPort();

    }

    @Override
    public String toString()
    {
        return "ServicePortsWrapper [" + "name = " + local_name + ", " + "protocol = " + local_protocol + ", " + "port = " + local_port + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts();
        raw.setName( local_name);
        raw.setProtocol( local_protocol);
        raw.setPort( local_port);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setProtocol( String _protocol )
    {
        this.local_protocol = _protocol;
    }
    public String getProtocol( )
    {
        return this.local_protocol;
    }
    public void setPort( UnsignedInt _port )
    {
        this.local_port = _port;
    }
    public UnsignedInt getPort( )
    {
        return this.local_port;
    }
}