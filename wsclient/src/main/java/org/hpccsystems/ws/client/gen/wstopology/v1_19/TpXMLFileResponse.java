/**
 * TpXMLFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_19;

public class TpXMLFileResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions;

    private byte[] thefile;

    public TpXMLFileResponse() {
    }

    public TpXMLFileResponse(
           org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions,
           byte[] thefile) {
           this.exceptions = exceptions;
           this.thefile = thefile;
    }


    /**
     * Gets the exceptions value for this TpXMLFileResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpXMLFileResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the thefile value for this TpXMLFileResponse.
     * 
     * @return thefile
     */
    public byte[] getThefile() {
        return thefile;
    }


    /**
     * Sets the thefile value for this TpXMLFileResponse.
     * 
     * @param thefile
     */
    public void setThefile(byte[] thefile) {
        this.thefile = thefile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpXMLFileResponse)) return false;
        TpXMLFileResponse other = (TpXMLFileResponse) obj;
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
            ((this.thefile==null && other.getThefile()==null) || 
             (this.thefile!=null &&
              java.util.Arrays.equals(this.thefile, other.getThefile())));
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
        if (getThefile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThefile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThefile(), i);
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
        new org.apache.axis.description.TypeDesc(TpXMLFileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpXMLFileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thefile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "thefile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
