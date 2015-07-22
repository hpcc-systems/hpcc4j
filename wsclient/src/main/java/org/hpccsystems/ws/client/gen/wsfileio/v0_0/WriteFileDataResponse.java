/**
 * WriteFileDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsfileio.v0_0;

public class WriteFileDataResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsfileio.v0_0.ArrayOfEspException exceptions;

    private java.lang.String destDropZone;

    private java.lang.String destRelativePath;

    private java.lang.Long offset;

    private java.lang.Boolean append;

    private java.lang.String result;

    public WriteFileDataResponse() {
    }

    public WriteFileDataResponse(
           org.hpccsystems.ws.client.gen.wsfileio.v0_0.ArrayOfEspException exceptions,
           java.lang.String destDropZone,
           java.lang.String destRelativePath,
           java.lang.Long offset,
           java.lang.Boolean append,
           java.lang.String result) {
           this.exceptions = exceptions;
           this.destDropZone = destDropZone;
           this.destRelativePath = destRelativePath;
           this.offset = offset;
           this.append = append;
           this.result = result;
    }


    /**
     * Gets the exceptions value for this WriteFileDataResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsfileio.v0_0.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WriteFileDataResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsfileio.v0_0.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the destDropZone value for this WriteFileDataResponse.
     * 
     * @return destDropZone
     */
    public java.lang.String getDestDropZone() {
        return destDropZone;
    }


    /**
     * Sets the destDropZone value for this WriteFileDataResponse.
     * 
     * @param destDropZone
     */
    public void setDestDropZone(java.lang.String destDropZone) {
        this.destDropZone = destDropZone;
    }


    /**
     * Gets the destRelativePath value for this WriteFileDataResponse.
     * 
     * @return destRelativePath
     */
    public java.lang.String getDestRelativePath() {
        return destRelativePath;
    }


    /**
     * Sets the destRelativePath value for this WriteFileDataResponse.
     * 
     * @param destRelativePath
     */
    public void setDestRelativePath(java.lang.String destRelativePath) {
        this.destRelativePath = destRelativePath;
    }


    /**
     * Gets the offset value for this WriteFileDataResponse.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this WriteFileDataResponse.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the append value for this WriteFileDataResponse.
     * 
     * @return append
     */
    public java.lang.Boolean getAppend() {
        return append;
    }


    /**
     * Sets the append value for this WriteFileDataResponse.
     * 
     * @param append
     */
    public void setAppend(java.lang.Boolean append) {
        this.append = append;
    }


    /**
     * Gets the result value for this WriteFileDataResponse.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this WriteFileDataResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WriteFileDataResponse)) return false;
        WriteFileDataResponse other = (WriteFileDataResponse) obj;
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
            ((this.destDropZone==null && other.getDestDropZone()==null) || 
             (this.destDropZone!=null &&
              this.destDropZone.equals(other.getDestDropZone()))) &&
            ((this.destRelativePath==null && other.getDestRelativePath()==null) || 
             (this.destRelativePath!=null &&
              this.destRelativePath.equals(other.getDestRelativePath()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.append==null && other.getAppend()==null) || 
             (this.append!=null &&
              this.append.equals(other.getAppend()))) &&
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
        if (getDestDropZone() != null) {
            _hashCode += getDestDropZone().hashCode();
        }
        if (getDestRelativePath() != null) {
            _hashCode += getDestRelativePath().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getAppend() != null) {
            _hashCode += getAppend().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WriteFileDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", ">WriteFileDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "ArrayOfEspException"));
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
        elemField.setFieldName("append");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsfileio", "Append"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
