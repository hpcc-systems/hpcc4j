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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: FilesNotFound_type2Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.FilesNotFound_type2
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-04-29T14:39:01.515Z
 */
public class FilesNotFound_type2Wrapper
{
	protected List<String> local_file = null;

	public FilesNotFound_type2Wrapper() {}

	public FilesNotFound_type2Wrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.FilesNotFound_type2 filesnotfound_type2)
	{
		copy( filesnotfound_type2 );
	}
	public FilesNotFound_type2Wrapper( List<String> _file )
	{
		this.local_file = _file;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.FilesNotFound_type2 raw )
	{
		if (raw == null)
			return;

		if (raw.getFile() != null)
		{
			this.local_file = new ArrayList<String>();
			for ( int i = 0; i < raw.getFile().length; i++)
			{
				this.local_file.add(new String(raw.getFile()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "FilesNotFound_type2Wrapper [" + "file = " + local_file + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.FilesNotFound_type2 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.FilesNotFound_type2 raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.FilesNotFound_type2();
		if (this.local_file!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_file.size()];
			for ( int i = 0; i < this.local_file.size(); i++)
			{
				arr[i] = this.local_file.get(i) ;
			}
			raw.setFile(arr);
		}
		return raw;
	}


	public void setFile( List<String> _file )
	{
		this.local_file = _file;
	}
	public List<String> getFile( )
	{
		return this.local_file;
	}
}