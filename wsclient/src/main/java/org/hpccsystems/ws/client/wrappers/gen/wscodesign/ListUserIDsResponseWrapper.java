package org.hpccsystems.ws.client.wrappers.gen.wscodesign;



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
import org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ListUserIDsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscodesign
 * TimeStamp: 2021-03-26T18:27:31.408Z
 */
public class ListUserIDsResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected List<String> local_userIDs = null;

	public ListUserIDsResponseWrapper() {}

	public ListUserIDsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsResponse listuseridsresponse)
	{
		copy( listuseridsresponse );
	}
	public ListUserIDsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, List<String> _userIDs )
	{
		this.local_exceptions = _exceptions;
		this.local_userIDs = _userIDs;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getUserIDs() != null && raw.getUserIDs().getItem() != null)//hand edited
		{
			this.local_userIDs = new ArrayList<String>();
			for ( int i = 0; i < raw.getUserIDs().getItem().length; i++)
			{
				this.local_userIDs.add(new String(raw.getUserIDs().getItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ListUserIDsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "userIDs = " + local_userIDs + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsResponse();
		if (this.local_userIDs!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_userIDs.size(); i++)
			{
				arr.addItem(this.local_userIDs.get(i));
			}
			raw.setUserIDs(arr);
		}
		return raw;
	}


	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}
	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
	public void setUserIDs( List<String> _userIDs )
	{
		this.local_userIDs = _userIDs;
	}
	public List<String> getUserIDs( )
	{
		return this.local_userIDs;
	}
}