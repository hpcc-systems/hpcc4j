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
 * Class name: GetDFUWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.835Z
 */
public class GetDFUWorkunitResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected DFUWorkunitWrapper local_result;
    protected int local_autoRefresh;

    public GetDFUWorkunitResponseWrapper() {}

    public GetDFUWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse getdfuworkunitresponse)
    {
        copy( getdfuworkunitresponse );
    }
    public GetDFUWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DFUWorkunitWrapper _result, int _autoRefresh )
    {
        this.local_exceptions = _exceptions;
        this.local_result = _result;
        this.local_autoRefresh = _autoRefresh;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getResult() != null)
            this.local_result = new DFUWorkunitWrapper( raw.getResult());
        this.local_autoRefresh = raw.getAutoRefresh();

    }

    @Override
    public String toString()
    {
        return "GetDFUWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "result = " + local_result + ", " + "autoRefresh = " + local_autoRefresh + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_result != null)
            raw.setResult( local_result.getRaw());
        raw.setAutoRefresh( local_autoRefresh);
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
    public void setResult( DFUWorkunitWrapper _result )
    {
        this.local_result = _result;
    }
    public DFUWorkunitWrapper getResult( )
    {
        return this.local_result;
    }
    public void setAutoRefresh( int _autoRefresh )
    {
        this.local_autoRefresh = _autoRefresh;
    }
    public int getAutoRefresh( )
    {
        return this.local_autoRefresh;
    }
}