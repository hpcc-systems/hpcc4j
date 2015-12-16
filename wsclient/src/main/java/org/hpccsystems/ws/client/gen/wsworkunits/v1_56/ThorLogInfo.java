/**
 * ThorLogInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class ThorLogInfo  implements java.io.Serializable {
    private java.lang.String processName;

    private java.lang.String clusterGroup;

    private java.lang.String logDate;

    private java.lang.Integer numberSlaves;

    public ThorLogInfo() {
    }

    public ThorLogInfo(
           java.lang.String processName,
           java.lang.String clusterGroup,
           java.lang.String logDate,
           java.lang.Integer numberSlaves) {
           this.processName = processName;
           this.clusterGroup = clusterGroup;
           this.logDate = logDate;
           this.numberSlaves = numberSlaves;
    }


    /**
     * Gets the processName value for this ThorLogInfo.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this ThorLogInfo.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the clusterGroup value for this ThorLogInfo.
     * 
     * @return clusterGroup
     */
    public java.lang.String getClusterGroup() {
        return clusterGroup;
    }


    /**
     * Sets the clusterGroup value for this ThorLogInfo.
     * 
     * @param clusterGroup
     */
    public void setClusterGroup(java.lang.String clusterGroup) {
        this.clusterGroup = clusterGroup;
    }


    /**
     * Gets the logDate value for this ThorLogInfo.
     * 
     * @return logDate
     */
    public java.lang.String getLogDate() {
        return logDate;
    }


    /**
     * Sets the logDate value for this ThorLogInfo.
     * 
     * @param logDate
     */
    public void setLogDate(java.lang.String logDate) {
        this.logDate = logDate;
    }


    /**
     * Gets the numberSlaves value for this ThorLogInfo.
     * 
     * @return numberSlaves
     */
    public java.lang.Integer getNumberSlaves() {
        return numberSlaves;
    }


    /**
     * Sets the numberSlaves value for this ThorLogInfo.
     * 
     * @param numberSlaves
     */
    public void setNumberSlaves(java.lang.Integer numberSlaves) {
        this.numberSlaves = numberSlaves;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThorLogInfo)) return false;
        ThorLogInfo other = (ThorLogInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.clusterGroup==null && other.getClusterGroup()==null) || 
             (this.clusterGroup!=null &&
              this.clusterGroup.equals(other.getClusterGroup()))) &&
            ((this.logDate==null && other.getLogDate()==null) || 
             (this.logDate!=null &&
              this.logDate.equals(other.getLogDate()))) &&
            ((this.numberSlaves==null && other.getNumberSlaves()==null) || 
             (this.numberSlaves!=null &&
              this.numberSlaves.equals(other.getNumberSlaves())));
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
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getClusterGroup() != null) {
            _hashCode += getClusterGroup().hashCode();
        }
        if (getLogDate() != null) {
            _hashCode += getLogDate().hashCode();
        }
        if (getNumberSlaves() != null) {
            _hashCode += getNumberSlaves().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThorLogInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLogInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ProcessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberSlaves");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NumberSlaves"));
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
