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
 * Class name: LogAccessLogFormatWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.837Z
 */
public class LogAccessLogFormatWrapper
{
    protected int local_logAccessLogFormat;

    public LogAccessLogFormatWrapper() {}

    public LogAccessLogFormatWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat logaccesslogformat)
    {
        copy( logaccesslogformat );
    }
    public LogAccessLogFormatWrapper( int _logAccessLogFormat )
    {
        this.local_logAccessLogFormat = _logAccessLogFormat;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getLogAccessLogFormat();

    }

    @Override
    public String toString()
    {
        return "LogAccessLogFormatWrapper [" + "logAccessLogFormat = " + local_logAccessLogFormat + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setLogAccessLogFormat(logAccessLogFormat);
        return raw;
    }


    public void setLogAccessLogFormat( int _logAccessLogFormat )
    {
        this.local_logAccessLogFormat = _logAccessLogFormat;
    }
    public int getLogAccessLogFormat( )
    {
        return this.local_logAccessLogFormat;
    }
}