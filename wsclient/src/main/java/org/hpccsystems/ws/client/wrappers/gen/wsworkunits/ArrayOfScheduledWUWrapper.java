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
 * Class name: ArrayOfScheduledWUWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfScheduledWU
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.791Z
 */
public class ArrayOfScheduledWUWrapper
{
    protected List<ScheduledWUWrapper> local_scheduledWU = null;

    public ArrayOfScheduledWUWrapper() {}

    public ArrayOfScheduledWUWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfScheduledWU arrayofscheduledwu)
    {
        copy( arrayofscheduledwu );
    }
    public ArrayOfScheduledWUWrapper( List<ScheduledWUWrapper> _scheduledWU )
    {
        this.local_scheduledWU = _scheduledWU;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfScheduledWU raw )
    {
        if (raw == null)
            return;

        if (raw.getScheduledWU() != null)
        {
            this.local_scheduledWU = new ArrayList<ScheduledWUWrapper>();
            for ( int i = 0; i < raw.getScheduledWU().length; i++)
            {
                this.local_scheduledWU.add(new ScheduledWUWrapper(raw.getScheduledWU()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfScheduledWUWrapper [" + "scheduledWU = " + local_scheduledWU + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfScheduledWU getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfScheduledWU raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfScheduledWU();
        if (this.local_scheduledWU!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU[this.local_scheduledWU.size()];
            for ( int i = 0; i < this.local_scheduledWU.size(); i++)
            {
                arr[i] = this.local_scheduledWU.get(i) .getRaw();
            }
            raw.setScheduledWU(arr);
        }
        return raw;
    }


    public void setScheduledWU( List<ScheduledWUWrapper> _scheduledWU )
    {
        this.local_scheduledWU = _scheduledWU;
    }
    public List<ScheduledWUWrapper> getScheduledWU( )
    {
        return this.local_scheduledWU;
    }
}