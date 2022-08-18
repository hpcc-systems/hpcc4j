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
 * Class name: ArrayOfDFUFileBloomWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.082Z
 */
public class ArrayOfDFUFileBloomWrapper
{
    protected List<DFUFileBloomWrapper> local_dFUFileBloom = null;

    public ArrayOfDFUFileBloomWrapper() {}

    public ArrayOfDFUFileBloomWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom arrayofdfufilebloom)
    {
        copy( arrayofdfufilebloom );
    }
    public ArrayOfDFUFileBloomWrapper( List<DFUFileBloomWrapper> _dFUFileBloom )
    {
        this.local_dFUFileBloom = _dFUFileBloom;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUFileBloom() != null)
        {
            this.local_dFUFileBloom = new ArrayList<DFUFileBloomWrapper>();
            for ( int i = 0; i < raw.getDFUFileBloom().length; i++)
            {
                this.local_dFUFileBloom.add(new DFUFileBloomWrapper(raw.getDFUFileBloom()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUFileBloomWrapper [" + "dFUFileBloom = " + local_dFUFileBloom + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom();
        if (this.local_dFUFileBloom!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileBloom[this.local_dFUFileBloom.size()];
            for ( int i = 0; i < this.local_dFUFileBloom.size(); i++)
            {
                arr[i] = this.local_dFUFileBloom.get(i) .getRaw();
            }
            raw.setDFUFileBloom(arr);
        }
        return raw;
    }


    public void setDFUFileBloom( List<DFUFileBloomWrapper> _dFUFileBloom )
    {
        this.local_dFUFileBloom = _dFUFileBloom;
    }
    public List<DFUFileBloomWrapper> getDFUFileBloom( )
    {
        return this.local_dFUFileBloom;
    }
}