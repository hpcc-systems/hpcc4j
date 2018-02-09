/**
 * LockQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_2;

public class LockQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wssmc.v1_2.Lock[] locks;

    private java.lang.Integer numLocks;

    public LockQueryResponse() {
    }

    public LockQueryResponse(
           org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wssmc.v1_2.Lock[] locks,
           java.lang.Integer numLocks) {
           this.exceptions = exceptions;
           this.locks = locks;
           this.numLocks = numLocks;
    }


    /**
     * Gets the exceptions value for this LockQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this LockQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the locks value for this LockQueryResponse.
     * 
     * @return locks
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.Lock[] getLocks() {
        return locks;
    }


    /**
     * Sets the locks value for this LockQueryResponse.
     * 
     * @param locks
     */
    public void setLocks(org.hpccsystems.ws.client.gen.wssmc.v1_2.Lock[] locks) {
        this.locks = locks;
    }


    /**
     * Gets the numLocks value for this LockQueryResponse.
     * 
     * @return numLocks
     */
    public java.lang.Integer getNumLocks() {
        return numLocks;
    }


    /**
     * Sets the numLocks value for this LockQueryResponse.
     * 
     * @param numLocks
     */
    public void setNumLocks(java.lang.Integer numLocks) {
        this.numLocks = numLocks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LockQueryResponse)) return false;
        LockQueryResponse other = (LockQueryResponse) obj;
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
            ((this.locks==null && other.getLocks()==null) || 
             (this.locks!=null &&
              java.util.Arrays.equals(this.locks, other.getLocks()))) &&
            ((this.numLocks==null && other.getNumLocks()==null) || 
             (this.numLocks!=null &&
              this.numLocks.equals(other.getNumLocks())));
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
        if (getLocks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumLocks() != null) {
            _hashCode += getNumLocks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LockQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">LockQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Locks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Lock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Lock"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLocks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NumLocks"));
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
