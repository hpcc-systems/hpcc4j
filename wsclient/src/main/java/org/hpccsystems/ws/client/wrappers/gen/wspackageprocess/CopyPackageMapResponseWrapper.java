package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: CopyPackageMapResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-07-25T17:42:18.144Z
 */
public class CopyPackageMapResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected BasePackageStatusWrapper local_status;
    protected FilesNotFound_type0Wrapper local_filesNotFound;
    protected String local_dfuPublisherWuid;
    protected String local_dfuPublisherState;

    public CopyPackageMapResponseWrapper() {}

    public CopyPackageMapResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapResponse copypackagemapresponse)
    {
        copy( copypackagemapresponse );
    }
    public CopyPackageMapResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status, FilesNotFound_type0Wrapper _filesNotFound, String _dfuPublisherWuid, String _dfuPublisherState )
    {
        this.local_exceptions = _exceptions;
        this.local_status = _status;
        this.local_filesNotFound = _filesNotFound;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_dfuPublisherState = _dfuPublisherState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getStatus() != null)
            this.local_status = new BasePackageStatusWrapper( raw.getStatus());
        if (raw.getFilesNotFound() != null)
            this.local_filesNotFound = new FilesNotFound_type0Wrapper( raw.getFilesNotFound());
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_dfuPublisherState = raw.getDfuPublisherState();

    }

    @Override
    public String toString()
    {
        return "CopyPackageMapResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + ", " + "filesNotFound = " + local_filesNotFound + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "dfuPublisherState = " + local_dfuPublisherState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapResponse();
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setDfuPublisherState( local_dfuPublisherState);
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
    public void setStatus( BasePackageStatusWrapper _status )
    {
        this.local_status = _status;
    }
    public BasePackageStatusWrapper getStatus( )
    {
        return this.local_status;
    }
    public void setFilesNotFound( FilesNotFound_type0Wrapper _filesNotFound )
    {
        this.local_filesNotFound = _filesNotFound;
    }
    public FilesNotFound_type0Wrapper getFilesNotFound( )
    {
        return this.local_filesNotFound;
    }
    public void setDfuPublisherWuid( String _dfuPublisherWuid )
    {
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
    }
    public String getDfuPublisherWuid( )
    {
        return this.local_dfuPublisherWuid;
    }
    public void setDfuPublisherState( String _dfuPublisherState )
    {
        this.local_dfuPublisherState = _dfuPublisherState;
    }
    public String getDfuPublisherState( )
    {
        return this.local_dfuPublisherState;
    }
}