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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: ArrayOfSuperFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfSuperFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * Service version: 1.05
 */
public class ArrayOfSuperFileWrapper
{
    protected List<SuperFileWrapper> local_superFile = null;

    public ArrayOfSuperFileWrapper() {}

    public ArrayOfSuperFileWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfSuperFile arrayofsuperfile)
    {
        copy( arrayofsuperfile );
    }
    public ArrayOfSuperFileWrapper( List<SuperFileWrapper> _superFile )
    {
        this.local_superFile = _superFile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfSuperFile raw )
    {
        if (raw == null)
            return;

        if (raw.getSuperFile() != null)
        {
            this.local_superFile = new ArrayList<SuperFileWrapper>();
            for ( int i = 0; i < raw.getSuperFile().length; i++)
            {
                this.local_superFile.add(new SuperFileWrapper(raw.getSuperFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfSuperFileWrapper [" + "superFile = " + local_superFile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfSuperFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfSuperFile raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ArrayOfSuperFile();
        if (this.local_superFile!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.SuperFile[] arr = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.SuperFile[this.local_superFile.size()];
            for ( int i = 0; i < this.local_superFile.size(); i++)
            {
                arr[i] = this.local_superFile.get(i) .getRaw();
            }
            raw.setSuperFile(arr);
        }
        return raw;
    }


    public void setSuperFile( List<SuperFileWrapper> _superFile )
    {
        this.local_superFile = _superFile;
    }
    public List<SuperFileWrapper> getSuperFile( )
    {
        return this.local_superFile;
    }
}