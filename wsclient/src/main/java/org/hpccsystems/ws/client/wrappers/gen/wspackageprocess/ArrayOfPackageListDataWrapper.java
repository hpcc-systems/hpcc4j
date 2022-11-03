package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
 * WrapperMaker version: 1.7
 * Class name: ArrayOfPackageListDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfPackageListData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * Service version: 1.05
 */
public class ArrayOfPackageListDataWrapper
{
    protected List<PackageListDataWrapper> local_packageListData = null;

    public ArrayOfPackageListDataWrapper() {}

    public ArrayOfPackageListDataWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfPackageListData arrayofpackagelistdata)
    {
        copy( arrayofpackagelistdata );
    }
    public ArrayOfPackageListDataWrapper( List<PackageListDataWrapper> _packageListData )
    {
        this.local_packageListData = _packageListData;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfPackageListData raw )
    {
        if (raw == null)
            return;

        if (raw.getPackageListData() != null)
        {
            this.local_packageListData = new ArrayList<PackageListDataWrapper>();
            for ( int i = 0; i < raw.getPackageListData().length; i++)
            {
                this.local_packageListData.add(new PackageListDataWrapper(raw.getPackageListData()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfPackageListDataWrapper [" + "packageListData = " + local_packageListData + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfPackageListData getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfPackageListData raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfPackageListData();
        if (this.local_packageListData!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListData[] arr = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListData[this.local_packageListData.size()];
            for ( int i = 0; i < this.local_packageListData.size(); i++)
            {
                arr[i] = this.local_packageListData.get(i) .getRaw();
            }
            raw.setPackageListData(arr);
        }
        return raw;
    }


    public void setPackageListData( List<PackageListDataWrapper> _packageListData )
    {
        this.local_packageListData = _packageListData;
    }
    public List<PackageListDataWrapper> getPackageListData( )
    {
        return this.local_packageListData;
    }
}