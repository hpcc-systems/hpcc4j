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
 * Class name: ArrayOfTpDaliWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDali
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.306Z
 */
public class ArrayOfTpDaliWrapper
{
	protected List<TpDaliWrapper> local_tpDali = null;

	public ArrayOfTpDaliWrapper() {}

	public ArrayOfTpDaliWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDali arrayoftpdali)
	{
		copy( arrayoftpdali );
	}
	public ArrayOfTpDaliWrapper( List<TpDaliWrapper> _tpDali )
	{
		this.local_tpDali = _tpDali;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDali raw )
	{
		if (raw == null)
			return;

		if (raw.getTpDali() != null)
		{
			this.local_tpDali = new ArrayList<TpDaliWrapper>();
			for ( int i = 0; i < raw.getTpDali().length; i++)
			{
				this.local_tpDali.add(new TpDaliWrapper(raw.getTpDali()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpDaliWrapper [" + "tpDali = " + local_tpDali + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDali getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDali raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpDali();
		if (this.local_tpDali!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDali[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDali[this.local_tpDali.size()];
			for ( int i = 0; i < this.local_tpDali.size(); i++)
			{
				arr[i] = this.local_tpDali.get(i) .getRaw();
			}
			raw.setTpDali(arr);
		}
		return raw;
	}


	public void setTpDali( List<TpDaliWrapper> _tpDali )
	{
		this.local_tpDali = _tpDali;
	}
	public List<TpDaliWrapper> getTpDali( )
	{
		return this.local_tpDali;
	}
}