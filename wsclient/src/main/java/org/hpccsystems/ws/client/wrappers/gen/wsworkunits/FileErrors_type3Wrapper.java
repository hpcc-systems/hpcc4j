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
 * WrapperMaker version: 1.7
 * Class name: FileErrors_type3Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type3
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * Service version: 1.92
 */
public class FileErrors_type3Wrapper
{
    protected List<LogicalFileErrorWrapper> local_file = null;

    public FileErrors_type3Wrapper() {}

    public FileErrors_type3Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type3 fileerrors_type3)
    {
        copy( fileerrors_type3 );
    }
    public FileErrors_type3Wrapper( List<LogicalFileErrorWrapper> _file )
    {
        this.local_file = _file;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type3 raw )
    {
        if (raw == null)
            return;

        if (raw.getFile() != null)
        {
            this.local_file = new ArrayList<LogicalFileErrorWrapper>();
            for ( int i = 0; i < raw.getFile().length; i++)
            {
                this.local_file.add(new LogicalFileErrorWrapper(raw.getFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "FileErrors_type3Wrapper [" + "file = " + local_file + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type3 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type3 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type3();
        if (this.local_file!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogicalFileError[this.local_file.size()];
            for ( int i = 0; i < this.local_file.size(); i++)
            {
                arr[i] = this.local_file.get(i) .getRaw();
            }
            raw.setFile(arr);
        }
        return raw;
    }


    public void setFile( List<LogicalFileErrorWrapper> _file )
    {
        this.local_file = _file;
    }
    public List<LogicalFileErrorWrapper> getFile( )
    {
        return this.local_file;
    }
}