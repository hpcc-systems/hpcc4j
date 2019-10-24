package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfDebugValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUCreateAndUpdate;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.DebugValueWrapper;

public class WUCreateAndUpdateWrapper
{

    private String                        wuid;

    private Integer                       state;

    private Integer                       stateOrig;

    private String                        jobname;

    private String                        jobnameOrig;

    private String                        queryText;

    private Integer                       action;

    private String                        description;

    private String                        descriptionOrig;

    private boolean                       addDrilldownFields=false;

    private Integer                       resultLimit;

    private boolean                       _protected=false;

    private boolean                       protectedOrig=false;

    private Integer                       priorityClass;

    private Integer                       priorityLevel;

    private String                        scope;

    private String                        scopeOrig;

    private String                        clusterSelection;

    private String                        clusterOrig;

    private String                        xmlParams;

    private String                        thorSlaveIP;

    private String                        queryMainDefinition;

    private List<ApplicationValueWrapper> applicationValues = new ArrayList<ApplicationValueWrapper>();

    private List<DebugValueWrapper>       debugValues       = new ArrayList<DebugValueWrapper>();

    /**
     * @return the wuid
     */
    public String getWuid()
    {
        return wuid;
    }

    /**
     * @param wuid the wuid to set
     */
    public void setWuid(String wuid)
    {
        this.wuid = wuid;
    }

