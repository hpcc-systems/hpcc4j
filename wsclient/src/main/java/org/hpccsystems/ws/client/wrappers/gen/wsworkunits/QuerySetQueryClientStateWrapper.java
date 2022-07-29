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
 * Class name: QuerySetQueryClientStateWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryClientState
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.856Z
 */
public class QuerySetQueryClientStateWrapper
{
    protected String local_suspended;

    public QuerySetQueryClientStateWrapper() {}

    public QuerySetQueryClientStateWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryClientState querysetqueryclientstate)
    {
        copy( querysetqueryclientstate );
    }
    public QuerySetQueryClientStateWrapper( String _suspended )
    {
        this.local_suspended = _suspended;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryClientState raw )
    {
        if (raw == null)
            return;

        this.local_suspended = raw.getSuspended();

    }

    @Override
    public String toString()
    {
        return "QuerySetQueryClientStateWrapper [" + "suspended = " + local_suspended + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryClientState getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryClientState raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryClientState();
        raw.setSuspended( local_suspended);
        return raw;
    }


    public void setSuspended( String _suspended )
    {
        this.local_suspended = _suspended;
    }
    public String getSuspended( )
    {
        return this.local_suspended;
    }
}