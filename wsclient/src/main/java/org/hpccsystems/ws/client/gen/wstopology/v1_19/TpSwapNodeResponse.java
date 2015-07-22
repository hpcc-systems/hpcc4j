/**
 * TpSwapNodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_19;

public class TpSwapNodeResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions;

    private java.lang.Boolean tpSwapNodeResult;

    public TpSwapNodeResponse() {
    }

    public TpSwapNodeResponse(
           org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions,
           java.lang.Boolean tpSwapNodeResult) {
           this.exceptions = exceptions;
           this.tpSwapNodeResult = tpSwapNodeResult;
    }


    /**
     * Gets the exceptions value for this TpSwapNodeResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpSwapNodeResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the tpSwapNodeResult value for this TpSwapNodeResponse.
     * 
     * @return tpSwapNodeResult
     */
    public java.lang.Boolean getTpSwapNodeResult() {
        return tpSwapNodeResult;
    }


    /**
     * Sets the tpSwapNodeResult value for this TpSwapNodeResponse.
     * 
     * @param tpSwapNodeResult
     */
    public void setTpSwapNodeResult(java.lang.Boolean tpSwapNodeResult) {
        this.tpSwapNodeResult = tpSwapNodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpSwapNodeResponse)) return false;
        TpSwapNodeResponse other = (TpSwapNodeResponse) obj;
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
            ((this.tpSwapNodeResult==null && other.getTpSwapNodeResult()==null) || 
             (this.tpSwapNodeResult!=null &&
              this.tpSwapNodeResult.equals(other.getTpSwapNodeResult())));
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
        if (getTpSwapNodeResult() != null) {
            _hashCode += getTpSwapNodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpSwapNodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSwapNodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpSwapNodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSwapNodeResult"));
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
