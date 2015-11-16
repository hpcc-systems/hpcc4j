/**
 * ReadFileDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsfileio.v1_0;

public class ReadFileDataResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException exceptions;

    private byte[] data;

    private java.lang.String destDropZone;

    private java.lang.String destRelativePath;

    private java.lang.Long offset;

    private java.lang.Long dataSize;

    private java.lang.String result;

    public ReadFileDataResponse() {
    }

    public ReadFileDataResponse(
           org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException exceptions,
           byte[] data,
           java.lang.String destDropZone,
           java.lang.String destRelativePath,
           java.lang.Long offset,
           java.lang.Long dataSize,
           java.lang.String result) {
           this.exceptions = exceptions;
           this.data = data;
           this.destDropZone = destDropZone;
           this.destRelativePath = destRelativePath;
           this.offset = offset;
           this.dataSize = dataSize;
           this.result = result;
    }


    /**
     * Gets the exceptions value for this ReadFileDataResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ReadFileDataResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the data value for this ReadFileDataResponse.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this ReadFileDataResponse.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the destDropZone value for this ReadFileDataResponse.
     * 
     * @return destDropZone
     */
    public java.lang.String getDestDropZone() {
        return destDropZone;
    }


    /**
     * Sets the destDropZone value for this ReadFileDataResponse.
     * 
     * @param destDropZone
     */
    public void setDestDropZone(java.lang.String destDropZone) {
        this.destDropZone = destDropZone;
    }


    /**
     * Gets the destRelativePath value for this ReadFileDataResponse.
     * 
     * @return destRelativePath
     */
    public java.lang.String getDestRelativePath() {
        return destRelativePath;
    }


    /**
     * Sets the destRelativePath value for this ReadFileDataResponse.
     * 
     * @param destRelativePath
     */
    public void setDestRelativePath(java.lang.String destRelativePath) {
        this.destRelativePath = destRelativePath;
    }


    /**
     * Gets the offset value for this ReadFileDataResponse.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ReadFileDataResponse.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the dataSize value for this ReadFileDataResponse.
     * 
     * @return dataSize
     */
    public java.lang.Long getDataSize() {
        return dataSize;
    }


    /**
     * Sets the dataSize value for this ReadFileDataResponse.
     * 
     * @param dataSize
     */
    public void setDataSize(java.lang.Long dataSize) {
        this.dataSize = dataSize;
    }


    /**
     * Gets the result value for this ReadFileDataResponse.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this ReadFileDataResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadFileDataResponse)) return false;
        ReadFileDataResponse other = (ReadFileDataResponse) obj;
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
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.destDropZone==null && other.getDestDropZone()==null) || 
             (this.destDropZone!=null &&
              this.destDropZone.equals(other.getDestDropZone()))) &&
            ((this.destRelativePath==null && other.getDestRelativePath()==null) || 
             (this.destRelativePath!=null &&
              this.destRelativePath.equals(other.getDestRelativePath()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.dataSize==null && other.getDataSize()==null) || 
             (this.dataSize!=null &&
              this.dataSize.equals(other.getDataSize()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestDropZone() != null) {
            _hashCode += getDestDropZone().hashCode();
        }
        if (getDestRelativePath() != null) {
            _hashCode += getDestRelativePath().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getDataSize() != null) {
            _hashCode += getDataSize().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadFileDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", ">ReadFileDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDropZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "DestDropZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destRelativePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "DestRelativePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "Offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "DataSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "Result"));
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
