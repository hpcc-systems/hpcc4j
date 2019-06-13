package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: GetDFUServerQueuesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.898Z
 */
public class GetDFUServerQueuesRequestWrapper
{
protected String local_dFUServerName;

	public GetDFUServerQueuesRequestWrapper() {}

	public GetDFUServerQueuesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesRequest getdfuserverqueuesrequest)
	{
		copy( getdfuserverqueuesrequest );
	}
	public GetDFUServerQueuesRequestWrapper( String _dFUServerName )
	{
		this.local_dFUServerName = _dFUServerName;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesRequest raw )
	{
		if (raw == null)
			return;

		this.local_dFUServerName = raw.getDFUServerName();

	}

	@Override
	public String toString()
	{
		return "GetDFUServerQueuesRequestWrapper [" + "dFUServerName = " + local_dFUServerName + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesRequest();
		raw.setDFUServerName( local_dFUServerName);
		return raw;
	}


	public void setDFUServerName( String _dFUServerName )
	{
		this.local_dFUServerName = _dFUServerName;
	}
	public String getDFUServerName( )
	{
		return this.local_dFUServerName;
	}
}