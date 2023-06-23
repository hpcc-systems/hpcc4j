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
 * Class name: TpLogicalClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpLogicalClusterWrapper
{
    protected String local_name;
    protected String local_queue;
    protected String local_languageVersion;
    protected String local_process;
    protected String local_type;
    protected boolean local_queriesOnly;

    public TpLogicalClusterWrapper() {}

    public TpLogicalClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster tplogicalcluster)
    {
        copy( tplogicalcluster );
    }
    public TpLogicalClusterWrapper( String _name, String _queue, String _languageVersion, String _process, String _type, boolean _queriesOnly )
    {
        this.local_name = _name;
        this.local_queue = _queue;
        this.local_languageVersion = _languageVersion;
        this.local_process = _process;
        this.local_type = _type;
        this.local_queriesOnly = _queriesOnly;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_queue = raw.getQueue();
        this.local_languageVersion = raw.getLanguageVersion();
        this.local_process = raw.getProcess();
        this.local_type = raw.getType();
        this.local_queriesOnly = raw.getQueriesOnly();

    }

    @Override
    public String toString()
    {
        return "TpLogicalClusterWrapper [" + "name = " + local_name + ", " + "queue = " + local_queue + ", " + "languageVersion = " + local_languageVersion + ", " + "process = " + local_process + ", " + "type = " + local_type + ", " + "queriesOnly = " + local_queriesOnly + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster();
        raw.setName( local_name);
        raw.setQueue( local_queue);
        raw.setLanguageVersion( local_languageVersion);
        raw.setProcess( local_process);
        raw.setType( local_type);
        raw.setQueriesOnly( local_queriesOnly);
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
    public void setQueue( String _queue )
    {
        this.local_queue = _queue;
    }
    public String getQueue( )
    {
        return this.local_queue;
    }
    public void setLanguageVersion( String _languageVersion )
    {
        this.local_languageVersion = _languageVersion;
    }
    public String getLanguageVersion( )
    {
        return this.local_languageVersion;
    }
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setQueriesOnly( boolean _queriesOnly )
    {
        this.local_queriesOnly = _queriesOnly;
    }
    public boolean getQueriesOnly( )
    {
        return this.local_queriesOnly;
    }
}