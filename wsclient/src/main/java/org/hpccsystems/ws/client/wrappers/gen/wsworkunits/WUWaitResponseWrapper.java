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
 * Class name: WUWaitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:17.002Z
 */
public class WUWaitResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_stateID;

    public WUWaitResponseWrapper() {}

    public WUWaitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitResponse wuwaitresponse)
    {
        copy( wuwaitresponse );
    }
    public WUWaitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _stateID )
    {
        this.local_exceptions = _exceptions;
        this.local_stateID = _stateID;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_stateID = raw.getStateID();

    }

    @Override
    public String toString()
    {
        return "WUWaitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "stateID = " + local_stateID + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitResponse();
        raw.setStateID( local_stateID);
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
    public void setStateID( int _stateID )
    {
        this.local_stateID = _stateID;
    }
    public int getStateID( )
    {
        return this.local_stateID;
    }
}