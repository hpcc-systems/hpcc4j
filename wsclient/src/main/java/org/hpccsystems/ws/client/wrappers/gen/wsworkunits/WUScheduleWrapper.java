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
import java.util.Calendar;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUScheduleWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSchedule
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.991Z
 */
public class WUScheduleWrapper
{
    protected String local_wuid;
    protected String local_cluster;
    protected String local_queue;
    protected String local_snapshot;
    protected Calendar local_when;
    protected int local_maxRunTime;

    public WUScheduleWrapper() {}

    public WUScheduleWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSchedule wuschedule)
    {
        copy( wuschedule );
    }
    public WUScheduleWrapper( String _wuid, String _cluster, String _queue, String _snapshot, Calendar _when, int _maxRunTime )
    {
        this.local_wuid = _wuid;
        this.local_cluster = _cluster;
        this.local_queue = _queue;
        this.local_snapshot = _snapshot;
        this.local_when = _when;
        this.local_maxRunTime = _maxRunTime;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSchedule raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_cluster = raw.getCluster();
        this.local_queue = raw.getQueue();
        this.local_snapshot = raw.getSnapshot();
        this.local_when = raw.getWhen();
        this.local_maxRunTime = raw.getMaxRunTime();

    }

    @Override
    public String toString()
    {
        return "WUScheduleWrapper [" + "wuid = " + local_wuid + ", " + "cluster = " + local_cluster + ", " + "queue = " + local_queue + ", " + "snapshot = " + local_snapshot + ", " + "when = " + local_when + ", " + "maxRunTime = " + local_maxRunTime + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSchedule getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSchedule raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSchedule();
        raw.setWuid( local_wuid);
        raw.setCluster( local_cluster);
        raw.setQueue( local_queue);
        raw.setSnapshot( local_snapshot);
        raw.setWhen( local_when);
        raw.setMaxRunTime( local_maxRunTime);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setQueue( String _queue )
    {
        this.local_queue = _queue;
    }
    public String getQueue( )
    {
        return this.local_queue;
    }
    public void setSnapshot( String _snapshot )
    {
        this.local_snapshot = _snapshot;
    }
    public String getSnapshot( )
    {
        return this.local_snapshot;
    }
    public void setWhen( Calendar _when )
    {
        this.local_when = _when;
    }
    public Calendar getWhen( )
    {
        return this.local_when;
    }
    public void setMaxRunTime( int _maxRunTime )
    {
        this.local_maxRunTime = _maxRunTime;
    }
    public int getMaxRunTime( )
    {
        return this.local_maxRunTime;
    }
}