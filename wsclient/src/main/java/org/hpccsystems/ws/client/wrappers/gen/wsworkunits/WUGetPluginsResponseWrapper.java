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
 * Class name: WUGetPluginsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetPluginsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.538Z
 */
public class WUGetPluginsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfWUEclPluginsInFolderWrapper local_plugins;

    public WUGetPluginsResponseWrapper() {}

    public WUGetPluginsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetPluginsResponse wugetpluginsresponse)
    {
        copy( wugetpluginsresponse );
    }
    public WUGetPluginsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfWUEclPluginsInFolderWrapper _plugins )
    {
        this.local_exceptions = _exceptions;
        this.local_plugins = _plugins;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetPluginsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getPlugins() != null)
            this.local_plugins = new ArrayOfWUEclPluginsInFolderWrapper( raw.getPlugins());

    }

    @Override
    public String toString()
    {
        return "WUGetPluginsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "plugins = " + local_plugins + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetPluginsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetPluginsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetPluginsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_plugins != null)
            raw.setPlugins( local_plugins.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setPlugins( ArrayOfWUEclPluginsInFolderWrapper _plugins )
    {
        this.local_plugins = _plugins;
    }
    public ArrayOfWUEclPluginsInFolderWrapper getPlugins( )
    {
        return this.local_plugins;
    }
}