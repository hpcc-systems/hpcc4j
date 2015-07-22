/**
 * ThorCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_19;

public class ThorCluster  implements java.io.Serializable {
    private java.lang.String clusterName;

    private java.lang.String queueName;

    private java.lang.String queueStatus;

    private java.lang.Integer queueAvailable;

    private java.lang.Integer jobsRunning;

    private java.lang.Integer jobsInQueue;

    private java.lang.Integer queueStatus2;

    private java.lang.String thorLCR;

    private java.lang.Integer clusterSize;

    public ThorCluster() {
    }

    public ThorCluster(
           java.lang.String clusterName,
           java.lang.String queueName,
           java.lang.String queueStatus,
           java.lang.Integer queueAvailable,
           java.lang.Integer jobsRunning,
           java.lang.Integer jobsInQueue,
           java.lang.Integer queueStatus2,
           java.lang.String thorLCR,
           java.lang.Integer clusterSize) {
           this.clusterName = clusterName;
           this.queueName = queueName;
           this.queueStatus = queueStatus;
           this.queueAvailable = queueAvailable;
           this.jobsRunning = jobsRunning;
           this.jobsInQueue = jobsInQueue;
           this.queueStatus2 = queueStatus2;
           this.thorLCR = thorLCR;
           this.clusterSize = clusterSize;
    }


    /**
     * Gets the clusterName value for this ThorCluster.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this ThorCluster.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the queueName value for this ThorCluster.
     * 
     * @return queueName
     */
    public java.lang.String getQueueName() {
        return queueName;
    }


    /**
     * Sets the queueName value for this ThorCluster.
     * 
     * @param queueName
     */
    public void setQueueName(java.lang.String queueName) {
        this.queueName = queueName;
    }


    /**
     * Gets the queueStatus value for this ThorCluster.
     * 
     * @return queueStatus
     */
    public java.lang.String getQueueStatus() {
        return queueStatus;
    }


    /**
     * Sets the queueStatus value for this ThorCluster.
     * 
     * @param queueStatus
     */
    public void setQueueStatus(java.lang.String queueStatus) {
        this.queueStatus = queueStatus;
    }


    /**
     * Gets the queueAvailable value for this ThorCluster.
     * 
     * @return queueAvailable
     */
    public java.lang.Integer getQueueAvailable() {
        return queueAvailable;
    }


    /**
     * Sets the queueAvailable value for this ThorCluster.
     * 
     * @param queueAvailable
     */
    public void setQueueAvailable(java.lang.Integer queueAvailable) {
        this.queueAvailable = queueAvailable;
    }


    /**
     * Gets the jobsRunning value for this ThorCluster.
     * 
     * @return jobsRunning
     */
    public java.lang.Integer getJobsRunning() {
        return jobsRunning;
    }


    /**
     * Sets the jobsRunning value for this ThorCluster.
     * 
     * @param jobsRunning
     */
    public void setJobsRunning(java.lang.Integer jobsRunning) {
        this.jobsRunning = jobsRunning;
    }


    /**
     * Gets the jobsInQueue value for this ThorCluster.
     * 
     * @return jobsInQueue
     */
    public java.lang.Integer getJobsInQueue() {
        return jobsInQueue;
    }


    /**
     * Sets the jobsInQueue value for this ThorCluster.
     * 
     * @param jobsInQueue
     */
    public void setJobsInQueue(java.lang.Integer jobsInQueue) {
        this.jobsInQueue = jobsInQueue;
    }


    /**
     * Gets the queueStatus2 value for this ThorCluster.
     * 
     * @return queueStatus2
     */
    public java.lang.Integer getQueueStatus2() {
        return queueStatus2;
    }


    /**
     * Sets the queueStatus2 value for this ThorCluster.
     * 
     * @param queueStatus2
     */
    public void setQueueStatus2(java.lang.Integer queueStatus2) {
        this.queueStatus2 = queueStatus2;
    }


    /**
     * Gets the thorLCR value for this ThorCluster.
     * 
     * @return thorLCR
     */
    public java.lang.String getThorLCR() {
        return thorLCR;
    }


    /**
     * Sets the thorLCR value for this ThorCluster.
     * 
     * @param thorLCR
     */
    public void setThorLCR(java.lang.String thorLCR) {
        this.thorLCR = thorLCR;
    }


    /**
     * Gets the clusterSize value for this ThorCluster.
     * 
     * @return clusterSize
     */
    public java.lang.Integer getClusterSize() {
        return clusterSize;
    }


    /**
     * Sets the clusterSize value for this ThorCluster.
     * 
     * @param clusterSize
     */
    public void setClusterSize(java.lang.Integer clusterSize) {
        this.clusterSize = clusterSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThorCluster)) return false;
        ThorCluster other = (ThorCluster) obj;
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
            ((this.queueAvailable==null && other.getQueueAvailable()==null) || 
             (this.queueAvailable!=null &&
              this.queueAvailable.equals(other.getQueueAvailable()))) &&
            ((this.jobsRunning==null && other.getJobsRunning()==null) || 
             (this.jobsRunning!=null &&
              this.jobsRunning.equals(other.getJobsRunning()))) &&
            ((this.jobsInQueue==null && other.getJobsInQueue()==null) || 
             (this.jobsInQueue!=null &&
              this.jobsInQueue.equals(other.getJobsInQueue()))) &&
            ((this.queueStatus2==null && other.getQueueStatus2()==null) || 
             (this.queueStatus2!=null &&
              this.queueStatus2.equals(other.getQueueStatus2()))) &&
            ((this.thorLCR==null && other.getThorLCR()==null) || 
             (this.thorLCR!=null &&
              this.thorLCR.equals(other.getThorLCR()))) &&
            ((this.clusterSize==null && other.getClusterSize()==null) || 
             (this.clusterSize!=null &&
              this.clusterSize.equals(other.getClusterSize())));
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
        if (getQueueAvailable() != null) {
            _hashCode += getQueueAvailable().hashCode();
        }
        if (getJobsRunning() != null) {
            _hashCode += getJobsRunning().hashCode();
        }
        if (getJobsInQueue() != null) {
            _hashCode += getJobsInQueue().hashCode();
        }
        if (getQueueStatus2() != null) {
            _hashCode += getQueueStatus2().hashCode();
        }
        if (getThorLCR() != null) {
            _hashCode += getThorLCR().hashCode();
        }
        if (getClusterSize() != null) {
            _hashCode += getClusterSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThorCluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster"));
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
        elemField.setFieldName("queueAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobsRunning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "JobsRunning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobsInQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "JobsInQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueStatus2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueStatus2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorLCR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorLCR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
