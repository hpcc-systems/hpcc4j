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
 * Class name: TpTargetClusterQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class TpTargetClusterQueryRequestWrapper
{
    protected String local_type;
    protected String local_name;
    protected boolean local_showDetails;

    public TpTargetClusterQueryRequestWrapper() {}

    public TpTargetClusterQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest tptargetclusterqueryrequest)
    {
        copy( tptargetclusterqueryrequest );
    }
    public TpTargetClusterQueryRequestWrapper( String _type, String _name, boolean _showDetails )
    {
        this.local_type = _type;
        this.local_name = _name;
        this.local_showDetails = _showDetails;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest raw )
    {
        if (raw == null)
            return;

        this.local_type = raw.getType();
        this.local_name = raw.getName();
        this.local_showDetails = raw.getShowDetails();

    }

    @Override
    public String toString()
    {
        return "TpTargetClusterQueryRequestWrapper [" + "type = " + local_type + ", " + "name = " + local_name + ", " + "showDetails = " + local_showDetails + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest();
        raw.setType( local_type);
        raw.setName( local_name);
        raw.setShowDetails( local_showDetails);
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
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setShowDetails( boolean _showDetails )
    {
        this.local_showDetails = _showDetails;
    }
    public boolean getShowDetails( )
    {
        return this.local_showDetails;
    }
}