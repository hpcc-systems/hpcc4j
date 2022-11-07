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
 * Class name: WUResultViewResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultViewResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.989Z
 */
public class WUResultViewResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_viewName;
    protected String local_result;

    public WUResultViewResponseWrapper() {}

    public WUResultViewResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultViewResponse wuresultviewresponse)
    {
        copy( wuresultviewresponse );
    }
    public WUResultViewResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _viewName, String _result )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_viewName = _viewName;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultViewResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_viewName = raw.getViewName();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "WUResultViewResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "viewName = " + local_viewName + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultViewResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultViewResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultViewResponse();
        raw.setWuid( local_wuid);
        raw.setViewName( local_viewName);
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
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setViewName( String _viewName )
    {
        this.local_viewName = _viewName;
    }
    public String getViewName( )
    {
        return this.local_viewName;
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