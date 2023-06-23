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
 * Class name: ArrayOfTpDkcSlaveWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDkcSlave
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class ArrayOfTpDkcSlaveWrapper
{
    protected List<TpDkcSlaveWrapper> local_tpDkcSlave = null;

    public ArrayOfTpDkcSlaveWrapper() {}

    public ArrayOfTpDkcSlaveWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDkcSlave arrayoftpdkcslave)
    {
        copy( arrayoftpdkcslave );
    }
    public ArrayOfTpDkcSlaveWrapper( List<TpDkcSlaveWrapper> _tpDkcSlave )
    {
        this.local_tpDkcSlave = _tpDkcSlave;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDkcSlave raw )
    {
        if (raw == null)
            return;

        if (raw.getTpDkcSlave() != null)
        {
            this.local_tpDkcSlave = new ArrayList<TpDkcSlaveWrapper>();
            for ( int i = 0; i < raw.getTpDkcSlave().length; i++)
            {
                this.local_tpDkcSlave.add(new TpDkcSlaveWrapper(raw.getTpDkcSlave()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpDkcSlaveWrapper [" + "tpDkcSlave = " + local_tpDkcSlave + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDkcSlave getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDkcSlave raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDkcSlave();
        if (this.local_tpDkcSlave!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDkcSlave[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDkcSlave[this.local_tpDkcSlave.size()];
            for ( int i = 0; i < this.local_tpDkcSlave.size(); i++)
            {
                arr[i] = this.local_tpDkcSlave.get(i) .getRaw();
            }
            raw.setTpDkcSlave(arr);
        }
        return raw;
    }


    public void setTpDkcSlave( List<TpDkcSlaveWrapper> _tpDkcSlave )
    {
        this.local_tpDkcSlave = _tpDkcSlave;
    }
    public List<TpDkcSlaveWrapper> getTpDkcSlave( )
    {
        return this.local_tpDkcSlave;
    }
}