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
 * Class name: WUResultBinWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBin
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.986Z
 */
public class WUResultBinWrapper
{
    protected String local_logicalName;
    protected String local_wuid;
    protected String local_resultName;
    protected int local_sequence;
    protected String local_format;
    protected String local_cluster;
    protected ArrayOfNamedValueWrapper local_filterBy;
    protected long local_start;
    protected int local_count;

    public WUResultBinWrapper() {}

    public WUResultBinWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBin wuresultbin)
    {
        copy( wuresultbin );
    }
    public WUResultBinWrapper( String _logicalName, String _wuid, String _resultName, int _sequence, String _format, String _cluster, ArrayOfNamedValueWrapper _filterBy, long _start, int _count )
    {
        this.local_logicalName = _logicalName;
        this.local_wuid = _wuid;
        this.local_resultName = _resultName;
        this.local_sequence = _sequence;
        this.local_format = _format;
        this.local_cluster = _cluster;
        this.local_filterBy = _filterBy;
        this.local_start = _start;
        this.local_count = _count;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBin raw )
    {
        if (raw == null)
            return;

        this.local_logicalName = raw.getLogicalName();
        this.local_wuid = raw.getWuid();
        this.local_resultName = raw.getResultName();
        this.local_sequence = raw.getSequence();
        this.local_format = raw.getFormat();
        this.local_cluster = raw.getCluster();
        if (raw.getFilterBy() != null)
            this.local_filterBy = new ArrayOfNamedValueWrapper( raw.getFilterBy());
        this.local_start = raw.getStart();
        this.local_count = raw.getCount();

    }

    @Override
    public String toString()
    {
        return "WUResultBinWrapper [" + "logicalName = " + local_logicalName + ", " + "wuid = " + local_wuid + ", " + "resultName = " + local_resultName + ", " + "sequence = " + local_sequence + ", " + "format = " + local_format + ", " + "cluster = " + local_cluster + ", " + "filterBy = " + local_filterBy + ", " + "start = " + local_start + ", " + "count = " + local_count + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBin getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBin raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBin();
        raw.setLogicalName( local_logicalName);
        raw.setWuid( local_wuid);
        raw.setResultName( local_resultName);
        raw.setSequence( local_sequence);
        raw.setFormat( local_format);
        raw.setCluster( local_cluster);
        raw.setStart( local_start);
        raw.setCount( local_count);
        return raw;
    }


    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setResultName( String _resultName )
    {
        this.local_resultName = _resultName;
    }
    public String getResultName( )
    {
        return this.local_resultName;
    }
    public void setSequence( int _sequence )
    {
        this.local_sequence = _sequence;
    }
    public int getSequence( )
    {
        return this.local_sequence;
    }
    public void setFormat( String _format )
    {
        this.local_format = _format;
    }
    public String getFormat( )
    {
        return this.local_format;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
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