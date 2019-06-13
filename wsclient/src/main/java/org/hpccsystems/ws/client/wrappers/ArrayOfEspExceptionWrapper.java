package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfEspExceptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfEspException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-03T01:15:45.768Z
 */

public class ArrayOfEspExceptionWrapper
{
    protected String source;
    protected List<EspExceptionWrapper> exceptions = new ArrayList<EspExceptionWrapper>();

	public ArrayOfEspExceptionWrapper() {}

	public ArrayOfEspExceptionWrapper(ArrayOfEspExceptionWrapper arrayofespexception)
	{
		copy( arrayofespexception );
	}

	public ArrayOfEspExceptionWrapper( String _source, List<EspExceptionWrapper> _exception )
	{
		this.source = _source;
		this.exceptions = _exception;
	}

	public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfEspException arrayofespexception)
    {
        copy(arrayofespexception);
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfEspException arrayofespexception)
    {
        copy(arrayofespexception);
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException arrayofespexception)
    {
        copy(arrayofespexception);
    }
    
    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.ArrayOfEspException arrayofespexception)
    {
        copy(arrayofespexception);
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    public ArrayOfEspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ArrayOfEspException arrayofespexception)
    {
        if (arrayofespexception != null)
        {
            this.source = arrayofespexception.getSource();
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspException[] exceptionarray = arrayofespexception.getException();
            if (exceptionarray != null)
            {
                this.exceptions = new ArrayList<EspExceptionWrapper>();
                for ( int i = 0; i < exceptionarray.length; i++)
                {
                    this.exceptions.add(new EspExceptionWrapper(exceptionarray[i]));
                }
            }
        }
    }

    private void copy(ArrayOfEspExceptionWrapper raw)
	{
		this.source = raw.getSource();
		List<EspExceptionWrapper> excepts = raw.getExceptions();
		if (excepts != null)
		{
			this.exceptions = new ArrayList<EspExceptionWrapper>();
			for ( int i = 0; i < excepts.size(); i++)
			{
				this.exceptions.add(new EspExceptionWrapper(excepts.get(i)));
			}
		}
	}

	@Override
	public String toString()
	{
	    return "ArrayOfEspExceptionWrapper [" + "source = " + source + ", " + "exception = " + exceptions + "]";
	}

	public void setSource( String _source )
	{
		this.source = _source;
	}

	public String getSource( )
	{
		return this.source;
	}

	public void setExceptions( List<EspExceptionWrapper> _exception )
	{
		this.exceptions = _exception;
	}

	public List<EspExceptionWrapper> getExceptions( )
	{
		return this.exceptions;
	}
}