/**
 * DFUFileAccessRequestBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileAccessRequestBase  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String cluster;

    private java.lang.String jobId;

    private java.lang.Integer expirySeconds;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.FileAccessRole accessRole;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.SecAccessType accessType;

    private java.lang.Boolean returnJsonTypeInfo;

    private java.lang.Boolean returnBinTypeInfo;

    public DFUFileAccessRequestBase() {
    }

    public DFUFileAccessRequestBase(
           java.lang.String name,
           java.lang.String cluster,
           java.lang.String jobId,
           java.lang.Integer expirySeconds,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.FileAccessRole accessRole,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.SecAccessType accessType,
           java.lang.Boolean returnJsonTypeInfo,
           java.lang.Boolean returnBinTypeInfo) {
           this.name = name;
           this.cluster = cluster;
           this.jobId = jobId;
           this.expirySeconds = expirySeconds;
           this.accessRole = accessRole;
           this.accessType = accessType;
           this.returnJsonTypeInfo = returnJsonTypeInfo;
           this.returnBinTypeInfo = returnBinTypeInfo;
    }


    /**
     * Gets the name value for this DFUFileAccessRequestBase.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DFUFileAccessRequestBase.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the cluster value for this DFUFileAccessRequestBase.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this DFUFileAccessRequestBase.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the jobId value for this DFUFileAccessRequestBase.
     * 
     * @return jobId
     */
    public java.lang.String getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this DFUFileAccessRequestBase.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.String jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the expirySeconds value for this DFUFileAccessRequestBase.
     * 
     * @return expirySeconds
     */
    public java.lang.Integer getExpirySeconds() {
        return expirySeconds;
    }


    /**
     * Sets the expirySeconds value for this DFUFileAccessRequestBase.
     * 
     * @param expirySeconds
     */
    public void setExpirySeconds(java.lang.Integer expirySeconds) {
        this.expirySeconds = expirySeconds;
    }


    /**
     * Gets the accessRole value for this DFUFileAccessRequestBase.
     * 
     * @return accessRole
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.FileAccessRole getAccessRole() {
        return accessRole;
    }


    /**
     * Sets the accessRole value for this DFUFileAccessRequestBase.
     * 
     * @param accessRole
     */
    public void setAccessRole(org.hpccsystems.ws.client.gen.wsdfu.v1_51.FileAccessRole accessRole) {
        this.accessRole = accessRole;
    }


    /**
     * Gets the accessType value for this DFUFileAccessRequestBase.
     * 
     * @return accessType
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.SecAccessType getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this DFUFileAccessRequestBase.
     * 
     * @param accessType
     */
    public void setAccessType(org.hpccsystems.ws.client.gen.wsdfu.v1_51.SecAccessType accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the returnJsonTypeInfo value for this DFUFileAccessRequestBase.
     * 
     * @return returnJsonTypeInfo
     */
    public java.lang.Boolean getReturnJsonTypeInfo() {
        return returnJsonTypeInfo;
    }


    /**
     * Sets the returnJsonTypeInfo value for this DFUFileAccessRequestBase.
     * 
     * @param returnJsonTypeInfo
     */
    public void setReturnJsonTypeInfo(java.lang.Boolean returnJsonTypeInfo) {
        this.returnJsonTypeInfo = returnJsonTypeInfo;
    }


    /**
     * Gets the returnBinTypeInfo value for this DFUFileAccessRequestBase.
     * 
     * @return returnBinTypeInfo
     */
    public java.lang.Boolean getReturnBinTypeInfo() {
        return returnBinTypeInfo;
    }


    /**
     * Sets the returnBinTypeInfo value for this DFUFileAccessRequestBase.
     * 
     * @param returnBinTypeInfo
     */
    public void setReturnBinTypeInfo(java.lang.Boolean returnBinTypeInfo) {
        this.returnBinTypeInfo = returnBinTypeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileAccessRequestBase)) return false;
        DFUFileAccessRequestBase other = (DFUFileAccessRequestBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.expirySeconds==null && other.getExpirySeconds()==null) || 
             (this.expirySeconds!=null &&
              this.expirySeconds.equals(other.getExpirySeconds()))) &&
            ((this.accessRole==null && other.getAccessRole()==null) || 
             (this.accessRole!=null &&
              this.accessRole.equals(other.getAccessRole()))) &&
            ((this.accessType==null && other.getAccessType()==null) || 
             (this.accessType!=null &&
              this.accessType.equals(other.getAccessType()))) &&
            ((this.returnJsonTypeInfo==null && other.getReturnJsonTypeInfo()==null) || 
             (this.returnJsonTypeInfo!=null &&
              this.returnJsonTypeInfo.equals(other.getReturnJsonTypeInfo()))) &&
            ((this.returnBinTypeInfo==null && other.getReturnBinTypeInfo()==null) || 
             (this.returnBinTypeInfo!=null &&
              this.returnBinTypeInfo.equals(other.getReturnBinTypeInfo())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getExpirySeconds() != null) {
            _hashCode += getExpirySeconds().hashCode();
        }
        if (getAccessRole() != null) {
            _hashCode += getAccessRole().hashCode();
        }
        if (getAccessType() != null) {
            _hashCode += getAccessType().hashCode();
        }
        if (getReturnJsonTypeInfo() != null) {
            _hashCode += getReturnJsonTypeInfo().hashCode();
        }
        if (getReturnBinTypeInfo() != null) {
            _hashCode += getReturnBinTypeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileAccessRequestBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileAccessRequestBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "JobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirySeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExpirySeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AccessRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileAccessRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AccessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SecAccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnJsonTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ReturnJsonTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnBinTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ReturnBinTypeInfo"));
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
