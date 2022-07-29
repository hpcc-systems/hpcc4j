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
 * Class name: ClusterQueryStateWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.799Z
 */
public class ClusterQueryStateWrapper
{
    protected String local_cluster;
    protected String local_state;
    protected String local_errors;
    protected boolean local_mixedNodeStates;

    public ClusterQueryStateWrapper() {}

    public ClusterQueryStateWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState clusterquerystate)
    {
        copy( clusterquerystate );
    }
    public ClusterQueryStateWrapper( String _cluster, String _state, String _errors, boolean _mixedNodeStates )
    {
        this.local_cluster = _cluster;
        this.local_state = _state;
        this.local_errors = _errors;
        this.local_mixedNodeStates = _mixedNodeStates;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_state = raw.getState();
        this.local_errors = raw.getErrors();
        this.local_mixedNodeStates = raw.getMixedNodeStates();

    }

    @Override
    public String toString()
    {
        return "ClusterQueryStateWrapper [" + "cluster = " + local_cluster + ", " + "state = " + local_state + ", " + "errors = " + local_errors + ", " + "mixedNodeStates = " + local_mixedNodeStates + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState();
        raw.setCluster( local_cluster);
        raw.setState( local_state);
        raw.setErrors( local_errors);
        raw.setMixedNodeStates( local_mixedNodeStates);
        return raw;
    }


    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setErrors( String _errors )
    {
        this.local_errors = _errors;
    }
    public String getErrors( )
    {
        return this.local_errors;
    }
    public void setMixedNodeStates( boolean _mixedNodeStates )
    {
        this.local_mixedNodeStates = _mixedNodeStates;
    }
    public boolean getMixedNodeStates( )
    {
        return this.local_mixedNodeStates;
    }
}