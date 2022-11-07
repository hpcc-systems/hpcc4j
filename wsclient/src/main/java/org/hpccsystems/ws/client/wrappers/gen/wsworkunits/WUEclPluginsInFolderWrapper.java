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
 * Class name: WUEclPluginsInFolderWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.909Z
 */
public class WUEclPluginsInFolderWrapper
{
    protected String local_path;
    protected Plugins_type0Wrapper local_plugins;

    public WUEclPluginsInFolderWrapper() {}

    public WUEclPluginsInFolderWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder wueclpluginsinfolder)
    {
        copy( wueclpluginsinfolder );
    }
    public WUEclPluginsInFolderWrapper( String _path, Plugins_type0Wrapper _plugins )
    {
        this.local_path = _path;
        this.local_plugins = _plugins;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder raw )
    {
        if (raw == null)
            return;

        this.local_path = raw.getPath();
        if (raw.getPlugins() != null)
            this.local_plugins = new Plugins_type0Wrapper( raw.getPlugins());

    }

    @Override
    public String toString()
    {
        return "WUEclPluginsInFolderWrapper [" + "path = " + local_path + ", " + "plugins = " + local_plugins + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder();
        raw.setPath( local_path);
        return raw;
    }


    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setPlugins( Plugins_type0Wrapper _plugins )
    {
        this.local_plugins = _plugins;
    }
    public Plugins_type0Wrapper getPlugins( )
    {
        return this.local_plugins;
    }
}