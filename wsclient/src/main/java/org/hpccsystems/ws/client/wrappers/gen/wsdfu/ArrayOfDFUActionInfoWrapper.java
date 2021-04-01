package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: ArrayOfDFUActionInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUActionInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.638Z
 */
public class ArrayOfDFUActionInfoWrapper
{
	protected List<DFUActionInfoWrapper> local_dFUActionInfo = null;

	public ArrayOfDFUActionInfoWrapper() {}

	public ArrayOfDFUActionInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUActionInfo arrayofdfuactioninfo)
	{
		copy( arrayofdfuactioninfo );
	}
	public ArrayOfDFUActionInfoWrapper( List<DFUActionInfoWrapper> _dFUActionInfo )
	{
		this.local_dFUActionInfo = _dFUActionInfo;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUActionInfo raw )
	{
		if (raw == null)
			return;

		if (raw.getDFUActionInfo() != null)
		{
			this.local_dFUActionInfo = new ArrayList<DFUActionInfoWrapper>();
			for ( int i = 0; i < raw.getDFUActionInfo().length; i++)
			{
				this.local_dFUActionInfo.add(new DFUActionInfoWrapper(raw.getDFUActionInfo()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDFUActionInfoWrapper [" + "dFUActionInfo = " + local_dFUActionInfo + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUActionInfo getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUActionInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUActionInfo();
		if (this.local_dFUActionInfo!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUActionInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUActionInfo[this.local_dFUActionInfo.size()];
			for ( int i = 0; i < this.local_dFUActionInfo.size(); i++)
			{
				arr[i] = this.local_dFUActionInfo.get(i) .getRaw();
			}
			raw.setDFUActionInfo(arr);
		}
		return raw;
	}


	public void setDFUActionInfo( List<DFUActionInfoWrapper> _dFUActionInfo )
	{
		this.local_dFUActionInfo = _dFUActionInfo;
	}
	public List<DFUActionInfoWrapper> getDFUActionInfo( )
	{
		return this.local_dFUActionInfo;
	}
}