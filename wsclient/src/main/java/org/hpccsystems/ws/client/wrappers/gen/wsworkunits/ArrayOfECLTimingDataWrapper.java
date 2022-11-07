package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: ArrayOfECLTimingDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimingData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.781Z
 */
public class ArrayOfECLTimingDataWrapper
{
    protected List<ECLTimingDataWrapper> local_eCLTimingData = null;

    public ArrayOfECLTimingDataWrapper() {}

    public ArrayOfECLTimingDataWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimingData arrayofecltimingdata)
    {
        copy( arrayofecltimingdata );
    }
    public ArrayOfECLTimingDataWrapper( List<ECLTimingDataWrapper> _eCLTimingData )
    {
        this.local_eCLTimingData = _eCLTimingData;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimingData raw )
    {
        if (raw == null)
            return;

        if (raw.getECLTimingData() != null)
        {
            this.local_eCLTimingData = new ArrayList<ECLTimingDataWrapper>();
            for ( int i = 0; i < raw.getECLTimingData().length; i++)
            {
                this.local_eCLTimingData.add(new ECLTimingDataWrapper(raw.getECLTimingData()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLTimingDataWrapper [" + "eCLTimingData = " + local_eCLTimingData + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimingData getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimingData raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimingData();
        if (this.local_eCLTimingData!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData[this.local_eCLTimingData.size()];
            for ( int i = 0; i < this.local_eCLTimingData.size(); i++)
            {
                arr[i] = this.local_eCLTimingData.get(i) .getRaw();
            }
            raw.setECLTimingData(arr);
        }
        return raw;
    }


    public void setECLTimingData( List<ECLTimingDataWrapper> _eCLTimingData )
    {
        this.local_eCLTimingData = _eCLTimingData;
    }
    public List<ECLTimingDataWrapper> getECLTimingData( )
    {
        return this.local_eCLTimingData;
    }
}