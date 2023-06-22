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
 * Class name: FetchKeyMDResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class FetchKeyMDResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_storeName;
    protected String local_namespace;
    protected String local_key;
    protected Pairs_type1Wrapper local_pairs;

    public FetchKeyMDResponseWrapper() {}

    public FetchKeyMDResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDResponse fetchkeymdresponse)
    {
        copy( fetchkeymdresponse );
    }
    public FetchKeyMDResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _storeName, String _namespace, String _key, Pairs_type1Wrapper _pairs )
    {
        this.local_exceptions = _exceptions;
        this.local_storeName = _storeName;
        this.local_namespace = _namespace;
        this.local_key = _key;
        this.local_pairs = _pairs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_storeName = raw.getStoreName();
        this.local_namespace = raw.getNamespace();
        this.local_key = raw.getKey();
        if (raw.getPairs() != null)
            this.local_pairs = new Pairs_type1Wrapper( raw.getPairs());

    }

    @Override
    public String toString()
    {
        return "FetchKeyMDResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "storeName = " + local_storeName + ", " + "namespace = " + local_namespace + ", " + "key = " + local_key + ", " + "pairs = " + local_pairs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setStoreName( local_storeName);
        raw.setNamespace( local_namespace);
        raw.setKey( local_key);
        if (local_pairs != null)
            raw.setPairs( local_pairs.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setStoreName( String _storeName )
    {
        this.local_storeName = _storeName;
    }
    public String getStoreName( )
    {
        return this.local_storeName;
    }
    public void setNamespace( String _namespace )
    {
        this.local_namespace = _namespace;
    }
    public String getNamespace( )
    {
        return this.local_namespace;
    }
    public void setKey( String _key )
    {
        this.local_key = _key;
    }
    public String getKey( )
    {
        return this.local_key;
    }
    public void setPairs( Pairs_type1Wrapper _pairs )
    {
        this.local_pairs = _pairs;
    }
    public Pairs_type1Wrapper getPairs( )
    {
        return this.local_pairs;
    }
}