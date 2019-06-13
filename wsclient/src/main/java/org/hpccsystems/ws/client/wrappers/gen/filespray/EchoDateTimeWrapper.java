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
import java.util.Calendar;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: EchoDateTimeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTime
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.877Z
 */
public class EchoDateTimeWrapper
{
protected Calendar local_dt;

	public EchoDateTimeWrapper() {}

	public EchoDateTimeWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTime echodatetime)
	{
		copy( echodatetime );
	}
	public EchoDateTimeWrapper( Calendar _dt )
	{
		this.local_dt = _dt;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTime raw )
	{
		if (raw == null)
			return;

		this.local_dt = raw.getDt();

	}

	@Override
	public String toString()
	{
		return "EchoDateTimeWrapper [" + "dt = " + local_dt + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTime getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTime raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTime();
		raw.setDt( local_dt);
		return raw;
	}


	public void setDt( Calendar _dt )
	{
		this.local_dt = _dt;
	}
	public Calendar getDt( )
	{
		return this.local_dt;
	}
}