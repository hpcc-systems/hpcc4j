/**
 * WUCopyQuerySet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUCopyQuerySet  implements java.io.Serializable {
    private java.lang.String source;

    private java.lang.String target;

    private java.lang.Boolean activeOnly;

    private java.lang.Boolean cloneActiveState;

    private java.lang.Boolean allowForeignFiles;

    private java.lang.String dfsServer;

    private java.lang.Boolean copyFiles;

    private java.lang.Boolean overwriteDfs;

    private java.lang.String sourceProcess;

    public WUCopyQuerySet() {
    }

    public WUCopyQuerySet(
           java.lang.String source,
           java.lang.String target,
           java.lang.Boolean activeOnly,
           java.lang.Boolean cloneActiveState,
           java.lang.Boolean allowForeignFiles,
           java.lang.String dfsServer,
           java.lang.Boolean copyFiles,
           java.lang.Boolean overwriteDfs,
           java.lang.String sourceProcess) {
           this.source = source;
           this.target = target;
           this.activeOnly = activeOnly;
           this.cloneActiveState = cloneActiveState;
           this.allowForeignFiles = allowForeignFiles;
           this.dfsServer = dfsServer;
           this.copyFiles = copyFiles;
           this.overwriteDfs = overwriteDfs;
           this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the source value for this WUCopyQuerySet.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this WUCopyQuerySet.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the target value for this WUCopyQuerySet.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this WUCopyQuerySet.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the activeOnly value for this WUCopyQuerySet.
     * 
     * @return activeOnly
     */
    public java.lang.Boolean getActiveOnly() {
        return activeOnly;
    }


    /**
     * Sets the activeOnly value for this WUCopyQuerySet.
     * 
     * @param activeOnly
     */
    public void setActiveOnly(java.lang.Boolean activeOnly) {
        this.activeOnly = activeOnly;
    }


    /**
     * Gets the cloneActiveState value for this WUCopyQuerySet.
     * 
     * @return cloneActiveState
     */
    public java.lang.Boolean getCloneActiveState() {
        return cloneActiveState;
    }


    /**
     * Sets the cloneActiveState value for this WUCopyQuerySet.
     * 
     * @param cloneActiveState
     */
    public void setCloneActiveState(java.lang.Boolean cloneActiveState) {
        this.cloneActiveState = cloneActiveState;
    }


    /**
     * Gets the allowForeignFiles value for this WUCopyQuerySet.
     * 
     * @return allowForeignFiles
     */
    public java.lang.Boolean getAllowForeignFiles() {
        return allowForeignFiles;
    }


    /**
     * Sets the allowForeignFiles value for this WUCopyQuerySet.
     * 
     * @param allowForeignFiles
     */
    public void setAllowForeignFiles(java.lang.Boolean allowForeignFiles) {
        this.allowForeignFiles = allowForeignFiles;
    }


    /**
     * Gets the dfsServer value for this WUCopyQuerySet.
     * 
     * @return dfsServer
     */
    public java.lang.String getDfsServer() {
        return dfsServer;
    }


    /**
     * Sets the dfsServer value for this WUCopyQuerySet.
     * 
     * @param dfsServer
     */
    public void setDfsServer(java.lang.String dfsServer) {
        this.dfsServer = dfsServer;
    }


    /**
     * Gets the copyFiles value for this WUCopyQuerySet.
     * 
     * @return copyFiles
     */
    public java.lang.Boolean getCopyFiles() {
        return copyFiles;
    }


    /**
     * Sets the copyFiles value for this WUCopyQuerySet.
     * 
     * @param copyFiles
     */
    public void setCopyFiles(java.lang.Boolean copyFiles) {
        this.copyFiles = copyFiles;
    }


    /**
     * Gets the overwriteDfs value for this WUCopyQuerySet.
     * 
     * @return overwriteDfs
     */
    public java.lang.Boolean getOverwriteDfs() {
        return overwriteDfs;
    }


    /**
     * Sets the overwriteDfs value for this WUCopyQuerySet.
     * 
     * @param overwriteDfs
     */
    public void setOverwriteDfs(java.lang.Boolean overwriteDfs) {
        this.overwriteDfs = overwriteDfs;
    }


    /**
     * Gets the sourceProcess value for this WUCopyQuerySet.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this WUCopyQuerySet.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUCopyQuerySet)) return false;
        WUCopyQuerySet other = (WUCopyQuerySet) obj;
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
            ((this.activeOnly==null && other.getActiveOnly()==null) || 
             (this.activeOnly!=null &&
              this.activeOnly.equals(other.getActiveOnly()))) &&
            ((this.cloneActiveState==null && other.getCloneActiveState()==null) || 
             (this.cloneActiveState!=null &&
              this.cloneActiveState.equals(other.getCloneActiveState()))) &&
            ((this.allowForeignFiles==null && other.getAllowForeignFiles()==null) || 
             (this.allowForeignFiles!=null &&
              this.allowForeignFiles.equals(other.getAllowForeignFiles()))) &&
            ((this.dfsServer==null && other.getDfsServer()==null) || 
             (this.dfsServer!=null &&
              this.dfsServer.equals(other.getDfsServer()))) &&
            ((this.copyFiles==null && other.getCopyFiles()==null) || 
             (this.copyFiles!=null &&
              this.copyFiles.equals(other.getCopyFiles()))) &&
            ((this.overwriteDfs==null && other.getOverwriteDfs()==null) || 
             (this.overwriteDfs!=null &&
              this.overwriteDfs.equals(other.getOverwriteDfs()))) &&
            ((this.sourceProcess==null && other.getSourceProcess()==null) || 
             (this.sourceProcess!=null &&
              this.sourceProcess.equals(other.getSourceProcess())));
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
        if (getActiveOnly() != null) {
            _hashCode += getActiveOnly().hashCode();
        }
        if (getCloneActiveState() != null) {
            _hashCode += getCloneActiveState().hashCode();
        }
        if (getAllowForeignFiles() != null) {
            _hashCode += getAllowForeignFiles().hashCode();
        }
        if (getDfsServer() != null) {
            _hashCode += getDfsServer().hashCode();
        }
        if (getCopyFiles() != null) {
            _hashCode += getCopyFiles().hashCode();
        }
        if (getOverwriteDfs() != null) {
            _hashCode += getOverwriteDfs().hashCode();
        }
        if (getSourceProcess() != null) {
            _hashCode += getSourceProcess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUCopyQuerySet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyQuerySet"));
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
        elemField.setFieldName("activeOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ActiveOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneActiveState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CloneActiveState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("dfsServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DfsServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CopyFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwriteDfs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "OverwriteDfs"));
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
