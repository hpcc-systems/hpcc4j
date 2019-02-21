package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdate;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.DebugValueWrapper;

public class WUUpdateRequestWrapper
{
    String wuid;
    Integer state;
    Integer stateOrig;
    String jobname;
    String jobnameOrig;
    String queryText;
    Integer action;
    String description;
    String descriptionOrig;
    Boolean addDrilldownFields;
    Integer resultLimit;
    Boolean _protected;
    Boolean protectedOrig;
    Integer priorityClass;
    Integer priorityLevel;
    String scope;
    String scopeOrig;
    String clusterSelection;
    String clusterOrig;
    String xmlParams;
    String thorSlaveIP;
    String queryMainDefinition;
    List<DebugValueWrapper> debugValues=new ArrayList<DebugValueWrapper>();
    List<ApplicationValueWrapper> applicationValues=new ArrayList<ApplicationValueWrapper>();

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdate getRaw() {
        return getRawVersion73();
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdate getRawVersion73() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue[] avs=null;
        if (this.getApplicationValues().size()>0) {
            avs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue[this.getApplicationValues().size()];
            for (int i=0; i < this.getApplicationValues().size();i++) {
                avs[i]=this.getApplicationValues().get(i).getRawVersion1_73();
            }
        }

        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue[] dvs=null;
        if (this.getDebugValues().size()>0) {
            dvs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue[this.getDebugValues().size()];
            for (int i=0; i < this.getDebugValues().size();i++) {
                dvs[i]=this.getDebugValues().get(i).getRawVersion1_73();
            }
        }
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdate(
            wuid,
            state,
            stateOrig,
            jobname,
            jobnameOrig,
            queryText,
            action,
            description,
            descriptionOrig,
            addDrilldownFields,
            resultLimit,
            _protected,
            protectedOrig,
            priorityClass,
            priorityLevel,
            scope,
            scopeOrig,
            clusterSelection,
            clusterOrig,
            xmlParams,
            thorSlaveIP,
            queryMainDefinition,
            dvs,avs);
        
        return raw;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdate getRawVersion1_69() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue[] avs=null;
        if (this.getApplicationValues().size()>0) {
            avs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue[this.getApplicationValues().size()];
            for (int i=0; i < this.getApplicationValues().size();i++) {
                avs[i]=this.getApplicationValues().get(i).getRawVersion1_69();
            }
        }

        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue[] dvs=null;
        if (this.getDebugValues().size()>0) {
            dvs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue[this.getDebugValues().size()];
            for (int i=0; i < this.getDebugValues().size();i++) {
                dvs[i]=this.getDebugValues().get(i).getRawVersion1_69();
            }
        }
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdate(
            wuid,
            state,
            stateOrig,
            jobname,
            jobnameOrig,
            queryText,
            action,
            description,
            descriptionOrig,
            addDrilldownFields,
            resultLimit,
            _protected,
            protectedOrig,
            priorityClass,
            priorityLevel,
            scope,
            scopeOrig,
            clusterSelection,
            clusterOrig,
            xmlParams,
            thorSlaveIP,
            queryMainDefinition,
            dvs,avs);
        
        return raw;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUUpdate getRawVersion1_62() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ApplicationValue[] avs=null;
        if (this.getApplicationValues().size()>0) {
            avs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ApplicationValue[this.getApplicationValues().size()];
            for (int i=0; i < this.getApplicationValues().size();i++) {
                avs[i]=this.getApplicationValues().get(i).getRawVersion1_62();
            }
        }

        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.DebugValue[] dvs=null;
        if (this.getDebugValues().size()>0) {
            dvs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.DebugValue[this.getDebugValues().size()];
            for (int i=0; i < this.getDebugValues().size();i++) {
                dvs[i]=this.getDebugValues().get(i).getRawVersion1_62();
            }
        }
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUUpdate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.WUUpdate(
            wuid,
            state,
            stateOrig,
            jobname,
            jobnameOrig,
            queryText,
            action,
            description,
            descriptionOrig,
            addDrilldownFields,
            resultLimit,
            _protected,
            protectedOrig,
            priorityClass,
            priorityLevel,
            scope,
            scopeOrig,
            clusterSelection,
            clusterOrig,
            xmlParams,
            thorSlaveIP,
            queryMainDefinition,
            dvs,avs);
        
        return raw;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUUpdate getRawVersion1_58() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ApplicationValue[] avs=null;
        if (this.getApplicationValues().size()>0) {
            avs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ApplicationValue[this.getApplicationValues().size()];
            for (int i=0; i < this.getApplicationValues().size();i++) {
                avs[i]=this.getApplicationValues().get(i).getRawVersion1_58();
            }
        }

        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.DebugValue[] dvs=null;
        if (this.getDebugValues().size()>0) {
            dvs=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.DebugValue[this.getDebugValues().size()];
            for (int i=0; i < this.getDebugValues().size();i++) {
                dvs[i]=this.getDebugValues().get(i).getRawVersion1_58();
            }
        }
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUUpdate raw=
                new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.WUUpdate(
            wuid,
            state,
            stateOrig,
            jobname,
            jobnameOrig,
            queryText,
            action,
            description,
            descriptionOrig,
            addDrilldownFields,
            resultLimit,
            _protected,
            protectedOrig,
            priorityClass,
            priorityLevel,
            scope,
            scopeOrig,
            clusterSelection,
            clusterOrig,
            xmlParams,
            thorSlaveIP,
            queryMainDefinition,
            dvs,avs);
        
        return raw;
    }
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
    public Boolean getAddDrilldownFields()
    {
        return addDrilldownFields;
    }
    /**
     * @param addDrilldownFields the addDrilldownFields to set
     */
    public void setAddDrilldownFields(Boolean addDrilldownFields)
    {
        this.addDrilldownFields = addDrilldownFields;
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
     * @return the _protected
     */
    public Boolean get_protected()
    {
        return _protected;
    }
    /**
     * @param _protected the _protected to set
     */
    public void set_protected(Boolean _protected)
    {
        this._protected = _protected;
    }
    /**
     * @return the protectedOrig
     */
    public Boolean getProtectedOrig()
    {
        return protectedOrig;
    }
    /**
     * @param protectedOrig the protectedOrig to set
     */
    public void setProtectedOrig(Boolean protectedOrig)
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
}
