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
 * Class name: WUStatisticItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.995Z
 */
public class WUStatisticItemWrapper
{
    protected String local_creator;
    protected String local_creatorType;
    protected String local_scope;
    protected String local_scopeType;
    protected String local_description;
    protected String local_timeStamp;
    protected String local_measure;
    protected String local_kind;
    protected String local_value;
    protected long local_rawValue;
    protected long local_count;
    protected long local_max;
    protected String local_wuid;

    public WUStatisticItemWrapper() {}

    public WUStatisticItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem wustatisticitem)
    {
        copy( wustatisticitem );
    }
    public WUStatisticItemWrapper( String _creator, String _creatorType, String _scope, String _scopeType, String _description, String _timeStamp, String _measure, String _kind, String _value, long _rawValue, long _count, long _max, String _wuid )
    {
        this.local_creator = _creator;
        this.local_creatorType = _creatorType;
        this.local_scope = _scope;
        this.local_scopeType = _scopeType;
        this.local_description = _description;
        this.local_timeStamp = _timeStamp;
        this.local_measure = _measure;
        this.local_kind = _kind;
        this.local_value = _value;
        this.local_rawValue = _rawValue;
        this.local_count = _count;
        this.local_max = _max;
        this.local_wuid = _wuid;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem raw )
    {
        if (raw == null)
            return;

        this.local_creator = raw.getCreator();
        this.local_creatorType = raw.getCreatorType();
        this.local_scope = raw.getScope();
        this.local_scopeType = raw.getScopeType();
        this.local_description = raw.getDescription();
        this.local_timeStamp = raw.getTimeStamp();
        this.local_measure = raw.getMeasure();
        this.local_kind = raw.getKind();
        this.local_value = raw.getValue();
        this.local_rawValue = raw.getRawValue();
        this.local_count = raw.getCount();
        this.local_max = raw.getMax();
        this.local_wuid = raw.getWuid();

    }

    @Override
    public String toString()
    {
        return "WUStatisticItemWrapper [" + "creator = " + local_creator + ", " + "creatorType = " + local_creatorType + ", " + "scope = " + local_scope + ", " + "scopeType = " + local_scopeType + ", " + "description = " + local_description + ", " + "timeStamp = " + local_timeStamp + ", " + "measure = " + local_measure + ", " + "kind = " + local_kind + ", " + "value = " + local_value + ", " + "rawValue = " + local_rawValue + ", " + "count = " + local_count + ", " + "max = " + local_max + ", " + "wuid = " + local_wuid + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem();
        raw.setCreator( local_creator);
        raw.setCreatorType( local_creatorType);
        raw.setScope( local_scope);
        raw.setScopeType( local_scopeType);
        raw.setDescription( local_description);
        raw.setTimeStamp( local_timeStamp);
        raw.setMeasure( local_measure);
        raw.setKind( local_kind);
        raw.setValue( local_value);
        raw.setRawValue( local_rawValue);
        raw.setCount( local_count);
        raw.setMax( local_max);
        raw.setWuid( local_wuid);
        return raw;
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
    public void setScope( String _scope )
    {
        this.local_scope = _scope;
    }
    public String getScope( )
    {
        return this.local_scope;
    }
    public void setScopeType( String _scopeType )
    {
        this.local_scopeType = _scopeType;
    }
    public String getScopeType( )
    {
        return this.local_scopeType;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setTimeStamp( String _timeStamp )
    {
        this.local_timeStamp = _timeStamp;
    }
    public String getTimeStamp( )
    {
        return this.local_timeStamp;
    }
    public void setMeasure( String _measure )
    {
        this.local_measure = _measure;
    }
    public String getMeasure( )
    {
        return this.local_measure;
    }
    public void setKind( String _kind )
    {
        this.local_kind = _kind;
    }
    public String getKind( )
    {
        return this.local_kind;
    }
    public void setValue( String _value )
    {
        this.local_value = _value;
    }
    public String getValue( )
    {
        return this.local_value;
    }
    public void setRawValue( long _rawValue )
    {
        this.local_rawValue = _rawValue;
    }
    public long getRawValue( )
    {
        return this.local_rawValue;
    }
    public void setCount( long _count )
    {
        this.local_count = _count;
    }
    public long getCount( )
    {
        return this.local_count;
    }
    public void setMax( long _max )
    {
        this.local_max = _max;
    }
    public long getMax( )
    {
        return this.local_max;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
}