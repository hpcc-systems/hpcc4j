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
 * Class name: HPCCColumnWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCColumn
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.396Z
 */
public class HPCCColumnWrapper
{
    protected String local_name;
    protected String local_type;
    protected Columns_type0Wrapper local_columns;

    public HPCCColumnWrapper() {}

    public HPCCColumnWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCColumn hpcccolumn)
    {
        copy( hpcccolumn );
    }
    public HPCCColumnWrapper( String _name, String _type, Columns_type0Wrapper _columns )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_columns = _columns;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCColumn raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        if (raw.getColumns() != null)
            this.local_columns = new Columns_type0Wrapper( raw.getColumns());

    }

    @Override
    public String toString()
    {
        return "HPCCColumnWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "columns = " + local_columns + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCColumn getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCColumn raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCColumn();
        raw.setName( local_name);
        raw.setType( local_type);
        if (local_columns != null)
            raw.setColumns( local_columns.getRaw());
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
    public void setColumns( Columns_type0Wrapper _columns )
    {
        this.local_columns = _columns;
    }
    public Columns_type0Wrapper getColumns( )
    {
        return this.local_columns;
    }
}