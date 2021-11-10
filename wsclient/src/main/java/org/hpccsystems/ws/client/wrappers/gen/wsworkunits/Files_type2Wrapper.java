package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: Files_type2Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_83.Files_type2
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2021-09-30T21:52:48.404Z
 */
public class Files_type2Wrapper
{
    protected List<FileUsedByQueryWrapper> local_file = null;

    public Files_type2Wrapper() {}

    public Files_type2Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Files_type2 files_type2)
    {
        copy( files_type2 );
    }
    public Files_type2Wrapper( List<FileUsedByQueryWrapper> _file )
    {
        this.local_file = _file;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Files_type2 raw )
    {
        if (raw == null)
            return;

        if (raw.getFile() != null)
        {
            this.local_file = new ArrayList<FileUsedByQueryWrapper>();
            for ( int i = 0; i < raw.getFile().length; i++)
            {
                this.local_file.add(new FileUsedByQueryWrapper(raw.getFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Files_type2Wrapper [" + "file = " + local_file + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Files_type2 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Files_type2 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Files_type2();
        if (this.local_file!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery[this.local_file.size()];
            for ( int i = 0; i < this.local_file.size(); i++)
            {
                arr[i] = this.local_file.get(i) .getRaw();
            }
            raw.setFile(arr);
        }
        return raw;
    }


    public void setFile( List<FileUsedByQueryWrapper> _file )
    {
        this.local_file = _file;
    }
    public List<FileUsedByQueryWrapper> getFile( )
    {
        return this.local_file;
    }
}