/**
 * ResubmittedWU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class ResubmittedWU  implements java.io.Serializable {
    private java.lang.String WUID;

    private java.lang.String parentWUID;

    public ResubmittedWU() {
    }

    public ResubmittedWU(
           java.lang.String WUID,
           java.lang.String parentWUID) {
           this.WUID = WUID;
           this.parentWUID = parentWUID;
    }


    /**
     * Gets the WUID value for this ResubmittedWU.
     * 
     * @return WUID
     */
    public java.lang.String getWUID() {
        return WUID;
    }


    /**
     * Sets the WUID value for this ResubmittedWU.
     * 
     * @param WUID
     */
    public void setWUID(java.lang.String WUID) {
        this.WUID = WUID;
    }


    /**
     * Gets the parentWUID value for this ResubmittedWU.
     * 
     * @return parentWUID
     */
    public java.lang.String getParentWUID() {
        return parentWUID;
    }


    /**
     * Sets the parentWUID value for this ResubmittedWU.
     * 
     * @param parentWUID
     */
    public void setParentWUID(java.lang.String parentWUID) {
        this.parentWUID = parentWUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResubmittedWU)) return false;
        ResubmittedWU other = (ResubmittedWU) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WUID==null && other.getWUID()==null) || 
             (this.WUID!=null &&
              this.WUID.equals(other.getWUID()))) &&
            ((this.parentWUID==null && other.getParentWUID()==null) || 
             (this.parentWUID!=null &&
              this.parentWUID.equals(other.getParentWUID())));
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
        if (getWUID() != null) {
            _hashCode += getWUID().hashCode();
        }
        if (getParentWUID() != null) {
            _hashCode += getParentWUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResubmittedWU.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResubmittedWU"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentWUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ParentWUID"));
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
