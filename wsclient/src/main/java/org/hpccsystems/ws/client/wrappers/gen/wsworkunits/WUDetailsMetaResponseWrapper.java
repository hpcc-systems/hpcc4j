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
 * Class name: WUDetailsMetaResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.525Z
 */
public class WUDetailsMetaResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Properties_type2Wrapper local_properties;
    protected ScopeTypes_type2Wrapper local_scopeTypes;
    protected Measures_type0Wrapper local_measures;
    protected Activities_type0Wrapper local_activities;

    public WUDetailsMetaResponseWrapper() {}

    public WUDetailsMetaResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaResponse wudetailsmetaresponse)
    {
        copy( wudetailsmetaresponse );
    }
    public WUDetailsMetaResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Properties_type2Wrapper _properties, ScopeTypes_type2Wrapper _scopeTypes, Measures_type0Wrapper _measures, Activities_type0Wrapper _activities )
    {
        this.local_exceptions = _exceptions;
        this.local_properties = _properties;
        this.local_scopeTypes = _scopeTypes;
        this.local_measures = _measures;
        this.local_activities = _activities;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getProperties() != null)
            this.local_properties = new Properties_type2Wrapper( raw.getProperties());
        if (raw.getScopeTypes() != null)
            this.local_scopeTypes = new ScopeTypes_type2Wrapper( raw.getScopeTypes());
        if (raw.getMeasures() != null)
            this.local_measures = new Measures_type0Wrapper( raw.getMeasures());
        if (raw.getActivities() != null)
            this.local_activities = new Activities_type0Wrapper( raw.getActivities());

    }

    @Override
    public String toString()
    {
        return "WUDetailsMetaResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "properties = " + local_properties + ", " + "scopeTypes = " + local_scopeTypes + ", " + "measures = " + local_measures + ", " + "activities = " + local_activities + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_properties != null)
            raw.setProperties( local_properties.getRaw());
        if (local_scopeTypes != null)
            raw.setScopeTypes( local_scopeTypes.getRaw());
        if (local_measures != null)
            raw.setMeasures( local_measures.getRaw());
        if (local_activities != null)
            raw.setActivities( local_activities.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setProperties( Properties_type2Wrapper _properties )
    {
        this.local_properties = _properties;
    }
    public Properties_type2Wrapper getProperties( )
    {
        return this.local_properties;
    }
    public void setScopeTypes( ScopeTypes_type2Wrapper _scopeTypes )
    {
        this.local_scopeTypes = _scopeTypes;
    }
    public ScopeTypes_type2Wrapper getScopeTypes( )
    {
        return this.local_scopeTypes;
    }
    public void setMeasures( Measures_type0Wrapper _measures )
    {
        this.local_measures = _measures;
    }
    public Measures_type0Wrapper getMeasures( )
    {
        return this.local_measures;
    }
    public void setActivities( Activities_type0Wrapper _activities )
    {
        this.local_activities = _activities;
    }
    public Activities_type0Wrapper getActivities( )
    {
        return this.local_activities;
    }
}