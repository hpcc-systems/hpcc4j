package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: Endpoints_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Endpoints_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:28.983Z
 */
public class Endpoints_type0Wrapper
{
	protected List<RoxieControlEndpointInfoWrapper> local_endpoint = null;

	public Endpoints_type0Wrapper() {}

	public Endpoints_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Endpoints_type0 endpoints_type0)
	{
		copy( endpoints_type0 );
	}
	public Endpoints_type0Wrapper( List<RoxieControlEndpointInfoWrapper> _endpoint )
	{
		this.local_endpoint = _endpoint;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Endpoints_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getEndpoint() != null)
		{
			this.local_endpoint = new ArrayList<RoxieControlEndpointInfoWrapper>();
			for ( int i = 0; i < raw.getEndpoint().length; i++)
			{
				this.local_endpoint.add(new RoxieControlEndpointInfoWrapper(raw.getEndpoint()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Endpoints_type0Wrapper [" + "endpoint = " + local_endpoint + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Endpoints_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Endpoints_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Endpoints_type0();
		if (this.local_endpoint!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo[this.local_endpoint.size()];
			for ( int i = 0; i < this.local_endpoint.size(); i++)
			{
				arr[i] = this.local_endpoint.get(i) .getRaw();
			}
			raw.setEndpoint(arr);
		}
		return raw;
	}


	public void setEndpoint( List<RoxieControlEndpointInfoWrapper> _endpoint )
	{
		this.local_endpoint = _endpoint;
	}
	public List<RoxieControlEndpointInfoWrapper> getEndpoint( )
	{
		return this.local_endpoint;
	}
}