/**
 * DeActivatePackageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class DeActivatePackageRequest  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.String packageMap;

    private java.lang.String process;

    private java.lang.Boolean globalScope;

    public DeActivatePackageRequest() {
    }

    public DeActivatePackageRequest(
           java.lang.String target,
           java.lang.String packageMap,
           java.lang.String process,
           java.lang.Boolean globalScope) {
           this.target = target;
           this.packageMap = packageMap;
           this.process = process;
           this.globalScope = globalScope;
    }


    /**
     * Gets the target value for this DeActivatePackageRequest.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this DeActivatePackageRequest.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the packageMap value for this DeActivatePackageRequest.
     * 
     * @return packageMap
     */
    public java.lang.String getPackageMap() {
        return packageMap;
    }


    /**
     * Sets the packageMap value for this DeActivatePackageRequest.
     * 
     * @param packageMap
     */
    public void setPackageMap(java.lang.String packageMap) {
        this.packageMap = packageMap;
    }


    /**
     * Gets the process value for this DeActivatePackageRequest.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this DeActivatePackageRequest.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the globalScope value for this DeActivatePackageRequest.
     * 
     * @return globalScope
     */
    public java.lang.Boolean getGlobalScope() {
        return globalScope;
    }


    /**
     * Sets the globalScope value for this DeActivatePackageRequest.
     * 
     * @param globalScope
     */
    public void setGlobalScope(java.lang.Boolean globalScope) {
        this.globalScope = globalScope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeActivatePackageRequest)) return false;
        DeActivatePackageRequest other = (DeActivatePackageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.packageMap==null && other.getPackageMap()==null) || 
             (this.packageMap!=null &&
              this.packageMap.equals(other.getPackageMap()))) &&
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            ((this.globalScope==null && other.getGlobalScope()==null) || 
             (this.globalScope!=null &&
              this.globalScope.equals(other.getGlobalScope())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getPackageMap() != null) {
            _hashCode += getPackageMap().hashCode();
        }
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        if (getGlobalScope() != null) {
            _hashCode += getGlobalScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeActivatePackageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">DeActivatePackageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageMap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PackageMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Process"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "GlobalScope"));
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
