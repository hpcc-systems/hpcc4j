package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUDefFileRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.713Z
 */
public class DFUDefFileRequestWrapper
{
	protected String local_name;
	protected DFUDefFileFormatWrapper local_format;

	public DFUDefFileRequestWrapper() {}

	public DFUDefFileRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileRequest dfudeffilerequest)
	{
		copy( dfudeffilerequest );
	}
	public DFUDefFileRequestWrapper( String _name, DFUDefFileFormatWrapper _format )
	{
		this.local_name = _name;
		this.local_format = _format;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileRequest raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		if (raw.getFormat() != null)
			this.local_format = new DFUDefFileFormatWrapper( raw.getFormat());

	}

	@Override
	public String toString()
	{
		return "DFUDefFileRequestWrapper [" + "name = " + local_name + ", " + "format = " + local_format + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileRequest();
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
	public void setFormat( DFUDefFileFormatWrapper _format )
	{
		this.local_format = _format;
	}
	public DFUDefFileFormatWrapper getFormat( )
	{
		return this.local_format;
	}
}