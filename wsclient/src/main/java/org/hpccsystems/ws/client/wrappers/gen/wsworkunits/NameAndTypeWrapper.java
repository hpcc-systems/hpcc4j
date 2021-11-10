package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: NameAndTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_83.NameAndType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2021-09-30T21:52:48.412Z
 */
public class NameAndTypeWrapper
{
    protected String local_name;
    protected String local_type;

    public NameAndTypeWrapper() {}

    public NameAndTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NameAndType nameandtype)
    {
        copy( nameandtype );
    }
    public NameAndTypeWrapper( String _name, String _type )
    {
        this.local_name = _name;
        this.local_type = _type;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NameAndType raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();

    }

    @Override
    public String toString()
    {
        return "NameAndTypeWrapper [" + "name = " + local_name + ", " + "type = " + local_type + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NameAndType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NameAndType raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NameAndType();
        raw.setName( local_name);
        raw.setType( local_type);
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
}