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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUQueryDetailsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetailsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.580Z
 */
public class WUQueryDetailsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_queryId;
    protected String local_querySet;
    protected String local_queryName;
    protected String local_wuid;
    protected String local_dll;
    protected boolean local_suspended;
    protected boolean local_activated;
    protected String local_suspendedBy;
    protected ArrayOfClusterQueryStateWrapper local_clusters;
    protected String local_publishedBy;
    protected String local_comment;
    protected List<String> local_logicalFiles = null;
    protected SuperFiles_type3Wrapper local_superFiles;
    protected boolean local_isLibrary;
    protected String local_priority;
    protected int local_priorityID;
    protected String local_wUSnapShot;
    protected String local_compileTime;
    protected List<String> local_librariesUsed = null;
    protected int local_countGraphs;
    protected int local_resourceURLCount;
    protected WsEclAddresses_type0Wrapper local_wsEclAddresses;
    protected ArrayOfECLGraphWrapper local_wUGraphs;
    protected ArrayOfECLTimerWrapper local_wUTimers;

    public WUQueryDetailsResponseWrapper() {}

    public WUQueryDetailsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetailsResponse wuquerydetailsresponse)
    {
        copy( wuquerydetailsresponse );
    }
    public WUQueryDetailsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _queryId, String _querySet, String _queryName, String _wuid, String _dll, boolean _suspended, boolean _activated, String _suspendedBy, ArrayOfClusterQueryStateWrapper _clusters, String _publishedBy, String _comment, List<String> _logicalFiles, SuperFiles_type3Wrapper _superFiles, boolean _isLibrary, String _priority, int _priorityID, String _wUSnapShot, String _compileTime, List<String> _librariesUsed, int _countGraphs, int _resourceURLCount, WsEclAddresses_type0Wrapper _wsEclAddresses, ArrayOfECLGraphWrapper _wUGraphs, ArrayOfECLTimerWrapper _wUTimers )
    {
        this.local_exceptions = _exceptions;
        this.local_queryId = _queryId;
        this.local_querySet = _querySet;
        this.local_queryName = _queryName;
        this.local_wuid = _wuid;
        this.local_dll = _dll;
        this.local_suspended = _suspended;
        this.local_activated = _activated;
        this.local_suspendedBy = _suspendedBy;
        this.local_clusters = _clusters;
        this.local_publishedBy = _publishedBy;
        this.local_comment = _comment;
        this.local_logicalFiles = _logicalFiles;
        this.local_superFiles = _superFiles;
        this.local_isLibrary = _isLibrary;
        this.local_priority = _priority;
        this.local_priorityID = _priorityID;
        this.local_wUSnapShot = _wUSnapShot;
        this.local_compileTime = _compileTime;
        this.local_librariesUsed = _librariesUsed;
        this.local_countGraphs = _countGraphs;
        this.local_resourceURLCount = _resourceURLCount;
        this.local_wsEclAddresses = _wsEclAddresses;
        this.local_wUGraphs = _wUGraphs;
        this.local_wUTimers = _wUTimers;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetailsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_queryId = raw.getQueryId();
        this.local_querySet = raw.getQuerySet();
        this.local_queryName = raw.getQueryName();
        this.local_wuid = raw.getWuid();
        this.local_dll = raw.getDll();
        this.local_suspended = raw.getSuspended();
        this.local_activated = raw.getActivated();
        this.local_suspendedBy = raw.getSuspendedBy();
        if (raw.getClusters() != null)
            this.local_clusters = new ArrayOfClusterQueryStateWrapper( raw.getClusters());
        this.local_publishedBy = raw.getPublishedBy();
        this.local_comment = raw.getComment();
        if (raw.getLogicalFiles() != null)
        {
            this.local_logicalFiles = new ArrayList<String>();
            for ( int i = 0; i < raw.getLogicalFiles().getItem().length; i++)
            {
                this.local_logicalFiles.add(new String(raw.getLogicalFiles().getItem()[i]));
            }
        }        if (raw.getSuperFiles() != null)
            this.local_superFiles = new SuperFiles_type3Wrapper( raw.getSuperFiles());
        this.local_isLibrary = raw.getIsLibrary();
        this.local_priority = raw.getPriority();
        this.local_priorityID = raw.getPriorityID();
        this.local_wUSnapShot = raw.getWUSnapShot();
        this.local_compileTime = raw.getCompileTime();
        if (raw.getLibrariesUsed() != null)
        {
            this.local_librariesUsed = new ArrayList<String>();
            for ( int i = 0; i < raw.getLibrariesUsed().getItem().length; i++)
            {
                this.local_librariesUsed.add(new String(raw.getLibrariesUsed().getItem()[i]));
            }
        }        this.local_countGraphs = raw.getCountGraphs();
        this.local_resourceURLCount = raw.getResourceURLCount();
        if (raw.getWsEclAddresses() != null)
            this.local_wsEclAddresses = new WsEclAddresses_type0Wrapper( raw.getWsEclAddresses());
        if (raw.getWUGraphs() != null)
            this.local_wUGraphs = new ArrayOfECLGraphWrapper( raw.getWUGraphs());
        if (raw.getWUTimers() != null)
            this.local_wUTimers = new ArrayOfECLTimerWrapper( raw.getWUTimers());

    }

    @Override
    public String toString()
    {
        return "WUQueryDetailsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "queryId = " + local_queryId + ", " + "querySet = " + local_querySet + ", " + "queryName = " + local_queryName + ", " + "wuid = " + local_wuid + ", " + "dll = " + local_dll + ", " + "suspended = " + local_suspended + ", " + "activated = " + local_activated + ", " + "suspendedBy = " + local_suspendedBy + ", " + "clusters = " + local_clusters + ", " + "publishedBy = " + local_publishedBy + ", " + "comment = " + local_comment + ", " + "logicalFiles = " + local_logicalFiles + ", " + "superFiles = " + local_superFiles + ", " + "isLibrary = " + local_isLibrary + ", " + "priority = " + local_priority + ", " + "priorityID = " + local_priorityID + ", " + "wUSnapShot = " + local_wUSnapShot + ", " + "compileTime = " + local_compileTime + ", " + "librariesUsed = " + local_librariesUsed + ", " + "countGraphs = " + local_countGraphs + ", " + "resourceURLCount = " + local_resourceURLCount + ", " + "wsEclAddresses = " + local_wsEclAddresses + ", " + "wUGraphs = " + local_wUGraphs + ", " + "wUTimers = " + local_wUTimers + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetailsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetailsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryDetailsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setQueryId( local_queryId);
        raw.setQuerySet( local_querySet);
        raw.setQueryName( local_queryName);
        raw.setWuid( local_wuid);
        raw.setDll( local_dll);
        raw.setSuspended( local_suspended);
        raw.setActivated( local_activated);
        raw.setSuspendedBy( local_suspendedBy);
        if (local_clusters != null)
            raw.setClusters( local_clusters.getRaw());
        raw.setPublishedBy( local_publishedBy);
        raw.setComment( local_comment);
        if (this.local_logicalFiles!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_logicalFiles.size(); i++)
            {
                arr.addItem(this.local_logicalFiles.get(i));
            }
            raw.setLogicalFiles(arr);
        }
        if (local_superFiles != null)
            raw.setSuperFiles( local_superFiles.getRaw());
        raw.setIsLibrary( local_isLibrary);
        raw.setPriority( local_priority);
        raw.setPriorityID( local_priorityID);
        raw.setWUSnapShot( local_wUSnapShot);
        raw.setCompileTime( local_compileTime);
        if (this.local_librariesUsed!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_librariesUsed.size(); i++)
            {
                arr.addItem(this.local_librariesUsed.get(i));
            }
            raw.setLibrariesUsed(arr);
        }
        raw.setCountGraphs( local_countGraphs);
        raw.setResourceURLCount( local_resourceURLCount);
        if (local_wsEclAddresses != null)
            raw.setWsEclAddresses( local_wsEclAddresses.getRaw());
        if (local_wUGraphs != null)
            raw.setWUGraphs( local_wUGraphs.getRaw());
        if (local_wUTimers != null)
            raw.setWUTimers( local_wUTimers.getRaw());
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
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setQuerySet( String _querySet )
    {
        this.local_querySet = _querySet;
    }
    public String getQuerySet( )
    {
        return this.local_querySet;
    }
    public void setQueryName( String _queryName )
    {
        this.local_queryName = _queryName;
    }
    public String getQueryName( )
    {
        return this.local_queryName;
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
    public void setActivated( boolean _activated )
    {
        this.local_activated = _activated;
    }
    public boolean getActivated( )
    {
        return this.local_activated;
    }
    public void setSuspendedBy( String _suspendedBy )
    {
        this.local_suspendedBy = _suspendedBy;
    }
    public String getSuspendedBy( )
    {
        return this.local_suspendedBy;
    }
    public void setClusters( ArrayOfClusterQueryStateWrapper _clusters )
    {
        this.local_clusters = _clusters;
    }
    public ArrayOfClusterQueryStateWrapper getClusters( )
    {
        return this.local_clusters;
    }
    public void setPublishedBy( String _publishedBy )
    {
        this.local_publishedBy = _publishedBy;
    }
    public String getPublishedBy( )
    {
        return this.local_publishedBy;
    }
    public void setComment( String _comment )
    {
        this.local_comment = _comment;
    }
    public String getComment( )
    {
        return this.local_comment;
    }
    public void setLogicalFiles( List<String> _logicalFiles )
    {
        this.local_logicalFiles = _logicalFiles;
    }
    public List<String> getLogicalFiles( )
    {
        return this.local_logicalFiles;
    }
    public void setSuperFiles( SuperFiles_type3Wrapper _superFiles )
    {
        this.local_superFiles = _superFiles;
    }
    public SuperFiles_type3Wrapper getSuperFiles( )
    {
        return this.local_superFiles;
    }
    public void setIsLibrary( boolean _isLibrary )
    {
        this.local_isLibrary = _isLibrary;
    }
    public boolean getIsLibrary( )
    {
        return this.local_isLibrary;
    }
    public void setPriority( String _priority )
    {
        this.local_priority = _priority;
    }
    public String getPriority( )
    {
        return this.local_priority;
    }
    public void setPriorityID( int _priorityID )
    {
        this.local_priorityID = _priorityID;
    }
    public int getPriorityID( )
    {
        return this.local_priorityID;
    }
    public void setWUSnapShot( String _wUSnapShot )
    {
        this.local_wUSnapShot = _wUSnapShot;
    }
    public String getWUSnapShot( )
    {
        return this.local_wUSnapShot;
    }
    public void setCompileTime( String _compileTime )
    {
        this.local_compileTime = _compileTime;
    }
    public String getCompileTime( )
    {
        return this.local_compileTime;
    }
    public void setLibrariesUsed( List<String> _librariesUsed )
    {
        this.local_librariesUsed = _librariesUsed;
    }
    public List<String> getLibrariesUsed( )
    {
        return this.local_librariesUsed;
    }
    public void setCountGraphs( int _countGraphs )
    {
        this.local_countGraphs = _countGraphs;
    }
    public int getCountGraphs( )
    {
        return this.local_countGraphs;
    }
    public void setResourceURLCount( int _resourceURLCount )
    {
        this.local_resourceURLCount = _resourceURLCount;
    }
    public int getResourceURLCount( )
    {
        return this.local_resourceURLCount;
    }
    public void setWsEclAddresses( WsEclAddresses_type0Wrapper _wsEclAddresses )
    {
        this.local_wsEclAddresses = _wsEclAddresses;
    }
    public WsEclAddresses_type0Wrapper getWsEclAddresses( )
    {
        return this.local_wsEclAddresses;
    }
    public void setWUGraphs( ArrayOfECLGraphWrapper _wUGraphs )
    {
        this.local_wUGraphs = _wUGraphs;
    }
    public ArrayOfECLGraphWrapper getWUGraphs( )
    {
        return this.local_wUGraphs;
    }
    public void setWUTimers( ArrayOfECLTimerWrapper _wUTimers )
    {
        this.local_wUTimers = _wUTimers;
    }
    public ArrayOfECLTimerWrapper getWUTimers( )
    {
        return this.local_wUTimers;
    }
}