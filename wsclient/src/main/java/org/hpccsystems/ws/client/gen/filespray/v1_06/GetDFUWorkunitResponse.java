/**
 * GetDFUWorkunitResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_06;

public class GetDFUWorkunitResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunit result;

    private java.lang.Integer autoRefresh;

    public GetDFUWorkunitResponse() {
    }

    public GetDFUWorkunitResponse(
           org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunit result,
           java.lang.Integer autoRefresh) {
           this.exceptions = exceptions;
           this.result = result;
           this.autoRefresh = autoRefresh;
    }


    /**
     * Gets the exceptions value for this GetDFUWorkunitResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetDFUWorkunitResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the result value for this GetDFUWorkunitResponse.
     * 
     * @return result
     */
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunit getResult() {
        return result;
    }


    /**
     * Sets the result value for this GetDFUWorkunitResponse.
     * 
     * @param result
     */
    public void setResult(org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunit result) {
        this.result = result;
    }


    /**
     * Gets the autoRefresh value for this GetDFUWorkunitResponse.
     * 
     * @return autoRefresh
     */
    public java.lang.Integer getAutoRefresh() {
        return autoRefresh;
    }


    /**
     * Sets the autoRefresh value for this GetDFUWorkunitResponse.
     * 
     * @param autoRefresh
     */
    public void setAutoRefresh(java.lang.Integer autoRefresh) {
        this.autoRefresh = autoRefresh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDFUWorkunitResponse)) return false;
        GetDFUWorkunitResponse other = (GetDFUWorkunitResponse) obj;
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
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.autoRefresh==null && other.getAutoRefresh()==null) || 
             (this.autoRefresh!=null &&
              this.autoRefresh.equals(other.getAutoRefresh())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getAutoRefresh() != null) {
            _hashCode += getAutoRefresh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDFUWorkunitResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunitResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "AutoRefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
