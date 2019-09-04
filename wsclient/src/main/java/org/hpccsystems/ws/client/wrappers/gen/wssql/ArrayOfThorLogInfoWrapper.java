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
 * Class name: ArrayOfThorLogInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfThorLogInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.521Z
 */
public class ArrayOfThorLogInfoWrapper
{
protected List<ThorLogInfoWrapper> local_thorLogInfo = new ArrayList<ThorLogInfoWrapper>();

	public ArrayOfThorLogInfoWrapper() {}

	public ArrayOfThorLogInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfThorLogInfo arrayofthorloginfo)
	{
		copy( arrayofthorloginfo );
	}
	public ArrayOfThorLogInfoWrapper( List<ThorLogInfoWrapper> _thorLogInfo )
	{
		this.local_thorLogInfo = _thorLogInfo;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfThorLogInfo raw )
	{
		if (raw == null)
			return;

		if (raw.getThorLogInfo() != null)
		{
			this.local_thorLogInfo = new ArrayList<ThorLogInfoWrapper>();
			for ( int i = 0; i < raw.getThorLogInfo().length; i++)
			{
				this.local_thorLogInfo.add(new ThorLogInfoWrapper(raw.getThorLogInfo()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfThorLogInfoWrapper [" + "thorLogInfo = " + local_thorLogInfo + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfThorLogInfo getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfThorLogInfo raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfThorLogInfo();
		if (this.local_thorLogInfo!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ThorLogInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ThorLogInfo[this.local_thorLogInfo.size()];
			for ( int i = 0; i < this.local_thorLogInfo.size(); i++)
			{
				arr[i] = this.local_thorLogInfo.get(i) .getRaw();
			}		raw.setThorLogInfo(arr);
}
		return raw;
	}


	public void setThorLogInfo( List<ThorLogInfoWrapper> _thorLogInfo )
	{
		this.local_thorLogInfo = _thorLogInfo;
	}
	public List<ThorLogInfoWrapper> getThorLogInfo( )
	{
		return this.local_thorLogInfo;
	}
}