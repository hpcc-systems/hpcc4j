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
 * Class name: WUGetNumFileToCopyWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopy
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.919Z
 */
public class WUGetNumFileToCopyWrapper
{
    protected String local_clusterName;
    protected String local_targetName;
    protected long local_pageSize;
    protected long local_pageStartFrom;
    protected String local_sortby;
    protected boolean local_descending;
    protected long local_cacheHint;

    public WUGetNumFileToCopyWrapper() {}

    public WUGetNumFileToCopyWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopy wugetnumfiletocopy)
    {
        copy( wugetnumfiletocopy );
    }
    public WUGetNumFileToCopyWrapper( String _clusterName, String _targetName, long _pageSize, long _pageStartFrom, String _sortby, boolean _descending, long _cacheHint )
    {
        this.local_clusterName = _clusterName;
        this.local_targetName = _targetName;
        this.local_pageSize = _pageSize;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_cacheHint = _cacheHint;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopy raw )
    {
        if (raw == null)
            return;

        this.local_clusterName = raw.getClusterName();
        this.local_targetName = raw.getTargetName();
        this.local_pageSize = raw.getPageSize();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_cacheHint = raw.getCacheHint();

    }

    @Override
    public String toString()
    {
        return "WUGetNumFileToCopyWrapper [" + "clusterName = " + local_clusterName + ", " + "targetName = " + local_targetName + ", " + "pageSize = " + local_pageSize + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "cacheHint = " + local_cacheHint + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopy getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopy raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopy();
        raw.setClusterName( local_clusterName);
        raw.setTargetName( local_targetName);
        raw.setPageSize( local_pageSize);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setCacheHint( local_cacheHint);
        return raw;
    }


    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setTargetName( String _targetName )
    {
        this.local_targetName = _targetName;
    }
    public String getTargetName( )
    {
        return this.local_targetName;
    }
    public void setPageSize( long _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public long getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setPageStartFrom( long _pageStartFrom )
    {
        this.local_pageStartFrom = _pageStartFrom;
    }
    public long getPageStartFrom( )
    {
        return this.local_pageStartFrom;
    }
    public void setSortby( String _sortby )
    {
        this.local_sortby = _sortby;
    }
    public String getSortby( )
    {
        return this.local_sortby;
    }
    public void setDescending( boolean _descending )
    {
        this.local_descending = _descending;
    }
    public boolean getDescending( )
    {
        return this.local_descending;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
}