/**
 * WUNestedFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUNestedFilter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt depth;

    private java.lang.String[] scopeTypes;

    public WUNestedFilter() {
    }

    public WUNestedFilter(
           org.apache.axis.types.UnsignedInt depth,
           java.lang.String[] scopeTypes) {
           this.depth = depth;
           this.scopeTypes = scopeTypes;
    }


    /**
     * Gets the depth value for this WUNestedFilter.
     * 
     * @return depth
     */
    public org.apache.axis.types.UnsignedInt getDepth() {
        return depth;
    }


    /**
     * Sets the depth value for this WUNestedFilter.
     * 
     * @param depth
     */
    public void setDepth(org.apache.axis.types.UnsignedInt depth) {
        this.depth = depth;
    }


    /**
     * Gets the scopeTypes value for this WUNestedFilter.
     * 
     * @return scopeTypes
     */
    public java.lang.String[] getScopeTypes() {
        return scopeTypes;
    }


    /**
     * Sets the scopeTypes value for this WUNestedFilter.
     * 
     * @param scopeTypes
     */
    public void setScopeTypes(java.lang.String[] scopeTypes) {
        this.scopeTypes = scopeTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUNestedFilter)) return false;
        WUNestedFilter other = (WUNestedFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depth==null && other.getDepth()==null) || 
             (this.depth!=null &&
              this.depth.equals(other.getDepth()))) &&
            ((this.scopeTypes==null && other.getScopeTypes()==null) || 
             (this.scopeTypes!=null &&
              java.util.Arrays.equals(this.scopeTypes, other.getScopeTypes())));
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
        if (getDepth() != null) {
            _hashCode += getDepth().hashCode();
        }
        if (getScopeTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScopeTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScopeTypes(), i);
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
        new org.apache.axis.description.TypeDesc(WUNestedFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUNestedFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Depth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeType"));
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
