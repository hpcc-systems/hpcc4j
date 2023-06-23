package org.hpccsystems.ws.client.wrappers.gen.wsresources;

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
 * Class name: ArrayOfHPCCQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfHPCCQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class ArrayOfHPCCQueueWrapper
{
    protected List<HPCCQueueWrapper> local_hPCCQueue = null;

    public ArrayOfHPCCQueueWrapper() {}

    public ArrayOfHPCCQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfHPCCQueue arrayofhpccqueue)
    {
        copy( arrayofhpccqueue );
    }
    public ArrayOfHPCCQueueWrapper( List<HPCCQueueWrapper> _hPCCQueue )
    {
        this.local_hPCCQueue = _hPCCQueue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfHPCCQueue raw )
    {
        if (raw == null)
            return;

        if (raw.getHPCCQueue() != null)
        {
            this.local_hPCCQueue = new ArrayList<HPCCQueueWrapper>();
            for ( int i = 0; i < raw.getHPCCQueue().length; i++)
            {
                this.local_hPCCQueue.add(new HPCCQueueWrapper(raw.getHPCCQueue()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfHPCCQueueWrapper [" + "hPCCQueue = " + local_hPCCQueue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfHPCCQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfHPCCQueue raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfHPCCQueue();
        if (this.local_hPCCQueue!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue[] arr = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueue[this.local_hPCCQueue.size()];
            for ( int i = 0; i < this.local_hPCCQueue.size(); i++)
            {
                arr[i] = this.local_hPCCQueue.get(i) .getRaw();
            }
            raw.setHPCCQueue(arr);
        }
        return raw;
    }


    public void setHPCCQueue( List<HPCCQueueWrapper> _hPCCQueue )
    {
        this.local_hPCCQueue = _hPCCQueue;
    }
    public List<HPCCQueueWrapper> getHPCCQueue( )
    {
        return this.local_hPCCQueue;
    }
}