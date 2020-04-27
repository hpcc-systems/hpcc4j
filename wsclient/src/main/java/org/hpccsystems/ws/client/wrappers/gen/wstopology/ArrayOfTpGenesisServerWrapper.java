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
 * Class name: ArrayOfTpGenesisServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGenesisServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.406Z
 */
public class ArrayOfTpGenesisServerWrapper
{
	protected List<TpGenesisServerWrapper> local_tpGenesisServer = null;

	public ArrayOfTpGenesisServerWrapper() {}

	public ArrayOfTpGenesisServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGenesisServer arrayoftpgenesisserver)
	{
		copy( arrayoftpgenesisserver );
	}
	public ArrayOfTpGenesisServerWrapper( List<TpGenesisServerWrapper> _tpGenesisServer )
	{
		this.local_tpGenesisServer = _tpGenesisServer;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGenesisServer raw )
	{
		if (raw == null)
			return;

		if (raw.getTpGenesisServer() != null)
		{
			this.local_tpGenesisServer = new ArrayList<TpGenesisServerWrapper>();
			for ( int i = 0; i < raw.getTpGenesisServer().length; i++)
			{
				this.local_tpGenesisServer.add(new TpGenesisServerWrapper(raw.getTpGenesisServer()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpGenesisServerWrapper [" + "tpGenesisServer = " + local_tpGenesisServer + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGenesisServer getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGenesisServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpGenesisServer();
		if (this.local_tpGenesisServer!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGenesisServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGenesisServer[this.local_tpGenesisServer.size()];
			for ( int i = 0; i < this.local_tpGenesisServer.size(); i++)
			{
				arr[i] = this.local_tpGenesisServer.get(i) .getRaw();
			}
			raw.setTpGenesisServer(arr);
		}
		return raw;
	}


	public void setTpGenesisServer( List<TpGenesisServerWrapper> _tpGenesisServer )
	{
		this.local_tpGenesisServer = _tpGenesisServer;
	}
	public List<TpGenesisServerWrapper> getTpGenesisServer( )
	{
		return this.local_tpGenesisServer;
	}
}