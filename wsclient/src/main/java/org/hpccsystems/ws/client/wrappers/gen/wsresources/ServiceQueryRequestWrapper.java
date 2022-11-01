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

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: ServiceQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 * Service version: 1.01
 */
public class ServiceQueryRequestWrapper
{
    protected String local_type;
    protected String local_name;

    public ServiceQueryRequestWrapper() {}

    public ServiceQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest servicequeryrequest)
    {
        copy( servicequeryrequest );
    }
    public ServiceQueryRequestWrapper( String _type, String _name )
    {
        this.local_type = _type;
        this.local_name = _name;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest raw )
    {
        if (raw == null)
            return;

        this.local_type = raw.getType();
        this.local_name = raw.getName();

    }

    @Override
    public String toString()
    {
        return "ServiceQueryRequestWrapper [" + "type = " + local_type + ", " + "name = " + local_name + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest();
        raw.setType( local_type);
        raw.setName( local_name);
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
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
}