package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: CreateLabelResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class CreateLabelResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;

    public CreateLabelResponseWrapper() {}

    public CreateLabelResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse createlabelresponse)
    {
        copy( createlabelresponse );
    }
    public CreateLabelResponseWrapper( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());

    }

    @Override
    public String toString()
    {
        return "CreateLabelResponseWrapper [" + "exceptions = " + local_exceptions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
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
}