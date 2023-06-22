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
 * Class name: Pairs_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class Pairs_type0Wrapper
{
    protected List<KVPairWrapper> local_pair = null;

    public Pairs_type0Wrapper() {}

    public Pairs_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type0 pairs_type0)
    {
        copy( pairs_type0 );
    }
    public Pairs_type0Wrapper( List<KVPairWrapper> _pair )
    {
        this.local_pair = _pair;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getPair() != null)
        {
            this.local_pair = new ArrayList<KVPairWrapper>();
            for ( int i = 0; i < raw.getPair().length; i++)
            {
                this.local_pair.add(new KVPairWrapper(raw.getPair()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Pairs_type0Wrapper [" + "pair = " + local_pair + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Pairs_type0();
        if (this.local_pair!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair[] arr = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair[this.local_pair.size()];
            for ( int i = 0; i < this.local_pair.size(); i++)
            {
                arr[i] = this.local_pair.get(i) .getRaw();
            }
            raw.setPair(arr);
        }
        return raw;
    }


    public void setPair( List<KVPairWrapper> _pair )
    {
        this.local_pair = _pair;
    }
    public List<KVPairWrapper> getPair( )
    {
        return this.local_pair;
    }
}