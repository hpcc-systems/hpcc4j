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
 * Class name: WUProcessGraphWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraph
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.945Z
 */
public class WUProcessGraphWrapper
{
    protected String local_wuid;
    protected String local_name;

    public WUProcessGraphWrapper() {}

    public WUProcessGraphWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraph wuprocessgraph)
    {
        copy( wuprocessgraph );
    }
    public WUProcessGraphWrapper( String _wuid, String _name )
    {
        this.local_wuid = _wuid;
        this.local_name = _name;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraph raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_name = raw.getName();

    }

    @Override
    public String toString()
    {
        return "WUProcessGraphWrapper [" + "wuid = " + local_wuid + ", " + "name = " + local_name + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraph getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraph raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraph();
        raw.setWuid( local_wuid);
        raw.setName( local_name);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
}