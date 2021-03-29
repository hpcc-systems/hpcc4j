package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: ArrayOfActiveWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfActiveWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:28.928Z
 */
public class ArrayOfActiveWorkunitWrapper
{
	protected List<ActiveWorkunitWrapper> local_activeWorkunit = null;

	public ArrayOfActiveWorkunitWrapper() {}

	public ArrayOfActiveWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfActiveWorkunit arrayofactiveworkunit)
	{
		copy( arrayofactiveworkunit );
	}
	public ArrayOfActiveWorkunitWrapper( List<ActiveWorkunitWrapper> _activeWorkunit )
	{
		this.local_activeWorkunit = _activeWorkunit;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfActiveWorkunit raw )
	{
		if (raw == null)
			return;

		if (raw.getActiveWorkunit() != null)
		{
			this.local_activeWorkunit = new ArrayList<ActiveWorkunitWrapper>();
			for ( int i = 0; i < raw.getActiveWorkunit().length; i++)
			{
				this.local_activeWorkunit.add(new ActiveWorkunitWrapper(raw.getActiveWorkunit()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfActiveWorkunitWrapper [" + "activeWorkunit = " + local_activeWorkunit + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfActiveWorkunit getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfActiveWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfActiveWorkunit();
		if (this.local_activeWorkunit!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ActiveWorkunit[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ActiveWorkunit[this.local_activeWorkunit.size()];
			for ( int i = 0; i < this.local_activeWorkunit.size(); i++)
			{
				arr[i] = this.local_activeWorkunit.get(i) .getRaw();
			}
			raw.setActiveWorkunit(arr);
		}
		return raw;
	}


	public void setActiveWorkunit( List<ActiveWorkunitWrapper> _activeWorkunit )
	{
		this.local_activeWorkunit = _activeWorkunit;
	}
	public List<ActiveWorkunitWrapper> getActiveWorkunit( )
	{
		return this.local_activeWorkunit;
	}
}