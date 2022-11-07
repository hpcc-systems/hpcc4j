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
 * Class name: WUQueryGetSummaryStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.969Z
 */
public class WUQueryGetSummaryStatsWrapper
{
    protected String local_target;
    protected String local_queryId;
    protected String local_fromTime;
    protected String local_toTime;
    protected boolean local_includeRawStats;

    public WUQueryGetSummaryStatsWrapper() {}

    public WUQueryGetSummaryStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStats wuquerygetsummarystats)
    {
        copy( wuquerygetsummarystats );
    }
    public WUQueryGetSummaryStatsWrapper( String _target, String _queryId, String _fromTime, String _toTime, boolean _includeRawStats )
    {
        this.local_target = _target;
        this.local_queryId = _queryId;
        this.local_fromTime = _fromTime;
        this.local_toTime = _toTime;
        this.local_includeRawStats = _includeRawStats;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStats raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_queryId = raw.getQueryId();
        this.local_fromTime = raw.getFromTime();
        this.local_toTime = raw.getToTime();
        this.local_includeRawStats = raw.getIncludeRawStats();

    }

    @Override
    public String toString()
    {
        return "WUQueryGetSummaryStatsWrapper [" + "target = " + local_target + ", " + "queryId = " + local_queryId + ", " + "fromTime = " + local_fromTime + ", " + "toTime = " + local_toTime + ", " + "includeRawStats = " + local_includeRawStats + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStats();
        raw.setTarget( local_target);
        raw.setQueryId( local_queryId);
        raw.setFromTime( local_fromTime);
        raw.setToTime( local_toTime);
        raw.setIncludeRawStats( local_includeRawStats);
        return raw;
    }


    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setFromTime( String _fromTime )
    {
        this.local_fromTime = _fromTime;
    }
    public String getFromTime( )
    {
        return this.local_fromTime;
    }
    public void setToTime( String _toTime )
    {
        this.local_toTime = _toTime;
    }
    public String getToTime( )
    {
        return this.local_toTime;
    }
    public void setIncludeRawStats( boolean _includeRawStats )
    {
        this.local_includeRawStats = _includeRawStats;
    }
    public boolean getIncludeRawStats( )
    {
        return this.local_includeRawStats;
    }
}