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
 * Class name: TpBindingWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpBinding
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.403Z
 */
public class TpBindingWrapper
{
	protected String local_name;
	protected String local_service;
	protected String local_serviceType;
	protected String local_bindingType;
	protected String local_serviceBuildSet;
	protected String local_port;
	protected String local_protocol;

	public TpBindingWrapper() {}

	public TpBindingWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpBinding tpbinding)
	{
		copy( tpbinding );
	}
	public TpBindingWrapper( String _name, String _service, String _serviceType, String _bindingType, String _serviceBuildSet, String _port, String _protocol )
	{
		this.local_name = _name;
		this.local_service = _service;
		this.local_serviceType = _serviceType;
		this.local_bindingType = _bindingType;
		this.local_serviceBuildSet = _serviceBuildSet;
		this.local_port = _port;
		this.local_protocol = _protocol;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpBinding raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_service = raw.getService();
		this.local_serviceType = raw.getServiceType();
		this.local_bindingType = raw.getBindingType();
		this.local_serviceBuildSet = raw.getServiceBuildSet();
		this.local_port = raw.getPort();
		this.local_protocol = raw.getProtocol();

	}

	@Override
	public String toString()
	{
		return "TpBindingWrapper [" + "name = " + local_name + ", " + "service = " + local_service + ", " + "serviceType = " + local_serviceType + ", " + "bindingType = " + local_bindingType + ", " + "serviceBuildSet = " + local_serviceBuildSet + ", " + "port = " + local_port + ", " + "protocol = " + local_protocol + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpBinding getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpBinding raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpBinding();
		raw.setName( local_name);
		raw.setService( local_service);
		raw.setServiceType( local_serviceType);
		raw.setBindingType( local_bindingType);
		raw.setServiceBuildSet( local_serviceBuildSet);
		raw.setPort( local_port);
		raw.setProtocol( local_protocol);
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
	public void setService( String _service )
	{
		this.local_service = _service;
	}
	public String getService( )
	{
		return this.local_service;
	}
	public void setServiceType( String _serviceType )
	{
		this.local_serviceType = _serviceType;
	}
	public String getServiceType( )
	{
		return this.local_serviceType;
	}
	public void setBindingType( String _bindingType )
	{
		this.local_bindingType = _bindingType;
	}
	public String getBindingType( )
	{
		return this.local_bindingType;
	}
	public void setServiceBuildSet( String _serviceBuildSet )
	{
		this.local_serviceBuildSet = _serviceBuildSet;
	}
	public String getServiceBuildSet( )
	{
		return this.local_serviceBuildSet;
	}
	public void setPort( String _port )
	{
		this.local_port = _port;
	}
	public String getPort( )
	{
		return this.local_port;
	}
	public void setProtocol( String _protocol )
	{
		this.local_protocol = _protocol;
	}
	public String getProtocol( )
	{
		return this.local_protocol;
	}
}