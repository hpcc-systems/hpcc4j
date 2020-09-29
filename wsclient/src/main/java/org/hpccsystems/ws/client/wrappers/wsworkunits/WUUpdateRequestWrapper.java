package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.DebugValueWrapper;

public class WUUpdateRequestWrapper
{
    String                        wuid;
    Integer                       state;
    Integer                       stateOrig;
    String                        jobname;
    String                        jobnameOrig;
    String                        queryText;
    Integer                       action;
    String                        description;
    String                        descriptionOrig;
    Boolean                       addDrilldownFields;
    Integer                       resultLimit;
    Boolean                       _protected;
    Boolean                       protectedOrig;
    Integer                       priorityClass;
    Integer                       priorityLevel;
    String                        scope;
    String                        scopeOrig;
    String                        clusterSelection;
    String                        clusterOrig;
    String                        xmlParams;
    String                        thorSlaveIP;
    String                        queryMainDefinition;
    List<DebugValueWrapper>       debugValues       = new ArrayList<DebugValueWrapper>();
    List<ApplicationValueWrapper> applicationValues = new ArrayList<ApplicationValueWrapper>();

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate getRaw()
    {
        return getRawVersion79();
    }

    /**
     * Gets the raw version 79.
     *
     * @return the raw version 79
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate getRawVersion79()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ApplicationValue[] avs = null;
        if (this.getApplicationValues().size() > 0)
        {
            avs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ApplicationValue[this.getApplicationValues().size()];
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                avs[i] = this.getApplicationValues().get(i).getRawLatestVersion();
            }
        }

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.DebugValue[] dvs = null;
        if (this.getDebugValues().size() > 0)
        {
            dvs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.DebugValue[this.getDebugValues().size()];
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                dvs[i] = this.getDebugValues().get(i).getRawVersion1_79();
            }
        }
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUUpdate();
        raw.setWuid(wuid);
        raw.setState(state);
        raw.setStateOrig(stateOrig);
        raw.setJobname(jobname);
        raw.setJobnameOrig(jobnameOrig);
        raw.setQueryText(queryText);
        raw.setAction(action);
        raw.setDescription(description);
        raw.setDescriptionOrig(descriptionOrig);
        raw.setAddDrilldownFields(addDrilldownFields);
        raw.setResultLimit(resultLimit);
        raw.setProtected(_protected);
        raw.setProtectedOrig(protectedOrig);
        raw.setPriorityClass(priorityClass);
        raw.setPriorityLevel(priorityLevel);
        raw.setScope(scope);
        raw.setScopeOrig(scopeOrig);
        raw.setClusterSelection(clusterSelection);
        raw.setClusterOrig(clusterOrig);
        raw.setXmlParams(xmlParams);
        raw.setThorSlaveIP(thorSlaveIP);
        raw.setQueryMainDefinition(queryMainDefinition);

        if (dvs != null && dvs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ArrayOfDebugValue dvarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ArrayOfDebugValue();
            dvarray.setDebugValue(dvs);
            raw.setDebugValues(dvarray);
        }

        if (avs != null && avs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ArrayOfApplicationValue avarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ArrayOfApplicationValue();
            avarray.setApplicationValue(avs);
            raw.setApplicationValues(avarray);
        }
        return raw;
    }

    /**
     * Gets the raw version 1 69.
     *
     * @return the raw version 1 69
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue[] avs = null;
        if (this.getApplicationValues().size() > 0)
        {
            avs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue[this.getApplicationValues().size()];
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                avs[i] = this.getApplicationValues().get(i).getRawVersion1_69();
            }
        }

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue[] dvs = null;
        if (this.getDebugValues().size() > 0)
        {
            dvs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue[this.getDebugValues().size()];
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                dvs[i] = this.getDebugValues().get(i).getRawVersion1_69();
            }
        }

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate();
        raw.setWuid(wuid);
        raw.setState(state);
        raw.setStateOrig(stateOrig);
        raw.setJobname(jobname);
        raw.setJobnameOrig(jobnameOrig);
        raw.setQueryText(queryText);
        raw.setAction(action);
        raw.setDescription(description);
        raw.setDescriptionOrig(descriptionOrig);
        raw.setAddDrilldownFields(addDrilldownFields);
        raw.setResultLimit(resultLimit);
        raw.setProtected(_protected);
        raw.setProtectedOrig(protectedOrig);
        raw.setPriorityClass(priorityClass);
        raw.setPriorityLevel(priorityLevel);
        raw.setScope(scope);
        raw.setScopeOrig(scopeOrig);
        raw.setClusterSelection(clusterSelection);
        raw.setClusterOrig(clusterOrig);
        raw.setXmlParams(xmlParams);
        raw.setThorSlaveIP(thorSlaveIP);
        raw.setQueryMainDefinition(queryMainDefinition);

        if (dvs != null && dvs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfDebugValue dvarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfDebugValue();
            dvarray.setDebugValue(dvs);
            raw.setDebugValues(dvarray);
        }

        if (avs != null && avs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfApplicationValue avarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfApplicationValue();
            avarray.setApplicationValue(avs);
            raw.setApplicationValues(avarray);
        }

        return raw;
    }

    /**
     * Gets the raw version 1 62.
     *
     * @return the raw version 1 62
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUUpdate getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue[] avs = null;
        if (this.getApplicationValues().size() > 0)
        {
            avs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue[this.getApplicationValues().size()];
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                avs[i] = this.getApplicationValues().get(i).getRawVersion1_62();
            }
        }

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue[] dvs = null;
        if (this.getDebugValues().size() > 0)
        {
            dvs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue[this.getDebugValues().size()];
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                dvs[i] = this.getDebugValues().get(i).getRawVersion1_62();
            }
        }

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUUpdate raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUUpdate();
        raw.setWuid(wuid);
        raw.setState(state);
        raw.setStateOrig(stateOrig);
        raw.setJobname(jobname);
        raw.setJobnameOrig(jobnameOrig);
        raw.setQueryText(queryText);
        raw.setAction(action);
        raw.setDescription(description);
        raw.setDescriptionOrig(descriptionOrig);
        raw.setAddDrilldownFields(addDrilldownFields);
        raw.setResultLimit(resultLimit);
        raw.setProtected(_protected);
        raw.setProtectedOrig(protectedOrig);
        raw.setPriorityClass(priorityClass);
        raw.setPriorityLevel(priorityLevel);
        raw.setScope(scope);
        raw.setScopeOrig(scopeOrig);
        raw.setClusterSelection(clusterSelection);
        raw.setClusterOrig(clusterOrig);
        raw.setXmlParams(xmlParams);
        raw.setThorSlaveIP(thorSlaveIP);
        raw.setQueryMainDefinition(queryMainDefinition);

        if (dvs != null && dvs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue dvarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue();
            dvarray.setDebugValue(dvs);
            raw.setDebugValues(dvarray);
        }

        if (avs != null && avs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue avarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue();
            avarray.setApplicationValue(avs);
            raw.setApplicationValues(avarray);
        }

        return raw;
    }


    /**
     * Gets the raw version 1 58.
     *
     * @return the raw version 1 58
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUUpdate getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue[] avs = null;
        if (this.getApplicationValues().size() > 0)
        {
            avs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue[this.getApplicationValues().size()];
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                avs[i] = this.getApplicationValues().get(i).getRawVersion1_58();
            }
        }

        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue[] dvs = null;
        if (this.getDebugValues().size() > 0)
        {
            dvs = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue[this.getDebugValues().size()];
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                dvs[i] = this.getDebugValues().get(i).getRawVersion1_58();
            }
        }
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUUpdate raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUUpdate();
        raw.setWuid(wuid);
        raw.setState(state);
        raw.setStateOrig(stateOrig);
        raw.setJobname(jobname);
        raw.setJobnameOrig(jobnameOrig);
        raw.setQueryText(queryText);
        raw.setAction(action);
        raw.setDescription(description);
        raw.setDescriptionOrig(descriptionOrig);
        raw.setAddDrilldownFields(addDrilldownFields);
        raw.setResultLimit(resultLimit);
        raw.setProtected(_protected);
        raw.setProtectedOrig(protectedOrig);
        raw.setPriorityClass(priorityClass);
        raw.setPriorityLevel(priorityLevel);
        raw.setScope(scope);
        raw.setScopeOrig(scopeOrig);
        raw.setClusterSelection(clusterSelection);
        raw.setClusterOrig(clusterOrig);
        raw.setXmlParams(xmlParams);
        raw.setThorSlaveIP(thorSlaveIP);
        raw.setQueryMainDefinition(queryMainDefinition);
        if (dvs != null && dvs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfDebugValue dvarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfDebugValue();
            dvarray.setDebugValue(dvs);
            raw.setDebugValues(dvarray);
        }
        if (avs != null && avs.length > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue avarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue();
            avarray.setApplicationValue(avs);
            raw.setApplicationValues(avarray);
        }

        return raw;
    }

    /**
     * Gets the wuid.
     *
     * @return the wuid
     */
    public String getWuid()
    {
        return wuid;
    }

