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
 * Class name: ArrayOfSMCJobWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfSMCJob
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:28.957Z
 */
public class ArrayOfSMCJobWrapper
{
	protected List<SMCJobWrapper> local_sMCJob = null;

	public ArrayOfSMCJobWrapper() {}

	public ArrayOfSMCJobWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfSMCJob arrayofsmcjob)
	{
		copy( arrayofsmcjob );
	}
	public ArrayOfSMCJobWrapper( List<SMCJobWrapper> _sMCJob )
	{
		this.local_sMCJob = _sMCJob;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfSMCJob raw )
	{
		if (raw == null)
			return;

		if (raw.getSMCJob() != null)
		{
			this.local_sMCJob = new ArrayList<SMCJobWrapper>();
			for ( int i = 0; i < raw.getSMCJob().length; i++)
			{
				this.local_sMCJob.add(new SMCJobWrapper(raw.getSMCJob()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfSMCJobWrapper [" + "sMCJob = " + local_sMCJob + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfSMCJob getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfSMCJob raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfSMCJob();
		if (this.local_sMCJob!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCJob[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCJob[this.local_sMCJob.size()];
			for ( int i = 0; i < this.local_sMCJob.size(); i++)
			{
				arr[i] = this.local_sMCJob.get(i) .getRaw();
			}
			raw.setSMCJob(arr);
		}
		return raw;
	}


	public void setSMCJob( List<SMCJobWrapper> _sMCJob )
	{
		this.local_sMCJob = _sMCJob;
	}
	public List<SMCJobWrapper> getSMCJob( )
	{
		return this.local_sMCJob;
	}
}