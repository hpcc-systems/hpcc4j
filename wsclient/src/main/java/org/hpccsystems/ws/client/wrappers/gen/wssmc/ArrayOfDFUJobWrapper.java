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
 * Class name: ArrayOfDFUJobWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfDFUJob
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:28.932Z
 */
public class ArrayOfDFUJobWrapper
{
	protected List<DFUJobWrapper> local_dFUJob = null;

	public ArrayOfDFUJobWrapper() {}

	public ArrayOfDFUJobWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfDFUJob arrayofdfujob)
	{
		copy( arrayofdfujob );
	}
	public ArrayOfDFUJobWrapper( List<DFUJobWrapper> _dFUJob )
	{
		this.local_dFUJob = _dFUJob;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfDFUJob raw )
	{
		if (raw == null)
			return;

		if (raw.getDFUJob() != null)
		{
			this.local_dFUJob = new ArrayList<DFUJobWrapper>();
			for ( int i = 0; i < raw.getDFUJob().length; i++)
			{
				this.local_dFUJob.add(new DFUJobWrapper(raw.getDFUJob()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDFUJobWrapper [" + "dFUJob = " + local_dFUJob + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfDFUJob getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfDFUJob raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfDFUJob();
		if (this.local_dFUJob!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.DFUJob[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.DFUJob[this.local_dFUJob.size()];
			for ( int i = 0; i < this.local_dFUJob.size(); i++)
			{
				arr[i] = this.local_dFUJob.get(i) .getRaw();
			}
			raw.setDFUJob(arr);
		}
		return raw;
	}


	public void setDFUJob( List<DFUJobWrapper> _dFUJob )
	{
		this.local_dFUJob = _dFUJob;
	}
	public List<DFUJobWrapper> getDFUJob( )
	{
		return this.local_dFUJob;
	}
}