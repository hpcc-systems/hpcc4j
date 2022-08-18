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
 * Class name: GVCAjaxGraphResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GVCAjaxGraphResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.836Z
 */
public class GVCAjaxGraphResponseWrapper
{
    protected String local_name;
    protected String local_graphName;
    protected String local_graphType;
    protected int local_subGraphId;
    protected boolean local_subGraphOnly;

    public GVCAjaxGraphResponseWrapper() {}

    public GVCAjaxGraphResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GVCAjaxGraphResponse gvcajaxgraphresponse)
    {
        copy( gvcajaxgraphresponse );
    }
    public GVCAjaxGraphResponseWrapper( String _name, String _graphName, String _graphType, int _subGraphId, boolean _subGraphOnly )
    {
        this.local_name = _name;
        this.local_graphName = _graphName;
        this.local_graphType = _graphType;
        this.local_subGraphId = _subGraphId;
        this.local_subGraphOnly = _subGraphOnly;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GVCAjaxGraphResponse raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_graphName = raw.getGraphName();
        this.local_graphType = raw.getGraphType();
        this.local_subGraphId = raw.getSubGraphId();
        this.local_subGraphOnly = raw.getSubGraphOnly();

    }

    @Override
    public String toString()
    {
        return "GVCAjaxGraphResponseWrapper [" + "name = " + local_name + ", " + "graphName = " + local_graphName + ", " + "graphType = " + local_graphType + ", " + "subGraphId = " + local_subGraphId + ", " + "subGraphOnly = " + local_subGraphOnly + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GVCAjaxGraphResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GVCAjaxGraphResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.GVCAjaxGraphResponse();
        raw.setName( local_name);
        raw.setGraphName( local_graphName);
        raw.setGraphType( local_graphType);
        raw.setSubGraphId( local_subGraphId);
        raw.setSubGraphOnly( local_subGraphOnly);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setGraphName( String _graphName )
    {
        this.local_graphName = _graphName;
    }
    public String getGraphName( )
    {
        return this.local_graphName;
    }
    public void setGraphType( String _graphType )
    {
        this.local_graphType = _graphType;
    }
    public String getGraphType( )
    {
        return this.local_graphType;
    }
    public void setSubGraphId( int _subGraphId )
    {
        this.local_subGraphId = _subGraphId;
    }
    public int getSubGraphId( )
    {
        return this.local_subGraphId;
    }
    public void setSubGraphOnly( boolean _subGraphOnly )
    {
        this.local_subGraphOnly = _subGraphOnly;
    }
    public boolean getSubGraphOnly( )
    {
        return this.local_subGraphOnly;
    }
}