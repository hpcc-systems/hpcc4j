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
 * Class name: DFUFileViewResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.890Z
 */
public class DFUFileViewResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_scope;
    protected int local_numFiles;
    protected ArrayOfDFULogicalFileWrapper local_dFULogicalFiles;

    public DFUFileViewResponseWrapper() {}

    public DFUFileViewResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse dfufileviewresponse)
    {
        copy( dfufileviewresponse );
    }
    public DFUFileViewResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _scope, int _numFiles, ArrayOfDFULogicalFileWrapper _dFULogicalFiles )
    {
        this.local_exceptions = _exceptions;
        this.local_scope = _scope;
        this.local_numFiles = _numFiles;
        this.local_dFULogicalFiles = _dFULogicalFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_scope = raw.getScope();
        this.local_numFiles = raw.getNumFiles();
        if (raw.getDFULogicalFiles() != null)
            this.local_dFULogicalFiles = new ArrayOfDFULogicalFileWrapper( raw.getDFULogicalFiles());

    }

    @Override
    public String toString()
    {
        return "DFUFileViewResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "scope = " + local_scope + ", " + "numFiles = " + local_numFiles + ", " + "dFULogicalFiles = " + local_dFULogicalFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setScope( local_scope);
        raw.setNumFiles( local_numFiles);
        raw.setDFULogicalFiles( local_dFULogicalFiles.getRaw());
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
    public void setScope( String _scope )
    {
        this.local_scope = _scope;
    }
    public String getScope( )
    {
        return this.local_scope;
    }
    public void setNumFiles( int _numFiles )
    {
        this.local_numFiles = _numFiles;
    }
    public int getNumFiles( )
    {
        return this.local_numFiles;
    }
    public void setDFULogicalFiles( ArrayOfDFULogicalFileWrapper _dFULogicalFiles )
    {
        this.local_dFULogicalFiles = _dFULogicalFiles;
    }
    public ArrayOfDFULogicalFileWrapper getDFULogicalFiles( )
    {
        return this.local_dFULogicalFiles;
    }
}