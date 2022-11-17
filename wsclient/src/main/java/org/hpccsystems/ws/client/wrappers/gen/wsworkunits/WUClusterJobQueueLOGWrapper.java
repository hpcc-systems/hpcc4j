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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUClusterJobQueueLOGWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_83.WUClusterJobQueueLOG
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2021-09-30T21:52:48.459Z
 */
public class WUClusterJobQueueLOGWrapper
{
    protected String local_cluster;
    protected String local_startDate;
    protected String local_endDate;

    public WUClusterJobQueueLOGWrapper() {}

    public WUClusterJobQueueLOGWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobQueueLOG wuclusterjobqueuelog)
    {
        copy( wuclusterjobqueuelog );
    }
    public WUClusterJobQueueLOGWrapper( String _cluster, String _startDate, String _endDate )
    {
        this.local_cluster = _cluster;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobQueueLOG raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();

    }

    @Override
    public String toString()
    {
        return "WUClusterJobQueueLOGWrapper [" + "cluster = " + local_cluster + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobQueueLOG getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobQueueLOG raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobQueueLOG();
        raw.setCluster( local_cluster);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        return raw;
    }


    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setStartDate( String _startDate )
    {
        this.local_startDate = _startDate;
    }
    public String getStartDate( )
    {
        return this.local_startDate;
    }
    public void setEndDate( String _endDate )
    {
        this.local_endDate = _endDate;
    }
    public String getEndDate( )
    {
        return this.local_endDate;
    }
}