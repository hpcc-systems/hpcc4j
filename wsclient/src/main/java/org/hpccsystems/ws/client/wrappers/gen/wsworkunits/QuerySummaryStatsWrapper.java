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
 * Class name: QuerySummaryStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.858Z
 */
public class QuerySummaryStatsWrapper
{
    protected String local_endpoint;
    protected String local_status;
    protected String local_startTime;
    protected String local_endTime;
    protected int local_countTotal;
    protected int local_countFailed;
    protected int local_averageSlavesReplyLen;
    protected long local_averageBytesOut;
    protected long local_sizeAvgPeakMemory;
    protected long local_timeAvgTotalExecuteMinutes;
    protected long local_timeMinTotalExecuteMinutes;
    protected long local_timeMaxTotalExecuteMinutes;
    protected long local_percentile97;
    protected boolean local_percentile97Estimate;

    public QuerySummaryStatsWrapper() {}

    public QuerySummaryStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats querysummarystats)
    {
        copy( querysummarystats );
    }
    public QuerySummaryStatsWrapper( String _endpoint, String _status, String _startTime, String _endTime, int _countTotal, int _countFailed, int _averageSlavesReplyLen, long _averageBytesOut, long _sizeAvgPeakMemory, long _timeAvgTotalExecuteMinutes, long _timeMinTotalExecuteMinutes, long _timeMaxTotalExecuteMinutes, long _percentile97, boolean _percentile97Estimate )
    {
        this.local_endpoint = _endpoint;
        this.local_status = _status;
        this.local_startTime = _startTime;
        this.local_endTime = _endTime;
        this.local_countTotal = _countTotal;
        this.local_countFailed = _countFailed;
        this.local_averageSlavesReplyLen = _averageSlavesReplyLen;
        this.local_averageBytesOut = _averageBytesOut;
        this.local_sizeAvgPeakMemory = _sizeAvgPeakMemory;
        this.local_timeAvgTotalExecuteMinutes = _timeAvgTotalExecuteMinutes;
        this.local_timeMinTotalExecuteMinutes = _timeMinTotalExecuteMinutes;
        this.local_timeMaxTotalExecuteMinutes = _timeMaxTotalExecuteMinutes;
        this.local_percentile97 = _percentile97;
        this.local_percentile97Estimate = _percentile97Estimate;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats raw )
    {
        if (raw == null)
            return;

        this.local_endpoint = raw.getEndpoint();
        this.local_status = raw.getStatus();
        this.local_startTime = raw.getStartTime();
        this.local_endTime = raw.getEndTime();
        this.local_countTotal = raw.getCountTotal();
        this.local_countFailed = raw.getCountFailed();
        this.local_averageSlavesReplyLen = raw.getAverageSlavesReplyLen();
        this.local_averageBytesOut = raw.getAverageBytesOut();
        this.local_sizeAvgPeakMemory = raw.getSizeAvgPeakMemory();
        this.local_timeAvgTotalExecuteMinutes = raw.getTimeAvgTotalExecuteMinutes();
        this.local_timeMinTotalExecuteMinutes = raw.getTimeMinTotalExecuteMinutes();
        this.local_timeMaxTotalExecuteMinutes = raw.getTimeMaxTotalExecuteMinutes();
        this.local_percentile97 = raw.getPercentile97();
        this.local_percentile97Estimate = raw.getPercentile97Estimate();

    }

    @Override
    public String toString()
    {
        return "QuerySummaryStatsWrapper [" + "endpoint = " + local_endpoint + ", " + "status = " + local_status + ", " + "startTime = " + local_startTime + ", " + "endTime = " + local_endTime + ", " + "countTotal = " + local_countTotal + ", " + "countFailed = " + local_countFailed + ", " + "averageSlavesReplyLen = " + local_averageSlavesReplyLen + ", " + "averageBytesOut = " + local_averageBytesOut + ", " + "sizeAvgPeakMemory = " + local_sizeAvgPeakMemory + ", " + "timeAvgTotalExecuteMinutes = " + local_timeAvgTotalExecuteMinutes + ", " + "timeMinTotalExecuteMinutes = " + local_timeMinTotalExecuteMinutes + ", " + "timeMaxTotalExecuteMinutes = " + local_timeMaxTotalExecuteMinutes + ", " + "percentile97 = " + local_percentile97 + ", " + "percentile97Estimate = " + local_percentile97Estimate + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats();
        raw.setEndpoint( local_endpoint);
        raw.setStatus( local_status);
        raw.setStartTime( local_startTime);
        raw.setEndTime( local_endTime);
        raw.setCountTotal( local_countTotal);
        raw.setCountFailed( local_countFailed);
        raw.setAverageSlavesReplyLen( local_averageSlavesReplyLen);
        raw.setAverageBytesOut( local_averageBytesOut);
        raw.setSizeAvgPeakMemory( local_sizeAvgPeakMemory);
        raw.setTimeAvgTotalExecuteMinutes( local_timeAvgTotalExecuteMinutes);
        raw.setTimeMinTotalExecuteMinutes( local_timeMinTotalExecuteMinutes);
        raw.setTimeMaxTotalExecuteMinutes( local_timeMaxTotalExecuteMinutes);
        raw.setPercentile97( local_percentile97);
        raw.setPercentile97Estimate( local_percentile97Estimate);
        return raw;
    }


    public void setEndpoint( String _endpoint )
    {
        this.local_endpoint = _endpoint;
    }
    public String getEndpoint( )
    {
        return this.local_endpoint;
    }
    public void setStatus( String _status )
    {
        this.local_status = _status;
    }
    public String getStatus( )
    {
        return this.local_status;
    }
    public void setStartTime( String _startTime )
    {
        this.local_startTime = _startTime;
    }
    public String getStartTime( )
    {
        return this.local_startTime;
    }
    public void setEndTime( String _endTime )
    {
        this.local_endTime = _endTime;
    }
    public String getEndTime( )
    {
        return this.local_endTime;
    }
    public void setCountTotal( int _countTotal )
    {
        this.local_countTotal = _countTotal;
    }
    public int getCountTotal( )
    {
        return this.local_countTotal;
    }
    public void setCountFailed( int _countFailed )
    {
        this.local_countFailed = _countFailed;
    }
    public int getCountFailed( )
    {
        return this.local_countFailed;
    }
    public void setAverageSlavesReplyLen( int _averageSlavesReplyLen )
    {
        this.local_averageSlavesReplyLen = _averageSlavesReplyLen;
    }
    public int getAverageSlavesReplyLen( )
    {
        return this.local_averageSlavesReplyLen;
    }
    public void setAverageBytesOut( long _averageBytesOut )
    {
        this.local_averageBytesOut = _averageBytesOut;
    }
    public long getAverageBytesOut( )
    {
        return this.local_averageBytesOut;
    }
    public void setSizeAvgPeakMemory( long _sizeAvgPeakMemory )
    {
        this.local_sizeAvgPeakMemory = _sizeAvgPeakMemory;
    }
    public long getSizeAvgPeakMemory( )
    {
        return this.local_sizeAvgPeakMemory;
    }
    public void setTimeAvgTotalExecuteMinutes( long _timeAvgTotalExecuteMinutes )
    {
        this.local_timeAvgTotalExecuteMinutes = _timeAvgTotalExecuteMinutes;
    }
    public long getTimeAvgTotalExecuteMinutes( )
    {
        return this.local_timeAvgTotalExecuteMinutes;
    }
    public void setTimeMinTotalExecuteMinutes( long _timeMinTotalExecuteMinutes )
    {
        this.local_timeMinTotalExecuteMinutes = _timeMinTotalExecuteMinutes;
    }
    public long getTimeMinTotalExecuteMinutes( )
    {
        return this.local_timeMinTotalExecuteMinutes;
    }
    public void setTimeMaxTotalExecuteMinutes( long _timeMaxTotalExecuteMinutes )
    {
        this.local_timeMaxTotalExecuteMinutes = _timeMaxTotalExecuteMinutes;
    }
    public long getTimeMaxTotalExecuteMinutes( )
    {
        return this.local_timeMaxTotalExecuteMinutes;
    }
    public void setPercentile97( long _percentile97 )
    {
        this.local_percentile97 = _percentile97;
    }
    public long getPercentile97( )
    {
        return this.local_percentile97;
    }
    public void setPercentile97Estimate( boolean _percentile97Estimate )
    {
        this.local_percentile97Estimate = _percentile97Estimate;
    }
    public boolean getPercentile97Estimate( )
    {
        return this.local_percentile97Estimate;
    }
}