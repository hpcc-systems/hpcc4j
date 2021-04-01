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
 * Class name: DFURecordTypeInfoRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.832Z
 */
public class DFURecordTypeInfoRequestWrapper
{
	protected String local_name;
	protected boolean local_includeJsonTypeInfo;
	protected boolean local_includeBinTypeInfo;

	public DFURecordTypeInfoRequestWrapper() {}

	public DFURecordTypeInfoRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoRequest dfurecordtypeinforequest)
	{
		copy( dfurecordtypeinforequest );
	}
	public DFURecordTypeInfoRequestWrapper( String _name, boolean _includeJsonTypeInfo, boolean _includeBinTypeInfo )
	{
		this.local_name = _name;
		this.local_includeJsonTypeInfo = _includeJsonTypeInfo;
		this.local_includeBinTypeInfo = _includeBinTypeInfo;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoRequest raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_includeJsonTypeInfo = raw.getIncludeJsonTypeInfo();
		this.local_includeBinTypeInfo = raw.getIncludeBinTypeInfo();

	}

	@Override
	public String toString()
	{
		return "DFURecordTypeInfoRequestWrapper [" + "name = " + local_name + ", " + "includeJsonTypeInfo = " + local_includeJsonTypeInfo + ", " + "includeBinTypeInfo = " + local_includeBinTypeInfo + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFURecordTypeInfoRequest();
		raw.setName( local_name);
		raw.setIncludeJsonTypeInfo( local_includeJsonTypeInfo);
		raw.setIncludeBinTypeInfo( local_includeBinTypeInfo);
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
	public void setIncludeJsonTypeInfo( boolean _includeJsonTypeInfo )
	{
		this.local_includeJsonTypeInfo = _includeJsonTypeInfo;
	}
	public boolean getIncludeJsonTypeInfo( )
	{
		return this.local_includeJsonTypeInfo;
	}
	public void setIncludeBinTypeInfo( boolean _includeBinTypeInfo )
	{
		this.local_includeBinTypeInfo = _includeBinTypeInfo;
	}
	public boolean getIncludeBinTypeInfo( )
	{
		return this.local_includeBinTypeInfo;
	}
}