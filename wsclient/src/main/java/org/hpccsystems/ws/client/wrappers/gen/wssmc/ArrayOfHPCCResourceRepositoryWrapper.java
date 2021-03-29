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
 * Class name: ArrayOfHPCCResourceRepositoryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfHPCCResourceRepository
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:28.943Z
 */
public class ArrayOfHPCCResourceRepositoryWrapper
{
	protected List<HPCCResourceRepositoryWrapper> local_hPCCResourceRepository = null;

	public ArrayOfHPCCResourceRepositoryWrapper() {}

	public ArrayOfHPCCResourceRepositoryWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfHPCCResourceRepository arrayofhpccresourcerepository)
	{
		copy( arrayofhpccresourcerepository );
	}
	public ArrayOfHPCCResourceRepositoryWrapper( List<HPCCResourceRepositoryWrapper> _hPCCResourceRepository )
	{
		this.local_hPCCResourceRepository = _hPCCResourceRepository;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfHPCCResourceRepository raw )
	{
		if (raw == null)
			return;

		if (raw.getHPCCResourceRepository() != null)
		{
			this.local_hPCCResourceRepository = new ArrayList<HPCCResourceRepositoryWrapper>();
			for ( int i = 0; i < raw.getHPCCResourceRepository().length; i++)
			{
				this.local_hPCCResourceRepository.add(new HPCCResourceRepositoryWrapper(raw.getHPCCResourceRepository()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfHPCCResourceRepositoryWrapper [" + "hPCCResourceRepository = " + local_hPCCResourceRepository + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfHPCCResourceRepository getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfHPCCResourceRepository raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ArrayOfHPCCResourceRepository();
		if (this.local_hPCCResourceRepository!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.HPCCResourceRepository[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.HPCCResourceRepository[this.local_hPCCResourceRepository.size()];
			for ( int i = 0; i < this.local_hPCCResourceRepository.size(); i++)
			{
				arr[i] = this.local_hPCCResourceRepository.get(i) .getRaw();
			}
			raw.setHPCCResourceRepository(arr);
		}
		return raw;
	}


	public void setHPCCResourceRepository( List<HPCCResourceRepositoryWrapper> _hPCCResourceRepository )
	{
		this.local_hPCCResourceRepository = _hPCCResourceRepository;
	}
	public List<HPCCResourceRepositoryWrapper> getHPCCResourceRepository( )
	{
		return this.local_hPCCResourceRepository;
	}
}