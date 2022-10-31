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
 * Class name: DataTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.351Z
 */
public class DataTypeWrapper
{
    protected HPCCFileTypeWrapper local_type;
    protected Params_type0Wrapper local_params;

    public DataTypeWrapper() {}

    public DataTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType datatype)
    {
        copy( datatype );
    }
    public DataTypeWrapper( HPCCFileTypeWrapper _type, Params_type0Wrapper _params )
    {
        this.local_type = _type;
        this.local_params = _params;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType raw )
    {
        if (raw == null)
            return;

        if (raw.getType() != null)
            this.local_type = new HPCCFileTypeWrapper( raw.getType());
        if (raw.getParams() != null)
            this.local_params = new Params_type0Wrapper( raw.getParams());

    }

    @Override
    public String toString()
    {
        return "DataTypeWrapper [" + "type = " + local_type + ", " + "params = " + local_params + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType();
        if (local_type != null)
            raw.setType( local_type.getRaw());
        if (local_params != null)
            raw.setParams( local_params.getRaw());
        return raw;
    }


    public void setType( HPCCFileTypeWrapper _type )
    {
        this.local_type = _type;
    }
    public HPCCFileTypeWrapper getType( )
    {
        return this.local_type;
    }
    public void setParams( Params_type0Wrapper _params )
    {
        this.local_params = _params;
    }
    public Params_type0Wrapper getParams( )
    {
        return this.local_params;
    }
}