package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: ArrayOfECLExceptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.775Z
 */
public class ArrayOfECLExceptionWrapper
{
    protected List<ECLExceptionWrapper> local_eCLException = null;

    public ArrayOfECLExceptionWrapper() {}

    public ArrayOfECLExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException arrayofeclexception)
    {
        copy( arrayofeclexception );
    }
    public ArrayOfECLExceptionWrapper( List<ECLExceptionWrapper> _eCLException )
    {
        this.local_eCLException = _eCLException;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException raw )
    {
        if (raw == null)
            return;

        if (raw.getECLException() != null)
        {
            this.local_eCLException = new ArrayList<ECLExceptionWrapper>();
            for ( int i = 0; i < raw.getECLException().length; i++)
            {
                this.local_eCLException.add(new ECLExceptionWrapper(raw.getECLException()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLExceptionWrapper [" + "eCLException = " + local_eCLException + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLException();
        if (this.local_eCLException!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException[this.local_eCLException.size()];
            for ( int i = 0; i < this.local_eCLException.size(); i++)
            {
                arr[i] = this.local_eCLException.get(i) .getRaw();
            }
            raw.setECLException(arr);
        }
        return raw;
    }


    public void setECLException( List<ECLExceptionWrapper> _eCLException )
    {
        this.local_eCLException = _eCLException;
    }
    public List<ECLExceptionWrapper> getECLException( )
    {
        return this.local_eCLException;
    }
}