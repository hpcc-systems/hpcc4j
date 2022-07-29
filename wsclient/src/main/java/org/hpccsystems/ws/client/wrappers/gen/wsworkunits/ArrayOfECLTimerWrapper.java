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
 * Class name: ArrayOfECLTimerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.781Z
 */
public class ArrayOfECLTimerWrapper
{
    protected List<ECLTimerWrapper> local_eCLTimer = null;

    public ArrayOfECLTimerWrapper() {}

    public ArrayOfECLTimerWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimer arrayofecltimer)
    {
        copy( arrayofecltimer );
    }
    public ArrayOfECLTimerWrapper( List<ECLTimerWrapper> _eCLTimer )
    {
        this.local_eCLTimer = _eCLTimer;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimer raw )
    {
        if (raw == null)
            return;

        if (raw.getECLTimer() != null)
        {
            this.local_eCLTimer = new ArrayList<ECLTimerWrapper>();
            for ( int i = 0; i < raw.getECLTimer().length; i++)
            {
                this.local_eCLTimer.add(new ECLTimerWrapper(raw.getECLTimer()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLTimerWrapper [" + "eCLTimer = " + local_eCLTimer + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimer raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLTimer();
        if (this.local_eCLTimer!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer[this.local_eCLTimer.size()];
            for ( int i = 0; i < this.local_eCLTimer.size(); i++)
            {
                arr[i] = this.local_eCLTimer.get(i) .getRaw();
            }
            raw.setECLTimer(arr);
        }
        return raw;
    }


    public void setECLTimer( List<ECLTimerWrapper> _eCLTimer )
    {
        this.local_eCLTimer = _eCLTimer;
    }
    public List<ECLTimerWrapper> getECLTimer( )
    {
        return this.local_eCLTimer;
    }
}