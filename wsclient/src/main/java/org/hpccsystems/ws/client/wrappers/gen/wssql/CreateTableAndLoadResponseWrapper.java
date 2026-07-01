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
import org.apache.axiom.om.OMElement;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: CreateTableAndLoadResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class CreateTableAndLoadResponseWrapper
{
    protected String local_tableName;
    protected OMElement local_success;
    protected String local_eclRecordDefinition;
    protected ECLWorkunitWrapper local_workunit;

    public CreateTableAndLoadResponseWrapper() {}

    public CreateTableAndLoadResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse createtableandloadresponse)
    {
        copy( createtableandloadresponse );
    }
    public CreateTableAndLoadResponseWrapper( String _tableName, OMElement _success, String _eclRecordDefinition, ECLWorkunitWrapper _workunit )
    {
        this.local_tableName = _tableName;
        this.local_success = _success;
        this.local_eclRecordDefinition = _eclRecordDefinition;
        this.local_workunit = _workunit;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse raw )
    {
        if (raw == null)
            return;

        this.local_tableName = raw.getTableName();
        this.local_success = raw.getSuccess();
        this.local_eclRecordDefinition = raw.getEclRecordDefinition();
        if (raw.getWorkunit() != null)
            this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());

    }

    @Override
    public String toString()
    {
        return "CreateTableAndLoadResponseWrapper [" + "tableName = " + local_tableName + ", " + "success = " + local_success + ", " + "eclRecordDefinition = " + local_eclRecordDefinition + ", " + "workunit = " + local_workunit + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse();
        raw.setTableName( local_tableName);
        raw.setSuccess( local_success);
        raw.setEclRecordDefinition( local_eclRecordDefinition);
        if (local_workunit != null)
            raw.setWorkunit( local_workunit.getRaw());
        return raw;
    }


    public void setTableName( String _tableName )
    {
        this.local_tableName = _tableName;
    }
    public String getTableName( )
    {
        return this.local_tableName;
    }
    public void setSuccess( OMElement _success )
    {
        this.local_success = _success;
    }
    public OMElement getSuccess( )
    {
        return this.local_success;
    }
    public void setEclRecordDefinition( String _eclRecordDefinition )
    {
        this.local_eclRecordDefinition = _eclRecordDefinition;
    }
    public String getEclRecordDefinition( )
    {
        return this.local_eclRecordDefinition;
    }
    public void setWorkunit( ECLWorkunitWrapper _workunit )
    {
        this.local_workunit = _workunit;
    }
    public ECLWorkunitWrapper getWorkunit( )
    {
        return this.local_workunit;
    }
}