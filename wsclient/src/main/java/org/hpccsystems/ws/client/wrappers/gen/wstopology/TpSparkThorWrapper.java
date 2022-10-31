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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TpSparkThorWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSparkThor
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.488Z
 */
public class TpSparkThorWrapper
{
    protected String local_name;
    protected String local_build;
    protected String local_thorClusterName;
    protected String local_thorPath;
    protected UnsignedInt local_sparkExecutorCores;
    protected long local_sparkExecutorMemory;
    protected UnsignedInt local_sparkMasterPort;
    protected UnsignedInt local_sparkMasterWebUIPort;
    protected UnsignedInt local_sparkWorkerCores;
    protected long local_sparkWorkerMemory;
    protected UnsignedInt local_sparkWorkerPort;
    protected String local_logDirectory;
    protected String local_path;
    protected ArrayOfTpMachineWrapper local_tpMachines;

    public TpSparkThorWrapper() {}

    public TpSparkThorWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSparkThor tpsparkthor)
    {
        copy( tpsparkthor );
    }
    public TpSparkThorWrapper( String _name, String _build, String _thorClusterName, String _thorPath, UnsignedInt _sparkExecutorCores, long _sparkExecutorMemory, UnsignedInt _sparkMasterPort, UnsignedInt _sparkMasterWebUIPort, UnsignedInt _sparkWorkerCores, long _sparkWorkerMemory, UnsignedInt _sparkWorkerPort, String _logDirectory, String _path, ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_name = _name;
        this.local_build = _build;
        this.local_thorClusterName = _thorClusterName;
        this.local_thorPath = _thorPath;
        this.local_sparkExecutorCores = _sparkExecutorCores;
        this.local_sparkExecutorMemory = _sparkExecutorMemory;
        this.local_sparkMasterPort = _sparkMasterPort;
        this.local_sparkMasterWebUIPort = _sparkMasterWebUIPort;
        this.local_sparkWorkerCores = _sparkWorkerCores;
        this.local_sparkWorkerMemory = _sparkWorkerMemory;
        this.local_sparkWorkerPort = _sparkWorkerPort;
        this.local_logDirectory = _logDirectory;
        this.local_path = _path;
        this.local_tpMachines = _tpMachines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSparkThor raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_build = raw.getBuild();
        this.local_thorClusterName = raw.getThorClusterName();
        this.local_thorPath = raw.getThorPath();
        this.local_sparkExecutorCores = raw.getSparkExecutorCores();
        this.local_sparkExecutorMemory = raw.getSparkExecutorMemory();
        this.local_sparkMasterPort = raw.getSparkMasterPort();
        this.local_sparkMasterWebUIPort = raw.getSparkMasterWebUIPort();
        this.local_sparkWorkerCores = raw.getSparkWorkerCores();
        this.local_sparkWorkerMemory = raw.getSparkWorkerMemory();
        this.local_sparkWorkerPort = raw.getSparkWorkerPort();
        this.local_logDirectory = raw.getLogDirectory();
        this.local_path = raw.getPath();
        if (raw.getTpMachines() != null)
            this.local_tpMachines = new ArrayOfTpMachineWrapper( raw.getTpMachines());

    }

    @Override
    public String toString()
    {
        return "TpSparkThorWrapper [" + "name = " + local_name + ", " + "build = " + local_build + ", " + "thorClusterName = " + local_thorClusterName + ", " + "thorPath = " + local_thorPath + ", " + "sparkExecutorCores = " + local_sparkExecutorCores + ", " + "sparkExecutorMemory = " + local_sparkExecutorMemory + ", " + "sparkMasterPort = " + local_sparkMasterPort + ", " + "sparkMasterWebUIPort = " + local_sparkMasterWebUIPort + ", " + "sparkWorkerCores = " + local_sparkWorkerCores + ", " + "sparkWorkerMemory = " + local_sparkWorkerMemory + ", " + "sparkWorkerPort = " + local_sparkWorkerPort + ", " + "logDirectory = " + local_logDirectory + ", " + "path = " + local_path + ", " + "tpMachines = " + local_tpMachines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSparkThor getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSparkThor raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSparkThor();
        raw.setName( local_name);
        raw.setBuild( local_build);
        raw.setThorClusterName( local_thorClusterName);
        raw.setThorPath( local_thorPath);
        raw.setSparkExecutorCores( local_sparkExecutorCores);
        raw.setSparkExecutorMemory( local_sparkExecutorMemory);
        raw.setSparkMasterPort( local_sparkMasterPort);
        raw.setSparkMasterWebUIPort( local_sparkMasterWebUIPort);
        raw.setSparkWorkerCores( local_sparkWorkerCores);
        raw.setSparkWorkerMemory( local_sparkWorkerMemory);
        raw.setSparkWorkerPort( local_sparkWorkerPort);
        raw.setLogDirectory( local_logDirectory);
        raw.setPath( local_path);
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
    public void setBuild( String _build )
    {
        this.local_build = _build;
    }
    public String getBuild( )
    {
        return this.local_build;
    }
    public void setThorClusterName( String _thorClusterName )
    {
        this.local_thorClusterName = _thorClusterName;
    }
    public String getThorClusterName( )
    {
        return this.local_thorClusterName;
    }
    public void setThorPath( String _thorPath )
    {
        this.local_thorPath = _thorPath;
    }
    public String getThorPath( )
    {
        return this.local_thorPath;
    }
    public void setSparkExecutorCores( UnsignedInt _sparkExecutorCores )
    {
        this.local_sparkExecutorCores = _sparkExecutorCores;
    }
    public UnsignedInt getSparkExecutorCores( )
    {
        return this.local_sparkExecutorCores;
    }
    public void setSparkExecutorMemory( long _sparkExecutorMemory )
    {
        this.local_sparkExecutorMemory = _sparkExecutorMemory;
    }
    public long getSparkExecutorMemory( )
    {
        return this.local_sparkExecutorMemory;
    }
    public void setSparkMasterPort( UnsignedInt _sparkMasterPort )
    {
        this.local_sparkMasterPort = _sparkMasterPort;
    }
    public UnsignedInt getSparkMasterPort( )
    {
        return this.local_sparkMasterPort;
    }
    public void setSparkMasterWebUIPort( UnsignedInt _sparkMasterWebUIPort )
    {
        this.local_sparkMasterWebUIPort = _sparkMasterWebUIPort;
    }
    public UnsignedInt getSparkMasterWebUIPort( )
    {
        return this.local_sparkMasterWebUIPort;
    }
    public void setSparkWorkerCores( UnsignedInt _sparkWorkerCores )
    {
        this.local_sparkWorkerCores = _sparkWorkerCores;
    }
    public UnsignedInt getSparkWorkerCores( )
    {
        return this.local_sparkWorkerCores;
    }
    public void setSparkWorkerMemory( long _sparkWorkerMemory )
    {
        this.local_sparkWorkerMemory = _sparkWorkerMemory;
    }
    public long getSparkWorkerMemory( )
    {
        return this.local_sparkWorkerMemory;
    }
    public void setSparkWorkerPort( UnsignedInt _sparkWorkerPort )
    {
        this.local_sparkWorkerPort = _sparkWorkerPort;
    }
    public UnsignedInt getSparkWorkerPort( )
    {
        return this.local_sparkWorkerPort;
    }
    public void setLogDirectory( String _logDirectory )
    {
        this.local_logDirectory = _logDirectory;
    }
    public String getLogDirectory( )
    {
        return this.local_logDirectory;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
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