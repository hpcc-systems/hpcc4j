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
 * Class name: ArrayOfTpMySqlServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMySqlServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.877Z
 */
public class ArrayOfTpMySqlServerWrapper
{
protected List<TpMySqlServerWrapper> local_tpMySqlServer = new ArrayList<TpMySqlServerWrapper>();

	public ArrayOfTpMySqlServerWrapper() {}

	public ArrayOfTpMySqlServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMySqlServer arrayoftpmysqlserver)
	{
		copy( arrayoftpmysqlserver );
	}
	public ArrayOfTpMySqlServerWrapper( List<TpMySqlServerWrapper> _tpMySqlServer )
	{
		this.local_tpMySqlServer = _tpMySqlServer;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMySqlServer raw )
	{
		if (raw == null)
			return;

		if (raw.getTpMySqlServer() != null)
		{
			this.local_tpMySqlServer = new ArrayList<TpMySqlServerWrapper>();
			for ( int i = 0; i < raw.getTpMySqlServer().length; i++)
			{
				this.local_tpMySqlServer.add(new TpMySqlServerWrapper(raw.getTpMySqlServer()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpMySqlServerWrapper [" + "tpMySqlServer = " + local_tpMySqlServer + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMySqlServer getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMySqlServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMySqlServer();
		if (this.local_tpMySqlServer!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMySqlServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMySqlServer[this.local_tpMySqlServer.size()];
			for ( int i = 0; i < this.local_tpMySqlServer.size(); i++)
			{
				arr[i] = this.local_tpMySqlServer.get(i) .getRaw();
			}
			raw.setTpMySqlServer(arr);
		}
		return raw;
	}


	public void setTpMySqlServer( List<TpMySqlServerWrapper> _tpMySqlServer )
	{
		this.local_tpMySqlServer = _tpMySqlServer;
	}
	public List<TpMySqlServerWrapper> getTpMySqlServer( )
	{
		return this.local_tpMySqlServer;
	}
}