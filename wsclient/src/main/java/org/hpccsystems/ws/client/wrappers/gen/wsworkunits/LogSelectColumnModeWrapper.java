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
 * Class name: LogSelectColumnModeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.839Z
 */
public class LogSelectColumnModeWrapper
{
    protected int local_logSelectColumnMode;

    public LogSelectColumnModeWrapper() {}

    public LogSelectColumnModeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode logselectcolumnmode)
    {
        copy( logselectcolumnmode );
    }
    public LogSelectColumnModeWrapper( int _logSelectColumnMode )
    {
        this.local_logSelectColumnMode = _logSelectColumnMode;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getLogSelectColumnMode();

    }

    @Override
    public String toString()
    {
        return "LogSelectColumnModeWrapper [" + "logSelectColumnMode = " + local_logSelectColumnMode + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setLogSelectColumnMode(logSelectColumnMode);
        return raw;
    }


    public void setLogSelectColumnMode( int _logSelectColumnMode )
    {
        this.local_logSelectColumnMode = _logSelectColumnMode;
    }
    public int getLogSelectColumnMode( )
    {
        return this.local_logSelectColumnMode;
    }
}