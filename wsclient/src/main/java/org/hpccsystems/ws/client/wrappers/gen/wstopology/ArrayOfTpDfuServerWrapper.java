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
 * Class name: ArrayOfTpDfuServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDfuServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2021-10-27T23:40:06.308Z
 */
public class ArrayOfTpDfuServerWrapper
{
    protected List<TpDfuServerWrapper> local_tpDfuServer = null;

    public ArrayOfTpDfuServerWrapper() {}

    public ArrayOfTpDfuServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDfuServer arrayoftpdfuserver)
    {
        copy( arrayoftpdfuserver );
    }
    public ArrayOfTpDfuServerWrapper( List<TpDfuServerWrapper> _tpDfuServer )
    {
        this.local_tpDfuServer = _tpDfuServer;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDfuServer raw )
    {
        if (raw == null)
            return;

        if (raw.getTpDfuServer() != null)
        {
            this.local_tpDfuServer = new ArrayList<TpDfuServerWrapper>();
            for ( int i = 0; i < raw.getTpDfuServer().length; i++)
            {
                this.local_tpDfuServer.add(new TpDfuServerWrapper(raw.getTpDfuServer()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpDfuServerWrapper [" + "tpDfuServer = " + local_tpDfuServer + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDfuServer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDfuServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpDfuServer();
        if (this.local_tpDfuServer!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer[this.local_tpDfuServer.size()];
            for ( int i = 0; i < this.local_tpDfuServer.size(); i++)
            {
                arr[i] = this.local_tpDfuServer.get(i) .getRaw();
            }
            raw.setTpDfuServer(arr);
        }
        return raw;
    }


    public void setTpDfuServer( List<TpDfuServerWrapper> _tpDfuServer )
    {
        this.local_tpDfuServer = _tpDfuServer;
    }
    public List<TpDfuServerWrapper> getTpDfuServer( )
    {
        return this.local_tpDfuServer;
    }
}