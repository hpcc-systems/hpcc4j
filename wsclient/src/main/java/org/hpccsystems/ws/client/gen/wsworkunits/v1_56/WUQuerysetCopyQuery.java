/**
 * WUQuerysetCopyQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUQuerysetCopyQuery  implements java.io.Serializable {
    private java.lang.String source;

    private java.lang.String target;

    private java.lang.String cluster;

    private java.lang.String daliServer;

    private java.lang.Integer activate;

    private java.lang.Boolean overwrite;

    private java.lang.Boolean dontCopyFiles;

    private java.lang.Integer wait;

    private java.lang.Boolean noReload;

    private java.lang.String memoryLimit;

    private org.apache.axis.types.NonNegativeInteger timeLimit;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimit;

    private java.lang.String priority;

    private java.lang.String comment;

    private java.lang.String sourceProcess;

    private java.lang.String destName;

    private java.lang.Boolean allowForeignFiles;

    public WUQuerysetCopyQuery() {
    }

    public WUQuerysetCopyQuery(
           java.lang.String source,
           java.lang.String target,
           java.lang.String cluster,
           java.lang.String daliServer,
           java.lang.Integer activate,
           java.lang.Boolean overwrite,
           java.lang.Boolean dontCopyFiles,
           java.lang.Integer wait,
           java.lang.Boolean noReload,
           java.lang.String memoryLimit,
           org.apache.axis.types.NonNegativeInteger timeLimit,
           org.apache.axis.types.NonNegativeInteger warnTimeLimit,
           java.lang.String priority,
           java.lang.String comment,
           java.lang.String sourceProcess,
           java.lang.String destName,
           java.lang.Boolean allowForeignFiles) {
           this.source = source;
           this.target = target;
           this.cluster = cluster;
           this.daliServer = daliServer;
           this.activate = activate;
           this.overwrite = overwrite;
           this.dontCopyFiles = dontCopyFiles;
           this.wait = wait;
           this.noReload = noReload;
           this.memoryLimit = memoryLimit;
           this.timeLimit = timeLimit;
           this.warnTimeLimit = warnTimeLimit;
           this.priority = priority;
           this.comment = comment;
           this.sourceProcess = sourceProcess;
           this.destName = destName;
           this.allowForeignFiles = allowForeignFiles;
    }


    /**
     * Gets the source value for this WUQuerysetCopyQuery.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this WUQuerysetCopyQuery.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the target value for this WUQuerysetCopyQuery.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this WUQuerysetCopyQuery.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the cluster value for this WUQuerysetCopyQuery.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WUQuerysetCopyQuery.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the daliServer value for this WUQuerysetCopyQuery.
     * 
     * @return daliServer
     */
    public java.lang.String getDaliServer() {
        return daliServer;
    }


    /**
     * Sets the daliServer value for this WUQuerysetCopyQuery.
     * 
     * @param daliServer
     */
    public void setDaliServer(java.lang.String daliServer) {
        this.daliServer = daliServer;
    }


    /**
     * Gets the activate value for this WUQuerysetCopyQuery.
     * 
     * @return activate
     */
    public java.lang.Integer getActivate() {
        return activate;
    }


    /**
     * Sets the activate value for this WUQuerysetCopyQuery.
     * 
     * @param activate
     */
    public void setActivate(java.lang.Integer activate) {
        this.activate = activate;
    }


    /**
     * Gets the overwrite value for this WUQuerysetCopyQuery.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this WUQuerysetCopyQuery.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the dontCopyFiles value for this WUQuerysetCopyQuery.
     * 
     * @return dontCopyFiles
     */
    public java.lang.Boolean getDontCopyFiles() {
        return dontCopyFiles;
    }


    /**
     * Sets the dontCopyFiles value for this WUQuerysetCopyQuery.
     * 
     * @param dontCopyFiles
     */
    public void setDontCopyFiles(java.lang.Boolean dontCopyFiles) {
        this.dontCopyFiles = dontCopyFiles;
    }


    /**
     * Gets the wait value for this WUQuerysetCopyQuery.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this WUQuerysetCopyQuery.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }


    /**
     * Gets the noReload value for this WUQuerysetCopyQuery.
     * 
     * @return noReload
     */
    public java.lang.Boolean getNoReload() {
        return noReload;
    }


    /**
     * Sets the noReload value for this WUQuerysetCopyQuery.
     * 
     * @param noReload
     */
    public void setNoReload(java.lang.Boolean noReload) {
        this.noReload = noReload;
    }


    /**
     * Gets the memoryLimit value for this WUQuerysetCopyQuery.
     * 
     * @return memoryLimit
     */
    public java.lang.String getMemoryLimit() {
        return memoryLimit;
    }


    /**
     * Sets the memoryLimit value for this WUQuerysetCopyQuery.
     * 
     * @param memoryLimit
     */
    public void setMemoryLimit(java.lang.String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }


    /**
     * Gets the timeLimit value for this WUQuerysetCopyQuery.
     * 
     * @return timeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getTimeLimit() {
        return timeLimit;
    }


    /**
     * Sets the timeLimit value for this WUQuerysetCopyQuery.
     * 
     * @param timeLimit
     */
    public void setTimeLimit(org.apache.axis.types.NonNegativeInteger timeLimit) {
        this.timeLimit = timeLimit;
    }


    /**
     * Gets the warnTimeLimit value for this WUQuerysetCopyQuery.
     * 
     * @return warnTimeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getWarnTimeLimit() {
        return warnTimeLimit;
    }


    /**
     * Sets the warnTimeLimit value for this WUQuerysetCopyQuery.
     * 
     * @param warnTimeLimit
     */
    public void setWarnTimeLimit(org.apache.axis.types.NonNegativeInteger warnTimeLimit) {
        this.warnTimeLimit = warnTimeLimit;
    }


    /**
     * Gets the priority value for this WUQuerysetCopyQuery.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WUQuerysetCopyQuery.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the comment value for this WUQuerysetCopyQuery.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WUQuerysetCopyQuery.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the sourceProcess value for this WUQuerysetCopyQuery.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this WUQuerysetCopyQuery.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the destName value for this WUQuerysetCopyQuery.
     * 
     * @return destName
     */
    public java.lang.String getDestName() {
        return destName;
    }


    /**
     * Sets the destName value for this WUQuerysetCopyQuery.
     * 
     * @param destName
     */
    public void setDestName(java.lang.String destName) {
        this.destName = destName;
    }


    /**
     * Gets the allowForeignFiles value for this WUQuerysetCopyQuery.
     * 
     * @return allowForeignFiles
     */
    public java.lang.Boolean getAllowForeignFiles() {
        return allowForeignFiles;
    }


    /**
     * Sets the allowForeignFiles value for this WUQuerysetCopyQuery.
     * 
     * @param allowForeignFiles
     */
    public void setAllowForeignFiles(java.lang.Boolean allowForeignFiles) {
        this.allowForeignFiles = allowForeignFiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerysetCopyQuery)) return false;
        WUQuerysetCopyQuery other = (WUQuerysetCopyQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.daliServer==null && other.getDaliServer()==null) || 
             (this.daliServer!=null &&
              this.daliServer.equals(other.getDaliServer()))) &&
            ((this.activate==null && other.getActivate()==null) || 
             (this.activate!=null &&
              this.activate.equals(other.getActivate()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.dontCopyFiles==null && other.getDontCopyFiles()==null) || 
             (this.dontCopyFiles!=null &&
              this.dontCopyFiles.equals(other.getDontCopyFiles()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait()))) &&
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
            ((this.sourceProcess==null && other.getSourceProcess()==null) || 
             (this.sourceProcess!=null &&
              this.sourceProcess.equals(other.getSourceProcess()))) &&
            ((this.destName==null && other.getDestName()==null) || 
             (this.destName!=null &&
              this.destName.equals(other.getDestName()))) &&
            ((this.allowForeignFiles==null && other.getAllowForeignFiles()==null) || 
             (this.allowForeignFiles!=null &&
              this.allowForeignFiles.equals(other.getAllowForeignFiles())));
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
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getDaliServer() != null) {
            _hashCode += getDaliServer().hashCode();
        }
        if (getActivate() != null) {
            _hashCode += getActivate().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getDontCopyFiles() != null) {
            _hashCode += getDontCopyFiles().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
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
        if (getSourceProcess() != null) {
            _hashCode += getSourceProcess().hashCode();
        }
        if (getDestName() != null) {
            _hashCode += getDestName().hashCode();
        }
        if (getAllowForeignFiles() != null) {
            _hashCode += getAllowForeignFiles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUQuerysetCopyQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetCopyQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daliServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DaliServer"));
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
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Overwrite"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "priority"));
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
        elemField.setFieldName("sourceProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DestName"));
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
