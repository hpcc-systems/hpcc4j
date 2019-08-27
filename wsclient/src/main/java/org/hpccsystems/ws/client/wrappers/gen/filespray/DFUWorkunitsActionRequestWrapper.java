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
 * Class name: DFUWorkunitsActionRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.859Z
 */
public class DFUWorkunitsActionRequestWrapper
{
protected EspStringArrayWrapper local_wuids;
protected DFUWUActionsWrapper local_type;

	public DFUWorkunitsActionRequestWrapper() {}

	public DFUWorkunitsActionRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest dfuworkunitsactionrequest)
	{
		copy( dfuworkunitsactionrequest );
	}
	public DFUWorkunitsActionRequestWrapper( EspStringArrayWrapper _wuids, DFUWUActionsWrapper _type )
	{
		this.local_wuids = _wuids;
		this.local_type = _type;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest raw )
	{
		if (raw == null)
			return;

		this.local_wuids = new EspStringArrayWrapper( raw.getWuids());
		this.local_type = new DFUWUActionsWrapper( raw.getType());

	}

	@Override
	public String toString()
	{
		return "DFUWorkunitsActionRequestWrapper [" + "wuids = " + local_wuids + ", " + "type = " + local_type + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest();
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
	public void setType( DFUWUActionsWrapper _type )
	{
		this.local_type = _type;
	}
	public DFUWUActionsWrapper getType( )
	{
		return this.local_type;
	}
}