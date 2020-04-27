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
 * Class name: TpClusterInfoRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.334Z
 */
public class TpClusterInfoRequestWrapper
{
	protected String local_name;

	public TpClusterInfoRequestWrapper() {}

	public TpClusterInfoRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest tpclusterinforequest)
	{
		copy( tpclusterinforequest );
	}
	public TpClusterInfoRequestWrapper( String _name )
	{
		this.local_name = _name;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();

	}

	@Override
	public String toString()
	{
		return "TpClusterInfoRequestWrapper [" + "name = " + local_name + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoRequest();
		raw.setName( local_name);
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
}