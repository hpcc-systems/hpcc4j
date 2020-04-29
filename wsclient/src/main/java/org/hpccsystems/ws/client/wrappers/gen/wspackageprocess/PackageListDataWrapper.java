package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: PackageListDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-04-29T14:39:01.530Z
 */
public class PackageListDataWrapper
{
	protected String local_id;
	protected String local_queries;

	public PackageListDataWrapper() {}

	public PackageListDataWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListData packagelistdata)
	{
		copy( packagelistdata );
	}
	public PackageListDataWrapper( String _id, String _queries )
	{
		this.local_id = _id;
		this.local_queries = _queries;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListData raw )
	{
		if (raw == null)
			return;

		this.local_id = raw.getId();
		this.local_queries = raw.getQueries();

	}

	@Override
	public String toString()
	{
		return "PackageListDataWrapper [" + "id = " + local_id + ", " + "queries = " + local_queries + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListData getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListData raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListData();
		raw.setId( local_id);
		raw.setQueries( local_queries);
		return raw;
	}


	public void setId( String _id )
	{
		this.local_id = _id;
	}
	public String getId( )
	{
		return this.local_id;
	}
	public void setQueries( String _queries )
	{
		this.local_queries = _queries;
	}
	public String getQueries( )
	{
		return this.local_queries;
	}
}