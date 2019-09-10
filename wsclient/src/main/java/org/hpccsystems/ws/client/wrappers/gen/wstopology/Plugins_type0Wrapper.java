package org.hpccsystems.ws.client.wrappers.gen.wstopology;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.Plugins_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.887Z
 */
public class Plugins_type0Wrapper
{
protected List<TpEspServicePluginWrapper> local_plugin = new ArrayList<TpEspServicePluginWrapper>();

	public Plugins_type0Wrapper() {}

	public Plugins_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.Plugins_type0 plugins_type0)
	{
		copy( plugins_type0 );
	}
	public Plugins_type0Wrapper( List<TpEspServicePluginWrapper> _plugin )
	{
		this.local_plugin = _plugin;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.Plugins_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getPlugin() != null)
		{
			this.local_plugin = new ArrayList<TpEspServicePluginWrapper>();
			for ( int i = 0; i < raw.getPlugin().length; i++)
			{
				this.local_plugin.add(new TpEspServicePluginWrapper(raw.getPlugin()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Plugins_type0Wrapper [" + "plugin = " + local_plugin + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.Plugins_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.Plugins_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.Plugins_type0();
		if (this.local_plugin!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpEspServicePlugin[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpEspServicePlugin[this.local_plugin.size()];
			for ( int i = 0; i < this.local_plugin.size(); i++)
			{
				arr[i] = this.local_plugin.get(i) .getRaw();
			}
			raw.setPlugin(arr);
		}
		return raw;
	}


	public void setPlugin( List<TpEspServicePluginWrapper> _plugin )
	{
		this.local_plugin = _plugin;
	}
	public List<TpEspServicePluginWrapper> getPlugin( )
	{
		return this.local_plugin;
	}
}