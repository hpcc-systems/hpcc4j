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
 * Class name: EraseHistoryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.869Z
 */
public class EraseHistoryRequestWrapper
{
	protected String local_name;

	public EraseHistoryRequestWrapper() {}

	public EraseHistoryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryRequest erasehistoryrequest)
	{
		copy( erasehistoryrequest );
	}
	public EraseHistoryRequestWrapper( String _name )
	{
		this.local_name = _name;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryRequest raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();

	}

	@Override
	public String toString()
	{
		return "EraseHistoryRequestWrapper [" + "name = " + local_name + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryRequest();
		raw.setName( local_name);
		return raw;
	}


	public void setName( String _name )
	{
		this.local_name = _name;
	}
	public String getName( )
	{
		return this.local_name;
	}
}