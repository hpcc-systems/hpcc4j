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
 * Class name: WUs_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUs_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.998Z
 */
public class WUs_type0Wrapper
{
    protected List<ResubmittedWUWrapper> local_wU = null;

    public WUs_type0Wrapper() {}

    public WUs_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUs_type0 wus_type0)
    {
        copy( wus_type0 );
    }
    public WUs_type0Wrapper( List<ResubmittedWUWrapper> _wU )
    {
        this.local_wU = _wU;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUs_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getWU() != null)
        {
            this.local_wU = new ArrayList<ResubmittedWUWrapper>();
            for ( int i = 0; i < raw.getWU().length; i++)
            {
                this.local_wU.add(new ResubmittedWUWrapper(raw.getWU()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "WUs_type0Wrapper [" + "wU = " + local_wU + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUs_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUs_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUs_type0();
        if (this.local_wU!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ResubmittedWU[this.local_wU.size()];
            for ( int i = 0; i < this.local_wU.size(); i++)
            {
                arr[i] = this.local_wU.get(i) .getRaw();
            }
            raw.setWU(arr);
        }
        return raw;
    }


    public void setWU( List<ResubmittedWUWrapper> _wU )
    {
        this.local_wU = _wU;
    }
    public List<ResubmittedWUWrapper> getWU( )
    {
        return this.local_wU;
    }
}