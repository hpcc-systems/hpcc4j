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
 * Class name: ServerJobQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ServerJobQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.318Z
 */
public class ServerJobQueueWrapper
{
    protected String local_queueName;
    protected ArrayOfServerJobQueueWrapper local_queues;
    protected String local_serverName;
    protected String local_serverType;
    protected String local_queueStatus;
    protected String local_statusDetails;
    protected String local_networkAddress;
    protected int local_port;

    public ServerJobQueueWrapper() {}

    public ServerJobQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ServerJobQueue serverjobqueue)
    {
        copy( serverjobqueue );
    }
    public ServerJobQueueWrapper( String _queueName, ArrayOfServerJobQueueWrapper _queues, String _serverName, String _serverType, String _queueStatus, String _statusDetails, String _networkAddress, int _port )
    {
        this.local_queueName = _queueName;
        this.local_queues = _queues;
        this.local_serverName = _serverName;
        this.local_serverType = _serverType;
        this.local_queueStatus = _queueStatus;
        this.local_statusDetails = _statusDetails;
        this.local_networkAddress = _networkAddress;
        this.local_port = _port;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ServerJobQueue raw )
    {
        if (raw == null)
            return;

        this.local_queueName = raw.getQueueName();
        if (raw.getQueues() != null)
            this.local_queues = new ArrayOfServerJobQueueWrapper( raw.getQueues());
        this.local_serverName = raw.getServerName();
        this.local_serverType = raw.getServerType();
        this.local_queueStatus = raw.getQueueStatus();
        this.local_statusDetails = raw.getStatusDetails();
        this.local_networkAddress = raw.getNetworkAddress();
        this.local_port = raw.getPort();

    }

    @Override
    public String toString()
    {
        return "ServerJobQueueWrapper [" + "queueName = " + local_queueName + ", " + "queues = " + local_queues + ", " + "serverName = " + local_serverName + ", " + "serverType = " + local_serverType + ", " + "queueStatus = " + local_queueStatus + ", " + "statusDetails = " + local_statusDetails + ", " + "networkAddress = " + local_networkAddress + ", " + "port = " + local_port + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ServerJobQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ServerJobQueue raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ServerJobQueue();
        raw.setQueueName( local_queueName);
        if (local_queues != null)
            raw.setQueues( local_queues.getRaw());
        raw.setServerName( local_serverName);
        raw.setServerType( local_serverType);
        raw.setQueueStatus( local_queueStatus);
        raw.setStatusDetails( local_statusDetails);
        raw.setNetworkAddress( local_networkAddress);
        raw.setPort( local_port);
        return raw;
    }


    public void setQueueName( String _queueName )
    {
        this.local_queueName = _queueName;
    }
    public String getQueueName( )
    {
        return this.local_queueName;
    }
    public void setQueues( ArrayOfServerJobQueueWrapper _queues )
    {
        this.local_queues = _queues;
    }
    public ArrayOfServerJobQueueWrapper getQueues( )
    {
        return this.local_queues;
    }
    public void setServerName( String _serverName )
    {
        this.local_serverName = _serverName;
    }
    public String getServerName( )
    {
        return this.local_serverName;
    }
    public void setServerType( String _serverType )
    {
        this.local_serverType = _serverType;
    }
    public String getServerType( )
    {
        return this.local_serverType;
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