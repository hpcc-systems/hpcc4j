package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * WrapperMaker version: 1.7
 * Class name: DeleteDFUWorkunitsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * Service version: 1.23
 */
public class DeleteDFUWorkunitsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;

    public DeleteDFUWorkunitsResponseWrapper() {}

    public DeleteDFUWorkunitsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitsResponse deletedfuworkunitsresponse)
    {
        copy( deletedfuworkunitsresponse );
    }
    public DeleteDFUWorkunitsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());

    }

    @Override
    public String toString()
    {
        return "DeleteDFUWorkunitsResponseWrapper [" + "exceptions = " + local_exceptions + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitsResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DeleteDFUWorkunitsResponse();
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