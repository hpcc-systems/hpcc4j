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
 * Class name: EclFields_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFields_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.545Z
 */
public class EclFields_type0Wrapper
{
protected List<EclFieldDeclarationWrapper> local_eclField = new ArrayList<EclFieldDeclarationWrapper>();

	public EclFields_type0Wrapper() {}

	public EclFields_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFields_type0 eclfields_type0)
	{
		copy( eclfields_type0 );
	}
	public EclFields_type0Wrapper( List<EclFieldDeclarationWrapper> _eclField )
	{
		this.local_eclField = _eclField;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFields_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getEclField() != null)
		{
			this.local_eclField = new ArrayList<EclFieldDeclarationWrapper>();
			for ( int i = 0; i < raw.getEclField().length; i++)
			{
				this.local_eclField.add(new EclFieldDeclarationWrapper(raw.getEclField()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "EclFields_type0Wrapper [" + "eclField = " + local_eclField + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFields_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFields_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFields_type0();
		if (this.local_eclField!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFieldDeclaration[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EclFieldDeclaration[this.local_eclField.size()];
			for ( int i = 0; i < this.local_eclField.size(); i++)
			{
				arr[i] = this.local_eclField.get(i) .getRaw();
			}		raw.setEclField(arr);
}
		return raw;
	}


	public void setEclField( List<EclFieldDeclarationWrapper> _eclField )
	{
		this.local_eclField = _eclField;
	}
	public List<EclFieldDeclarationWrapper> getEclField( )
	{
		return this.local_eclField;
	}
}