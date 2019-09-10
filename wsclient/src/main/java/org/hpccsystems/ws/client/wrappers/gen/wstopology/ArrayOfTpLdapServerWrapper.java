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
 * Class name: ArrayOfTpLdapServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpLdapServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.873Z
 */
public class ArrayOfTpLdapServerWrapper
{
protected List<TpLdapServerWrapper> local_tpLdapServer = new ArrayList<TpLdapServerWrapper>();

	public ArrayOfTpLdapServerWrapper() {}

	public ArrayOfTpLdapServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpLdapServer arrayoftpldapserver)
	{
		copy( arrayoftpldapserver );
	}
	public ArrayOfTpLdapServerWrapper( List<TpLdapServerWrapper> _tpLdapServer )
	{
		this.local_tpLdapServer = _tpLdapServer;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpLdapServer raw )
	{
		if (raw == null)
			return;

		if (raw.getTpLdapServer() != null)
		{
			this.local_tpLdapServer = new ArrayList<TpLdapServerWrapper>();
			for ( int i = 0; i < raw.getTpLdapServer().length; i++)
			{
				this.local_tpLdapServer.add(new TpLdapServerWrapper(raw.getTpLdapServer()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpLdapServerWrapper [" + "tpLdapServer = " + local_tpLdapServer + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpLdapServer getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpLdapServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpLdapServer();
		if (this.local_tpLdapServer!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLdapServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLdapServer[this.local_tpLdapServer.size()];
			for ( int i = 0; i < this.local_tpLdapServer.size(); i++)
			{
				arr[i] = this.local_tpLdapServer.get(i) .getRaw();
			}
			raw.setTpLdapServer(arr);
		}
		return raw;
	}


	public void setTpLdapServer( List<TpLdapServerWrapper> _tpLdapServer )
	{
		this.local_tpLdapServer = _tpLdapServer;
	}
	public List<TpLdapServerWrapper> getTpLdapServer( )
	{
		return this.local_tpLdapServer;
	}
}