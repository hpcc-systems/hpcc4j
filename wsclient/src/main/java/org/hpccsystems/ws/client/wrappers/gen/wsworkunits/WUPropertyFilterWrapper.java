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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUPropertyFilterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.948Z
 */
public class WUPropertyFilterWrapper
{
    protected String local_name;
    protected String local_exactValue;
    protected String local_minValue;
    protected String local_maxValue;

    public WUPropertyFilterWrapper() {}

    public WUPropertyFilterWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter wupropertyfilter)
    {
        copy( wupropertyfilter );
    }
    public WUPropertyFilterWrapper( String _name, String _exactValue, String _minValue, String _maxValue )
    {
        this.local_name = _name;
        this.local_exactValue = _exactValue;
        this.local_minValue = _minValue;
        this.local_maxValue = _maxValue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_exactValue = raw.getExactValue();
        this.local_minValue = raw.getMinValue();
        this.local_maxValue = raw.getMaxValue();

    }

    @Override
    public String toString()
    {
        return "WUPropertyFilterWrapper [" + "name = " + local_name + ", " + "exactValue = " + local_exactValue + ", " + "minValue = " + local_minValue + ", " + "maxValue = " + local_maxValue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyFilter();
        raw.setName( local_name);
        raw.setExactValue( local_exactValue);
        raw.setMinValue( local_minValue);
        raw.setMaxValue( local_maxValue);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setExactValue( String _exactValue )
    {
        this.local_exactValue = _exactValue;
    }
    public String getExactValue( )
    {
        return this.local_exactValue;
    }
    public void setMinValue( String _minValue )
    {
        this.local_minValue = _minValue;
    }
    public String getMinValue( )
    {
        return this.local_minValue;
    }
    public void setMaxValue( String _maxValue )
    {
        this.local_maxValue = _maxValue;
    }
    public String getMaxValue( )
    {
        return this.local_maxValue;
    }
}