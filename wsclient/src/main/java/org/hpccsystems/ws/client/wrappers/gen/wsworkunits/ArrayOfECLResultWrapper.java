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
 * Class name: ArrayOfECLResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.779Z
 */
public class ArrayOfECLResultWrapper
{
    protected List<ECLResultWrapper> local_eCLResult = null;

    public ArrayOfECLResultWrapper() {}

    public ArrayOfECLResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLResult arrayofeclresult)
    {
        copy( arrayofeclresult );
    }
    public ArrayOfECLResultWrapper( List<ECLResultWrapper> _eCLResult )
    {
        this.local_eCLResult = _eCLResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLResult raw )
    {
        if (raw == null)
            return;

        if (raw.getECLResult() != null)
        {
            this.local_eCLResult = new ArrayList<ECLResultWrapper>();
            for ( int i = 0; i < raw.getECLResult().length; i++)
            {
                this.local_eCLResult.add(new ECLResultWrapper(raw.getECLResult()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLResultWrapper [" + "eCLResult = " + local_eCLResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLResult();
        if (this.local_eCLResult!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult[this.local_eCLResult.size()];
            for ( int i = 0; i < this.local_eCLResult.size(); i++)
            {
                arr[i] = this.local_eCLResult.get(i) .getRaw();
            }
            raw.setECLResult(arr);
        }
        return raw;
    }


    public void setECLResult( List<ECLResultWrapper> _eCLResult )
    {
        this.local_eCLResult = _eCLResult;
    }
    public List<ECLResultWrapper> getECLResult( )
    {
        return this.local_eCLResult;
    }
}