    /**
     * @return the state
     */
    public Integer getState()
    {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(Integer state)
    {
        this.state = state;
    }

    /**
     * @return the stateOrig
     */
    public Integer getStateOrig()
    {
        return stateOrig;
    }

    /**
     * @param stateOrig the stateOrig to set
     */
    public void setStateOrig(Integer stateOrig)
    {
        this.stateOrig = stateOrig;
    }

    /**
     * @return the jobname
     */
    public String getJobname()
    {
        return jobname;
    }

    /**
     * @param jobname the jobname to set
     */
    public void setJobname(String jobname)
    {
        this.jobname = jobname;
    }

    /**
     * @return the jobnameOrig
     */
    public String getJobnameOrig()
    {
        return jobnameOrig;
    }

    /**
     * @param jobnameOrig the jobnameOrig to set
     */
    public void setJobnameOrig(String jobnameOrig)
    {
        this.jobnameOrig = jobnameOrig;
    }

    /**
     * @return the queryText
     */
    public String getQueryText()
    {
        return queryText;
    }

    /**
     * @param queryText the queryText to set
     */
    public void setQueryText(String queryText)
    {
        this.queryText = queryText;
    }

    /**
     * @return the resultLimit
     */
    public Integer getResultLimit()
    {
        return resultLimit;
    }

    /**
     * @param resultLimit the resultLimit to set
     */
    public void setResultLimit(Integer resultLimit)
    {
        this.resultLimit = resultLimit;
    }

    /**
     * @return the protectedOrig
     */
    public boolean getProtectedOrig()
    {
        return protectedOrig;
    }

    /**
     * @param protectedOrig the protectedOrig to set
     */
    public void setProtectedOrig(boolean protectedOrig)
    {
        this.protectedOrig = protectedOrig;
    }

    /**
     * @return the priorityClass
     */
    public Integer getPriorityClass()
    {
        return priorityClass;
    }

    /**
     * @param priorityClass the priorityClass to set
     */
    public void setPriorityClass(Integer priorityClass)
    {
        this.priorityClass = priorityClass;
    }

    /**
     * @return the priorityLevel
     */
    public Integer getPriorityLevel()
    {
        return priorityLevel;
    }

    /**
     * @param priorityLevel the priorityLevel to set
     */
    public void setPriorityLevel(Integer priorityLevel)
    {
        this.priorityLevel = priorityLevel;
    }

    /**
     * @return the scope
     */
    public String getScope()
    {
        return scope;
    }

    /**
     * @param scope the scope to set
     */
    public void setScope(String scope)
    {
        this.scope = scope;
    }

    /**
     * @return the scopeOrig
     */
    public String getScopeOrig()
    {
        return scopeOrig;
    }

    /**
     * @param scopeOrig the scopeOrig to set
     */
    public void setScopeOrig(String scopeOrig)
    {
        this.scopeOrig = scopeOrig;
    }

    /**
     * @return the xmlParams
     */
    public String getXmlParams()
    {
        return xmlParams;
    }

    /**
     * @param xmlParams the xmlParams to set
     */
    public void setXmlParams(String xmlParams)
    {
        this.xmlParams = xmlParams;
    }

    /**
     * @return the thorSlaveIP
     */
    public String getThorSlaveIP()
    {
        return thorSlaveIP;
    }

    /**
     * @param thorSlaveIP the thorSlaveIP to set
     */
    public void setThorSlaveIP(String thorSlaveIP)
    {
        this.thorSlaveIP = thorSlaveIP;
    }

    /**
     * @return the queryMainDefinition
     */
    public String getQueryMainDefinition()
    {
        return queryMainDefinition;
    }

    /**
     * @param queryMainDefinition the queryMainDefinition to set
     */
    public void setQueryMainDefinition(String queryMainDefinition)
    {
        this.queryMainDefinition = queryMainDefinition;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUCreateAndUpdate getRaw()
    {
        return getRawVersion1_75();
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUCreateAndUpdate getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUCreateAndUpdate result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.WUCreateAndUpdate();

        result.setProtected(_protected);
        if (action != null)
        {
            result.setAction(action);
        }
        result.setAddDrilldownFields(addDrilldownFields);
        result.setClusterOrig(clusterOrig);
        result.setClusterSelection(clusterSelection);
        result.setDescription(description);
        result.setDescriptionOrig(descriptionOrig);
        result.setJobname(jobname);
        result.setJobnameOrig(jobnameOrig);
        if (priorityClass != null) 
        {
            result.setPriorityClass(priorityClass);
        }
        if (priorityLevel != null)
        {
            result.setPriorityLevel(priorityLevel);
        }
        result.setProtectedOrig(protectedOrig);
        result.setQueryMainDefinition(queryMainDefinition);
        result.setQueryText(queryText);
        if (resultLimit != null)
        {
            result.setResultLimit(resultLimit);
        }
        result.setScope(scope);
        result.setScopeOrig(scopeOrig);
        if (state != null)
        {
            result.setState(state);
        }
        result.setStateOrig(stateOrig);
        result.setThorSlaveIP(thorSlaveIP);
        result.setWuid(wuid);
        result.setXmlParams(xmlParams);

        if (this.getApplicationValues().size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue[] appvals = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue[this.getApplicationValues().size()];
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue av = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue();
                av.setApplication(this.getApplicationValues().get(i).getApplication());
                av.setName(this.getApplicationValues().get(i).getName());
                av.setValue(this.getApplicationValues().get(i).getValue());
                appvals[i] = av;
            }
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue applicationvalues = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue();
            applicationvalues.setApplicationValue(appvals);
            result.setApplicationValues(applicationvalues );
        }

        if (this.getDebugValues().size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue[] debugvals = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue[this.getDebugValues().size()];
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue av = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue();
                av.setName(this.getDebugValues().get(i).getName());
                av.setValue(this.getDebugValues().get(i).getValue());
                debugvals[i] = av;
            }
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfDebugValue debugvalsarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfDebugValue();
            debugvalsarray.setDebugValue(debugvals);
            result.setDebugValues(debugvalsarray );
        }
        return result;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUCreateAndUpdate getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUCreateAndUpdate result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.WUCreateAndUpdate();

        result.setProtected(_protected);
        result.setAction(action);
        result.setAddDrilldownFields(addDrilldownFields);
        result.setClusterOrig(clusterOrig);
        result.setClusterSelection(clusterSelection);
        result.setDescription(description);
        result.setDescriptionOrig(descriptionOrig);
        result.setJobname(jobname);
        result.setJobnameOrig(jobnameOrig);
        result.setPriorityClass(priorityClass);
        result.setPriorityLevel(priorityLevel);
        result.setProtectedOrig(protectedOrig);
        result.setQueryMainDefinition(queryMainDefinition);
        result.setQueryText(queryText);
        result.setResultLimit(resultLimit);
        result.setScope(scope);
        result.setScopeOrig(scopeOrig);
        result.setState(state);
        result.setStateOrig(stateOrig);
        result.setThorSlaveIP(thorSlaveIP);
        result.setWuid(wuid);
        result.setXmlParams(xmlParams);
        if (this.getApplicationValues().size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue[] appvals = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue[this.getApplicationValues().size()];
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue av = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue();
                av.setApplication(this.getApplicationValues().get(i).getApplication());
                av.setName(this.getApplicationValues().get(i).getName());
                av.setValue(this.getApplicationValues().get(i).getValue());
                appvals[i] = av;
            }
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue appvalsarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue();
            appvalsarray.setApplicationValue(appvals);
                    
            result.setApplicationValues(appvalsarray);
        }

