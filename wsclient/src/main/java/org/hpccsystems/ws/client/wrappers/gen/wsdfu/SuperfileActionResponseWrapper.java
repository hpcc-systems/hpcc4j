package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: SuperfileActionResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.938Z
 */
public class SuperfileActionResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_superfile;
    protected int local_retcode;

    public SuperfileActionResponseWrapper() {}

    public SuperfileActionResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse superfileactionresponse)
    {
        copy( superfileactionresponse );
    }
    public SuperfileActionResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _superfile, int _retcode )
    {
        this.local_exceptions = _exceptions;
        this.local_superfile = _superfile;
        this.local_retcode = _retcode;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_superfile = raw.getSuperfile();
        this.local_retcode = raw.getRetcode();

    }

    @Override
    public String toString()
    {
        return "SuperfileActionResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "superfile = " + local_superfile + ", " + "retcode = " + local_retcode + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileActionResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setSuperfile( local_superfile);
        raw.setRetcode( local_retcode);
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
    public void setSuperfile( String _superfile )
    {
        this.local_superfile = _superfile;
    }
    public String getSuperfile( )
    {
        return this.local_superfile;
    }
    public void setRetcode( int _retcode )
    {
        this.local_retcode = _retcode;
    }
    public int getRetcode( )
    {
        return this.local_retcode;
    }
}