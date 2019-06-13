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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GroupNodes_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNodes_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.912Z
 */
public class GroupNodes_type0Wrapper
{
protected List<GroupNodeWrapper> local_groupNode = new ArrayList<GroupNodeWrapper>();

	public GroupNodes_type0Wrapper() {}

	public GroupNodes_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNodes_type0 groupnodes_type0)
	{
		copy( groupnodes_type0 );
	}
	public GroupNodes_type0Wrapper( List<GroupNodeWrapper> _groupNode )
	{
		this.local_groupNode = _groupNode;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNodes_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getGroupNode() != null)
		{
			this.local_groupNode = new ArrayList<GroupNodeWrapper>();
			for ( int i = 0; i < raw.getGroupNode().length; i++)
			{
				this.local_groupNode.add(new GroupNodeWrapper(raw.getGroupNode()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "GroupNodes_type0Wrapper [" + "groupNode = " + local_groupNode + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNodes_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNodes_type0 raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNodes_type0();
		if (this.local_groupNode!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode[] arr = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GroupNode[this.local_groupNode.size()];
			for ( int i = 0; i < this.local_groupNode.size(); i++)
			{
				arr[i] = this.local_groupNode.get(i) .getRaw();
			}		raw.setGroupNode(arr);
}
		return raw;
	}


	public void setGroupNode( List<GroupNodeWrapper> _groupNode )
	{
		this.local_groupNode = _groupNode;
	}
	public List<GroupNodeWrapper> getGroupNode( )
	{
		return this.local_groupNode;
	}
}