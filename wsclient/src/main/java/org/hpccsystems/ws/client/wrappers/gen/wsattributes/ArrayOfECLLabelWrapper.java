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
 * Class name: ArrayOfECLLabelWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLLabel
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfECLLabelWrapper
{
    protected List<ECLLabelWrapper> local_eCLLabel = null;

    public ArrayOfECLLabelWrapper() {}

    public ArrayOfECLLabelWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLLabel arrayofecllabel)
    {
        copy( arrayofecllabel );
    }
    public ArrayOfECLLabelWrapper( List<ECLLabelWrapper> _eCLLabel )
    {
        this.local_eCLLabel = _eCLLabel;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLLabel raw )
    {
        if (raw == null)
            return;

        if (raw.getECLLabel() != null)
        {
            this.local_eCLLabel = new ArrayList<ECLLabelWrapper>();
            for ( int i = 0; i < raw.getECLLabel().length; i++)
            {
                this.local_eCLLabel.add(new ECLLabelWrapper(raw.getECLLabel()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLLabelWrapper [" + "eCLLabel = " + local_eCLLabel + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLLabel getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLLabel raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLLabel();
        if (this.local_eCLLabel!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLLabel[this.local_eCLLabel.size()];
            for ( int i = 0; i < this.local_eCLLabel.size(); i++)
            {
                arr[i] = this.local_eCLLabel.get(i) .getRaw();
            }
            raw.setECLLabel(arr);
        }
        return raw;
    }


    public void setECLLabel( List<ECLLabelWrapper> _eCLLabel )
    {
        this.local_eCLLabel = _eCLLabel;
    }
    public List<ECLLabelWrapper> getECLLabel( )
    {
        return this.local_eCLLabel;
    }
}