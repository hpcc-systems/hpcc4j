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
 * Class name: ArrayOfDFUFileCopyWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileCopy
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.082Z
 */
public class ArrayOfDFUFileCopyWrapper
{
    protected List<DFUFileCopyWrapper> local_dFUFileCopy = null;

    public ArrayOfDFUFileCopyWrapper() {}

    public ArrayOfDFUFileCopyWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileCopy arrayofdfufilecopy)
    {
        copy( arrayofdfufilecopy );
    }
    public ArrayOfDFUFileCopyWrapper( List<DFUFileCopyWrapper> _dFUFileCopy )
    {
        this.local_dFUFileCopy = _dFUFileCopy;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileCopy raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUFileCopy() != null)
        {
            this.local_dFUFileCopy = new ArrayList<DFUFileCopyWrapper>();
            for ( int i = 0; i < raw.getDFUFileCopy().length; i++)
            {
                this.local_dFUFileCopy.add(new DFUFileCopyWrapper(raw.getDFUFileCopy()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUFileCopyWrapper [" + "dFUFileCopy = " + local_dFUFileCopy + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileCopy getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileCopy raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileCopy();
        if (this.local_dFUFileCopy!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCopy[this.local_dFUFileCopy.size()];
            for ( int i = 0; i < this.local_dFUFileCopy.size(); i++)
            {
                arr[i] = this.local_dFUFileCopy.get(i) .getRaw();
            }
            raw.setDFUFileCopy(arr);
        }
        return raw;
    }


    public void setDFUFileCopy( List<DFUFileCopyWrapper> _dFUFileCopy )
    {
        this.local_dFUFileCopy = _dFUFileCopy;
    }
    public List<DFUFileCopyWrapper> getDFUFileCopy( )
    {
        return this.local_dFUFileCopy;
    }
}