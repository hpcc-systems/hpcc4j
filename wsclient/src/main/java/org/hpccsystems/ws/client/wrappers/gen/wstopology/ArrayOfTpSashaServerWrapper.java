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
 * Class name: ArrayOfTpSashaServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSashaServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class ArrayOfTpSashaServerWrapper
{
    protected List<TpSashaServerWrapper> local_tpSashaServer = null;

    public ArrayOfTpSashaServerWrapper() {}

    public ArrayOfTpSashaServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSashaServer arrayoftpsashaserver)
    {
        copy( arrayoftpsashaserver );
    }
    public ArrayOfTpSashaServerWrapper( List<TpSashaServerWrapper> _tpSashaServer )
    {
        this.local_tpSashaServer = _tpSashaServer;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSashaServer raw )
    {
        if (raw == null)
            return;

        if (raw.getTpSashaServer() != null)
        {
            this.local_tpSashaServer = new ArrayList<TpSashaServerWrapper>();
            for ( int i = 0; i < raw.getTpSashaServer().length; i++)
            {
                this.local_tpSashaServer.add(new TpSashaServerWrapper(raw.getTpSashaServer()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpSashaServerWrapper [" + "tpSashaServer = " + local_tpSashaServer + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSashaServer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSashaServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpSashaServer();
        if (this.local_tpSashaServer!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSashaServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSashaServer[this.local_tpSashaServer.size()];
            for ( int i = 0; i < this.local_tpSashaServer.size(); i++)
            {
                arr[i] = this.local_tpSashaServer.get(i) .getRaw();
            }
            raw.setTpSashaServer(arr);
        }
        return raw;
    }


    public void setTpSashaServer( List<TpSashaServerWrapper> _tpSashaServer )
    {
        this.local_tpSashaServer = _tpSashaServer;
    }
    public List<TpSashaServerWrapper> getTpSashaServer( )
    {
        return this.local_tpSashaServer;
    }
}