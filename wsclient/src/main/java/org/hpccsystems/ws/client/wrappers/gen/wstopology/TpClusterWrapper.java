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
 * Class name: TpClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.446Z
 */
public class TpClusterWrapper
{
    protected String local_type;
    protected String local_name;
    protected String local_queueName;
    protected String local_build;
    protected String local_directory;
    protected String local_logDirectory;
    protected String local_desc;
    protected String local_path;
    protected String local_dataModel;
    protected int local_oS;
    protected boolean local_hasThorSpareProcess;
    protected ArrayOfTpMachineWrapper local_tpMachines;

    public TpClusterWrapper() {}

    public TpClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster tpcluster)
    {
        copy( tpcluster );
    }
    public TpClusterWrapper( String _type, String _name, String _queueName, String _build, String _directory, String _logDirectory, String _desc, String _path, String _dataModel, int _oS, boolean _hasThorSpareProcess, ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_type = _type;
        this.local_name = _name;
        this.local_queueName = _queueName;
        this.local_build = _build;
        this.local_directory = _directory;
        this.local_logDirectory = _logDirectory;
        this.local_desc = _desc;
        this.local_path = _path;
        this.local_dataModel = _dataModel;
        this.local_oS = _oS;
        this.local_hasThorSpareProcess = _hasThorSpareProcess;
        this.local_tpMachines = _tpMachines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster raw )
    {
        if (raw == null)
            return;

        this.local_type = raw.getType();
        this.local_name = raw.getName();
        this.local_queueName = raw.getQueueName();
        this.local_build = raw.getBuild();
        this.local_directory = raw.getDirectory();
        this.local_logDirectory = raw.getLogDirectory();
        this.local_desc = raw.getDesc();
        this.local_path = raw.getPath();
        this.local_dataModel = raw.getDataModel();
        this.local_oS = raw.getOS();
        this.local_hasThorSpareProcess = raw.getHasThorSpareProcess();
        if (raw.getTpMachines() != null)
            this.local_tpMachines = new ArrayOfTpMachineWrapper( raw.getTpMachines());

    }

    @Override
    public String toString()
    {
        return "TpClusterWrapper [" + "type = " + local_type + ", " + "name = " + local_name + ", " + "queueName = " + local_queueName + ", " + "build = " + local_build + ", " + "directory = " + local_directory + ", " + "logDirectory = " + local_logDirectory + ", " + "desc = " + local_desc + ", " + "path = " + local_path + ", " + "dataModel = " + local_dataModel + ", " + "oS = " + local_oS + ", " + "hasThorSpareProcess = " + local_hasThorSpareProcess + ", " + "tpMachines = " + local_tpMachines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster();
        raw.setType( local_type);
        raw.setName( local_name);
        raw.setQueueName( local_queueName);
        raw.setBuild( local_build);
        raw.setDirectory( local_directory);
        raw.setLogDirectory( local_logDirectory);
        raw.setDesc( local_desc);
        raw.setPath( local_path);
        raw.setDataModel( local_dataModel);
        raw.setOS( local_oS);
        raw.setHasThorSpareProcess( local_hasThorSpareProcess);
        if (local_tpMachines != null)
            raw.setTpMachines( local_tpMachines.getRaw());
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
    public void setQueueName( String _queueName )
    {
        this.local_queueName = _queueName;
    }
    public String getQueueName( )
    {
        return this.local_queueName;
    }
    public void setBuild( String _build )
    {
        this.local_build = _build;
    }
    public String getBuild( )
    {
        return this.local_build;
    }
    public void setDirectory( String _directory )
    {
        this.local_directory = _directory;
    }
    public String getDirectory( )
    {
        return this.local_directory;
    }
    public void setLogDirectory( String _logDirectory )
    {
        this.local_logDirectory = _logDirectory;
    }
    public String getLogDirectory( )
    {
        return this.local_logDirectory;
    }
    public void setDesc( String _desc )
    {
        this.local_desc = _desc;
    }
    public String getDesc( )
    {
        return this.local_desc;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setDataModel( String _dataModel )
    {
        this.local_dataModel = _dataModel;
    }
    public String getDataModel( )
    {
        return this.local_dataModel;
    }
    public void setOS( int _oS )
    {
        this.local_oS = _oS;
    }
    public int getOS( )
    {
        return this.local_oS;
    }
    public void setHasThorSpareProcess( boolean _hasThorSpareProcess )
    {
        this.local_hasThorSpareProcess = _hasThorSpareProcess;
    }
    public boolean getHasThorSpareProcess( )
    {
        return this.local_hasThorSpareProcess;
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