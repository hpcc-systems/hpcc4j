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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TargetDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.TargetData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-09-23T03:53:35.724Z
 */
public class TargetDataWrapper
{
	protected String local_name;
	protected String local_type;
	protected List<String> local_processes = null;

	public TargetDataWrapper() {}

	public TargetDataWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.TargetData targetdata)
	{
		copy( targetdata );
	}
	public TargetDataWrapper( String _name, String _type, List<String> _processes )
	{
		this.local_name = _name;
		this.local_type = _type;
		this.local_processes = _processes;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.TargetData raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_type = raw.getType();
		if (raw.getProcesses() != null)
		{
			this.local_processes = new ArrayList<String>();
			for ( int i = 0; i < raw.getProcesses().getItem().length; i++)
			{
				this.local_processes.add(new String(raw.getProcesses().getItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "TargetDataWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "processes = " + local_processes + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.TargetData getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.TargetData raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.TargetData();
		raw.setName( local_name);
		raw.setType( local_type);
		if (this.local_processes!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_processes.size(); i++)
			{
				arr.addItem(this.local_processes.get(i));
			}
			raw.setProcesses(arr);
		}
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
	public void setProcesses( List<String> _processes )
	{
		this.local_processes = _processes;
	}
	public List<String> getProcesses( )
	{
		return this.local_processes;
	}
}