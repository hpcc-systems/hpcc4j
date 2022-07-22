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
 * Class name: ArrayOfECLHelpFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLHelpFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.777Z
 */
public class ArrayOfECLHelpFileWrapper
{
    protected List<ECLHelpFileWrapper> local_eCLHelpFile = null;

    public ArrayOfECLHelpFileWrapper() {}

    public ArrayOfECLHelpFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLHelpFile arrayofeclhelpfile)
    {
        copy( arrayofeclhelpfile );
    }
    public ArrayOfECLHelpFileWrapper( List<ECLHelpFileWrapper> _eCLHelpFile )
    {
        this.local_eCLHelpFile = _eCLHelpFile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLHelpFile raw )
    {
        if (raw == null)
            return;

        if (raw.getECLHelpFile() != null)
        {
            this.local_eCLHelpFile = new ArrayList<ECLHelpFileWrapper>();
            for ( int i = 0; i < raw.getECLHelpFile().length; i++)
            {
                this.local_eCLHelpFile.add(new ECLHelpFileWrapper(raw.getECLHelpFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLHelpFileWrapper [" + "eCLHelpFile = " + local_eCLHelpFile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLHelpFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLHelpFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLHelpFile();
        if (this.local_eCLHelpFile!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile[this.local_eCLHelpFile.size()];
            for ( int i = 0; i < this.local_eCLHelpFile.size(); i++)
            {
                arr[i] = this.local_eCLHelpFile.get(i) .getRaw();
            }
            raw.setECLHelpFile(arr);
        }
        return raw;
    }


    public void setECLHelpFile( List<ECLHelpFileWrapper> _eCLHelpFile )
    {
        this.local_eCLHelpFile = _eCLHelpFile;
    }
    public List<ECLHelpFileWrapper> getECLHelpFile( )
    {
        return this.local_eCLHelpFile;
    }
}