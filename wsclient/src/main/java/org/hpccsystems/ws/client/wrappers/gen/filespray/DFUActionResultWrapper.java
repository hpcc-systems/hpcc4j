package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: DFUActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.843Z
 */
public class DFUActionResultWrapper
{
protected String local_iD;
protected String local_action;
protected String local_result;

	public DFUActionResultWrapper() {}

	public DFUActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult dfuactionresult)
	{
		copy( dfuactionresult );
	}
	public DFUActionResultWrapper( String _iD, String _action, String _result )
	{
		this.local_iD = _iD;
		this.local_action = _action;
		this.local_result = _result;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult raw )
	{
		if (raw == null)
			return;

		this.local_iD = raw.getID();
		this.local_action = raw.getAction();
		this.local_result = raw.getResult();

	}

	@Override
	public String toString()
	{
		return "DFUActionResultWrapper [" + "iD = " + local_iD + ", " + "action = " + local_action + ", " + "result = " + local_result + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUActionResult();
		raw.setID( local_iD);
		raw.setAction( local_action);
		raw.setResult( local_result);
		return raw;
	}


	public void setID( String _iD )
	{
		this.local_iD = _iD;
	}
	public String getID( )
	{
		return this.local_iD;
	}
	public void setAction( String _action )
	{
		this.local_action = _action;
	}
	public String getAction( )
	{
		return this.local_action;
	}
	public void setResult( String _result )
	{
		this.local_result = _result;
	}
	public String getResult( )
	{
		return this.local_result;
	}
}