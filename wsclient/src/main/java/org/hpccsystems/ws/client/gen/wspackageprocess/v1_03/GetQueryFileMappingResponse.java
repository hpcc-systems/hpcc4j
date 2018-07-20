/**
 * GetQueryFileMappingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class GetQueryFileMappingResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions;

    private java.lang.String[] unmappedFiles;

    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.SuperFile[] superFiles;

    public GetQueryFileMappingResponse() {
    }

    public GetQueryFileMappingResponse(
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions,
           java.lang.String[] unmappedFiles,
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.SuperFile[] superFiles) {
           this.exceptions = exceptions;
           this.unmappedFiles = unmappedFiles;
           this.superFiles = superFiles;
    }


    /**
     * Gets the exceptions value for this GetQueryFileMappingResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetQueryFileMappingResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the unmappedFiles value for this GetQueryFileMappingResponse.
     * 
     * @return unmappedFiles
     */
    public java.lang.String[] getUnmappedFiles() {
        return unmappedFiles;
    }


    /**
     * Sets the unmappedFiles value for this GetQueryFileMappingResponse.
     * 
     * @param unmappedFiles
     */
    public void setUnmappedFiles(java.lang.String[] unmappedFiles) {
        this.unmappedFiles = unmappedFiles;
    }


    /**
     * Gets the superFiles value for this GetQueryFileMappingResponse.
     * 
     * @return superFiles
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.SuperFile[] getSuperFiles() {
        return superFiles;
    }


    /**
     * Sets the superFiles value for this GetQueryFileMappingResponse.
     * 
     * @param superFiles
     */
    public void setSuperFiles(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.SuperFile[] superFiles) {
        this.superFiles = superFiles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQueryFileMappingResponse)) return false;
        GetQueryFileMappingResponse other = (GetQueryFileMappingResponse) obj;
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
            ((this.unmappedFiles==null && other.getUnmappedFiles()==null) || 
             (this.unmappedFiles!=null &&
              java.util.Arrays.equals(this.unmappedFiles, other.getUnmappedFiles()))) &&
            ((this.superFiles==null && other.getSuperFiles()==null) || 
             (this.superFiles!=null &&
              java.util.Arrays.equals(this.superFiles, other.getSuperFiles())));
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
        if (getUnmappedFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnmappedFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnmappedFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuperFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuperFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuperFiles(), i);
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
        new org.apache.axis.description.TypeDesc(GetQueryFileMappingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">GetQueryFileMappingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmappedFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "UnmappedFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "File"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "SuperFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "SuperFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "SuperFile"));
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
