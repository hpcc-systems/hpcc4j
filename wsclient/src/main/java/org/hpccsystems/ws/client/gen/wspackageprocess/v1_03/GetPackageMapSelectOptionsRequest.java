/**
 * GetPackageMapSelectOptionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class GetPackageMapSelectOptionsRequest  implements java.io.Serializable {
    private java.lang.Boolean includeTargets;

    private java.lang.Boolean includeProcesses;

    private java.lang.Boolean includeProcessFilters;

    public GetPackageMapSelectOptionsRequest() {
    }

    public GetPackageMapSelectOptionsRequest(
           java.lang.Boolean includeTargets,
           java.lang.Boolean includeProcesses,
           java.lang.Boolean includeProcessFilters) {
           this.includeTargets = includeTargets;
           this.includeProcesses = includeProcesses;
           this.includeProcessFilters = includeProcessFilters;
    }


    /**
     * Gets the includeTargets value for this GetPackageMapSelectOptionsRequest.
     * 
     * @return includeTargets
     */
    public java.lang.Boolean getIncludeTargets() {
        return includeTargets;
    }


    /**
     * Sets the includeTargets value for this GetPackageMapSelectOptionsRequest.
     * 
     * @param includeTargets
     */
    public void setIncludeTargets(java.lang.Boolean includeTargets) {
        this.includeTargets = includeTargets;
    }


    /**
     * Gets the includeProcesses value for this GetPackageMapSelectOptionsRequest.
     * 
     * @return includeProcesses
     */
    public java.lang.Boolean getIncludeProcesses() {
        return includeProcesses;
    }


    /**
     * Sets the includeProcesses value for this GetPackageMapSelectOptionsRequest.
     * 
     * @param includeProcesses
     */
    public void setIncludeProcesses(java.lang.Boolean includeProcesses) {
        this.includeProcesses = includeProcesses;
    }


    /**
     * Gets the includeProcessFilters value for this GetPackageMapSelectOptionsRequest.
     * 
     * @return includeProcessFilters
     */
    public java.lang.Boolean getIncludeProcessFilters() {
        return includeProcessFilters;
    }


    /**
     * Sets the includeProcessFilters value for this GetPackageMapSelectOptionsRequest.
     * 
     * @param includeProcessFilters
     */
    public void setIncludeProcessFilters(java.lang.Boolean includeProcessFilters) {
        this.includeProcessFilters = includeProcessFilters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPackageMapSelectOptionsRequest)) return false;
        GetPackageMapSelectOptionsRequest other = (GetPackageMapSelectOptionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeTargets==null && other.getIncludeTargets()==null) || 
             (this.includeTargets!=null &&
              this.includeTargets.equals(other.getIncludeTargets()))) &&
            ((this.includeProcesses==null && other.getIncludeProcesses()==null) || 
             (this.includeProcesses!=null &&
              this.includeProcesses.equals(other.getIncludeProcesses()))) &&
            ((this.includeProcessFilters==null && other.getIncludeProcessFilters()==null) || 
             (this.includeProcessFilters!=null &&
              this.includeProcessFilters.equals(other.getIncludeProcessFilters())));
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
        if (getIncludeTargets() != null) {
            _hashCode += getIncludeTargets().hashCode();
        }
        if (getIncludeProcesses() != null) {
            _hashCode += getIncludeProcesses().hashCode();
        }
        if (getIncludeProcessFilters() != null) {
            _hashCode += getIncludeProcessFilters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPackageMapSelectOptionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">GetPackageMapSelectOptionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "IncludeTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeProcesses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "IncludeProcesses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeProcessFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "IncludeProcessFilters"));
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
