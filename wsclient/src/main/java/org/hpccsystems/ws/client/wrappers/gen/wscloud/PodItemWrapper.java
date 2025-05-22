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
 * Class name: PodItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscloud
 */
public class PodItemWrapper
{
    protected String local_name;
    protected String local_status;
    protected String local_creationTimestamp;
    protected String local_containerName;
    protected int local_containerCount;
    protected int local_containerReadyCount;
    protected int local_containerRestartCount;
    protected Ports_type0Wrapper local_ports;

    public PodItemWrapper() {}

    public PodItemWrapper( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem poditem)
    {
        copy( poditem );
    }
    public PodItemWrapper( String _name, String _status, String _creationTimestamp, String _containerName, int _containerCount, int _containerReadyCount, int _containerRestartCount, Ports_type0Wrapper _ports )
    {
        this.local_name = _name;
        this.local_status = _status;
        this.local_creationTimestamp = _creationTimestamp;
        this.local_containerName = _containerName;
        this.local_containerCount = _containerCount;
        this.local_containerReadyCount = _containerReadyCount;
        this.local_containerRestartCount = _containerRestartCount;
        this.local_ports = _ports;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_status = raw.getStatus();
        this.local_creationTimestamp = raw.getCreationTimestamp();
        this.local_containerName = raw.getContainerName();
        this.local_containerCount = raw.getContainerCount();
        this.local_containerReadyCount = raw.getContainerReadyCount();
        this.local_containerRestartCount = raw.getContainerRestartCount();
        if (raw.getPorts() != null)
            this.local_ports = new Ports_type0Wrapper( raw.getPorts());

    }

    @Override
    public String toString()
    {
        return "PodItemWrapper [" + "name = " + local_name + ", " + "status = " + local_status + ", " + "creationTimestamp = " + local_creationTimestamp + ", " + "containerName = " + local_containerName + ", " + "containerCount = " + local_containerCount + ", " + "containerReadyCount = " + local_containerReadyCount + ", " + "containerRestartCount = " + local_containerRestartCount + ", " + "ports = " + local_ports + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem raw = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.PodItem();
        raw.setName( local_name);
        raw.setStatus( local_status);
        raw.setCreationTimestamp( local_creationTimestamp);
        raw.setContainerName( local_containerName);
        raw.setContainerCount( local_containerCount);
        raw.setContainerReadyCount( local_containerReadyCount);
        raw.setContainerRestartCount( local_containerRestartCount);
        if (local_ports != null)
            raw.setPorts( local_ports.getRaw());
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
    public void setStatus( String _status )
    {
        this.local_status = _status;
    }
    public String getStatus( )
    {
        return this.local_status;
    }
    public void setCreationTimestamp( String _creationTimestamp )
    {
        this.local_creationTimestamp = _creationTimestamp;
    }
    public String getCreationTimestamp( )
    {
        return this.local_creationTimestamp;
    }
    public void setContainerName( String _containerName )
    {
        this.local_containerName = _containerName;
    }
    public String getContainerName( )
    {
        return this.local_containerName;
    }
    public void setContainerCount( int _containerCount )
    {
        this.local_containerCount = _containerCount;
    }
    public int getContainerCount( )
    {
        return this.local_containerCount;
    }
    public void setContainerReadyCount( int _containerReadyCount )
    {
        this.local_containerReadyCount = _containerReadyCount;
    }
    public int getContainerReadyCount( )
    {
        return this.local_containerReadyCount;
    }
    public void setContainerRestartCount( int _containerRestartCount )
    {
        this.local_containerRestartCount = _containerRestartCount;
    }
    public int getContainerRestartCount( )
    {
        return this.local_containerRestartCount;
    }
    public void setPorts( Ports_type0Wrapper _ports )
    {
        this.local_ports = _ports;
    }
    public Ports_type0Wrapper getPorts( )
    {
        return this.local_ports;
    }
}