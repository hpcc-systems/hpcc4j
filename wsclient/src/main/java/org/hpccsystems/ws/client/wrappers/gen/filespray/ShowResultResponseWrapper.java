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
 * Class name: ShowResultResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-07-25T17:33:52.347Z
 */
public class ShowResultResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_result;

    public ShowResultResponseWrapper() {}

    public ShowResultResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultResponse showresultresponse)
    {
        copy( showresultresponse );
    }
    public ShowResultResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _result )
    {
        this.local_exceptions = _exceptions;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "ShowResultResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.ShowResultResponse();
        raw.setResult( local_result);
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
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
}