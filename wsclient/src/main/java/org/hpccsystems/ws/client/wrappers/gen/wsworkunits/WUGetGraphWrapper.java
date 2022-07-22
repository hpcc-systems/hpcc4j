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
 * Class name: WUGetGraphWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraph
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.916Z
 */
public class WUGetGraphWrapper
{
    protected String local_wuid;
    protected String local_graphName;
    protected String local_subGraphId;

    public WUGetGraphWrapper() {}

    public WUGetGraphWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraph wugetgraph)
    {
        copy( wugetgraph );
    }
    public WUGetGraphWrapper( String _wuid, String _graphName, String _subGraphId )
    {
        this.local_wuid = _wuid;
        this.local_graphName = _graphName;
        this.local_subGraphId = _subGraphId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraph raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_graphName = raw.getGraphName();
        this.local_subGraphId = raw.getSubGraphId();

    }

    @Override
    public String toString()
    {
        return "WUGetGraphWrapper [" + "wuid = " + local_wuid + ", " + "graphName = " + local_graphName + ", " + "subGraphId = " + local_subGraphId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraph getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraph raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraph();
        raw.setWuid( local_wuid);
        raw.setGraphName( local_graphName);
        raw.setSubGraphId( local_subGraphId);
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
    public void setGraphName( String _graphName )
    {
        this.local_graphName = _graphName;
    }
    public String getGraphName( )
    {
        return this.local_graphName;
    }
    public void setSubGraphId( String _subGraphId )
    {
        this.local_subGraphId = _subGraphId;
    }
    public String getSubGraphId( )
    {
        return this.local_subGraphId;
    }
}