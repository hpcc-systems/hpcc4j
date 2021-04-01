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
 * Class name: ArrayOfServerJobQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfServerJobQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:28.954Z
 */
public class ArrayOfServerJobQueueWrapper
{
	protected List<ServerJobQueueWrapper> local_serverJobQueue = null;

	public ArrayOfServerJobQueueWrapper() {}

	public ArrayOfServerJobQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfServerJobQueue arrayofserverjobqueue)
	{
		copy( arrayofserverjobqueue );
	}
	public ArrayOfServerJobQueueWrapper( List<ServerJobQueueWrapper> _serverJobQueue )
	{
		this.local_serverJobQueue = _serverJobQueue;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfServerJobQueue raw )
	{
		if (raw == null)
			return;

		if (raw.getServerJobQueue() != null)
		{
			this.local_serverJobQueue = new ArrayList<ServerJobQueueWrapper>();
			for ( int i = 0; i < raw.getServerJobQueue().length; i++)
			{
				this.local_serverJobQueue.add(new ServerJobQueueWrapper(raw.getServerJobQueue()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfServerJobQueueWrapper [" + "serverJobQueue = " + local_serverJobQueue + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfServerJobQueue getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfServerJobQueue raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfServerJobQueue();
		if (this.local_serverJobQueue!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ServerJobQueue[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ServerJobQueue[this.local_serverJobQueue.size()];
			for ( int i = 0; i < this.local_serverJobQueue.size(); i++)
			{
				arr[i] = this.local_serverJobQueue.get(i) .getRaw();
			}
			raw.setServerJobQueue(arr);
		}
		return raw;
	}


	public void setServerJobQueue( List<ServerJobQueueWrapper> _serverJobQueue )
	{
		this.local_serverJobQueue = _serverJobQueue;
	}
	public List<ServerJobQueueWrapper> getServerJobQueue( )
	{
		return this.local_serverJobQueue;
	}
}