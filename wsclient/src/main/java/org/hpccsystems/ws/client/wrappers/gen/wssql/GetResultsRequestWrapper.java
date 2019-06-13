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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GetResultsRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.598Z
 */
public class GetResultsRequestWrapper
{
protected String local_wuId;
protected boolean local_suppressXmlSchema;
protected int local_resultWindowStart;
protected int local_resultWindowCount;

	public GetResultsRequestWrapper() {}

	public GetResultsRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest getresultsrequest)
	{
		copy( getresultsrequest );
	}
	public GetResultsRequestWrapper( String _wuId, boolean _suppressXmlSchema, int _resultWindowStart, int _resultWindowCount )
	{
		this.local_wuId = _wuId;
		this.local_suppressXmlSchema = _suppressXmlSchema;
		this.local_resultWindowStart = _resultWindowStart;
		this.local_resultWindowCount = _resultWindowCount;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest raw )
	{
		if (raw == null)
			return;

		this.local_wuId = raw.getWuId();
		this.local_suppressXmlSchema = raw.getSuppressXmlSchema();
		this.local_resultWindowStart = raw.getResultWindowStart();
		this.local_resultWindowCount = raw.getResultWindowCount();

	}

	@Override
	public String toString()
	{
		return "GetResultsRequestWrapper [" + "wuId = " + local_wuId + ", " + "suppressXmlSchema = " + local_suppressXmlSchema + ", " + "resultWindowStart = " + local_resultWindowStart + ", " + "resultWindowCount = " + local_resultWindowCount + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest();
		raw.setWuId( local_wuId);
		raw.setSuppressXmlSchema( local_suppressXmlSchema);
		raw.setResultWindowStart( local_resultWindowStart);
		raw.setResultWindowCount( local_resultWindowCount);
		return raw;
	}


	public void setWuId( String _wuId )
	{
		this.local_wuId = _wuId;
	}
	public String getWuId( )
	{
		return this.local_wuId;
	}
	public void setSuppressXmlSchema( boolean _suppressXmlSchema )
	{
		this.local_suppressXmlSchema = _suppressXmlSchema;
	}
	public boolean getSuppressXmlSchema( )
	{
		return this.local_suppressXmlSchema;
	}
	public void setResultWindowStart( int _resultWindowStart )
	{
		this.local_resultWindowStart = _resultWindowStart;
	}
	public int getResultWindowStart( )
	{
		return this.local_resultWindowStart;
	}
	public void setResultWindowCount( int _resultWindowCount )
	{
		this.local_resultWindowCount = _resultWindowCount;
	}
	public int getResultWindowCount( )
	{
		return this.local_resultWindowCount;
	}
}