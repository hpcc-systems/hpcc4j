/**
 * WUPublishWorkunit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUPublishWorkunit  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String cluster;

    private java.lang.String jobName;

    private java.lang.Integer activate;

    private java.lang.Boolean notifyCluster;

    private java.lang.Integer wait;

    private java.lang.Boolean noReload;

    private java.lang.Boolean updateWorkUnitName;

    private java.lang.String memoryLimit;

    private org.apache.axis.types.NonNegativeInteger timeLimit;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimit;

    private java.lang.String priority;

    private java.lang.String remoteDali;

    private java.lang.String comment;

    private java.lang.Boolean dontCopyFiles;

    private java.lang.String sourceProcess;

    private java.lang.Boolean allowForeignFiles;

    private java.lang.Boolean updateDfs;

    public WUPublishWorkunit() {
    }

    public WUPublishWorkunit(
           java.lang.String wuid,
           java.lang.String cluster,
           java.lang.String jobName,
           java.lang.Integer activate,
           java.lang.Boolean notifyCluster,
           java.lang.Integer wait,
           java.lang.Boolean noReload,
           java.lang.Boolean updateWorkUnitName,
           java.lang.String memoryLimit,
           org.apache.axis.types.NonNegativeInteger timeLimit,
           org.apache.axis.types.NonNegativeInteger warnTimeLimit,
           java.lang.String priority,
           java.lang.String remoteDali,
           java.lang.String comment,
           java.lang.Boolean dontCopyFiles,
           java.lang.String sourceProcess,
           java.lang.Boolean allowForeignFiles,
           java.lang.Boolean updateDfs) {
           this.wuid = wuid;
           this.cluster = cluster;
           this.jobName = jobName;
           this.activate = activate;
           this.notifyCluster = notifyCluster;
           this.wait = wait;
           this.noReload = noReload;
           this.updateWorkUnitName = updateWorkUnitName;
           this.memoryLimit = memoryLimit;
           this.timeLimit = timeLimit;
           this.warnTimeLimit = warnTimeLimit;
           this.priority = priority;
           this.remoteDali = remoteDali;
           this.comment = comment;
           this.dontCopyFiles = dontCopyFiles;
           this.sourceProcess = sourceProcess;
           this.allowForeignFiles = allowForeignFiles;
           this.updateDfs = updateDfs;
    }


    /**
     * Gets the wuid value for this WUPublishWorkunit.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUPublishWorkunit.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the cluster value for this WUPublishWorkunit.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WUPublishWorkunit.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the jobName value for this WUPublishWorkunit.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this WUPublishWorkunit.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the activate value for this WUPublishWorkunit.
     * 
     * @return activate
     */
    public java.lang.Integer getActivate() {
        return activate;
    }


    /**
     * Sets the activate value for this WUPublishWorkunit.
     * 
     * @param activate
     */
    public void setActivate(java.lang.Integer activate) {
        this.activate = activate;
    }


    /**
     * Gets the notifyCluster value for this WUPublishWorkunit.
     * 
     * @return notifyCluster
     */
    public java.lang.Boolean getNotifyCluster() {
        return notifyCluster;
    }


    /**
     * Sets the notifyCluster value for this WUPublishWorkunit.
     * 
     * @param notifyCluster
     */
    public void setNotifyCluster(java.lang.Boolean notifyCluster) {
        this.notifyCluster = notifyCluster;
    }


    /**
     * Gets the wait value for this WUPublishWorkunit.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this WUPublishWorkunit.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }


    /**
     * Gets the noReload value for this WUPublishWorkunit.
     * 
     * @return noReload
     */
    public java.lang.Boolean getNoReload() {
        return noReload;
    }


    /**
     * Sets the noReload value for this WUPublishWorkunit.
     * 
     * @param noReload
     */
    public void setNoReload(java.lang.Boolean noReload) {
        this.noReload = noReload;
    }


    /**
     * Gets the updateWorkUnitName value for this WUPublishWorkunit.
     * 
     * @return updateWorkUnitName
     */
    public java.lang.Boolean getUpdateWorkUnitName() {
        return updateWorkUnitName;
    }


    /**
     * Sets the updateWorkUnitName value for this WUPublishWorkunit.
     * 
     * @param updateWorkUnitName
     */
    public void setUpdateWorkUnitName(java.lang.Boolean updateWorkUnitName) {
        this.updateWorkUnitName = updateWorkUnitName;
    }


    /**
     * Gets the memoryLimit value for this WUPublishWorkunit.
     * 
     * @return memoryLimit
     */
    public java.lang.String getMemoryLimit() {
        return memoryLimit;
    }


    /**
     * Sets the memoryLimit value for this WUPublishWorkunit.
     * 
     * @param memoryLimit
     */
    public void setMemoryLimit(java.lang.String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }


    /**
     * Gets the timeLimit value for this WUPublishWorkunit.
     * 
     * @return timeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getTimeLimit() {
        return timeLimit;
    }


    /**
     * Sets the timeLimit value for this WUPublishWorkunit.
     * 
     * @param timeLimit
     */
    public void setTimeLimit(org.apache.axis.types.NonNegativeInteger timeLimit) {
        this.timeLimit = timeLimit;
    }


    /**
     * Gets the warnTimeLimit value for this WUPublishWorkunit.
     * 
     * @return warnTimeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getWarnTimeLimit() {
        return warnTimeLimit;
    }


    /**
     * Sets the warnTimeLimit value for this WUPublishWorkunit.
     * 
     * @param warnTimeLimit
     */
    public void setWarnTimeLimit(org.apache.axis.types.NonNegativeInteger warnTimeLimit) {
        this.warnTimeLimit = warnTimeLimit;
    }


    /**
     * Gets the priority value for this WUPublishWorkunit.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WUPublishWorkunit.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the remoteDali value for this WUPublishWorkunit.
     * 
     * @return remoteDali
     */
    public java.lang.String getRemoteDali() {
        return remoteDali;
    }


    /**
     * Sets the remoteDali value for this WUPublishWorkunit.
     * 
     * @param remoteDali
     */
    public void setRemoteDali(java.lang.String remoteDali) {
        this.remoteDali = remoteDali;
    }


    /**
     * Gets the comment value for this WUPublishWorkunit.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WUPublishWorkunit.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the dontCopyFiles value for this WUPublishWorkunit.
     * 
     * @return dontCopyFiles
     */
    public java.lang.Boolean getDontCopyFiles() {
        return dontCopyFiles;
    }


    /**
     * Sets the dontCopyFiles value for this WUPublishWorkunit.
     * 
     * @param dontCopyFiles
     */
    public void setDontCopyFiles(java.lang.Boolean dontCopyFiles) {
        this.dontCopyFiles = dontCopyFiles;
    }


    /**
     * Gets the sourceProcess value for this WUPublishWorkunit.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this WUPublishWorkunit.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the allowForeignFiles value for this WUPublishWorkunit.
     * 
     * @return allowForeignFiles
     */
    public java.lang.Boolean getAllowForeignFiles() {
        return allowForeignFiles;
    }


    /**
     * Sets the allowForeignFiles value for this WUPublishWorkunit.
     * 
     * @param allowForeignFiles
     */
    public void setAllowForeignFiles(java.lang.Boolean allowForeignFiles) {
        this.allowForeignFiles = allowForeignFiles;
    }


    /**
     * Gets the updateDfs value for this WUPublishWorkunit.
     * 
     * @return updateDfs
     */
    public java.lang.Boolean getUpdateDfs() {
        return updateDfs;
    }


    /**
     * Sets the updateDfs value for this WUPublishWorkunit.
     * 
     * @param updateDfs
     */
    public void setUpdateDfs(java.lang.Boolean updateDfs) {
        this.updateDfs = updateDfs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUPublishWorkunit)) return false;
        WUPublishWorkunit other = (WUPublishWorkunit) obj;
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
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.activate==null && other.getActivate()==null) || 
             (this.activate!=null &&
              this.activate.equals(other.getActivate()))) &&
            ((this.notifyCluster==null && other.getNotifyCluster()==null) || 
             (this.notifyCluster!=null &&
              this.notifyCluster.equals(other.getNotifyCluster()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait()))) &&
            ((this.noReload==null && other.getNoReload()==null) || 
             (this.noReload!=null &&
              this.noReload.equals(other.getNoReload()))) &&
            ((this.updateWorkUnitName==null && other.getUpdateWorkUnitName()==null) || 
             (this.updateWorkUnitName!=null &&
              this.updateWorkUnitName.equals(other.getUpdateWorkUnitName()))) &&
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
            ((this.remoteDali==null && other.getRemoteDali()==null) || 
             (this.remoteDali!=null &&
              this.remoteDali.equals(other.getRemoteDali()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
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
              this.updateDfs.equals(other.getUpdateDfs())));
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
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getActivate() != null) {
            _hashCode += getActivate().hashCode();
        }
        if (getNotifyCluster() != null) {
            _hashCode += getNotifyCluster().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        if (getNoReload() != null) {
            _hashCode += getNoReload().hashCode();
        }
        if (getUpdateWorkUnitName() != null) {
            _hashCode += getUpdateWorkUnitName().hashCode();
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
        if (getRemoteDali() != null) {
            _hashCode += getRemoteDali().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUPublishWorkunit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NotifyCluster"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noReload");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NoReload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateWorkUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "UpdateWorkUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "memoryLimit"));
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
        elemField.setFieldName("remoteDali");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RemoteDali"));
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
