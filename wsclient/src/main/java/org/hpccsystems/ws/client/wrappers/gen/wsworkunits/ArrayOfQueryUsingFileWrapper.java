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
 * Class name: ArrayOfQueryUsingFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryUsingFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.790Z
 */
public class ArrayOfQueryUsingFileWrapper
{
    protected List<QueryUsingFileWrapper> local_queryUsingFile = null;

    public ArrayOfQueryUsingFileWrapper() {}

    public ArrayOfQueryUsingFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryUsingFile arrayofqueryusingfile)
    {
        copy( arrayofqueryusingfile );
    }
    public ArrayOfQueryUsingFileWrapper( List<QueryUsingFileWrapper> _queryUsingFile )
    {
        this.local_queryUsingFile = _queryUsingFile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryUsingFile raw )
    {
        if (raw == null)
            return;

        if (raw.getQueryUsingFile() != null)
        {
            this.local_queryUsingFile = new ArrayList<QueryUsingFileWrapper>();
            for ( int i = 0; i < raw.getQueryUsingFile().length; i++)
            {
                this.local_queryUsingFile.add(new QueryUsingFileWrapper(raw.getQueryUsingFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfQueryUsingFileWrapper [" + "queryUsingFile = " + local_queryUsingFile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryUsingFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryUsingFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryUsingFile();
        if (this.local_queryUsingFile!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryUsingFile[this.local_queryUsingFile.size()];
            for ( int i = 0; i < this.local_queryUsingFile.size(); i++)
            {
                arr[i] = this.local_queryUsingFile.get(i) .getRaw();
            }
            raw.setQueryUsingFile(arr);
        }
        return raw;
    }


    public void setQueryUsingFile( List<QueryUsingFileWrapper> _queryUsingFile )
    {
        this.local_queryUsingFile = _queryUsingFile;
    }
    public List<QueryUsingFileWrapper> getQueryUsingFile( )
    {
        return this.local_queryUsingFile;
    }
}