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
 * Class name: TpMachineInfoRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachineInfoRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.295Z
 */
public class TpMachineInfoRequestWrapper
{
	protected String local_name;
	protected String local_netAddress;

	public TpMachineInfoRequestWrapper() {}

	public TpMachineInfoRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachineInfoRequest tpmachineinforequest)
	{
		copy( tpmachineinforequest );
	}
	public TpMachineInfoRequestWrapper( String _name, String _netAddress )
	{
		this.local_name = _name;
		this.local_netAddress = _netAddress;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachineInfoRequest raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_netAddress = raw.getNetAddress();

	}

	@Override
	public String toString()
	{
		return "TpMachineInfoRequestWrapper [" + "name = " + local_name + ", " + "netAddress = " + local_netAddress + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachineInfoRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachineInfoRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachineInfoRequest();
		raw.setName( local_name);
		raw.setNetAddress( local_netAddress);
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
	public void setNetAddress( String _netAddress )
	{
		this.local_netAddress = _netAddress;
	}
	public String getNetAddress( )
	{
		return this.local_netAddress;
	}
}