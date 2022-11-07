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
 * Class name: Dependencies_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.801Z
 */
public class Dependencies_type0Wrapper
{
    protected List<WUECLAttributeWrapper> local_eCLAttribute = null;

    public Dependencies_type0Wrapper() {}

    public Dependencies_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 dependencies_type0)
    {
        copy( dependencies_type0 );
    }
    public Dependencies_type0Wrapper( List<WUECLAttributeWrapper> _eCLAttribute )
    {
        this.local_eCLAttribute = _eCLAttribute;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getECLAttribute() != null)
        {
            this.local_eCLAttribute = new ArrayList<WUECLAttributeWrapper>();
            for ( int i = 0; i < raw.getECLAttribute().length; i++)
            {
                this.local_eCLAttribute.add(new WUECLAttributeWrapper(raw.getECLAttribute()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Dependencies_type0Wrapper [" + "eCLAttribute = " + local_eCLAttribute + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Dependencies_type0();
        if (this.local_eCLAttribute!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUECLAttribute[this.local_eCLAttribute.size()];
            for ( int i = 0; i < this.local_eCLAttribute.size(); i++)
            {
                arr[i] = this.local_eCLAttribute.get(i) .getRaw();
            }
            raw.setECLAttribute(arr);
        }
        return raw;
    }


    public void setECLAttribute( List<WUECLAttributeWrapper> _eCLAttribute )
    {
        this.local_eCLAttribute = _eCLAttribute;
    }
    public List<WUECLAttributeWrapper> getECLAttribute( )
    {
        return this.local_eCLAttribute;
    }
}