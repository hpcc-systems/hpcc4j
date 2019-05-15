/**
 * DFUFilePublishRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFilePublishRequest  implements java.io.Serializable {
    private java.lang.String fileId;

    private java.lang.Boolean overwrite;

    private byte[] fileDescriptorBlob;

    private java.lang.Long sessionId;

    private java.lang.Integer lockTimeoutMs;

    private java.lang.String ECLRecordDefinition;

    private java.lang.Long recordCount;

    private java.lang.Long fileSize;

    public DFUFilePublishRequest() {
    }

    public DFUFilePublishRequest(
           java.lang.String fileId,
           java.lang.Boolean overwrite,
           byte[] fileDescriptorBlob,
           java.lang.Long sessionId,
           java.lang.Integer lockTimeoutMs,
           java.lang.String ECLRecordDefinition,
           java.lang.Long recordCount,
           java.lang.Long fileSize) {
           this.fileId = fileId;
           this.overwrite = overwrite;
           this.fileDescriptorBlob = fileDescriptorBlob;
           this.sessionId = sessionId;
           this.lockTimeoutMs = lockTimeoutMs;
           this.ECLRecordDefinition = ECLRecordDefinition;
           this.recordCount = recordCount;
           this.fileSize = fileSize;
    }


    /**
     * Gets the fileId value for this DFUFilePublishRequest.
     * 
     * @return fileId
     */
    public java.lang.String getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this DFUFilePublishRequest.
     * 
     * @param fileId
     */
    public void setFileId(java.lang.String fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the overwrite value for this DFUFilePublishRequest.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this DFUFilePublishRequest.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the fileDescriptorBlob value for this DFUFilePublishRequest.
     * 
     * @return fileDescriptorBlob
     */
    public byte[] getFileDescriptorBlob() {
        return fileDescriptorBlob;
    }


    /**
     * Sets the fileDescriptorBlob value for this DFUFilePublishRequest.
     * 
     * @param fileDescriptorBlob
     */
    public void setFileDescriptorBlob(byte[] fileDescriptorBlob) {
        this.fileDescriptorBlob = fileDescriptorBlob;
    }


    /**
     * Gets the sessionId value for this DFUFilePublishRequest.
     * 
     * @return sessionId
     */
    public java.lang.Long getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DFUFilePublishRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.Long sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the lockTimeoutMs value for this DFUFilePublishRequest.
     * 
     * @return lockTimeoutMs
     */
    public java.lang.Integer getLockTimeoutMs() {
        return lockTimeoutMs;
    }


    /**
     * Sets the lockTimeoutMs value for this DFUFilePublishRequest.
     * 
     * @param lockTimeoutMs
     */
    public void setLockTimeoutMs(java.lang.Integer lockTimeoutMs) {
        this.lockTimeoutMs = lockTimeoutMs;
    }


    /**
     * Gets the ECLRecordDefinition value for this DFUFilePublishRequest.
     * 
     * @return ECLRecordDefinition
     */
    public java.lang.String getECLRecordDefinition() {
        return ECLRecordDefinition;
    }


    /**
     * Sets the ECLRecordDefinition value for this DFUFilePublishRequest.
     * 
     * @param ECLRecordDefinition
     */
    public void setECLRecordDefinition(java.lang.String ECLRecordDefinition) {
        this.ECLRecordDefinition = ECLRecordDefinition;
    }


    /**
     * Gets the recordCount value for this DFUFilePublishRequest.
     * 
     * @return recordCount
     */
    public java.lang.Long getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this DFUFilePublishRequest.
     * 
     * @param recordCount
     */
    public void setRecordCount(java.lang.Long recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the fileSize value for this DFUFilePublishRequest.
     * 
     * @return fileSize
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this DFUFilePublishRequest.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFilePublishRequest)) return false;
        DFUFilePublishRequest other = (DFUFilePublishRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.fileDescriptorBlob==null && other.getFileDescriptorBlob()==null) || 
             (this.fileDescriptorBlob!=null &&
              java.util.Arrays.equals(this.fileDescriptorBlob, other.getFileDescriptorBlob()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.lockTimeoutMs==null && other.getLockTimeoutMs()==null) || 
             (this.lockTimeoutMs!=null &&
              this.lockTimeoutMs.equals(other.getLockTimeoutMs()))) &&
            ((this.ECLRecordDefinition==null && other.getECLRecordDefinition()==null) || 
             (this.ECLRecordDefinition!=null &&
              this.ECLRecordDefinition.equals(other.getECLRecordDefinition()))) &&
            ((this.recordCount==null && other.getRecordCount()==null) || 
             (this.recordCount!=null &&
              this.recordCount.equals(other.getRecordCount()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize())));
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
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getFileDescriptorBlob() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileDescriptorBlob());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileDescriptorBlob(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getLockTimeoutMs() != null) {
            _hashCode += getLockTimeoutMs().hashCode();
        }
        if (getECLRecordDefinition() != null) {
            _hashCode += getECLRecordDefinition().hashCode();
        }
        if (getRecordCount() != null) {
            _hashCode += getRecordCount().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFilePublishRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFilePublishRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileDescriptorBlob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileDescriptorBlob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockTimeoutMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LockTimeoutMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECLRecordDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ECLRecordDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
