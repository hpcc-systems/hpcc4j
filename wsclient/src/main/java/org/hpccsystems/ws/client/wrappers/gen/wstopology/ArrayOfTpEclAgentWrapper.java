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
 * Class name: ArrayOfTpEclAgentWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpEclAgent
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-09-23T21:40:52.907Z
 */
public class ArrayOfTpEclAgentWrapper
{
	protected List<TpEclAgentWrapper> local_tpEclAgent = null;

	public ArrayOfTpEclAgentWrapper() {}

	public ArrayOfTpEclAgentWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpEclAgent arrayoftpeclagent)
	{
		copy( arrayoftpeclagent );
	}
	public ArrayOfTpEclAgentWrapper( List<TpEclAgentWrapper> _tpEclAgent )
	{
		this.local_tpEclAgent = _tpEclAgent;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpEclAgent raw )
	{
		if (raw == null)
			return;

		if (raw.getTpEclAgent() != null)
		{
			this.local_tpEclAgent = new ArrayList<TpEclAgentWrapper>();
			for ( int i = 0; i < raw.getTpEclAgent().length; i++)
			{
				this.local_tpEclAgent.add(new TpEclAgentWrapper(raw.getTpEclAgent()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpEclAgentWrapper [" + "tpEclAgent = " + local_tpEclAgent + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpEclAgent getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpEclAgent raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.ArrayOfTpEclAgent();
		if (this.local_tpEclAgent!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpEclAgent[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpEclAgent[this.local_tpEclAgent.size()];
			for ( int i = 0; i < this.local_tpEclAgent.size(); i++)
			{
				arr[i] = this.local_tpEclAgent.get(i) .getRaw();
			}
			raw.setTpEclAgent(arr);
		}
		return raw;
	}


	public void setTpEclAgent( List<TpEclAgentWrapper> _tpEclAgent )
	{
		this.local_tpEclAgent = _tpEclAgent;
	}
	public List<TpEclAgentWrapper> getTpEclAgent( )
	{
		return this.local_tpEclAgent;
	}
}