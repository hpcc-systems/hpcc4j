package org.hpccsystems.ws.client.wrappers.gen.wssql;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Class name: CreateTableAndLoadResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.528Z
 */
public class CreateTableAndLoadResponseWrapper
{
protected String local_tableName;
protected boolean local_success;
protected String local_eclRecordDefinition;
protected ECLWorkunitWrapper local_workunit;

	public CreateTableAndLoadResponseWrapper() {}

	public CreateTableAndLoadResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadResponse createtableandloadresponse)
	{
		copy( createtableandloadresponse );
	}
	public CreateTableAndLoadResponseWrapper( String _tableName, boolean _success, String _eclRecordDefinition, ECLWorkunitWrapper _workunit )
	{
		this.local_tableName = _tableName;
		this.local_success = _success;
		this.local_eclRecordDefinition = _eclRecordDefinition;
		this.local_workunit = _workunit;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadResponse raw )
	{
		if (raw == null)
			return;

		this.local_tableName = raw.getTableName();
		this.local_success = raw.getSuccess();
		this.local_eclRecordDefinition = raw.getEclRecordDefinition();
		this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());

	}

	@Override
	public String toString()
	{
		return "CreateTableAndLoadResponseWrapper [" + "tableName = " + local_tableName + ", " + "success = " + local_success + ", " + "eclRecordDefinition = " + local_eclRecordDefinition + ", " + "workunit = " + local_workunit + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadResponse();
		raw.setTableName( local_tableName);
		raw.setSuccess( local_success);
		raw.setEclRecordDefinition( local_eclRecordDefinition);
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
	public void setSuccess( boolean _success )
	{
		this.local_success = _success;
	}
	public boolean getSuccess( )
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