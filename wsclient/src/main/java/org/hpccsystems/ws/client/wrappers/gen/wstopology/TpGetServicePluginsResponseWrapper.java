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
 * Class name: TpGetServicePluginsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.470Z
 */
public class TpGetServicePluginsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Plugins_type0Wrapper local_plugins;

    public TpGetServicePluginsResponseWrapper() {}

    public TpGetServicePluginsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse tpgetservicepluginsresponse)
    {
        copy( tpgetservicepluginsresponse );
    }
    public TpGetServicePluginsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Plugins_type0Wrapper _plugins )
    {
        this.local_exceptions = _exceptions;
        this.local_plugins = _plugins;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getPlugins() != null)
            this.local_plugins = new Plugins_type0Wrapper( raw.getPlugins());

    }

    @Override
    public String toString()
    {
        return "TpGetServicePluginsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "plugins = " + local_plugins + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse();
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
    public void setPlugins( Plugins_type0Wrapper _plugins )
    {
        this.local_plugins = _plugins;
    }
    public Plugins_type0Wrapper getPlugins( )
    {
        return this.local_plugins;
    }
}