/**
 * DFUFileCreateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileCreateResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions;

    private java.lang.String fileId;

    private java.lang.String warning;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo accessInfo;

    public DFUFileCreateResponse() {
    }

    public DFUFileCreateResponse(
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions,
           java.lang.String fileId,
           java.lang.String warning,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo accessInfo) {
           this.exceptions = exceptions;
           this.fileId = fileId;
           this.warning = warning;
           this.accessInfo = accessInfo;
    }


    /**
     * Gets the exceptions value for this DFUFileCreateResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUFileCreateResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the fileId value for this DFUFileCreateResponse.
     * 
     * @return fileId
     */
    public java.lang.String getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this DFUFileCreateResponse.
     * 
     * @param fileId
     */
    public void setFileId(java.lang.String fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the warning value for this DFUFileCreateResponse.
     * 
     * @return warning
     */
    public java.lang.String getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this DFUFileCreateResponse.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String warning) {
        this.warning = warning;
    }


    /**
     * Gets the accessInfo value for this DFUFileCreateResponse.
     * 
     * @return accessInfo
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo getAccessInfo() {
        return accessInfo;
    }


    /**
     * Sets the accessInfo value for this DFUFileCreateResponse.
     * 
     * @param accessInfo
     */
    public void setAccessInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileCreateResponse)) return false;
        DFUFileCreateResponse other = (DFUFileCreateResponse) obj;
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
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning()))) &&
            ((this.accessInfo==null && other.getAccessInfo()==null) || 
             (this.accessInfo!=null &&
              this.accessInfo.equals(other.getAccessInfo())));
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
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        if (getAccessInfo() != null) {
            _hashCode += getAccessInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileCreateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileCreateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AccessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileAccessInfo"));
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
