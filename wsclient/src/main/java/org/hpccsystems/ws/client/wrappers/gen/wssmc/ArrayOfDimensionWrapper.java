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
 * Class name: ArrayOfDimensionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDimension
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class ArrayOfDimensionWrapper
{
    protected List<DimensionWrapper> local_dimension = null;

    public ArrayOfDimensionWrapper() {}

    public ArrayOfDimensionWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDimension arrayofdimension)
    {
        copy( arrayofdimension );
    }
    public ArrayOfDimensionWrapper( List<DimensionWrapper> _dimension )
    {
        this.local_dimension = _dimension;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDimension raw )
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
        return "ArrayOfDimensionWrapper [" + "dimension = " + local_dimension + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDimension getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDimension raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDimension();
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