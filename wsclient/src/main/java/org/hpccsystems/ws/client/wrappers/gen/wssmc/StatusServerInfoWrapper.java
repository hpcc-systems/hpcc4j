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
 * Class name: StatusServerInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StatusServerInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.321Z
 */
public class StatusServerInfoWrapper
{
    protected TargetClusterWrapper local_targetClusterInfo;
    protected ServerJobQueueWrapper local_serverInfo;
    protected ArrayOfActiveWorkunitWrapper local_workunits;

    public StatusServerInfoWrapper() {}

    public StatusServerInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StatusServerInfo statusserverinfo)
    {
        copy( statusserverinfo );
    }
    public StatusServerInfoWrapper( TargetClusterWrapper _targetClusterInfo, ServerJobQueueWrapper _serverInfo, ArrayOfActiveWorkunitWrapper _workunits )
    {
        this.local_targetClusterInfo = _targetClusterInfo;
        this.local_serverInfo = _serverInfo;
        this.local_workunits = _workunits;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StatusServerInfo raw )
    {
        if (raw == null)
            return;

        if (raw.getTargetClusterInfo() != null)
            this.local_targetClusterInfo = new TargetClusterWrapper( raw.getTargetClusterInfo());
        if (raw.getServerInfo() != null)
            this.local_serverInfo = new ServerJobQueueWrapper( raw.getServerInfo());
        if (raw.getWorkunits() != null)
            this.local_workunits = new ArrayOfActiveWorkunitWrapper( raw.getWorkunits());

    }

    @Override
    public String toString()
    {
        return "StatusServerInfoWrapper [" + "targetClusterInfo = " + local_targetClusterInfo + ", " + "serverInfo = " + local_serverInfo + ", " + "workunits = " + local_workunits + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StatusServerInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StatusServerInfo raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StatusServerInfo();
        if (local_targetClusterInfo != null)
            raw.setTargetClusterInfo( local_targetClusterInfo.getRaw());
        if (local_serverInfo != null)
            raw.setServerInfo( local_serverInfo.getRaw());
        if (local_workunits != null)
            raw.setWorkunits( local_workunits.getRaw());
        return raw;
    }


    public void setTargetClusterInfo( TargetClusterWrapper _targetClusterInfo )
    {
        this.local_targetClusterInfo = _targetClusterInfo;
    }
    public TargetClusterWrapper getTargetClusterInfo( )
    {
        return this.local_targetClusterInfo;
    }
    public void setServerInfo( ServerJobQueueWrapper _serverInfo )
    {
        this.local_serverInfo = _serverInfo;
    }
    public ServerJobQueueWrapper getServerInfo( )
    {
        return this.local_serverInfo;
    }
    public void setWorkunits( ArrayOfActiveWorkunitWrapper _workunits )
    {
        this.local_workunits = _workunits;
    }
    public ArrayOfActiveWorkunitWrapper getWorkunits( )
    {
        return this.local_workunits;
    }
}