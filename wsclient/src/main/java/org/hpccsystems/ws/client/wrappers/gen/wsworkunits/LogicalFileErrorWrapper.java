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
 * Class name: LogicalFileErrorWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.838Z
 */
public class LogicalFileErrorWrapper
{
    protected String local_error;
    protected String local_logicalName;

    public LogicalFileErrorWrapper() {}

    public LogicalFileErrorWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError logicalfileerror)
    {
        copy( logicalfileerror );
    }
    public LogicalFileErrorWrapper( String _error, String _logicalName )
    {
        this.local_error = _error;
        this.local_logicalName = _logicalName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError raw )
    {
        if (raw == null)
            return;

        this.local_error = raw.getError();
        this.local_logicalName = raw.getLogicalName();

    }

    @Override
    public String toString()
    {
        return "LogicalFileErrorWrapper [" + "error = " + local_error + ", " + "logicalName = " + local_logicalName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError();
        raw.setError( local_error);
        raw.setLogicalName( local_logicalName);
        return raw;
    }


    public void setError( String _error )
    {
        this.local_error = _error;
    }
    public String getError( )
    {
        return this.local_error;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
}