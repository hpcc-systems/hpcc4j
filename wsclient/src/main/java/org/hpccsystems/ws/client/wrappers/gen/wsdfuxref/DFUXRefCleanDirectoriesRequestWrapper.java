package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



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
 * Class name: DFUXRefCleanDirectoriesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefCleanDirectoriesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-01-20T21:52:27.262Z
 */
public class DFUXRefCleanDirectoriesRequestWrapper
{
	protected String local_cluster;

	public DFUXRefCleanDirectoriesRequestWrapper() {}

	public DFUXRefCleanDirectoriesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefCleanDirectoriesRequest dfuxrefcleandirectoriesrequest)
	{
		copy( dfuxrefcleandirectoriesrequest );
	}
	public DFUXRefCleanDirectoriesRequestWrapper( String _cluster )
	{
		this.local_cluster = _cluster;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefCleanDirectoriesRequest raw )
	{
		if (raw == null)
			return;

		this.local_cluster = raw.getCluster();

	}

	@Override
	public String toString()
	{
		return "DFUXRefCleanDirectoriesRequestWrapper [" + "cluster = " + local_cluster + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefCleanDirectoriesRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefCleanDirectoriesRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefCleanDirectoriesRequest();
		raw.setCluster( local_cluster);
		return raw;
	}


	public void setCluster( String _cluster )
	{
		this.local_cluster = _cluster;
	}
	public String getCluster( )
	{
		return this.local_cluster;
	}
}