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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: PortWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscloud
 */
public class PortWrapper
{
    protected int local_containerPort;
    protected String local_name;
    protected String local_protocol;

    public PortWrapper() {}

    public PortWrapper( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port port)
    {
        copy( port );
    }
    public PortWrapper( int _containerPort, String _name, String _protocol )
    {
        this.local_containerPort = _containerPort;
        this.local_name = _name;
        this.local_protocol = _protocol;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port raw )
    {
        if (raw == null)
            return;

        this.local_containerPort = raw.getContainerPort();
        this.local_name = raw.getName();
        this.local_protocol = raw.getProtocol();

    }

    @Override
    public String toString()
    {
        return "PortWrapper [" + "containerPort = " + local_containerPort + ", " + "name = " + local_name + ", " + "protocol = " + local_protocol + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port raw = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.Port();
        raw.setContainerPort( local_containerPort);
        raw.setName( local_name);
        raw.setProtocol( local_protocol);
        return raw;
    }


    public void setContainerPort( int _containerPort )
    {
        this.local_containerPort = _containerPort;
    }
    public int getContainerPort( )
    {
        return this.local_containerPort;
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
}