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
 * Class name: GetAttributeResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetAttributeResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ECLAttributeWrapper local_outAttribute;

    public GetAttributeResponseWrapper() {}

    public GetAttributeResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse getattributeresponse)
    {
        copy( getattributeresponse );
    }
    public GetAttributeResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ECLAttributeWrapper _outAttribute )
    {
        this.local_exceptions = _exceptions;
        this.local_outAttribute = _outAttribute;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getOutAttribute() != null)
            this.local_outAttribute = new ECLAttributeWrapper( raw.getOutAttribute());

    }

    @Override
    public String toString()
    {
        return "GetAttributeResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "outAttribute = " + local_outAttribute + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_outAttribute != null)
            raw.setOutAttribute( local_outAttribute.getRaw());
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
    public void setOutAttribute( ECLAttributeWrapper _outAttribute )
    {
        this.local_outAttribute = _outAttribute;
    }
    public ECLAttributeWrapper getOutAttribute( )
    {
        return this.local_outAttribute;
    }
}