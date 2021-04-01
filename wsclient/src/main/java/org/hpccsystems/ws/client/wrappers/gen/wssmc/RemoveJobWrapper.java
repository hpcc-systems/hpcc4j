package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: RemoveJobWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RemoveJob
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.076Z
 */
public class RemoveJobWrapper
{
	protected int local_clusterType;
	protected String local_cluster;
	protected String local_queueName;
	protected String local_wuid;

	public RemoveJobWrapper() {}

	public RemoveJobWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RemoveJob removejob)
	{
		copy( removejob );
	}
	public RemoveJobWrapper( int _clusterType, String _cluster, String _queueName, String _wuid )
	{
		this.local_clusterType = _clusterType;
		this.local_cluster = _cluster;
		this.local_queueName = _queueName;
		this.local_wuid = _wuid;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RemoveJob raw )
	{
		if (raw == null)
			return;

		this.local_clusterType = raw.getClusterType();
		this.local_cluster = raw.getCluster();
		this.local_queueName = raw.getQueueName();
		this.local_wuid = raw.getWuid();

	}

	@Override
	public String toString()
	{
		return "RemoveJobWrapper [" + "clusterType = " + local_clusterType + ", " + "cluster = " + local_cluster + ", " + "queueName = " + local_queueName + ", " + "wuid = " + local_wuid + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RemoveJob getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RemoveJob raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RemoveJob();
		raw.setClusterType( local_clusterType);
		raw.setCluster( local_cluster);
		raw.setQueueName( local_queueName);
		raw.setWuid( local_wuid);
		return raw;
	}


	public void setClusterType( int _clusterType )
	{
		this.local_clusterType = _clusterType;
	}
	public int getClusterType( )
	{
		return this.local_clusterType;
	}
	public void setCluster( String _cluster )
	{
		this.local_cluster = _cluster;
	}
	public String getCluster( )
	{
		return this.local_cluster;
	}
	public void setQueueName( String _queueName )
	{
		this.local_queueName = _queueName;
	}
	public String getQueueName( )
	{
		return this.local_queueName;
	}
	public void setWuid( String _wuid )
	{
		this.local_wuid = _wuid;
	}
	public String getWuid( )
	{
		return this.local_wuid;
	}
}