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
 * Class name: KeySet_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KeySet_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class KeySet_type0Wrapper
{
    protected List<String> local_key = null;

    public KeySet_type0Wrapper() {}

    public KeySet_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KeySet_type0 keyset_type0)
    {
        copy( keyset_type0 );
    }
    public KeySet_type0Wrapper( List<String> _key )
    {
        this.local_key = _key;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KeySet_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getKey() != null)
        {
            this.local_key = new ArrayList<String>();
            for ( int i = 0; i < raw.getKey().length; i++)
            {
                this.local_key.add(new String(raw.getKey()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "KeySet_type0Wrapper [" + "key = " + local_key + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KeySet_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KeySet_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KeySet_type0();
        if (this.local_key!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_key.size()];
            for ( int i = 0; i < this.local_key.size(); i++)
            {
                arr[i] = this.local_key.get(i) ;
            }
            raw.setKey(arr);
        }
        return raw;
    }


    public void setKey( List<String> _key )
    {
        this.local_key = _key;
    }
    public List<String> getKey( )
    {
        return this.local_key;
    }
}