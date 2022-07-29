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
 * Class name: Properties_type3Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Properties_type3
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.847Z
 */
public class Properties_type3Wrapper
{
    protected List<WUResponsePropertyWrapper> local_property = null;

    public Properties_type3Wrapper() {}

    public Properties_type3Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Properties_type3 properties_type3)
    {
        copy( properties_type3 );
    }
    public Properties_type3Wrapper( List<WUResponsePropertyWrapper> _property )
    {
        this.local_property = _property;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Properties_type3 raw )
    {
        if (raw == null)
            return;

        if (raw.getProperty() != null)
        {
            this.local_property = new ArrayList<WUResponsePropertyWrapper>();
            for ( int i = 0; i < raw.getProperty().length; i++)
            {
                this.local_property.add(new WUResponsePropertyWrapper(raw.getProperty()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Properties_type3Wrapper [" + "property = " + local_property + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Properties_type3 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Properties_type3 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Properties_type3();
        if (this.local_property!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty[this.local_property.size()];
            for ( int i = 0; i < this.local_property.size(); i++)
            {
                arr[i] = this.local_property.get(i) .getRaw();
            }
            raw.setProperty(arr);
        }
        return raw;
    }


    public void setProperty( List<WUResponsePropertyWrapper> _property )
    {
        this.local_property = _property;
    }
    public List<WUResponsePropertyWrapper> getProperty( )
    {
        return this.local_property;
    }
}