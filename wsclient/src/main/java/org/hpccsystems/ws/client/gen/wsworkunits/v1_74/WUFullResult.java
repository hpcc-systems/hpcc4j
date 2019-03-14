/**
 * WUFullResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUFullResult  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.Boolean noRootTag;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExceptionSeverity exceptionSeverity;

    public WUFullResult() {
    }

    public WUFullResult(
           java.lang.String wuid,
           java.lang.Boolean noRootTag,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExceptionSeverity exceptionSeverity) {
           this.wuid = wuid;
           this.noRootTag = noRootTag;
           this.exceptionSeverity = exceptionSeverity;
    }


    /**
     * Gets the wuid value for this WUFullResult.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUFullResult.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the noRootTag value for this WUFullResult.
     * 
     * @return noRootTag
     */
    public java.lang.Boolean getNoRootTag() {
        return noRootTag;
    }


    /**
     * Sets the noRootTag value for this WUFullResult.
     * 
     * @param noRootTag
     */
    public void setNoRootTag(java.lang.Boolean noRootTag) {
        this.noRootTag = noRootTag;
    }


    /**
     * Gets the exceptionSeverity value for this WUFullResult.
     * 
     * @return exceptionSeverity
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExceptionSeverity getExceptionSeverity() {
        return exceptionSeverity;
    }


    /**
     * Sets the exceptionSeverity value for this WUFullResult.
     * 
     * @param exceptionSeverity
     */
    public void setExceptionSeverity(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExceptionSeverity exceptionSeverity) {
        this.exceptionSeverity = exceptionSeverity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUFullResult)) return false;
        WUFullResult other = (WUFullResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.noRootTag==null && other.getNoRootTag()==null) || 
             (this.noRootTag!=null &&
              this.noRootTag.equals(other.getNoRootTag()))) &&
            ((this.exceptionSeverity==null && other.getExceptionSeverity()==null) || 
             (this.exceptionSeverity!=null &&
              this.exceptionSeverity.equals(other.getExceptionSeverity())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getNoRootTag() != null) {
            _hashCode += getNoRootTag().hashCode();
        }
        if (getExceptionSeverity() != null) {
            _hashCode += getExceptionSeverity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUFullResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUFullResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noRootTag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NoRootTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ExceptionSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExceptionSeverity"));
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
