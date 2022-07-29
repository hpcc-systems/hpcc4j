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
 * Class name: ArrayOfWUActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.793Z
 */
public class ArrayOfWUActionResultWrapper
{
    protected List<WUActionResultWrapper> local_wUActionResult = null;

    public ArrayOfWUActionResultWrapper() {}

    public ArrayOfWUActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUActionResult arrayofwuactionresult)
    {
        copy( arrayofwuactionresult );
    }
    public ArrayOfWUActionResultWrapper( List<WUActionResultWrapper> _wUActionResult )
    {
        this.local_wUActionResult = _wUActionResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUActionResult raw )
    {
        if (raw == null)
            return;

        if (raw.getWUActionResult() != null)
        {
            this.local_wUActionResult = new ArrayList<WUActionResultWrapper>();
            for ( int i = 0; i < raw.getWUActionResult().length; i++)
            {
                this.local_wUActionResult.add(new WUActionResultWrapper(raw.getWUActionResult()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfWUActionResultWrapper [" + "wUActionResult = " + local_wUActionResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUActionResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUActionResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUActionResult();
        if (this.local_wUActionResult!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult[this.local_wUActionResult.size()];
            for ( int i = 0; i < this.local_wUActionResult.size(); i++)
            {
                arr[i] = this.local_wUActionResult.get(i) .getRaw();
            }
            raw.setWUActionResult(arr);
        }
        return raw;
    }


    public void setWUActionResult( List<WUActionResultWrapper> _wUActionResult )
    {
        this.local_wUActionResult = _wUActionResult;
    }
    public List<WUActionResultWrapper> getWUActionResult( )
    {
        return this.local_wUActionResult;
    }
}