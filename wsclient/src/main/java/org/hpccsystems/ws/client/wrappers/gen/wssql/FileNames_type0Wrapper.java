package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: FileNames_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.FileNames_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.586Z
 */
public class FileNames_type0Wrapper
{
protected List<String> local_fileName = new ArrayList<String>();

	public FileNames_type0Wrapper() {}

	public FileNames_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.FileNames_type0 filenames_type0)
	{
		copy( filenames_type0 );
	}
	public FileNames_type0Wrapper( List<String> _fileName )
	{
		this.local_fileName = _fileName;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.FileNames_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getFileName() != null)
		{
			this.local_fileName = new ArrayList<String>();
			for ( int i = 0; i < raw.getFileName().length; i++)
			{
				this.local_fileName.add(new String(raw.getFileName()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "FileNames_type0Wrapper [" + "fileName = " + local_fileName + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.FileNames_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.FileNames_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.FileNames_type0();
		if (this.local_fileName!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_fileName.size()];
			for ( int i = 0; i < this.local_fileName.size(); i++)
			{
				arr[i] = this.local_fileName.get(i) ;
			}		raw.setFileName(arr);
}
		return raw;
	}


	public void setFileName( List<String> _fileName )
	{
		this.local_fileName = _fileName;
	}
	public List<String> getFileName( )
	{
		return this.local_fileName;
	}
}