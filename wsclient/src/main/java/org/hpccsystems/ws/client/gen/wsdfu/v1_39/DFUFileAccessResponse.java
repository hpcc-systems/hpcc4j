/**
 * DFUFileAccessResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_39;

public class DFUFileAccessResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException exceptions;

    private java.lang.String metaInfoBlob;

    private java.lang.String expiryTime;

    private java.lang.Integer numParts;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocations[] filePartLocations;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartCopies[] fileParts;

    private byte[] recordTypeInfoBin;

    private java.lang.String recordTypeInfoJson;

    public DFUFileAccessResponse() {
    }

    public DFUFileAccessResponse(
           org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException exceptions,
           java.lang.String metaInfoBlob,
           java.lang.String expiryTime,
           java.lang.Integer numParts,
           org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocations[] filePartLocations,
           org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartCopies[] fileParts,
           byte[] recordTypeInfoBin,
           java.lang.String recordTypeInfoJson) {
           this.exceptions = exceptions;
           this.metaInfoBlob = metaInfoBlob;
           this.expiryTime = expiryTime;
           this.numParts = numParts;
           this.filePartLocations = filePartLocations;
           this.fileParts = fileParts;
           this.recordTypeInfoBin = recordTypeInfoBin;
           this.recordTypeInfoJson = recordTypeInfoJson;
    }


    /**
     * Gets the exceptions value for this DFUFileAccessResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUFileAccessResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the metaInfoBlob value for this DFUFileAccessResponse.
     * 
     * @return metaInfoBlob
     */
    public java.lang.String getMetaInfoBlob() {
        return metaInfoBlob;
    }


    /**
     * Sets the metaInfoBlob value for this DFUFileAccessResponse.
     * 
     * @param metaInfoBlob
     */
    public void setMetaInfoBlob(java.lang.String metaInfoBlob) {
        this.metaInfoBlob = metaInfoBlob;
    }


    /**
     * Gets the expiryTime value for this DFUFileAccessResponse.
     * 
     * @return expiryTime
     */
    public java.lang.String getExpiryTime() {
        return expiryTime;
    }


    /**
     * Sets the expiryTime value for this DFUFileAccessResponse.
     * 
     * @param expiryTime
     */
    public void setExpiryTime(java.lang.String expiryTime) {
        this.expiryTime = expiryTime;
    }


    /**
     * Gets the numParts value for this DFUFileAccessResponse.
     * 
     * @return numParts
     */
    public java.lang.Integer getNumParts() {
        return numParts;
    }


    /**
     * Sets the numParts value for this DFUFileAccessResponse.
     * 
     * @param numParts
     */
    public void setNumParts(java.lang.Integer numParts) {
        this.numParts = numParts;
    }


    /**
     * Gets the filePartLocations value for this DFUFileAccessResponse.
     * 
     * @return filePartLocations
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocations[] getFilePartLocations() {
        return filePartLocations;
    }


    /**
     * Sets the filePartLocations value for this DFUFileAccessResponse.
     * 
     * @param filePartLocations
     */
    public void setFilePartLocations(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartLocations[] filePartLocations) {
        this.filePartLocations = filePartLocations;
    }


    /**
     * Gets the fileParts value for this DFUFileAccessResponse.
     * 
     * @return fileParts
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartCopies[] getFileParts() {
        return fileParts;
    }


    /**
     * Sets the fileParts value for this DFUFileAccessResponse.
     * 
     * @param fileParts
     */
    public void setFileParts(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUPartCopies[] fileParts) {
        this.fileParts = fileParts;
    }


    /**
     * Gets the recordTypeInfoBin value for this DFUFileAccessResponse.
     * 
     * @return recordTypeInfoBin
     */
    public byte[] getRecordTypeInfoBin() {
        return recordTypeInfoBin;
    }


    /**
     * Sets the recordTypeInfoBin value for this DFUFileAccessResponse.
     * 
     * @param recordTypeInfoBin
     */
    public void setRecordTypeInfoBin(byte[] recordTypeInfoBin) {
        this.recordTypeInfoBin = recordTypeInfoBin;
    }


    /**
     * Gets the recordTypeInfoJson value for this DFUFileAccessResponse.
     * 
     * @return recordTypeInfoJson
     */
    public java.lang.String getRecordTypeInfoJson() {
        return recordTypeInfoJson;
    }


    /**
     * Sets the recordTypeInfoJson value for this DFUFileAccessResponse.
     * 
     * @param recordTypeInfoJson
     */
    public void setRecordTypeInfoJson(java.lang.String recordTypeInfoJson) {
        this.recordTypeInfoJson = recordTypeInfoJson;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileAccessResponse)) return false;
        DFUFileAccessResponse other = (DFUFileAccessResponse) obj;
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
            ((this.metaInfoBlob==null && other.getMetaInfoBlob()==null) || 
             (this.metaInfoBlob!=null &&
              this.metaInfoBlob.equals(other.getMetaInfoBlob()))) &&
            ((this.expiryTime==null && other.getExpiryTime()==null) || 
             (this.expiryTime!=null &&
              this.expiryTime.equals(other.getExpiryTime()))) &&
            ((this.numParts==null && other.getNumParts()==null) || 
             (this.numParts!=null &&
              this.numParts.equals(other.getNumParts()))) &&
            ((this.filePartLocations==null && other.getFilePartLocations()==null) || 
             (this.filePartLocations!=null &&
              java.util.Arrays.equals(this.filePartLocations, other.getFilePartLocations()))) &&
            ((this.fileParts==null && other.getFileParts()==null) || 
             (this.fileParts!=null &&
              java.util.Arrays.equals(this.fileParts, other.getFileParts()))) &&
            ((this.recordTypeInfoBin==null && other.getRecordTypeInfoBin()==null) || 
             (this.recordTypeInfoBin!=null &&
              java.util.Arrays.equals(this.recordTypeInfoBin, other.getRecordTypeInfoBin()))) &&
            ((this.recordTypeInfoJson==null && other.getRecordTypeInfoJson()==null) || 
             (this.recordTypeInfoJson!=null &&
              this.recordTypeInfoJson.equals(other.getRecordTypeInfoJson())));
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
        if (getMetaInfoBlob() != null) {
            _hashCode += getMetaInfoBlob().hashCode();
        }
        if (getExpiryTime() != null) {
            _hashCode += getExpiryTime().hashCode();
        }
        if (getNumParts() != null) {
            _hashCode += getNumParts().hashCode();
        }
        if (getFilePartLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilePartLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilePartLocations(), i);
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
        if (getRecordTypeInfoBin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypeInfoBin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordTypeInfoBin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordTypeInfoJson() != null) {
            _hashCode += getRecordTypeInfoJson().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileAccessResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileAccessResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("filePartLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilePartLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartLocations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartLocations"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileParts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartCopies"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartCopies"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeInfoBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordTypeInfoBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeInfoJson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordTypeInfoJson"));
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
