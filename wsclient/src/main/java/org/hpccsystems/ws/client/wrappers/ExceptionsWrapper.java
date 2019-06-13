package org.hpccsystems.ws.client.wrappers;

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
 * Class name: ExceptionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Exceptions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-03T01:15:45.838Z
 */

public class ExceptionsWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;

	public ExceptionsWrapper() {}

	public ExceptionsWrapper(ExceptionsWrapper exceptions)
	{
		copy( exceptions );
	}

	public ExceptionsWrapper( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;

	}

	private void copy(ExceptionsWrapper raw )
	{
		this.local_exceptions = new ArrayOfEspExceptionWrapper(raw.getExceptions());
	}

	@Override
	public String toString()
	{
	    return "ExceptionsWrapper [" + "exceptions = " + local_exceptions + "]";
	}

	public ExceptionsWrapper getRaw()
	{
		ExceptionsWrapper raw = new ExceptionsWrapper();
		return raw;
	}

	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}

	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
}