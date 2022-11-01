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
 * Class name: RoxieControlCmdWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmd
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.312Z
 */
public class RoxieControlCmdWrapper
{
    protected String local_processCluster;
    protected String local_targetCluster;
    protected RoxieControlCmdTypeWrapper local_command;
    protected int local_wait;

    public RoxieControlCmdWrapper() {}

    public RoxieControlCmdWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmd roxiecontrolcmd)
    {
        copy( roxiecontrolcmd );
    }
    public RoxieControlCmdWrapper( String _processCluster, String _targetCluster, RoxieControlCmdTypeWrapper _command, int _wait )
    {
        this.local_processCluster = _processCluster;
        this.local_targetCluster = _targetCluster;
        this.local_command = _command;
        this.local_wait = _wait;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmd raw )
    {
        if (raw == null)
            return;

        this.local_processCluster = raw.getProcessCluster();
        this.local_targetCluster = raw.getTargetCluster();
        if (raw.getCommand() != null)
            this.local_command = new RoxieControlCmdTypeWrapper( raw.getCommand());
        this.local_wait = raw.getWait();

    }

    @Override
    public String toString()
    {
        return "RoxieControlCmdWrapper [" + "processCluster = " + local_processCluster + ", " + "targetCluster = " + local_targetCluster + ", " + "command = " + local_command + ", " + "wait = " + local_wait + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmd getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmd raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmd();
        raw.setProcessCluster( local_processCluster);
        raw.setTargetCluster( local_targetCluster);
        if (local_command != null)
            raw.setCommand( local_command.getRaw());
        raw.setWait( local_wait);
        return raw;
    }


    public void setProcessCluster( String _processCluster )
    {
        this.local_processCluster = _processCluster;
    }
    public String getProcessCluster( )
    {
        return this.local_processCluster;
    }
    public void setTargetCluster( String _targetCluster )
    {
        this.local_targetCluster = _targetCluster;
    }
    public String getTargetCluster( )
    {
        return this.local_targetCluster;
    }
    public void setCommand( RoxieControlCmdTypeWrapper _command )
    {
        this.local_command = _command;
    }
    public RoxieControlCmdTypeWrapper getCommand( )
    {
        return this.local_command;
    }
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
}