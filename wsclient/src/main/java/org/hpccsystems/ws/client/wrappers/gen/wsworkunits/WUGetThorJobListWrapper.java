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
 * Class name: WUGetThorJobListWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobList
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.922Z
 */
public class WUGetThorJobListWrapper
{
    protected String local_cluster;
    protected String local_startDate;
    protected String local_endDate;
    protected UnsignedInt local_maxJobsToReturn;

    public WUGetThorJobListWrapper() {}

    public WUGetThorJobListWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobList wugetthorjoblist)
    {
        copy( wugetthorjoblist );
    }
    public WUGetThorJobListWrapper( String _cluster, String _startDate, String _endDate, UnsignedInt _maxJobsToReturn )
    {
        this.local_cluster = _cluster;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_maxJobsToReturn = _maxJobsToReturn;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobList raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_maxJobsToReturn = raw.getMaxJobsToReturn();

    }

    @Override
    public String toString()
    {
        return "WUGetThorJobListWrapper [" + "cluster = " + local_cluster + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "maxJobsToReturn = " + local_maxJobsToReturn + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobList getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobList raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobList();
        raw.setCluster( local_cluster);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setMaxJobsToReturn( local_maxJobsToReturn);
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
    public void setMaxJobsToReturn( UnsignedInt _maxJobsToReturn )
    {
        this.local_maxJobsToReturn = _maxJobsToReturn;
    }
    public UnsignedInt getMaxJobsToReturn( )
    {
        return this.local_maxJobsToReturn;
    }
}