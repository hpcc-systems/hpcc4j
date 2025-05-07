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
 * Class name: GetAttributeHistoryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetAttributeHistoryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLAttributeWrapper local_outAttributes;

    public GetAttributeHistoryResponseWrapper() {}

    public GetAttributeHistoryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse getattributehistoryresponse)
    {
        copy( getattributehistoryresponse );
    }
    public GetAttributeHistoryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLAttributeWrapper _outAttributes )
    {
        this.local_exceptions = _exceptions;
        this.local_outAttributes = _outAttributes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getOutAttributes() != null)
            this.local_outAttributes = new ArrayOfECLAttributeWrapper( raw.getOutAttributes());

    }

    @Override
    public String toString()
    {
        return "GetAttributeHistoryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "outAttributes = " + local_outAttributes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_outAttributes != null)
            raw.setOutAttributes( local_outAttributes.getRaw());
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
    public void setOutAttributes( ArrayOfECLAttributeWrapper _outAttributes )
    {
        this.local_outAttributes = _outAttributes;
    }
    public ArrayOfECLAttributeWrapper getOutAttributes( )
    {
        return this.local_outAttributes;
    }
}