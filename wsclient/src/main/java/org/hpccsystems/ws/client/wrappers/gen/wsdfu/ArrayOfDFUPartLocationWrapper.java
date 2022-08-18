package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: ArrayOfDFUPartLocationWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.088Z
 */
public class ArrayOfDFUPartLocationWrapper
{
    protected List<DFUPartLocationWrapper> local_dFUPartLocation = null;

    public ArrayOfDFUPartLocationWrapper() {}

    public ArrayOfDFUPartLocationWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation arrayofdfupartlocation)
    {
        copy( arrayofdfupartlocation );
    }
    public ArrayOfDFUPartLocationWrapper( List<DFUPartLocationWrapper> _dFUPartLocation )
    {
        this.local_dFUPartLocation = _dFUPartLocation;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUPartLocation() != null)
        {
            this.local_dFUPartLocation = new ArrayList<DFUPartLocationWrapper>();
            for ( int i = 0; i < raw.getDFUPartLocation().length; i++)
            {
                this.local_dFUPartLocation.add(new DFUPartLocationWrapper(raw.getDFUPartLocation()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUPartLocationWrapper [" + "dFUPartLocation = " + local_dFUPartLocation + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation();
        if (this.local_dFUPartLocation!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUPartLocation[this.local_dFUPartLocation.size()];
            for ( int i = 0; i < this.local_dFUPartLocation.size(); i++)
            {
                arr[i] = this.local_dFUPartLocation.get(i) .getRaw();
            }
            raw.setDFUPartLocation(arr);
        }
        return raw;
    }


    public void setDFUPartLocation( List<DFUPartLocationWrapper> _dFUPartLocation )
    {
        this.local_dFUPartLocation = _dFUPartLocation;
    }
    public List<DFUPartLocationWrapper> getDFUPartLocation( )
    {
        return this.local_dFUPartLocation;
    }
}