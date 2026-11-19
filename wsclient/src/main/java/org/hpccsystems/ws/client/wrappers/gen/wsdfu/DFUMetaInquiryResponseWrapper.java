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
 * Class name: DFUMetaInquiryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaInquiryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUMetaInquiryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfDFUMetaFieldInfoWrapper local_fields;

    public DFUMetaInquiryResponseWrapper() {}

    public DFUMetaInquiryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaInquiryResponse dfumetainquiryresponse)
    {
        copy( dfumetainquiryresponse );
    }
    public DFUMetaInquiryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfDFUMetaFieldInfoWrapper _fields )
    {
        this.local_exceptions = _exceptions;
        this.local_fields = _fields;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaInquiryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getFields() != null)
            this.local_fields = new ArrayOfDFUMetaFieldInfoWrapper( raw.getFields());

    }

    @Override
    public String toString()
    {
        return "DFUMetaInquiryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "fields = " + local_fields + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaInquiryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaInquiryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaInquiryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_fields != null)
            raw.setFields( local_fields.getRaw());
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
    public void setFields( ArrayOfDFUMetaFieldInfoWrapper _fields )
    {
        this.local_fields = _fields;
    }
    public ArrayOfDFUMetaFieldInfoWrapper getFields( )
    {
        return this.local_fields;
    }
}