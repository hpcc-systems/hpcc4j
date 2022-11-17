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
 * Class name: DFUJobWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DFUJob
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-10-27T20:17:20.576Z
 */
public class DFUJobWrapper
{
    protected String local_timeStarted;
    protected int local_done;
    protected int local_total;
    protected String local_command;

    public DFUJobWrapper() {}

    public DFUJobWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DFUJob dfujob)
    {
        copy( dfujob );
    }
    public DFUJobWrapper( String _timeStarted, int _done, int _total, String _command )
    {
        this.local_timeStarted = _timeStarted;
        this.local_done = _done;
        this.local_total = _total;
        this.local_command = _command;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DFUJob raw )
    {
        if (raw == null)
            return;

        this.local_timeStarted = raw.getTimeStarted();
        this.local_done = raw.getDone();
        this.local_total = raw.getTotal();
        this.local_command = raw.getCommand();

    }

    @Override
    public String toString()
    {
        return "DFUJobWrapper [" + "timeStarted = " + local_timeStarted + ", " + "done = " + local_done + ", " + "total = " + local_total + ", " + "command = " + local_command + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DFUJob getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DFUJob raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.DFUJob();
        raw.setTimeStarted( local_timeStarted);
        raw.setDone( local_done);
        raw.setTotal( local_total);
        raw.setCommand( local_command);
        return raw;
    }


    public void setTimeStarted( String _timeStarted )
    {
        this.local_timeStarted = _timeStarted;
    }
    public String getTimeStarted( )
    {
        return this.local_timeStarted;
    }
    public void setDone( int _done )
    {
        this.local_done = _done;
    }
    public int getDone( )
    {
        return this.local_done;
    }
    public void setTotal( int _total )
    {
        this.local_total = _total;
    }
    public int getTotal( )
    {
        return this.local_total;
    }
    public void setCommand( String _command )
    {
        this.local_command = _command;
    }
    public String getCommand( )
    {
        return this.local_command;
    }
}