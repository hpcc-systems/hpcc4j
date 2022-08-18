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
 * Class name: SuperFiles_type3Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SuperFiles_type3
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.871Z
 */
public class SuperFiles_type3Wrapper
{
    protected List<QuerySuperFileWrapper> local_superFile = null;

    public SuperFiles_type3Wrapper() {}

    public SuperFiles_type3Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SuperFiles_type3 superfiles_type3)
    {
        copy( superfiles_type3 );
    }
    public SuperFiles_type3Wrapper( List<QuerySuperFileWrapper> _superFile )
    {
        this.local_superFile = _superFile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SuperFiles_type3 raw )
    {
        if (raw == null)
            return;

        if (raw.getSuperFile() != null)
        {
            this.local_superFile = new ArrayList<QuerySuperFileWrapper>();
            for ( int i = 0; i < raw.getSuperFile().length; i++)
            {
                this.local_superFile.add(new QuerySuperFileWrapper(raw.getSuperFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "SuperFiles_type3Wrapper [" + "superFile = " + local_superFile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SuperFiles_type3 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SuperFiles_type3 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SuperFiles_type3();
        if (this.local_superFile!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile[this.local_superFile.size()];
            for ( int i = 0; i < this.local_superFile.size(); i++)
            {
                arr[i] = this.local_superFile.get(i) .getRaw();
            }
            raw.setSuperFile(arr);
        }
        return raw;
    }


    public void setSuperFile( List<QuerySuperFileWrapper> _superFile )
    {
        this.local_superFile = _superFile;
    }
    public List<QuerySuperFileWrapper> getSuperFile( )
    {
        return this.local_superFile;
    }
}