package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: ArrayOfPackageListMapDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfPackageListMapData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.451Z
 */
public class ArrayOfPackageListMapDataWrapper
{
protected List<PackageListMapDataWrapper> local_packageListMapData = new ArrayList<PackageListMapDataWrapper>();

	public ArrayOfPackageListMapDataWrapper() {}

	public ArrayOfPackageListMapDataWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfPackageListMapData arrayofpackagelistmapdata)
	{
		copy( arrayofpackagelistmapdata );
	}
	public ArrayOfPackageListMapDataWrapper( List<PackageListMapDataWrapper> _packageListMapData )
	{
		this.local_packageListMapData = _packageListMapData;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfPackageListMapData raw )
	{
		if (raw == null)
			return;

		if (raw.getPackageListMapData() != null)
		{
			this.local_packageListMapData = new ArrayList<PackageListMapDataWrapper>();
			for ( int i = 0; i < raw.getPackageListMapData().length; i++)
			{
				this.local_packageListMapData.add(new PackageListMapDataWrapper(raw.getPackageListMapData()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfPackageListMapDataWrapper [" + "packageListMapData = " + local_packageListMapData + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfPackageListMapData getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfPackageListMapData raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfPackageListMapData();
		if (this.local_packageListMapData!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListMapData[] arr = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListMapData[this.local_packageListMapData.size()];
			for ( int i = 0; i < this.local_packageListMapData.size(); i++)
			{
				arr[i] = this.local_packageListMapData.get(i) .getRaw();
			}
			raw.setPackageListMapData(arr);
		}
		return raw;
	}


	public void setPackageListMapData( List<PackageListMapDataWrapper> _packageListMapData )
	{
		this.local_packageListMapData = _packageListMapData;
	}
	public List<PackageListMapDataWrapper> getPackageListMapData( )
	{
		return this.local_packageListMapData;
	}
}