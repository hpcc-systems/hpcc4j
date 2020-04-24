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
 * Class name: TpMachineWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.290Z
 */
public class TpMachineWrapper
{
	protected String local_name;
	protected String local_netaddress;
	protected String local_configNetaddress;
	protected String local_domain;
	protected String local_directory;
	protected String local_type;
	protected String local_available;
	protected int local_oS;
	protected String local_path;
	protected int local_port;
	protected int local_processNumber;

	public TpMachineWrapper() {}

	public TpMachineWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine tpmachine)
	{
		copy( tpmachine );
	}
	public TpMachineWrapper( String _name, String _netaddress, String _configNetaddress, String _domain, String _directory, String _type, String _available, int _oS, String _path, int _port, int _processNumber )
	{
		this.local_name = _name;
		this.local_netaddress = _netaddress;
		this.local_configNetaddress = _configNetaddress;
		this.local_domain = _domain;
		this.local_directory = _directory;
		this.local_type = _type;
		this.local_available = _available;
		this.local_oS = _oS;
		this.local_path = _path;
		this.local_port = _port;
		this.local_processNumber = _processNumber;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_netaddress = raw.getNetaddress();
		this.local_configNetaddress = raw.getConfigNetaddress();
		this.local_domain = raw.getDomain();
		this.local_directory = raw.getDirectory();
		this.local_type = raw.getType();
		this.local_available = raw.getAvailable();
		this.local_oS = raw.getOS();
		this.local_path = raw.getPath();
		this.local_port = raw.getPort();
		this.local_processNumber = raw.getProcessNumber();

	}

	@Override
	public String toString()
	{
		return "TpMachineWrapper [" + "name = " + local_name + ", " + "netaddress = " + local_netaddress + ", " + "configNetaddress = " + local_configNetaddress + ", " + "domain = " + local_domain + ", " + "directory = " + local_directory + ", " + "type = " + local_type + ", " + "available = " + local_available + ", " + "oS = " + local_oS + ", " + "path = " + local_path + ", " + "port = " + local_port + ", " + "processNumber = " + local_processNumber + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine();
		raw.setName( local_name);
		raw.setNetaddress( local_netaddress);
		raw.setConfigNetaddress( local_configNetaddress);
		raw.setDomain( local_domain);
		raw.setDirectory( local_directory);
		raw.setType( local_type);
		raw.setAvailable( local_available);
		raw.setOS( local_oS);
		raw.setPath( local_path);
		raw.setPort( local_port);
		raw.setProcessNumber( local_processNumber);
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
	public void setNetaddress( String _netaddress )
	{
		this.local_netaddress = _netaddress;
	}
	public String getNetaddress( )
	{
		return this.local_netaddress;
	}
	public void setConfigNetaddress( String _configNetaddress )
	{
		this.local_configNetaddress = _configNetaddress;
	}
	public String getConfigNetaddress( )
	{
		return this.local_configNetaddress;
	}
	public void setDomain( String _domain )
	{
		this.local_domain = _domain;
	}
	public String getDomain( )
	{
		return this.local_domain;
	}
	public void setDirectory( String _directory )
	{
		this.local_directory = _directory;
	}
	public String getDirectory( )
	{
		return this.local_directory;
	}
	public void setType( String _type )
	{
		this.local_type = _type;
	}
	public String getType( )
	{
		return this.local_type;
	}
	public void setAvailable( String _available )
	{
		this.local_available = _available;
	}
	public String getAvailable( )
	{
		return this.local_available;
	}
	public void setOS( int _oS )
	{
		this.local_oS = _oS;
	}
	public int getOS( )
	{
		return this.local_oS;
	}
	public void setPath( String _path )
	{
		this.local_path = _path;
	}
	public String getPath( )
	{
		return this.local_path;
	}
	public void setPort( int _port )
	{
		this.local_port = _port;
	}
	public int getPort( )
	{
		return this.local_port;
	}
	public void setProcessNumber( int _processNumber )
	{
		this.local_processNumber = _processNumber;
	}
	public int getProcessNumber( )
	{
		return this.local_processNumber;
	}
}