package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: ArrayOfECLSchemaItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLSchemaItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.511Z
 */
public class ArrayOfECLSchemaItemWrapper
{
protected List<ECLSchemaItemWrapper> local_eCLSchemaItem = new ArrayList<ECLSchemaItemWrapper>();

	public ArrayOfECLSchemaItemWrapper() {}

	public ArrayOfECLSchemaItemWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLSchemaItem arrayofeclschemaitem)
	{
		copy( arrayofeclschemaitem );
	}
	public ArrayOfECLSchemaItemWrapper( List<ECLSchemaItemWrapper> _eCLSchemaItem )
	{
		this.local_eCLSchemaItem = _eCLSchemaItem;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLSchemaItem raw )
	{
		if (raw == null)
			return;

		if (raw.getECLSchemaItem() != null)
		{
			this.local_eCLSchemaItem = new ArrayList<ECLSchemaItemWrapper>();
			for ( int i = 0; i < raw.getECLSchemaItem().length; i++)
			{
				this.local_eCLSchemaItem.add(new ECLSchemaItemWrapper(raw.getECLSchemaItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfECLSchemaItemWrapper [" + "eCLSchemaItem = " + local_eCLSchemaItem + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLSchemaItem getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLSchemaItem raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLSchemaItem();
		if (this.local_eCLSchemaItem!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLSchemaItem[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLSchemaItem[this.local_eCLSchemaItem.size()];
			for ( int i = 0; i < this.local_eCLSchemaItem.size(); i++)
			{
				arr[i] = this.local_eCLSchemaItem.get(i) .getRaw();
			}		raw.setECLSchemaItem(arr);
}
		return raw;
	}


	public void setECLSchemaItem( List<ECLSchemaItemWrapper> _eCLSchemaItem )
	{
		this.local_eCLSchemaItem = _eCLSchemaItem;
	}
	public List<ECLSchemaItemWrapper> getECLSchemaItem( )
	{
		return this.local_eCLSchemaItem;
	}
}