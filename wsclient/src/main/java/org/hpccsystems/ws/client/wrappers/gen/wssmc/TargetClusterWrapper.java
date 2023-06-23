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
 * Class name: TargetClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class TargetClusterWrapper
{
    protected String local_clusterName;
    protected String local_queueName;
    protected String local_queueStatus;
    protected String local_statusDetails;
    protected String local_warning;
    protected int local_clusterType;
    protected int local_clusterSize;
    protected int local_clusterStatus;

    public TargetClusterWrapper() {}

    public TargetClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster targetcluster)
    {
        copy( targetcluster );
    }
    public TargetClusterWrapper( String _clusterName, String _queueName, String _queueStatus, String _statusDetails, String _warning, int _clusterType, int _clusterSize, int _clusterStatus )
    {
        this.local_clusterName = _clusterName;
        this.local_queueName = _queueName;
        this.local_queueStatus = _queueStatus;
        this.local_statusDetails = _statusDetails;
        this.local_warning = _warning;
        this.local_clusterType = _clusterType;
        this.local_clusterSize = _clusterSize;
        this.local_clusterStatus = _clusterStatus;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster raw )
    {
        if (raw == null)
            return;

        this.local_clusterName = raw.getClusterName();
        this.local_queueName = raw.getQueueName();
        this.local_queueStatus = raw.getQueueStatus();
        this.local_statusDetails = raw.getStatusDetails();
        this.local_warning = raw.getWarning();
        this.local_clusterType = raw.getClusterType();
        this.local_clusterSize = raw.getClusterSize();
        this.local_clusterStatus = raw.getClusterStatus();

    }

    @Override
    public String toString()
    {
        return "TargetClusterWrapper [" + "clusterName = " + local_clusterName + ", " + "queueName = " + local_queueName + ", " + "queueStatus = " + local_queueStatus + ", " + "statusDetails = " + local_statusDetails + ", " + "warning = " + local_warning + ", " + "clusterType = " + local_clusterType + ", " + "clusterSize = " + local_clusterSize + ", " + "clusterStatus = " + local_clusterStatus + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster();
        raw.setClusterName( local_clusterName);
        raw.setQueueName( local_queueName);
        raw.setQueueStatus( local_queueStatus);
        raw.setStatusDetails( local_statusDetails);
        raw.setWarning( local_warning);
        raw.setClusterType( local_clusterType);
        raw.setClusterSize( local_clusterSize);
        raw.setClusterStatus( local_clusterStatus);
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
    public void setStatusDetails( String _statusDetails )
    {
        this.local_statusDetails = _statusDetails;
    }
    public String getStatusDetails( )
    {
        return this.local_statusDetails;
    }
    public void setWarning( String _warning )
    {
        this.local_warning = _warning;
    }
    public String getWarning( )
    {
        return this.local_warning;
    }
    public void setClusterType( int _clusterType )
    {
        this.local_clusterType = _clusterType;
    }
    public int getClusterType( )
    {
        return this.local_clusterType;
    }
    public void setClusterSize( int _clusterSize )
    {
        this.local_clusterSize = _clusterSize;
    }
    public int getClusterSize( )
    {
        return this.local_clusterSize;
    }
    public void setClusterStatus( int _clusterStatus )
    {
        this.local_clusterStatus = _clusterStatus;
    }
    public int getClusterStatus( )
    {
        return this.local_clusterStatus;
    }
}