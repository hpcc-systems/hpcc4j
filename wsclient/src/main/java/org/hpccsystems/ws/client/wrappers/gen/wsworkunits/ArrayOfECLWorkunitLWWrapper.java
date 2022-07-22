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
 * Class name: ArrayOfECLWorkunitLWWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunitLW
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.783Z
 */
public class ArrayOfECLWorkunitLWWrapper
{
    protected List<ECLWorkunitLWWrapper> local_eCLWorkunitLW = null;

    public ArrayOfECLWorkunitLWWrapper() {}

    public ArrayOfECLWorkunitLWWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunitLW arrayofeclworkunitlw)
    {
        copy( arrayofeclworkunitlw );
    }
    public ArrayOfECLWorkunitLWWrapper( List<ECLWorkunitLWWrapper> _eCLWorkunitLW )
    {
        this.local_eCLWorkunitLW = _eCLWorkunitLW;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunitLW raw )
    {
        if (raw == null)
            return;

        if (raw.getECLWorkunitLW() != null)
        {
            this.local_eCLWorkunitLW = new ArrayList<ECLWorkunitLWWrapper>();
            for ( int i = 0; i < raw.getECLWorkunitLW().length; i++)
            {
                this.local_eCLWorkunitLW.add(new ECLWorkunitLWWrapper(raw.getECLWorkunitLW()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLWorkunitLWWrapper [" + "eCLWorkunitLW = " + local_eCLWorkunitLW + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunitLW getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunitLW raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunitLW();
        if (this.local_eCLWorkunitLW!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW[this.local_eCLWorkunitLW.size()];
            for ( int i = 0; i < this.local_eCLWorkunitLW.size(); i++)
            {
                arr[i] = this.local_eCLWorkunitLW.get(i) .getRaw();
            }
            raw.setECLWorkunitLW(arr);
        }
        return raw;
    }


    public void setECLWorkunitLW( List<ECLWorkunitLWWrapper> _eCLWorkunitLW )
    {
        this.local_eCLWorkunitLW = _eCLWorkunitLW;
    }
    public List<ECLWorkunitLWWrapper> getECLWorkunitLW( )
    {
        return this.local_eCLWorkunitLW;
    }
}