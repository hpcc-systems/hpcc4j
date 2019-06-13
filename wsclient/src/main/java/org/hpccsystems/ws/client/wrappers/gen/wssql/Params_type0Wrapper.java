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
 * Class name: Params_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Params_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.616Z
 */
public class Params_type0Wrapper
{
protected List<DataTypeParamWrapper> local_param = new ArrayList<DataTypeParamWrapper>();

	public Params_type0Wrapper() {}

	public Params_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Params_type0 params_type0)
	{
		copy( params_type0 );
	}
	public Params_type0Wrapper( List<DataTypeParamWrapper> _param )
	{
		this.local_param = _param;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Params_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getParam() != null)
		{
			this.local_param = new ArrayList<DataTypeParamWrapper>();
			for ( int i = 0; i < raw.getParam().length; i++)
			{
				this.local_param.add(new DataTypeParamWrapper(raw.getParam()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Params_type0Wrapper [" + "param = " + local_param + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Params_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Params_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Params_type0();
		if (this.local_param!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataTypeParam[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DataTypeParam[this.local_param.size()];
			for ( int i = 0; i < this.local_param.size(); i++)
			{
				arr[i] = this.local_param.get(i) .getRaw();
			}		raw.setParam(arr);
}
		return raw;
	}


	public void setParam( List<DataTypeParamWrapper> _param )
	{
		this.local_param = _param;
	}
	public List<DataTypeParamWrapper> getParam( )
	{
		return this.local_param;
	}
}