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
 * Class name: ExtraProperties_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtraProperties_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.828Z
 */
public class ExtraProperties_type0Wrapper
{
    protected List<WUExtraPropertiesWrapper> local_extra = null;

    public ExtraProperties_type0Wrapper() {}

    public ExtraProperties_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtraProperties_type0 extraproperties_type0)
    {
        copy( extraproperties_type0 );
    }
    public ExtraProperties_type0Wrapper( List<WUExtraPropertiesWrapper> _extra )
    {
        this.local_extra = _extra;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtraProperties_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getExtra() != null)
        {
            this.local_extra = new ArrayList<WUExtraPropertiesWrapper>();
            for ( int i = 0; i < raw.getExtra().length; i++)
            {
                this.local_extra.add(new WUExtraPropertiesWrapper(raw.getExtra()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ExtraProperties_type0Wrapper [" + "extra = " + local_extra + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtraProperties_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtraProperties_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtraProperties_type0();
        if (this.local_extra!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExtraProperties[this.local_extra.size()];
            for ( int i = 0; i < this.local_extra.size(); i++)
            {
                arr[i] = this.local_extra.get(i) .getRaw();
            }
            raw.setExtra(arr);
        }
        return raw;
    }


    public void setExtra( List<WUExtraPropertiesWrapper> _extra )
    {
        this.local_extra = _extra;
    }
    public List<WUExtraPropertiesWrapper> getExtra( )
    {
        return this.local_extra;
    }
}