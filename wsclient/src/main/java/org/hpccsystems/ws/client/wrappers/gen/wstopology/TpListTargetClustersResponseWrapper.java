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
 * Class name: TpListTargetClustersResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpListTargetClustersResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.952Z
 */
public class TpListTargetClustersResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected ArrayOfTpClusterNameTypeWrapper local_targetClusters;

	public TpListTargetClustersResponseWrapper() {}

	public TpListTargetClustersResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpListTargetClustersResponse tplisttargetclustersresponse)
	{
		copy( tplisttargetclustersresponse );
	}
	public TpListTargetClustersResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfTpClusterNameTypeWrapper _targetClusters )
	{
		this.local_exceptions = _exceptions;
		this.local_targetClusters = _targetClusters;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpListTargetClustersResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_targetClusters = new ArrayOfTpClusterNameTypeWrapper( raw.getTargetClusters());

	}

	@Override
	public String toString()
	{
		return "TpListTargetClustersResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "targetClusters = " + local_targetClusters + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpListTargetClustersResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpListTargetClustersResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpListTargetClustersResponse();
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
	public void setTargetClusters( ArrayOfTpClusterNameTypeWrapper _targetClusters )
	{
		this.local_targetClusters = _targetClusters;
	}
	public ArrayOfTpClusterNameTypeWrapper getTargetClusters( )
	{
		return this.local_targetClusters;
	}
}