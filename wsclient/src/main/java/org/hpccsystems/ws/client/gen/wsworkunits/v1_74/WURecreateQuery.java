/**
 * WURecreateQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WURecreateQuery  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.String queryId;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.NamedValue[] debugValues;

    private java.lang.String destTarget;

    private java.lang.Boolean republish;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUQueryActivationMode activate;

    private java.lang.Boolean noReload;

    private java.lang.String memoryLimit;

    private org.apache.axis.types.NonNegativeInteger timeLimit;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimit;

    private java.lang.String priority;

    private java.lang.String comment;

    private java.lang.String remoteDali;

    private java.lang.Boolean dontCopyFiles;

    private java.lang.String sourceProcess;

    private java.lang.Boolean allowForeignFiles;

    private java.lang.Boolean updateDfs;

    private java.lang.Boolean updateSuperFiles;

    private java.lang.Boolean updateCloneFrom;

    private java.lang.Boolean appendCluster;

    private java.lang.Boolean includeFileErrors;

    private java.lang.Integer wait;

    public WURecreateQuery() {
    }

    public WURecreateQuery(
           java.lang.String target,
           java.lang.String queryId,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.NamedValue[] debugValues,
           java.lang.String destTarget,
           java.lang.Boolean republish,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUQueryActivationMode activate,
           java.lang.Boolean noReload,
           java.lang.String memoryLimit,
           org.apache.axis.types.NonNegativeInteger timeLimit,
           org.apache.axis.types.NonNegativeInteger warnTimeLimit,
           java.lang.String priority,
           java.lang.String comment,
           java.lang.String remoteDali,
           java.lang.Boolean dontCopyFiles,
           java.lang.String sourceProcess,
           java.lang.Boolean allowForeignFiles,
           java.lang.Boolean updateDfs,
           java.lang.Boolean updateSuperFiles,
           java.lang.Boolean updateCloneFrom,
           java.lang.Boolean appendCluster,
           java.lang.Boolean includeFileErrors,
           java.lang.Integer wait) {
           this.target = target;
           this.queryId = queryId;
           this.debugValues = debugValues;
           this.destTarget = destTarget;
           this.republish = republish;
           this.activate = activate;
           this.noReload = noReload;
           this.memoryLimit = memoryLimit;
           this.timeLimit = timeLimit;
           this.warnTimeLimit = warnTimeLimit;
           this.priority = priority;
           this.comment = comment;
           this.remoteDali = remoteDali;
           this.dontCopyFiles = dontCopyFiles;
           this.sourceProcess = sourceProcess;
           this.allowForeignFiles = allowForeignFiles;
           this.updateDfs = updateDfs;
           this.updateSuperFiles = updateSuperFiles;
           this.updateCloneFrom = updateCloneFrom;
           this.appendCluster = appendCluster;
           this.includeFileErrors = includeFileErrors;
           this.wait = wait;
    }


    /**
     * Gets the target value for this WURecreateQuery.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this WURecreateQuery.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the queryId value for this WURecreateQuery.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this WURecreateQuery.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the debugValues value for this WURecreateQuery.
     * 
     * @return debugValues
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.NamedValue[] getDebugValues() {
        return debugValues;
    }


    /**
     * Sets the debugValues value for this WURecreateQuery.
     * 
     * @param debugValues
     */
    public void setDebugValues(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.NamedValue[] debugValues) {
        this.debugValues = debugValues;
    }


    /**
     * Gets the destTarget value for this WURecreateQuery.
     * 
     * @return destTarget
     */
    public java.lang.String getDestTarget() {
        return destTarget;
    }


    /**
     * Sets the destTarget value for this WURecreateQuery.
     * 
     * @param destTarget
     */
    public void setDestTarget(java.lang.String destTarget) {
        this.destTarget = destTarget;
    }


    /**
     * Gets the republish value for this WURecreateQuery.
     * 
     * @return republish
     */
    public java.lang.Boolean getRepublish() {
        return republish;
    }


    /**
     * Sets the republish value for this WURecreateQuery.
     * 
     * @param republish
     */
    public void setRepublish(java.lang.Boolean republish) {
        this.republish = republish;
    }


    /**
     * Gets the activate value for this WURecreateQuery.
     * 
     * @return activate
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUQueryActivationMode getActivate() {
        return activate;
    }


    /**
     * Sets the activate value for this WURecreateQuery.
     * 
     * @param activate
     */
    public void setActivate(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUQueryActivationMode activate) {
        this.activate = activate;
    }


    /**
     * Gets the noReload value for this WURecreateQuery.
     * 
     * @return noReload
     */
    public java.lang.Boolean getNoReload() {
        return noReload;
    }


    /**
     * Sets the noReload value for this WURecreateQuery.
     * 
     * @param noReload
     */
    public void setNoReload(java.lang.Boolean noReload) {
        this.noReload = noReload;
    }


    /**
     * Gets the memoryLimit value for this WURecreateQuery.
     * 
     * @return memoryLimit
     */
    public java.lang.String getMemoryLimit() {
        return memoryLimit;
    }


    /**
     * Sets the memoryLimit value for this WURecreateQuery.
     * 
     * @param memoryLimit
     */
    public void setMemoryLimit(java.lang.String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }


    /**
     * Gets the timeLimit value for this WURecreateQuery.
     * 
     * @return timeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getTimeLimit() {
        return timeLimit;
    }


    /**
     * Sets the timeLimit value for this WURecreateQuery.
     * 
     * @param timeLimit
     */
    public void setTimeLimit(org.apache.axis.types.NonNegativeInteger timeLimit) {
        this.timeLimit = timeLimit;
    }


    /**
     * Gets the warnTimeLimit value for this WURecreateQuery.
     * 
     * @return warnTimeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getWarnTimeLimit() {
        return warnTimeLimit;
    }


    /**
     * Sets the warnTimeLimit value for this WURecreateQuery.
     * 
     * @param warnTimeLimit
     */
    public void setWarnTimeLimit(org.apache.axis.types.NonNegativeInteger warnTimeLimit) {
        this.warnTimeLimit = warnTimeLimit;
    }


    /**
     * Gets the priority value for this WURecreateQuery.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WURecreateQuery.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the comment value for this WURecreateQuery.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WURecreateQuery.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the remoteDali value for this WURecreateQuery.
     * 
     * @return remoteDali
     */
    public java.lang.String getRemoteDali() {
        return remoteDali;
    }


    /**
     * Sets the remoteDali value for this WURecreateQuery.
     * 
     * @param remoteDali
     */
    public void setRemoteDali(java.lang.String remoteDali) {
        this.remoteDali = remoteDali;
    }


    /**
     * Gets the dontCopyFiles value for this WURecreateQuery.
     * 
     * @return dontCopyFiles
     */
    public java.lang.Boolean getDontCopyFiles() {
        return dontCopyFiles;
    }


    /**
     * Sets the dontCopyFiles value for this WURecreateQuery.
     * 
     * @param dontCopyFiles
     */
    public void setDontCopyFiles(java.lang.Boolean dontCopyFiles) {
        this.dontCopyFiles = dontCopyFiles;
    }


    /**
     * Gets the sourceProcess value for this WURecreateQuery.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this WURecreateQuery.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the allowForeignFiles value for this WURecreateQuery.
     * 
     * @return allowForeignFiles
     */
    public java.lang.Boolean getAllowForeignFiles() {
        return allowForeignFiles;
    }


    /**
     * Sets the allowForeignFiles value for this WURecreateQuery.
     * 
     * @param allowForeignFiles
     */
    public void setAllowForeignFiles(java.lang.Boolean allowForeignFiles) {
        this.allowForeignFiles = allowForeignFiles;
    }


    /**
     * Gets the updateDfs value for this WURecreateQuery.
     * 
     * @return updateDfs
     */
    public java.lang.Boolean getUpdateDfs() {
        return updateDfs;
    }


    /**
     * Sets the updateDfs value for this WURecreateQuery.
     * 
     * @param updateDfs
     */
    public void setUpdateDfs(java.lang.Boolean updateDfs) {
        this.updateDfs = updateDfs;
    }


    /**
     * Gets the updateSuperFiles value for this WURecreateQuery.
     * 
     * @return updateSuperFiles
     */
    public java.lang.Boolean getUpdateSuperFiles() {
        return updateSuperFiles;
    }


    /**
     * Sets the updateSuperFiles value for this WURecreateQuery.
     * 
     * @param updateSuperFiles
     */
    public void setUpdateSuperFiles(java.lang.Boolean updateSuperFiles) {
        this.updateSuperFiles = updateSuperFiles;
    }


    /**
     * Gets the updateCloneFrom value for this WURecreateQuery.
     * 
     * @return updateCloneFrom
     */
    public java.lang.Boolean getUpdateCloneFrom() {
        return updateCloneFrom;
    }


    /**
     * Sets the updateCloneFrom value for this WURecreateQuery.
     * 
     * @param updateCloneFrom
     */
    public void setUpdateCloneFrom(java.lang.Boolean updateCloneFrom) {
        this.updateCloneFrom = updateCloneFrom;
    }


    /**
     * Gets the appendCluster value for this WURecreateQuery.
     * 
     * @return appendCluster
     */
    public java.lang.Boolean getAppendCluster() {
        return appendCluster;
    }


    /**
     * Sets the appendCluster value for this WURecreateQuery.
     * 
     * @param appendCluster
     */
    public void setAppendCluster(java.lang.Boolean appendCluster) {
        this.appendCluster = appendCluster;
    }


    /**
     * Gets the includeFileErrors value for this WURecreateQuery.
     * 
     * @return includeFileErrors
     */
    public java.lang.Boolean getIncludeFileErrors() {
        return includeFileErrors;
    }


    /**
     * Sets the includeFileErrors value for this WURecreateQuery.
     * 
     * @param includeFileErrors
     */
    public void setIncludeFileErrors(java.lang.Boolean includeFileErrors) {
        this.includeFileErrors = includeFileErrors;
    }


    /**
     * Gets the wait value for this WURecreateQuery.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this WURecreateQuery.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WURecreateQuery)) return false;
        WURecreateQuery other = (WURecreateQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.debugValues==null && other.getDebugValues()==null) || 
             (this.debugValues!=null &&
              java.util.Arrays.equals(this.debugValues, other.getDebugValues()))) &&
            ((this.destTarget==null && other.getDestTarget()==null) || 
             (this.destTarget!=null &&
              this.destTarget.equals(other.getDestTarget()))) &&
            ((this.republish==null && other.getRepublish()==null) || 
             (this.republish!=null &&
              this.republish.equals(other.getRepublish()))) &&
            ((this.activate==null && other.getActivate()==null) || 
             (this.activate!=null &&
              this.activate.equals(other.getActivate()))) &&
            ((this.noReload==null && other.getNoReload()==null) || 
             (this.noReload!=null &&
              this.noReload.equals(other.getNoReload()))) &&
            ((this.memoryLimit==null && other.getMemoryLimit()==null) || 
             (this.memoryLimit!=null &&
              this.memoryLimit.equals(other.getMemoryLimit()))) &&
            ((this.timeLimit==null && other.getTimeLimit()==null) || 
             (this.timeLimit!=null &&
              this.timeLimit.equals(other.getTimeLimit()))) &&
            ((this.warnTimeLimit==null && other.getWarnTimeLimit()==null) || 
             (this.warnTimeLimit!=null &&
              this.warnTimeLimit.equals(other.getWarnTimeLimit()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.remoteDali==null && other.getRemoteDali()==null) || 
             (this.remoteDali!=null &&
              this.remoteDali.equals(other.getRemoteDali()))) &&
            ((this.dontCopyFiles==null && other.getDontCopyFiles()==null) || 
             (this.dontCopyFiles!=null &&
              this.dontCopyFiles.equals(other.getDontCopyFiles()))) &&
            ((this.sourceProcess==null && other.getSourceProcess()==null) || 
             (this.sourceProcess!=null &&
              this.sourceProcess.equals(other.getSourceProcess()))) &&
            ((this.allowForeignFiles==null && other.getAllowForeignFiles()==null) || 
             (this.allowForeignFiles!=null &&
              this.allowForeignFiles.equals(other.getAllowForeignFiles()))) &&
            ((this.updateDfs==null && other.getUpdateDfs()==null) || 
             (this.updateDfs!=null &&
              this.updateDfs.equals(other.getUpdateDfs()))) &&
            ((this.updateSuperFiles==null && other.getUpdateSuperFiles()==null) || 
             (this.updateSuperFiles!=null &&
              this.updateSuperFiles.equals(other.getUpdateSuperFiles()))) &&
            ((this.updateCloneFrom==null && other.getUpdateCloneFrom()==null) || 
             (this.updateCloneFrom!=null &&
              this.updateCloneFrom.equals(other.getUpdateCloneFrom()))) &&
            ((this.appendCluster==null && other.getAppendCluster()==null) || 
             (this.appendCluster!=null &&
              this.appendCluster.equals(other.getAppendCluster()))) &&
            ((this.includeFileErrors==null && other.getIncludeFileErrors()==null) || 
             (this.includeFileErrors!=null &&
              this.includeFileErrors.equals(other.getIncludeFileErrors()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
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
        if (getDestTarget() != null) {
            _hashCode += getDestTarget().hashCode();
        }
        if (getRepublish() != null) {
            _hashCode += getRepublish().hashCode();
        }
        if (getActivate() != null) {
            _hashCode += getActivate().hashCode();
        }
        if (getNoReload() != null) {
            _hashCode += getNoReload().hashCode();
        }
        if (getMemoryLimit() != null) {
            _hashCode += getMemoryLimit().hashCode();
        }
        if (getTimeLimit() != null) {
            _hashCode += getTimeLimit().hashCode();
        }
        if (getWarnTimeLimit() != null) {
            _hashCode += getWarnTimeLimit().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getRemoteDali() != null) {
            _hashCode += getRemoteDali().hashCode();
        }
        if (getDontCopyFiles() != null) {
            _hashCode += getDontCopyFiles().hashCode();
        }
        if (getSourceProcess() != null) {
            _hashCode += getSourceProcess().hashCode();
        }
        if (getAllowForeignFiles() != null) {
            _hashCode += getAllowForeignFiles().hashCode();
        }
        if (getUpdateDfs() != null) {
            _hashCode += getUpdateDfs().hashCode();
        }
        if (getUpdateSuperFiles() != null) {
            _hashCode += getUpdateSuperFiles().hashCode();
        }
        if (getUpdateCloneFrom() != null) {
            _hashCode += getUpdateCloneFrom().hashCode();
        }
        if (getAppendCluster() != null) {
            _hashCode += getAppendCluster().hashCode();
        }
        if (getIncludeFileErrors() != null) {
            _hashCode += getIncludeFileErrors().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WURecreateQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WURecreateQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debugValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DestTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("republish");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Republish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryActivationMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noReload");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NoReload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarnTimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteDali");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RemoteDali"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontCopyFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DontCopyFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowForeignFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllowForeignFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDfs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "UpdateDfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateSuperFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "UpdateSuperFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateCloneFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "UpdateCloneFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AppendCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeFileErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeFileErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
