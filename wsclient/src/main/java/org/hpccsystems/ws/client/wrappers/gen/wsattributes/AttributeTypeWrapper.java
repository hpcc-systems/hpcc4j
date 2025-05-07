package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: AttributeTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class AttributeTypeWrapper
{
    protected int local_iD;
    protected String local_name;
    protected String local_description;

    public AttributeTypeWrapper() {}

    public AttributeTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType attributetype)
    {
        copy( attributetype );
    }
    public AttributeTypeWrapper( int _iD, String _name, String _description )
    {
        this.local_iD = _iD;
        this.local_name = _name;
        this.local_description = _description;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType raw )
    {
        if (raw == null)
            return;

        this.local_iD = raw.getID();
        this.local_name = raw.getName();
        this.local_description = raw.getDescription();

    }

    @Override
    public String toString()
    {
        return "AttributeTypeWrapper [" + "iD = " + local_iD + ", " + "name = " + local_name + ", " + "description = " + local_description + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType();
        raw.setID( local_iD);
        raw.setName( local_name);
        raw.setDescription( local_description);
        return raw;
    }


    public void setID( int _iD )
    {
        this.local_iD = _iD;
    }
    public int getID( )
    {
        return this.local_iD;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
}