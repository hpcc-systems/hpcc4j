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
 * Class name: SetRelatedIndexesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2021-05-14T01:46:09.051Z
 */
public class SetRelatedIndexesRequestWrapper
{
	protected RelatedIndexSets_type1Wrapper local_relatedIndexSets;

	public SetRelatedIndexesRequestWrapper() {}

	public SetRelatedIndexesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesRequest setrelatedindexesrequest)
	{
		copy( setrelatedindexesrequest );
	}
	public SetRelatedIndexesRequestWrapper( RelatedIndexSets_type1Wrapper _relatedIndexSets )
	{
		this.local_relatedIndexSets = _relatedIndexSets;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesRequest raw )
	{
		if (raw == null)
			return;

		if (raw.getRelatedIndexSets() != null)
			this.local_relatedIndexSets = new RelatedIndexSets_type1Wrapper( raw.getRelatedIndexSets());

	}

	@Override
	public String toString()
	{
		return "SetRelatedIndexesRequestWrapper [" + "relatedIndexSets = " + local_relatedIndexSets + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesRequest();
		return raw;
	}


	public void setRelatedIndexSets( RelatedIndexSets_type1Wrapper _relatedIndexSets )
	{
		this.local_relatedIndexSets = _relatedIndexSets;
	}
	public RelatedIndexSets_type1Wrapper getRelatedIndexSets( )
	{
		return this.local_relatedIndexSets;
	}
}