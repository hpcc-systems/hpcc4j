package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: PackageListMapDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListMapData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-10-31T03:36:33.195Z
 */
public class PackageListMapDataWrapper
{
    protected String local_id;
    protected String local_target;
    protected String local_process;
    protected ArrayOfPackageListDataWrapper local_pkgListData;
    protected boolean local_active;
    protected String local_description;

    public PackageListMapDataWrapper() {}

    public PackageListMapDataWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListMapData packagelistmapdata)
    {
        copy( packagelistmapdata );
    }
    public PackageListMapDataWrapper( String _id, String _target, String _process, ArrayOfPackageListDataWrapper _pkgListData, boolean _active, String _description )
    {
        this.local_id = _id;
        this.local_target = _target;
        this.local_process = _process;
        this.local_pkgListData = _pkgListData;
        this.local_active = _active;
        this.local_description = _description;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListMapData raw )
    {
        if (raw == null)
            return;

        this.local_id = raw.getId();
        this.local_target = raw.getTarget();
        this.local_process = raw.getProcess();
        if (raw.getPkgListData() != null)
            this.local_pkgListData = new ArrayOfPackageListDataWrapper( raw.getPkgListData());
        this.local_active = raw.getActive();
        this.local_description = raw.getDescription();

    }

    @Override
    public String toString()
    {
        return "PackageListMapDataWrapper [" + "id = " + local_id + ", " + "target = " + local_target + ", " + "process = " + local_process + ", " + "pkgListData = " + local_pkgListData + ", " + "active = " + local_active + ", " + "description = " + local_description + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListMapData getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListMapData raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.PackageListMapData();
        raw.setId( local_id);
        raw.setTarget( local_target);
        raw.setProcess( local_process);
        if (local_pkgListData != null)
            raw.setPkgListData( local_pkgListData.getRaw());
        raw.setActive( local_active);
        raw.setDescription( local_description);
        return raw;
    }


    public void setId( String _id )
    {
        this.local_id = _id;
    }
    public String getId( )
    {
        return this.local_id;
    }
    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setPkgListData( ArrayOfPackageListDataWrapper _pkgListData )
    {
        this.local_pkgListData = _pkgListData;
    }
    public ArrayOfPackageListDataWrapper getPkgListData( )
    {
        return this.local_pkgListData;
    }
    public void setActive( boolean _active )
    {
        this.local_active = _active;
    }
    public boolean getActive( )
    {
        return this.local_active;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
}