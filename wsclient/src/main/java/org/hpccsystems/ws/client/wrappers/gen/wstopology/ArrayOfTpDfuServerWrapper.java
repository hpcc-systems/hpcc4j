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
 * Class name: ArrayOfTpDfuServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDfuServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.859Z
 */
public class ArrayOfTpDfuServerWrapper
{
protected List<TpDfuServerWrapper> local_tpDfuServer = new ArrayList<TpDfuServerWrapper>();

	public ArrayOfTpDfuServerWrapper() {}

	public ArrayOfTpDfuServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDfuServer arrayoftpdfuserver)
	{
		copy( arrayoftpdfuserver );
	}
	public ArrayOfTpDfuServerWrapper( List<TpDfuServerWrapper> _tpDfuServer )
	{
		this.local_tpDfuServer = _tpDfuServer;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDfuServer raw )
	{
		if (raw == null)
			return;

		if (raw.getTpDfuServer() != null)
		{
			this.local_tpDfuServer = new ArrayList<TpDfuServerWrapper>();
			for ( int i = 0; i < raw.getTpDfuServer().length; i++)
			{
				this.local_tpDfuServer.add(new TpDfuServerWrapper(raw.getTpDfuServer()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpDfuServerWrapper [" + "tpDfuServer = " + local_tpDfuServer + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDfuServer getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDfuServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDfuServer();
		if (this.local_tpDfuServer!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDfuServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDfuServer[this.local_tpDfuServer.size()];
			for ( int i = 0; i < this.local_tpDfuServer.size(); i++)
			{
				arr[i] = this.local_tpDfuServer.get(i) .getRaw();
			}
			raw.setTpDfuServer(arr);
		}
		return raw;
	}


	public void setTpDfuServer( List<TpDfuServerWrapper> _tpDfuServer )
	{
		this.local_tpDfuServer = _tpDfuServer;
	}
	public List<TpDfuServerWrapper> getTpDfuServer( )
	{
		return this.local_tpDfuServer;
	}
}