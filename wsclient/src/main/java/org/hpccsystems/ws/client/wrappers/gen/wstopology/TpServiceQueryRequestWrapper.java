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

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: TpServiceQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class TpServiceQueryRequestWrapper
{
    protected String local_type;

    public TpServiceQueryRequestWrapper() {}

    public TpServiceQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest tpservicequeryrequest)
    {
        copy( tpservicequeryrequest );
    }
    public TpServiceQueryRequestWrapper( String _type )
    {
        this.local_type = _type;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest raw )
    {
        if (raw == null)
            return;

        this.local_type = raw.getType();

    }

    @Override
    public String toString()
    {
        return "TpServiceQueryRequestWrapper [" + "type = " + local_type + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest();
        raw.setType( local_type);
        return raw;
    }


    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
}