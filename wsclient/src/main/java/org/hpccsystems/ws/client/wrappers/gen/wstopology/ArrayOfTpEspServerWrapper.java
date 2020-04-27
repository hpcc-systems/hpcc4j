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
 * Class name: ArrayOfTpEspServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpEspServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.393Z
 */
public class ArrayOfTpEspServerWrapper
{
	protected List<TpEspServerWrapper> local_tpEspServer = null;

	public ArrayOfTpEspServerWrapper() {}

	public ArrayOfTpEspServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpEspServer arrayoftpespserver)
	{
		copy( arrayoftpespserver );
	}
	public ArrayOfTpEspServerWrapper( List<TpEspServerWrapper> _tpEspServer )
	{
		this.local_tpEspServer = _tpEspServer;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpEspServer raw )
	{
		if (raw == null)
			return;

		if (raw.getTpEspServer() != null)
		{
			this.local_tpEspServer = new ArrayList<TpEspServerWrapper>();
			for ( int i = 0; i < raw.getTpEspServer().length; i++)
			{
				this.local_tpEspServer.add(new TpEspServerWrapper(raw.getTpEspServer()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpEspServerWrapper [" + "tpEspServer = " + local_tpEspServer + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpEspServer getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpEspServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpEspServer();
		if (this.local_tpEspServer!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpEspServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpEspServer[this.local_tpEspServer.size()];
			for ( int i = 0; i < this.local_tpEspServer.size(); i++)
			{
				arr[i] = this.local_tpEspServer.get(i) .getRaw();
			}
			raw.setTpEspServer(arr);
		}
		return raw;
	}


	public void setTpEspServer( List<TpEspServerWrapper> _tpEspServer )
	{
		this.local_tpEspServer = _tpEspServer;
	}
	public List<TpEspServerWrapper> getTpEspServer( )
	{
		return this.local_tpEspServer;
	}
}