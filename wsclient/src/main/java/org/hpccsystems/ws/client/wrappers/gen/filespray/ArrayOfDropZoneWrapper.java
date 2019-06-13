package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: ArrayOfDropZoneWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDropZone
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.806Z
 */
public class ArrayOfDropZoneWrapper
{
protected List<DropZoneWrapper> local_dropZone = new ArrayList<DropZoneWrapper>();

	public ArrayOfDropZoneWrapper() {}

	public ArrayOfDropZoneWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDropZone arrayofdropzone)
	{
		copy( arrayofdropzone );
	}
	public ArrayOfDropZoneWrapper( List<DropZoneWrapper> _dropZone )
	{
		this.local_dropZone = _dropZone;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDropZone raw )
	{
		if (raw == null)
			return;

		if (raw.getDropZone() != null)
		{
			this.local_dropZone = new ArrayList<DropZoneWrapper>();
			for ( int i = 0; i < raw.getDropZone().length; i++)
			{
				this.local_dropZone.add(new DropZoneWrapper(raw.getDropZone()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDropZoneWrapper [" + "dropZone = " + local_dropZone + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDropZone getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDropZone raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDropZone();
		if (this.local_dropZone!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZone[] arr = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZone[this.local_dropZone.size()];
			for ( int i = 0; i < this.local_dropZone.size(); i++)
			{
				arr[i] = this.local_dropZone.get(i) .getRaw();
			}		raw.setDropZone(arr);
}
		return raw;
	}


	public void setDropZone( List<DropZoneWrapper> _dropZone )
	{
		this.local_dropZone = _dropZone;
	}
	public List<DropZoneWrapper> getDropZone( )
	{
		return this.local_dropZone;
	}
}