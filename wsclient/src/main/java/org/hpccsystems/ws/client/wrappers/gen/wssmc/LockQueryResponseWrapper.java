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
 * Class name: LockQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.041Z
 */
public class LockQueryResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected ArrayOfLockWrapper local_locks;
	protected int local_numLocks;

	public LockQueryResponseWrapper() {}

	public LockQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQueryResponse lockqueryresponse)
	{
		copy( lockqueryresponse );
	}
	public LockQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfLockWrapper _locks, int _numLocks )
	{
		this.local_exceptions = _exceptions;
		this.local_locks = _locks;
		this.local_numLocks = _numLocks;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQueryResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getLocks() != null)
			this.local_locks = new ArrayOfLockWrapper( raw.getLocks());
		this.local_numLocks = raw.getNumLocks();

	}

	@Override
	public String toString()
	{
		return "LockQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "locks = " + local_locks + ", " + "numLocks = " + local_numLocks + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQueryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQueryResponse();
		raw.setNumLocks( local_numLocks);
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
	public void setLocks( ArrayOfLockWrapper _locks )
	{
		this.local_locks = _locks;
	}
	public ArrayOfLockWrapper getLocks( )
	{
		return this.local_locks;
	}
	public void setNumLocks( int _numLocks )
	{
		this.local_numLocks = _numLocks;
	}
	public int getNumLocks( )
	{
		return this.local_numLocks;
	}
}