    /**
     * Sets the wuid.
     *
     * @param wuid
     *            the wuid to set
     */
    public void setWuid(String wuid)
    {
        this.wuid = wuid;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public Integer getState()
    {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state
     *            the state to set
     */
    public void setState(Integer state)
    {
        this.state = state;
    }

    /**
     * Gets the state orig.
     *
     * @return the stateOrig
     */
    public Integer getStateOrig()
    {
        return stateOrig;
    }

    /**
     * Sets the state orig.
     *
     * @param stateOrig
     *            the stateOrig to set
     */
    public void setStateOrig(Integer stateOrig)
    {
        this.stateOrig = stateOrig;
    }

    /**
     * Gets the jobname.
     *
     * @return the jobname
     */
    public String getJobname()
    {
        return jobname;
    }

    /**
     * Sets the jobname.
     *
     * @param jobname
     *            the jobname to set
     */
    public void setJobname(String jobname)
    {
        this.jobname = jobname;
    }

    /**
     * Gets the jobname orig.
     *
     * @return the jobnameOrig
     */
    public String getJobnameOrig()
    {
        return jobnameOrig;
    }

    /**
     * Sets the jobname orig.
     *
     * @param jobnameOrig
     *            the jobnameOrig to set
     */
    public void setJobnameOrig(String jobnameOrig)
    {
        this.jobnameOrig = jobnameOrig;
    }

    /**
     * Gets the query text.
     *
     * @return the queryText
     */
    public String getQueryText()
    {
        return queryText;
    }

    /**
     * Sets the query text.
     *
     * @param queryText
     *            the queryText to set
     */
    public void setQueryText(String queryText)
    {
        this.queryText = queryText;
    }

    /**
     * Gets the action.
     *
     * @return the action
     */
    public Integer getAction()
    {
        return action;
    }

    /**
     * Sets the action.
     *
     * @param action
     *            the action to set
     */
    public void setAction(Integer action)
    {
        this.action = action;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Gets the description orig.
     *
     * @return the descriptionOrig
     */
    public String getDescriptionOrig()
    {
        return descriptionOrig;
    }

    /**
     * Sets the description orig.
     *
     * @param descriptionOrig
     *            the descriptionOrig to set
     */
    public void setDescriptionOrig(String descriptionOrig)
    {
        this.descriptionOrig = descriptionOrig;
    }

    /**
     * Gets the adds the drilldown fields.
     *
     * @return the addDrilldownFields
     */
    public Boolean getAddDrilldownFields()
    {
        return addDrilldownFields;
    }

    /**
     * Sets the adds the drilldown fields.
     *
     * @param addDrilldownFields
     *            the addDrilldownFields to set
     */
    public void setAddDrilldownFields(Boolean addDrilldownFields)
    {
        this.addDrilldownFields = addDrilldownFields;
    }

    /**
     * Gets the result limit.
     *
     * @return the resultLimit
     */
    public Integer getResultLimit()
    {
        return resultLimit;
    }

    /**
     * Sets the result limit.
     *
     * @param resultLimit
     *            the resultLimit to set
     */
    public void setResultLimit(Integer resultLimit)
    {
        this.resultLimit = resultLimit;
    }

    /**
     * Gets the protected.
     *
     * @return the _protected
     */
    public Boolean get_protected()
    {
        return _protected;
    }

    /**
     * Sets the protected.
     *
     * @param _protected
     *            the _protected to set
     */
    public void set_protected(Boolean _protected)
    {
        this._protected = _protected;
    }

    /**
     * Gets the protected orig.
     *
     * @return the protectedOrig
     */
    public Boolean getProtectedOrig()
    {
        return protectedOrig;
    }

    /**
     * Sets the protected orig.
     *
     * @param protectedOrig
     *            the protectedOrig to set
     */
    public void setProtectedOrig(Boolean protectedOrig)
    {
        this.protectedOrig = protectedOrig;
    }

    /**
     * Gets the priority class.
     *
     * @return the priorityClass
     */
    public Integer getPriorityClass()
    {
        return priorityClass;
    }

    /**
     * Sets the priority class.
     *
     * @param priorityClass
     *            the priorityClass to set
     */
    public void setPriorityClass(Integer priorityClass)
    {
        this.priorityClass = priorityClass;
    }

    /**
     * Gets the priority level.
     *
     * @return the priorityLevel
     */
    public Integer getPriorityLevel()
    {
        return priorityLevel;
    }

    /**
     * Sets the priority level.
     *
     * @param priorityLevel
     *            the priorityLevel to set
     */
    public void setPriorityLevel(Integer priorityLevel)
    {
        this.priorityLevel = priorityLevel;
    }

    /**
     * Gets the scope.
     *
     * @return the scope
     */
    public String getScope()
    {
        return scope;
    }

    /**
     * Sets the scope.
     *
     * @param scope
     *            the scope to set
     */
    public void setScope(String scope)
    {
        this.scope = scope;
    }

    /**
     * Gets the scope orig.
     *
     * @return the scopeOrig
     */
    public String getScopeOrig()
    {
        return scopeOrig;
    }

    /**
     * Sets the scope orig.
     *
     * @param scopeOrig
     *            the scopeOrig to set
     */
    public void setScopeOrig(String scopeOrig)
    {
        this.scopeOrig = scopeOrig;
    }

    /**
     * Gets the cluster selection.
     *
     * @return the clusterSelection
     */
    public String getClusterSelection()
    {
        return clusterSelection;
    }

    /**
     * Sets the cluster selection.
     *
     * @param clusterSelection
     *            the clusterSelection to set
     */
    public void setClusterSelection(String clusterSelection)
    {
        this.clusterSelection = clusterSelection;
    }

    /**
     * Gets the cluster orig.
     *
     * @return the clusterOrig
     */
    public String getClusterOrig()
    {
        return clusterOrig;
    }

    /**
     * Sets the cluster orig.
     *
     * @param clusterOrig
     *            the clusterOrig to set
     */
    public void setClusterOrig(String clusterOrig)
    {
        this.clusterOrig = clusterOrig;
    }

    /**
     * Gets the xml params.
     *
     * @return the xmlParams
     */
    public String getXmlParams()
    {
        return xmlParams;
    }

    /**
     * Sets the xml params.
     *
     * @param xmlParams
     *            the xmlParams to set
     */
    public void setXmlParams(String xmlParams)
    {
        this.xmlParams = xmlParams;
    }

    /**
     * Gets the thor slave IP.
     *
     * @return the thorSlaveIP
     */
    public String getThorSlaveIP()
    {
        return thorSlaveIP;
    }

    /**
     * Sets the thor slave IP.
     *
     * @param thorSlaveIP
     *            the thorSlaveIP to set
     */
    public void setThorSlaveIP(String thorSlaveIP)
    {
        this.thorSlaveIP = thorSlaveIP;
    }

    /**
     * Gets the query main definition.
     *
     * @return the queryMainDefinition
     */
    public String getQueryMainDefinition()
    {
        return queryMainDefinition;
    }

    /**
     * Sets the query main definition.
     *
     * @param queryMainDefinition
     *            the queryMainDefinition to set
     */
    public void setQueryMainDefinition(String queryMainDefinition)
    {
        this.queryMainDefinition = queryMainDefinition;
    }

    /**
     * Gets the debug values.
     *
     * @return the debugValues
     */
    public List<DebugValueWrapper> getDebugValues()
    {
        return debugValues;
    }

    /**
     * Sets the debug values.
     *
     * @param debugValues
     *            the debugValues to set
     */
    public void setDebugValues(List<DebugValueWrapper> debugValues)
    {
        this.debugValues = debugValues;
    }

    /**
     * Gets the application values.
     *
     * @return the applicationValues
     */
    public List<ApplicationValueWrapper> getApplicationValues()
    {
        return applicationValues;
    }

    /**
     * Sets the application values.
     *
     * @param applicationValues
     *            the applicationValues to set
     */
    public void setApplicationValues(List<ApplicationValueWrapper> applicationValues)
    {
        this.applicationValues = applicationValues;
    }
}
