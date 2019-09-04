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
 * Class name: OutParams_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutParams_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.613Z
 */
public class OutParams_type0Wrapper
{
protected List<HPCCColumnWrapper> local_outParam = new ArrayList<HPCCColumnWrapper>();

	public OutParams_type0Wrapper() {}

	public OutParams_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutParams_type0 outparams_type0)
	{
		copy( outparams_type0 );
	}
	public OutParams_type0Wrapper( List<HPCCColumnWrapper> _outParam )
	{
		this.local_outParam = _outParam;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutParams_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getOutParam() != null)
		{
			this.local_outParam = new ArrayList<HPCCColumnWrapper>();
			for ( int i = 0; i < raw.getOutParam().length; i++)
			{
				this.local_outParam.add(new HPCCColumnWrapper(raw.getOutParam()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "OutParams_type0Wrapper [" + "outParam = " + local_outParam + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutParams_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutParams_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutParams_type0();
		if (this.local_outParam!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn[this.local_outParam.size()];
			for ( int i = 0; i < this.local_outParam.size(); i++)
			{
				arr[i] = this.local_outParam.get(i) .getRaw();
			}		raw.setOutParam(arr);
}
		return raw;
	}


	public void setOutParam( List<HPCCColumnWrapper> _outParam )
	{
		this.local_outParam = _outParam;
	}
	public List<HPCCColumnWrapper> getOutParam( )
	{
		return this.local_outParam;
	}
}