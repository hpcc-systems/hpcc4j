package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: AlternateClusters_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.493Z
 */
public class AlternateClusters_type0Wrapper
{
protected List<String> local_alternateCluster = new ArrayList<String>();

	public AlternateClusters_type0Wrapper() {}

	public AlternateClusters_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0 alternateclusters_type0)
	{
		copy( alternateclusters_type0 );
	}
	public AlternateClusters_type0Wrapper( List<String> _alternateCluster )
	{
		this.local_alternateCluster = _alternateCluster;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getAlternateCluster() != null)
		{
			this.local_alternateCluster = new ArrayList<String>();
			for ( int i = 0; i < raw.getAlternateCluster().length; i++)
			{
				this.local_alternateCluster.add(new String(raw.getAlternateCluster()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "AlternateClusters_type0Wrapper [" + "alternateCluster = " + local_alternateCluster + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0();
		if (this.local_alternateCluster!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_alternateCluster.size()];
			for ( int i = 0; i < this.local_alternateCluster.size(); i++)
			{
				arr[i] = this.local_alternateCluster.get(i) ;
			}		raw.setAlternateCluster(arr);
}
		return raw;
	}


	public void setAlternateCluster( List<String> _alternateCluster )
	{
		this.local_alternateCluster = _alternateCluster;
	}
	public List<String> getAlternateCluster( )
	{
		return this.local_alternateCluster;
	}
}