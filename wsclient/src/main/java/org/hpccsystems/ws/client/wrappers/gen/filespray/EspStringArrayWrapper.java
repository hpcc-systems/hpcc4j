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
 * Class name: EspStringArrayWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspStringArray
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.883Z
 */
public class EspStringArrayWrapper
{
protected List<String> local_item = new ArrayList<String>();

	public EspStringArrayWrapper() {}

	public EspStringArrayWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspStringArray espstringarray)
	{
		copy( espstringarray );
	}
	public EspStringArrayWrapper( List<String> _item )
	{
		this.local_item = _item;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspStringArray raw )
	{
		if (raw == null)
			return;

		if (raw.getItem() != null)
		{
			this.local_item = new ArrayList<String>();
			for ( int i = 0; i < raw.getItem().length; i++)
			{
				this.local_item.add(new String(raw.getItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "EspStringArrayWrapper [" + "item = " + local_item + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspStringArray getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspStringArray raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspStringArray();
		if (this.local_item!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_item.size()];
			for ( int i = 0; i < this.local_item.size(); i++)
			{
				arr[i] = this.local_item.get(i) ;
			}		raw.setItem(arr);
}
		return raw;
	}


	public void setItem( List<String> _item )
	{
		this.local_item = _item;
	}
	public List<String> getItem( )
	{
		return this.local_item;
	}
}