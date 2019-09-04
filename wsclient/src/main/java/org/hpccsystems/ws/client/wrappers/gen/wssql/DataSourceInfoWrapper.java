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
 * Class name: DataSourceInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataSourceInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.530Z
 */
public class DataSourceInfoWrapper
{
protected String local_sprayedFileName;
protected String local_landingZoneIP;
protected String local_landingZonePath;
protected String local_landingZoneFileName;

	public DataSourceInfoWrapper() {}

	public DataSourceInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataSourceInfo datasourceinfo)
	{
		copy( datasourceinfo );
	}
	public DataSourceInfoWrapper( String _sprayedFileName, String _landingZoneIP, String _landingZonePath, String _landingZoneFileName )
	{
		this.local_sprayedFileName = _sprayedFileName;
		this.local_landingZoneIP = _landingZoneIP;
		this.local_landingZonePath = _landingZonePath;
		this.local_landingZoneFileName = _landingZoneFileName;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataSourceInfo raw )
	{
		if (raw == null)
			return;

		this.local_sprayedFileName = raw.getSprayedFileName();
		this.local_landingZoneIP = raw.getLandingZoneIP();
		this.local_landingZonePath = raw.getLandingZonePath();
		this.local_landingZoneFileName = raw.getLandingZoneFileName();

	}

	@Override
	public String toString()
	{
		return "DataSourceInfoWrapper [" + "sprayedFileName = " + local_sprayedFileName + ", " + "landingZoneIP = " + local_landingZoneIP + ", " + "landingZonePath = " + local_landingZonePath + ", " + "landingZoneFileName = " + local_landingZoneFileName + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataSourceInfo getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataSourceInfo raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataSourceInfo();
		raw.setSprayedFileName( local_sprayedFileName);
		raw.setLandingZoneIP( local_landingZoneIP);
		raw.setLandingZonePath( local_landingZonePath);
		raw.setLandingZoneFileName( local_landingZoneFileName);
		return raw;
	}


	public void setSprayedFileName( String _sprayedFileName )
	{
		this.local_sprayedFileName = _sprayedFileName;
	}
	public String getSprayedFileName( )
	{
		return this.local_sprayedFileName;
	}
	public void setLandingZoneIP( String _landingZoneIP )
	{
		this.local_landingZoneIP = _landingZoneIP;
	}
	public String getLandingZoneIP( )
	{
		return this.local_landingZoneIP;
	}
	public void setLandingZonePath( String _landingZonePath )
	{
		this.local_landingZonePath = _landingZonePath;
	}
	public String getLandingZonePath( )
	{
		return this.local_landingZonePath;
	}
	public void setLandingZoneFileName( String _landingZoneFileName )
	{
		this.local_landingZoneFileName = _landingZoneFileName;
	}
	public String getLandingZoneFileName( )
	{
		return this.local_landingZoneFileName;
	}
}