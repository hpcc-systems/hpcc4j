/**
 * PublishHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class PublishHistory  implements java.io.Serializable {
    private java.lang.String publishBy;

    private java.lang.String createdTime;

    private java.lang.String lastEditBy;

    private java.lang.String lastEditTime;

    public PublishHistory() {
    }

    public PublishHistory(
           java.lang.String publishBy,
           java.lang.String createdTime,
           java.lang.String lastEditBy,
           java.lang.String lastEditTime) {
           this.publishBy = publishBy;
           this.createdTime = createdTime;
           this.lastEditBy = lastEditBy;
           this.lastEditTime = lastEditTime;
    }


    /**
     * Gets the publishBy value for this PublishHistory.
     * 
     * @return publishBy
     */
    public java.lang.String getPublishBy() {
        return publishBy;
    }


    /**
     * Sets the publishBy value for this PublishHistory.
     * 
     * @param publishBy
     */
    public void setPublishBy(java.lang.String publishBy) {
        this.publishBy = publishBy;
    }


    /**
     * Gets the createdTime value for this PublishHistory.
     * 
     * @return createdTime
     */
    public java.lang.String getCreatedTime() {
        return createdTime;
    }


    /**
     * Sets the createdTime value for this PublishHistory.
     * 
     * @param createdTime
     */
    public void setCreatedTime(java.lang.String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * Gets the lastEditBy value for this PublishHistory.
     * 
     * @return lastEditBy
     */
    public java.lang.String getLastEditBy() {
        return lastEditBy;
    }


    /**
     * Sets the lastEditBy value for this PublishHistory.
     * 
     * @param lastEditBy
     */
    public void setLastEditBy(java.lang.String lastEditBy) {
        this.lastEditBy = lastEditBy;
    }


    /**
     * Gets the lastEditTime value for this PublishHistory.
     * 
     * @return lastEditTime
     */
    public java.lang.String getLastEditTime() {
        return lastEditTime;
    }


    /**
     * Sets the lastEditTime value for this PublishHistory.
     * 
     * @param lastEditTime
     */
    public void setLastEditTime(java.lang.String lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishHistory)) return false;
        PublishHistory other = (PublishHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publishBy==null && other.getPublishBy()==null) || 
             (this.publishBy!=null &&
              this.publishBy.equals(other.getPublishBy()))) &&
            ((this.createdTime==null && other.getCreatedTime()==null) || 
             (this.createdTime!=null &&
              this.createdTime.equals(other.getCreatedTime()))) &&
            ((this.lastEditBy==null && other.getLastEditBy()==null) || 
             (this.lastEditBy!=null &&
              this.lastEditBy.equals(other.getLastEditBy()))) &&
            ((this.lastEditTime==null && other.getLastEditTime()==null) || 
             (this.lastEditTime!=null &&
              this.lastEditTime.equals(other.getLastEditTime())));
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
        if (getPublishBy() != null) {
            _hashCode += getPublishBy().hashCode();
        }
        if (getCreatedTime() != null) {
            _hashCode += getCreatedTime().hashCode();
        }
        if (getLastEditBy() != null) {
            _hashCode += getLastEditBy().hashCode();
        }
        if (getLastEditTime() != null) {
            _hashCode += getLastEditTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "PublishHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "PublishBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "CreatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastEditBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "LastEditBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastEditTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "LastEditTime"));
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
