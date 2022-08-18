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
 * Class name: ArrayOfTargetQueriesUsingFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfTargetQueriesUsingFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.792Z
 */
public class ArrayOfTargetQueriesUsingFileWrapper
{
    protected List<TargetQueriesUsingFileWrapper> local_targetQueriesUsingFile = null;

    public ArrayOfTargetQueriesUsingFileWrapper() {}

    public ArrayOfTargetQueriesUsingFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfTargetQueriesUsingFile arrayoftargetqueriesusingfile)
    {
        copy( arrayoftargetqueriesusingfile );
    }
    public ArrayOfTargetQueriesUsingFileWrapper( List<TargetQueriesUsingFileWrapper> _targetQueriesUsingFile )
    {
        this.local_targetQueriesUsingFile = _targetQueriesUsingFile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfTargetQueriesUsingFile raw )
    {
        if (raw == null)
            return;

        if (raw.getTargetQueriesUsingFile() != null)
        {
            this.local_targetQueriesUsingFile = new ArrayList<TargetQueriesUsingFileWrapper>();
            for ( int i = 0; i < raw.getTargetQueriesUsingFile().length; i++)
            {
                this.local_targetQueriesUsingFile.add(new TargetQueriesUsingFileWrapper(raw.getTargetQueriesUsingFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTargetQueriesUsingFileWrapper [" + "targetQueriesUsingFile = " + local_targetQueriesUsingFile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfTargetQueriesUsingFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfTargetQueriesUsingFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfTargetQueriesUsingFile();
        if (this.local_targetQueriesUsingFile!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TargetQueriesUsingFile[this.local_targetQueriesUsingFile.size()];
            for ( int i = 0; i < this.local_targetQueriesUsingFile.size(); i++)
            {
                arr[i] = this.local_targetQueriesUsingFile.get(i) .getRaw();
            }
            raw.setTargetQueriesUsingFile(arr);
        }
        return raw;
    }


    public void setTargetQueriesUsingFile( List<TargetQueriesUsingFileWrapper> _targetQueriesUsingFile )
    {
        this.local_targetQueriesUsingFile = _targetQueriesUsingFile;
    }
    public List<TargetQueriesUsingFileWrapper> getTargetQueriesUsingFile( )
    {
        return this.local_targetQueriesUsingFile;
    }
}