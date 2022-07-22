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
 * Class name: WUExtraPropertiesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.911Z
 */
public class WUExtraPropertiesWrapper
{
    protected String local_scopeType;
    protected Properties_type1Wrapper local_properties;

    public WUExtraPropertiesWrapper() {}

    public WUExtraPropertiesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties wuextraproperties)
    {
        copy( wuextraproperties );
    }
    public WUExtraPropertiesWrapper( String _scopeType, Properties_type1Wrapper _properties )
    {
        this.local_scopeType = _scopeType;
        this.local_properties = _properties;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties raw )
    {
        if (raw == null)
            return;

        this.local_scopeType = raw.getScopeType();
        if (raw.getProperties() != null)
            this.local_properties = new Properties_type1Wrapper( raw.getProperties());

    }

    @Override
    public String toString()
    {
        return "WUExtraPropertiesWrapper [" + "scopeType = " + local_scopeType + ", " + "properties = " + local_properties + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties();
        raw.setScopeType( local_scopeType);
        return raw;
    }


    public void setScopeType( String _scopeType )
    {
        this.local_scopeType = _scopeType;
    }
    public String getScopeType( )
    {
        return this.local_scopeType;
    }
    public void setProperties( Properties_type1Wrapper _properties )
    {
        this.local_properties = _properties;
    }
    public Properties_type1Wrapper getProperties( )
    {
        return this.local_properties;
    }
}