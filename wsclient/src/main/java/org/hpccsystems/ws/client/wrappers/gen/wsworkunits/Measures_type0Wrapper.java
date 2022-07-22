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
 * Class name: Measures_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Measures_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.840Z
 */
public class Measures_type0Wrapper
{
    protected List<String> local_measure = null;

    public Measures_type0Wrapper() {}

    public Measures_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Measures_type0 measures_type0)
    {
        copy( measures_type0 );
    }
    public Measures_type0Wrapper( List<String> _measure )
    {
        this.local_measure = _measure;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Measures_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getMeasure() != null)
        {
            this.local_measure = new ArrayList<String>();
            for ( int i = 0; i < raw.getMeasure().length; i++)
            {
                this.local_measure.add(new String(raw.getMeasure()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Measures_type0Wrapper [" + "measure = " + local_measure + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Measures_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Measures_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Measures_type0();
        if (this.local_measure!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_measure.size()];
            for ( int i = 0; i < this.local_measure.size(); i++)
            {
                arr[i] = this.local_measure.get(i) ;
            }
            raw.setMeasure(arr);
        }
        return raw;
    }


    public void setMeasure( List<String> _measure )
    {
        this.local_measure = _measure;
    }
    public List<String> getMeasure( )
    {
        return this.local_measure;
    }
}