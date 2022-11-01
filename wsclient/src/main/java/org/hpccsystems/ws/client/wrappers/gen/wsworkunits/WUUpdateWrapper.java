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
 * Class name: WUUpdateWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdate
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.613Z
 */
public class WUUpdateWrapper
{
    protected String local_wuid;
    protected int local_state;
    protected int local_stateOrig;
    protected String local_jobname;
    protected String local_jobnameOrig;
    protected String local_queryText;
    protected int local_action;
    protected String local_description;
    protected String local_descriptionOrig;
    protected boolean local_addDrilldownFields;
    protected int local_resultLimit;
    protected boolean local_protected;
    protected boolean local_protectedOrig;
    protected int local_priorityClass;
    protected int local_priorityLevel;
    protected String local_scope;
    protected String local_scopeOrig;
    protected String local_clusterSelection;
    protected String local_clusterOrig;
    protected String local_xmlParams;
    protected String local_thorSlaveIP;
    protected String local_queryMainDefinition;
    protected ArrayOfDebugValueWrapper local_debugValues;
    protected ArrayOfApplicationValueWrapper local_applicationValues;

    public WUUpdateWrapper() {}

    public WUUpdateWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdate wuupdate)
    {
        copy( wuupdate );
    }
    public WUUpdateWrapper( String _wuid, int _state, int _stateOrig, String _jobname, String _jobnameOrig, String _queryText, int _action, String _description, String _descriptionOrig, boolean _addDrilldownFields, int _resultLimit, boolean _protected, boolean _protectedOrig, int _priorityClass, int _priorityLevel, String _scope, String _scopeOrig, String _clusterSelection, String _clusterOrig, String _xmlParams, String _thorSlaveIP, String _queryMainDefinition, ArrayOfDebugValueWrapper _debugValues, ArrayOfApplicationValueWrapper _applicationValues )
    {
        this.local_wuid = _wuid;
        this.local_state = _state;
        this.local_stateOrig = _stateOrig;
        this.local_jobname = _jobname;
        this.local_jobnameOrig = _jobnameOrig;
        this.local_queryText = _queryText;
        this.local_action = _action;
        this.local_description = _description;
        this.local_descriptionOrig = _descriptionOrig;
        this.local_addDrilldownFields = _addDrilldownFields;
        this.local_resultLimit = _resultLimit;
        this.local_protected = _protected;
        this.local_protectedOrig = _protectedOrig;
        this.local_priorityClass = _priorityClass;
        this.local_priorityLevel = _priorityLevel;
        this.local_scope = _scope;
        this.local_scopeOrig = _scopeOrig;
        this.local_clusterSelection = _clusterSelection;
        this.local_clusterOrig = _clusterOrig;
        this.local_xmlParams = _xmlParams;
        this.local_thorSlaveIP = _thorSlaveIP;
        this.local_queryMainDefinition = _queryMainDefinition;
        this.local_debugValues = _debugValues;
        this.local_applicationValues = _applicationValues;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdate raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_state = raw.getState();
        this.local_stateOrig = raw.getStateOrig();
        this.local_jobname = raw.getJobname();
        this.local_jobnameOrig = raw.getJobnameOrig();
        this.local_queryText = raw.getQueryText();
        this.local_action = raw.getAction();
        this.local_description = raw.getDescription();
        this.local_descriptionOrig = raw.getDescriptionOrig();
        this.local_addDrilldownFields = raw.getAddDrilldownFields();
        this.local_resultLimit = raw.getResultLimit();
        this.local_protected = raw.getProtected();
        this.local_protectedOrig = raw.getProtectedOrig();
        this.local_priorityClass = raw.getPriorityClass();
        this.local_priorityLevel = raw.getPriorityLevel();
        this.local_scope = raw.getScope();
        this.local_scopeOrig = raw.getScopeOrig();
        this.local_clusterSelection = raw.getClusterSelection();
        this.local_clusterOrig = raw.getClusterOrig();
        this.local_xmlParams = raw.getXmlParams();
        this.local_thorSlaveIP = raw.getThorSlaveIP();
        this.local_queryMainDefinition = raw.getQueryMainDefinition();
        if (raw.getDebugValues() != null)
            this.local_debugValues = new ArrayOfDebugValueWrapper( raw.getDebugValues());
        if (raw.getApplicationValues() != null)
            this.local_applicationValues = new ArrayOfApplicationValueWrapper( raw.getApplicationValues());

    }

    @Override
    public String toString()
    {
        return "WUUpdateWrapper [" + "wuid = " + local_wuid + ", " + "state = " + local_state + ", " + "stateOrig = " + local_stateOrig + ", " + "jobname = " + local_jobname + ", " + "jobnameOrig = " + local_jobnameOrig + ", " + "queryText = " + local_queryText + ", " + "action = " + local_action + ", " + "description = " + local_description + ", " + "descriptionOrig = " + local_descriptionOrig + ", " + "addDrilldownFields = " + local_addDrilldownFields + ", " + "resultLimit = " + local_resultLimit + ", " + "protected = " + local_protected + ", " + "protectedOrig = " + local_protectedOrig + ", " + "priorityClass = " + local_priorityClass + ", " + "priorityLevel = " + local_priorityLevel + ", " + "scope = " + local_scope + ", " + "scopeOrig = " + local_scopeOrig + ", " + "clusterSelection = " + local_clusterSelection + ", " + "clusterOrig = " + local_clusterOrig + ", " + "xmlParams = " + local_xmlParams + ", " + "thorSlaveIP = " + local_thorSlaveIP + ", " + "queryMainDefinition = " + local_queryMainDefinition + ", " + "debugValues = " + local_debugValues + ", " + "applicationValues = " + local_applicationValues + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdate getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdate raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUUpdate();
        raw.setWuid( local_wuid);
        raw.setState( local_state);
        raw.setStateOrig( local_stateOrig);
        raw.setJobname( local_jobname);
        raw.setJobnameOrig( local_jobnameOrig);
        raw.setQueryText( local_queryText);
        raw.setAction( local_action);
        raw.setDescription( local_description);
        raw.setDescriptionOrig( local_descriptionOrig);
        raw.setAddDrilldownFields( local_addDrilldownFields);
        raw.setResultLimit( local_resultLimit);
        raw.setProtected( local_protected);
        raw.setProtectedOrig( local_protectedOrig);
        raw.setPriorityClass( local_priorityClass);
        raw.setPriorityLevel( local_priorityLevel);
        raw.setScope( local_scope);
        raw.setScopeOrig( local_scopeOrig);
        raw.setClusterSelection( local_clusterSelection);
        raw.setClusterOrig( local_clusterOrig);
        raw.setXmlParams( local_xmlParams);
        raw.setThorSlaveIP( local_thorSlaveIP);
        raw.setQueryMainDefinition( local_queryMainDefinition);
        if (local_debugValues != null)
            raw.setDebugValues( local_debugValues.getRaw());
        if (local_applicationValues != null)
            raw.setApplicationValues( local_applicationValues.getRaw());
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
    public void setState( int _state )
    {
        this.local_state = _state;
    }
    public int getState( )
    {
        return this.local_state;
    }
    public void setStateOrig( int _stateOrig )
    {
        this.local_stateOrig = _stateOrig;
    }
    public int getStateOrig( )
    {
        return this.local_stateOrig;
    }
    public void setJobname( String _jobname )
    {
        this.local_jobname = _jobname;
    }
    public String getJobname( )
    {
        return this.local_jobname;
    }
    public void setJobnameOrig( String _jobnameOrig )
    {
        this.local_jobnameOrig = _jobnameOrig;
    }
    public String getJobnameOrig( )
    {
        return this.local_jobnameOrig;
    }
    public void setQueryText( String _queryText )
    {
        this.local_queryText = _queryText;
    }
    public String getQueryText( )
    {
        return this.local_queryText;
    }
    public void setAction( int _action )
    {
        this.local_action = _action;
    }
    public int getAction( )
    {
        return this.local_action;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setDescriptionOrig( String _descriptionOrig )
    {
        this.local_descriptionOrig = _descriptionOrig;
    }
    public String getDescriptionOrig( )
    {
        return this.local_descriptionOrig;
    }
    public void setAddDrilldownFields( boolean _addDrilldownFields )
    {
        this.local_addDrilldownFields = _addDrilldownFields;
    }
    public boolean getAddDrilldownFields( )
    {
        return this.local_addDrilldownFields;
    }
    public void setResultLimit( int _resultLimit )
    {
        this.local_resultLimit = _resultLimit;
    }
    public int getResultLimit( )
    {
        return this.local_resultLimit;
    }
    public void setProtected( boolean _protected )
    {
        this.local_protected = _protected;
    }
    public boolean getProtected( )
    {
        return this.local_protected;
    }
    public void setProtectedOrig( boolean _protectedOrig )
    {
        this.local_protectedOrig = _protectedOrig;
    }
    public boolean getProtectedOrig( )
    {
        return this.local_protectedOrig;
    }
    public void setPriorityClass( int _priorityClass )
    {
        this.local_priorityClass = _priorityClass;
    }
    public int getPriorityClass( )
    {
        return this.local_priorityClass;
    }
    public void setPriorityLevel( int _priorityLevel )
    {
        this.local_priorityLevel = _priorityLevel;
    }
    public int getPriorityLevel( )
    {
        return this.local_priorityLevel;
    }
    public void setScope( String _scope )
    {
        this.local_scope = _scope;
    }
    public String getScope( )
    {
        return this.local_scope;
    }
    public void setScopeOrig( String _scopeOrig )
    {
        this.local_scopeOrig = _scopeOrig;
    }
    public String getScopeOrig( )
    {
        return this.local_scopeOrig;
    }
    public void setClusterSelection( String _clusterSelection )
    {
        this.local_clusterSelection = _clusterSelection;
    }
    public String getClusterSelection( )
    {
        return this.local_clusterSelection;
    }
    public void setClusterOrig( String _clusterOrig )
    {
        this.local_clusterOrig = _clusterOrig;
    }
    public String getClusterOrig( )
    {
        return this.local_clusterOrig;
    }
    public void setXmlParams( String _xmlParams )
    {
        this.local_xmlParams = _xmlParams;
    }
    public String getXmlParams( )
    {
        return this.local_xmlParams;
    }
    public void setThorSlaveIP( String _thorSlaveIP )
    {
        this.local_thorSlaveIP = _thorSlaveIP;
    }
    public String getThorSlaveIP( )
    {
        return this.local_thorSlaveIP;
    }
    public void setQueryMainDefinition( String _queryMainDefinition )
    {
        this.local_queryMainDefinition = _queryMainDefinition;
    }
    public String getQueryMainDefinition( )
    {
        return this.local_queryMainDefinition;
    }
    public void setDebugValues( ArrayOfDebugValueWrapper _debugValues )
    {
        this.local_debugValues = _debugValues;
    }
    public ArrayOfDebugValueWrapper getDebugValues( )
    {
        return this.local_debugValues;
    }
    public void setApplicationValues( ArrayOfApplicationValueWrapper _applicationValues )
    {
        this.local_applicationValues = _applicationValues;
    }
    public ArrayOfApplicationValueWrapper getApplicationValues( )
    {
        return this.local_applicationValues;
    }
}