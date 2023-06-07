package org.hpccsystems.ws.client.wrappers.gen.wsstore;

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
 * Class name: FetchResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class FetchResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_value;

    public FetchResponseWrapper() {}

    public FetchResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchResponse fetchresponse)
    {
        copy( fetchresponse );
    }
    public FetchResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _value )
    {
        this.local_exceptions = _exceptions;
        this.local_value = _value;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_value = raw.getValue();

    }

    @Override
    public String toString()
    {
        return "FetchResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "value = " + local_value + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setValue( local_value);
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
    public void setValue( String _value )
    {
        this.local_value = _value;
    }
    public String getValue( )
    {
        return this.local_value;
    }
}