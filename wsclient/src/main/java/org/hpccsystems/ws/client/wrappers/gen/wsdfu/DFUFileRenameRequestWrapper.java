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
 * Class name: DFUFileRenameRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFileRenameRequestWrapper
{
    protected ArrayOfDFUFileRenameItemWrapper local_fileRenames;

    public DFUFileRenameRequestWrapper() {}

    public DFUFileRenameRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameRequest dfufilerenamerequest)
    {
        copy( dfufilerenamerequest );
    }
    public DFUFileRenameRequestWrapper( ArrayOfDFUFileRenameItemWrapper _fileRenames )
    {
        this.local_fileRenames = _fileRenames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getFileRenames() != null)
            this.local_fileRenames = new ArrayOfDFUFileRenameItemWrapper( raw.getFileRenames());

    }

    @Override
    public String toString()
    {
        return "DFUFileRenameRequestWrapper [" + "fileRenames = " + local_fileRenames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileRenameRequest();
        if (local_fileRenames != null)
            raw.setFileRenames( local_fileRenames.getRaw());
        return raw;
    }


    public void setFileRenames( ArrayOfDFUFileRenameItemWrapper _fileRenames )
    {
        this.local_fileRenames = _fileRenames;
    }
    public ArrayOfDFUFileRenameItemWrapper getFileRenames( )
    {
        return this.local_fileRenames;
    }
}