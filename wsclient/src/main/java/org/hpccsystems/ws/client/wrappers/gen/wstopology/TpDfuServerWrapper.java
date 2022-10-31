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
 * Class name: TpDfuServerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.459Z
 */
public class TpDfuServerWrapper
{
    protected String local_name;
    protected String local_description;
    protected String local_build;
    protected String local_queue;
    protected String local_type;
    protected String local_path;
    protected String local_logDirectory;
    protected ArrayOfTpMachineWrapper local_tpMachines;

    public TpDfuServerWrapper() {}

    public TpDfuServerWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer tpdfuserver)
    {
        copy( tpdfuserver );
    }
    public TpDfuServerWrapper( String _name, String _description, String _build, String _queue, String _type, String _path, String _logDirectory, ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_name = _name;
        this.local_description = _description;
        this.local_build = _build;
        this.local_queue = _queue;
        this.local_type = _type;
        this.local_path = _path;
        this.local_logDirectory = _logDirectory;
        this.local_tpMachines = _tpMachines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_description = raw.getDescription();
        this.local_build = raw.getBuild();
        this.local_queue = raw.getQueue();
        this.local_type = raw.getType();
        this.local_path = raw.getPath();
        this.local_logDirectory = raw.getLogDirectory();
        if (raw.getTpMachines() != null)
            this.local_tpMachines = new ArrayOfTpMachineWrapper( raw.getTpMachines());

    }

    @Override
    public String toString()
    {
        return "TpDfuServerWrapper [" + "name = " + local_name + ", " + "description = " + local_description + ", " + "build = " + local_build + ", " + "queue = " + local_queue + ", " + "type = " + local_type + ", " + "path = " + local_path + ", " + "logDirectory = " + local_logDirectory + ", " + "tpMachines = " + local_tpMachines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDfuServer();
        raw.setName( local_name);
        raw.setDescription( local_description);
        raw.setBuild( local_build);
        raw.setQueue( local_queue);
        raw.setType( local_type);
        raw.setPath( local_path);
        raw.setLogDirectory( local_logDirectory);
        if (local_tpMachines != null)
            raw.setTpMachines( local_tpMachines.getRaw());
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
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setBuild( String _build )
    {
        this.local_build = _build;
    }
    public String getBuild( )
    {
        return this.local_build;
    }
    public void setQueue( String _queue )
    {
        this.local_queue = _queue;
    }
    public String getQueue( )
    {
        return this.local_queue;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setLogDirectory( String _logDirectory )
    {
        this.local_logDirectory = _logDirectory;
    }
    public String getLogDirectory( )
    {
        return this.local_logDirectory;
    }
    public void setTpMachines( ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_tpMachines = _tpMachines;
    }
    public ArrayOfTpMachineWrapper getTpMachines( )
    {
        return this.local_tpMachines;
    }
}