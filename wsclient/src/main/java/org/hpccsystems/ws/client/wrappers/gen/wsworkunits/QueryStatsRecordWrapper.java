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
 * Class name: QueryStatsRecordWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.857Z
 */
public class QueryStatsRecordWrapper
{
    protected String local_startTime;
    protected long local_elapsedTimeMs;
    protected long local_memoryUsed;
    protected long local_bytesOut;
    protected int local_slavesReplyLen;
    protected boolean local_failed;

    public QueryStatsRecordWrapper() {}

    public QueryStatsRecordWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord querystatsrecord)
    {
        copy( querystatsrecord );
    }
    public QueryStatsRecordWrapper( String _startTime, long _elapsedTimeMs, long _memoryUsed, long _bytesOut, int _slavesReplyLen, boolean _failed )
    {
        this.local_startTime = _startTime;
        this.local_elapsedTimeMs = _elapsedTimeMs;
        this.local_memoryUsed = _memoryUsed;
        this.local_bytesOut = _bytesOut;
        this.local_slavesReplyLen = _slavesReplyLen;
        this.local_failed = _failed;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord raw )
    {
        if (raw == null)
            return;

        this.local_startTime = raw.getStartTime();
        this.local_elapsedTimeMs = raw.getElapsedTimeMs();
        this.local_memoryUsed = raw.getMemoryUsed();
        this.local_bytesOut = raw.getBytesOut();
        this.local_slavesReplyLen = raw.getSlavesReplyLen();
        this.local_failed = raw.getFailed();

    }

    @Override
    public String toString()
    {
        return "QueryStatsRecordWrapper [" + "startTime = " + local_startTime + ", " + "elapsedTimeMs = " + local_elapsedTimeMs + ", " + "memoryUsed = " + local_memoryUsed + ", " + "bytesOut = " + local_bytesOut + ", " + "slavesReplyLen = " + local_slavesReplyLen + ", " + "failed = " + local_failed + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord();
        raw.setStartTime( local_startTime);
        raw.setElapsedTimeMs( local_elapsedTimeMs);
        raw.setMemoryUsed( local_memoryUsed);
        raw.setBytesOut( local_bytesOut);
        raw.setSlavesReplyLen( local_slavesReplyLen);
        raw.setFailed( local_failed);
        return raw;
    }


    public void setStartTime( String _startTime )
    {
        this.local_startTime = _startTime;
    }
    public String getStartTime( )
    {
        return this.local_startTime;
    }
    public void setElapsedTimeMs( long _elapsedTimeMs )
    {
        this.local_elapsedTimeMs = _elapsedTimeMs;
    }
    public long getElapsedTimeMs( )
    {
        return this.local_elapsedTimeMs;
    }
    public void setMemoryUsed( long _memoryUsed )
    {
        this.local_memoryUsed = _memoryUsed;
    }
    public long getMemoryUsed( )
    {
        return this.local_memoryUsed;
    }
    public void setBytesOut( long _bytesOut )
    {
        this.local_bytesOut = _bytesOut;
    }
    public long getBytesOut( )
    {
        return this.local_bytesOut;
    }
    public void setSlavesReplyLen( int _slavesReplyLen )
    {
        this.local_slavesReplyLen = _slavesReplyLen;
    }
    public int getSlavesReplyLen( )
    {
        return this.local_slavesReplyLen;
    }
    public void setFailed( boolean _failed )
    {
        this.local_failed = _failed;
    }
    public boolean getFailed( )
    {
        return this.local_failed;
    }
}