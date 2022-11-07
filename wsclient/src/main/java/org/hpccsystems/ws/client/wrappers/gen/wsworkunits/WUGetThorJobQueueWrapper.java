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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUGetThorJobQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.923Z
 */
public class WUGetThorJobQueueWrapper
{
    protected String local_cluster;
    protected String local_startDate;
    protected String local_endDate;
    protected UnsignedInt local_maxJobQueueItemsToReturn;

    public WUGetThorJobQueueWrapper() {}

    public WUGetThorJobQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueue wugetthorjobqueue)
    {
        copy( wugetthorjobqueue );
    }
    public WUGetThorJobQueueWrapper( String _cluster, String _startDate, String _endDate, UnsignedInt _maxJobQueueItemsToReturn )
    {
        this.local_cluster = _cluster;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_maxJobQueueItemsToReturn = _maxJobQueueItemsToReturn;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueue raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_maxJobQueueItemsToReturn = raw.getMaxJobQueueItemsToReturn();

    }

    @Override
    public String toString()
    {
        return "WUGetThorJobQueueWrapper [" + "cluster = " + local_cluster + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "maxJobQueueItemsToReturn = " + local_maxJobQueueItemsToReturn + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueue raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobQueue();
        raw.setCluster( local_cluster);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setMaxJobQueueItemsToReturn( local_maxJobQueueItemsToReturn);
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
    public void setMaxJobQueueItemsToReturn( UnsignedInt _maxJobQueueItemsToReturn )
    {
        this.local_maxJobQueueItemsToReturn = _maxJobQueueItemsToReturn;
    }
    public UnsignedInt getMaxJobQueueItemsToReturn( )
    {
        return this.local_maxJobQueueItemsToReturn;
    }
}