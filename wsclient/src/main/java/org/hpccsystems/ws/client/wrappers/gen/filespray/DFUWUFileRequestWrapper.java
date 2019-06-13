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
 * Class name: DFUWUFileRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.863Z
 */
public class DFUWUFileRequestWrapper
{
protected String local_wuid;
protected String local_type;
protected String local_plainText;

	public DFUWUFileRequestWrapper() {}

	public DFUWUFileRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileRequest dfuwufilerequest)
	{
		copy( dfuwufilerequest );
	}
	public DFUWUFileRequestWrapper( String _wuid, String _type, String _plainText )
	{
		this.local_wuid = _wuid;
		this.local_type = _type;
		this.local_plainText = _plainText;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileRequest raw )
	{
		if (raw == null)
			return;

		this.local_wuid = raw.getWuid();
		this.local_type = raw.getType();
		this.local_plainText = raw.getPlainText();

	}

	@Override
	public String toString()
	{
		return "DFUWUFileRequestWrapper [" + "wuid = " + local_wuid + ", " + "type = " + local_type + ", " + "plainText = " + local_plainText + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileRequest();
		raw.setWuid( local_wuid);
		raw.setType( local_type);
		raw.setPlainText( local_plainText);
		return raw;
	}


	public void setWuid( String _wuid )
	{
		this.local_wuid = _wuid;
	}
	public String getWuid( )
	{
		return this.local_wuid;
	}
	public void setType( String _type )
	{
		this.local_type = _type;
	}
	public String getType( )
	{
		return this.local_type;
	}
	public void setPlainText( String _plainText )
	{
		this.local_plainText = _plainText;
	}
	public String getPlainText( )
	{
		return this.local_plainText;
	}
}