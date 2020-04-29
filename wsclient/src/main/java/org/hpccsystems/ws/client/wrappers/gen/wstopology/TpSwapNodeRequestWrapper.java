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
 * Class name: TpSwapNodeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSwapNodeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.384Z
 */
public class TpSwapNodeRequestWrapper
{
	protected String local_cluster;
	protected String local_oldIP;
	protected String local_newIP;

	public TpSwapNodeRequestWrapper() {}

	public TpSwapNodeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSwapNodeRequest tpswapnoderequest)
	{
		copy( tpswapnoderequest );
	}
	public TpSwapNodeRequestWrapper( String _cluster, String _oldIP, String _newIP )
	{
		this.local_cluster = _cluster;
		this.local_oldIP = _oldIP;
		this.local_newIP = _newIP;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSwapNodeRequest raw )
	{
		if (raw == null)
			return;

		this.local_cluster = raw.getCluster();
		this.local_oldIP = raw.getOldIP();
		this.local_newIP = raw.getNewIP();

	}

	@Override
	public String toString()
	{
		return "TpSwapNodeRequestWrapper [" + "cluster = " + local_cluster + ", " + "oldIP = " + local_oldIP + ", " + "newIP = " + local_newIP + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSwapNodeRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSwapNodeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSwapNodeRequest();
		raw.setCluster( local_cluster);
		raw.setOldIP( local_oldIP);
		raw.setNewIP( local_newIP);
		return raw;
	}


	public void setCluster( String _cluster )
	{
		this.local_cluster = _cluster;
	}
	public String getCluster( )
	{
		return this.local_cluster;
	}
	public void setOldIP( String _oldIP )
	{
		this.local_oldIP = _oldIP;
	}
	public String getOldIP( )
	{
		return this.local_oldIP;
	}
	public void setNewIP( String _newIP )
	{
		this.local_newIP = _newIP;
	}
	public String getNewIP( )
	{
		return this.local_newIP;
	}
}