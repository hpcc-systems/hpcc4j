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
import org.apache.axiom.om.OMElement;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUPropertiesToReturnWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertiesToReturn
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUPropertiesToReturnWrapper
{
    protected boolean local_allStatistics;
    protected boolean local_allAttributes;
    protected boolean local_allHints;
    protected boolean local_allScopes;
    protected boolean local_allProperties;
    protected boolean local_allNotes;
    protected OMElement local_minVersion;
    protected String local_measure;
    protected Properties_type0Wrapper local_properties;
    protected ExtraProperties_type0Wrapper local_extraProperties;

    public WUPropertiesToReturnWrapper() {}

    public WUPropertiesToReturnWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertiesToReturn wupropertiestoreturn)
    {
        copy( wupropertiestoreturn );
    }
    public WUPropertiesToReturnWrapper( boolean _allStatistics, boolean _allAttributes, boolean _allHints, boolean _allScopes, boolean _allProperties, boolean _allNotes, OMElement _minVersion, String _measure, Properties_type0Wrapper _properties, ExtraProperties_type0Wrapper _extraProperties )
    {
        this.local_allStatistics = _allStatistics;
        this.local_allAttributes = _allAttributes;
        this.local_allHints = _allHints;
        this.local_allScopes = _allScopes;
        this.local_allProperties = _allProperties;
        this.local_allNotes = _allNotes;
        this.local_minVersion = _minVersion;
        this.local_measure = _measure;
        this.local_properties = _properties;
        this.local_extraProperties = _extraProperties;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertiesToReturn raw )
    {
        if (raw == null)
            return;

        this.local_allStatistics = raw.getAllStatistics();
        this.local_allAttributes = raw.getAllAttributes();
        this.local_allHints = raw.getAllHints();
        this.local_allScopes = raw.getAllScopes();
        this.local_allProperties = raw.getAllProperties();
        this.local_allNotes = raw.getAllNotes();
        this.local_minVersion = raw.getMinVersion();
        this.local_measure = raw.getMeasure();
        if (raw.getProperties() != null)
            this.local_properties = new Properties_type0Wrapper( raw.getProperties());
        if (raw.getExtraProperties() != null)
            this.local_extraProperties = new ExtraProperties_type0Wrapper( raw.getExtraProperties());

    }

    @Override
    public String toString()
    {
        return "WUPropertiesToReturnWrapper [" + "allStatistics = " + local_allStatistics + ", " + "allAttributes = " + local_allAttributes + ", " + "allHints = " + local_allHints + ", " + "allScopes = " + local_allScopes + ", " + "allProperties = " + local_allProperties + ", " + "allNotes = " + local_allNotes + ", " + "minVersion = " + local_minVersion + ", " + "measure = " + local_measure + ", " + "properties = " + local_properties + ", " + "extraProperties = " + local_extraProperties + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertiesToReturn getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertiesToReturn raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPropertiesToReturn();
        raw.setAllStatistics( local_allStatistics);
        raw.setAllAttributes( local_allAttributes);
        raw.setAllHints( local_allHints);
        raw.setAllScopes( local_allScopes);
        raw.setAllProperties( local_allProperties);
        raw.setAllNotes( local_allNotes);
        raw.setMinVersion( local_minVersion);
        raw.setMeasure( local_measure);
        if (local_properties != null)
            raw.setProperties( local_properties.getRaw());
        if (local_extraProperties != null)
            raw.setExtraProperties( local_extraProperties.getRaw());
        return raw;
    }


    public void setAllStatistics( boolean _allStatistics )
    {
        this.local_allStatistics = _allStatistics;
    }
    public boolean getAllStatistics( )
    {
        return this.local_allStatistics;
    }
    public void setAllAttributes( boolean _allAttributes )
    {
        this.local_allAttributes = _allAttributes;
    }
    public boolean getAllAttributes( )
    {
        return this.local_allAttributes;
    }
    public void setAllHints( boolean _allHints )
    {
        this.local_allHints = _allHints;
    }
    public boolean getAllHints( )
    {
        return this.local_allHints;
    }
    public void setAllScopes( boolean _allScopes )
    {
        this.local_allScopes = _allScopes;
    }
    public boolean getAllScopes( )
    {
        return this.local_allScopes;
    }
    public void setAllProperties( boolean _allProperties )
    {
        this.local_allProperties = _allProperties;
    }
    public boolean getAllProperties( )
    {
        return this.local_allProperties;
    }
    public void setAllNotes( boolean _allNotes )
    {
        this.local_allNotes = _allNotes;
    }
    public boolean getAllNotes( )
    {
        return this.local_allNotes;
    }
    public void setMinVersion( OMElement _minVersion )
    {
        this.local_minVersion = _minVersion;
    }
    public OMElement getMinVersion( )
    {
        return this.local_minVersion;
    }
    public void setMeasure( String _measure )
    {
        this.local_measure = _measure;
    }
    public String getMeasure( )
    {
        return this.local_measure;
    }
    public void setProperties( Properties_type0Wrapper _properties )
    {
        this.local_properties = _properties;
    }
    public Properties_type0Wrapper getProperties( )
    {
        return this.local_properties;
    }
    public void setExtraProperties( ExtraProperties_type0Wrapper _extraProperties )
    {
        this.local_extraProperties = _extraProperties;
    }
    public ExtraProperties_type0Wrapper getExtraProperties( )
    {
        return this.local_extraProperties;
    }
}