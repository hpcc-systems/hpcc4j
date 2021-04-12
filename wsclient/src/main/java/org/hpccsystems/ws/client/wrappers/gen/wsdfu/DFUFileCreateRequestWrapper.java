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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUFileCreateRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.741Z
 */
public class DFUFileCreateRequestWrapper
{
	protected String local_eCLRecordDefinition;
	protected List<String> local_partLocations = null;
	protected DFUFileAccessRequestBaseWrapper local_requestBase;

	public DFUFileCreateRequestWrapper() {}

	public DFUFileCreateRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateRequest dfufilecreaterequest)
	{
		copy( dfufilecreaterequest );
	}
	public DFUFileCreateRequestWrapper( String _eCLRecordDefinition, List<String> _partLocations, DFUFileAccessRequestBaseWrapper _requestBase )
	{
		this.local_eCLRecordDefinition = _eCLRecordDefinition;
		this.local_partLocations = _partLocations;
		this.local_requestBase = _requestBase;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateRequest raw )
	{
		if (raw == null)
			return;

		this.local_eCLRecordDefinition = raw.getECLRecordDefinition();
		if (raw.getPartLocations() != null)
		{
			this.local_partLocations = new ArrayList<String>();
			for ( int i = 0; i < raw.getPartLocations().getItem().length; i++)
			{
				this.local_partLocations.add(new String(raw.getPartLocations().getItem()[i]));
			}
		}		if (raw.getRequestBase() != null)
			this.local_requestBase = new DFUFileAccessRequestBaseWrapper( raw.getRequestBase());

	}

	@Override
	public String toString()
	{
		return "DFUFileCreateRequestWrapper [" + "eCLRecordDefinition = " + local_eCLRecordDefinition + ", " + "partLocations = " + local_partLocations + ", " + "requestBase = " + local_requestBase + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFileCreateRequest();
		raw.setECLRecordDefinition( local_eCLRecordDefinition);
		if (this.local_partLocations!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_partLocations.size(); i++)
			{
				arr.addItem(this.local_partLocations.get(i));
			}
			raw.setPartLocations(arr);
		}
		return raw;
	}


	public void setECLRecordDefinition( String _eCLRecordDefinition )
	{
		this.local_eCLRecordDefinition = _eCLRecordDefinition;
	}
	public String getECLRecordDefinition( )
	{
		return this.local_eCLRecordDefinition;
	}
	public void setPartLocations( List<String> _partLocations )
	{
		this.local_partLocations = _partLocations;
	}
	public List<String> getPartLocations( )
	{
		return this.local_partLocations;
	}
	public void setRequestBase( DFUFileAccessRequestBaseWrapper _requestBase )
	{
		this.local_requestBase = _requestBase;
	}
	public DFUFileAccessRequestBaseWrapper getRequestBase( )
	{
		return this.local_requestBase;
	}
}