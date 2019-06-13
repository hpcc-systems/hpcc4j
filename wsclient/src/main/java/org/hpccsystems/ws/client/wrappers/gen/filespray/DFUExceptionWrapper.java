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
 * Class name: DFUExceptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.845Z
 */
public class DFUExceptionWrapper
{
protected int local_code;
protected String local_message;

	public DFUExceptionWrapper() {}

	public DFUExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUException dfuexception)
	{
		copy( dfuexception );
	}
	public DFUExceptionWrapper( int _code, String _message )
	{
		this.local_code = _code;
		this.local_message = _message;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUException raw )
	{
		if (raw == null)
			return;

		this.local_code = raw.getCode();
		this.local_message = raw.getMessage();

	}

	@Override
	public String toString()
	{
		return "DFUExceptionWrapper [" + "code = " + local_code + ", " + "message = " + local_message + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUException getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUException raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUException();
		raw.setCode( local_code);
		raw.setMessage( local_message);
		return raw;
	}


	public void setCode( int _code )
	{
		this.local_code = _code;
	}
	public int getCode( )
	{
		return this.local_code;
	}
	public void setMessage( String _message )
	{
		this.local_message = _message;
	}
	public String getMessage( )
	{
		return this.local_message;
	}
}