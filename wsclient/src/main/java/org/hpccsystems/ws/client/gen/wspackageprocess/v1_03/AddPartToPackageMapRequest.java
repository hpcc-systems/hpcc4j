/**
 * AddPartToPackageMapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class AddPartToPackageMapRequest  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.String process;

    private java.lang.String packageMap;

    private java.lang.Boolean globalScope;

    private java.lang.String partName;

    private java.lang.String content;

    private java.lang.Boolean deletePrevious;

    private java.lang.String daliIp;

    private java.lang.String sourceProcess;

    private java.lang.Boolean allowForeignFiles;

    private java.lang.Boolean preloadAllPackages;

    private java.lang.Boolean updateSuperFiles;

    private java.lang.Boolean updateCloneFrom;

    private java.lang.Boolean appendCluster;

    public AddPartToPackageMapRequest() {
    }

    public AddPartToPackageMapRequest(
           java.lang.String target,
           java.lang.String process,
           java.lang.String packageMap,
           java.lang.Boolean globalScope,
           java.lang.String partName,
           java.lang.String content,
           java.lang.Boolean deletePrevious,
           java.lang.String daliIp,
           java.lang.String sourceProcess,
           java.lang.Boolean allowForeignFiles,
           java.lang.Boolean preloadAllPackages,
           java.lang.Boolean updateSuperFiles,
           java.lang.Boolean updateCloneFrom,
           java.lang.Boolean appendCluster) {
           this.target = target;
           this.process = process;
           this.packageMap = packageMap;
           this.globalScope = globalScope;
           this.partName = partName;
           this.content = content;
           this.deletePrevious = deletePrevious;
           this.daliIp = daliIp;
           this.sourceProcess = sourceProcess;
           this.allowForeignFiles = allowForeignFiles;
           this.preloadAllPackages = preloadAllPackages;
           this.updateSuperFiles = updateSuperFiles;
           this.updateCloneFrom = updateCloneFrom;
           this.appendCluster = appendCluster;
    }


    /**
     * Gets the target value for this AddPartToPackageMapRequest.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this AddPartToPackageMapRequest.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the process value for this AddPartToPackageMapRequest.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this AddPartToPackageMapRequest.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the packageMap value for this AddPartToPackageMapRequest.
     * 
     * @return packageMap
     */
    public java.lang.String getPackageMap() {
        return packageMap;
    }


    /**
     * Sets the packageMap value for this AddPartToPackageMapRequest.
     * 
     * @param packageMap
     */
    public void setPackageMap(java.lang.String packageMap) {
        this.packageMap = packageMap;
    }


    /**
     * Gets the globalScope value for this AddPartToPackageMapRequest.
     * 
     * @return globalScope
     */
    public java.lang.Boolean getGlobalScope() {
        return globalScope;
    }


    /**
     * Sets the globalScope value for this AddPartToPackageMapRequest.
     * 
     * @param globalScope
     */
    public void setGlobalScope(java.lang.Boolean globalScope) {
        this.globalScope = globalScope;
    }


    /**
     * Gets the partName value for this AddPartToPackageMapRequest.
     * 
     * @return partName
     */
    public java.lang.String getPartName() {
        return partName;
    }


    /**
     * Sets the partName value for this AddPartToPackageMapRequest.
     * 
     * @param partName
     */
    public void setPartName(java.lang.String partName) {
        this.partName = partName;
    }


    /**
     * Gets the content value for this AddPartToPackageMapRequest.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this AddPartToPackageMapRequest.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the deletePrevious value for this AddPartToPackageMapRequest.
     * 
     * @return deletePrevious
     */
    public java.lang.Boolean getDeletePrevious() {
        return deletePrevious;
    }


    /**
     * Sets the deletePrevious value for this AddPartToPackageMapRequest.
     * 
     * @param deletePrevious
     */
    public void setDeletePrevious(java.lang.Boolean deletePrevious) {
        this.deletePrevious = deletePrevious;
    }


    /**
     * Gets the daliIp value for this AddPartToPackageMapRequest.
     * 
     * @return daliIp
     */
    public java.lang.String getDaliIp() {
        return daliIp;
    }


    /**
     * Sets the daliIp value for this AddPartToPackageMapRequest.
     * 
     * @param daliIp
     */
    public void setDaliIp(java.lang.String daliIp) {
        this.daliIp = daliIp;
    }


    /**
     * Gets the sourceProcess value for this AddPartToPackageMapRequest.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this AddPartToPackageMapRequest.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the allowForeignFiles value for this AddPartToPackageMapRequest.
     * 
     * @return allowForeignFiles
     */
    public java.lang.Boolean getAllowForeignFiles() {
        return allowForeignFiles;
    }


    /**
     * Sets the allowForeignFiles value for this AddPartToPackageMapRequest.
     * 
     * @param allowForeignFiles
     */
    public void setAllowForeignFiles(java.lang.Boolean allowForeignFiles) {
        this.allowForeignFiles = allowForeignFiles;
    }


    /**
     * Gets the preloadAllPackages value for this AddPartToPackageMapRequest.
     * 
     * @return preloadAllPackages
     */
    public java.lang.Boolean getPreloadAllPackages() {
        return preloadAllPackages;
    }


    /**
     * Sets the preloadAllPackages value for this AddPartToPackageMapRequest.
     * 
     * @param preloadAllPackages
     */
    public void setPreloadAllPackages(java.lang.Boolean preloadAllPackages) {
        this.preloadAllPackages = preloadAllPackages;
    }


    /**
     * Gets the updateSuperFiles value for this AddPartToPackageMapRequest.
     * 
     * @return updateSuperFiles
     */
    public java.lang.Boolean getUpdateSuperFiles() {
        return updateSuperFiles;
    }


    /**
     * Sets the updateSuperFiles value for this AddPartToPackageMapRequest.
     * 
     * @param updateSuperFiles
     */
    public void setUpdateSuperFiles(java.lang.Boolean updateSuperFiles) {
        this.updateSuperFiles = updateSuperFiles;
    }


    /**
     * Gets the updateCloneFrom value for this AddPartToPackageMapRequest.
     * 
     * @return updateCloneFrom
     */
    public java.lang.Boolean getUpdateCloneFrom() {
        return updateCloneFrom;
    }


    /**
     * Sets the updateCloneFrom value for this AddPartToPackageMapRequest.
     * 
     * @param updateCloneFrom
     */
    public void setUpdateCloneFrom(java.lang.Boolean updateCloneFrom) {
        this.updateCloneFrom = updateCloneFrom;
    }


    /**
     * Gets the appendCluster value for this AddPartToPackageMapRequest.
     * 
     * @return appendCluster
     */
    public java.lang.Boolean getAppendCluster() {
        return appendCluster;
    }


    /**
     * Sets the appendCluster value for this AddPartToPackageMapRequest.
     * 
     * @param appendCluster
     */
    public void setAppendCluster(java.lang.Boolean appendCluster) {
        this.appendCluster = appendCluster;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddPartToPackageMapRequest)) return false;
        AddPartToPackageMapRequest other = (AddPartToPackageMapRequest) obj;
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
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            ((this.packageMap==null && other.getPackageMap()==null) || 
             (this.packageMap!=null &&
              this.packageMap.equals(other.getPackageMap()))) &&
            ((this.globalScope==null && other.getGlobalScope()==null) || 
             (this.globalScope!=null &&
              this.globalScope.equals(other.getGlobalScope()))) &&
            ((this.partName==null && other.getPartName()==null) || 
             (this.partName!=null &&
              this.partName.equals(other.getPartName()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.deletePrevious==null && other.getDeletePrevious()==null) || 
             (this.deletePrevious!=null &&
              this.deletePrevious.equals(other.getDeletePrevious()))) &&
            ((this.daliIp==null && other.getDaliIp()==null) || 
             (this.daliIp!=null &&
              this.daliIp.equals(other.getDaliIp()))) &&
            ((this.sourceProcess==null && other.getSourceProcess()==null) || 
             (this.sourceProcess!=null &&
              this.sourceProcess.equals(other.getSourceProcess()))) &&
            ((this.allowForeignFiles==null && other.getAllowForeignFiles()==null) || 
             (this.allowForeignFiles!=null &&
              this.allowForeignFiles.equals(other.getAllowForeignFiles()))) &&
            ((this.preloadAllPackages==null && other.getPreloadAllPackages()==null) || 
             (this.preloadAllPackages!=null &&
              this.preloadAllPackages.equals(other.getPreloadAllPackages()))) &&
            ((this.updateSuperFiles==null && other.getUpdateSuperFiles()==null) || 
             (this.updateSuperFiles!=null &&
              this.updateSuperFiles.equals(other.getUpdateSuperFiles()))) &&
            ((this.updateCloneFrom==null && other.getUpdateCloneFrom()==null) || 
             (this.updateCloneFrom!=null &&
              this.updateCloneFrom.equals(other.getUpdateCloneFrom()))) &&
            ((this.appendCluster==null && other.getAppendCluster()==null) || 
             (this.appendCluster!=null &&
              this.appendCluster.equals(other.getAppendCluster())));
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
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        if (getPackageMap() != null) {
            _hashCode += getPackageMap().hashCode();
        }
        if (getGlobalScope() != null) {
            _hashCode += getGlobalScope().hashCode();
        }
        if (getPartName() != null) {
            _hashCode += getPartName().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getDeletePrevious() != null) {
            _hashCode += getDeletePrevious().hashCode();
        }
        if (getDaliIp() != null) {
            _hashCode += getDaliIp().hashCode();
        }
        if (getSourceProcess() != null) {
            _hashCode += getSourceProcess().hashCode();
        }
        if (getAllowForeignFiles() != null) {
            _hashCode += getAllowForeignFiles().hashCode();
        }
        if (getPreloadAllPackages() != null) {
            _hashCode += getPreloadAllPackages().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddPartToPackageMapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">AddPartToPackageMapRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Process"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageMap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PackageMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "GlobalScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PartName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletePrevious");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "DeletePrevious"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daliIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "DaliIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "SourceProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowForeignFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "AllowForeignFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preloadAllPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PreloadAllPackages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateSuperFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "UpdateSuperFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateCloneFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "UpdateCloneFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appendCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "AppendCluster"));
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
