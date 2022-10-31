package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: HPCCResourceRepositoryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResourceRepository
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.296Z
 */
public class HPCCResourceRepositoryWrapper
{
    protected String local_name;
    protected String local_path;
    protected ArrayOfHPCCResourceWrapper local_hPCCResources;

    public HPCCResourceRepositoryWrapper() {}

    public HPCCResourceRepositoryWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResourceRepository hpccresourcerepository)
    {
        copy( hpccresourcerepository );
    }
    public HPCCResourceRepositoryWrapper( String _name, String _path, ArrayOfHPCCResourceWrapper _hPCCResources )
    {
        this.local_name = _name;
        this.local_path = _path;
        this.local_hPCCResources = _hPCCResources;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResourceRepository raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_path = raw.getPath();
        if (raw.getHPCCResources() != null)
            this.local_hPCCResources = new ArrayOfHPCCResourceWrapper( raw.getHPCCResources());

    }

    @Override
    public String toString()
    {
        return "HPCCResourceRepositoryWrapper [" + "name = " + local_name + ", " + "path = " + local_path + ", " + "hPCCResources = " + local_hPCCResources + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResourceRepository getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResourceRepository raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResourceRepository();
        raw.setName( local_name);
        raw.setPath( local_path);
        if (local_hPCCResources != null)
            raw.setHPCCResources( local_hPCCResources.getRaw());
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
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setHPCCResources( ArrayOfHPCCResourceWrapper _hPCCResources )
    {
        this.local_hPCCResources = _hPCCResources;
    }
    public ArrayOfHPCCResourceWrapper getHPCCResources( )
    {
        return this.local_hPCCResources;
    }
}