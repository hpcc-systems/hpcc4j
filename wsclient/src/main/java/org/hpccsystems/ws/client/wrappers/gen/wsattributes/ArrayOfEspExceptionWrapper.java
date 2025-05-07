package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
 * Class name: ArrayOfEspExceptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfEspException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfEspExceptionWrapper
{
    protected String local_source;
    protected List<EspExceptionWrapper> local_exception = null;

    public ArrayOfEspExceptionWrapper() {}

    public ArrayOfEspExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfEspException arrayofespexception)
    {
        copy( arrayofespexception );
    }
    public ArrayOfEspExceptionWrapper( String _source, List<EspExceptionWrapper> _exception )
    {
        this.local_source = _source;
        this.local_exception = _exception;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfEspException raw )
    {
        if (raw == null)
            return;

        this.local_source = raw.getSource();
        if (raw.getException() != null)
        {
            this.local_exception = new ArrayList<EspExceptionWrapper>();
            for ( int i = 0; i < raw.getException().length; i++)
            {
                this.local_exception.add(new EspExceptionWrapper(raw.getException()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfEspExceptionWrapper [" + "source = " + local_source + ", " + "exception = " + local_exception + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfEspException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfEspException raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfEspException();
        raw.setSource( local_source);
        if (this.local_exception!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException[this.local_exception.size()];
            for ( int i = 0; i < this.local_exception.size(); i++)
            {
                arr[i] = this.local_exception.get(i) .getRaw();
            }
            raw.setException(arr);
        }
        return raw;
    }


    public void setSource( String _source )
    {
        this.local_source = _source;
    }
    public String getSource( )
    {
        return this.local_source;
    }
    public void setException( List<EspExceptionWrapper> _exception )
    {
        this.local_exception = _exception;
    }
    public List<EspExceptionWrapper> getException( )
    {
        return this.local_exception;
    }
}