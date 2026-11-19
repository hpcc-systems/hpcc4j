package org.hpccsystems.ws.client.wrappers.gen.wssmc;

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
 * Class name: Dimensions_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimensions_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class Dimensions_type0Wrapper
{
    protected List<DimensionWrapper> local_dimension = null;

    public Dimensions_type0Wrapper() {}

    public Dimensions_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimensions_type0 dimensions_type0)
    {
        copy( dimensions_type0 );
    }
    public Dimensions_type0Wrapper( List<DimensionWrapper> _dimension )
    {
        this.local_dimension = _dimension;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimensions_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getDimension() != null)
        {
            this.local_dimension = new ArrayList<DimensionWrapper>();
            for ( int i = 0; i < raw.getDimension().length; i++)
            {
                this.local_dimension.add(new DimensionWrapper(raw.getDimension()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Dimensions_type0Wrapper [" + "dimension = " + local_dimension + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimensions_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimensions_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimensions_type0();
        if (this.local_dimension!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimension[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Dimension[this.local_dimension.size()];
            for ( int i = 0; i < this.local_dimension.size(); i++)
            {
                arr[i] = this.local_dimension.get(i) .getRaw();
            }
            raw.setDimension(arr);
        }
        return raw;
    }


    public void setDimension( List<DimensionWrapper> _dimension )
    {
        this.local_dimension = _dimension;
    }
    public List<DimensionWrapper> getDimension( )
    {
        return this.local_dimension;
    }
}