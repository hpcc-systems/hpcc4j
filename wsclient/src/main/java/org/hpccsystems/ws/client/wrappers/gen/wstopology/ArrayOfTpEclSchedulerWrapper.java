package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: ArrayOfTpEclSchedulerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class ArrayOfTpEclSchedulerWrapper
{
    protected List<TpEclSchedulerWrapper> local_tpEclScheduler = null;

    public ArrayOfTpEclSchedulerWrapper() {}

    public ArrayOfTpEclSchedulerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler arrayoftpeclscheduler)
    {
        copy( arrayoftpeclscheduler );
    }
    public ArrayOfTpEclSchedulerWrapper( List<TpEclSchedulerWrapper> _tpEclScheduler )
    {
        this.local_tpEclScheduler = _tpEclScheduler;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler raw )
    {
        if (raw == null)
            return;

        if (raw.getTpEclScheduler() != null)
        {
            this.local_tpEclScheduler = new ArrayList<TpEclSchedulerWrapper>();
            for ( int i = 0; i < raw.getTpEclScheduler().length; i++)
            {
                this.local_tpEclScheduler.add(new TpEclSchedulerWrapper(raw.getTpEclScheduler()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpEclSchedulerWrapper [" + "tpEclScheduler = " + local_tpEclScheduler + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler();
        if (this.local_tpEclScheduler!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEclScheduler[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEclScheduler[this.local_tpEclScheduler.size()];
            for ( int i = 0; i < this.local_tpEclScheduler.size(); i++)
            {
                arr[i] = this.local_tpEclScheduler.get(i) .getRaw();
            }
            raw.setTpEclScheduler(arr);
        }
        return raw;
    }


    public void setTpEclScheduler( List<TpEclSchedulerWrapper> _tpEclScheduler )
    {
        this.local_tpEclScheduler = _tpEclScheduler;
    }
    public List<TpEclSchedulerWrapper> getTpEclScheduler( )
    {
        return this.local_tpEclScheduler;
    }
}