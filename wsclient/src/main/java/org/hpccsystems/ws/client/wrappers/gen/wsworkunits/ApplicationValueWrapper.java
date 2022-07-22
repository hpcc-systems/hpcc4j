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
 * Class name: ApplicationValueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.770Z
 */
public class ApplicationValueWrapper
{
    protected String local_application;
    protected String local_name;
    protected String local_value;

    public ApplicationValueWrapper() {}

    public ApplicationValueWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue applicationvalue)
    {
        copy( applicationvalue );
    }
    public ApplicationValueWrapper( String _application, String _name, String _value )
    {
        this.local_application = _application;
        this.local_name = _name;
        this.local_value = _value;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue raw )
    {
        if (raw == null)
            return;

        this.local_application = raw.getApplication();
        this.local_name = raw.getName();
        this.local_value = raw.getValue();

    }

    @Override
    public String toString()
    {
        return "ApplicationValueWrapper [" + "application = " + local_application + ", " + "name = " + local_name + ", " + "value = " + local_value + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue();
        raw.setApplication( local_application);
        raw.setName( local_name);
        raw.setValue( local_value);
        return raw;
    }


    public void setApplication( String _application )
    {
        this.local_application = _application;
    }
    public String getApplication( )
    {
        return this.local_application;
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