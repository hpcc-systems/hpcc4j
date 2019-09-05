package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: TpClusterQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.899Z
 */
public class TpClusterQueryRequestWrapper
{
protected String local_type;

	public TpClusterQueryRequestWrapper() {}

	public TpClusterQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterQueryRequest tpclusterqueryrequest)
	{
		copy( tpclusterqueryrequest );
	}
	public TpClusterQueryRequestWrapper( String _type )
	{
		this.local_type = _type;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterQueryRequest raw )
	{
		if (raw == null)
			return;

		this.local_type = raw.getType();

	}

	@Override
	public String toString()
	{
		return "TpClusterQueryRequestWrapper [" + "type = " + local_type + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterQueryRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterQueryRequest();
		raw.setType( local_type);
		return raw;
	}


	public void setType( String _type )
	{
		this.local_type = _type;
	}
	public String getType( )
	{
		return this.local_type;
	}
}