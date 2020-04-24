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
 * Class name: ArrayOfTpMachineWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMachine
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.351Z
 */
public class ArrayOfTpMachineWrapper
{
	protected List<TpMachineWrapper> local_tpMachine = null;

	public ArrayOfTpMachineWrapper() {}

	public ArrayOfTpMachineWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMachine arrayoftpmachine)
	{
		copy( arrayoftpmachine );
	}
	public ArrayOfTpMachineWrapper( List<TpMachineWrapper> _tpMachine )
	{
		this.local_tpMachine = _tpMachine;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMachine raw )
	{
		if (raw == null)
			return;

		if (raw.getTpMachine() != null)
		{
			this.local_tpMachine = new ArrayList<TpMachineWrapper>();
			for ( int i = 0; i < raw.getTpMachine().length; i++)
			{
				this.local_tpMachine.add(new TpMachineWrapper(raw.getTpMachine()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpMachineWrapper [" + "tpMachine = " + local_tpMachine + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMachine getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMachine raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpMachine();
		if (this.local_tpMachine!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine[this.local_tpMachine.size()];
			for ( int i = 0; i < this.local_tpMachine.size(); i++)
			{
				arr[i] = this.local_tpMachine.get(i) .getRaw();
			}
			raw.setTpMachine(arr);
		}
		return raw;
	}


	public void setTpMachine( List<TpMachineWrapper> _tpMachine )
	{
		this.local_tpMachine = _tpMachine;
	}
	public List<TpMachineWrapper> getTpMachine( )
	{
		return this.local_tpMachine;
	}
}