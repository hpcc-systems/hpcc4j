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
 * Class name: ArrayOfDFUWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.802Z
 */
public class ArrayOfDFUWorkunitWrapper
{
protected List<DFUWorkunitWrapper> local_dFUWorkunit = new ArrayList<DFUWorkunitWrapper>();

	public ArrayOfDFUWorkunitWrapper() {}

	public ArrayOfDFUWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUWorkunit arrayofdfuworkunit)
	{
		copy( arrayofdfuworkunit );
	}
	public ArrayOfDFUWorkunitWrapper( List<DFUWorkunitWrapper> _dFUWorkunit )
	{
		this.local_dFUWorkunit = _dFUWorkunit;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUWorkunit raw )
	{
		if (raw == null)
			return;

		if (raw.getDFUWorkunit() != null)
		{
			this.local_dFUWorkunit = new ArrayList<DFUWorkunitWrapper>();
			for ( int i = 0; i < raw.getDFUWorkunit().length; i++)
			{
				this.local_dFUWorkunit.add(new DFUWorkunitWrapper(raw.getDFUWorkunit()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDFUWorkunitWrapper [" + "dFUWorkunit = " + local_dFUWorkunit + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUWorkunit getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUWorkunit();
		if (this.local_dFUWorkunit!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit[] arr = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunit[this.local_dFUWorkunit.size()];
			for ( int i = 0; i < this.local_dFUWorkunit.size(); i++)
			{
				arr[i] = this.local_dFUWorkunit.get(i) .getRaw();
			}		raw.setDFUWorkunit(arr);
}
		return raw;
	}


	public void setDFUWorkunit( List<DFUWorkunitWrapper> _dFUWorkunit )
	{
		this.local_dFUWorkunit = _dFUWorkunit;
	}
	public List<DFUWorkunitWrapper> getDFUWorkunit( )
	{
		return this.local_dFUWorkunit;
	}
}