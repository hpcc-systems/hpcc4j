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
 * Class name: TpComponentConfigurationRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpComponentConfigurationRequestWrapper
{
    protected List<String> local_componentNames = null;

    public TpComponentConfigurationRequestWrapper() {}

    public TpComponentConfigurationRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationRequest tpcomponentconfigurationrequest)
    {
        copy( tpcomponentconfigurationrequest );
    }
    public TpComponentConfigurationRequestWrapper( List<String> _componentNames )
    {
        this.local_componentNames = _componentNames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getComponentNames() != null && raw.getComponentNames().getItem() != null)
        {
            this.local_componentNames = new ArrayList<String>();
            for ( int i = 0; i < raw.getComponentNames().getItem().length; i++)
            {
                this.local_componentNames.add(new String(raw.getComponentNames().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "TpComponentConfigurationRequestWrapper [" + "componentNames = " + local_componentNames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationRequest();
        if (this.local_componentNames!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_componentNames.size(); i++)
            {
                arr.addItem(this.local_componentNames.get(i));
            }
            raw.setComponentNames(arr);
        }
        return raw;
    }


    public void setComponentNames( List<String> _componentNames )
    {
        this.local_componentNames = _componentNames;
    }
    public List<String> getComponentNames( )
    {
        return this.local_componentNames;
    }
}