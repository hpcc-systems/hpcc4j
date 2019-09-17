package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: TpGroupQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.945Z
 */
public class TpGroupQueryRequestWrapper
{
protected String local_kind;

	public TpGroupQueryRequestWrapper() {}

	public TpGroupQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryRequest tpgroupqueryrequest)
	{
		copy( tpgroupqueryrequest );
	}
	public TpGroupQueryRequestWrapper( String _kind )
	{
		this.local_kind = _kind;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryRequest raw )
	{
		if (raw == null)
			return;

		this.local_kind = raw.getKind();

	}

	@Override
	public String toString()
	{
		return "TpGroupQueryRequestWrapper [" + "kind = " + local_kind + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryRequest();
		raw.setKind( local_kind);
		return raw;
	}


	public void setKind( String _kind )
	{
		this.local_kind = _kind;
	}
	public String getKind( )
	{
		return this.local_kind;
	}
}