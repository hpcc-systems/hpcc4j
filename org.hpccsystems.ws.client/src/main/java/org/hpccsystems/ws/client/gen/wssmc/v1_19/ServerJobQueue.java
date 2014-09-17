/**
 * ServerJobQueue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_19;

public class ServerJobQueue  implements java.io.Serializable {
    private java.lang.String queueName;

    private java.lang.String serverName;

    private java.lang.String serverType;

    private java.lang.String queueStatus;

    private java.lang.String statusDetails;

    private java.lang.String networkAddress;

    private java.lang.Integer port;

    public ServerJobQueue() {
    }

    public ServerJobQueue(
           java.lang.String queueName,
           java.lang.String serverName,
           java.lang.String serverType,
           java.lang.String queueStatus,
           java.lang.String statusDetails,
           java.lang.String networkAddress,
           java.lang.Integer port) {
           this.queueName = queueName;
           this.serverName = serverName;
           this.serverType = serverType;
           this.queueStatus = queueStatus;
           this.statusDetails = statusDetails;
           this.networkAddress = networkAddress;
           this.port = port;
    }


    /**
     * Gets the queueName value for this ServerJobQueue.
     * 
     * @return queueName
     */
    public java.lang.String getQueueName() {
        return queueName;
    }


    /**
     * Sets the queueName value for this ServerJobQueue.
     * 
     * @param queueName
     */
    public void setQueueName(java.lang.String queueName) {
        this.queueName = queueName;
    }


    /**
     * Gets the serverName value for this ServerJobQueue.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this ServerJobQueue.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverType value for this ServerJobQueue.
     * 
     * @return serverType
     */
    public java.lang.String getServerType() {
        return serverType;
    }


    /**
     * Sets the serverType value for this ServerJobQueue.
     * 
     * @param serverType
     */
    public void setServerType(java.lang.String serverType) {
        this.serverType = serverType;
    }


    /**
     * Gets the queueStatus value for this ServerJobQueue.
     * 
     * @return queueStatus
     */
    public java.lang.String getQueueStatus() {
        return queueStatus;
    }


    /**
     * Sets the queueStatus value for this ServerJobQueue.
     * 
     * @param queueStatus
     */
    public void setQueueStatus(java.lang.String queueStatus) {
        this.queueStatus = queueStatus;
    }


    /**
     * Gets the statusDetails value for this ServerJobQueue.
     * 
     * @return statusDetails
     */
    public java.lang.String getStatusDetails() {
        return statusDetails;
    }


    /**
     * Sets the statusDetails value for this ServerJobQueue.
     * 
     * @param statusDetails
     */
    public void setStatusDetails(java.lang.String statusDetails) {
        this.statusDetails = statusDetails;
    }


    /**
     * Gets the networkAddress value for this ServerJobQueue.
     * 
     * @return networkAddress
     */
    public java.lang.String getNetworkAddress() {
        return networkAddress;
    }


    /**
     * Sets the networkAddress value for this ServerJobQueue.
     * 
     * @param networkAddress
     */
    public void setNetworkAddress(java.lang.String networkAddress) {
        this.networkAddress = networkAddress;
    }


    /**
     * Gets the port value for this ServerJobQueue.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this ServerJobQueue.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServerJobQueue)) return false;
        ServerJobQueue other = (ServerJobQueue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queueName==null && other.getQueueName()==null) || 
             (this.queueName!=null &&
              this.queueName.equals(other.getQueueName()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.serverType==null && other.getServerType()==null) || 
             (this.serverType!=null &&
              this.serverType.equals(other.getServerType()))) &&
            ((this.queueStatus==null && other.getQueueStatus()==null) || 
             (this.queueStatus!=null &&
              this.queueStatus.equals(other.getQueueStatus()))) &&
            ((this.statusDetails==null && other.getStatusDetails()==null) || 
             (this.statusDetails!=null &&
              this.statusDetails.equals(other.getStatusDetails()))) &&
            ((this.networkAddress==null && other.getNetworkAddress()==null) || 
             (this.networkAddress!=null &&
              this.networkAddress.equals(other.getNetworkAddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort())));
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
        if (getQueueName() != null) {
            _hashCode += getQueueName().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getServerType() != null) {
            _hashCode += getServerType().hashCode();
        }
        if (getQueueStatus() != null) {
            _hashCode += getQueueStatus().hashCode();
        }
        if (getStatusDetails() != null) {
            _hashCode += getStatusDetails().hashCode();
        }
        if (getNetworkAddress() != null) {
            _hashCode += getNetworkAddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServerJobQueue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerType"));
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
        elemField.setFieldName("networkAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NetworkAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Port"));
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
