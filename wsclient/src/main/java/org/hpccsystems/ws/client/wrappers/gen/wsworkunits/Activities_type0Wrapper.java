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
 * Class name: Activities_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Activities_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.754Z
 */
public class Activities_type0Wrapper
{
    protected List<WUDetailsActivityInfoWrapper> local_activity = null;

    public Activities_type0Wrapper() {}

    public Activities_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Activities_type0 activities_type0)
    {
        copy( activities_type0 );
    }
    public Activities_type0Wrapper( List<WUDetailsActivityInfoWrapper> _activity )
    {
        this.local_activity = _activity;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Activities_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getActivity() != null)
        {
            this.local_activity = new ArrayList<WUDetailsActivityInfoWrapper>();
            for ( int i = 0; i < raw.getActivity().length; i++)
            {
                this.local_activity.add(new WUDetailsActivityInfoWrapper(raw.getActivity()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Activities_type0Wrapper [" + "activity = " + local_activity + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Activities_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Activities_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Activities_type0();
        if (this.local_activity!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo[this.local_activity.size()];
            for ( int i = 0; i < this.local_activity.size(); i++)
            {
                arr[i] = this.local_activity.get(i) .getRaw();
            }
            raw.setActivity(arr);
        }
        return raw;
    }


    public void setActivity( List<WUDetailsActivityInfoWrapper> _activity )
    {
        this.local_activity = _activity;
    }
    public List<WUDetailsActivityInfoWrapper> getActivity( )
    {
        return this.local_activity;
    }
}