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
 * Class name: ArrayOfTpFTSlaveWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpFTSlave
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.869Z
 */
public class ArrayOfTpFTSlaveWrapper
{
protected List<TpFTSlaveWrapper> local_tpFTSlave = new ArrayList<TpFTSlaveWrapper>();

	public ArrayOfTpFTSlaveWrapper() {}

	public ArrayOfTpFTSlaveWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpFTSlave arrayoftpftslave)
	{
		copy( arrayoftpftslave );
	}
	public ArrayOfTpFTSlaveWrapper( List<TpFTSlaveWrapper> _tpFTSlave )
	{
		this.local_tpFTSlave = _tpFTSlave;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpFTSlave raw )
	{
		if (raw == null)
			return;

		if (raw.getTpFTSlave() != null)
		{
			this.local_tpFTSlave = new ArrayList<TpFTSlaveWrapper>();
			for ( int i = 0; i < raw.getTpFTSlave().length; i++)
			{
				this.local_tpFTSlave.add(new TpFTSlaveWrapper(raw.getTpFTSlave()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpFTSlaveWrapper [" + "tpFTSlave = " + local_tpFTSlave + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpFTSlave getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpFTSlave raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpFTSlave();
		if (this.local_tpFTSlave!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpFTSlave[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpFTSlave[this.local_tpFTSlave.size()];
			for ( int i = 0; i < this.local_tpFTSlave.size(); i++)
			{
				arr[i] = this.local_tpFTSlave.get(i) .getRaw();
			}
			raw.setTpFTSlave(arr);
		}
		return raw;
	}


	public void setTpFTSlave( List<TpFTSlaveWrapper> _tpFTSlave )
	{
		this.local_tpFTSlave = _tpFTSlave;
	}
	public List<TpFTSlaveWrapper> getTpFTSlave( )
	{
		return this.local_tpFTSlave;
	}
}