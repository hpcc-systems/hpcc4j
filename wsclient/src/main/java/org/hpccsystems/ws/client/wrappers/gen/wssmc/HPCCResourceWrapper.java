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
 * WrapperMaker version: 1.7
 * Class name: HPCCResourceWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * Service version: 1.26
 */
public class HPCCResourceWrapper
{
    protected String local_name;
    protected String local_description;
    protected String local_fileName;
    protected String local_version;

    public HPCCResourceWrapper() {}

    public HPCCResourceWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource hpccresource)
    {
        copy( hpccresource );
    }
    public HPCCResourceWrapper( String _name, String _description, String _fileName, String _version )
    {
        this.local_name = _name;
        this.local_description = _description;
        this.local_fileName = _fileName;
        this.local_version = _version;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_description = raw.getDescription();
        this.local_fileName = raw.getFileName();
        this.local_version = raw.getVersion();

    }

    @Override
    public String toString()
    {
        return "HPCCResourceWrapper [" + "name = " + local_name + ", " + "description = " + local_description + ", " + "fileName = " + local_fileName + ", " + "version = " + local_version + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.HPCCResource();
        raw.setName( local_name);
        raw.setDescription( local_description);
        raw.setFileName( local_fileName);
        raw.setVersion( local_version);
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
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setVersion( String _version )
    {
        this.local_version = _version;
    }
    public String getVersion( )
    {
        return this.local_version;
    }
}