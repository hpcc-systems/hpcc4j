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
 * Class name: OutputDatasetWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.614Z
 */
public class OutputDatasetWrapper
{
protected String local_name;
protected OutParams_type0Wrapper local_outParams;

	public OutputDatasetWrapper() {}

	public OutputDatasetWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset outputdataset)
	{
		copy( outputdataset );
	}
	public OutputDatasetWrapper( String _name, OutParams_type0Wrapper _outParams )
	{
		this.local_name = _name;
		this.local_outParams = _outParams;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_outParams = new OutParams_type0Wrapper( raw.getOutParams());

	}

	@Override
	public String toString()
	{
		return "OutputDatasetWrapper [" + "name = " + local_name + ", " + "outParams = " + local_outParams + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset();
		raw.setName( local_name);
		return raw;
	}


	public void setName( String _name )
	{
		this.local_name = _name;
	}
	public String getName( )
	{
		return this.local_name;
	}
	public void setOutParams( OutParams_type0Wrapper _outParams )
	{
		this.local_outParams = _outParams;
	}
	public OutParams_type0Wrapper getOutParams( )
	{
		return this.local_outParams;
	}
}