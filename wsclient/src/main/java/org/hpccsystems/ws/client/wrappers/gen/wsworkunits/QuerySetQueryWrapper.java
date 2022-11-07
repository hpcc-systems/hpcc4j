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
import org.apache.axis2.databinding.types.NonNegativeInteger;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: QuerySetQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.853Z
 */
public class QuerySetQueryWrapper
{
    protected String local_id;
    protected String local_name;
    protected String local_wuid;
    protected String local_dll;
    protected boolean local_suspended;
    protected ArrayOfClusterQueryStateWrapper local_clusters;
    protected String local_memoryLimit;
    protected NonNegativeInteger local_timeLimit;
    protected NonNegativeInteger local_warnTimeLimit;
    protected String local_priority;
    protected String local_comment;
    protected String local_querySetId;
    protected boolean local_isLibrary;
    protected boolean local_activated;
    protected String local_publishedBy;
    protected String local_snapshot;
    protected int local_priorityID;

    public QuerySetQueryWrapper() {}

    public QuerySetQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery querysetquery)
    {
        copy( querysetquery );
    }
    public QuerySetQueryWrapper( String _id, String _name, String _wuid, String _dll, boolean _suspended, ArrayOfClusterQueryStateWrapper _clusters, String _memoryLimit, NonNegativeInteger _timeLimit, NonNegativeInteger _warnTimeLimit, String _priority, String _comment, String _querySetId, boolean _isLibrary, boolean _activated, String _publishedBy, String _snapshot, int _priorityID )
    {
        this.local_id = _id;
        this.local_name = _name;
        this.local_wuid = _wuid;
        this.local_dll = _dll;
        this.local_suspended = _suspended;
        this.local_clusters = _clusters;
        this.local_memoryLimit = _memoryLimit;
        this.local_timeLimit = _timeLimit;
        this.local_warnTimeLimit = _warnTimeLimit;
        this.local_priority = _priority;
        this.local_comment = _comment;
        this.local_querySetId = _querySetId;
        this.local_isLibrary = _isLibrary;
        this.local_activated = _activated;
        this.local_publishedBy = _publishedBy;
        this.local_snapshot = _snapshot;
        this.local_priorityID = _priorityID;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery raw )
    {
        if (raw == null)
            return;

        this.local_id = raw.getId();
        this.local_name = raw.getName();
        this.local_wuid = raw.getWuid();
        this.local_dll = raw.getDll();
        this.local_suspended = raw.getSuspended();
        if (raw.getClusters() != null)
            this.local_clusters = new ArrayOfClusterQueryStateWrapper( raw.getClusters());
        this.local_memoryLimit = raw.getMemoryLimit();
        this.local_timeLimit = raw.getTimeLimit();
        this.local_warnTimeLimit = raw.getWarnTimeLimit();
        this.local_priority = raw.getPriority();
        this.local_comment = raw.getComment();
        this.local_querySetId = raw.getQuerySetId();
        this.local_isLibrary = raw.getIsLibrary();
        this.local_activated = raw.getActivated();
        this.local_publishedBy = raw.getPublishedBy();
        this.local_snapshot = raw.getSnapshot();
        this.local_priorityID = raw.getPriorityID();

    }

    @Override
    public String toString()
    {
        return "QuerySetQueryWrapper [" + "id = " + local_id + ", " + "name = " + local_name + ", " + "wuid = " + local_wuid + ", " + "dll = " + local_dll + ", " + "suspended = " + local_suspended + ", " + "clusters = " + local_clusters + ", " + "memoryLimit = " + local_memoryLimit + ", " + "timeLimit = " + local_timeLimit + ", " + "warnTimeLimit = " + local_warnTimeLimit + ", " + "priority = " + local_priority + ", " + "comment = " + local_comment + ", " + "querySetId = " + local_querySetId + ", " + "isLibrary = " + local_isLibrary + ", " + "activated = " + local_activated + ", " + "publishedBy = " + local_publishedBy + ", " + "snapshot = " + local_snapshot + ", " + "priorityID = " + local_priorityID + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery();
        raw.setId( local_id);
        raw.setName( local_name);
        raw.setWuid( local_wuid);
        raw.setDll( local_dll);
        raw.setSuspended( local_suspended);
        raw.setMemoryLimit( local_memoryLimit);
        raw.setTimeLimit( local_timeLimit);
        raw.setWarnTimeLimit( local_warnTimeLimit);
        raw.setPriority( local_priority);
        raw.setComment( local_comment);
        raw.setQuerySetId( local_querySetId);
        raw.setIsLibrary( local_isLibrary);
        raw.setActivated( local_activated);
        raw.setPublishedBy( local_publishedBy);
        raw.setSnapshot( local_snapshot);
        raw.setPriorityID( local_priorityID);
        return raw;
    }


    public void setId( String _id )
    {
        this.local_id = _id;
    }
    public String getId( )
    {
        return this.local_id;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setDll( String _dll )
    {
        this.local_dll = _dll;
    }
    public String getDll( )
    {
        return this.local_dll;
    }
    public void setSuspended( boolean _suspended )
    {
        this.local_suspended = _suspended;
    }
    public boolean getSuspended( )
    {
        return this.local_suspended;
    }
    public void setClusters( ArrayOfClusterQueryStateWrapper _clusters )
    {
        this.local_clusters = _clusters;
    }
    public ArrayOfClusterQueryStateWrapper getClusters( )
    {
        return this.local_clusters;
    }
    public void setMemoryLimit( String _memoryLimit )
    {
        this.local_memoryLimit = _memoryLimit;
    }
    public String getMemoryLimit( )
    {
        return this.local_memoryLimit;
    }
    public void setTimeLimit( NonNegativeInteger _timeLimit )
    {
        this.local_timeLimit = _timeLimit;
    }
    public NonNegativeInteger getTimeLimit( )
    {
        return this.local_timeLimit;
    }
    public void setWarnTimeLimit( NonNegativeInteger _warnTimeLimit )
    {
        this.local_warnTimeLimit = _warnTimeLimit;
    }
    public NonNegativeInteger getWarnTimeLimit( )
    {
        return this.local_warnTimeLimit;
    }
    public void setPriority( String _priority )
    {
        this.local_priority = _priority;
    }
    public String getPriority( )
    {
        return this.local_priority;
    }
    public void setComment( String _comment )
    {
        this.local_comment = _comment;
    }
    public String getComment( )
    {
        return this.local_comment;
    }
    public void setQuerySetId( String _querySetId )
    {
        this.local_querySetId = _querySetId;
    }
    public String getQuerySetId( )
    {
        return this.local_querySetId;
    }
    public void setIsLibrary( boolean _isLibrary )
    {
        this.local_isLibrary = _isLibrary;
    }
    public boolean getIsLibrary( )
    {
        return this.local_isLibrary;
    }
    public void setActivated( boolean _activated )
    {
        this.local_activated = _activated;
    }
    public boolean getActivated( )
    {
        return this.local_activated;
    }
    public void setPublishedBy( String _publishedBy )
    {
        this.local_publishedBy = _publishedBy;
    }
    public String getPublishedBy( )
    {
        return this.local_publishedBy;
    }
    public void setSnapshot( String _snapshot )
    {
        this.local_snapshot = _snapshot;
    }
    public String getSnapshot( )
    {
        return this.local_snapshot;
    }
    public void setPriorityID( int _priorityID )
    {
        this.local_priorityID = _priorityID;
    }
    public int getPriorityID( )
    {
        return this.local_priorityID;
    }
}