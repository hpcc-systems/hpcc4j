/**
 * WUCreateZAPInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUCreateZAPInfoResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions;

    private byte[] thefile;

    private java.lang.String ZAPFileName;

    public WUCreateZAPInfoResponse() {
    }

    public WUCreateZAPInfoResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions,
           byte[] thefile,
           java.lang.String ZAPFileName) {
           this.exceptions = exceptions;
           this.thefile = thefile;
           this.ZAPFileName = ZAPFileName;
    }


    /**
     * Gets the exceptions value for this WUCreateZAPInfoResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUCreateZAPInfoResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the thefile value for this WUCreateZAPInfoResponse.
     * 
     * @return thefile
     */
    public byte[] getThefile() {
        return thefile;
    }


    /**
     * Sets the thefile value for this WUCreateZAPInfoResponse.
     * 
     * @param thefile
     */
    public void setThefile(byte[] thefile) {
        this.thefile = thefile;
    }


    /**
     * Gets the ZAPFileName value for this WUCreateZAPInfoResponse.
     * 
     * @return ZAPFileName
     */
    public java.lang.String getZAPFileName() {
        return ZAPFileName;
    }


    /**
     * Sets the ZAPFileName value for this WUCreateZAPInfoResponse.
     * 
     * @param ZAPFileName
     */
    public void setZAPFileName(java.lang.String ZAPFileName) {
        this.ZAPFileName = ZAPFileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUCreateZAPInfoResponse)) return false;
        WUCreateZAPInfoResponse other = (WUCreateZAPInfoResponse) obj;
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
            ((this.thefile==null && other.getThefile()==null) || 
             (this.thefile!=null &&
              java.util.Arrays.equals(this.thefile, other.getThefile()))) &&
            ((this.ZAPFileName==null && other.getZAPFileName()==null) || 
             (this.ZAPFileName!=null &&
              this.ZAPFileName.equals(other.getZAPFileName())));
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
        if (getThefile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThefile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThefile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZAPFileName() != null) {
            _hashCode += getZAPFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUCreateZAPInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateZAPInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thefile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "thefile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZAPFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ZAPFileName"));
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
