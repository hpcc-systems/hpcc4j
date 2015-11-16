/**
 * WUGetGraphNameAndTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUGetGraphNameAndTypesResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NameAndType[] graphNameAndTypes;

    public WUGetGraphNameAndTypesResponse() {
    }

    public WUGetGraphNameAndTypesResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NameAndType[] graphNameAndTypes) {
           this.exceptions = exceptions;
           this.graphNameAndTypes = graphNameAndTypes;
    }


    /**
     * Gets the exceptions value for this WUGetGraphNameAndTypesResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUGetGraphNameAndTypesResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the graphNameAndTypes value for this WUGetGraphNameAndTypesResponse.
     * 
     * @return graphNameAndTypes
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NameAndType[] getGraphNameAndTypes() {
        return graphNameAndTypes;
    }


    /**
     * Sets the graphNameAndTypes value for this WUGetGraphNameAndTypesResponse.
     * 
     * @param graphNameAndTypes
     */
    public void setGraphNameAndTypes(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NameAndType[] graphNameAndTypes) {
        this.graphNameAndTypes = graphNameAndTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUGetGraphNameAndTypesResponse)) return false;
        WUGetGraphNameAndTypesResponse other = (WUGetGraphNameAndTypesResponse) obj;
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
            ((this.graphNameAndTypes==null && other.getGraphNameAndTypes()==null) || 
             (this.graphNameAndTypes!=null &&
              java.util.Arrays.equals(this.graphNameAndTypes, other.getGraphNameAndTypes())));
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
        if (getGraphNameAndTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGraphNameAndTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGraphNameAndTypes(), i);
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
        new org.apache.axis.description.TypeDesc(WUGetGraphNameAndTypesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphNameAndTypesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphNameAndTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphNameAndTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NameAndType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphNameAndType"));
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
