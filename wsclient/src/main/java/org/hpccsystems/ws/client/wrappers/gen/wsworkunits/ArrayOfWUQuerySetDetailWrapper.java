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
 * Class name: ArrayOfWUQuerySetDetailWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUQuerySetDetail
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.796Z
 */
public class ArrayOfWUQuerySetDetailWrapper
{
    protected List<WUQuerySetDetailWrapper> local_wUQuerySetDetail = null;

    public ArrayOfWUQuerySetDetailWrapper() {}

    public ArrayOfWUQuerySetDetailWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUQuerySetDetail arrayofwuquerysetdetail)
    {
        copy( arrayofwuquerysetdetail );
    }
    public ArrayOfWUQuerySetDetailWrapper( List<WUQuerySetDetailWrapper> _wUQuerySetDetail )
    {
        this.local_wUQuerySetDetail = _wUQuerySetDetail;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUQuerySetDetail raw )
    {
        if (raw == null)
            return;

        if (raw.getWUQuerySetDetail() != null)
        {
            this.local_wUQuerySetDetail = new ArrayList<WUQuerySetDetailWrapper>();
            for ( int i = 0; i < raw.getWUQuerySetDetail().length; i++)
            {
                this.local_wUQuerySetDetail.add(new WUQuerySetDetailWrapper(raw.getWUQuerySetDetail()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfWUQuerySetDetailWrapper [" + "wUQuerySetDetail = " + local_wUQuerySetDetail + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUQuerySetDetail getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUQuerySetDetail raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUQuerySetDetail();
        if (this.local_wUQuerySetDetail!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail[this.local_wUQuerySetDetail.size()];
            for ( int i = 0; i < this.local_wUQuerySetDetail.size(); i++)
            {
                arr[i] = this.local_wUQuerySetDetail.get(i) .getRaw();
            }
            raw.setWUQuerySetDetail(arr);
        }
        return raw;
    }


    public void setWUQuerySetDetail( List<WUQuerySetDetailWrapper> _wUQuerySetDetail )
    {
        this.local_wUQuerySetDetail = _wUQuerySetDetail;
    }
    public List<WUQuerySetDetailWrapper> getWUQuerySetDetail( )
    {
        return this.local_wUQuerySetDetail;
    }
}