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
import java.util.Calendar;
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ECLWorkunitLWWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.460Z
 */
public class ECLWorkunitLWWrapper
{
    protected String local_wuid;
    protected String local_owner;
    protected String local_jobName;
    protected String local_wuScope;
    protected String local_clusterName;
    protected int local_state;
    protected String local_stateDesc;
    protected int local_action;
    protected String local_actionDesc;
    protected int local_priority;
    protected String local_priorityDesc;
    protected int local_priorityLevel;
    protected boolean local_isProtected;
    protected Calendar local_dateTimeScheduled;
    protected UnsignedInt local_totalClusterTime;
    protected ArrayOfApplicationValueWrapper local_applicationValues;
    protected boolean local_noAccess;

    public ECLWorkunitLWWrapper() {}

    public ECLWorkunitLWWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW eclworkunitlw)
    {
        copy( eclworkunitlw );
    }
    public ECLWorkunitLWWrapper( String _wuid, String _owner, String _jobName, String _wuScope, String _clusterName, int _state, String _stateDesc, int _action, String _actionDesc, int _priority, String _priorityDesc, int _priorityLevel, boolean _isProtected, Calendar _dateTimeScheduled, UnsignedInt _totalClusterTime, ArrayOfApplicationValueWrapper _applicationValues, boolean _noAccess )
    {
        this.local_wuid = _wuid;
        this.local_owner = _owner;
        this.local_jobName = _jobName;
        this.local_wuScope = _wuScope;
        this.local_clusterName = _clusterName;
        this.local_state = _state;
        this.local_stateDesc = _stateDesc;
        this.local_action = _action;
        this.local_actionDesc = _actionDesc;
        this.local_priority = _priority;
        this.local_priorityDesc = _priorityDesc;
        this.local_priorityLevel = _priorityLevel;
        this.local_isProtected = _isProtected;
        this.local_dateTimeScheduled = _dateTimeScheduled;
        this.local_totalClusterTime = _totalClusterTime;
        this.local_applicationValues = _applicationValues;
        this.local_noAccess = _noAccess;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_owner = raw.getOwner();
        this.local_jobName = raw.getJobName();
        this.local_wuScope = raw.getWuScope();
        this.local_clusterName = raw.getClusterName();
        this.local_state = raw.getState();
        this.local_stateDesc = raw.getStateDesc();
        this.local_action = raw.getAction();
        this.local_actionDesc = raw.getActionDesc();
        this.local_priority = raw.getPriority();
        this.local_priorityDesc = raw.getPriorityDesc();
        this.local_priorityLevel = raw.getPriorityLevel();
        this.local_isProtected = raw.getIsProtected();
        this.local_dateTimeScheduled = raw.getDateTimeScheduled();
        this.local_totalClusterTime = raw.getTotalClusterTime();
        if (raw.getApplicationValues() != null)
            this.local_applicationValues = new ArrayOfApplicationValueWrapper( raw.getApplicationValues());
        this.local_noAccess = raw.getNoAccess();

    }

    @Override
    public String toString()
    {
        return "ECLWorkunitLWWrapper [" + "wuid = " + local_wuid + ", " + "owner = " + local_owner + ", " + "jobName = " + local_jobName + ", " + "wuScope = " + local_wuScope + ", " + "clusterName = " + local_clusterName + ", " + "state = " + local_state + ", " + "stateDesc = " + local_stateDesc + ", " + "action = " + local_action + ", " + "actionDesc = " + local_actionDesc + ", " + "priority = " + local_priority + ", " + "priorityDesc = " + local_priorityDesc + ", " + "priorityLevel = " + local_priorityLevel + ", " + "isProtected = " + local_isProtected + ", " + "dateTimeScheduled = " + local_dateTimeScheduled + ", " + "totalClusterTime = " + local_totalClusterTime + ", " + "applicationValues = " + local_applicationValues + ", " + "noAccess = " + local_noAccess + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunitLW();
        raw.setWuid( local_wuid);
        raw.setOwner( local_owner);
        raw.setJobName( local_jobName);
        raw.setWuScope( local_wuScope);
        raw.setClusterName( local_clusterName);
        raw.setState( local_state);
        raw.setStateDesc( local_stateDesc);
        raw.setAction( local_action);
        raw.setActionDesc( local_actionDesc);
        raw.setPriority( local_priority);
        raw.setPriorityDesc( local_priorityDesc);
        raw.setPriorityLevel( local_priorityLevel);
        raw.setIsProtected( local_isProtected);
        raw.setDateTimeScheduled( local_dateTimeScheduled);
        raw.setTotalClusterTime( local_totalClusterTime);
        if (local_applicationValues != null)
            raw.setApplicationValues( local_applicationValues.getRaw());
        raw.setNoAccess( local_noAccess);
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
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setJobName( String _jobName )
    {
        this.local_jobName = _jobName;
    }
    public String getJobName( )
    {
        return this.local_jobName;
    }
    public void setWuScope( String _wuScope )
    {
        this.local_wuScope = _wuScope;
    }
    public String getWuScope( )
    {
        return this.local_wuScope;
    }
    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setState( int _state )
    {
        this.local_state = _state;
    }
    public int getState( )
    {
        return this.local_state;
    }
    public void setStateDesc( String _stateDesc )
    {
        this.local_stateDesc = _stateDesc;
    }
    public String getStateDesc( )
    {
        return this.local_stateDesc;
    }
    public void setAction( int _action )
    {
        this.local_action = _action;
    }
    public int getAction( )
    {
        return this.local_action;
    }
    public void setActionDesc( String _actionDesc )
    {
        this.local_actionDesc = _actionDesc;
    }
    public String getActionDesc( )
    {
        return this.local_actionDesc;
    }
    public void setPriority( int _priority )
    {
        this.local_priority = _priority;
    }
    public int getPriority( )
    {
        return this.local_priority;
    }
    public void setPriorityDesc( String _priorityDesc )
    {
        this.local_priorityDesc = _priorityDesc;
    }
    public String getPriorityDesc( )
    {
        return this.local_priorityDesc;
    }
    public void setPriorityLevel( int _priorityLevel )
    {
        this.local_priorityLevel = _priorityLevel;
    }
    public int getPriorityLevel( )
    {
        return this.local_priorityLevel;
    }
    public void setIsProtected( boolean _isProtected )
    {
        this.local_isProtected = _isProtected;
    }
    public boolean getIsProtected( )
    {
        return this.local_isProtected;
    }
    public void setDateTimeScheduled( Calendar _dateTimeScheduled )
    {
        this.local_dateTimeScheduled = _dateTimeScheduled;
    }
    public Calendar getDateTimeScheduled( )
    {
        return this.local_dateTimeScheduled;
    }
    public void setTotalClusterTime( UnsignedInt _totalClusterTime )
    {
        this.local_totalClusterTime = _totalClusterTime;
    }
    public UnsignedInt getTotalClusterTime( )
    {
        return this.local_totalClusterTime;
    }
    public void setApplicationValues( ArrayOfApplicationValueWrapper _applicationValues )
    {
        this.local_applicationValues = _applicationValues;
    }
    public ArrayOfApplicationValueWrapper getApplicationValues( )
    {
        return this.local_applicationValues;
    }
    public void setNoAccess( boolean _noAccess )
    {
        this.local_noAccess = _noAccess;
    }
    public boolean getNoAccess( )
    {
        return this.local_noAccess;
    }
}