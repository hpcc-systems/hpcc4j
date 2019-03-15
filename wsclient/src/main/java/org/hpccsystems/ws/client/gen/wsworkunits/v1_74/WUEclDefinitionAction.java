/**
 * WUEclDefinitionAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUEclDefinitionAction  implements java.io.Serializable {
    private java.lang.String[] eclDefinitions;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EclDefinitionActions actionType;

    private java.lang.String target;

    private java.lang.String remoteDali;

    private java.lang.String sourceProcess;

    private java.lang.String priority;

    private java.lang.String comment;

    private java.lang.String memoryLimit;

    private java.lang.Boolean deletePrevious;

    private java.lang.Boolean suspendPrevious;

    private java.lang.Boolean noActivate;

    private java.lang.Boolean noReload;

    private java.lang.Boolean dontCopyFiles;

    private java.lang.Boolean allowForeign;

    private java.lang.Boolean updateDfs;

    private java.lang.Boolean updateSuperfiles;

    private java.lang.Boolean updateCloneFrom;

    private java.lang.Boolean dontAppendCluster;

    private java.lang.Integer msToWait;

    private java.lang.Integer timeLimit;

    private java.lang.Integer warnTimeLimit;

    public WUEclDefinitionAction() {
    }

    public WUEclDefinitionAction(
           java.lang.String[] eclDefinitions,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EclDefinitionActions actionType,
           java.lang.String target,
           java.lang.String remoteDali,
           java.lang.String sourceProcess,
           java.lang.String priority,
           java.lang.String comment,
           java.lang.String memoryLimit,
           java.lang.Boolean deletePrevious,
           java.lang.Boolean suspendPrevious,
           java.lang.Boolean noActivate,
           java.lang.Boolean noReload,
           java.lang.Boolean dontCopyFiles,
           java.lang.Boolean allowForeign,
           java.lang.Boolean updateDfs,
           java.lang.Boolean updateSuperfiles,
           java.lang.Boolean updateCloneFrom,
           java.lang.Boolean dontAppendCluster,
           java.lang.Integer msToWait,
           java.lang.Integer timeLimit,
           java.lang.Integer warnTimeLimit) {
           this.eclDefinitions = eclDefinitions;
           this.actionType = actionType;
           this.target = target;
           this.remoteDali = remoteDali;
           this.sourceProcess = sourceProcess;
           this.priority = priority;
           this.comment = comment;
           this.memoryLimit = memoryLimit;
           this.deletePrevious = deletePrevious;
           this.suspendPrevious = suspendPrevious;
           this.noActivate = noActivate;
           this.noReload = noReload;
           this.dontCopyFiles = dontCopyFiles;
           this.allowForeign = allowForeign;
           this.updateDfs = updateDfs;
           this.updateSuperfiles = updateSuperfiles;
           this.updateCloneFrom = updateCloneFrom;
           this.dontAppendCluster = dontAppendCluster;
           this.msToWait = msToWait;
           this.timeLimit = timeLimit;
           this.warnTimeLimit = warnTimeLimit;
    }


    /**
     * Gets the eclDefinitions value for this WUEclDefinitionAction.
     * 
     * @return eclDefinitions
     */
    public java.lang.String[] getEclDefinitions() {
        return eclDefinitions;
    }


    /**
     * Sets the eclDefinitions value for this WUEclDefinitionAction.
     * 
     * @param eclDefinitions
     */
    public void setEclDefinitions(java.lang.String[] eclDefinitions) {
        this.eclDefinitions = eclDefinitions;
    }


    /**
     * Gets the actionType value for this WUEclDefinitionAction.
     * 
     * @return actionType
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EclDefinitionActions getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this WUEclDefinitionAction.
     * 
     * @param actionType
     */
    public void setActionType(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.EclDefinitionActions actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the target value for this WUEclDefinitionAction.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this WUEclDefinitionAction.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the remoteDali value for this WUEclDefinitionAction.
     * 
     * @return remoteDali
     */
    public java.lang.String getRemoteDali() {
        return remoteDali;
    }


    /**
     * Sets the remoteDali value for this WUEclDefinitionAction.
     * 
     * @param remoteDali
     */
    public void setRemoteDali(java.lang.String remoteDali) {
        this.remoteDali = remoteDali;
    }


    /**
     * Gets the sourceProcess value for this WUEclDefinitionAction.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this WUEclDefinitionAction.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the priority value for this WUEclDefinitionAction.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WUEclDefinitionAction.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the comment value for this WUEclDefinitionAction.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WUEclDefinitionAction.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the memoryLimit value for this WUEclDefinitionAction.
     * 
     * @return memoryLimit
     */
    public java.lang.String getMemoryLimit() {
        return memoryLimit;
    }


    /**
     * Sets the memoryLimit value for this WUEclDefinitionAction.
     * 
     * @param memoryLimit
     */
    public void setMemoryLimit(java.lang.String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }


    /**
     * Gets the deletePrevious value for this WUEclDefinitionAction.
     * 
     * @return deletePrevious
     */
    public java.lang.Boolean getDeletePrevious() {
        return deletePrevious;
    }


    /**
     * Sets the deletePrevious value for this WUEclDefinitionAction.
     * 
     * @param deletePrevious
     */
    public void setDeletePrevious(java.lang.Boolean deletePrevious) {
        this.deletePrevious = deletePrevious;
    }


    /**
     * Gets the suspendPrevious value for this WUEclDefinitionAction.
     * 
     * @return suspendPrevious
     */
    public java.lang.Boolean getSuspendPrevious() {
        return suspendPrevious;
    }


    /**
     * Sets the suspendPrevious value for this WUEclDefinitionAction.
     * 
     * @param suspendPrevious
     */
    public void setSuspendPrevious(java.lang.Boolean suspendPrevious) {
        this.suspendPrevious = suspendPrevious;
    }


    /**
     * Gets the noActivate value for this WUEclDefinitionAction.
     * 
     * @return noActivate
     */
    public java.lang.Boolean getNoActivate() {
        return noActivate;
    }


    /**
     * Sets the noActivate value for this WUEclDefinitionAction.
     * 
     * @param noActivate
     */
    public void setNoActivate(java.lang.Boolean noActivate) {
        this.noActivate = noActivate;
    }


    /**
     * Gets the noReload value for this WUEclDefinitionAction.
     * 
     * @return noReload
     */
    public java.lang.Boolean getNoReload() {
        return noReload;
    }


    /**
     * Sets the noReload value for this WUEclDefinitionAction.
     * 
     * @param noReload
     */
    public void setNoReload(java.lang.Boolean noReload) {
        this.noReload = noReload;
    }


    /**
     * Gets the dontCopyFiles value for this WUEclDefinitionAction.
     * 
     * @return dontCopyFiles
     */
    public java.lang.Boolean getDontCopyFiles() {
        return dontCopyFiles;
    }


    /**
     * Sets the dontCopyFiles value for this WUEclDefinitionAction.
     * 
     * @param dontCopyFiles
     */
    public void setDontCopyFiles(java.lang.Boolean dontCopyFiles) {
        this.dontCopyFiles = dontCopyFiles;
    }


    /**
     * Gets the allowForeign value for this WUEclDefinitionAction.
     * 
     * @return allowForeign
     */
    public java.lang.Boolean getAllowForeign() {
        return allowForeign;
    }


    /**
     * Sets the allowForeign value for this WUEclDefinitionAction.
     * 
     * @param allowForeign
     */
    public void setAllowForeign(java.lang.Boolean allowForeign) {
        this.allowForeign = allowForeign;
    }


    /**
     * Gets the updateDfs value for this WUEclDefinitionAction.
     * 
     * @return updateDfs
     */
    public java.lang.Boolean getUpdateDfs() {
        return updateDfs;
    }


    /**
     * Sets the updateDfs value for this WUEclDefinitionAction.
     * 
     * @param updateDfs
     */
    public void setUpdateDfs(java.lang.Boolean updateDfs) {
        this.updateDfs = updateDfs;
    }


    /**
     * Gets the updateSuperfiles value for this WUEclDefinitionAction.
     * 
     * @return updateSuperfiles
     */
    public java.lang.Boolean getUpdateSuperfiles() {
        return updateSuperfiles;
    }


    /**
     * Sets the updateSuperfiles value for this WUEclDefinitionAction.
     * 
     * @param updateSuperfiles
     */
    public void setUpdateSuperfiles(java.lang.Boolean updateSuperfiles) {
        this.updateSuperfiles = updateSuperfiles;
    }


    /**
     * Gets the updateCloneFrom value for this WUEclDefinitionAction.
     * 
     * @return updateCloneFrom
     */
    public java.lang.Boolean getUpdateCloneFrom() {
        return updateCloneFrom;
    }


    /**
     * Sets the updateCloneFrom value for this WUEclDefinitionAction.
     * 
     * @param updateCloneFrom
     */
    public void setUpdateCloneFrom(java.lang.Boolean updateCloneFrom) {
        this.updateCloneFrom = updateCloneFrom;
    }


    /**
     * Gets the dontAppendCluster value for this WUEclDefinitionAction.
     * 
     * @return dontAppendCluster
     */
    public java.lang.Boolean getDontAppendCluster() {
        return dontAppendCluster;
    }


    /**
     * Sets the dontAppendCluster value for this WUEclDefinitionAction.
     * 
     * @param dontAppendCluster
     */
    public void setDontAppendCluster(java.lang.Boolean dontAppendCluster) {
        this.dontAppendCluster = dontAppendCluster;
    }


    /**
     * Gets the msToWait value for this WUEclDefinitionAction.
     * 
     * @return msToWait
     */
    public java.lang.Integer getMsToWait() {
        return msToWait;
    }


    /**
     * Sets the msToWait value for this WUEclDefinitionAction.
     * 
     * @param msToWait
     */
    public void setMsToWait(java.lang.Integer msToWait) {
        this.msToWait = msToWait;
    }


    /**
     * Gets the timeLimit value for this WUEclDefinitionAction.
     * 
     * @return timeLimit
     */
    public java.lang.Integer getTimeLimit() {
        return timeLimit;
    }


    /**
     * Sets the timeLimit value for this WUEclDefinitionAction.
     * 
     * @param timeLimit
     */
    public void setTimeLimit(java.lang.Integer timeLimit) {
        this.timeLimit = timeLimit;
    }


    /**
     * Gets the warnTimeLimit value for this WUEclDefinitionAction.
     * 
     * @return warnTimeLimit
     */
    public java.lang.Integer getWarnTimeLimit() {
        return warnTimeLimit;
    }


    /**
     * Sets the warnTimeLimit value for this WUEclDefinitionAction.
     * 
     * @param warnTimeLimit
     */
    public void setWarnTimeLimit(java.lang.Integer warnTimeLimit) {
        this.warnTimeLimit = warnTimeLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUEclDefinitionAction)) return false;
        WUEclDefinitionAction other = (WUEclDefinitionAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eclDefinitions==null && other.getEclDefinitions()==null) || 
             (this.eclDefinitions!=null &&
              java.util.Arrays.equals(this.eclDefinitions, other.getEclDefinitions()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.remoteDali==null && other.getRemoteDali()==null) || 
             (this.remoteDali!=null &&
              this.remoteDali.equals(other.getRemoteDali()))) &&
            ((this.sourceProcess==null && other.getSourceProcess()==null) || 
             (this.sourceProcess!=null &&
              this.sourceProcess.equals(other.getSourceProcess()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.memoryLimit==null && other.getMemoryLimit()==null) || 
             (this.memoryLimit!=null &&
              this.memoryLimit.equals(other.getMemoryLimit()))) &&
            ((this.deletePrevious==null && other.getDeletePrevious()==null) || 
             (this.deletePrevious!=null &&
              this.deletePrevious.equals(other.getDeletePrevious()))) &&
            ((this.suspendPrevious==null && other.getSuspendPrevious()==null) || 
             (this.suspendPrevious!=null &&
              this.suspendPrevious.equals(other.getSuspendPrevious()))) &&
            ((this.noActivate==null && other.getNoActivate()==null) || 
             (this.noActivate!=null &&
              this.noActivate.equals(other.getNoActivate()))) &&
            ((this.noReload==null && other.getNoReload()==null) || 
             (this.noReload!=null &&
              this.noReload.equals(other.getNoReload()))) &&
            ((this.dontCopyFiles==null && other.getDontCopyFiles()==null) || 
             (this.dontCopyFiles!=null &&
              this.dontCopyFiles.equals(other.getDontCopyFiles()))) &&
            ((this.allowForeign==null && other.getAllowForeign()==null) || 
             (this.allowForeign!=null &&
              this.allowForeign.equals(other.getAllowForeign()))) &&
            ((this.updateDfs==null && other.getUpdateDfs()==null) || 
             (this.updateDfs!=null &&
              this.updateDfs.equals(other.getUpdateDfs()))) &&
            ((this.updateSuperfiles==null && other.getUpdateSuperfiles()==null) || 
             (this.updateSuperfiles!=null &&
              this.updateSuperfiles.equals(other.getUpdateSuperfiles()))) &&
            ((this.updateCloneFrom==null && other.getUpdateCloneFrom()==null) || 
             (this.updateCloneFrom!=null &&
              this.updateCloneFrom.equals(other.getUpdateCloneFrom()))) &&
            ((this.dontAppendCluster==null && other.getDontAppendCluster()==null) || 
             (this.dontAppendCluster!=null &&
              this.dontAppendCluster.equals(other.getDontAppendCluster()))) &&
            ((this.msToWait==null && other.getMsToWait()==null) || 
             (this.msToWait!=null &&
              this.msToWait.equals(other.getMsToWait()))) &&
            ((this.timeLimit==null && other.getTimeLimit()==null) || 
             (this.timeLimit!=null &&
              this.timeLimit.equals(other.getTimeLimit()))) &&
            ((this.warnTimeLimit==null && other.getWarnTimeLimit()==null) || 
             (this.warnTimeLimit!=null &&
              this.warnTimeLimit.equals(other.getWarnTimeLimit())));
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
        if (getEclDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEclDefinitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEclDefinitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getRemoteDali() != null) {
            _hashCode += getRemoteDali().hashCode();
        }
        if (getSourceProcess() != null) {
            _hashCode += getSourceProcess().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getMemoryLimit() != null) {
            _hashCode += getMemoryLimit().hashCode();
        }
        if (getDeletePrevious() != null) {
            _hashCode += getDeletePrevious().hashCode();
        }
        if (getSuspendPrevious() != null) {
            _hashCode += getSuspendPrevious().hashCode();
        }
        if (getNoActivate() != null) {
            _hashCode += getNoActivate().hashCode();
        }
        if (getNoReload() != null) {
            _hashCode += getNoReload().hashCode();
        }
        if (getDontCopyFiles() != null) {
            _hashCode += getDontCopyFiles().hashCode();
        }
        if (getAllowForeign() != null) {
            _hashCode += getAllowForeign().hashCode();
        }
        if (getUpdateDfs() != null) {
            _hashCode += getUpdateDfs().hashCode();
        }
        if (getUpdateSuperfiles() != null) {
            _hashCode += getUpdateSuperfiles().hashCode();
        }
        if (getUpdateCloneFrom() != null) {
            _hashCode += getUpdateCloneFrom().hashCode();
        }
        if (getDontAppendCluster() != null) {
            _hashCode += getDontAppendCluster().hashCode();
        }
        if (getMsToWait() != null) {
            _hashCode += getMsToWait().hashCode();
        }
        if (getTimeLimit() != null) {
            _hashCode += getTimeLimit().hashCode();
        }
        if (getWarnTimeLimit() != null) {
            _hashCode += getWarnTimeLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUEclDefinitionAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUEclDefinitionAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eclDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EclDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ActionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EclDefinitionActions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Target"));
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
        elemField.setFieldName("sourceProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("memoryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletePrevious");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DeletePrevious"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendPrevious");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuspendPrevious"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noActivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NoActivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("dontCopyFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DontCopyFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllowForeign"));
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
        elemField.setFieldName("updateSuperfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "UpdateSuperfiles"));
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
        elemField.setFieldName("dontAppendCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DontAppendCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msToWait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MsToWait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarnTimeLimit"));
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
