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
 * Class name: WUAddLocalFileToWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.506Z
 */
public class WUAddLocalFileToWorkunitResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_name;
    protected String local_result;

    public WUAddLocalFileToWorkunitResponseWrapper() {}

    public WUAddLocalFileToWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunitResponse wuaddlocalfiletoworkunitresponse)
    {
        copy( wuaddlocalfiletoworkunitresponse );
    }
    public WUAddLocalFileToWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _name, String _result )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_name = _name;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunitResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_name = raw.getName();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "WUAddLocalFileToWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "name = " + local_name + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunitResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunitResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWuid( local_wuid);
        raw.setName( local_name);
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
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
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