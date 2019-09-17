package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: TpClusterInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.896Z
 */
public class TpClusterInfoResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected String local_name;
protected String local_workUnit;
protected ArrayOfTpQueueWrapper local_tpQueues;

	public TpClusterInfoResponseWrapper() {}

	public TpClusterInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse tpclusterinforesponse)
	{
		copy( tpclusterinforesponse );
	}
	public TpClusterInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _name, String _workUnit, ArrayOfTpQueueWrapper _tpQueues )
	{
		this.local_exceptions = _exceptions;
		this.local_name = _name;
		this.local_workUnit = _workUnit;
		this.local_tpQueues = _tpQueues;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_name = raw.getName();
		this.local_workUnit = raw.getWorkUnit();
		this.local_tpQueues = new ArrayOfTpQueueWrapper( raw.getTpQueues());

	}

	@Override
	public String toString()
	{
		return "TpClusterInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "name = " + local_name + ", " + "workUnit = " + local_workUnit + ", " + "tpQueues = " + local_tpQueues + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse();
		raw.setName( local_name);
		raw.setWorkUnit( local_workUnit);
		return raw;
	}


	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}
	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
	public void setName( String _name )
	{
		this.local_name = _name;
	}
	public String getName( )
	{
		return this.local_name;
	}
	public void setWorkUnit( String _workUnit )
	{
		this.local_workUnit = _workUnit;
	}
	public String getWorkUnit( )
	{
		return this.local_workUnit;
	}
	public void setTpQueues( ArrayOfTpQueueWrapper _tpQueues )
	{
		this.local_tpQueues = _tpQueues;
	}
	public ArrayOfTpQueueWrapper getTpQueues( )
	{
		return this.local_tpQueues;
	}
}