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
 * Class name: TpLogicalClusterQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.961Z
 */
public class TpLogicalClusterQueryResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected ArrayOfTpLogicalClusterWrapper local_tpLogicalClusters;

	public TpLogicalClusterQueryResponseWrapper() {}

	public TpLogicalClusterQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse tplogicalclusterqueryresponse)
	{
		copy( tplogicalclusterqueryresponse );
	}
	public TpLogicalClusterQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfTpLogicalClusterWrapper _tpLogicalClusters )
	{
		this.local_exceptions = _exceptions;
		this.local_tpLogicalClusters = _tpLogicalClusters;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_tpLogicalClusters = new ArrayOfTpLogicalClusterWrapper( raw.getTpLogicalClusters());

	}

	@Override
	public String toString()
	{
		return "TpLogicalClusterQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "tpLogicalClusters = " + local_tpLogicalClusters + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalClusterQueryResponse();
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
	public void setTpLogicalClusters( ArrayOfTpLogicalClusterWrapper _tpLogicalClusters )
	{
		this.local_tpLogicalClusters = _tpLogicalClusters;
	}
	public ArrayOfTpLogicalClusterWrapper getTpLogicalClusters( )
	{
		return this.local_tpLogicalClusters;
	}
}