package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: ArrayOfDFUExceptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2021-10-27T18:52:06.409Z
 */
public class ArrayOfDFUExceptionWrapper
{
    protected List<DFUExceptionWrapper> local_dFUException = null;

    public ArrayOfDFUExceptionWrapper() {}

    public ArrayOfDFUExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUException arrayofdfuexception)
    {
        copy( arrayofdfuexception );
    }
    public ArrayOfDFUExceptionWrapper( List<DFUExceptionWrapper> _dFUException )
    {
        this.local_dFUException = _dFUException;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUException raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUException() != null)
        {
            this.local_dFUException = new ArrayList<DFUExceptionWrapper>();
            for ( int i = 0; i < raw.getDFUException().length; i++)
            {
                this.local_dFUException.add(new DFUExceptionWrapper(raw.getDFUException()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUExceptionWrapper [" + "dFUException = " + local_dFUException + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUException raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfDFUException();
        if (this.local_dFUException!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUException[] arr = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUException[this.local_dFUException.size()];
            for ( int i = 0; i < this.local_dFUException.size(); i++)
            {
                arr[i] = this.local_dFUException.get(i) .getRaw();
            }
            raw.setDFUException(arr);
        }
        return raw;
    }


    public void setDFUException( List<DFUExceptionWrapper> _dFUException )
    {
        this.local_dFUException = _dFUException;
    }
    public List<DFUExceptionWrapper> getDFUException( )
    {
        return this.local_dFUException;
    }
}