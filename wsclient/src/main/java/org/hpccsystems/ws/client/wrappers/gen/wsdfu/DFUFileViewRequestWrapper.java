package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUFileViewRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.281Z
 */
public class DFUFileViewRequestWrapper
{
    protected String local_scope;
    protected boolean local_includeSuperOwner;

    public DFUFileViewRequestWrapper() {}

    public DFUFileViewRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest dfufileviewrequest)
    {
        copy( dfufileviewrequest );
    }
    public DFUFileViewRequestWrapper( String _scope, boolean _includeSuperOwner )
    {
        this.local_scope = _scope;
        this.local_includeSuperOwner = _includeSuperOwner;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest raw )
    {
        if (raw == null)
            return;

        this.local_scope = raw.getScope();
        this.local_includeSuperOwner = raw.getIncludeSuperOwner();

    }

    @Override
    public String toString()
    {
        return "DFUFileViewRequestWrapper [" + "scope = " + local_scope + ", " + "includeSuperOwner = " + local_includeSuperOwner + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileViewRequest();
        raw.setScope( local_scope);
        raw.setIncludeSuperOwner( local_includeSuperOwner);
        return raw;
    }


    public void setScope( String _scope )
    {
        this.local_scope = _scope;
    }
    public String getScope( )
    {
        return this.local_scope;
    }
    public void setIncludeSuperOwner( boolean _includeSuperOwner )
    {
        this.local_includeSuperOwner = _includeSuperOwner;
    }
    public boolean getIncludeSuperOwner( )
    {
        return this.local_includeSuperOwner;
    }
}