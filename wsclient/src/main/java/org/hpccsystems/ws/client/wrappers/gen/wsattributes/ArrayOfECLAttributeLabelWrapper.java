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
 * Class name: ArrayOfECLAttributeLabelWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttributeLabel
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfECLAttributeLabelWrapper
{
    protected List<ECLAttributeLabelWrapper> local_eCLAttributeLabel = null;

    public ArrayOfECLAttributeLabelWrapper() {}

    public ArrayOfECLAttributeLabelWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttributeLabel arrayofeclattributelabel)
    {
        copy( arrayofeclattributelabel );
    }
    public ArrayOfECLAttributeLabelWrapper( List<ECLAttributeLabelWrapper> _eCLAttributeLabel )
    {
        this.local_eCLAttributeLabel = _eCLAttributeLabel;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttributeLabel raw )
    {
        if (raw == null)
            return;

        if (raw.getECLAttributeLabel() != null)
        {
            this.local_eCLAttributeLabel = new ArrayList<ECLAttributeLabelWrapper>();
            for ( int i = 0; i < raw.getECLAttributeLabel().length; i++)
            {
                this.local_eCLAttributeLabel.add(new ECLAttributeLabelWrapper(raw.getECLAttributeLabel()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLAttributeLabelWrapper [" + "eCLAttributeLabel = " + local_eCLAttributeLabel + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttributeLabel getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttributeLabel raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLAttributeLabel();
        if (this.local_eCLAttributeLabel!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel[this.local_eCLAttributeLabel.size()];
            for ( int i = 0; i < this.local_eCLAttributeLabel.size(); i++)
            {
                arr[i] = this.local_eCLAttributeLabel.get(i) .getRaw();
            }
            raw.setECLAttributeLabel(arr);
        }
        return raw;
    }


    public void setECLAttributeLabel( List<ECLAttributeLabelWrapper> _eCLAttributeLabel )
    {
        this.local_eCLAttributeLabel = _eCLAttributeLabel;
    }
    public List<ECLAttributeLabelWrapper> getECLAttributeLabel( )
    {
        return this.local_eCLAttributeLabel;
    }
}