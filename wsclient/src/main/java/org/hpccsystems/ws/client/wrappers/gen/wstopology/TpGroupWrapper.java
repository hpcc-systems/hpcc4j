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
 * Class name: TpGroupWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpGroupWrapper
{
    protected String local_name;
    protected String local_kind;
    protected boolean local_replicateOutputs;

    public TpGroupWrapper() {}

    public TpGroupWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup tpgroup)
    {
        copy( tpgroup );
    }
    public TpGroupWrapper( String _name, String _kind, boolean _replicateOutputs )
    {
        this.local_name = _name;
        this.local_kind = _kind;
        this.local_replicateOutputs = _replicateOutputs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_kind = raw.getKind();
        this.local_replicateOutputs = raw.getReplicateOutputs();

    }

    @Override
    public String toString()
    {
        return "TpGroupWrapper [" + "name = " + local_name + ", " + "kind = " + local_kind + ", " + "replicateOutputs = " + local_replicateOutputs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroup();
        raw.setName( local_name);
        raw.setKind( local_kind);
        raw.setReplicateOutputs( local_replicateOutputs);
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
    public void setKind( String _kind )
    {
        this.local_kind = _kind;
    }
    public String getKind( )
    {
        return this.local_kind;
    }
    public void setReplicateOutputs( boolean _replicateOutputs )
    {
        this.local_replicateOutputs = _replicateOutputs;
    }
    public boolean getReplicateOutputs( )
    {
        return this.local_replicateOutputs;
    }
}