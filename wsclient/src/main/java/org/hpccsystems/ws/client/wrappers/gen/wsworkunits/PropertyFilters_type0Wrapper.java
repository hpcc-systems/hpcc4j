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
 * Class name: PropertyFilters_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.847Z
 */
public class PropertyFilters_type0Wrapper
{
    protected List<WUPropertyFilterWrapper> local_propertyFilter = null;

    public PropertyFilters_type0Wrapper() {}

    public PropertyFilters_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0 propertyfilters_type0)
    {
        copy( propertyfilters_type0 );
    }
    public PropertyFilters_type0Wrapper( List<WUPropertyFilterWrapper> _propertyFilter )
    {
        this.local_propertyFilter = _propertyFilter;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getPropertyFilter() != null)
        {
            this.local_propertyFilter = new ArrayList<WUPropertyFilterWrapper>();
            for ( int i = 0; i < raw.getPropertyFilter().length; i++)
            {
                this.local_propertyFilter.add(new WUPropertyFilterWrapper(raw.getPropertyFilter()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "PropertyFilters_type0Wrapper [" + "propertyFilter = " + local_propertyFilter + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0();
        if (this.local_propertyFilter!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter[this.local_propertyFilter.size()];
            for ( int i = 0; i < this.local_propertyFilter.size(); i++)
            {
                arr[i] = this.local_propertyFilter.get(i) .getRaw();
            }
            raw.setPropertyFilter(arr);
        }
        return raw;
    }


    public void setPropertyFilter( List<WUPropertyFilterWrapper> _propertyFilter )
    {
        this.local_propertyFilter = _propertyFilter;
    }
    public List<WUPropertyFilterWrapper> getPropertyFilter( )
    {
        return this.local_propertyFilter;
    }
}