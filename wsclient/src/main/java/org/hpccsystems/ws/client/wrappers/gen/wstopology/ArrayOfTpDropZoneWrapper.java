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
 * Class name: ArrayOfTpDropZoneWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDropZone
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.426Z
 */
public class ArrayOfTpDropZoneWrapper
{
	protected List<TpDropZoneWrapper> local_tpDropZone = null;

	public ArrayOfTpDropZoneWrapper() {}

	public ArrayOfTpDropZoneWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDropZone arrayoftpdropzone)
	{
		copy( arrayoftpdropzone );
	}
	public ArrayOfTpDropZoneWrapper( List<TpDropZoneWrapper> _tpDropZone )
	{
		this.local_tpDropZone = _tpDropZone;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDropZone raw )
	{
		if (raw == null)
			return;

		if (raw.getTpDropZone() != null)
		{
			this.local_tpDropZone = new ArrayList<TpDropZoneWrapper>();
			for ( int i = 0; i < raw.getTpDropZone().length; i++)
			{
				this.local_tpDropZone.add(new TpDropZoneWrapper(raw.getTpDropZone()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpDropZoneWrapper [" + "tpDropZone = " + local_tpDropZone + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDropZone getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDropZone raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDropZone();
		if (this.local_tpDropZone!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZone[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZone[this.local_tpDropZone.size()];
			for ( int i = 0; i < this.local_tpDropZone.size(); i++)
			{
				arr[i] = this.local_tpDropZone.get(i) .getRaw();
			}
			raw.setTpDropZone(arr);
		}
		return raw;
	}


	public void setTpDropZone( List<TpDropZoneWrapper> _tpDropZone )
	{
		this.local_tpDropZone = _tpDropZone;
	}
	public List<TpDropZoneWrapper> getTpDropZone( )
	{
		return this.local_tpDropZone;
	}
}