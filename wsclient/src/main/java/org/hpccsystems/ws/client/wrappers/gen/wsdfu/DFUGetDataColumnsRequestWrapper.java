package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUGetDataColumnsRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.796Z
 */
public class DFUGetDataColumnsRequestWrapper
{
	protected String local_openLogicalName;
	protected String local_logicalName;
	protected String local_filterBy;
	protected String local_showColumns;
	protected int local_chooseFile;
	protected String local_cluster;
	protected String local_clusterType;
	protected long local_startIndex;
	protected long local_endIndex;

	public DFUGetDataColumnsRequestWrapper() {}

	public DFUGetDataColumnsRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsRequest dfugetdatacolumnsrequest)
	{
		copy( dfugetdatacolumnsrequest );
	}
	public DFUGetDataColumnsRequestWrapper( String _openLogicalName, String _logicalName, String _filterBy, String _showColumns, int _chooseFile, String _cluster, String _clusterType, long _startIndex, long _endIndex )
	{
		this.local_openLogicalName = _openLogicalName;
		this.local_logicalName = _logicalName;
		this.local_filterBy = _filterBy;
		this.local_showColumns = _showColumns;
		this.local_chooseFile = _chooseFile;
		this.local_cluster = _cluster;
		this.local_clusterType = _clusterType;
		this.local_startIndex = _startIndex;
		this.local_endIndex = _endIndex;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsRequest raw )
	{
		if (raw == null)
			return;

		this.local_openLogicalName = raw.getOpenLogicalName();
		this.local_logicalName = raw.getLogicalName();
		this.local_filterBy = raw.getFilterBy();
		this.local_showColumns = raw.getShowColumns();
		this.local_chooseFile = raw.getChooseFile();
		this.local_cluster = raw.getCluster();
		this.local_clusterType = raw.getClusterType();
		this.local_startIndex = raw.getStartIndex();
		this.local_endIndex = raw.getEndIndex();

	}

	@Override
	public String toString()
	{
		return "DFUGetDataColumnsRequestWrapper [" + "openLogicalName = " + local_openLogicalName + ", " + "logicalName = " + local_logicalName + ", " + "filterBy = " + local_filterBy + ", " + "showColumns = " + local_showColumns + ", " + "chooseFile = " + local_chooseFile + ", " + "cluster = " + local_cluster + ", " + "clusterType = " + local_clusterType + ", " + "startIndex = " + local_startIndex + ", " + "endIndex = " + local_endIndex + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUGetDataColumnsRequest();
		raw.setOpenLogicalName( local_openLogicalName);
		raw.setLogicalName( local_logicalName);
		raw.setFilterBy( local_filterBy);
		raw.setShowColumns( local_showColumns);
		raw.setChooseFile( local_chooseFile);
		raw.setCluster( local_cluster);
		raw.setClusterType( local_clusterType);
		raw.setStartIndex( local_startIndex);
		raw.setEndIndex( local_endIndex);
		return raw;
	}


	public void setOpenLogicalName( String _openLogicalName )
	{
		this.local_openLogicalName = _openLogicalName;
	}
	public String getOpenLogicalName( )
	{
		return this.local_openLogicalName;
	}
	public void setLogicalName( String _logicalName )
	{
		this.local_logicalName = _logicalName;
	}
	public String getLogicalName( )
	{
		return this.local_logicalName;
	}
	public void setFilterBy( String _filterBy )
	{
		this.local_filterBy = _filterBy;
	}
	public String getFilterBy( )
	{
		return this.local_filterBy;
	}
	public void setShowColumns( String _showColumns )
	{
		this.local_showColumns = _showColumns;
	}
	public String getShowColumns( )
	{
		return this.local_showColumns;
	}
	public void setChooseFile( int _chooseFile )
	{
		this.local_chooseFile = _chooseFile;
	}
	public int getChooseFile( )
	{
		return this.local_chooseFile;
	}
	public void setCluster( String _cluster )
	{
		this.local_cluster = _cluster;
	}
	public String getCluster( )
	{
		return this.local_cluster;
	}
	public void setClusterType( String _clusterType )
	{
		this.local_clusterType = _clusterType;
	}
	public String getClusterType( )
	{
		return this.local_clusterType;
	}
	public void setStartIndex( long _startIndex )
	{
		this.local_startIndex = _startIndex;
	}
	public long getStartIndex( )
	{
		return this.local_startIndex;
	}
	public void setEndIndex( long _endIndex )
	{
		this.local_endIndex = _endIndex;
	}
	public long getEndIndex( )
	{
		return this.local_endIndex;
	}
}