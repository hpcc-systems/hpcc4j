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
 * Class name: ArrayOfTpLdapServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLdapServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class ArrayOfTpLdapServerWrapper
{
    protected List<TpLdapServerWrapper> local_tpLdapServer = null;

    public ArrayOfTpLdapServerWrapper() {}

    public ArrayOfTpLdapServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLdapServer arrayoftpldapserver)
    {
        copy( arrayoftpldapserver );
    }
    public ArrayOfTpLdapServerWrapper( List<TpLdapServerWrapper> _tpLdapServer )
    {
        this.local_tpLdapServer = _tpLdapServer;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLdapServer raw )
    {
        if (raw == null)
            return;

        if (raw.getTpLdapServer() != null)
        {
            this.local_tpLdapServer = new ArrayList<TpLdapServerWrapper>();
            for ( int i = 0; i < raw.getTpLdapServer().length; i++)
            {
                this.local_tpLdapServer.add(new TpLdapServerWrapper(raw.getTpLdapServer()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpLdapServerWrapper [" + "tpLdapServer = " + local_tpLdapServer + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLdapServer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLdapServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLdapServer();
        if (this.local_tpLdapServer!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLdapServer[this.local_tpLdapServer.size()];
            for ( int i = 0; i < this.local_tpLdapServer.size(); i++)
            {
                arr[i] = this.local_tpLdapServer.get(i) .getRaw();
            }
            raw.setTpLdapServer(arr);
        }
        return raw;
    }


    public void setTpLdapServer( List<TpLdapServerWrapper> _tpLdapServer )
    {
        this.local_tpLdapServer = _tpLdapServer;
    }
    public List<TpLdapServerWrapper> getTpLdapServer( )
    {
        return this.local_tpLdapServer;
    }
}