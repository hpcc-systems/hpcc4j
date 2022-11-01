package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUXRefUnusedFilesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2022-10-28T23:08:36.470Z
 */
public class DFUXRefUnusedFilesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected UnsignedInt local_unusedFileCount;
    protected UnusedFiles_type0Wrapper local_unusedFiles;
    protected ArrayOfDFULogicalFileWrapper local_unusedFilesWithDetails;

    public DFUXRefUnusedFilesResponseWrapper() {}

    public DFUXRefUnusedFilesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse dfuxrefunusedfilesresponse)
    {
        copy( dfuxrefunusedfilesresponse );
    }
    public DFUXRefUnusedFilesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, UnsignedInt _unusedFileCount, UnusedFiles_type0Wrapper _unusedFiles, ArrayOfDFULogicalFileWrapper _unusedFilesWithDetails )
    {
        this.local_exceptions = _exceptions;
        this.local_unusedFileCount = _unusedFileCount;
        this.local_unusedFiles = _unusedFiles;
        this.local_unusedFilesWithDetails = _unusedFilesWithDetails;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_unusedFileCount = raw.getUnusedFileCount();
        if (raw.getUnusedFiles() != null)
            this.local_unusedFiles = new UnusedFiles_type0Wrapper( raw.getUnusedFiles());
        if (raw.getUnusedFilesWithDetails() != null)
            this.local_unusedFilesWithDetails = new ArrayOfDFULogicalFileWrapper( raw.getUnusedFilesWithDetails());

    }

    @Override
    public String toString()
    {
        return "DFUXRefUnusedFilesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "unusedFileCount = " + local_unusedFileCount + ", " + "unusedFiles = " + local_unusedFiles + ", " + "unusedFilesWithDetails = " + local_unusedFilesWithDetails + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setUnusedFileCount( local_unusedFileCount);
        raw.setUnusedFiles( local_unusedFiles.getRaw());
        raw.setUnusedFilesWithDetails( local_unusedFilesWithDetails.getRaw());
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
    public void setUnusedFileCount( UnsignedInt _unusedFileCount )
    {
        this.local_unusedFileCount = _unusedFileCount;
    }
    public UnsignedInt getUnusedFileCount( )
    {
        return this.local_unusedFileCount;
    }
    public void setUnusedFiles( UnusedFiles_type0Wrapper _unusedFiles )
    {
        this.local_unusedFiles = _unusedFiles;
    }
    public UnusedFiles_type0Wrapper getUnusedFiles( )
    {
        return this.local_unusedFiles;
    }
    public void setUnusedFilesWithDetails( ArrayOfDFULogicalFileWrapper _unusedFilesWithDetails )
    {
        this.local_unusedFilesWithDetails = _unusedFilesWithDetails;
    }
    public ArrayOfDFULogicalFileWrapper getUnusedFilesWithDetails( )
    {
        return this.local_unusedFilesWithDetails;
    }
}