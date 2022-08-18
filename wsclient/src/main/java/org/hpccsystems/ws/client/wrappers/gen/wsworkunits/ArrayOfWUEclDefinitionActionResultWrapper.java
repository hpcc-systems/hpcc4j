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
 * Class name: ArrayOfWUEclDefinitionActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclDefinitionActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.794Z
 */
public class ArrayOfWUEclDefinitionActionResultWrapper
{
    protected List<WUEclDefinitionActionResultWrapper> local_wUEclDefinitionActionResult = null;

    public ArrayOfWUEclDefinitionActionResultWrapper() {}

    public ArrayOfWUEclDefinitionActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclDefinitionActionResult arrayofwuecldefinitionactionresult)
    {
        copy( arrayofwuecldefinitionactionresult );
    }
    public ArrayOfWUEclDefinitionActionResultWrapper( List<WUEclDefinitionActionResultWrapper> _wUEclDefinitionActionResult )
    {
        this.local_wUEclDefinitionActionResult = _wUEclDefinitionActionResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclDefinitionActionResult raw )
    {
        if (raw == null)
            return;

        if (raw.getWUEclDefinitionActionResult() != null)
        {
            this.local_wUEclDefinitionActionResult = new ArrayList<WUEclDefinitionActionResultWrapper>();
            for ( int i = 0; i < raw.getWUEclDefinitionActionResult().length; i++)
            {
                this.local_wUEclDefinitionActionResult.add(new WUEclDefinitionActionResultWrapper(raw.getWUEclDefinitionActionResult()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfWUEclDefinitionActionResultWrapper [" + "wUEclDefinitionActionResult = " + local_wUEclDefinitionActionResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclDefinitionActionResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclDefinitionActionResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclDefinitionActionResult();
        if (this.local_wUEclDefinitionActionResult!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResult[this.local_wUEclDefinitionActionResult.size()];
            for ( int i = 0; i < this.local_wUEclDefinitionActionResult.size(); i++)
            {
                arr[i] = this.local_wUEclDefinitionActionResult.get(i) .getRaw();
            }
            raw.setWUEclDefinitionActionResult(arr);
        }
        return raw;
    }


    public void setWUEclDefinitionActionResult( List<WUEclDefinitionActionResultWrapper> _wUEclDefinitionActionResult )
    {
        this.local_wUEclDefinitionActionResult = _wUEclDefinitionActionResult;
    }
    public List<WUEclDefinitionActionResultWrapper> getWUEclDefinitionActionResult( )
    {
        return this.local_wUEclDefinitionActionResult;
    }
}