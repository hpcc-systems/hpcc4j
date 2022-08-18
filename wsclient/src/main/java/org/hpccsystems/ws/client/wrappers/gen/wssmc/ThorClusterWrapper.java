package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: ThorClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-07-25T18:14:46.562Z
 */
public class ThorClusterWrapper
{
    protected String local_clusterName;
    protected String local_queueName;
    protected String local_queueStatus;
    protected int local_queueAvailable;
    protected int local_jobsRunning;
    protected int local_jobsInQueue;
    protected int local_queueStatus2;
    protected String local_thorLCR;
    protected int local_clusterSize;

    public ThorClusterWrapper() {}

    public ThorClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster thorcluster)
    {
        copy( thorcluster );
    }
    public ThorClusterWrapper( String _clusterName, String _queueName, String _queueStatus, int _queueAvailable, int _jobsRunning, int _jobsInQueue, int _queueStatus2, String _thorLCR, int _clusterSize )
    {
        this.local_clusterName = _clusterName;
        this.local_queueName = _queueName;
        this.local_queueStatus = _queueStatus;
        this.local_queueAvailable = _queueAvailable;
        this.local_jobsRunning = _jobsRunning;
        this.local_jobsInQueue = _jobsInQueue;
        this.local_queueStatus2 = _queueStatus2;
        this.local_thorLCR = _thorLCR;
        this.local_clusterSize = _clusterSize;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster raw )
    {
        if (raw == null)
            return;

        this.local_clusterName = raw.getClusterName();
        this.local_queueName = raw.getQueueName();
        this.local_queueStatus = raw.getQueueStatus();
        this.local_queueAvailable = raw.getQueueAvailable();
        this.local_jobsRunning = raw.getJobsRunning();
        this.local_jobsInQueue = raw.getJobsInQueue();
        this.local_queueStatus2 = raw.getQueueStatus2();
        this.local_thorLCR = raw.getThorLCR();
        this.local_clusterSize = raw.getClusterSize();

    }

    @Override
    public String toString()
    {
        return "ThorClusterWrapper [" + "clusterName = " + local_clusterName + ", " + "queueName = " + local_queueName + ", " + "queueStatus = " + local_queueStatus + ", " + "queueAvailable = " + local_queueAvailable + ", " + "jobsRunning = " + local_jobsRunning + ", " + "jobsInQueue = " + local_jobsInQueue + ", " + "queueStatus2 = " + local_queueStatus2 + ", " + "thorLCR = " + local_thorLCR + ", " + "clusterSize = " + local_clusterSize + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster();
        raw.setClusterName( local_clusterName);
        raw.setQueueName( local_queueName);
        raw.setQueueStatus( local_queueStatus);
        raw.setQueueAvailable( local_queueAvailable);
        raw.setJobsRunning( local_jobsRunning);
        raw.setJobsInQueue( local_jobsInQueue);
        raw.setQueueStatus2( local_queueStatus2);
        raw.setThorLCR( local_thorLCR);
        raw.setClusterSize( local_clusterSize);
        return raw;
    }


    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setQueueName( String _queueName )
    {
        this.local_queueName = _queueName;
    }
    public String getQueueName( )
    {
        return this.local_queueName;
    }
    public void setQueueStatus( String _queueStatus )
    {
        this.local_queueStatus = _queueStatus;
    }
    public String getQueueStatus( )
    {
        return this.local_queueStatus;
    }
    public void setQueueAvailable( int _queueAvailable )
    {
        this.local_queueAvailable = _queueAvailable;
    }
    public int getQueueAvailable( )
    {
        return this.local_queueAvailable;
    }
    public void setJobsRunning( int _jobsRunning )
    {
        this.local_jobsRunning = _jobsRunning;
    }
    public int getJobsRunning( )
    {
        return this.local_jobsRunning;
    }
    public void setJobsInQueue( int _jobsInQueue )
    {
        this.local_jobsInQueue = _jobsInQueue;
    }
    public int getJobsInQueue( )
    {
        return this.local_jobsInQueue;
    }
    public void setQueueStatus2( int _queueStatus2 )
    {
        this.local_queueStatus2 = _queueStatus2;
    }
    public int getQueueStatus2( )
    {
        return this.local_queueStatus2;
    }
    public void setThorLCR( String _thorLCR )
    {
        this.local_thorLCR = _thorLCR;
    }
    public String getThorLCR( )
    {
        return this.local_thorLCR;
    }
    public void setClusterSize( int _clusterSize )
    {
        this.local_clusterSize = _clusterSize;
    }
    public int getClusterSize( )
    {
        return this.local_clusterSize;
    }
}