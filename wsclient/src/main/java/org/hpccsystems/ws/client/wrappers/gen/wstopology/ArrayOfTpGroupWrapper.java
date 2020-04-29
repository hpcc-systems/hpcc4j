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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfTpGroupWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGroup
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.386Z
 */
public class ArrayOfTpGroupWrapper
{
	protected List<TpGroupWrapper> local_tpGroup = null;

	public ArrayOfTpGroupWrapper() {}

	public ArrayOfTpGroupWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGroup arrayoftpgroup)
	{
		copy( arrayoftpgroup );
	}
	public ArrayOfTpGroupWrapper( List<TpGroupWrapper> _tpGroup )
	{
		this.local_tpGroup = _tpGroup;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGroup raw )
	{
		if (raw == null)
			return;

		if (raw.getTpGroup() != null)
		{
			this.local_tpGroup = new ArrayList<TpGroupWrapper>();
			for ( int i = 0; i < raw.getTpGroup().length; i++)
			{
				this.local_tpGroup.add(new TpGroupWrapper(raw.getTpGroup()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpGroupWrapper [" + "tpGroup = " + local_tpGroup + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGroup getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGroup raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGroup();
		if (this.local_tpGroup!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroup[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroup[this.local_tpGroup.size()];
			for ( int i = 0; i < this.local_tpGroup.size(); i++)
			{
				arr[i] = this.local_tpGroup.get(i) .getRaw();
			}
			raw.setTpGroup(arr);
		}
		return raw;
	}


	public void setTpGroup( List<TpGroupWrapper> _tpGroup )
	{
		this.local_tpGroup = _tpGroup;
	}
	public List<TpGroupWrapper> getTpGroup( )
	{
		return this.local_tpGroup;
	}
}