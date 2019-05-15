/**
 * DFUFileCreateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileCreateRequest  implements java.io.Serializable {
    private java.lang.String ECLRecordDefinition;

    private java.lang.String[] partLocations;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase requestBase;

    public DFUFileCreateRequest() {
    }

    public DFUFileCreateRequest(
           java.lang.String ECLRecordDefinition,
           java.lang.String[] partLocations,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase requestBase) {
           this.ECLRecordDefinition = ECLRecordDefinition;
           this.partLocations = partLocations;
           this.requestBase = requestBase;
    }


    /**
     * Gets the ECLRecordDefinition value for this DFUFileCreateRequest.
     * 
     * @return ECLRecordDefinition
     */
    public java.lang.String getECLRecordDefinition() {
        return ECLRecordDefinition;
    }


    /**
     * Sets the ECLRecordDefinition value for this DFUFileCreateRequest.
     * 
     * @param ECLRecordDefinition
     */
    public void setECLRecordDefinition(java.lang.String ECLRecordDefinition) {
        this.ECLRecordDefinition = ECLRecordDefinition;
    }


    /**
     * Gets the partLocations value for this DFUFileCreateRequest.
     * 
     * @return partLocations
     */
    public java.lang.String[] getPartLocations() {
        return partLocations;
    }


    /**
     * Sets the partLocations value for this DFUFileCreateRequest.
     * 
     * @param partLocations
     */
    public void setPartLocations(java.lang.String[] partLocations) {
        this.partLocations = partLocations;
    }


    /**
     * Gets the requestBase value for this DFUFileCreateRequest.
     * 
     * @return requestBase
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase getRequestBase() {
        return requestBase;
    }


    /**
     * Sets the requestBase value for this DFUFileCreateRequest.
     * 
     * @param requestBase
     */
    public void setRequestBase(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase requestBase) {
        this.requestBase = requestBase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileCreateRequest)) return false;
        DFUFileCreateRequest other = (DFUFileCreateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ECLRecordDefinition==null && other.getECLRecordDefinition()==null) || 
             (this.ECLRecordDefinition!=null &&
              this.ECLRecordDefinition.equals(other.getECLRecordDefinition()))) &&
            ((this.partLocations==null && other.getPartLocations()==null) || 
             (this.partLocations!=null &&
              java.util.Arrays.equals(this.partLocations, other.getPartLocations()))) &&
            ((this.requestBase==null && other.getRequestBase()==null) || 
             (this.requestBase!=null &&
              this.requestBase.equals(other.getRequestBase())));
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
        if (getECLRecordDefinition() != null) {
            _hashCode += getECLRecordDefinition().hashCode();
        }
        if (getPartLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestBase() != null) {
            _hashCode += getRequestBase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileCreateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileCreateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECLRecordDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ECLRecordDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PartLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RequestBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileAccessRequestBase"));
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
