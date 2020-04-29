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
 * Class name: ArrayOfTpSparkThorWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpSparkThor
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.395Z
 */
public class ArrayOfTpSparkThorWrapper
{
	protected List<TpSparkThorWrapper> local_tpSparkThor = null;

	public ArrayOfTpSparkThorWrapper() {}

	public ArrayOfTpSparkThorWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpSparkThor arrayoftpsparkthor)
	{
		copy( arrayoftpsparkthor );
	}
	public ArrayOfTpSparkThorWrapper( List<TpSparkThorWrapper> _tpSparkThor )
	{
		this.local_tpSparkThor = _tpSparkThor;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpSparkThor raw )
	{
		if (raw == null)
			return;

		if (raw.getTpSparkThor() != null)
		{
			this.local_tpSparkThor = new ArrayList<TpSparkThorWrapper>();
			for ( int i = 0; i < raw.getTpSparkThor().length; i++)
			{
				this.local_tpSparkThor.add(new TpSparkThorWrapper(raw.getTpSparkThor()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfTpSparkThorWrapper [" + "tpSparkThor = " + local_tpSparkThor + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpSparkThor getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpSparkThor raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpSparkThor();
		if (this.local_tpSparkThor!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSparkThor[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSparkThor[this.local_tpSparkThor.size()];
			for ( int i = 0; i < this.local_tpSparkThor.size(); i++)
			{
				arr[i] = this.local_tpSparkThor.get(i) .getRaw();
			}
			raw.setTpSparkThor(arr);
		}
		return raw;
	}


	public void setTpSparkThor( List<TpSparkThorWrapper> _tpSparkThor )
	{
		this.local_tpSparkThor = _tpSparkThor;
	}
	public List<TpSparkThorWrapper> getTpSparkThor( )
	{
		return this.local_tpSparkThor;
	}
}