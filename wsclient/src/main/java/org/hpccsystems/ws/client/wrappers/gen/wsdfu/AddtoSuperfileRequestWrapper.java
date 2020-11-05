package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: AddtoSuperfileRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.AddtoSuperfileRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2020-11-04T21:52:26.182Z
 */
public class AddtoSuperfileRequestWrapper
{
	protected String local_superfile;
	protected String local_subfiles;
	protected List<String> local_names = null;
	protected boolean local_existingFile;
	protected String local_backToPage;

	public AddtoSuperfileRequestWrapper() {}

	public AddtoSuperfileRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.AddtoSuperfileRequest addtosuperfilerequest)
	{
		copy( addtosuperfilerequest );
	}
	public AddtoSuperfileRequestWrapper( String _superfile, String _subfiles, List<String> _names, boolean _existingFile, String _backToPage )
	{
		this.local_superfile = _superfile;
		this.local_subfiles = _subfiles;
		this.local_names = _names;
		this.local_existingFile = _existingFile;
		this.local_backToPage = _backToPage;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.AddtoSuperfileRequest raw )
	{
		if (raw == null)
			return;

		this.local_superfile = raw.getSuperfile();
		this.local_subfiles = raw.getSubfiles();
		if (raw.getNames() != null)
		{
			this.local_names = new ArrayList<String>();
			for ( int i = 0; i < raw.getNames().getItem().length; i++)
			{
				this.local_names.add(new String(raw.getNames().getItem()[i]));
			}
		}		this.local_existingFile = raw.getExistingFile();
		this.local_backToPage = raw.getBackToPage();

	}

	@Override
	public String toString()
	{
		return "AddtoSuperfileRequestWrapper [" + "superfile = " + local_superfile + ", " + "subfiles = " + local_subfiles + ", " + "names = " + local_names + ", " + "existingFile = " + local_existingFile + ", " + "backToPage = " + local_backToPage + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.AddtoSuperfileRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.AddtoSuperfileRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_56.AddtoSuperfileRequest();
		raw.setSuperfile( local_superfile);
		raw.setSubfiles( local_subfiles);
		if (this.local_names!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_names.size(); i++)
			{
				arr.addItem(this.local_names.get(i));
			}
			raw.setNames(arr);
		}
		raw.setExistingFile( local_existingFile);
		raw.setBackToPage( local_backToPage);
		return raw;
	}


	public void setSuperfile( String _superfile )
	{
		this.local_superfile = _superfile;
	}
	public String getSuperfile( )
	{
		return this.local_superfile;
	}
	public void setSubfiles( String _subfiles )
	{
		this.local_subfiles = _subfiles;
	}
	public String getSubfiles( )
	{
		return this.local_subfiles;
	}
	public void setNames( List<String> _names )
	{
		this.local_names = _names;
	}
	public List<String> getNames( )
	{
		return this.local_names;
	}
	public void setExistingFile( boolean _existingFile )
	{
		this.local_existingFile = _existingFile;
	}
	public boolean getExistingFile( )
	{
		return this.local_existingFile;
	}
	public void setBackToPage( String _backToPage )
	{
		this.local_backToPage = _backToPage;
	}
	public String getBackToPage( )
	{
		return this.local_backToPage;
	}
}