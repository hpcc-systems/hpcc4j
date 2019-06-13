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
 * Class name: DeleteDFUWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.827Z
 */
public class DeleteDFUWorkunitWrapper
{
protected String local_wuid;

	public DeleteDFUWorkunitWrapper() {}

	public DeleteDFUWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunit deletedfuworkunit)
	{
		copy( deletedfuworkunit );
	}
	public DeleteDFUWorkunitWrapper( String _wuid )
	{
		this.local_wuid = _wuid;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunit raw )
	{
		if (raw == null)
			return;

		this.local_wuid = raw.getWuid();

	}

	@Override
	public String toString()
	{
		return "DeleteDFUWorkunitWrapper [" + "wuid = " + local_wuid + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunit getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunit();
		raw.setWuid( local_wuid);
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
}