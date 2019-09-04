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
 * Class name: RelatedIndexSets_type1Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSets_type1
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.631Z
 */
public class RelatedIndexSets_type1Wrapper
{
protected List<RelatedIndexSetWrapper> local_relatedIndexSet = new ArrayList<RelatedIndexSetWrapper>();

	public RelatedIndexSets_type1Wrapper() {}

	public RelatedIndexSets_type1Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSets_type1 relatedindexsets_type1)
	{
		copy( relatedindexsets_type1 );
	}
	public RelatedIndexSets_type1Wrapper( List<RelatedIndexSetWrapper> _relatedIndexSet )
	{
		this.local_relatedIndexSet = _relatedIndexSet;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSets_type1 raw )
	{
		if (raw == null)
			return;

		if (raw.getRelatedIndexSet() != null)
		{
			this.local_relatedIndexSet = new ArrayList<RelatedIndexSetWrapper>();
			for ( int i = 0; i < raw.getRelatedIndexSet().length; i++)
			{
				this.local_relatedIndexSet.add(new RelatedIndexSetWrapper(raw.getRelatedIndexSet()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "RelatedIndexSets_type1Wrapper [" + "relatedIndexSet = " + local_relatedIndexSet + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSets_type1 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSets_type1 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSets_type1();
		if (this.local_relatedIndexSet!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSet[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.RelatedIndexSet[this.local_relatedIndexSet.size()];
			for ( int i = 0; i < this.local_relatedIndexSet.size(); i++)
			{
				arr[i] = this.local_relatedIndexSet.get(i) .getRaw();
			}		raw.setRelatedIndexSet(arr);
}
		return raw;
	}


	public void setRelatedIndexSet( List<RelatedIndexSetWrapper> _relatedIndexSet )
	{
		this.local_relatedIndexSet = _relatedIndexSet;
	}
	public List<RelatedIndexSetWrapper> getRelatedIndexSet( )
	{
		return this.local_relatedIndexSet;
	}
}