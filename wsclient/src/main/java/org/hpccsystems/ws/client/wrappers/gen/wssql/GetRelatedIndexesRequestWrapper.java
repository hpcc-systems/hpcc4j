package org.hpccsystems.ws.client.wrappers.gen.wssql;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
 * Class name: GetRelatedIndexesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2021-05-14T01:46:09.109Z
 */
public class GetRelatedIndexesRequestWrapper
{
	protected FileNames_type0Wrapper local_fileNames;

	public GetRelatedIndexesRequestWrapper() {}

	public GetRelatedIndexesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesRequest getrelatedindexesrequest)
	{
		copy( getrelatedindexesrequest );
	}
	public GetRelatedIndexesRequestWrapper( FileNames_type0Wrapper _fileNames )
	{
		this.local_fileNames = _fileNames;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesRequest raw )
	{
		if (raw == null)
			return;

		if (raw.getFileNames() != null)
			this.local_fileNames = new FileNames_type0Wrapper( raw.getFileNames());

	}

	@Override
	public String toString()
	{
		return "GetRelatedIndexesRequestWrapper [" + "fileNames = " + local_fileNames + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesRequest();
		return raw;
	}


	public void setFileNames( FileNames_type0Wrapper _fileNames )
	{
		this.local_fileNames = _fileNames;
	}
	public FileNames_type0Wrapper getFileNames( )
	{
		return this.local_fileNames;
	}
}