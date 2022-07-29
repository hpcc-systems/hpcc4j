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
 * Class name: WUResponsePropertyWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.983Z
 */
public class WUResponsePropertyWrapper
{
    protected String local_name;
    protected String local_rawValue;
    protected String local_formatted;
    protected String local_measure;
    protected String local_creator;
    protected String local_creatorType;

    public WUResponsePropertyWrapper() {}

    public WUResponsePropertyWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty wuresponseproperty)
    {
        copy( wuresponseproperty );
    }
    public WUResponsePropertyWrapper( String _name, String _rawValue, String _formatted, String _measure, String _creator, String _creatorType )
    {
        this.local_name = _name;
        this.local_rawValue = _rawValue;
        this.local_formatted = _formatted;
        this.local_measure = _measure;
        this.local_creator = _creator;
        this.local_creatorType = _creatorType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_rawValue = raw.getRawValue();
        this.local_formatted = raw.getFormatted();
        this.local_measure = raw.getMeasure();
        this.local_creator = raw.getCreator();
        this.local_creatorType = raw.getCreatorType();

    }

    @Override
    public String toString()
    {
        return "WUResponsePropertyWrapper [" + "name = " + local_name + ", " + "rawValue = " + local_rawValue + ", " + "formatted = " + local_formatted + ", " + "measure = " + local_measure + ", " + "creator = " + local_creator + ", " + "creatorType = " + local_creatorType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseProperty();
        raw.setName( local_name);
        raw.setRawValue( local_rawValue);
        raw.setFormatted( local_formatted);
        raw.setMeasure( local_measure);
        raw.setCreator( local_creator);
        raw.setCreatorType( local_creatorType);
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
    public void setRawValue( String _rawValue )
    {
        this.local_rawValue = _rawValue;
    }
    public String getRawValue( )
    {
        return this.local_rawValue;
    }
    public void setFormatted( String _formatted )
    {
        this.local_formatted = _formatted;
    }
    public String getFormatted( )
    {
        return this.local_formatted;
    }
    public void setMeasure( String _measure )
    {
        this.local_measure = _measure;
    }
    public String getMeasure( )
    {
        return this.local_measure;
    }
    public void setCreator( String _creator )
    {
        this.local_creator = _creator;
    }
    public String getCreator( )
    {
        return this.local_creator;
    }
    public void setCreatorType( String _creatorType )
    {
        this.local_creatorType = _creatorType;
    }
    public String getCreatorType( )
    {
        return this.local_creatorType;
    }
}