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
 * Class name: RenameResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.RenameResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.923Z
 */
public class RenameResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected String local_wuid;

	public RenameResponseWrapper() {}

	public RenameResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.RenameResponse renameresponse)
	{
		copy( renameresponse );
	}
	public RenameResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid )
	{
		this.local_exceptions = _exceptions;
		this.local_wuid = _wuid;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.RenameResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_wuid = raw.getWuid();

	}

	@Override
	public String toString()
	{
		return "RenameResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.RenameResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.RenameResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.RenameResponse();
		raw.setWuid( local_wuid);
		return raw;
	}


	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}
	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
	public void setWuid( String _wuid )
	{
		this.local_wuid = _wuid;
	}
	public String getWuid( )
	{
		return this.local_wuid;
	}
}