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
 * Class name: CreateAttributeResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class CreateAttributeResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ECLAttributeWrapper local_attributeInfo;

    public CreateAttributeResponseWrapper() {}

    public CreateAttributeResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse createattributeresponse)
    {
        copy( createattributeresponse );
    }
    public CreateAttributeResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ECLAttributeWrapper _attributeInfo )
    {
        this.local_exceptions = _exceptions;
        this.local_attributeInfo = _attributeInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getAttributeInfo() != null)
            this.local_attributeInfo = new ECLAttributeWrapper( raw.getAttributeInfo());

    }

    @Override
    public String toString()
    {
        return "CreateAttributeResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "attributeInfo = " + local_attributeInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_attributeInfo != null)
            raw.setAttributeInfo( local_attributeInfo.getRaw());
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
    public void setAttributeInfo( ECLAttributeWrapper _attributeInfo )
    {
        this.local_attributeInfo = _attributeInfo;
    }
    public ECLAttributeWrapper getAttributeInfo( )
    {
        return this.local_attributeInfo;
    }
}