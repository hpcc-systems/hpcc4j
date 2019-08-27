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
 * Class name: DropZoneFileSearchResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.873Z
 */
public class DropZoneFileSearchResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected ArrayOfPhysicalFileStructWrapper local_files;
protected String local_warning;

	public DropZoneFileSearchResponseWrapper() {}

	public DropZoneFileSearchResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse dropzonefilesearchresponse)
	{
		copy( dropzonefilesearchresponse );
	}
	public DropZoneFileSearchResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfPhysicalFileStructWrapper _files, String _warning )
	{
		this.local_exceptions = _exceptions;
		this.local_files = _files;
		this.local_warning = _warning;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_files = new ArrayOfPhysicalFileStructWrapper( raw.getFiles());
		this.local_warning = raw.getWarning();

	}

	@Override
	public String toString()
	{
		return "DropZoneFileSearchResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "files = " + local_files + ", " + "warning = " + local_warning + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse();
		raw.setWarning( local_warning);
		return raw;
	}


	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}
	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
	public void setFiles( ArrayOfPhysicalFileStructWrapper _files )
	{
		this.local_files = _files;
	}
	public ArrayOfPhysicalFileStructWrapper getFiles( )
	{
		return this.local_files;
	}
	public void setWarning( String _warning )
	{
		this.local_warning = _warning;
	}
	public String getWarning( )
	{
		return this.local_warning;
	}
}