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
 * Class name: TpLogicalClusterQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.421Z
 */
public class TpLogicalClusterQueryRequestWrapper
{
	protected String local_eclServerQueue;

	public TpLogicalClusterQueryRequestWrapper() {}

	public TpLogicalClusterQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest tplogicalclusterqueryrequest)
	{
		copy( tplogicalclusterqueryrequest );
	}
	public TpLogicalClusterQueryRequestWrapper( String _eclServerQueue )
	{
		this.local_eclServerQueue = _eclServerQueue;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest raw )
	{
		if (raw == null)
			return;

		this.local_eclServerQueue = raw.getEclServerQueue();

	}

	@Override
	public String toString()
	{
		return "TpLogicalClusterQueryRequestWrapper [" + "eclServerQueue = " + local_eclServerQueue + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryRequest();
		raw.setEclServerQueue( local_eclServerQueue);
		return raw;
	}


	public void setEclServerQueue( String _eclServerQueue )
	{
		this.local_eclServerQueue = _eclServerQueue;
	}
	public String getEclServerQueue( )
	{
		return this.local_eclServerQueue;
	}
}