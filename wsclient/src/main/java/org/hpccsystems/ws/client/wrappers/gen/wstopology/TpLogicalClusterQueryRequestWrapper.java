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
 * Class name: TpLogicalClusterQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.477Z
 */
public class TpLogicalClusterQueryRequestWrapper
{
    protected String local_eclServerQueue;
    protected RoxieQueueFilterWrapper local_roxieQueueFilter;

    public TpLogicalClusterQueryRequestWrapper() {}

    public TpLogicalClusterQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest tplogicalclusterqueryrequest)
    {
        copy( tplogicalclusterqueryrequest );
    }
    public TpLogicalClusterQueryRequestWrapper( String _eclServerQueue, RoxieQueueFilterWrapper _roxieQueueFilter )
    {
        this.local_eclServerQueue = _eclServerQueue;
        this.local_roxieQueueFilter = _roxieQueueFilter;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest raw )
    {
        if (raw == null)
            return;

        this.local_eclServerQueue = raw.getEclServerQueue();
        if (raw.getRoxieQueueFilter() != null)
            this.local_roxieQueueFilter = new RoxieQueueFilterWrapper( raw.getRoxieQueueFilter());

    }

    @Override
    public String toString()
    {
        return "TpLogicalClusterQueryRequestWrapper [" + "eclServerQueue = " + local_eclServerQueue + ", " + "roxieQueueFilter = " + local_roxieQueueFilter + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest();
        raw.setEclServerQueue( local_eclServerQueue);
        if (local_roxieQueueFilter != null)
            raw.setRoxieQueueFilter( local_roxieQueueFilter.getRaw());
        return raw;
    }


    public void setEclServerQueue( String _eclServerQueue )
    {
        this.local_eclServerQueue = _eclServerQueue;
    }
    public String getEclServerQueue( )
    {
        return this.local_eclServerQueue;
    }
    public void setRoxieQueueFilter( RoxieQueueFilterWrapper _roxieQueueFilter )
    {
        this.local_roxieQueueFilter = _roxieQueueFilter;
    }
    public RoxieQueueFilterWrapper getRoxieQueueFilter( )
    {
        return this.local_roxieQueueFilter;
    }
}