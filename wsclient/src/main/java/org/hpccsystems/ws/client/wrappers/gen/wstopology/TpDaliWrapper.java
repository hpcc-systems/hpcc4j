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
 * Class name: TpDaliWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDali
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.457Z
 */
public class TpDaliWrapper
{
    protected String local_name;
    protected String local_description;
    protected String local_build;
    protected String local_backupComputer;
    protected String local_backupDirectory;
    protected String local_type;
    protected String local_path;
    protected String local_logDirectory;
    protected String local_auditLogDirectory;
    protected ArrayOfTpMachineWrapper local_tpMachines;

    public TpDaliWrapper() {}

    public TpDaliWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDali tpdali)
    {
        copy( tpdali );
    }
    public TpDaliWrapper( String _name, String _description, String _build, String _backupComputer, String _backupDirectory, String _type, String _path, String _logDirectory, String _auditLogDirectory, ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_name = _name;
        this.local_description = _description;
        this.local_build = _build;
        this.local_backupComputer = _backupComputer;
        this.local_backupDirectory = _backupDirectory;
        this.local_type = _type;
        this.local_path = _path;
        this.local_logDirectory = _logDirectory;
        this.local_auditLogDirectory = _auditLogDirectory;
        this.local_tpMachines = _tpMachines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDali raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_description = raw.getDescription();
        this.local_build = raw.getBuild();
        this.local_backupComputer = raw.getBackupComputer();
        this.local_backupDirectory = raw.getBackupDirectory();
        this.local_type = raw.getType();
        this.local_path = raw.getPath();
        this.local_logDirectory = raw.getLogDirectory();
        this.local_auditLogDirectory = raw.getAuditLogDirectory();
        if (raw.getTpMachines() != null)
            this.local_tpMachines = new ArrayOfTpMachineWrapper( raw.getTpMachines());

    }

    @Override
    public String toString()
    {
        return "TpDaliWrapper [" + "name = " + local_name + ", " + "description = " + local_description + ", " + "build = " + local_build + ", " + "backupComputer = " + local_backupComputer + ", " + "backupDirectory = " + local_backupDirectory + ", " + "type = " + local_type + ", " + "path = " + local_path + ", " + "logDirectory = " + local_logDirectory + ", " + "auditLogDirectory = " + local_auditLogDirectory + ", " + "tpMachines = " + local_tpMachines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDali getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDali raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDali();
        raw.setName( local_name);
        raw.setDescription( local_description);
        raw.setBuild( local_build);
        raw.setBackupComputer( local_backupComputer);
        raw.setBackupDirectory( local_backupDirectory);
        raw.setType( local_type);
        raw.setPath( local_path);
        raw.setLogDirectory( local_logDirectory);
        raw.setAuditLogDirectory( local_auditLogDirectory);
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
    public void setBackupComputer( String _backupComputer )
    {
        this.local_backupComputer = _backupComputer;
    }
    public String getBackupComputer( )
    {
        return this.local_backupComputer;
    }
    public void setBackupDirectory( String _backupDirectory )
    {
        this.local_backupDirectory = _backupDirectory;
    }
    public String getBackupDirectory( )
    {
        return this.local_backupDirectory;
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
    public void setAuditLogDirectory( String _auditLogDirectory )
    {
        this.local_auditLogDirectory = _auditLogDirectory;
    }
    public String getAuditLogDirectory( )
    {
        return this.local_auditLogDirectory;
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