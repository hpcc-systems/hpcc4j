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
 * Class name: ClusterNames_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ClusterNames_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.815Z
 */
public class ClusterNames_type0Wrapper
{
protected List<String> local_clusterName = new ArrayList<String>();

	public ClusterNames_type0Wrapper() {}

	public ClusterNames_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ClusterNames_type0 clusternames_type0)
	{
		copy( clusternames_type0 );
	}
	public ClusterNames_type0Wrapper( List<String> _clusterName )
	{
		this.local_clusterName = _clusterName;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ClusterNames_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getClusterName() != null)
		{
			this.local_clusterName = new ArrayList<String>();
			for ( int i = 0; i < raw.getClusterName().length; i++)
			{
				this.local_clusterName.add(new String(raw.getClusterName()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ClusterNames_type0Wrapper [" + "clusterName = " + local_clusterName + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ClusterNames_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ClusterNames_type0 raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ClusterNames_type0();
		if (this.local_clusterName!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_clusterName.size()];
			for ( int i = 0; i < this.local_clusterName.size(); i++)
			{
				arr[i] = this.local_clusterName.get(i) ;
			}		raw.setClusterName(arr);
}
		return raw;
	}


	public void setClusterName( List<String> _clusterName )
	{
		this.local_clusterName = _clusterName;
	}
	public List<String> getClusterName( )
	{
		return this.local_clusterName;
	}
}