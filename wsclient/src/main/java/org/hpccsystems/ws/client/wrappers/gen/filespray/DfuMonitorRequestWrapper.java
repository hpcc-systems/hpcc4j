package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: DfuMonitorRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.847Z
 */
public class DfuMonitorRequestWrapper
{
protected String local_eventName;
protected String local_logicalName;
protected String local_ip;
protected String local_filename;
protected boolean local_sub;
protected int local_shotLimit;

	public DfuMonitorRequestWrapper() {}

	public DfuMonitorRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorRequest dfumonitorrequest)
	{
		copy( dfumonitorrequest );
	}
	public DfuMonitorRequestWrapper( String _eventName, String _logicalName, String _ip, String _filename, boolean _sub, int _shotLimit )
	{
		this.local_eventName = _eventName;
		this.local_logicalName = _logicalName;
		this.local_ip = _ip;
		this.local_filename = _filename;
		this.local_sub = _sub;
		this.local_shotLimit = _shotLimit;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorRequest raw )
	{
		if (raw == null)
			return;

		this.local_eventName = raw.getEventName();
		this.local_logicalName = raw.getLogicalName();
		this.local_ip = raw.getIp();
		this.local_filename = raw.getFilename();
		this.local_sub = raw.getSub();
		this.local_shotLimit = raw.getShotLimit();

	}

	@Override
	public String toString()
	{
		return "DfuMonitorRequestWrapper [" + "eventName = " + local_eventName + ", " + "logicalName = " + local_logicalName + ", " + "ip = " + local_ip + ", " + "filename = " + local_filename + ", " + "sub = " + local_sub + ", " + "shotLimit = " + local_shotLimit + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorRequest();
		raw.setEventName( local_eventName);
		raw.setLogicalName( local_logicalName);
		raw.setIp( local_ip);
		raw.setFilename( local_filename);
		raw.setSub( local_sub);
		raw.setShotLimit( local_shotLimit);
		return raw;
	}


	public void setEventName( String _eventName )
	{
		this.local_eventName = _eventName;
	}
	public String getEventName( )
	{
		return this.local_eventName;
	}
	public void setLogicalName( String _logicalName )
	{
		this.local_logicalName = _logicalName;
	}
	public String getLogicalName( )
	{
		return this.local_logicalName;
	}
	public void setIp( String _ip )
	{
		this.local_ip = _ip;
	}
	public String getIp( )
	{
		return this.local_ip;
	}
	public void setFilename( String _filename )
	{
		this.local_filename = _filename;
	}
	public String getFilename( )
	{
		return this.local_filename;
	}
	public void setSub( boolean _sub )
	{
		this.local_sub = _sub;
	}
	public boolean getSub( )
	{
		return this.local_sub;
	}
	public void setShotLimit( int _shotLimit )
	{
		this.local_shotLimit = _shotLimit;
	}
	public int getShotLimit( )
	{
		return this.local_shotLimit;
	}
}