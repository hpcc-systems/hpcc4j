package org.hpccsystems.ws.client.wrappers.gen.wsstore;

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
 * Class name: CreateStoreResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class CreateStoreResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_name;
    protected String local_type;
    protected String local_description;
    protected String local_owner;
    protected boolean local_success;

    public CreateStoreResponseWrapper() {}

    public CreateStoreResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreResponse createstoreresponse)
    {
        copy( createstoreresponse );
    }
    public CreateStoreResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _name, String _type, String _description, String _owner, boolean _success )
    {
        this.local_exceptions = _exceptions;
        this.local_name = _name;
        this.local_type = _type;
        this.local_description = _description;
        this.local_owner = _owner;
        this.local_success = _success;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_description = raw.getDescription();
        this.local_owner = raw.getOwner();
        this.local_success = raw.getSuccess();

    }

    @Override
    public String toString()
    {
        return "CreateStoreResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "name = " + local_name + ", " + "type = " + local_type + ", " + "description = " + local_description + ", " + "owner = " + local_owner + ", " + "success = " + local_success + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setDescription( local_description);
        raw.setOwner( local_owner);
        raw.setSuccess( local_success);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
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
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setSuccess( boolean _success )
    {
        this.local_success = _success;
    }
    public boolean getSuccess( )
    {
        return this.local_success;
    }
}