package org.hpccsystems.ws.client.wrappers.gen.filespray;



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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: RenameWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Rename
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.922Z
 */
public class RenameWrapper
{
protected String local_srcname;
protected String local_dstname;
protected boolean local_overwrite;
protected String local_dFUServerQueue;

	public RenameWrapper() {}

	public RenameWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Rename rename)
	{
		copy( rename );
	}
	public RenameWrapper( String _srcname, String _dstname, boolean _overwrite, String _dFUServerQueue )
	{
		this.local_srcname = _srcname;
		this.local_dstname = _dstname;
		this.local_overwrite = _overwrite;
		this.local_dFUServerQueue = _dFUServerQueue;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Rename raw )
	{
		if (raw == null)
			return;

		this.local_srcname = raw.getSrcname();
		this.local_dstname = raw.getDstname();
		this.local_overwrite = raw.getOverwrite();
		this.local_dFUServerQueue = raw.getDFUServerQueue();

	}

	@Override
	public String toString()
	{
		return "RenameWrapper [" + "srcname = " + local_srcname + ", " + "dstname = " + local_dstname + ", " + "overwrite = " + local_overwrite + ", " + "dFUServerQueue = " + local_dFUServerQueue + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Rename getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Rename raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Rename();
		raw.setSrcname( local_srcname);
		raw.setDstname( local_dstname);
		raw.setOverwrite( local_overwrite);
		raw.setDFUServerQueue( local_dFUServerQueue);
		return raw;
	}


	public void setSrcname( String _srcname )
	{
		this.local_srcname = _srcname;
	}
	public String getSrcname( )
	{
		return this.local_srcname;
	}
	public void setDstname( String _dstname )
	{
		this.local_dstname = _dstname;
	}
	public String getDstname( )
	{
		return this.local_dstname;
	}
	public void setOverwrite( boolean _overwrite )
	{
		this.local_overwrite = _overwrite;
	}
	public boolean getOverwrite( )
	{
		return this.local_overwrite;
	}
	public void setDFUServerQueue( String _dFUServerQueue )
	{
		this.local_dFUServerQueue = _dFUServerQueue;
	}
	public String getDFUServerQueue( )
	{
		return this.local_dFUServerQueue;
	}
}