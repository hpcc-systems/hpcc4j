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
 * Class name: WUGraphTimingResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGraphTimingResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.927Z
 */
public class WUGraphTimingResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ECLWorkunitWrapper local_workunit;

    public WUGraphTimingResponseWrapper() {}

    public WUGraphTimingResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGraphTimingResponse wugraphtimingresponse)
    {
        copy( wugraphtimingresponse );
    }
    public WUGraphTimingResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ECLWorkunitWrapper _workunit )
    {
        this.local_exceptions = _exceptions;
        this.local_workunit = _workunit;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGraphTimingResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getWorkunit() != null)
            this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());

    }

    @Override
    public String toString()
    {
        return "WUGraphTimingResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "workunit = " + local_workunit + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGraphTimingResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGraphTimingResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGraphTimingResponse();
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
    public void setWorkunit( ECLWorkunitWrapper _workunit )
    {
        this.local_workunit = _workunit;
    }
    public ECLWorkunitWrapper getWorkunit( )
    {
        return this.local_workunit;
    }
}