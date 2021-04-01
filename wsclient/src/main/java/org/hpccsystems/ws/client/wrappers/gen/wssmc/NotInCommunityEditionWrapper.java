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
 * Class name: NotInCommunityEditionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEdition
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.061Z
 */
public class NotInCommunityEditionWrapper
{
	protected String local_eEPortal;

	public NotInCommunityEditionWrapper() {}

	public NotInCommunityEditionWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEdition notincommunityedition)
	{
		copy( notincommunityedition );
	}
	public NotInCommunityEditionWrapper( String _eEPortal )
	{
		this.local_eEPortal = _eEPortal;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEdition raw )
	{
		if (raw == null)
			return;

		this.local_eEPortal = raw.getEEPortal();

	}

	@Override
	public String toString()
	{
		return "NotInCommunityEditionWrapper [" + "eEPortal = " + local_eEPortal + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEdition getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEdition raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEdition();
		raw.setEEPortal( local_eEPortal);
		return raw;
	}


	public void setEEPortal( String _eEPortal )
	{
		this.local_eEPortal = _eEPortal;
	}
	public String getEEPortal( )
	{
		return this.local_eEPortal;
	}
}