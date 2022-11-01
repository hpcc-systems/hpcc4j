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
 * Class name: WUResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.600Z
 */
public class WUResultWrapper
{
    protected String local_wuid;
    protected int local_sequence;
    protected String local_resultName;
    protected String local_logicalName;
    protected String local_cluster;
    protected boolean local_suppressXmlSchema;
    protected boolean local_bypassCachedResult;
    protected ArrayOfNamedValueWrapper local_filterBy;
    protected long local_start;
    protected int local_count;

    public WUResultWrapper() {}

    public WUResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResult wuresult)
    {
        copy( wuresult );
    }
    public WUResultWrapper( String _wuid, int _sequence, String _resultName, String _logicalName, String _cluster, boolean _suppressXmlSchema, boolean _bypassCachedResult, ArrayOfNamedValueWrapper _filterBy, long _start, int _count )
    {
        this.local_wuid = _wuid;
        this.local_sequence = _sequence;
        this.local_resultName = _resultName;
        this.local_logicalName = _logicalName;
        this.local_cluster = _cluster;
        this.local_suppressXmlSchema = _suppressXmlSchema;
        this.local_bypassCachedResult = _bypassCachedResult;
        this.local_filterBy = _filterBy;
        this.local_start = _start;
        this.local_count = _count;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResult raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_sequence = raw.getSequence();
        this.local_resultName = raw.getResultName();
        this.local_logicalName = raw.getLogicalName();
        this.local_cluster = raw.getCluster();
        this.local_suppressXmlSchema = raw.getSuppressXmlSchema();
        this.local_bypassCachedResult = raw.getBypassCachedResult();
        if (raw.getFilterBy() != null)
            this.local_filterBy = new ArrayOfNamedValueWrapper( raw.getFilterBy());
        this.local_start = raw.getStart();
        this.local_count = raw.getCount();

    }

    @Override
    public String toString()
    {
        return "WUResultWrapper [" + "wuid = " + local_wuid + ", " + "sequence = " + local_sequence + ", " + "resultName = " + local_resultName + ", " + "logicalName = " + local_logicalName + ", " + "cluster = " + local_cluster + ", " + "suppressXmlSchema = " + local_suppressXmlSchema + ", " + "bypassCachedResult = " + local_bypassCachedResult + ", " + "filterBy = " + local_filterBy + ", " + "start = " + local_start + ", " + "count = " + local_count + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResult();
        raw.setWuid( local_wuid);
        raw.setSequence( local_sequence);
        raw.setResultName( local_resultName);
        raw.setLogicalName( local_logicalName);
        raw.setCluster( local_cluster);
        raw.setSuppressXmlSchema( local_suppressXmlSchema);
        raw.setBypassCachedResult( local_bypassCachedResult);
        if (local_filterBy != null)
            raw.setFilterBy( local_filterBy.getRaw());
        raw.setStart( local_start);
        raw.setCount( local_count);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setSequence( int _sequence )
    {
        this.local_sequence = _sequence;
    }
    public int getSequence( )
    {
        return this.local_sequence;
    }
    public void setResultName( String _resultName )
    {
        this.local_resultName = _resultName;
    }
    public String getResultName( )
    {
        return this.local_resultName;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setSuppressXmlSchema( boolean _suppressXmlSchema )
    {
        this.local_suppressXmlSchema = _suppressXmlSchema;
    }
    public boolean getSuppressXmlSchema( )
    {
        return this.local_suppressXmlSchema;
    }
    public void setBypassCachedResult( boolean _bypassCachedResult )
    {
        this.local_bypassCachedResult = _bypassCachedResult;
    }
    public boolean getBypassCachedResult( )
    {
        return this.local_bypassCachedResult;
    }
    public void setFilterBy( ArrayOfNamedValueWrapper _filterBy )
    {
        this.local_filterBy = _filterBy;
    }
    public ArrayOfNamedValueWrapper getFilterBy( )
    {
        return this.local_filterBy;
    }
    public void setStart( long _start )
    {
        this.local_start = _start;
    }
    public long getStart( )
    {
        return this.local_start;
    }
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
}