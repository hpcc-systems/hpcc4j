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
 * Class name: ArrayOfECLSourceFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLSourceFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.780Z
 */
public class ArrayOfECLSourceFileWrapper
{
    protected List<ECLSourceFileWrapper> local_eCLSourceFile = null;

    public ArrayOfECLSourceFileWrapper() {}

    public ArrayOfECLSourceFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLSourceFile arrayofeclsourcefile)
    {
        copy( arrayofeclsourcefile );
    }
    public ArrayOfECLSourceFileWrapper( List<ECLSourceFileWrapper> _eCLSourceFile )
    {
        this.local_eCLSourceFile = _eCLSourceFile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLSourceFile raw )
    {
        if (raw == null)
            return;

        if (raw.getECLSourceFile() != null)
        {
            this.local_eCLSourceFile = new ArrayList<ECLSourceFileWrapper>();
            for ( int i = 0; i < raw.getECLSourceFile().length; i++)
            {
                this.local_eCLSourceFile.add(new ECLSourceFileWrapper(raw.getECLSourceFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLSourceFileWrapper [" + "eCLSourceFile = " + local_eCLSourceFile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLSourceFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLSourceFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLSourceFile();
        if (this.local_eCLSourceFile!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSourceFile[this.local_eCLSourceFile.size()];
            for ( int i = 0; i < this.local_eCLSourceFile.size(); i++)
            {
                arr[i] = this.local_eCLSourceFile.get(i) .getRaw();
            }
            raw.setECLSourceFile(arr);
        }
        return raw;
    }


    public void setECLSourceFile( List<ECLSourceFileWrapper> _eCLSourceFile )
    {
        this.local_eCLSourceFile = _eCLSourceFile;
    }
    public List<ECLSourceFileWrapper> getECLSourceFile( )
    {
        return this.local_eCLSourceFile;
    }
}