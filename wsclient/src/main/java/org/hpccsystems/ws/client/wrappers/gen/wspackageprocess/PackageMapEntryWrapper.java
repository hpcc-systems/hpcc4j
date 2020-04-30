package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: PackageMapEntryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-04-29T14:39:01.548Z
 */
public class PackageMapEntryWrapper
{
	protected String local_id;
	protected String local_target;
	protected String local_process;

	public PackageMapEntryWrapper() {}

	public PackageMapEntryWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry packagemapentry)
	{
		copy( packagemapentry );
	}
	public PackageMapEntryWrapper( String _id, String _target, String _process )
	{
		this.local_id = _id;
		this.local_target = _target;
		this.local_process = _process;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry raw )
	{
		if (raw == null)
			return;

		this.local_id = raw.getId();
		this.local_target = raw.getTarget();
		this.local_process = raw.getProcess();

	}

	@Override
	public String toString()
	{
		return "PackageMapEntryWrapper [" + "id = " + local_id + ", " + "target = " + local_target + ", " + "process = " + local_process + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry();
		raw.setId( local_id);
		raw.setTarget( local_target);
		raw.setProcess( local_process);
		return raw;
	}


	public void setId( String _id )
	{
		this.local_id = _id;
	}
	public String getId( )
	{
		return this.local_id;
	}
	public void setTarget( String _target )
	{
		this.local_target = _target;
	}
	public String getTarget( )
	{
		return this.local_target;
	}
	public void setProcess( String _process )
	{
		this.local_process = _process;
	}
	public String getProcess( )
	{
		return this.local_process;
	}
}