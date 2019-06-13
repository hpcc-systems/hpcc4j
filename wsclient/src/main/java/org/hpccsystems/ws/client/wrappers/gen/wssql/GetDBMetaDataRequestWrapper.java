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
 * Class name: GetDBMetaDataRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.588Z
 */
public class GetDBMetaDataRequestWrapper
{
protected boolean local_includeTables;
protected String local_tableFilter;
protected boolean local_includeStoredProcedures;
protected String local_querySet;
protected boolean local_includeTargetClusters;
protected String local_clusterType;

	public GetDBMetaDataRequestWrapper() {}

	public GetDBMetaDataRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest getdbmetadatarequest)
	{
		copy( getdbmetadatarequest );
	}
	public GetDBMetaDataRequestWrapper( boolean _includeTables, String _tableFilter, boolean _includeStoredProcedures, String _querySet, boolean _includeTargetClusters, String _clusterType )
	{
		this.local_includeTables = _includeTables;
		this.local_tableFilter = _tableFilter;
		this.local_includeStoredProcedures = _includeStoredProcedures;
		this.local_querySet = _querySet;
		this.local_includeTargetClusters = _includeTargetClusters;
		this.local_clusterType = _clusterType;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest raw )
	{
		if (raw == null)
			return;

		this.local_includeTables = raw.getIncludeTables();
		this.local_tableFilter = raw.getTableFilter();
		this.local_includeStoredProcedures = raw.getIncludeStoredProcedures();
		this.local_querySet = raw.getQuerySet();
		this.local_includeTargetClusters = raw.getIncludeTargetClusters();
		this.local_clusterType = raw.getClusterType();

	}

	@Override
	public String toString()
	{
		return "GetDBMetaDataRequestWrapper [" + "includeTables = " + local_includeTables + ", " + "tableFilter = " + local_tableFilter + ", " + "includeStoredProcedures = " + local_includeStoredProcedures + ", " + "querySet = " + local_querySet + ", " + "includeTargetClusters = " + local_includeTargetClusters + ", " + "clusterType = " + local_clusterType + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest();
		raw.setIncludeTables( local_includeTables);
		raw.setTableFilter( local_tableFilter);
		raw.setIncludeStoredProcedures( local_includeStoredProcedures);
		raw.setQuerySet( local_querySet);
		raw.setIncludeTargetClusters( local_includeTargetClusters);
		raw.setClusterType( local_clusterType);
		return raw;
	}


	public void setIncludeTables( boolean _includeTables )
	{
		this.local_includeTables = _includeTables;
	}
	public boolean getIncludeTables( )
	{
		return this.local_includeTables;
	}
	public void setTableFilter( String _tableFilter )
	{
		this.local_tableFilter = _tableFilter;
	}
	public String getTableFilter( )
	{
		return this.local_tableFilter;
	}
	public void setIncludeStoredProcedures( boolean _includeStoredProcedures )
	{
		this.local_includeStoredProcedures = _includeStoredProcedures;
	}
	public boolean getIncludeStoredProcedures( )
	{
		return this.local_includeStoredProcedures;
	}
	public void setQuerySet( String _querySet )
	{
		this.local_querySet = _querySet;
	}
	public String getQuerySet( )
	{
		return this.local_querySet;
	}
	public void setIncludeTargetClusters( boolean _includeTargetClusters )
	{
		this.local_includeTargetClusters = _includeTargetClusters;
	}
	public boolean getIncludeTargetClusters( )
	{
		return this.local_includeTargetClusters;
	}
	public void setClusterType( String _clusterType )
	{
		this.local_clusterType = _clusterType;
	}
	public String getClusterType( )
	{
		return this.local_clusterType;
	}
}