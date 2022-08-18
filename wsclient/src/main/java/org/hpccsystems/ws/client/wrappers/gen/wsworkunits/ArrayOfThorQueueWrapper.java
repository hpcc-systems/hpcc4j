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
 * Class name: ArrayOfThorQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfThorQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.793Z
 */
public class ArrayOfThorQueueWrapper
{
    protected List<ThorQueueWrapper> local_thorQueue = null;

    public ArrayOfThorQueueWrapper() {}

    public ArrayOfThorQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfThorQueue arrayofthorqueue)
    {
        copy( arrayofthorqueue );
    }
    public ArrayOfThorQueueWrapper( List<ThorQueueWrapper> _thorQueue )
    {
        this.local_thorQueue = _thorQueue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfThorQueue raw )
    {
        if (raw == null)
            return;

        if (raw.getThorQueue() != null)
        {
            this.local_thorQueue = new ArrayList<ThorQueueWrapper>();
            for ( int i = 0; i < raw.getThorQueue().length; i++)
            {
                this.local_thorQueue.add(new ThorQueueWrapper(raw.getThorQueue()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfThorQueueWrapper [" + "thorQueue = " + local_thorQueue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfThorQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfThorQueue raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfThorQueue();
        if (this.local_thorQueue!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue[this.local_thorQueue.size()];
            for ( int i = 0; i < this.local_thorQueue.size(); i++)
            {
                arr[i] = this.local_thorQueue.get(i) .getRaw();
            }
            raw.setThorQueue(arr);
        }
        return raw;
    }


    public void setThorQueue( List<ThorQueueWrapper> _thorQueue )
    {
        this.local_thorQueue = _thorQueue;
    }
    public List<ThorQueueWrapper> getThorQueue( )
    {
        return this.local_thorQueue;
    }
}