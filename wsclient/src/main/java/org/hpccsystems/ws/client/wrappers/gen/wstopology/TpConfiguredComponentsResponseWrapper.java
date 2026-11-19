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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TpConfiguredComponentsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfiguredComponentsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpConfiguredComponentsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected List<String> local_configuredComponents = null;

    public TpConfiguredComponentsResponseWrapper() {}

    public TpConfiguredComponentsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfiguredComponentsResponse tpconfiguredcomponentsresponse)
    {
        copy( tpconfiguredcomponentsresponse );
    }
    public TpConfiguredComponentsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, List<String> _configuredComponents )
    {
        this.local_exceptions = _exceptions;
        this.local_configuredComponents = _configuredComponents;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfiguredComponentsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getConfiguredComponents() != null && raw.getConfiguredComponents().getItem() != null)
        {
            this.local_configuredComponents = new ArrayList<String>();
            for ( int i = 0; i < raw.getConfiguredComponents().getItem().length; i++)
            {
                this.local_configuredComponents.add(new String(raw.getConfiguredComponents().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "TpConfiguredComponentsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "configuredComponents = " + local_configuredComponents + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfiguredComponentsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfiguredComponentsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpConfiguredComponentsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (this.local_configuredComponents!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_configuredComponents.size(); i++)
            {
                arr.addItem(this.local_configuredComponents.get(i));
            }
            raw.setConfiguredComponents(arr);
        }
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
    public void setConfiguredComponents( List<String> _configuredComponents )
    {
        this.local_configuredComponents = _configuredComponents;
    }
    public List<String> getConfiguredComponents( )
    {
        return this.local_configuredComponents;
    }
}