        if (this.getDebugValues().size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue[] debugvals = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue[this.getDebugValues().size()];
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue av = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue();
                av.setName(this.getDebugValues().get(i).getName());
                av.setValue(this.getDebugValues().get(i).getValue());
                debugvals[i] = av;
            }
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue debugvalsarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue();
            debugvalsarray.setDebugValue(debugvals);
            result.setDebugValues(debugvalsarray);
        }
        return result;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate();

        result.setProtected(_protected);
        result.setAction(action);
        result.setAddDrilldownFields(addDrilldownFields);
        result.setClusterOrig(clusterOrig);
        result.setClusterSelection(clusterSelection);
        result.setDescription(description);
        result.setDescriptionOrig(descriptionOrig);
        result.setJobname(jobname);
        result.setJobnameOrig(jobnameOrig);
        if (priorityClass != null) 
        {
            result.setPriorityClass(priorityClass);
        }
        if (priorityLevel != null) 
        {
            result.setPriorityLevel(priorityLevel);
        }
        result.setProtectedOrig(protectedOrig);
        result.setQueryMainDefinition(queryMainDefinition);
        result.setQueryText(queryText);
        result.setResultLimit(resultLimit);
        result.setScope(scope);
        result.setScopeOrig(scopeOrig);
        if (state != null)
        {
            result.setState(state);
        }
        if (stateOrig != null) 
        {
            result.setStateOrig(stateOrig);
        }
        result.setThorSlaveIP(thorSlaveIP);
        result.setWuid(wuid);
        result.setXmlParams(xmlParams);

        if (this.getApplicationValues().size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue[] appvals = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue[this.getApplicationValues().size()];
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue av = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue();
                av.setApplication(this.getApplicationValues().get(i).getApplication());
                av.setName(this.getApplicationValues().get(i).getName());
                av.setValue(this.getApplicationValues().get(i).getValue());
                appvals[i] = av;
            }
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfApplicationValue appvalsarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfApplicationValue();
            appvalsarray.setApplicationValue(appvals);
            result.setApplicationValues(appvalsarray );
        }

        if (this.getDebugValues().size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue[] debugvals = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue[this.getDebugValues().size()];
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue av = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue();
                av.setName(this.getDebugValues().get(i).getName());
                av.setValue(this.getDebugValues().get(i).getValue());
                debugvals[i] = av;
            }
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfDebugValue debugvalsarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfDebugValue();
            debugvalsarray.setDebugValue(debugvals);
            result.setDebugValues(debugvalsarray );
        }
        return result;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUCreateAndUpdate getRawVersion1_75()
    {
        WUCreateAndUpdate request = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUCreateAndUpdate();

        if (_protected) request.setProtected(_protected);
        if (action != null) request.setAction(action);
        if (addDrilldownFields) request.setAddDrilldownFields(addDrilldownFields);
        if (clusterOrig != null) request.setClusterOrig(clusterOrig);
        if (clusterSelection != null) request.setClusterSelection(clusterSelection);
        if (description != null) request.setDescription(description);
        if (descriptionOrig != null) request.setDescriptionOrig(descriptionOrig);
        if (jobname != null) request.setJobname(jobname);
        if (jobnameOrig != null) request.setJobnameOrig(jobnameOrig);
        if (priorityClass != null) request.setPriorityClass(priorityClass);
        if (priorityLevel != null) request.setPriorityLevel(priorityLevel);
        if (protectedOrig) request.setProtectedOrig(protectedOrig);
        if (queryMainDefinition != null) request.setQueryMainDefinition(queryMainDefinition);
        if (queryText != null) request.setQueryText(queryText);
        if (resultLimit != null) request.setResultLimit(resultLimit);
        if (scope != null) request.setScope(scope);
        if (scopeOrig != null) request.setScopeOrig(scopeOrig);
        if (state != null) request.setState(state);
        if (stateOrig != null) request.setStateOrig(stateOrig);
        if (thorSlaveIP != null) request.setThorSlaveIP(thorSlaveIP);
        if (wuid != null) request.setWuid(wuid);
        if (xmlParams != null) request.setXmlParams(xmlParams);

        if (getApplicationValues() != null && getApplicationValues().size() > 0)
        {
            ArrayOfApplicationValue appvals = new ArrayOfApplicationValue();
            for (int i = 0; i < this.getApplicationValues().size(); i++)
            {
                ApplicationValue av = new ApplicationValue();
                av.setApplication(this.getApplicationValues().get(i).getApplication());
                av.setName(this.getApplicationValues().get(i).getName());
                av.setValue(this.getApplicationValues().get(i).getValue());
                appvals.addApplicationValue(av);
            }
            request.setApplicationValues(appvals);
        }

        if (getDebugValues() != null && getDebugValues().size() > 0)
        {
            ArrayOfDebugValue debugvals = new ArrayOfDebugValue();
            for (int i = 0; i < this.getDebugValues().size(); i++)
            {
                DebugValue av = new DebugValue();
                av.setName(this.getDebugValues().get(i).getName());
                av.setValue(this.getDebugValues().get(i).getValue());
                debugvals.addDebugValue(av);
            }
            request.setDebugValues(debugvals);
        }

        return request;
    }

    /**
     * @return the applicationValues
     */
    public List<ApplicationValueWrapper> getApplicationValues()
    {
        return applicationValues;
    }

    /**
     * @param applicationValues the applicationValues to set
     */
    public void setApplicationValues(List<ApplicationValueWrapper> applicationValues)
    {
        this.applicationValues = applicationValues;
    }

    /**
     * @return the debugValues
     */
    public List<DebugValueWrapper> getDebugValues()
    {
        return debugValues;
    }

    /**
     * @param debugValues the debugValues to set
     */
    public void setDebugValues(List<DebugValueWrapper> debugValues)
    {
        this.debugValues = debugValues;
    }

    /**
     * @param debugValues the debugValues to set
     */
    public void setDebugValues(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue[] debugValues)
    {
        this.debugValues.clear();
        if (debugValues == null)
        {
            return;
        }
        for (int i = 0; i < debugValues.length; i++)
        {
            this.debugValues.add(new DebugValueWrapper(debugValues[i]));
        }
    }

    public void setAction(int i)
    {
        this.action = i;
    }

    /**
     * @return the action
     */
    public Integer getAction()
    {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(Integer action)
    {
        this.action = action;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @return the descriptionOrig
     */
    public String getDescriptionOrig()
    {
        return descriptionOrig;
    }

    /**
     * @param descriptionOrig the descriptionOrig to set
     */
    public void setDescriptionOrig(String descriptionOrig)
    {
        this.descriptionOrig = descriptionOrig;
    }

    /**
     * @return the addDrilldownFields
     */
    public boolean getAddDrilldownFields()
    {
        return addDrilldownFields;
    }

    /**
     * @param addDrilldownFields the addDrilldownFields to set
     */
    public void setAddDrilldownFields(boolean addDrilldownFields)
    {
        this.addDrilldownFields = addDrilldownFields;
    }

    /**
     * @return the clusterSelection
     */
    public String getClusterSelection()
    {
        return clusterSelection;
    }

    /**
     * @param clusterSelection the clusterSelection to set
     */
    public void setClusterSelection(String clusterSelection)
    {
        this.clusterSelection = clusterSelection;
    }

    /**
     * @return the clusterOrig
     */
    public String getClusterOrig()
    {
        return clusterOrig;
    }

    /**
     * @param clusterOrig the clusterOrig to set
     */
    public void setClusterOrig(String clusterOrig)
    {
        this.clusterOrig = clusterOrig;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "WUCreateAndUpdateWrapper [wuid=" + wuid + ", state=" + state + ", stateOrig=" + stateOrig + ", jobname=" + jobname + ", jobnameOrig="
                + jobnameOrig + ", queryText=" + queryText + ", action=" + action + ", description=" + description + ", descriptionOrig="
                + descriptionOrig + ", addDrilldownFields=" + addDrilldownFields + ", resultLimit=" + resultLimit + ", _protected=" + _protected
                + ", protectedOrig=" + protectedOrig + ", priorityClass=" + priorityClass + ", priorityLevel=" + priorityLevel + ", scope=" + scope
                + ", scopeOrig=" + scopeOrig + ", clusterSelection=" + clusterSelection + ", clusterOrig=" + clusterOrig + ", xmlParams=" + xmlParams
                + ", thorSlaveIP=" + thorSlaveIP + ", queryMainDefinition=" + queryMainDefinition + ", applicationValues=" + applicationValues
                + ", debugValues=" + debugValues + "]";
    }

}
