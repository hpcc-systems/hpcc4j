package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUFileProtectWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileProtect
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.774Z
 */
public class DFUFileProtectWrapper
{
	protected String local_owner;
	protected String local_modified;

	public DFUFileProtectWrapper() {}

	public DFUFileProtectWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileProtect dfufileprotect)
	{
		copy( dfufileprotect );
	}
	public DFUFileProtectWrapper( String _owner, String _modified )
	{
		this.local_owner = _owner;
		this.local_modified = _modified;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileProtect raw )
	{
		if (raw == null)
			return;

		this.local_owner = raw.getOwner();
		this.local_modified = raw.getModified();

	}

	@Override
	public String toString()
	{
		return "DFUFileProtectWrapper [" + "owner = " + local_owner + ", " + "modified = " + local_modified + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileProtect getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileProtect raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileProtect();
		raw.setOwner( local_owner);
		raw.setModified( local_modified);
		return raw;
	}


	public void setOwner( String _owner )
	{
		this.local_owner = _owner;
	}
	public String getOwner( )
	{
		return this.local_owner;
	}
	public void setModified( String _modified )
	{
		this.local_modified = _modified;
	}
	public String getModified( )
	{
		return this.local_modified;
	}
}