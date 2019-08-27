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
 * Class name: ResourceURLs_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResourceURLs_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.634Z
 */
public class ResourceURLs_type0Wrapper
{
protected List<String> local_uRL = new ArrayList<String>();

	public ResourceURLs_type0Wrapper() {}

	public ResourceURLs_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResourceURLs_type0 resourceurls_type0)
	{
		copy( resourceurls_type0 );
	}
	public ResourceURLs_type0Wrapper( List<String> _uRL )
	{
		this.local_uRL = _uRL;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResourceURLs_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getURL() != null)
		{
			this.local_uRL = new ArrayList<String>();
			for ( int i = 0; i < raw.getURL().length; i++)
			{
				this.local_uRL.add(new String(raw.getURL()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ResourceURLs_type0Wrapper [" + "uRL = " + local_uRL + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResourceURLs_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResourceURLs_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResourceURLs_type0();
		if (this.local_uRL!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_uRL.size()];
			for ( int i = 0; i < this.local_uRL.size(); i++)
			{
				arr[i] = this.local_uRL.get(i) ;
			}		raw.setURL(arr);
}
		return raw;
	}


	public void setURL( List<String> _uRL )
	{
		this.local_uRL = _uRL;
	}
	public List<String> getURL( )
	{
		return this.local_uRL;
	}
}