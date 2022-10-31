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
 * Class name: TpDropZoneWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.460Z
 */
public class TpDropZoneWrapper
{
    protected String local_name;
    protected String local_description;
    protected String local_build;
    protected String local_path;
    protected boolean local_eCLWatchVisible;
    protected String local_uMask;
    protected ArrayOfTpMachineWrapper local_tpMachines;

    public TpDropZoneWrapper() {}

    public TpDropZoneWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone tpdropzone)
    {
        copy( tpdropzone );
    }
    public TpDropZoneWrapper( String _name, String _description, String _build, String _path, boolean _eCLWatchVisible, String _uMask, ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_name = _name;
        this.local_description = _description;
        this.local_build = _build;
        this.local_path = _path;
        this.local_eCLWatchVisible = _eCLWatchVisible;
        this.local_uMask = _uMask;
        this.local_tpMachines = _tpMachines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_description = raw.getDescription();
        this.local_build = raw.getBuild();
        this.local_path = raw.getPath();
        this.local_eCLWatchVisible = raw.getECLWatchVisible();
        this.local_uMask = raw.getUMask();
        if (raw.getTpMachines() != null)
            this.local_tpMachines = new ArrayOfTpMachineWrapper( raw.getTpMachines());

    }

    @Override
    public String toString()
    {
        return "TpDropZoneWrapper [" + "name = " + local_name + ", " + "description = " + local_description + ", " + "build = " + local_build + ", " + "path = " + local_path + ", " + "eCLWatchVisible = " + local_eCLWatchVisible + ", " + "uMask = " + local_uMask + ", " + "tpMachines = " + local_tpMachines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZone();
        raw.setName( local_name);
        raw.setDescription( local_description);
        raw.setBuild( local_build);
        raw.setPath( local_path);
        raw.setECLWatchVisible( local_eCLWatchVisible);
        raw.setUMask( local_uMask);
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
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setECLWatchVisible( boolean _eCLWatchVisible )
    {
        this.local_eCLWatchVisible = _eCLWatchVisible;
    }
    public boolean getECLWatchVisible( )
    {
        return this.local_eCLWatchVisible;
    }
    public void setUMask( String _uMask )
    {
        this.local_uMask = _uMask;
    }
    public String getUMask( )
    {
        return this.local_uMask;
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