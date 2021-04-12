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
 * Class name: DFUChangeProtectionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUChangeProtection
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.700Z
 */
public class DFUChangeProtectionWrapper
{
	protected int local_dFUChangeProtection;

	public DFUChangeProtectionWrapper() {}

	public DFUChangeProtectionWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUChangeProtection dfuchangeprotection)
	{
		copy( dfuchangeprotection );
	}
	public DFUChangeProtectionWrapper( int _dFUChangeProtection )
	{
		this.local_dFUChangeProtection = _dFUChangeProtection;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUChangeProtection raw )
	{
		if (raw == null)
			return;

//Warning raw class does not provide expected method: getDFUChangeProtection();

	}

	@Override
	public String toString()
	{
		return "DFUChangeProtectionWrapper [" + "dFUChangeProtection = " + local_dFUChangeProtection + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUChangeProtection getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUChangeProtection raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUChangeProtection(dFUChangeProtection);
		return raw;
	}


	public void setDFUChangeProtection( int _dFUChangeProtection )
	{
		this.local_dFUChangeProtection = _dFUChangeProtection;
	}
	public int getDFUChangeProtection( )
	{
		return this.local_dFUChangeProtection;
	}
}