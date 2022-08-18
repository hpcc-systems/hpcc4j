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
 * Class name: ArrayOfECLJobWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLJob
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.778Z
 */
public class ArrayOfECLJobWrapper
{
    protected List<ECLJobWrapper> local_eCLJob = null;

    public ArrayOfECLJobWrapper() {}

    public ArrayOfECLJobWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLJob arrayofecljob)
    {
        copy( arrayofecljob );
    }
    public ArrayOfECLJobWrapper( List<ECLJobWrapper> _eCLJob )
    {
        this.local_eCLJob = _eCLJob;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLJob raw )
    {
        if (raw == null)
            return;

        if (raw.getECLJob() != null)
        {
            this.local_eCLJob = new ArrayList<ECLJobWrapper>();
            for ( int i = 0; i < raw.getECLJob().length; i++)
            {
                this.local_eCLJob.add(new ECLJobWrapper(raw.getECLJob()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLJobWrapper [" + "eCLJob = " + local_eCLJob + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLJob getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLJob raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLJob();
        if (this.local_eCLJob!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob[this.local_eCLJob.size()];
            for ( int i = 0; i < this.local_eCLJob.size(); i++)
            {
                arr[i] = this.local_eCLJob.get(i) .getRaw();
            }
            raw.setECLJob(arr);
        }
        return raw;
    }


    public void setECLJob( List<ECLJobWrapper> _eCLJob )
    {
        this.local_eCLJob = _eCLJob;
    }
    public List<ECLJobWrapper> getECLJob( )
    {
        return this.local_eCLJob;
    }
}