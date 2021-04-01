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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: RoxieControlEndpointInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.091Z
 */
public class RoxieControlEndpointInfoWrapper
{
	protected String local_address;
	protected boolean local_attached;
	protected String local_stateHash;
	protected String local_status;

	public RoxieControlEndpointInfoWrapper() {}

	public RoxieControlEndpointInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo roxiecontrolendpointinfo)
	{
		copy( roxiecontrolendpointinfo );
	}
	public RoxieControlEndpointInfoWrapper( String _address, boolean _attached, String _stateHash, String _status )
	{
		this.local_address = _address;
		this.local_attached = _attached;
		this.local_stateHash = _stateHash;
		this.local_status = _status;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo raw )
	{
		if (raw == null)
			return;

		this.local_address = raw.getAddress();
		this.local_attached = raw.getAttached();
		this.local_stateHash = raw.getStateHash();
		this.local_status = raw.getStatus();

	}

	@Override
	public String toString()
	{
		return "RoxieControlEndpointInfoWrapper [" + "address = " + local_address + ", " + "attached = " + local_attached + ", " + "stateHash = " + local_stateHash + ", " + "status = " + local_status + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlEndpointInfo();
		raw.setAddress( local_address);
		raw.setAttached( local_attached);
		raw.setStateHash( local_stateHash);
		raw.setStatus( local_status);
		return raw;
	}


	public void setAddress( String _address )
	{
		this.local_address = _address;
	}
	public String getAddress( )
	{
		return this.local_address;
	}
	public void setAttached( boolean _attached )
	{
		this.local_attached = _attached;
	}
	public boolean getAttached( )
	{
		return this.local_attached;
	}
	public void setStateHash( String _stateHash )
	{
		this.local_stateHash = _stateHash;
	}
	public String getStateHash( )
	{
		return this.local_stateHash;
	}
	public void setStatus( String _status )
	{
		this.local_status = _status;
	}
	public String getStatus( )
	{
		return this.local_status;
	}
}