package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



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
 * Class name: DFUXRefOrphanFilesQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefOrphanFilesQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-01-20T21:52:27.300Z
 */
public class DFUXRefOrphanFilesQueryResponseWrapper
{
	protected String local_dFUXRefOrphanFilesQueryResult;

	public DFUXRefOrphanFilesQueryResponseWrapper() {}

	public DFUXRefOrphanFilesQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefOrphanFilesQueryResponse dfuxreforphanfilesqueryresponse)
	{
		copy( dfuxreforphanfilesqueryresponse );
	}
	public DFUXRefOrphanFilesQueryResponseWrapper( String _dFUXRefOrphanFilesQueryResult )
	{
		this.local_dFUXRefOrphanFilesQueryResult = _dFUXRefOrphanFilesQueryResult;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefOrphanFilesQueryResponse raw )
	{
		if (raw == null)
			return;

		this.local_dFUXRefOrphanFilesQueryResult = raw.getDFUXRefOrphanFilesQueryResult();

	}

	@Override
	public String toString()
	{
		return "DFUXRefOrphanFilesQueryResponseWrapper [" + "dFUXRefOrphanFilesQueryResult = " + local_dFUXRefOrphanFilesQueryResult + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefOrphanFilesQueryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefOrphanFilesQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefOrphanFilesQueryResponse();
		raw.setDFUXRefOrphanFilesQueryResult( local_dFUXRefOrphanFilesQueryResult);
		return raw;
	}


	public void setDFUXRefOrphanFilesQueryResult( String _dFUXRefOrphanFilesQueryResult )
	{
		this.local_dFUXRefOrphanFilesQueryResult = _dFUXRefOrphanFilesQueryResult;
	}
	public String getDFUXRefOrphanFilesQueryResult( )
	{
		return this.local_dFUXRefOrphanFilesQueryResult;
	}
}