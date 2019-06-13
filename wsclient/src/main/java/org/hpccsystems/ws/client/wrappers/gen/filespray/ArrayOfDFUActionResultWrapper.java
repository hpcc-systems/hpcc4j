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
 * Class name: ArrayOfDFUActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.793Z
 */
public class ArrayOfDFUActionResultWrapper
{
protected List<DFUActionResultWrapper> local_dFUActionResult = new ArrayList<DFUActionResultWrapper>();

	public ArrayOfDFUActionResultWrapper() {}

	public ArrayOfDFUActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUActionResult arrayofdfuactionresult)
	{
		copy( arrayofdfuactionresult );
	}
	public ArrayOfDFUActionResultWrapper( List<DFUActionResultWrapper> _dFUActionResult )
	{
		this.local_dFUActionResult = _dFUActionResult;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUActionResult raw )
	{
		if (raw == null)
			return;

		if (raw.getDFUActionResult() != null)
		{
			this.local_dFUActionResult = new ArrayList<DFUActionResultWrapper>();
			for ( int i = 0; i < raw.getDFUActionResult().length; i++)
			{
				this.local_dFUActionResult.add(new DFUActionResultWrapper(raw.getDFUActionResult()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDFUActionResultWrapper [" + "dFUActionResult = " + local_dFUActionResult + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUActionResult getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUActionResult raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfDFUActionResult();
		if (this.local_dFUActionResult!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult[] arr = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult[this.local_dFUActionResult.size()];
			for ( int i = 0; i < this.local_dFUActionResult.size(); i++)
			{
				arr[i] = this.local_dFUActionResult.get(i) .getRaw();
			}		raw.setDFUActionResult(arr);
}
		return raw;
	}


	public void setDFUActionResult( List<DFUActionResultWrapper> _dFUActionResult )
	{
		this.local_dFUActionResult = _dFUActionResult;
	}
	public List<DFUActionResultWrapper> getDFUActionResult( )
	{
		return this.local_dFUActionResult;
	}
}