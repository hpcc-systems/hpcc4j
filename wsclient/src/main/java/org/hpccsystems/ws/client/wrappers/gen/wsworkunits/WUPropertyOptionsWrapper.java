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
 * Class name: WUPropertyOptionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyOptions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.949Z
 */
public class WUPropertyOptionsWrapper
{
    protected boolean local_includeName;
    protected boolean local_includeRawValue;
    protected boolean local_includeFormatted;
    protected boolean local_includeMeasure;
    protected boolean local_includeCreator;
    protected boolean local_includeCreatorType;

    public WUPropertyOptionsWrapper() {}

    public WUPropertyOptionsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyOptions wupropertyoptions)
    {
        copy( wupropertyoptions );
    }
    public WUPropertyOptionsWrapper( boolean _includeName, boolean _includeRawValue, boolean _includeFormatted, boolean _includeMeasure, boolean _includeCreator, boolean _includeCreatorType )
    {
        this.local_includeName = _includeName;
        this.local_includeRawValue = _includeRawValue;
        this.local_includeFormatted = _includeFormatted;
        this.local_includeMeasure = _includeMeasure;
        this.local_includeCreator = _includeCreator;
        this.local_includeCreatorType = _includeCreatorType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyOptions raw )
    {
        if (raw == null)
            return;

        this.local_includeName = raw.getIncludeName();
        this.local_includeRawValue = raw.getIncludeRawValue();
        this.local_includeFormatted = raw.getIncludeFormatted();
        this.local_includeMeasure = raw.getIncludeMeasure();
        this.local_includeCreator = raw.getIncludeCreator();
        this.local_includeCreatorType = raw.getIncludeCreatorType();

    }

    @Override
    public String toString()
    {
        return "WUPropertyOptionsWrapper [" + "includeName = " + local_includeName + ", " + "includeRawValue = " + local_includeRawValue + ", " + "includeFormatted = " + local_includeFormatted + ", " + "includeMeasure = " + local_includeMeasure + ", " + "includeCreator = " + local_includeCreator + ", " + "includeCreatorType = " + local_includeCreatorType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyOptions getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyOptions raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertyOptions();
        raw.setIncludeName( local_includeName);
        raw.setIncludeRawValue( local_includeRawValue);
        raw.setIncludeFormatted( local_includeFormatted);
        raw.setIncludeMeasure( local_includeMeasure);
        raw.setIncludeCreator( local_includeCreator);
        raw.setIncludeCreatorType( local_includeCreatorType);
        return raw;
    }


    public void setIncludeName( boolean _includeName )
    {
        this.local_includeName = _includeName;
    }
    public boolean getIncludeName( )
    {
        return this.local_includeName;
    }
    public void setIncludeRawValue( boolean _includeRawValue )
    {
        this.local_includeRawValue = _includeRawValue;
    }
    public boolean getIncludeRawValue( )
    {
        return this.local_includeRawValue;
    }
    public void setIncludeFormatted( boolean _includeFormatted )
    {
        this.local_includeFormatted = _includeFormatted;
    }
    public boolean getIncludeFormatted( )
    {
        return this.local_includeFormatted;
    }
    public void setIncludeMeasure( boolean _includeMeasure )
    {
        this.local_includeMeasure = _includeMeasure;
    }
    public boolean getIncludeMeasure( )
    {
        return this.local_includeMeasure;
    }
    public void setIncludeCreator( boolean _includeCreator )
    {
        this.local_includeCreator = _includeCreator;
    }
    public boolean getIncludeCreator( )
    {
        return this.local_includeCreator;
    }
    public void setIncludeCreatorType( boolean _includeCreatorType )
    {
        this.local_includeCreatorType = _includeCreatorType;
    }
    public boolean getIncludeCreatorType( )
    {
        return this.local_includeCreatorType;
    }
}