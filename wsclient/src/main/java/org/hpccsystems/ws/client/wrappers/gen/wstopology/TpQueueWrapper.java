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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TpQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpQueueWrapper
{
    protected String local_name;
    protected String local_workUnit;

    public TpQueueWrapper() {}

    public TpQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpQueue tpqueue)
    {
        copy( tpqueue );
    }
    public TpQueueWrapper( String _name, String _workUnit )
    {
        this.local_name = _name;
        this.local_workUnit = _workUnit;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpQueue raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_workUnit = raw.getWorkUnit();

    }

    @Override
    public String toString()
    {
        return "TpQueueWrapper [" + "name = " + local_name + ", " + "workUnit = " + local_workUnit + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpQueue raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpQueue();
        raw.setName( local_name);
        raw.setWorkUnit( local_workUnit);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setWorkUnit( String _workUnit )
    {
        this.local_workUnit = _workUnit;
    }
    public String getWorkUnit( )
    {
        return this.local_workUnit;
    }
}