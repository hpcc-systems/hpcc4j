package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;

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
 * Class name: WUQueryConfigResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUQueryConfigResultWrapper
{
    protected String local_queryId;

    public WUQueryConfigResultWrapper() {}

    public WUQueryConfigResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResult wuqueryconfigresult)
    {
        copy( wuqueryconfigresult );
    }
    public WUQueryConfigResultWrapper( String _queryId )
    {
        this.local_queryId = _queryId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResult raw )
    {
        if (raw == null)
            return;

        this.local_queryId = raw.getQueryId();

    }

    @Override
    public String toString()
    {
        return "WUQueryConfigResultWrapper [" + "queryId = " + local_queryId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResult();
        raw.setQueryId( local_queryId);
        return raw;
    }


    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
}