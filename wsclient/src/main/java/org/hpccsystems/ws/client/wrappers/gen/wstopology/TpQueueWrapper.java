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
 * Class name: TpQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-09-23T21:40:52.984Z
 */
public class TpQueueWrapper
{
	protected String local_name;
	protected String local_workUnit;

	public TpQueueWrapper() {}

	public TpQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpQueue tpqueue)
	{
		copy( tpqueue );
	}
	public TpQueueWrapper( String _name, String _workUnit )
	{
		this.local_name = _name;
		this.local_workUnit = _workUnit;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpQueue raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_workUnit = raw.getWorkUnit();

	}

	@Override
	public String toString()
	{
		return "TpQueueWrapper [" + "name = " + local_name + ", " + "workUnit = " + local_workUnit + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpQueue getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpQueue raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpQueue();
		raw.setName( local_name);
		raw.setWorkUnit( local_workUnit);
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
	public void setWorkUnit( String _workUnit )
	{
		this.local_workUnit = _workUnit;
	}
	public String getWorkUnit( )
	{
		return this.local_workUnit;
	}
}