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
 * Class name: CreateStoreRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class CreateStoreRequestWrapper
{
    protected String local_name;
    protected String local_type;
    protected String local_description;
    protected int local_maxValueSize;

    public CreateStoreRequestWrapper() {}

    public CreateStoreRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreRequest createstorerequest)
    {
        copy( createstorerequest );
    }
    public CreateStoreRequestWrapper( String _name, String _type, String _description, int _maxValueSize )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_description = _description;
        this.local_maxValueSize = _maxValueSize;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreRequest raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_description = raw.getDescription();
        this.local_maxValueSize = raw.getMaxValueSize();

    }

    @Override
    public String toString()
    {
        return "CreateStoreRequestWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "description = " + local_description + ", " + "maxValueSize = " + local_maxValueSize + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreRequest();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setDescription( local_description);
        raw.setMaxValueSize( local_maxValueSize);
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
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setMaxValueSize( int _maxValueSize )
    {
        this.local_maxValueSize = _maxValueSize;
    }
    public int getMaxValueSize( )
    {
        return this.local_maxValueSize;
    }
}