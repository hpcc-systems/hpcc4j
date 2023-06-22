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
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ServiceConnectionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceConnection
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class ServiceConnectionWrapper
{
    protected String local_type;
    protected List<String> local_externalIPs = null;
    protected ExternalIPStatusWrapper local_externalIPStatus;
    protected ArrayOfServicePortsWrapper local_ports;

    public ServiceConnectionWrapper() {}

    public ServiceConnectionWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceConnection serviceconnection)
    {
        copy( serviceconnection );
    }
    public ServiceConnectionWrapper( String _type, List<String> _externalIPs, ExternalIPStatusWrapper _externalIPStatus, ArrayOfServicePortsWrapper _ports )
    {
        this.local_type = _type;
        this.local_externalIPs = _externalIPs;
        this.local_externalIPStatus = _externalIPStatus;
        this.local_ports = _ports;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceConnection raw )
    {
        if (raw == null)
            return;

        this.local_type = raw.getType();
        if (raw.getExternalIPs() != null && raw.getExternalIPs().getItem() != null)
        {
            this.local_externalIPs = new ArrayList<String>();
            for ( int i = 0; i < raw.getExternalIPs().getItem().length; i++)
            {
                this.local_externalIPs.add(new String(raw.getExternalIPs().getItem()[i]));
            }
        }        if (raw.getExternalIPStatus() != null)
            this.local_externalIPStatus = new ExternalIPStatusWrapper( raw.getExternalIPStatus());
        if (raw.getPorts() != null)
            this.local_ports = new ArrayOfServicePortsWrapper( raw.getPorts());

    }

    @Override
    public String toString()
    {
        return "ServiceConnectionWrapper [" + "type = " + local_type + ", " + "externalIPs = " + local_externalIPs + ", " + "externalIPStatus = " + local_externalIPStatus + ", " + "ports = " + local_ports + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceConnection getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceConnection raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceConnection();
        raw.setType( local_type);
        if (this.local_externalIPs!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_externalIPs.size(); i++)
            {
                arr.addItem(this.local_externalIPs.get(i));
            }
            raw.setExternalIPs(arr);
        }
        if (local_externalIPStatus != null)
            raw.setExternalIPStatus( local_externalIPStatus.getRaw());
        if (local_ports != null)
            raw.setPorts( local_ports.getRaw());
        return raw;
    }


    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setExternalIPs( List<String> _externalIPs )
    {
        this.local_externalIPs = _externalIPs;
    }
    public List<String> getExternalIPs( )
    {
        return this.local_externalIPs;
    }
    public void setExternalIPStatus( ExternalIPStatusWrapper _externalIPStatus )
    {
        this.local_externalIPStatus = _externalIPStatus;
    }
    public ExternalIPStatusWrapper getExternalIPStatus( )
    {
        return this.local_externalIPStatus;
    }
    public void setPorts( ArrayOfServicePortsWrapper _ports )
    {
        this.local_ports = _ports;
    }
    public ArrayOfServicePortsWrapper getPorts( )
    {
        return this.local_ports;
    }
}