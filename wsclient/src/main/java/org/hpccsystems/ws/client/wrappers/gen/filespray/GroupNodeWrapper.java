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
 * Class name: GroupNodeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.911Z
 */
public class GroupNodeWrapper
{
protected String local_name;
protected String local_clusterType;
protected boolean local_replicateOutputs;

	public GroupNodeWrapper() {}

	public GroupNodeWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode groupnode)
	{
		copy( groupnode );
	}
	public GroupNodeWrapper( String _name, String _clusterType, boolean _replicateOutputs )
	{
		this.local_name = _name;
		this.local_clusterType = _clusterType;
		this.local_replicateOutputs = _replicateOutputs;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_clusterType = raw.getClusterType();
		this.local_replicateOutputs = raw.getReplicateOutputs();

	}

	@Override
	public String toString()
	{
		return "GroupNodeWrapper [" + "name = " + local_name + ", " + "clusterType = " + local_clusterType + ", " + "replicateOutputs = " + local_replicateOutputs + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode();
		raw.setName( local_name);
		raw.setClusterType( local_clusterType);
		raw.setReplicateOutputs( local_replicateOutputs);
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
	public void setClusterType( String _clusterType )
	{
		this.local_clusterType = _clusterType;
	}
	public String getClusterType( )
	{
		return this.local_clusterType;
	}
	public void setReplicateOutputs( boolean _replicateOutputs )
	{
		this.local_replicateOutputs = _replicateOutputs;
	}
	public boolean getReplicateOutputs( )
	{
		return this.local_replicateOutputs;
	}
}