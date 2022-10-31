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
 * Class name: PauseQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.PauseQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.309Z
 */
public class PauseQueueWrapper
{
    protected String local_cluster;
    protected String local_queueName;
    protected String local_comment;
    protected String local_serverType;
    protected String local_networkAddress;
    protected int local_port;

    public PauseQueueWrapper() {}

    public PauseQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.PauseQueue pausequeue)
    {
        copy( pausequeue );
    }
    public PauseQueueWrapper( String _cluster, String _queueName, String _comment, String _serverType, String _networkAddress, int _port )
    {
        this.local_cluster = _cluster;
        this.local_queueName = _queueName;
        this.local_comment = _comment;
        this.local_serverType = _serverType;
        this.local_networkAddress = _networkAddress;
        this.local_port = _port;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.PauseQueue raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_queueName = raw.getQueueName();
        this.local_comment = raw.getComment();
        this.local_serverType = raw.getServerType();
        this.local_networkAddress = raw.getNetworkAddress();
        this.local_port = raw.getPort();

    }

    @Override
    public String toString()
    {
        return "PauseQueueWrapper [" + "cluster = " + local_cluster + ", " + "queueName = " + local_queueName + ", " + "comment = " + local_comment + ", " + "serverType = " + local_serverType + ", " + "networkAddress = " + local_networkAddress + ", " + "port = " + local_port + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.PauseQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.PauseQueue raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.PauseQueue();
        raw.setCluster( local_cluster);
        raw.setQueueName( local_queueName);
        raw.setComment( local_comment);
        raw.setServerType( local_serverType);
        raw.setNetworkAddress( local_networkAddress);
        raw.setPort( local_port);
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
    public void setQueueName( String _queueName )
    {
        this.local_queueName = _queueName;
    }
    public String getQueueName( )
    {
        return this.local_queueName;
    }
    public void setComment( String _comment )
    {
        this.local_comment = _comment;
    }
    public String getComment( )
    {
        return this.local_comment;
    }
    public void setServerType( String _serverType )
    {
        this.local_serverType = _serverType;
    }
    public String getServerType( )
    {
        return this.local_serverType;
    }
    public void setNetworkAddress( String _networkAddress )
    {
        this.local_networkAddress = _networkAddress;
    }
    public String getNetworkAddress( )
    {
        return this.local_networkAddress;
    }
    public void setPort( int _port )
    {
        this.local_port = _port;
    }
    public int getPort( )
    {
        return this.local_port;
    }
}