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
 * Class name: SecAccessTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SecAccessType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.906Z
 */
public class SecAccessTypeWrapper
{
	protected String local_secAccessType;

	public SecAccessTypeWrapper() {}

	public SecAccessTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SecAccessType secaccesstype)
	{
		copy( secaccesstype );
	}
	public SecAccessTypeWrapper( String _secAccessType )
	{
		this.local_secAccessType = _secAccessType;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SecAccessType raw )
	{
		if (raw == null)
			return;

//Warning raw class does not provide expected method: getSecAccessType();

	}

	@Override
	public String toString()
	{
		return "SecAccessTypeWrapper [" + "secAccessType = " + local_secAccessType + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SecAccessType getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.SecAccessType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setSecAccessType(secAccessType);
		return raw;
	}


	public void setSecAccessType( String _secAccessType )
	{
		this.local_secAccessType = _secAccessType;
	}
	public String getSecAccessType( )
	{
		return this.local_secAccessType;
	}
}