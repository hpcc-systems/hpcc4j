package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: ArrayOfCheckinAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckinAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfCheckinAttributeRequestWrapper
{
    protected List<CheckinAttributeRequestWrapper> local_checkinAttributeRequest = null;

    public ArrayOfCheckinAttributeRequestWrapper() {}

    public ArrayOfCheckinAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckinAttributeRequest arrayofcheckinattributerequest)
    {
        copy( arrayofcheckinattributerequest );
    }
    public ArrayOfCheckinAttributeRequestWrapper( List<CheckinAttributeRequestWrapper> _checkinAttributeRequest )
    {
        this.local_checkinAttributeRequest = _checkinAttributeRequest;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckinAttributeRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getCheckinAttributeRequest() != null)
        {
            this.local_checkinAttributeRequest = new ArrayList<CheckinAttributeRequestWrapper>();
            for ( int i = 0; i < raw.getCheckinAttributeRequest().length; i++)
            {
                this.local_checkinAttributeRequest.add(new CheckinAttributeRequestWrapper(raw.getCheckinAttributeRequest()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfCheckinAttributeRequestWrapper [" + "checkinAttributeRequest = " + local_checkinAttributeRequest + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckinAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckinAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfCheckinAttributeRequest();
        if (this.local_checkinAttributeRequest!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest[this.local_checkinAttributeRequest.size()];
            for ( int i = 0; i < this.local_checkinAttributeRequest.size(); i++)
            {
                arr[i] = this.local_checkinAttributeRequest.get(i) .getRaw();
            }
            raw.setCheckinAttributeRequest(arr);
        }
        return raw;
    }


    public void setCheckinAttributeRequest( List<CheckinAttributeRequestWrapper> _checkinAttributeRequest )
    {
        this.local_checkinAttributeRequest = _checkinAttributeRequest;
    }
    public List<CheckinAttributeRequestWrapper> getCheckinAttributeRequest( )
    {
        return this.local_checkinAttributeRequest;
    }
}