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
 * Class name: ThorQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.873Z
 */
public class ThorQueueWrapper
{
    protected String local_dT;
    protected String local_runningWUs;
    protected String local_queuedWUs;
    protected String local_waitingThors;
    protected String local_connectedThors;
    protected String local_idledThors;
    protected String local_runningWU1;
    protected String local_runningWU2;

    public ThorQueueWrapper() {}

    public ThorQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue thorqueue)
    {
        copy( thorqueue );
    }
    public ThorQueueWrapper( String _dT, String _runningWUs, String _queuedWUs, String _waitingThors, String _connectedThors, String _idledThors, String _runningWU1, String _runningWU2 )
    {
        this.local_dT = _dT;
        this.local_runningWUs = _runningWUs;
        this.local_queuedWUs = _queuedWUs;
        this.local_waitingThors = _waitingThors;
        this.local_connectedThors = _connectedThors;
        this.local_idledThors = _idledThors;
        this.local_runningWU1 = _runningWU1;
        this.local_runningWU2 = _runningWU2;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue raw )
    {
        if (raw == null)
            return;

        this.local_dT = raw.getDT();
        this.local_runningWUs = raw.getRunningWUs();
        this.local_queuedWUs = raw.getQueuedWUs();
        this.local_waitingThors = raw.getWaitingThors();
        this.local_connectedThors = raw.getConnectedThors();
        this.local_idledThors = raw.getIdledThors();
        this.local_runningWU1 = raw.getRunningWU1();
        this.local_runningWU2 = raw.getRunningWU2();

    }

    @Override
    public String toString()
    {
        return "ThorQueueWrapper [" + "dT = " + local_dT + ", " + "runningWUs = " + local_runningWUs + ", " + "queuedWUs = " + local_queuedWUs + ", " + "waitingThors = " + local_waitingThors + ", " + "connectedThors = " + local_connectedThors + ", " + "idledThors = " + local_idledThors + ", " + "runningWU1 = " + local_runningWU1 + ", " + "runningWU2 = " + local_runningWU2 + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ThorQueue();
        raw.setDT( local_dT);
        raw.setRunningWUs( local_runningWUs);
        raw.setQueuedWUs( local_queuedWUs);
        raw.setWaitingThors( local_waitingThors);
        raw.setConnectedThors( local_connectedThors);
        raw.setIdledThors( local_idledThors);
        raw.setRunningWU1( local_runningWU1);
        raw.setRunningWU2( local_runningWU2);
        return raw;
    }


    public void setDT( String _dT )
    {
        this.local_dT = _dT;
    }
    public String getDT( )
    {
        return this.local_dT;
    }
    public void setRunningWUs( String _runningWUs )
    {
        this.local_runningWUs = _runningWUs;
    }
    public String getRunningWUs( )
    {
        return this.local_runningWUs;
    }
    public void setQueuedWUs( String _queuedWUs )
    {
        this.local_queuedWUs = _queuedWUs;
    }
    public String getQueuedWUs( )
    {
        return this.local_queuedWUs;
    }
    public void setWaitingThors( String _waitingThors )
    {
        this.local_waitingThors = _waitingThors;
    }
    public String getWaitingThors( )
    {
        return this.local_waitingThors;
    }
    public void setConnectedThors( String _connectedThors )
    {
        this.local_connectedThors = _connectedThors;
    }
    public String getConnectedThors( )
    {
        return this.local_connectedThors;
    }
    public void setIdledThors( String _idledThors )
    {
        this.local_idledThors = _idledThors;
    }
    public String getIdledThors( )
    {
        return this.local_idledThors;
    }
    public void setRunningWU1( String _runningWU1 )
    {
        this.local_runningWU1 = _runningWU1;
    }
    public String getRunningWU1( )
    {
        return this.local_runningWU1;
    }
    public void setRunningWU2( String _runningWU2 )
    {
        this.local_runningWU2 = _runningWU2;
    }
    public String getRunningWU2( )
    {
        return this.local_runningWU2;
    }
}