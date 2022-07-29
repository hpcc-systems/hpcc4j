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
 * Class name: DebugValueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DebugValue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.800Z
 */
public class DebugValueWrapper
{
    protected String local_name;
    protected String local_value;

    public DebugValueWrapper() {}

    public DebugValueWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DebugValue debugvalue)
    {
        copy( debugvalue );
    }
    public DebugValueWrapper( String _name, String _value )
    {
        this.local_name = _name;
        this.local_value = _value;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DebugValue raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_value = raw.getValue();

    }

    @Override
    public String toString()
    {
        return "DebugValueWrapper [" + "name = " + local_name + ", " + "value = " + local_value + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DebugValue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DebugValue raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.DebugValue();
        raw.setName( local_name);
        raw.setValue( local_value);
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
    public void setValue( String _value )
    {
        this.local_value = _value;
    }
    public String getValue( )
    {
        return this.local_value;
    }
}