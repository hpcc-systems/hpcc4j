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
 * Class name: ArrayOfECLWUFileSummaryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWUFileSummary
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class ArrayOfECLWUFileSummaryWrapper
{
    protected List<ECLWUFileSummaryWrapper> local_eCLWUFileSummary = null;

    public ArrayOfECLWUFileSummaryWrapper() {}

    public ArrayOfECLWUFileSummaryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWUFileSummary arrayofeclwufilesummary)
    {
        copy( arrayofeclwufilesummary );
    }
    public ArrayOfECLWUFileSummaryWrapper( List<ECLWUFileSummaryWrapper> _eCLWUFileSummary )
    {
        this.local_eCLWUFileSummary = _eCLWUFileSummary;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWUFileSummary raw )
    {
        if (raw == null)
            return;

        if (raw.getECLWUFileSummary() != null)
        {
            this.local_eCLWUFileSummary = new ArrayList<ECLWUFileSummaryWrapper>();
            for ( int i = 0; i < raw.getECLWUFileSummary().length; i++)
            {
                this.local_eCLWUFileSummary.add(new ECLWUFileSummaryWrapper(raw.getECLWUFileSummary()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLWUFileSummaryWrapper [" + "eCLWUFileSummary = " + local_eCLWUFileSummary + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWUFileSummary getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWUFileSummary raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWUFileSummary();
        if (this.local_eCLWUFileSummary!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUFileSummary[this.local_eCLWUFileSummary.size()];
            for ( int i = 0; i < this.local_eCLWUFileSummary.size(); i++)
            {
                arr[i] = this.local_eCLWUFileSummary.get(i) .getRaw();
            }
            raw.setECLWUFileSummary(arr);
        }
        return raw;
    }


    public void setECLWUFileSummary( List<ECLWUFileSummaryWrapper> _eCLWUFileSummary )
    {
        this.local_eCLWUFileSummary = _eCLWUFileSummary;
    }
    public List<ECLWUFileSummaryWrapper> getECLWUFileSummary( )
    {
        return this.local_eCLWUFileSummary;
    }
}