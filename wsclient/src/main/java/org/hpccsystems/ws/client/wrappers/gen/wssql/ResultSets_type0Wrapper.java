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
 * Class name: ResultSets_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResultSets_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.635Z
 */
public class ResultSets_type0Wrapper
{
protected List<OutputDatasetWrapper> local_resultSet = new ArrayList<OutputDatasetWrapper>();

	public ResultSets_type0Wrapper() {}

	public ResultSets_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResultSets_type0 resultsets_type0)
	{
		copy( resultsets_type0 );
	}
	public ResultSets_type0Wrapper( List<OutputDatasetWrapper> _resultSet )
	{
		this.local_resultSet = _resultSet;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResultSets_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getResultSet() != null)
		{
			this.local_resultSet = new ArrayList<OutputDatasetWrapper>();
			for ( int i = 0; i < raw.getResultSet().length; i++)
			{
				this.local_resultSet.add(new OutputDatasetWrapper(raw.getResultSet()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ResultSets_type0Wrapper [" + "resultSet = " + local_resultSet + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResultSets_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResultSets_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ResultSets_type0();
		if (this.local_resultSet!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset[this.local_resultSet.size()];
			for ( int i = 0; i < this.local_resultSet.size(); i++)
			{
				arr[i] = this.local_resultSet.get(i) .getRaw();
			}		raw.setResultSet(arr);
}
		return raw;
	}


	public void setResultSet( List<OutputDatasetWrapper> _resultSet )
	{
		this.local_resultSet = _resultSet;
	}
	public List<OutputDatasetWrapper> getResultSet( )
	{
		return this.local_resultSet;
	}
}