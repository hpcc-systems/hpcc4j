/**
 * DFUFileAccessInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileAccessInfo  implements java.io.Serializable {
    private java.lang.String metaInfoBlob;

    private java.lang.String expiryTime;

    private java.lang.Integer numParts;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUPartLocation[] fileLocations;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePart[] fileParts;

    private java.lang.String recordTypeInfoJson;

    private java.lang.Integer fileAccessPort;

    private java.lang.Boolean fileAccessSSL;

    public DFUFileAccessInfo() {
    }

    public DFUFileAccessInfo(
           java.lang.String metaInfoBlob,
           java.lang.String expiryTime,
           java.lang.Integer numParts,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUPartLocation[] fileLocations,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePart[] fileParts,
           java.lang.String recordTypeInfoJson,
           java.lang.Integer fileAccessPort,
           java.lang.Boolean fileAccessSSL) {
           this.metaInfoBlob = metaInfoBlob;
           this.expiryTime = expiryTime;
           this.numParts = numParts;
           this.fileLocations = fileLocations;
           this.fileParts = fileParts;
           this.recordTypeInfoJson = recordTypeInfoJson;
           this.fileAccessPort = fileAccessPort;
           this.fileAccessSSL = fileAccessSSL;
    }


    /**
     * Gets the metaInfoBlob value for this DFUFileAccessInfo.
     * 
     * @return metaInfoBlob
     */
    public java.lang.String getMetaInfoBlob() {
        return metaInfoBlob;
    }


    /**
     * Sets the metaInfoBlob value for this DFUFileAccessInfo.
     * 
     * @param metaInfoBlob
     */
    public void setMetaInfoBlob(java.lang.String metaInfoBlob) {
        this.metaInfoBlob = metaInfoBlob;
    }


    /**
     * Gets the expiryTime value for this DFUFileAccessInfo.
     * 
     * @return expiryTime
     */
    public java.lang.String getExpiryTime() {
        return expiryTime;
    }


    /**
     * Sets the expiryTime value for this DFUFileAccessInfo.
     * 
     * @param expiryTime
     */
    public void setExpiryTime(java.lang.String expiryTime) {
        this.expiryTime = expiryTime;
    }


    /**
     * Gets the numParts value for this DFUFileAccessInfo.
     * 
     * @return numParts
     */
    public java.lang.Integer getNumParts() {
        return numParts;
    }


    /**
     * Sets the numParts value for this DFUFileAccessInfo.
     * 
     * @param numParts
     */
    public void setNumParts(java.lang.Integer numParts) {
        this.numParts = numParts;
    }


    /**
     * Gets the fileLocations value for this DFUFileAccessInfo.
     * 
     * @return fileLocations
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUPartLocation[] getFileLocations() {
        return fileLocations;
    }


    /**
     * Sets the fileLocations value for this DFUFileAccessInfo.
     * 
     * @param fileLocations
     */
    public void setFileLocations(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUPartLocation[] fileLocations) {
        this.fileLocations = fileLocations;
    }


    /**
     * Gets the fileParts value for this DFUFileAccessInfo.
     * 
     * @return fileParts
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePart[] getFileParts() {
        return fileParts;
    }


    /**
     * Sets the fileParts value for this DFUFileAccessInfo.
     * 
     * @param fileParts
     */
    public void setFileParts(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePart[] fileParts) {
        this.fileParts = fileParts;
    }


    /**
     * Gets the recordTypeInfoJson value for this DFUFileAccessInfo.
     * 
     * @return recordTypeInfoJson
     */
    public java.lang.String getRecordTypeInfoJson() {
        return recordTypeInfoJson;
    }


    /**
     * Sets the recordTypeInfoJson value for this DFUFileAccessInfo.
     * 
     * @param recordTypeInfoJson
     */
    public void setRecordTypeInfoJson(java.lang.String recordTypeInfoJson) {
        this.recordTypeInfoJson = recordTypeInfoJson;
    }


    /**
     * Gets the fileAccessPort value for this DFUFileAccessInfo.
     * 
     * @return fileAccessPort
     */
    public java.lang.Integer getFileAccessPort() {
        return fileAccessPort;
    }


    /**
     * Sets the fileAccessPort value for this DFUFileAccessInfo.
     * 
     * @param fileAccessPort
     */
    public void setFileAccessPort(java.lang.Integer fileAccessPort) {
        this.fileAccessPort = fileAccessPort;
    }


    /**
     * Gets the fileAccessSSL value for this DFUFileAccessInfo.
     * 
     * @return fileAccessSSL
     */
    public java.lang.Boolean getFileAccessSSL() {
        return fileAccessSSL;
    }


    /**
     * Sets the fileAccessSSL value for this DFUFileAccessInfo.
     * 
     * @param fileAccessSSL
     */
    public void setFileAccessSSL(java.lang.Boolean fileAccessSSL) {
        this.fileAccessSSL = fileAccessSSL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileAccessInfo)) return false;
        DFUFileAccessInfo other = (DFUFileAccessInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metaInfoBlob==null && other.getMetaInfoBlob()==null) || 
             (this.metaInfoBlob!=null &&
              this.metaInfoBlob.equals(other.getMetaInfoBlob()))) &&
            ((this.expiryTime==null && other.getExpiryTime()==null) || 
             (this.expiryTime!=null &&
              this.expiryTime.equals(other.getExpiryTime()))) &&
            ((this.numParts==null && other.getNumParts()==null) || 
             (this.numParts!=null &&
              this.numParts.equals(other.getNumParts()))) &&
            ((this.fileLocations==null && other.getFileLocations()==null) || 
             (this.fileLocations!=null &&
              java.util.Arrays.equals(this.fileLocations, other.getFileLocations()))) &&
            ((this.fileParts==null && other.getFileParts()==null) || 
             (this.fileParts!=null &&
              java.util.Arrays.equals(this.fileParts, other.getFileParts()))) &&
            ((this.recordTypeInfoJson==null && other.getRecordTypeInfoJson()==null) || 
             (this.recordTypeInfoJson!=null &&
              this.recordTypeInfoJson.equals(other.getRecordTypeInfoJson()))) &&
            ((this.fileAccessPort==null && other.getFileAccessPort()==null) || 
             (this.fileAccessPort!=null &&
              this.fileAccessPort.equals(other.getFileAccessPort()))) &&
            ((this.fileAccessSSL==null && other.getFileAccessSSL()==null) || 
             (this.fileAccessSSL!=null &&
              this.fileAccessSSL.equals(other.getFileAccessSSL())));
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
        if (getMetaInfoBlob() != null) {
            _hashCode += getMetaInfoBlob().hashCode();
        }
        if (getExpiryTime() != null) {
            _hashCode += getExpiryTime().hashCode();
        }
        if (getNumParts() != null) {
            _hashCode += getNumParts().hashCode();
        }
        if (getFileLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileParts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordTypeInfoJson() != null) {
            _hashCode += getRecordTypeInfoJson().hashCode();
        }
        if (getFileAccessPort() != null) {
            _hashCode += getFileAccessPort().hashCode();
        }
        if (getFileAccessSSL() != null) {
            _hashCode += getFileAccessSSL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileAccessInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileAccessInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaInfoBlob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MetaInfoBlob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExpiryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numParts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartLocation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileParts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePart"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeInfoJson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordTypeInfoJson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileAccessPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "fileAccessPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileAccessSSL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "fileAccessSSL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
