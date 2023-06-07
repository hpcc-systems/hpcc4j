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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: KVPairWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class KVPairWrapper
{
    protected String local_key;
    protected String local_value;

    public KVPairWrapper() {}

    public KVPairWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair kvpair)
    {
        copy( kvpair );
    }
    public KVPairWrapper( String _key, String _value )
    {
        this.local_key = _key;
        this.local_value = _value;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair raw )
    {
        if (raw == null)
            return;

        this.local_key = raw.getKey();
        this.local_value = raw.getValue();

    }

    @Override
    public String toString()
    {
        return "KVPairWrapper [" + "key = " + local_key + ", " + "value = " + local_value + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.KVPair();
        raw.setKey( local_key);
        raw.setValue( local_value);
        return raw;
    }


    public void setKey( String _key )
    {
        this.local_key = _key;
    }
    public String getKey( )
    {
        return this.local_key;
    }
    public void setValue( String _value )
    {
        this.local_value = _value;
    }
    public String getValue( )
    {
        return this.local_value;
    }
}