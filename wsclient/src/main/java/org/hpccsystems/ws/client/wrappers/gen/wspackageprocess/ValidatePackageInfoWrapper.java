package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ValidatePackageInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-04-29T14:39:01.524Z
 */
public class ValidatePackageInfoWrapper
{
	protected List<String> local_unmatched = null;

	public ValidatePackageInfoWrapper() {}

	public ValidatePackageInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo validatepackageinfo)
	{
		copy( validatepackageinfo );
	}
	public ValidatePackageInfoWrapper( List<String> _unmatched )
	{
		this.local_unmatched = _unmatched;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo raw )
	{
		if (raw == null)
			return;

		if (raw.getUnmatched() != null)
		{
			this.local_unmatched = new ArrayList<String>();
			for ( int i = 0; i < raw.getUnmatched().getItem().length; i++)
			{
				this.local_unmatched.add(new String(raw.getUnmatched().getItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ValidatePackageInfoWrapper [" + "unmatched = " + local_unmatched + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo();
		if (this.local_unmatched!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_unmatched.size(); i++)
			{
				arr.addItem(this.local_unmatched.get(i));
			}
			raw.setUnmatched(arr);
		}
		return raw;
	}


	public void setUnmatched( List<String> _unmatched )
	{
		this.local_unmatched = _unmatched;
	}
	public List<String> getUnmatched( )
	{
		return this.local_unmatched;
	}
}