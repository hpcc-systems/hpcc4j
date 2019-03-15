/**
 * WUQuerysetImport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUQuerysetImport  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.String queryMask;

    private java.lang.Boolean replace;

    private java.lang.Boolean activeOnly;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.QuerysetImportActivation activation;

    private java.lang.Boolean compressed;

    private byte[] data;

    private java.lang.Boolean allowForeignFiles;

    private java.lang.String dfsServer;

    private java.lang.Boolean copyFiles;

    private java.lang.Boolean overwriteDfs;

    private java.lang.String sourceProcess;

    private java.lang.Boolean updateSuperFiles;

    private java.lang.Boolean updateCloneFrom;

    private java.lang.Boolean appendCluster;

    private java.lang.Boolean includeFileErrors;

    public WUQuerysetImport() {
    }

    public WUQuerysetImport(
           java.lang.String target,
           java.lang.String queryMask,
           java.lang.Boolean replace,
           java.lang.Boolean activeOnly,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.QuerysetImportActivation activation,
           java.lang.Boolean compressed,
           byte[] data,
           java.lang.Boolean allowForeignFiles,
           java.lang.String dfsServer,
           java.lang.Boolean copyFiles,
           java.lang.Boolean overwriteDfs,
           java.lang.String sourceProcess,
           java.lang.Boolean updateSuperFiles,
           java.lang.Boolean updateCloneFrom,
           java.lang.Boolean appendCluster,
           java.lang.Boolean includeFileErrors) {
           this.target = target;
           this.queryMask = queryMask;
           this.replace = replace;
           this.activeOnly = activeOnly;
           this.activation = activation;
           this.compressed = compressed;
           this.data = data;
           this.allowForeignFiles = allowForeignFiles;
           this.dfsServer = dfsServer;
           this.copyFiles = copyFiles;
           this.overwriteDfs = overwriteDfs;
           this.sourceProcess = sourceProcess;
           this.updateSuperFiles = updateSuperFiles;
           this.updateCloneFrom = updateCloneFrom;
           this.appendCluster = appendCluster;
           this.includeFileErrors = includeFileErrors;
    }


    /**
     * Gets the target value for this WUQuerysetImport.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this WUQuerysetImport.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the queryMask value for this WUQuerysetImport.
     * 
     * @return queryMask
     */
    public java.lang.String getQueryMask() {
        return queryMask;
    }


    /**
     * Sets the queryMask value for this WUQuerysetImport.
     * 
     * @param queryMask
     */
    public void setQueryMask(java.lang.String queryMask) {
        this.queryMask = queryMask;
    }


    /**
     * Gets the replace value for this WUQuerysetImport.
     * 
     * @return replace
     */
    public java.lang.Boolean getReplace() {
        return replace;
    }


    /**
     * Sets the replace value for this WUQuerysetImport.
     * 
     * @param replace
     */
    public void setReplace(java.lang.Boolean replace) {
        this.replace = replace;
    }


    /**
     * Gets the activeOnly value for this WUQuerysetImport.
     * 
     * @return activeOnly
     */
    public java.lang.Boolean getActiveOnly() {
        return activeOnly;
    }


    /**
     * Sets the activeOnly value for this WUQuerysetImport.
     * 
     * @param activeOnly
     */
    public void setActiveOnly(java.lang.Boolean activeOnly) {
        this.activeOnly = activeOnly;
    }


    /**
     * Gets the activation value for this WUQuerysetImport.
     * 
     * @return activation
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.QuerysetImportActivation getActivation() {
        return activation;
    }


    /**
     * Sets the activation value for this WUQuerysetImport.
     * 
     * @param activation
     */
    public void setActivation(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.QuerysetImportActivation activation) {
        this.activation = activation;
    }


    /**
     * Gets the compressed value for this WUQuerysetImport.
     * 
     * @return compressed
     */
    public java.lang.Boolean getCompressed() {
        return compressed;
    }


    /**
     * Sets the compressed value for this WUQuerysetImport.
     * 
     * @param compressed
     */
    public void setCompressed(java.lang.Boolean compressed) {
        this.compressed = compressed;
    }


    /**
     * Gets the data value for this WUQuerysetImport.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this WUQuerysetImport.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the allowForeignFiles value for this WUQuerysetImport.
     * 
     * @return allowForeignFiles
     */
    public java.lang.Boolean getAllowForeignFiles() {
        return allowForeignFiles;
    }


    /**
     * Sets the allowForeignFiles value for this WUQuerysetImport.
     * 
     * @param allowForeignFiles
     */
    public void setAllowForeignFiles(java.lang.Boolean allowForeignFiles) {
        this.allowForeignFiles = allowForeignFiles;
    }


    /**
     * Gets the dfsServer value for this WUQuerysetImport.
     * 
     * @return dfsServer
     */
    public java.lang.String getDfsServer() {
        return dfsServer;
    }


    /**
     * Sets the dfsServer value for this WUQuerysetImport.
     * 
     * @param dfsServer
     */
    public void setDfsServer(java.lang.String dfsServer) {
        this.dfsServer = dfsServer;
    }


    /**
     * Gets the copyFiles value for this WUQuerysetImport.
     * 
     * @return copyFiles
     */
    public java.lang.Boolean getCopyFiles() {
        return copyFiles;
    }


    /**
     * Sets the copyFiles value for this WUQuerysetImport.
     * 
     * @param copyFiles
     */
    public void setCopyFiles(java.lang.Boolean copyFiles) {
        this.copyFiles = copyFiles;
    }


    /**
     * Gets the overwriteDfs value for this WUQuerysetImport.
     * 
     * @return overwriteDfs
     */
    public java.lang.Boolean getOverwriteDfs() {
        return overwriteDfs;
    }


    /**
     * Sets the overwriteDfs value for this WUQuerysetImport.
     * 
     * @param overwriteDfs
     */
    public void setOverwriteDfs(java.lang.Boolean overwriteDfs) {
        this.overwriteDfs = overwriteDfs;
    }


    /**
     * Gets the sourceProcess value for this WUQuerysetImport.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this WUQuerysetImport.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the updateSuperFiles value for this WUQuerysetImport.
     * 
     * @return updateSuperFiles
     */
    public java.lang.Boolean getUpdateSuperFiles() {
        return updateSuperFiles;
    }


    /**
     * Sets the updateSuperFiles value for this WUQuerysetImport.
     * 
     * @param updateSuperFiles
     */
    public void setUpdateSuperFiles(java.lang.Boolean updateSuperFiles) {
        this.updateSuperFiles = updateSuperFiles;
    }


    /**
     * Gets the updateCloneFrom value for this WUQuerysetImport.
     * 
     * @return updateCloneFrom
     */
    public java.lang.Boolean getUpdateCloneFrom() {
        return updateCloneFrom;
    }


    /**
     * Sets the updateCloneFrom value for this WUQuerysetImport.
     * 
     * @param updateCloneFrom
     */
    public void setUpdateCloneFrom(java.lang.Boolean updateCloneFrom) {
        this.updateCloneFrom = updateCloneFrom;
    }


    /**
     * Gets the appendCluster value for this WUQuerysetImport.
     * 
     * @return appendCluster
     */
    public java.lang.Boolean getAppendCluster() {
        return appendCluster;
    }


    /**
     * Sets the appendCluster value for this WUQuerysetImport.
     * 
     * @param appendCluster
     */
    public void setAppendCluster(java.lang.Boolean appendCluster) {
        this.appendCluster = appendCluster;
    }


    /**
     * Gets the includeFileErrors value for this WUQuerysetImport.
     * 
     * @return includeFileErrors
     */
    public java.lang.Boolean getIncludeFileErrors() {
        return includeFileErrors;
    }


    /**
     * Sets the includeFileErrors value for this WUQuerysetImport.
     * 
     * @param includeFileErrors
     */
    public void setIncludeFileErrors(java.lang.Boolean includeFileErrors) {
        this.includeFileErrors = includeFileErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerysetImport)) return false;
        WUQuerysetImport other = (WUQuerysetImport) obj;
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
            ((this.queryMask==null && other.getQueryMask()==null) || 
             (this.queryMask!=null &&
              this.queryMask.equals(other.getQueryMask()))) &&
            ((this.replace==null && other.getReplace()==null) || 
             (this.replace!=null &&
              this.replace.equals(other.getReplace()))) &&
            ((this.activeOnly==null && other.getActiveOnly()==null) || 
             (this.activeOnly!=null &&
              this.activeOnly.equals(other.getActiveOnly()))) &&
            ((this.activation==null && other.getActivation()==null) || 
             (this.activation!=null &&
              this.activation.equals(other.getActivation()))) &&
            ((this.compressed==null && other.getCompressed()==null) || 
             (this.compressed!=null &&
              this.compressed.equals(other.getCompressed()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
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
              this.sourceProcess.equals(other.getSourceProcess()))) &&
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
              this.includeFileErrors.equals(other.getIncludeFileErrors())));
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
        if (getQueryMask() != null) {
            _hashCode += getQueryMask().hashCode();
        }
        if (getReplace() != null) {
            _hashCode += getReplace().hashCode();
        }
        if (getActiveOnly() != null) {
            _hashCode += getActiveOnly().hashCode();
        }
        if (getActivation() != null) {
            _hashCode += getActivation().hashCode();
        }
        if (getCompressed() != null) {
            _hashCode += getCompressed().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUQuerysetImport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetImport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Replace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("activation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerysetImportActivation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Compressed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
