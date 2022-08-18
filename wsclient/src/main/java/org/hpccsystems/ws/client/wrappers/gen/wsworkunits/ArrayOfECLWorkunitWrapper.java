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
 * Class name: ArrayOfECLWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.782Z
 */
public class ArrayOfECLWorkunitWrapper
{
    protected List<ECLWorkunitWrapper> local_eCLWorkunit = null;

    public ArrayOfECLWorkunitWrapper() {}

    public ArrayOfECLWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunit arrayofeclworkunit)
    {
        copy( arrayofeclworkunit );
    }
    public ArrayOfECLWorkunitWrapper( List<ECLWorkunitWrapper> _eCLWorkunit )
    {
        this.local_eCLWorkunit = _eCLWorkunit;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunit raw )
    {
        if (raw == null)
            return;

        if (raw.getECLWorkunit() != null)
        {
            this.local_eCLWorkunit = new ArrayList<ECLWorkunitWrapper>();
            for ( int i = 0; i < raw.getECLWorkunit().length; i++)
            {
                this.local_eCLWorkunit.add(new ECLWorkunitWrapper(raw.getECLWorkunit()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLWorkunitWrapper [" + "eCLWorkunit = " + local_eCLWorkunit + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunit();
        if (this.local_eCLWorkunit!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit[this.local_eCLWorkunit.size()];
            for ( int i = 0; i < this.local_eCLWorkunit.size(); i++)
            {
                arr[i] = this.local_eCLWorkunit.get(i) .getRaw();
            }
            raw.setECLWorkunit(arr);
        }
        return raw;
    }


    public void setECLWorkunit( List<ECLWorkunitWrapper> _eCLWorkunit )
    {
        this.local_eCLWorkunit = _eCLWorkunit;
    }
    public List<ECLWorkunitWrapper> getECLWorkunit( )
    {
        return this.local_eCLWorkunit;
    }
}