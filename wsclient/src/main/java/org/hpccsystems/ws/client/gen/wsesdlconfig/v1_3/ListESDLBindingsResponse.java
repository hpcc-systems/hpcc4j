/**
 * ListESDLBindingsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3;

public class ListESDLBindingsResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException exceptions;

    private java.lang.String bindingsXML;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ESDLBinding[] bindings;

    public ListESDLBindingsResponse() {
    }

    public ListESDLBindingsResponse(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException exceptions,
           java.lang.String bindingsXML,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ESDLBinding[] bindings) {
           this.exceptions = exceptions;
           this.bindingsXML = bindingsXML;
           this.bindings = bindings;
    }


    /**
     * Gets the exceptions value for this ListESDLBindingsResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ListESDLBindingsResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the bindingsXML value for this ListESDLBindingsResponse.
     * 
     * @return bindingsXML
     */
    public java.lang.String getBindingsXML() {
        return bindingsXML;
    }


    /**
     * Sets the bindingsXML value for this ListESDLBindingsResponse.
     * 
     * @param bindingsXML
     */
    public void setBindingsXML(java.lang.String bindingsXML) {
        this.bindingsXML = bindingsXML;
    }


    /**
     * Gets the bindings value for this ListESDLBindingsResponse.
     * 
     * @return bindings
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ESDLBinding[] getBindings() {
        return bindings;
    }


    /**
     * Sets the bindings value for this ListESDLBindingsResponse.
     * 
     * @param bindings
     */
    public void setBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ESDLBinding[] bindings) {
        this.bindings = bindings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListESDLBindingsResponse)) return false;
        ListESDLBindingsResponse other = (ListESDLBindingsResponse) obj;
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
            ((this.bindingsXML==null && other.getBindingsXML()==null) || 
             (this.bindingsXML!=null &&
              this.bindingsXML.equals(other.getBindingsXML()))) &&
            ((this.bindings==null && other.getBindings()==null) || 
             (this.bindings!=null &&
              java.util.Arrays.equals(this.bindings, other.getBindings())));
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
        if (getBindingsXML() != null) {
            _hashCode += getBindingsXML().hashCode();
        }
        if (getBindings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBindings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBindings(), i);
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
        new org.apache.axis.description.TypeDesc(ListESDLBindingsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">ListESDLBindingsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingsXML");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "BindingsXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Bindings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLBinding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Binding"));
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
