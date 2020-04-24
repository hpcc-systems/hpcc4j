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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfTpQueueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpQueue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.292Z
 */
public class ArrayOfTpQueueWrapper
{
	protected List<TpQueueWrapper> local_tpQueue = null;

	public ArrayOfTpQueueWrapper() {}

	public ArrayOfTpQueueWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpQueue arrayoftpqueue)
	{
		copy( arrayoftpqueue );
	}
	public ArrayOfTpQueueWrapper( List<TpQueueWrapper> _tpQueue )
	{
		this.local_tpQueue = _tpQueue;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpQueue raw )
	{
		if (raw == null)
			return;

		if (raw.getTpQueue() != null)
		{
			this.local_tpQueue = new ArrayList<TpQueueWrapper>();
			for ( int i = 0; i < raw.getTpQueue().length; i++)
			{
				this.local_tpQueue.add(new TpQueueWrapper(raw.getTpQueue()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpQueueWrapper [" + "tpQueue = " + local_tpQueue + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpQueue getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpQueue raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpQueue();
		if (this.local_tpQueue!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpQueue[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpQueue[this.local_tpQueue.size()];
			for ( int i = 0; i < this.local_tpQueue.size(); i++)
			{
				arr[i] = this.local_tpQueue.get(i) .getRaw();
			}
			raw.setTpQueue(arr);
		}
		return raw;
	}


	public void setTpQueue( List<TpQueueWrapper> _tpQueue )
	{
		this.local_tpQueue = _tpQueue;
	}
	public List<TpQueueWrapper> getTpQueue( )
	{
		return this.local_tpQueue;
	}
}