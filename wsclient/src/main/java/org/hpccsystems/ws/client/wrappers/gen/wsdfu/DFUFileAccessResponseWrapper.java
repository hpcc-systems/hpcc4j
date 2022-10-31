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
 * Class name: DFUFileAccessResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.869Z
 */
public class DFUFileAccessResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected DFUFileAccessInfoWrapper local_accessInfo;
    protected DFUFileTypeWrapper local_type;

    public DFUFileAccessResponseWrapper() {}

    public DFUFileAccessResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse dfufileaccessresponse)
    {
        copy( dfufileaccessresponse );
    }
    public DFUFileAccessResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DFUFileAccessInfoWrapper _accessInfo, DFUFileTypeWrapper _type )
    {
        this.local_exceptions = _exceptions;
        this.local_accessInfo = _accessInfo;
        this.local_type = _type;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getAccessInfo() != null)
            this.local_accessInfo = new DFUFileAccessInfoWrapper( raw.getAccessInfo());
        if (raw.getType() != null)
            this.local_type = new DFUFileTypeWrapper( raw.getType());

    }

    @Override
    public String toString()
    {
        return "DFUFileAccessResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "accessInfo = " + local_accessInfo + ", " + "type = " + local_type + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setAccessInfo( local_accessInfo.getRaw());
        raw.setType( local_type.getRaw());
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
    public void setAccessInfo( DFUFileAccessInfoWrapper _accessInfo )
    {
        this.local_accessInfo = _accessInfo;
    }
    public DFUFileAccessInfoWrapper getAccessInfo( )
    {
        return this.local_accessInfo;
    }
    public void setType( DFUFileTypeWrapper _type )
    {
        this.local_type = _type;
    }
    public DFUFileTypeWrapper getType( )
    {
        return this.local_type;
    }
}