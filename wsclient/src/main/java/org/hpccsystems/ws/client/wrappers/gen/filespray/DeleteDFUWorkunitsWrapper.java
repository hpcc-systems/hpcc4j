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
 * Class name: DeleteDFUWorkunitsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunits
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.831Z
 */
public class DeleteDFUWorkunitsWrapper
{
protected EspStringArrayWrapper local_wuids;

	public DeleteDFUWorkunitsWrapper() {}

	public DeleteDFUWorkunitsWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunits deletedfuworkunits)
	{
		copy( deletedfuworkunits );
	}
	public DeleteDFUWorkunitsWrapper( EspStringArrayWrapper _wuids )
	{
		this.local_wuids = _wuids;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunits raw )
	{
		if (raw == null)
			return;

		this.local_wuids = new EspStringArrayWrapper( raw.getWuids());

	}

	@Override
	public String toString()
	{
		return "DeleteDFUWorkunitsWrapper [" + "wuids = " + local_wuids + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunits getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunits raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunits();
		return raw;
	}


	public void setWuids( EspStringArrayWrapper _wuids )
	{
		this.local_wuids = _wuids;
	}
	public EspStringArrayWrapper getWuids( )
	{
		return this.local_wuids;
	}
}