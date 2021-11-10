package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: ArrayOfTpClusterNameTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpClusterNameType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2021-10-27T23:40:06.306Z
 */
public class ArrayOfTpClusterNameTypeWrapper
{
    protected List<TpClusterNameTypeWrapper> local_tpClusterNameType = null;

    public ArrayOfTpClusterNameTypeWrapper() {}

    public ArrayOfTpClusterNameTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpClusterNameType arrayoftpclusternametype)
    {
        copy( arrayoftpclusternametype );
    }
    public ArrayOfTpClusterNameTypeWrapper( List<TpClusterNameTypeWrapper> _tpClusterNameType )
    {
        this.local_tpClusterNameType = _tpClusterNameType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpClusterNameType raw )
    {
        if (raw == null)
            return;

        if (raw.getTpClusterNameType() != null)
        {
            this.local_tpClusterNameType = new ArrayList<TpClusterNameTypeWrapper>();
            for ( int i = 0; i < raw.getTpClusterNameType().length; i++)
            {
                this.local_tpClusterNameType.add(new TpClusterNameTypeWrapper(raw.getTpClusterNameType()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpClusterNameTypeWrapper [" + "tpClusterNameType = " + local_tpClusterNameType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpClusterNameType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpClusterNameType raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpClusterNameType();
        if (this.local_tpClusterNameType!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType[this.local_tpClusterNameType.size()];
            for ( int i = 0; i < this.local_tpClusterNameType.size(); i++)
            {
                arr[i] = this.local_tpClusterNameType.get(i) .getRaw();
            }
            raw.setTpClusterNameType(arr);
        }
        return raw;
    }


    public void setTpClusterNameType( List<TpClusterNameTypeWrapper> _tpClusterNameType )
    {
        this.local_tpClusterNameType = _tpClusterNameType;
    }
    public List<TpClusterNameTypeWrapper> getTpClusterNameType( )
    {
        return this.local_tpClusterNameType;
    }
}