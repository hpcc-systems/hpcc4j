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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: Plugins_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Plugins_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.844Z
 */
public class Plugins_type0Wrapper
{
    protected List<String> local_plugin = null;

    public Plugins_type0Wrapper() {}

    public Plugins_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Plugins_type0 plugins_type0)
    {
        copy( plugins_type0 );
    }
    public Plugins_type0Wrapper( List<String> _plugin )
    {
        this.local_plugin = _plugin;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Plugins_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getPlugin() != null)
        {
            this.local_plugin = new ArrayList<String>();
            for ( int i = 0; i < raw.getPlugin().length; i++)
            {
                this.local_plugin.add(new String(raw.getPlugin()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Plugins_type0Wrapper [" + "plugin = " + local_plugin + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Plugins_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Plugins_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Plugins_type0();
        if (this.local_plugin!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_plugin.size()];
            for ( int i = 0; i < this.local_plugin.size(); i++)
            {
                arr[i] = this.local_plugin.get(i) ;
            }
            raw.setPlugin(arr);
        }
        return raw;
    }


    public void setPlugin( List<String> _plugin )
    {
        this.local_plugin = _plugin;
    }
    public List<String> getPlugin( )
    {
        return this.local_plugin;
    }
}