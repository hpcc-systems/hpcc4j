/**
 * GetPackageMapSelectOptionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class GetPackageMapSelectOptionsResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus status;

    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.TargetData[] targets;

    private java.lang.String[] processFilters;

    public GetPackageMapSelectOptionsResponse() {
    }

    public GetPackageMapSelectOptionsResponse(
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus status,
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.TargetData[] targets,
           java.lang.String[] processFilters) {
           this.exceptions = exceptions;
           this.status = status;
           this.targets = targets;
           this.processFilters = processFilters;
    }


    /**
     * Gets the exceptions value for this GetPackageMapSelectOptionsResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetPackageMapSelectOptionsResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the status value for this GetPackageMapSelectOptionsResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetPackageMapSelectOptionsResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus status) {
        this.status = status;
    }


    /**
     * Gets the targets value for this GetPackageMapSelectOptionsResponse.
     * 
     * @return targets
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.TargetData[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this GetPackageMapSelectOptionsResponse.
     * 
     * @param targets
     */
    public void setTargets(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.TargetData[] targets) {
        this.targets = targets;
    }


    /**
     * Gets the processFilters value for this GetPackageMapSelectOptionsResponse.
     * 
     * @return processFilters
     */
    public java.lang.String[] getProcessFilters() {
        return processFilters;
    }


    /**
     * Sets the processFilters value for this GetPackageMapSelectOptionsResponse.
     * 
     * @param processFilters
     */
    public void setProcessFilters(java.lang.String[] processFilters) {
        this.processFilters = processFilters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPackageMapSelectOptionsResponse)) return false;
        GetPackageMapSelectOptionsResponse other = (GetPackageMapSelectOptionsResponse) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets()))) &&
            ((this.processFilters==null && other.getProcessFilters()==null) || 
             (this.processFilters!=null &&
              java.util.Arrays.equals(this.processFilters, other.getProcessFilters())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPackageMapSelectOptionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">GetPackageMapSelectOptionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "BasePackageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "TargetData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "TargetData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ProcessFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Item"));
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
