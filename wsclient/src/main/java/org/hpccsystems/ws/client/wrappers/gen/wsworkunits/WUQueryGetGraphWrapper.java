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
 * Class name: WUQueryGetGraphWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraph
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.968Z
 */
public class WUQueryGetGraphWrapper
{
    protected String local_target;
    protected String local_queryId;
    protected String local_graphName;
    protected String local_subGraphId;

    public WUQueryGetGraphWrapper() {}

    public WUQueryGetGraphWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraph wuquerygetgraph)
    {
        copy( wuquerygetgraph );
    }
    public WUQueryGetGraphWrapper( String _target, String _queryId, String _graphName, String _subGraphId )
    {
        this.local_target = _target;
        this.local_queryId = _queryId;
        this.local_graphName = _graphName;
        this.local_subGraphId = _subGraphId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraph raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_queryId = raw.getQueryId();
        this.local_graphName = raw.getGraphName();
        this.local_subGraphId = raw.getSubGraphId();

    }

    @Override
    public String toString()
    {
        return "WUQueryGetGraphWrapper [" + "target = " + local_target + ", " + "queryId = " + local_queryId + ", " + "graphName = " + local_graphName + ", " + "subGraphId = " + local_subGraphId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraph getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraph raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraph();
        raw.setTarget( local_target);
        raw.setQueryId( local_queryId);
        raw.setGraphName( local_graphName);
        raw.setSubGraphId( local_subGraphId);
        return raw;
    }


    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
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