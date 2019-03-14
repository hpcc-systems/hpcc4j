/**
 * DropZoneFileSearchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_17;

public class DropZoneFileSearchResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.filespray.v1_17.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.filespray.v1_17.PhysicalFileStruct[] files;

    private java.lang.String warning;

    public DropZoneFileSearchResponse() {
    }

    public DropZoneFileSearchResponse(
           org.hpccsystems.ws.client.gen.filespray.v1_17.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.filespray.v1_17.PhysicalFileStruct[] files,
           java.lang.String warning) {
           this.exceptions = exceptions;
           this.files = files;
           this.warning = warning;
    }


    /**
     * Gets the exceptions value for this DropZoneFileSearchResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.filespray.v1_17.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DropZoneFileSearchResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.filespray.v1_17.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the files value for this DropZoneFileSearchResponse.
     * 
     * @return files
     */
    public org.hpccsystems.ws.client.gen.filespray.v1_17.PhysicalFileStruct[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this DropZoneFileSearchResponse.
     * 
     * @param files
     */
    public void setFiles(org.hpccsystems.ws.client.gen.filespray.v1_17.PhysicalFileStruct[] files) {
        this.files = files;
    }


    /**
     * Gets the warning value for this DropZoneFileSearchResponse.
     * 
     * @return warning
     */
    public java.lang.String getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this DropZoneFileSearchResponse.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String warning) {
        this.warning = warning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DropZoneFileSearchResponse)) return false;
        DropZoneFileSearchResponse other = (DropZoneFileSearchResponse) obj;
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
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning())));
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
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DropZoneFileSearchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFileSearchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Files"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Warning"));
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
