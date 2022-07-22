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
 * Class name: WUClusterJobSummaryXLSWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLS
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.886Z
 */
public class WUClusterJobSummaryXLSWrapper
{
    protected String local_cluster;
    protected String local_startDate;
    protected String local_endDate;
    protected boolean local_showAll;
    protected String local_businessStartTime;
    protected String local_businessEndTime;

    public WUClusterJobSummaryXLSWrapper() {}

    public WUClusterJobSummaryXLSWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLS wuclusterjobsummaryxls)
    {
        copy( wuclusterjobsummaryxls );
    }
    public WUClusterJobSummaryXLSWrapper( String _cluster, String _startDate, String _endDate, boolean _showAll, String _businessStartTime, String _businessEndTime )
    {
        this.local_cluster = _cluster;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_showAll = _showAll;
        this.local_businessStartTime = _businessStartTime;
        this.local_businessEndTime = _businessEndTime;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLS raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_showAll = raw.getShowAll();
        this.local_businessStartTime = raw.getBusinessStartTime();
        this.local_businessEndTime = raw.getBusinessEndTime();

    }

    @Override
    public String toString()
    {
        return "WUClusterJobSummaryXLSWrapper [" + "cluster = " + local_cluster + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "showAll = " + local_showAll + ", " + "businessStartTime = " + local_businessStartTime + ", " + "businessEndTime = " + local_businessEndTime + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLS getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLS raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLS();
        raw.setCluster( local_cluster);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setShowAll( local_showAll);
        raw.setBusinessStartTime( local_businessStartTime);
        raw.setBusinessEndTime( local_businessEndTime);
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
    public void setShowAll( boolean _showAll )
    {
        this.local_showAll = _showAll;
    }
    public boolean getShowAll( )
    {
        return this.local_showAll;
    }
    public void setBusinessStartTime( String _businessStartTime )
    {
        this.local_businessStartTime = _businessStartTime;
    }
    public String getBusinessStartTime( )
    {
        return this.local_businessStartTime;
    }
    public void setBusinessEndTime( String _businessEndTime )
    {
        this.local_businessEndTime = _businessEndTime;
    }
    public String getBusinessEndTime( )
    {
        return this.local_businessEndTime;
    }
}