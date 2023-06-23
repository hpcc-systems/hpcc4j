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
 * Class name: Namespaces_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Namespaces_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class Namespaces_type0Wrapper
{
    protected List<String> local_namespace = null;

    public Namespaces_type0Wrapper() {}

    public Namespaces_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Namespaces_type0 namespaces_type0)
    {
        copy( namespaces_type0 );
    }
    public Namespaces_type0Wrapper( List<String> _namespace )
    {
        this.local_namespace = _namespace;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Namespaces_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getNamespace() != null)
        {
            this.local_namespace = new ArrayList<String>();
            for ( int i = 0; i < raw.getNamespace().length; i++)
            {
                this.local_namespace.add(new String(raw.getNamespace()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Namespaces_type0Wrapper [" + "namespace = " + local_namespace + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Namespaces_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Namespaces_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.Namespaces_type0();
        if (this.local_namespace!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_namespace.size()];
            for ( int i = 0; i < this.local_namespace.size(); i++)
            {
                arr[i] = this.local_namespace.get(i) ;
            }
            raw.setNamespace(arr);
        }
        return raw;
    }


    public void setNamespace( List<String> _namespace )
    {
        this.local_namespace = _namespace;
    }
    public List<String> getNamespace( )
    {
        return this.local_namespace;
    }
}