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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ListPackageRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-04-29T14:39:01.545Z
 */
public class ListPackageRequestWrapper
{
	protected String local_target;
	protected String local_process;

	public ListPackageRequestWrapper() {}

	public ListPackageRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageRequest listpackagerequest)
	{
		copy( listpackagerequest );
	}
	public ListPackageRequestWrapper( String _target, String _process )
	{
		this.local_target = _target;
		this.local_process = _process;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageRequest raw )
	{
		if (raw == null)
			return;

		this.local_target = raw.getTarget();
		this.local_process = raw.getProcess();

	}

	@Override
	public String toString()
	{
		return "ListPackageRequestWrapper [" + "target = " + local_target + ", " + "process = " + local_process + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageRequest();
		raw.setTarget( local_target);
		raw.setProcess( local_process);
		return raw;
	}


	public void setTarget( String _target )
	{
		this.local_target = _target;
	}
	public String getTarget( )
	{
		return this.local_target;
	}
	public void setProcess( String _process )
	{
		this.local_process = _process;
	}
	public String getProcess( )
	{
		return this.local_process;
	}
}