package org.hpccsystems.ws.client.wrappers.gen.wsresources;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Class name: HPCCServiceWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.HPCCService
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 * TimeStamp: 2021-03-26T16:29:03.959Z
 */
public class HPCCServiceWrapper
{
    protected String local_name;
    protected String local_type;
    protected UnsignedInt local_port;
    protected boolean local_tLSSecure;

    public HPCCServiceWrapper() {}

    public HPCCServiceWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService hpccservice)
    {
        copy( hpccservice );
    }
    public HPCCServiceWrapper( String _name, String _type, UnsignedInt _port, boolean _tLSSecure )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_port = _port;
        this.local_tLSSecure = _tLSSecure;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_port = raw.getPort();
        this.local_tLSSecure = raw.getTLSSecure();

    }

    @Override
    public String toString()
    {
        return "HPCCServiceWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "port = " + local_port + ", " + "tLSSecure = " + local_tLSSecure + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCService();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setPort( local_port);
        raw.setTLSSecure( local_tLSSecure);
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
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setPort( UnsignedInt _port )
    {
        this.local_port = _port;
    }
    public UnsignedInt getPort( )
    {
        return this.local_port;
    }
    public void setTLSSecure( boolean _tLSSecure )
    {
        this.local_tLSSecure = _tLSSecure;
    }
    public boolean getTLSSecure( )
    {
        return this.local_tLSSecure;
    }
}