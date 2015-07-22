/**
 * TargetCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_19;

public class TargetCluster  implements java.io.Serializable {
    private java.lang.String clusterName;

    private java.lang.String queueName;

    private java.lang.String queueStatus;

    private java.lang.String statusDetails;

    private java.lang.String warning;

    private java.lang.Integer clusterType;

    private java.lang.Integer clusterSize;

    private java.lang.Integer clusterStatus;

    public TargetCluster() {
    }

    public TargetCluster(
           java.lang.String clusterName,
           java.lang.String queueName,
           java.lang.String queueStatus,
           java.lang.String statusDetails,
           java.lang.String warning,
           java.lang.Integer clusterType,
           java.lang.Integer clusterSize,
           java.lang.Integer clusterStatus) {
           this.clusterName = clusterName;
           this.queueName = queueName;
           this.queueStatus = queueStatus;
           this.statusDetails = statusDetails;
           this.warning = warning;
           this.clusterType = clusterType;
           this.clusterSize = clusterSize;
           this.clusterStatus = clusterStatus;
    }


    /**
     * Gets the clusterName value for this TargetCluster.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this TargetCluster.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the queueName value for this TargetCluster.
     * 
     * @return queueName
     */
    public java.lang.String getQueueName() {
        return queueName;
    }


    /**
     * Sets the queueName value for this TargetCluster.
     * 
     * @param queueName
     */
    public void setQueueName(java.lang.String queueName) {
        this.queueName = queueName;
    }


    /**
     * Gets the queueStatus value for this TargetCluster.
     * 
     * @return queueStatus
     */
    public java.lang.String getQueueStatus() {
        return queueStatus;
    }


    /**
     * Sets the queueStatus value for this TargetCluster.
     * 
     * @param queueStatus
     */
    public void setQueueStatus(java.lang.String queueStatus) {
        this.queueStatus = queueStatus;
    }


    /**
     * Gets the statusDetails value for this TargetCluster.
     * 
     * @return statusDetails
     */
    public java.lang.String getStatusDetails() {
        return statusDetails;
    }


    /**
     * Sets the statusDetails value for this TargetCluster.
     * 
     * @param statusDetails
     */
    public void setStatusDetails(java.lang.String statusDetails) {
        this.statusDetails = statusDetails;
    }


    /**
     * Gets the warning value for this TargetCluster.
     * 
     * @return warning
     */
    public java.lang.String getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this TargetCluster.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String warning) {
        this.warning = warning;
    }


    /**
     * Gets the clusterType value for this TargetCluster.
     * 
     * @return clusterType
     */
    public java.lang.Integer getClusterType() {
        return clusterType;
    }


    /**
     * Sets the clusterType value for this TargetCluster.
     * 
     * @param clusterType
     */
    public void setClusterType(java.lang.Integer clusterType) {
        this.clusterType = clusterType;
    }


    /**
     * Gets the clusterSize value for this TargetCluster.
     * 
     * @return clusterSize
     */
    public java.lang.Integer getClusterSize() {
        return clusterSize;
    }


    /**
     * Sets the clusterSize value for this TargetCluster.
     * 
     * @param clusterSize
     */
    public void setClusterSize(java.lang.Integer clusterSize) {
        this.clusterSize = clusterSize;
    }


    /**
     * Gets the clusterStatus value for this TargetCluster.
     * 
     * @return clusterStatus
     */
    public java.lang.Integer getClusterStatus() {
        return clusterStatus;
    }


    /**
     * Sets the clusterStatus value for this TargetCluster.
     * 
     * @param clusterStatus
     */
    public void setClusterStatus(java.lang.Integer clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetCluster)) return false;
        TargetCluster other = (TargetCluster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.queueName==null && other.getQueueName()==null) || 
             (this.queueName!=null &&
              this.queueName.equals(other.getQueueName()))) &&
            ((this.queueStatus==null && other.getQueueStatus()==null) || 
             (this.queueStatus!=null &&
              this.queueStatus.equals(other.getQueueStatus()))) &&
            ((this.statusDetails==null && other.getStatusDetails()==null) || 
             (this.statusDetails!=null &&
              this.statusDetails.equals(other.getStatusDetails()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning()))) &&
            ((this.clusterType==null && other.getClusterType()==null) || 
             (this.clusterType!=null &&
              this.clusterType.equals(other.getClusterType()))) &&
            ((this.clusterSize==null && other.getClusterSize()==null) || 
             (this.clusterSize!=null &&
              this.clusterSize.equals(other.getClusterSize()))) &&
            ((this.clusterStatus==null && other.getClusterStatus()==null) || 
             (this.clusterStatus!=null &&
              this.clusterStatus.equals(other.getClusterStatus())));
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
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getQueueName() != null) {
            _hashCode += getQueueName().hashCode();
        }
        if (getQueueStatus() != null) {
            _hashCode += getQueueStatus().hashCode();
        }
        if (getStatusDetails() != null) {
            _hashCode += getStatusDetails().hashCode();
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        if (getClusterType() != null) {
            _hashCode += getClusterType().hashCode();
        }
        if (getClusterSize() != null) {
            _hashCode += getClusterSize().hashCode();
        }
        if (getClusterStatus() != null) {
            _hashCode += getClusterStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetCluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TargetCluster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StatusDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterStatus"));
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
