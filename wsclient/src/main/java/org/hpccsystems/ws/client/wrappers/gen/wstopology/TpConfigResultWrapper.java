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
 * Class name: TpConfigResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpConfigResultWrapper
{
    protected String local_componentName;
    protected String local_configuration;

    public TpConfigResultWrapper() {}

    public TpConfigResultWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResult tpconfigresult)
    {
        copy( tpconfigresult );
    }
    public TpConfigResultWrapper( String _componentName, String _configuration )
    {
        this.local_componentName = _componentName;
        this.local_configuration = _configuration;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResult raw )
    {
        if (raw == null)
            return;

        this.local_componentName = raw.getComponentName();
        this.local_configuration = raw.getConfiguration();

    }

    @Override
    public String toString()
    {
        return "TpConfigResultWrapper [" + "componentName = " + local_componentName + ", " + "configuration = " + local_configuration + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResult raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfigResult();
        raw.setComponentName( local_componentName);
        raw.setConfiguration( local_configuration);
        return raw;
    }


    public void setComponentName( String _componentName )
    {
        this.local_componentName = _componentName;
    }
    public String getComponentName( )
    {
        return this.local_componentName;
    }
    public void setConfiguration( String _configuration )
    {
        this.local_configuration = _configuration;
    }
    public String getConfiguration( )
    {
        return this.local_configuration;
    }
}