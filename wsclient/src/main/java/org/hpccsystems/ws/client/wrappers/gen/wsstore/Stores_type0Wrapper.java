package org.hpccsystems.ws.client.wrappers.gen.wsstore;

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
 * Class name: Stores_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Stores_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class Stores_type0Wrapper
{
    protected List<StoreInfoWrapper> local_store = null;

    public Stores_type0Wrapper() {}

    public Stores_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Stores_type0 stores_type0)
    {
        copy( stores_type0 );
    }
    public Stores_type0Wrapper( List<StoreInfoWrapper> _store )
    {
        this.local_store = _store;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Stores_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getStore() != null)
        {
            this.local_store = new ArrayList<StoreInfoWrapper>();
            for ( int i = 0; i < raw.getStore().length; i++)
            {
                this.local_store.add(new StoreInfoWrapper(raw.getStore()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Stores_type0Wrapper [" + "store = " + local_store + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Stores_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Stores_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Stores_type0();
        if (this.local_store!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo[this.local_store.size()];
            for ( int i = 0; i < this.local_store.size(); i++)
            {
                arr[i] = this.local_store.get(i) .getRaw();
            }
            raw.setStore(arr);
        }
        return raw;
    }


    public void setStore( List<StoreInfoWrapper> _store )
    {
        this.local_store = _store;
    }
    public List<StoreInfoWrapper> getStore( )
    {
        return this.local_store;
    }
}