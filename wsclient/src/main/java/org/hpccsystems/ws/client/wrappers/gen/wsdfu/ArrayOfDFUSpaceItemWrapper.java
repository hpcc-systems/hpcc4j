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
 * Class name: ArrayOfDFUSpaceItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUSpaceItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.666Z
 */
public class ArrayOfDFUSpaceItemWrapper
{
	protected List<DFUSpaceItemWrapper> local_dFUSpaceItem = null;

	public ArrayOfDFUSpaceItemWrapper() {}

	public ArrayOfDFUSpaceItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUSpaceItem arrayofdfuspaceitem)
	{
		copy( arrayofdfuspaceitem );
	}
	public ArrayOfDFUSpaceItemWrapper( List<DFUSpaceItemWrapper> _dFUSpaceItem )
	{
		this.local_dFUSpaceItem = _dFUSpaceItem;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUSpaceItem raw )
	{
		if (raw == null)
			return;

		if (raw.getDFUSpaceItem() != null)
		{
			this.local_dFUSpaceItem = new ArrayList<DFUSpaceItemWrapper>();
			for ( int i = 0; i < raw.getDFUSpaceItem().length; i++)
			{
				this.local_dFUSpaceItem.add(new DFUSpaceItemWrapper(raw.getDFUSpaceItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDFUSpaceItemWrapper [" + "dFUSpaceItem = " + local_dFUSpaceItem + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUSpaceItem getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUSpaceItem raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.ArrayOfDFUSpaceItem();
		if (this.local_dFUSpaceItem!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSpaceItem[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUSpaceItem[this.local_dFUSpaceItem.size()];
			for ( int i = 0; i < this.local_dFUSpaceItem.size(); i++)
			{
				arr[i] = this.local_dFUSpaceItem.get(i) .getRaw();
			}
			raw.setDFUSpaceItem(arr);
		}
		return raw;
	}


	public void setDFUSpaceItem( List<DFUSpaceItemWrapper> _dFUSpaceItem )
	{
		this.local_dFUSpaceItem = _dFUSpaceItem;
	}
	public List<DFUSpaceItemWrapper> getDFUSpaceItem( )
	{
		return this.local_dFUSpaceItem;
	}
}