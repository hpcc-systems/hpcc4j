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
 * Class name: WUGetDependancyTreesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTrees
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.915Z
 */
public class WUGetDependancyTreesWrapper
{
    protected String local_cluster;
    protected String local_queue;
    protected String local_snapshot;
    protected String local_items;
    protected String local_timeoutMilliSec;

    public WUGetDependancyTreesWrapper() {}

    public WUGetDependancyTreesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTrees wugetdependancytrees)
    {
        copy( wugetdependancytrees );
    }
    public WUGetDependancyTreesWrapper( String _cluster, String _queue, String _snapshot, String _items, String _timeoutMilliSec )
    {
        this.local_cluster = _cluster;
        this.local_queue = _queue;
        this.local_snapshot = _snapshot;
        this.local_items = _items;
        this.local_timeoutMilliSec = _timeoutMilliSec;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTrees raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_queue = raw.getQueue();
        this.local_snapshot = raw.getSnapshot();
        this.local_items = raw.getItems();
        this.local_timeoutMilliSec = raw.getTimeoutMilliSec();

    }

    @Override
    public String toString()
    {
        return "WUGetDependancyTreesWrapper [" + "cluster = " + local_cluster + ", " + "queue = " + local_queue + ", " + "snapshot = " + local_snapshot + ", " + "items = " + local_items + ", " + "timeoutMilliSec = " + local_timeoutMilliSec + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTrees getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTrees raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetDependancyTrees();
        raw.setCluster( local_cluster);
        raw.setQueue( local_queue);
        raw.setSnapshot( local_snapshot);
        raw.setItems( local_items);
        raw.setTimeoutMilliSec( local_timeoutMilliSec);
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
    public void setItems( String _items )
    {
        this.local_items = _items;
    }
    public String getItems( )
    {
        return this.local_items;
    }
    public void setTimeoutMilliSec( String _timeoutMilliSec )
    {
        this.local_timeoutMilliSec = _timeoutMilliSec;
    }
    public String getTimeoutMilliSec( )
    {
        return this.local_timeoutMilliSec;
    }
}