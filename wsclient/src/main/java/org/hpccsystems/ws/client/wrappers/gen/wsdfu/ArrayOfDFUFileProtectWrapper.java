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
 * Class name: ArrayOfDFUFileProtectWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * Service version: 1.64
 */
public class ArrayOfDFUFileProtectWrapper
{
    protected List<DFUFileProtectWrapper> local_dFUFileProtect = null;

    public ArrayOfDFUFileProtectWrapper() {}

    public ArrayOfDFUFileProtectWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect arrayofdfufileprotect)
    {
        copy( arrayofdfufileprotect );
    }
    public ArrayOfDFUFileProtectWrapper( List<DFUFileProtectWrapper> _dFUFileProtect )
    {
        this.local_dFUFileProtect = _dFUFileProtect;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUFileProtect() != null)
        {
            this.local_dFUFileProtect = new ArrayList<DFUFileProtectWrapper>();
            for ( int i = 0; i < raw.getDFUFileProtect().length; i++)
            {
                this.local_dFUFileProtect.add(new DFUFileProtectWrapper(raw.getDFUFileProtect()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUFileProtectWrapper [" + "dFUFileProtect = " + local_dFUFileProtect + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect();
        if (this.local_dFUFileProtect!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileProtect[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileProtect[this.local_dFUFileProtect.size()];
            for ( int i = 0; i < this.local_dFUFileProtect.size(); i++)
            {
                arr[i] = this.local_dFUFileProtect.get(i) .getRaw();
            }
            raw.setDFUFileProtect(arr);
        }
        return raw;
    }


    public void setDFUFileProtect( List<DFUFileProtectWrapper> _dFUFileProtect )
    {
        this.local_dFUFileProtect = _dFUFileProtect;
    }
    public List<DFUFileProtectWrapper> getDFUFileProtect( )
    {
        return this.local_dFUFileProtect;
    }
}