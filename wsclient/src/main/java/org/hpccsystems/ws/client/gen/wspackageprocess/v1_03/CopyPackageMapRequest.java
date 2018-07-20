/**
 * CopyPackageMapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class CopyPackageMapRequest  implements java.io.Serializable {
    private java.lang.String sourcePath;

    private java.lang.String remoteUserName;

    private java.lang.String remotePassword;

    private java.lang.String target;

    private java.lang.String process;

    private java.lang.String PMID;

    private java.lang.Boolean activate;

    private java.lang.String daliIp;

    private java.lang.Boolean globalScope;

    private java.lang.String sourceProcess;

    private java.lang.Boolean preloadAllPackages;

    private java.lang.Boolean replacePackageMap;

    private java.lang.Boolean updateSuperFiles;

    private java.lang.Boolean updateCloneFrom;

    private java.lang.Boolean appendCluster;

    public CopyPackageMapRequest() {
    }

    public CopyPackageMapRequest(
           java.lang.String sourcePath,
           java.lang.String remoteUserName,
           java.lang.String remotePassword,
           java.lang.String target,
           java.lang.String process,
           java.lang.String PMID,
           java.lang.Boolean activate,
           java.lang.String daliIp,
           java.lang.Boolean globalScope,
           java.lang.String sourceProcess,
           java.lang.Boolean preloadAllPackages,
           java.lang.Boolean replacePackageMap,
           java.lang.Boolean updateSuperFiles,
           java.lang.Boolean updateCloneFrom,
           java.lang.Boolean appendCluster) {
           this.sourcePath = sourcePath;
           this.remoteUserName = remoteUserName;
           this.remotePassword = remotePassword;
           this.target = target;
           this.process = process;
           this.PMID = PMID;
           this.activate = activate;
           this.daliIp = daliIp;
           this.globalScope = globalScope;
           this.sourceProcess = sourceProcess;
           this.preloadAllPackages = preloadAllPackages;
           this.replacePackageMap = replacePackageMap;
           this.updateSuperFiles = updateSuperFiles;
           this.updateCloneFrom = updateCloneFrom;
           this.appendCluster = appendCluster;
    }


    /**
     * Gets the sourcePath value for this CopyPackageMapRequest.
     * 
     * @return sourcePath
     */
    public java.lang.String getSourcePath() {
        return sourcePath;
    }


    /**
     * Sets the sourcePath value for this CopyPackageMapRequest.
     * 
     * @param sourcePath
     */
    public void setSourcePath(java.lang.String sourcePath) {
        this.sourcePath = sourcePath;
    }


    /**
     * Gets the remoteUserName value for this CopyPackageMapRequest.
     * 
     * @return remoteUserName
     */
    public java.lang.String getRemoteUserName() {
        return remoteUserName;
    }


    /**
     * Sets the remoteUserName value for this CopyPackageMapRequest.
     * 
     * @param remoteUserName
     */
    public void setRemoteUserName(java.lang.String remoteUserName) {
        this.remoteUserName = remoteUserName;
    }


    /**
     * Gets the remotePassword value for this CopyPackageMapRequest.
     * 
     * @return remotePassword
     */
    public java.lang.String getRemotePassword() {
        return remotePassword;
    }


    /**
     * Sets the remotePassword value for this CopyPackageMapRequest.
     * 
     * @param remotePassword
     */
    public void setRemotePassword(java.lang.String remotePassword) {
        this.remotePassword = remotePassword;
    }


    /**
     * Gets the target value for this CopyPackageMapRequest.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this CopyPackageMapRequest.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the process value for this CopyPackageMapRequest.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this CopyPackageMapRequest.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the PMID value for this CopyPackageMapRequest.
     * 
     * @return PMID
     */
    public java.lang.String getPMID() {
        return PMID;
    }


    /**
     * Sets the PMID value for this CopyPackageMapRequest.
     * 
     * @param PMID
     */
    public void setPMID(java.lang.String PMID) {
        this.PMID = PMID;
    }


    /**
     * Gets the activate value for this CopyPackageMapRequest.
     * 
     * @return activate
     */
    public java.lang.Boolean getActivate() {
        return activate;
    }


    /**
     * Sets the activate value for this CopyPackageMapRequest.
     * 
     * @param activate
     */
    public void setActivate(java.lang.Boolean activate) {
        this.activate = activate;
    }


    /**
     * Gets the daliIp value for this CopyPackageMapRequest.
     * 
     * @return daliIp
     */
    public java.lang.String getDaliIp() {
        return daliIp;
    }


    /**
     * Sets the daliIp value for this CopyPackageMapRequest.
     * 
     * @param daliIp
     */
    public void setDaliIp(java.lang.String daliIp) {
        this.daliIp = daliIp;
    }


    /**
     * Gets the globalScope value for this CopyPackageMapRequest.
     * 
     * @return globalScope
     */
    public java.lang.Boolean getGlobalScope() {
        return globalScope;
    }


    /**
     * Sets the globalScope value for this CopyPackageMapRequest.
     * 
     * @param globalScope
     */
    public void setGlobalScope(java.lang.Boolean globalScope) {
        this.globalScope = globalScope;
    }


    /**
     * Gets the sourceProcess value for this CopyPackageMapRequest.
     * 
     * @return sourceProcess
     */
    public java.lang.String getSourceProcess() {
        return sourceProcess;
    }


    /**
     * Sets the sourceProcess value for this CopyPackageMapRequest.
     * 
     * @param sourceProcess
     */
    public void setSourceProcess(java.lang.String sourceProcess) {
        this.sourceProcess = sourceProcess;
    }


    /**
     * Gets the preloadAllPackages value for this CopyPackageMapRequest.
     * 
     * @return preloadAllPackages
     */
    public java.lang.Boolean getPreloadAllPackages() {
        return preloadAllPackages;
    }


    /**
     * Sets the preloadAllPackages value for this CopyPackageMapRequest.
     * 
     * @param preloadAllPackages
     */
    public void setPreloadAllPackages(java.lang.Boolean preloadAllPackages) {
        this.preloadAllPackages = preloadAllPackages;
    }


    /**
     * Gets the replacePackageMap value for this CopyPackageMapRequest.
     * 
     * @return replacePackageMap
     */
    public java.lang.Boolean getReplacePackageMap() {
        return replacePackageMap;
    }


    /**
     * Sets the replacePackageMap value for this CopyPackageMapRequest.
     * 
     * @param replacePackageMap
     */
    public void setReplacePackageMap(java.lang.Boolean replacePackageMap) {
        this.replacePackageMap = replacePackageMap;
    }


    /**
     * Gets the updateSuperFiles value for this CopyPackageMapRequest.
     * 
     * @return updateSuperFiles
     */
    public java.lang.Boolean getUpdateSuperFiles() {
        return updateSuperFiles;
    }


    /**
     * Sets the updateSuperFiles value for this CopyPackageMapRequest.
     * 
     * @param updateSuperFiles
     */
    public void setUpdateSuperFiles(java.lang.Boolean updateSuperFiles) {
        this.updateSuperFiles = updateSuperFiles;
    }


    /**
     * Gets the updateCloneFrom value for this CopyPackageMapRequest.
     * 
     * @return updateCloneFrom
     */
    public java.lang.Boolean getUpdateCloneFrom() {
        return updateCloneFrom;
    }


    /**
     * Sets the updateCloneFrom value for this CopyPackageMapRequest.
     * 
     * @param updateCloneFrom
     */
    public void setUpdateCloneFrom(java.lang.Boolean updateCloneFrom) {
        this.updateCloneFrom = updateCloneFrom;
    }


    /**
     * Gets the appendCluster value for this CopyPackageMapRequest.
     * 
     * @return appendCluster
     */
    public java.lang.Boolean getAppendCluster() {
        return appendCluster;
    }


    /**
     * Sets the appendCluster value for this CopyPackageMapRequest.
     * 
     * @param appendCluster
     */
    public void setAppendCluster(java.lang.Boolean appendCluster) {
        this.appendCluster = appendCluster;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CopyPackageMapRequest)) return false;
        CopyPackageMapRequest other = (CopyPackageMapRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourcePath==null && other.getSourcePath()==null) || 
             (this.sourcePath!=null &&
              this.sourcePath.equals(other.getSourcePath()))) &&
            ((this.remoteUserName==null && other.getRemoteUserName()==null) || 
             (this.remoteUserName!=null &&
              this.remoteUserName.equals(other.getRemoteUserName()))) &&
            ((this.remotePassword==null && other.getRemotePassword()==null) || 
             (this.remotePassword!=null &&
              this.remotePassword.equals(other.getRemotePassword()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            ((this.PMID==null && other.getPMID()==null) || 
             (this.PMID!=null &&
              this.PMID.equals(other.getPMID()))) &&
            ((this.activate==null && other.getActivate()==null) || 
             (this.activate!=null &&
              this.activate.equals(other.getActivate()))) &&
            ((this.daliIp==null && other.getDaliIp()==null) || 
             (this.daliIp!=null &&
              this.daliIp.equals(other.getDaliIp()))) &&
            ((this.globalScope==null && other.getGlobalScope()==null) || 
             (this.globalScope!=null &&
              this.globalScope.equals(other.getGlobalScope()))) &&
            ((this.sourceProcess==null && other.getSourceProcess()==null) || 
             (this.sourceProcess!=null &&
              this.sourceProcess.equals(other.getSourceProcess()))) &&
            ((this.preloadAllPackages==null && other.getPreloadAllPackages()==null) || 
             (this.preloadAllPackages!=null &&
              this.preloadAllPackages.equals(other.getPreloadAllPackages()))) &&
            ((this.replacePackageMap==null && other.getReplacePackageMap()==null) || 
             (this.replacePackageMap!=null &&
              this.replacePackageMap.equals(other.getReplacePackageMap()))) &&
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
        if (getSourcePath() != null) {
            _hashCode += getSourcePath().hashCode();
        }
        if (getRemoteUserName() != null) {
            _hashCode += getRemoteUserName().hashCode();
        }
        if (getRemotePassword() != null) {
            _hashCode += getRemotePassword().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        if (getPMID() != null) {
            _hashCode += getPMID().hashCode();
        }
        if (getActivate() != null) {
            _hashCode += getActivate().hashCode();
        }
        if (getDaliIp() != null) {
            _hashCode += getDaliIp().hashCode();
        }
        if (getGlobalScope() != null) {
            _hashCode += getGlobalScope().hashCode();
        }
        if (getSourceProcess() != null) {
            _hashCode += getSourceProcess().hashCode();
        }
        if (getPreloadAllPackages() != null) {
            _hashCode += getPreloadAllPackages().hashCode();
        }
        if (getReplacePackageMap() != null) {
            _hashCode += getReplacePackageMap().hashCode();
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
        new org.apache.axis.description.TypeDesc(CopyPackageMapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">CopyPackageMapRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "SourcePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "RemoteUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remotePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "RemotePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("PMID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Activate"));
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
        elemField.setFieldName("globalScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "GlobalScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("preloadAllPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PreloadAllPackages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replacePackageMap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ReplacePackageMap"));
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
