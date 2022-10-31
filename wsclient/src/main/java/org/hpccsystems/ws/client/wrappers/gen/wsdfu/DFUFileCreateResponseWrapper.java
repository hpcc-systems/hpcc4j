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
 * Class name: DFUFileCreateResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.874Z
 */
public class DFUFileCreateResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_fileId;
    protected String local_warning;
    protected DFUFileAccessInfoWrapper local_accessInfo;

    public DFUFileCreateResponseWrapper() {}

    public DFUFileCreateResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse dfufilecreateresponse)
    {
        copy( dfufilecreateresponse );
    }
    public DFUFileCreateResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _fileId, String _warning, DFUFileAccessInfoWrapper _accessInfo )
    {
        this.local_exceptions = _exceptions;
        this.local_fileId = _fileId;
        this.local_warning = _warning;
        this.local_accessInfo = _accessInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_fileId = raw.getFileId();
        this.local_warning = raw.getWarning();
        if (raw.getAccessInfo() != null)
            this.local_accessInfo = new DFUFileAccessInfoWrapper( raw.getAccessInfo());

    }

    @Override
    public String toString()
    {
        return "DFUFileCreateResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "fileId = " + local_fileId + ", " + "warning = " + local_warning + ", " + "accessInfo = " + local_accessInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setFileId( local_fileId);
        raw.setWarning( local_warning);
        raw.setAccessInfo( local_accessInfo.getRaw());
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
    public void setFileId( String _fileId )
    {
        this.local_fileId = _fileId;
    }
    public String getFileId( )
    {
        return this.local_fileId;
    }
    public void setWarning( String _warning )
    {
        this.local_warning = _warning;
    }
    public String getWarning( )
    {
        return this.local_warning;
    }
    public void setAccessInfo( DFUFileAccessInfoWrapper _accessInfo )
    {
        this.local_accessInfo = _accessInfo;
    }
    public DFUFileAccessInfoWrapper getAccessInfo( )
    {
        return this.local_accessInfo;
    }
}