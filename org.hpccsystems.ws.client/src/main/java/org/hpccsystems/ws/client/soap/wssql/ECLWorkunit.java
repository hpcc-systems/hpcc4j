/**
 * ECLWorkunit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class ECLWorkunit  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String owner;

    private java.lang.String cluster;

    private java.lang.String jobname;

    private java.lang.String queue;

    private java.lang.Integer stateID;

    private java.lang.String state;

    private java.lang.String stateEx;

    private java.lang.String description;

    private java.lang.Boolean _protected;

    private java.lang.Boolean active;

    private java.lang.Integer action;

    private java.util.Calendar dateTimeScheduled;

    private java.lang.Integer priorityClass;

    private java.lang.Integer priorityLevel;

    private java.lang.String scope;

    private java.lang.String snapshot;

    private java.lang.Integer resultLimit;

    private org.hpccsystems.ws.client.soap.wssql.ECLQuery query;

    private org.hpccsystems.ws.client.soap.wssql.ECLException[] exceptions;

    private org.hpccsystems.ws.client.soap.wssql.ECLGraph[] graphs;

    private org.hpccsystems.ws.client.soap.wssql.ECLSourceFile[] sourceFiles;

    private org.hpccsystems.ws.client.soap.wssql.ECLResult[] results;

    private org.hpccsystems.ws.client.soap.wssql.ECLResult[] variables;

    private org.hpccsystems.ws.client.soap.wssql.ECLTimer[] timers;

    private org.hpccsystems.ws.client.soap.wssql.DebugValue[] debugValues;

    private org.hpccsystems.ws.client.soap.wssql.ApplicationValue[] applicationValues;

    public ECLWorkunit() {
    }

    public ECLWorkunit(
           java.lang.String wuid,
           java.lang.String owner,
           java.lang.String cluster,
           java.lang.String jobname,
           java.lang.String queue,
           java.lang.Integer stateID,
           java.lang.String state,
           java.lang.String stateEx,
           java.lang.String description,
           java.lang.Boolean _protected,
           java.lang.Boolean active,
           java.lang.Integer action,
           java.util.Calendar dateTimeScheduled,
           java.lang.Integer priorityClass,
           java.lang.Integer priorityLevel,
           java.lang.String scope,
           java.lang.String snapshot,
           java.lang.Integer resultLimit,
           org.hpccsystems.ws.client.soap.wssql.ECLQuery query,
           org.hpccsystems.ws.client.soap.wssql.ECLException[] exceptions,
           org.hpccsystems.ws.client.soap.wssql.ECLGraph[] graphs,
           org.hpccsystems.ws.client.soap.wssql.ECLSourceFile[] sourceFiles,
           org.hpccsystems.ws.client.soap.wssql.ECLResult[] results,
           org.hpccsystems.ws.client.soap.wssql.ECLResult[] variables,
           org.hpccsystems.ws.client.soap.wssql.ECLTimer[] timers,
           org.hpccsystems.ws.client.soap.wssql.DebugValue[] debugValues,
           org.hpccsystems.ws.client.soap.wssql.ApplicationValue[] applicationValues) {
           this.wuid = wuid;
           this.owner = owner;
           this.cluster = cluster;
           this.jobname = jobname;
           this.queue = queue;
           this.stateID = stateID;
           this.state = state;
           this.stateEx = stateEx;
           this.description = description;
           this._protected = _protected;
           this.active = active;
           this.action = action;
           this.dateTimeScheduled = dateTimeScheduled;
           this.priorityClass = priorityClass;
           this.priorityLevel = priorityLevel;
           this.scope = scope;
           this.snapshot = snapshot;
           this.resultLimit = resultLimit;
           this.query = query;
           this.exceptions = exceptions;
           this.graphs = graphs;
           this.sourceFiles = sourceFiles;
           this.results = results;
           this.variables = variables;
           this.timers = timers;
           this.debugValues = debugValues;
           this.applicationValues = applicationValues;
    }


    /**
     * Gets the wuid value for this ECLWorkunit.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this ECLWorkunit.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the owner value for this ECLWorkunit.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ECLWorkunit.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the cluster value for this ECLWorkunit.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this ECLWorkunit.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the jobname value for this ECLWorkunit.
     * 
     * @return jobname
     */
    public java.lang.String getJobname() {
        return jobname;
    }


    /**
     * Sets the jobname value for this ECLWorkunit.
     * 
     * @param jobname
     */
    public void setJobname(java.lang.String jobname) {
        this.jobname = jobname;
    }


    /**
     * Gets the queue value for this ECLWorkunit.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this ECLWorkunit.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the stateID value for this ECLWorkunit.
     * 
     * @return stateID
     */
    public java.lang.Integer getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this ECLWorkunit.
     * 
     * @param stateID
     */
    public void setStateID(java.lang.Integer stateID) {
        this.stateID = stateID;
    }


    /**
     * Gets the state value for this ECLWorkunit.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ECLWorkunit.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stateEx value for this ECLWorkunit.
     * 
     * @return stateEx
     */
    public java.lang.String getStateEx() {
        return stateEx;
    }


    /**
     * Sets the stateEx value for this ECLWorkunit.
     * 
     * @param stateEx
     */
    public void setStateEx(java.lang.String stateEx) {
        this.stateEx = stateEx;
    }


    /**
     * Gets the description value for this ECLWorkunit.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ECLWorkunit.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the _protected value for this ECLWorkunit.
     * 
     * @return _protected
     */
    public java.lang.Boolean get_protected() {
        return _protected;
    }


    /**
     * Sets the _protected value for this ECLWorkunit.
     * 
     * @param _protected
     */
    public void set_protected(java.lang.Boolean _protected) {
        this._protected = _protected;
    }


    /**
     * Gets the active value for this ECLWorkunit.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this ECLWorkunit.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the action value for this ECLWorkunit.
     * 
     * @return action
     */
    public java.lang.Integer getAction() {
        return action;
    }


    /**
     * Sets the action value for this ECLWorkunit.
     * 
     * @param action
     */
    public void setAction(java.lang.Integer action) {
        this.action = action;
    }


    /**
     * Gets the dateTimeScheduled value for this ECLWorkunit.
     * 
     * @return dateTimeScheduled
     */
    public java.util.Calendar getDateTimeScheduled() {
        return dateTimeScheduled;
    }


    /**
     * Sets the dateTimeScheduled value for this ECLWorkunit.
     * 
     * @param dateTimeScheduled
     */
    public void setDateTimeScheduled(java.util.Calendar dateTimeScheduled) {
        this.dateTimeScheduled = dateTimeScheduled;
    }


    /**
     * Gets the priorityClass value for this ECLWorkunit.
     * 
     * @return priorityClass
     */
    public java.lang.Integer getPriorityClass() {
        return priorityClass;
    }


    /**
     * Sets the priorityClass value for this ECLWorkunit.
     * 
     * @param priorityClass
     */
    public void setPriorityClass(java.lang.Integer priorityClass) {
        this.priorityClass = priorityClass;
    }


    /**
     * Gets the priorityLevel value for this ECLWorkunit.
     * 
     * @return priorityLevel
     */
    public java.lang.Integer getPriorityLevel() {
        return priorityLevel;
    }


    /**
     * Sets the priorityLevel value for this ECLWorkunit.
     * 
     * @param priorityLevel
     */
    public void setPriorityLevel(java.lang.Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }


    /**
     * Gets the scope value for this ECLWorkunit.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this ECLWorkunit.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the snapshot value for this ECLWorkunit.
     * 
     * @return snapshot
     */
    public java.lang.String getSnapshot() {
        return snapshot;
    }


    /**
     * Sets the snapshot value for this ECLWorkunit.
     * 
     * @param snapshot
     */
    public void setSnapshot(java.lang.String snapshot) {
        this.snapshot = snapshot;
    }


    /**
     * Gets the resultLimit value for this ECLWorkunit.
     * 
     * @return resultLimit
     */
    public java.lang.Integer getResultLimit() {
        return resultLimit;
    }


    /**
     * Sets the resultLimit value for this ECLWorkunit.
     * 
     * @param resultLimit
     */
    public void setResultLimit(java.lang.Integer resultLimit) {
        this.resultLimit = resultLimit;
    }


    /**
     * Gets the query value for this ECLWorkunit.
     * 
     * @return query
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLQuery getQuery() {
        return query;
    }


    /**
     * Sets the query value for this ECLWorkunit.
     * 
     * @param query
     */
    public void setQuery(org.hpccsystems.ws.client.soap.wssql.ECLQuery query) {
        this.query = query;
    }


    /**
     * Gets the exceptions value for this ECLWorkunit.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLException[] getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ECLWorkunit.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.soap.wssql.ECLException[] exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the graphs value for this ECLWorkunit.
     * 
     * @return graphs
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLGraph[] getGraphs() {
        return graphs;
    }


    /**
     * Sets the graphs value for this ECLWorkunit.
     * 
     * @param graphs
     */
    public void setGraphs(org.hpccsystems.ws.client.soap.wssql.ECLGraph[] graphs) {
        this.graphs = graphs;
    }


    /**
     * Gets the sourceFiles value for this ECLWorkunit.
     * 
     * @return sourceFiles
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLSourceFile[] getSourceFiles() {
        return sourceFiles;
    }


    /**
     * Sets the sourceFiles value for this ECLWorkunit.
     * 
     * @param sourceFiles
     */
    public void setSourceFiles(org.hpccsystems.ws.client.soap.wssql.ECLSourceFile[] sourceFiles) {
        this.sourceFiles = sourceFiles;
    }


    /**
     * Gets the results value for this ECLWorkunit.
     * 
     * @return results
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLResult[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this ECLWorkunit.
     * 
     * @param results
     */
    public void setResults(org.hpccsystems.ws.client.soap.wssql.ECLResult[] results) {
        this.results = results;
    }


    /**
     * Gets the variables value for this ECLWorkunit.
     * 
     * @return variables
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLResult[] getVariables() {
        return variables;
    }


    /**
     * Sets the variables value for this ECLWorkunit.
     * 
     * @param variables
     */
    public void setVariables(org.hpccsystems.ws.client.soap.wssql.ECLResult[] variables) {
        this.variables = variables;
    }


    /**
     * Gets the timers value for this ECLWorkunit.
     * 
     * @return timers
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLTimer[] getTimers() {
        return timers;
    }


    /**
     * Sets the timers value for this ECLWorkunit.
     * 
     * @param timers
     */
    public void setTimers(org.hpccsystems.ws.client.soap.wssql.ECLTimer[] timers) {
        this.timers = timers;
    }


    /**
     * Gets the debugValues value for this ECLWorkunit.
     * 
     * @return debugValues
     */
    public org.hpccsystems.ws.client.soap.wssql.DebugValue[] getDebugValues() {
        return debugValues;
    }


    /**
     * Sets the debugValues value for this ECLWorkunit.
     * 
     * @param debugValues
     */
    public void setDebugValues(org.hpccsystems.ws.client.soap.wssql.DebugValue[] debugValues) {
        this.debugValues = debugValues;
    }


    /**
     * Gets the applicationValues value for this ECLWorkunit.
     * 
     * @return applicationValues
     */
    public org.hpccsystems.ws.client.soap.wssql.ApplicationValue[] getApplicationValues() {
        return applicationValues;
    }


    /**
     * Sets the applicationValues value for this ECLWorkunit.
     * 
     * @param applicationValues
     */
    public void setApplicationValues(org.hpccsystems.ws.client.soap.wssql.ApplicationValue[] applicationValues) {
        this.applicationValues = applicationValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ECLWorkunit)) return false;
        ECLWorkunit other = (ECLWorkunit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.jobname==null && other.getJobname()==null) || 
             (this.jobname!=null &&
              this.jobname.equals(other.getJobname()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.stateID==null && other.getStateID()==null) || 
             (this.stateID!=null &&
              this.stateID.equals(other.getStateID()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateEx==null && other.getStateEx()==null) || 
             (this.stateEx!=null &&
              this.stateEx.equals(other.getStateEx()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this._protected==null && other.get_protected()==null) || 
             (this._protected!=null &&
              this._protected.equals(other.get_protected()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.dateTimeScheduled==null && other.getDateTimeScheduled()==null) || 
             (this.dateTimeScheduled!=null &&
              this.dateTimeScheduled.equals(other.getDateTimeScheduled()))) &&
            ((this.priorityClass==null && other.getPriorityClass()==null) || 
             (this.priorityClass!=null &&
              this.priorityClass.equals(other.getPriorityClass()))) &&
            ((this.priorityLevel==null && other.getPriorityLevel()==null) || 
             (this.priorityLevel!=null &&
              this.priorityLevel.equals(other.getPriorityLevel()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.snapshot==null && other.getSnapshot()==null) || 
             (this.snapshot!=null &&
              this.snapshot.equals(other.getSnapshot()))) &&
            ((this.resultLimit==null && other.getResultLimit()==null) || 
             (this.resultLimit!=null &&
              this.resultLimit.equals(other.getResultLimit()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              java.util.Arrays.equals(this.exceptions, other.getExceptions()))) &&
            ((this.graphs==null && other.getGraphs()==null) || 
             (this.graphs!=null &&
              java.util.Arrays.equals(this.graphs, other.getGraphs()))) &&
            ((this.sourceFiles==null && other.getSourceFiles()==null) || 
             (this.sourceFiles!=null &&
              java.util.Arrays.equals(this.sourceFiles, other.getSourceFiles()))) &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            ((this.variables==null && other.getVariables()==null) || 
             (this.variables!=null &&
              java.util.Arrays.equals(this.variables, other.getVariables()))) &&
            ((this.timers==null && other.getTimers()==null) || 
             (this.timers!=null &&
              java.util.Arrays.equals(this.timers, other.getTimers()))) &&
            ((this.debugValues==null && other.getDebugValues()==null) || 
             (this.debugValues!=null &&
              java.util.Arrays.equals(this.debugValues, other.getDebugValues()))) &&
            ((this.applicationValues==null && other.getApplicationValues()==null) || 
             (this.applicationValues!=null &&
              java.util.Arrays.equals(this.applicationValues, other.getApplicationValues())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getJobname() != null) {
            _hashCode += getJobname().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getStateID() != null) {
            _hashCode += getStateID().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateEx() != null) {
            _hashCode += getStateEx().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (get_protected() != null) {
            _hashCode += get_protected().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getDateTimeScheduled() != null) {
            _hashCode += getDateTimeScheduled().hashCode();
        }
        if (getPriorityClass() != null) {
            _hashCode += getPriorityClass().hashCode();
        }
        if (getPriorityLevel() != null) {
            _hashCode += getPriorityLevel().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getSnapshot() != null) {
            _hashCode += getSnapshot().hashCode();
        }
        if (getResultLimit() != null) {
            _hashCode += getResultLimit().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getExceptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExceptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExceptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGraphs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGraphs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGraphs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebugValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebugValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebugValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicationValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ECLWorkunit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLWorkunit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Jobname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "StateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "StateEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_protected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Protected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DateTimeScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PriorityClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PriorityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Snapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLException"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Graphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SourceFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSourceFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLSourceFile"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Results"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variables");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Variables"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Timers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLTimer"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debugValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DebugValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DebugValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DebugValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ApplicationValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ApplicationValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ApplicationValue"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
