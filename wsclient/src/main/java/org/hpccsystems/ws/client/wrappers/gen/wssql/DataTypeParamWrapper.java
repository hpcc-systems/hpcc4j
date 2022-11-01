package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: DataTypeParamWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataTypeParam
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.351Z
 */
public class DataTypeParamWrapper
{
    protected String local_name;
    protected Values_type0Wrapper local_values;

    public DataTypeParamWrapper() {}

    public DataTypeParamWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataTypeParam datatypeparam)
    {
        copy( datatypeparam );
    }
    public DataTypeParamWrapper( String _name, Values_type0Wrapper _values )
    {
        this.local_name = _name;
        this.local_values = _values;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataTypeParam raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        if (raw.getValues() != null)
            this.local_values = new Values_type0Wrapper( raw.getValues());

    }

    @Override
    public String toString()
    {
        return "DataTypeParamWrapper [" + "name = " + local_name + ", " + "values = " + local_values + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataTypeParam getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataTypeParam raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataTypeParam();
        raw.setName( local_name);
        if (local_values != null)
            raw.setValues( local_values.getRaw());
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
    public void setValues( Values_type0Wrapper _values )
    {
        this.local_values = _values;
    }
    public Values_type0Wrapper getValues( )
    {
        return this.local_values;
    }
}