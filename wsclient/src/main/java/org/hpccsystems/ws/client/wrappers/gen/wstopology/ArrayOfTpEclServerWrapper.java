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
 * WrapperMaker version: 1.7
 * Class name: ArrayOfTpEclServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class ArrayOfTpEclServerWrapper
{
    protected List<TpEclServerWrapper> local_tpEclServer = null;

    public ArrayOfTpEclServerWrapper() {}

    public ArrayOfTpEclServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer arrayoftpeclserver)
    {
        copy( arrayoftpeclserver );
    }
    public ArrayOfTpEclServerWrapper( List<TpEclServerWrapper> _tpEclServer )
    {
        this.local_tpEclServer = _tpEclServer;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer raw )
    {
        if (raw == null)
            return;

        if (raw.getTpEclServer() != null)
        {
            this.local_tpEclServer = new ArrayList<TpEclServerWrapper>();
            for ( int i = 0; i < raw.getTpEclServer().length; i++)
            {
                this.local_tpEclServer.add(new TpEclServerWrapper(raw.getTpEclServer()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpEclServerWrapper [" + "tpEclServer = " + local_tpEclServer + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer();
        if (this.local_tpEclServer!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEclServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpEclServer[this.local_tpEclServer.size()];
            for ( int i = 0; i < this.local_tpEclServer.size(); i++)
            {
                arr[i] = this.local_tpEclServer.get(i) .getRaw();
            }
            raw.setTpEclServer(arr);
        }
        return raw;
    }


    public void setTpEclServer( List<TpEclServerWrapper> _tpEclServer )
    {
        this.local_tpEclServer = _tpEclServer;
    }
    public List<TpEclServerWrapper> getTpEclServer( )
    {
        return this.local_tpEclServer;
    }
}