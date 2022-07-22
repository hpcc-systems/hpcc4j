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
 * Class name: WUSubmitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.995Z
 */
public class WUSubmitWrapper
{
    protected String local_wuid;
    protected String local_cluster;
    protected String local_queue;
    protected String local_snapshot;
    protected int local_maxRunTime;
    protected int local_maxCost;
    protected int local_blockTillFinishTimer;
    protected boolean local_syntaxCheck;
    protected boolean local_notifyCluster;

    public WUSubmitWrapper() {}

    public WUSubmitWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit wusubmit)
    {
        copy( wusubmit );
    }
    public WUSubmitWrapper( String _wuid, String _cluster, String _queue, String _snapshot, int _maxRunTime, int _maxCost, int _blockTillFinishTimer, boolean _syntaxCheck, boolean _notifyCluster )
    {
        this.local_wuid = _wuid;
        this.local_cluster = _cluster;
        this.local_queue = _queue;
        this.local_snapshot = _snapshot;
        this.local_maxRunTime = _maxRunTime;
        this.local_maxCost = _maxCost;
        this.local_blockTillFinishTimer = _blockTillFinishTimer;
        this.local_syntaxCheck = _syntaxCheck;
        this.local_notifyCluster = _notifyCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_cluster = raw.getCluster();
        this.local_queue = raw.getQueue();
        this.local_snapshot = raw.getSnapshot();
        this.local_maxRunTime = raw.getMaxRunTime();
        this.local_maxCost = raw.getMaxCost();
        this.local_blockTillFinishTimer = raw.getBlockTillFinishTimer();
        this.local_syntaxCheck = raw.getSyntaxCheck();
        this.local_notifyCluster = raw.getNotifyCluster();

    }

    @Override
    public String toString()
    {
        return "WUSubmitWrapper [" + "wuid = " + local_wuid + ", " + "cluster = " + local_cluster + ", " + "queue = " + local_queue + ", " + "snapshot = " + local_snapshot + ", " + "maxRunTime = " + local_maxRunTime + ", " + "maxCost = " + local_maxCost + ", " + "blockTillFinishTimer = " + local_blockTillFinishTimer + ", " + "syntaxCheck = " + local_syntaxCheck + ", " + "notifyCluster = " + local_notifyCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit();
        raw.setWuid( local_wuid);
        raw.setCluster( local_cluster);
        raw.setQueue( local_queue);
        raw.setSnapshot( local_snapshot);
        raw.setMaxRunTime( local_maxRunTime);
        raw.setMaxCost( local_maxCost);
        raw.setBlockTillFinishTimer( local_blockTillFinishTimer);
        raw.setSyntaxCheck( local_syntaxCheck);
        raw.setNotifyCluster( local_notifyCluster);
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
    public void setMaxRunTime( int _maxRunTime )
    {
        this.local_maxRunTime = _maxRunTime;
    }
    public int getMaxRunTime( )
    {
        return this.local_maxRunTime;
    }
    public void setMaxCost( int _maxCost )
    {
        this.local_maxCost = _maxCost;
    }
    public int getMaxCost( )
    {
        return this.local_maxCost;
    }
    public void setBlockTillFinishTimer( int _blockTillFinishTimer )
    {
        this.local_blockTillFinishTimer = _blockTillFinishTimer;
    }
    public int getBlockTillFinishTimer( )
    {
        return this.local_blockTillFinishTimer;
    }
    public void setSyntaxCheck( boolean _syntaxCheck )
    {
        this.local_syntaxCheck = _syntaxCheck;
    }
    public boolean getSyntaxCheck( )
    {
        return this.local_syntaxCheck;
    }
    public void setNotifyCluster( boolean _notifyCluster )
    {
        this.local_notifyCluster = _notifyCluster;
    }
    public boolean getNotifyCluster( )
    {
        return this.local_notifyCluster;
    }
}