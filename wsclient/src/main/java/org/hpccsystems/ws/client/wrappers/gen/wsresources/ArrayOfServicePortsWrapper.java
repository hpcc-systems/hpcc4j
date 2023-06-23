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
 * Class name: ArrayOfServicePortsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfServicePorts
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class ArrayOfServicePortsWrapper
{
    protected List<ServicePortsWrapper> local_servicePorts = null;

    public ArrayOfServicePortsWrapper() {}

    public ArrayOfServicePortsWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfServicePorts arrayofserviceports)
    {
        copy( arrayofserviceports );
    }
    public ArrayOfServicePortsWrapper( List<ServicePortsWrapper> _servicePorts )
    {
        this.local_servicePorts = _servicePorts;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfServicePorts raw )
    {
        if (raw == null)
            return;

        if (raw.getServicePorts() != null)
        {
            this.local_servicePorts = new ArrayList<ServicePortsWrapper>();
            for ( int i = 0; i < raw.getServicePorts().length; i++)
            {
                this.local_servicePorts.add(new ServicePortsWrapper(raw.getServicePorts()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfServicePortsWrapper [" + "servicePorts = " + local_servicePorts + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfServicePorts getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfServicePorts raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfServicePorts();
        if (this.local_servicePorts!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts[] arr = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServicePorts[this.local_servicePorts.size()];
            for ( int i = 0; i < this.local_servicePorts.size(); i++)
            {
                arr[i] = this.local_servicePorts.get(i) .getRaw();
            }
            raw.setServicePorts(arr);
        }
        return raw;
    }


    public void setServicePorts( List<ServicePortsWrapper> _servicePorts )
    {
        this.local_servicePorts = _servicePorts;
    }
    public List<ServicePortsWrapper> getServicePorts( )
    {
        return this.local_servicePorts;
    }
}