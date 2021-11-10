package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Class name: ArrayOfDFULogicalFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.ArrayOfDFULogicalFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-03-24T23:14:30.118Z
 */
public class ArrayOfDFULogicalFileWrapper
{
    protected List<DFULogicalFileWrapper> local_dFULogicalFile = null;

    public ArrayOfDFULogicalFileWrapper() {}

    public ArrayOfDFULogicalFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ArrayOfDFULogicalFile arrayofdfulogicalfile)
    {
        copy( arrayofdfulogicalfile );
    }
    public ArrayOfDFULogicalFileWrapper( List<DFULogicalFileWrapper> _dFULogicalFile )
    {
        this.local_dFULogicalFile = _dFULogicalFile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ArrayOfDFULogicalFile raw )
    {
        if (raw == null)
            return;

        if (raw.getDFULogicalFile() != null)
        {
            this.local_dFULogicalFile = new ArrayList<DFULogicalFileWrapper>();
            for ( int i = 0; i < raw.getDFULogicalFile().length; i++)
            {
                this.local_dFULogicalFile.add(new DFULogicalFileWrapper(raw.getDFULogicalFile()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFULogicalFileWrapper [" + "dFULogicalFile = " + local_dFULogicalFile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ArrayOfDFULogicalFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ArrayOfDFULogicalFile raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ArrayOfDFULogicalFile();
        if (this.local_dFULogicalFile!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile[this.local_dFULogicalFile.size()];
            for ( int i = 0; i < this.local_dFULogicalFile.size(); i++)
            {
                arr[i] = this.local_dFULogicalFile.get(i) .getRaw();
            }
            raw.setDFULogicalFile(arr);
        }
        return raw;
    }


    public void setDFULogicalFile( List<DFULogicalFileWrapper> _dFULogicalFile )
    {
        this.local_dFULogicalFile = _dFULogicalFile;
    }
    public List<DFULogicalFileWrapper> getDFULogicalFile( )
    {
        return this.local_dFULogicalFile;
    }
}