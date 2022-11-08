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
 * WrapperMaker version: 1.7
 * Class name: ArrayOfDFUFilePartWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * Service version: 1.64
 */
public class ArrayOfDFUFilePartWrapper
{
    protected List<DFUFilePartWrapper> local_dFUFilePart = null;

    public ArrayOfDFUFilePartWrapper() {}

    public ArrayOfDFUFilePartWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart arrayofdfufilepart)
    {
        copy( arrayofdfufilepart );
    }
    public ArrayOfDFUFilePartWrapper( List<DFUFilePartWrapper> _dFUFilePart )
    {
        this.local_dFUFilePart = _dFUFilePart;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUFilePart() != null)
        {
            this.local_dFUFilePart = new ArrayList<DFUFilePartWrapper>();
            for ( int i = 0; i < raw.getDFUFilePart().length; i++)
            {
                this.local_dFUFilePart.add(new DFUFilePartWrapper(raw.getDFUFilePart()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUFilePartWrapper [" + "dFUFilePart = " + local_dFUFilePart + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart();
        if (this.local_dFUFilePart!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePart[this.local_dFUFilePart.size()];
            for ( int i = 0; i < this.local_dFUFilePart.size(); i++)
            {
                arr[i] = this.local_dFUFilePart.get(i) .getRaw();
            }
            raw.setDFUFilePart(arr);
        }
        return raw;
    }


    public void setDFUFilePart( List<DFUFilePartWrapper> _dFUFilePart )
    {
        this.local_dFUFilePart = _dFUFilePart;
    }
    public List<DFUFilePartWrapper> getDFUFilePart( )
    {
        return this.local_dFUFilePart;
    }
}