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
 * Class name: ArrayOfECLGraphExWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraphEx
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.777Z
 */
public class ArrayOfECLGraphExWrapper
{
    protected List<ECLGraphExWrapper> local_eCLGraphEx = null;

    public ArrayOfECLGraphExWrapper() {}

    public ArrayOfECLGraphExWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraphEx arrayofeclgraphex)
    {
        copy( arrayofeclgraphex );
    }
    public ArrayOfECLGraphExWrapper( List<ECLGraphExWrapper> _eCLGraphEx )
    {
        this.local_eCLGraphEx = _eCLGraphEx;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraphEx raw )
    {
        if (raw == null)
            return;

        if (raw.getECLGraphEx() != null)
        {
            this.local_eCLGraphEx = new ArrayList<ECLGraphExWrapper>();
            for ( int i = 0; i < raw.getECLGraphEx().length; i++)
            {
                this.local_eCLGraphEx.add(new ECLGraphExWrapper(raw.getECLGraphEx()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLGraphExWrapper [" + "eCLGraphEx = " + local_eCLGraphEx + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraphEx getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraphEx raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraphEx();
        if (this.local_eCLGraphEx!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx[this.local_eCLGraphEx.size()];
            for ( int i = 0; i < this.local_eCLGraphEx.size(); i++)
            {
                arr[i] = this.local_eCLGraphEx.get(i) .getRaw();
            }
            raw.setECLGraphEx(arr);
        }
        return raw;
    }


    public void setECLGraphEx( List<ECLGraphExWrapper> _eCLGraphEx )
    {
        this.local_eCLGraphEx = _eCLGraphEx;
    }
    public List<ECLGraphExWrapper> getECLGraphEx( )
    {
        return this.local_eCLGraphEx;
    }
}