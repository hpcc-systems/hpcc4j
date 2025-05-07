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
 * Class name: LogEventClassWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class LogEventClassWrapper
{
    protected String local_logEventClass;

    public LogEventClassWrapper() {}

    public LogEventClassWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass logeventclass)
    {
        copy( logeventclass );
    }
    public LogEventClassWrapper( String _logEventClass )
    {
        this.local_logEventClass = _logEventClass;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getLogEventClass();

    }

    @Override
    public String toString()
    {
        return "LogEventClassWrapper [" + "logEventClass = " + local_logEventClass + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setLogEventClass(logEventClass);
        return raw;
    }


    public void setLogEventClass( String _logEventClass )
    {
        this.local_logEventClass = _logEventClass;
    }
    public String getLogEventClass( )
    {
        return this.local_logEventClass;
    }
}