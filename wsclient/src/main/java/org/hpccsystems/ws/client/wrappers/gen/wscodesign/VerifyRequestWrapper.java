package org.hpccsystems.ws.client.wrappers.gen.wscodesign;



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
 * Class name: VerifyRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscodesign
 * TimeStamp: 2021-03-26T18:27:31.420Z
 */
public class VerifyRequestWrapper
{
	protected String local_text;

	public VerifyRequestWrapper() {}

	public VerifyRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyRequest verifyrequest)
	{
		copy( verifyrequest );
	}
	public VerifyRequestWrapper( String _text )
	{
		this.local_text = _text;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyRequest raw )
	{
		if (raw == null)
			return;

		this.local_text = raw.getText();

	}

	@Override
	public String toString()
	{
		return "VerifyRequestWrapper [" + "text = " + local_text + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyRequest raw = new org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyRequest();
		raw.setText( local_text);
		return raw;
	}


	public void setText( String _text )
	{
		this.local_text = _text;
	}
	public String getText( )
	{
		return this.local_text;
	}
}