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
 * Class name: GetRelatedIndexesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.596Z
 */
public class GetRelatedIndexesResponseWrapper
{
protected RelatedIndexSets_type2Wrapper local_relatedIndexSets;

	public GetRelatedIndexesResponseWrapper() {}

	public GetRelatedIndexesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesResponse getrelatedindexesresponse)
	{
		copy( getrelatedindexesresponse );
	}
	public GetRelatedIndexesResponseWrapper( RelatedIndexSets_type2Wrapper _relatedIndexSets )
	{
		this.local_relatedIndexSets = _relatedIndexSets;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesResponse raw )
	{
		if (raw == null)
			return;

		this.local_relatedIndexSets = new RelatedIndexSets_type2Wrapper( raw.getRelatedIndexSets());

	}

	@Override
	public String toString()
	{
		return "GetRelatedIndexesResponseWrapper [" + "relatedIndexSets = " + local_relatedIndexSets + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesResponse();
		return raw;
	}


	public void setRelatedIndexSets( RelatedIndexSets_type2Wrapper _relatedIndexSets )
	{
		this.local_relatedIndexSets = _relatedIndexSets;
	}
	public RelatedIndexSets_type2Wrapper getRelatedIndexSets( )
	{
		return this.local_relatedIndexSets;
	}
}