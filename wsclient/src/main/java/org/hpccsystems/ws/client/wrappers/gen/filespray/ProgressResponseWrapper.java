package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: ProgressResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.842Z
 */
public class ProgressResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected int local_percentDone;
    protected int local_secsLeft;
    protected int local_kbPerSecAve;
    protected int local_kbPerSec;
    protected int local_slavesDone;
    protected String local_timeTaken;
    protected String local_progressMessage;
    protected String local_summaryMessage;
    protected String local_state;

    public ProgressResponseWrapper() {}

    public ProgressResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse progressresponse)
    {
        copy( progressresponse );
    }
    public ProgressResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, int _percentDone, int _secsLeft, int _kbPerSecAve, int _kbPerSec, int _slavesDone, String _timeTaken, String _progressMessage, String _summaryMessage, String _state )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_percentDone = _percentDone;
        this.local_secsLeft = _secsLeft;
        this.local_kbPerSecAve = _kbPerSecAve;
        this.local_kbPerSec = _kbPerSec;
        this.local_slavesDone = _slavesDone;
        this.local_timeTaken = _timeTaken;
        this.local_progressMessage = _progressMessage;
        this.local_summaryMessage = _summaryMessage;
        this.local_state = _state;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_percentDone = raw.getPercentDone();
        this.local_secsLeft = raw.getSecsLeft();
        this.local_kbPerSecAve = raw.getKbPerSecAve();
        this.local_kbPerSec = raw.getKbPerSec();
        this.local_slavesDone = raw.getSlavesDone();
        this.local_timeTaken = raw.getTimeTaken();
        this.local_progressMessage = raw.getProgressMessage();
        this.local_summaryMessage = raw.getSummaryMessage();
        this.local_state = raw.getState();

    }

    @Override
    public String toString()
    {
        return "ProgressResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "percentDone = " + local_percentDone + ", " + "secsLeft = " + local_secsLeft + ", " + "kbPerSecAve = " + local_kbPerSecAve + ", " + "kbPerSec = " + local_kbPerSec + ", " + "slavesDone = " + local_slavesDone + ", " + "timeTaken = " + local_timeTaken + ", " + "progressMessage = " + local_progressMessage + ", " + "summaryMessage = " + local_summaryMessage + ", " + "state = " + local_state + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.ProgressResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWuid( local_wuid);
        raw.setPercentDone( local_percentDone);
        raw.setSecsLeft( local_secsLeft);
        raw.setKbPerSecAve( local_kbPerSecAve);
        raw.setKbPerSec( local_kbPerSec);
        raw.setSlavesDone( local_slavesDone);
        raw.setTimeTaken( local_timeTaken);
        raw.setProgressMessage( local_progressMessage);
        raw.setSummaryMessage( local_summaryMessage);
        raw.setState( local_state);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setPercentDone( int _percentDone )
    {
        this.local_percentDone = _percentDone;
    }
    public int getPercentDone( )
    {
        return this.local_percentDone;
    }
    public void setSecsLeft( int _secsLeft )
    {
        this.local_secsLeft = _secsLeft;
    }
    public int getSecsLeft( )
    {
        return this.local_secsLeft;
    }
    public void setKbPerSecAve( int _kbPerSecAve )
    {
        this.local_kbPerSecAve = _kbPerSecAve;
    }
    public int getKbPerSecAve( )
    {
        return this.local_kbPerSecAve;
    }
    public void setKbPerSec( int _kbPerSec )
    {
        this.local_kbPerSec = _kbPerSec;
    }
    public int getKbPerSec( )
    {
        return this.local_kbPerSec;
    }
    public void setSlavesDone( int _slavesDone )
    {
        this.local_slavesDone = _slavesDone;
    }
    public int getSlavesDone( )
    {
        return this.local_slavesDone;
    }
    public void setTimeTaken( String _timeTaken )
    {
        this.local_timeTaken = _timeTaken;
    }
    public String getTimeTaken( )
    {
        return this.local_timeTaken;
    }
    public void setProgressMessage( String _progressMessage )
    {
        this.local_progressMessage = _progressMessage;
    }
    public String getProgressMessage( )
    {
        return this.local_progressMessage;
    }
    public void setSummaryMessage( String _summaryMessage )
    {
        this.local_summaryMessage = _summaryMessage;
    }
    public String getSummaryMessage( )
    {
        return this.local_summaryMessage;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
}