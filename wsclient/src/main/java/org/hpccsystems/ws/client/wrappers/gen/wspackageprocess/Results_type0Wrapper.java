package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: Results_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Results_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-09-23T03:53:35.719Z
 */
public class Results_type0Wrapper
{
	protected List<ValidateResultWrapper> local_result = null;

	public Results_type0Wrapper() {}

	public Results_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Results_type0 results_type0)
	{
		copy( results_type0 );
	}
	public Results_type0Wrapper( List<ValidateResultWrapper> _result )
	{
		this.local_result = _result;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Results_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getResult() != null)
		{
			this.local_result = new ArrayList<ValidateResultWrapper>();
			for ( int i = 0; i < raw.getResult().length; i++)
			{
				this.local_result.add(new ValidateResultWrapper(raw.getResult()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Results_type0Wrapper [" + "result = " + local_result + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Results_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Results_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Results_type0();
		if (this.local_result!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidateResult[] arr = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidateResult[this.local_result.size()];
			for ( int i = 0; i < this.local_result.size(); i++)
			{
				arr[i] = this.local_result.get(i) .getRaw();
			}
			raw.setResult(arr);
		}
		return raw;
	}


	public void setResult( List<ValidateResultWrapper> _result )
	{
		this.local_result = _result;
	}
	public List<ValidateResultWrapper> getResult( )
	{
		return this.local_result;
	}
}