/**
 * WUCopyQuerySetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUCopyQuerySetResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.String[] copiedQueries;

    private java.lang.String[] existingQueries;

    public WUCopyQuerySetResponse() {
    }

    public WUCopyQuerySetResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.String[] copiedQueries,
           java.lang.String[] existingQueries) {
           this.exceptions = exceptions;
           this.copiedQueries = copiedQueries;
           this.existingQueries = existingQueries;
    }


    /**
     * Gets the exceptions value for this WUCopyQuerySetResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUCopyQuerySetResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the copiedQueries value for this WUCopyQuerySetResponse.
     * 
     * @return copiedQueries
     */
    public java.lang.String[] getCopiedQueries() {
        return copiedQueries;
    }


    /**
     * Sets the copiedQueries value for this WUCopyQuerySetResponse.
     * 
     * @param copiedQueries
     */
    public void setCopiedQueries(java.lang.String[] copiedQueries) {
        this.copiedQueries = copiedQueries;
    }


    /**
     * Gets the existingQueries value for this WUCopyQuerySetResponse.
     * 
     * @return existingQueries
     */
    public java.lang.String[] getExistingQueries() {
        return existingQueries;
    }


    /**
     * Sets the existingQueries value for this WUCopyQuerySetResponse.
     * 
     * @param existingQueries
     */
    public void setExistingQueries(java.lang.String[] existingQueries) {
        this.existingQueries = existingQueries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUCopyQuerySetResponse)) return false;
        WUCopyQuerySetResponse other = (WUCopyQuerySetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.copiedQueries==null && other.getCopiedQueries()==null) || 
             (this.copiedQueries!=null &&
              java.util.Arrays.equals(this.copiedQueries, other.getCopiedQueries()))) &&
            ((this.existingQueries==null && other.getExistingQueries()==null) || 
             (this.existingQueries!=null &&
              java.util.Arrays.equals(this.existingQueries, other.getExistingQueries())));
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
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getCopiedQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopiedQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopiedQueries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExistingQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExistingQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExistingQueries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUCopyQuerySetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyQuerySetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copiedQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CopiedQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ExistingQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
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
