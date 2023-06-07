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
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TargetQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class TargetQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfHPCCQueueWrapper local_queues;
    protected List<String> local_roxies = null;

    public TargetQueryResponseWrapper() {}

    public TargetQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse targetqueryresponse)
    {
        copy( targetqueryresponse );
    }
    public TargetQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfHPCCQueueWrapper _queues, List<String> _roxies )
    {
        this.local_exceptions = _exceptions;
        this.local_queues = _queues;
        this.local_roxies = _roxies;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getQueues() != null)
            this.local_queues = new ArrayOfHPCCQueueWrapper( raw.getQueues());
        if (raw.getRoxies() != null && raw.getRoxies().getItem() != null)
        {
            this.local_roxies = new ArrayList<String>();
            for ( int i = 0; i < raw.getRoxies().getItem().length; i++)
            {
                this.local_roxies.add(new String(raw.getRoxies().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "TargetQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "queues = " + local_queues + ", " + "roxies = " + local_roxies + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_queues != null)
            raw.setQueues( local_queues.getRaw());
        if (this.local_roxies!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_roxies.size(); i++)
            {
                arr.addItem(this.local_roxies.get(i));
            }
            raw.setRoxies(arr);
        }
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setQueues( ArrayOfHPCCQueueWrapper _queues )
    {
        this.local_queues = _queues;
    }
    public ArrayOfHPCCQueueWrapper getQueues( )
    {
        return this.local_queues;
    }
    public void setRoxies( List<String> _roxies )
    {
        this.local_roxies = _roxies;
    }
    public List<String> getRoxies( )
    {
        return this.local_roxies;
    }
}