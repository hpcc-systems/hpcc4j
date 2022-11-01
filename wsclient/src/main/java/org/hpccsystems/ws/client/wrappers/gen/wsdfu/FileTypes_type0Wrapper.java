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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: FileTypes_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileTypes_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * Service version: 1.64
 */
public class FileTypes_type0Wrapper
{
    protected List<String> local_fileType = null;

    public FileTypes_type0Wrapper() {}

    public FileTypes_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileTypes_type0 filetypes_type0)
    {
        copy( filetypes_type0 );
    }
    public FileTypes_type0Wrapper( List<String> _fileType )
    {
        this.local_fileType = _fileType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileTypes_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getFileType() != null)
        {
            this.local_fileType = new ArrayList<String>();
            for ( int i = 0; i < raw.getFileType().length; i++)
            {
                this.local_fileType.add(new String(raw.getFileType()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "FileTypes_type0Wrapper [" + "fileType = " + local_fileType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileTypes_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileTypes_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.FileTypes_type0();
        if (this.local_fileType!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_fileType.size()];
            for ( int i = 0; i < this.local_fileType.size(); i++)
            {
                arr[i] = this.local_fileType.get(i) ;
            }
            raw.setFileType(arr);
        }
        return raw;
    }


    public void setFileType( List<String> _fileType )
    {
        this.local_fileType = _fileType;
    }
    public List<String> getFileType( )
    {
        return this.local_fileType;
    }
}