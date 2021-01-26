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
 * Class name: DFUXRefListResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-03-24T23:14:30.211Z
 */
public class DFUXRefListResponseWrapper
{
	protected String local_dFUXRefListResult;

	public DFUXRefListResponseWrapper() {}

	public DFUXRefListResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse dfuxreflistresponse)
	{
		copy( dfuxreflistresponse );
	}
	public DFUXRefListResponseWrapper( String _dFUXRefListResult )
	{
		this.local_dFUXRefListResult = _dFUXRefListResult;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse raw )
	{
		if (raw == null)
			return;

		this.local_dFUXRefListResult = raw.getDFUXRefListResult();

	}

	@Override
	public String toString()
	{
		return "DFUXRefListResponseWrapper [" + "dFUXRefListResult = " + local_dFUXRefListResult + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse();
		raw.setDFUXRefListResult( local_dFUXRefListResult);
		return raw;
	}


	public void setDFUXRefListResult( String _dFUXRefListResult )
	{
		this.local_dFUXRefListResult = _dFUXRefListResult;
	}
	public String getDFUXRefListResult( )
	{
		return this.local_dFUXRefListResult;
	}
}