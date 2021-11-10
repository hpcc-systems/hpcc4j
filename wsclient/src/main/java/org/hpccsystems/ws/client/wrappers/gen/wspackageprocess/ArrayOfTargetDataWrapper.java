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
 * Class name: ArrayOfTargetDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ArrayOfTargetData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-09-23T03:53:35.672Z
 */
public class ArrayOfTargetDataWrapper
{
    protected List<TargetDataWrapper> local_targetData = null;

    public ArrayOfTargetDataWrapper() {}

    public ArrayOfTargetDataWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfTargetData arrayoftargetdata)
    {
        copy( arrayoftargetdata );
    }
    public ArrayOfTargetDataWrapper( List<TargetDataWrapper> _targetData )
    {
        this.local_targetData = _targetData;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfTargetData raw )
    {
        if (raw == null)
            return;

        if (raw.getTargetData() != null)
        {
            this.local_targetData = new ArrayList<TargetDataWrapper>();
            for ( int i = 0; i < raw.getTargetData().length; i++)
            {
                this.local_targetData.add(new TargetDataWrapper(raw.getTargetData()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTargetDataWrapper [" + "targetData = " + local_targetData + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfTargetData getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfTargetData raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfTargetData();
        if (this.local_targetData!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.TargetData[] arr = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.TargetData[this.local_targetData.size()];
            for ( int i = 0; i < this.local_targetData.size(); i++)
            {
                arr[i] = this.local_targetData.get(i) .getRaw();
            }
            raw.setTargetData(arr);
        }
        return raw;
    }


    public void setTargetData( List<TargetDataWrapper> _targetData )
    {
        this.local_targetData = _targetData;
    }
    public List<TargetDataWrapper> getTargetData( )
    {
        return this.local_targetData;
    }
}