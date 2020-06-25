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
 * Class name: PackageMaps_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMaps_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-04-29T14:39:01.433Z
 */
public class PackageMaps_type0Wrapper
{
	protected List<PackageMapEntryWrapper> local_packageMap = null;

	public PackageMaps_type0Wrapper() {}

	public PackageMaps_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMaps_type0 packagemaps_type0)
	{
		copy( packagemaps_type0 );
	}
	public PackageMaps_type0Wrapper( List<PackageMapEntryWrapper> _packageMap )
	{
		this.local_packageMap = _packageMap;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMaps_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getPackageMap() != null)
		{
			this.local_packageMap = new ArrayList<PackageMapEntryWrapper>();
			for ( int i = 0; i < raw.getPackageMap().length; i++)
			{
				this.local_packageMap.add(new PackageMapEntryWrapper(raw.getPackageMap()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "PackageMaps_type0Wrapper [" + "packageMap = " + local_packageMap + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMaps_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMaps_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMaps_type0();
		if (this.local_packageMap!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry[] arr = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageMapEntry[this.local_packageMap.size()];
			for ( int i = 0; i < this.local_packageMap.size(); i++)
			{
				arr[i] = this.local_packageMap.get(i) .getRaw();
			}
			raw.setPackageMap(arr);
		}
		return raw;
	}


	public void setPackageMap( List<PackageMapEntryWrapper> _packageMap )
	{
		this.local_packageMap = _packageMap;
	}
	public List<PackageMapEntryWrapper> getPackageMap( )
	{
		return this.local_packageMap;
	}
}