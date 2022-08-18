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
 * Class name: WUSyntaxCheckResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.997Z
 */
public class WUSyntaxCheckResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLExceptionWrapper local_errors;
    protected String local_message;

    public WUSyntaxCheckResponseWrapper() {}

    public WUSyntaxCheckResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckResponse wusyntaxcheckresponse)
    {
        copy( wusyntaxcheckresponse );
    }
    public WUSyntaxCheckResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLExceptionWrapper _errors, String _message )
    {
        this.local_exceptions = _exceptions;
        this.local_errors = _errors;
        this.local_message = _message;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getErrors() != null)
            this.local_errors = new ArrayOfECLExceptionWrapper( raw.getErrors());
        this.local_message = raw.getMessage();

    }

    @Override
    public String toString()
    {
        return "WUSyntaxCheckResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "errors = " + local_errors + ", " + "message = " + local_message + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckResponse();
        raw.setMessage( local_message);
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
    public void setErrors( ArrayOfECLExceptionWrapper _errors )
    {
        this.local_errors = _errors;
    }
    public ArrayOfECLExceptionWrapper getErrors( )
    {
        return this.local_errors;
    }
    public void setMessage( String _message )
    {
        this.local_message = _message;
    }
    public String getMessage( )
    {
        return this.local_message;
    }
}