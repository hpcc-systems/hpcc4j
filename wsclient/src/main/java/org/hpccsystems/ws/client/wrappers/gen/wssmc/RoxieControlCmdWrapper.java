package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: RoxieControlCmdWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmd
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.083Z
 */
public class RoxieControlCmdWrapper
{
	protected String local_processCluster;
	protected RoxieControlCmdTypeWrapper local_command;
	protected int local_wait;

	public RoxieControlCmdWrapper() {}

	public RoxieControlCmdWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmd roxiecontrolcmd)
	{
		copy( roxiecontrolcmd );
	}
	public RoxieControlCmdWrapper( String _processCluster, RoxieControlCmdTypeWrapper _command, int _wait )
	{
		this.local_processCluster = _processCluster;
		this.local_command = _command;
		this.local_wait = _wait;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmd raw )
	{
		if (raw == null)
			return;

		this.local_processCluster = raw.getProcessCluster();
		if (raw.getCommand() != null)
			this.local_command = new RoxieControlCmdTypeWrapper( raw.getCommand());
		this.local_wait = raw.getWait();

	}

	@Override
	public String toString()
	{
		return "RoxieControlCmdWrapper [" + "processCluster = " + local_processCluster + ", " + "command = " + local_command + ", " + "wait = " + local_wait + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmd getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmd raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmd();
		raw.setProcessCluster( local_processCluster);
		raw.setWait( local_wait);
		return raw;
	}


	public void setProcessCluster( String _processCluster )
	{
		this.local_processCluster = _processCluster;
	}
	public String getProcessCluster( )
	{
		return this.local_processCluster;
	}
	public void setCommand( RoxieControlCmdTypeWrapper _command )
	{
		this.local_command = _command;
	}
	public RoxieControlCmdTypeWrapper getCommand( )
	{
		return this.local_command;
	}
	public void setWait( int _wait )
	{
		this.local_wait = _wait;
	}
	public int getWait( )
	{
		return this.local_wait;
	}
}