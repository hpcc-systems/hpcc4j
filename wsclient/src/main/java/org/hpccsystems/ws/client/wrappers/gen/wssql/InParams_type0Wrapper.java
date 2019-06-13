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
 * Class name: InParams_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.InParams_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.610Z
 */
public class InParams_type0Wrapper
{
protected List<HPCCColumnWrapper> local_inParam = new ArrayList<HPCCColumnWrapper>();

	public InParams_type0Wrapper() {}

	public InParams_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.InParams_type0 inparams_type0)
	{
		copy( inparams_type0 );
	}
	public InParams_type0Wrapper( List<HPCCColumnWrapper> _inParam )
	{
		this.local_inParam = _inParam;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.InParams_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getInParam() != null)
		{
			this.local_inParam = new ArrayList<HPCCColumnWrapper>();
			for ( int i = 0; i < raw.getInParam().length; i++)
			{
				this.local_inParam.add(new HPCCColumnWrapper(raw.getInParam()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "InParams_type0Wrapper [" + "inParam = " + local_inParam + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.InParams_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.InParams_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.InParams_type0();
		if (this.local_inParam!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn[this.local_inParam.size()];
			for ( int i = 0; i < this.local_inParam.size(); i++)
			{
				arr[i] = this.local_inParam.get(i) .getRaw();
			}		raw.setInParam(arr);
}
		return raw;
	}


	public void setInParam( List<HPCCColumnWrapper> _inParam )
	{
		this.local_inParam = _inParam;
	}
	public List<HPCCColumnWrapper> getInParam( )
	{
		return this.local_inParam;
	}
}