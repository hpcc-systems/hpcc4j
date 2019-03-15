/**
 * WUResponseScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUResponseScope  implements java.io.Serializable {
    private java.lang.String scopeName;

    private java.lang.String id;

    private java.lang.String scopeType;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUResponseProperty[] properties;

    public WUResponseScope() {
    }

    public WUResponseScope(
           java.lang.String scopeName,
           java.lang.String id,
           java.lang.String scopeType,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUResponseProperty[] properties) {
           this.scopeName = scopeName;
           this.id = id;
           this.scopeType = scopeType;
           this.properties = properties;
    }


    /**
     * Gets the scopeName value for this WUResponseScope.
     * 
     * @return scopeName
     */
    public java.lang.String getScopeName() {
        return scopeName;
    }


    /**
     * Sets the scopeName value for this WUResponseScope.
     * 
     * @param scopeName
     */
    public void setScopeName(java.lang.String scopeName) {
        this.scopeName = scopeName;
    }


    /**
     * Gets the id value for this WUResponseScope.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WUResponseScope.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the scopeType value for this WUResponseScope.
     * 
     * @return scopeType
     */
    public java.lang.String getScopeType() {
        return scopeType;
    }


    /**
     * Sets the scopeType value for this WUResponseScope.
     * 
     * @param scopeType
     */
    public void setScopeType(java.lang.String scopeType) {
        this.scopeType = scopeType;
    }


    /**
     * Gets the properties value for this WUResponseScope.
     * 
     * @return properties
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUResponseProperty[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this WUResponseScope.
     * 
     * @param properties
     */
    public void setProperties(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUResponseProperty[] properties) {
        this.properties = properties;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUResponseScope)) return false;
        WUResponseScope other = (WUResponseScope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scopeName==null && other.getScopeName()==null) || 
             (this.scopeName!=null &&
              this.scopeName.equals(other.getScopeName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.scopeType==null && other.getScopeType()==null) || 
             (this.scopeType!=null &&
              this.scopeType.equals(other.getScopeType()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties())));
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
        if (getScopeName() != null) {
            _hashCode += getScopeName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getScopeType() != null) {
            _hashCode += getScopeType().hashCode();
        }
        if (getProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperties(), i);
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
        new org.apache.axis.description.TypeDesc(WUResponseScope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResponseScope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResponseProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Property"));
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
