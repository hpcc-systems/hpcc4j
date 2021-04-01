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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfDFUFilePartsOnClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUFilePartsOnCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.653Z
 */
public class ArrayOfDFUFilePartsOnClusterWrapper
{
	protected List<DFUFilePartsOnClusterWrapper> local_dFUFilePartsOnCluster = null;

	public ArrayOfDFUFilePartsOnClusterWrapper() {}

	public ArrayOfDFUFilePartsOnClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUFilePartsOnCluster arrayofdfufilepartsoncluster)
	{
		copy( arrayofdfufilepartsoncluster );
	}
	public ArrayOfDFUFilePartsOnClusterWrapper( List<DFUFilePartsOnClusterWrapper> _dFUFilePartsOnCluster )
	{
		this.local_dFUFilePartsOnCluster = _dFUFilePartsOnCluster;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUFilePartsOnCluster raw )
	{
		if (raw == null)
			return;

		if (raw.getDFUFilePartsOnCluster() != null)
		{
			this.local_dFUFilePartsOnCluster = new ArrayList<DFUFilePartsOnClusterWrapper>();
			for ( int i = 0; i < raw.getDFUFilePartsOnCluster().length; i++)
			{
				this.local_dFUFilePartsOnCluster.add(new DFUFilePartsOnClusterWrapper(raw.getDFUFilePartsOnCluster()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDFUFilePartsOnClusterWrapper [" + "dFUFilePartsOnCluster = " + local_dFUFilePartsOnCluster + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUFilePartsOnCluster getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUFilePartsOnCluster raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUFilePartsOnCluster();
		if (this.local_dFUFilePartsOnCluster!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePartsOnCluster[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePartsOnCluster[this.local_dFUFilePartsOnCluster.size()];
			for ( int i = 0; i < this.local_dFUFilePartsOnCluster.size(); i++)
			{
				arr[i] = this.local_dFUFilePartsOnCluster.get(i) .getRaw();
			}
			raw.setDFUFilePartsOnCluster(arr);
		}
		return raw;
	}


	public void setDFUFilePartsOnCluster( List<DFUFilePartsOnClusterWrapper> _dFUFilePartsOnCluster )
	{
		this.local_dFUFilePartsOnCluster = _dFUFilePartsOnCluster;
	}
	public List<DFUFilePartsOnClusterWrapper> getDFUFilePartsOnCluster( )
	{
		return this.local_dFUFilePartsOnCluster;
	}
}