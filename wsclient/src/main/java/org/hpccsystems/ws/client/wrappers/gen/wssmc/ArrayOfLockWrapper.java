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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfLockWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfLock
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:28.947Z
 */
public class ArrayOfLockWrapper
{
	protected List<LockWrapper> local_lock = null;

	public ArrayOfLockWrapper() {}

	public ArrayOfLockWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfLock arrayoflock)
	{
		copy( arrayoflock );
	}
	public ArrayOfLockWrapper( List<LockWrapper> _lock )
	{
		this.local_lock = _lock;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfLock raw )
	{
		if (raw == null)
			return;

		if (raw.getLock() != null)
		{
			this.local_lock = new ArrayList<LockWrapper>();
			for ( int i = 0; i < raw.getLock().length; i++)
			{
				this.local_lock.add(new LockWrapper(raw.getLock()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfLockWrapper [" + "lock = " + local_lock + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfLock getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfLock raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfLock();
		if (this.local_lock!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Lock[this.local_lock.size()];
			for ( int i = 0; i < this.local_lock.size(); i++)
			{
				arr[i] = this.local_lock.get(i) .getRaw();
			}
			raw.setLock(arr);
		}
		return raw;
	}


	public void setLock( List<LockWrapper> _lock )
	{
		this.local_lock = _lock;
	}
	public List<LockWrapper> getLock( )
	{
		return this.local_lock;
	}
}