/**
 * WUScopeFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUScopeFilter  implements java.io.Serializable {
    private java.math.BigInteger maxDepth;

    private java.lang.String[] scopes;

    private java.lang.String[] ids;

    private java.lang.String[] scopeTypes;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyFilter[] propertyFilters;

    public WUScopeFilter() {
    }

    public WUScopeFilter(
           java.math.BigInteger maxDepth,
           java.lang.String[] scopes,
           java.lang.String[] ids,
           java.lang.String[] scopeTypes,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyFilter[] propertyFilters) {
           this.maxDepth = maxDepth;
           this.scopes = scopes;
           this.ids = ids;
           this.scopeTypes = scopeTypes;
           this.propertyFilters = propertyFilters;
    }


    /**
     * Gets the maxDepth value for this WUScopeFilter.
     * 
     * @return maxDepth
     */
    public java.math.BigInteger getMaxDepth() {
        return maxDepth;
    }


    /**
     * Sets the maxDepth value for this WUScopeFilter.
     * 
     * @param maxDepth
     */
    public void setMaxDepth(java.math.BigInteger maxDepth) {
        this.maxDepth = maxDepth;
    }


    /**
     * Gets the scopes value for this WUScopeFilter.
     * 
     * @return scopes
     */
    public java.lang.String[] getScopes() {
        return scopes;
    }


    /**
     * Sets the scopes value for this WUScopeFilter.
     * 
     * @param scopes
     */
    public void setScopes(java.lang.String[] scopes) {
        this.scopes = scopes;
    }


    /**
     * Gets the ids value for this WUScopeFilter.
     * 
     * @return ids
     */
    public java.lang.String[] getIds() {
        return ids;
    }


    /**
     * Sets the ids value for this WUScopeFilter.
     * 
     * @param ids
     */
    public void setIds(java.lang.String[] ids) {
        this.ids = ids;
    }


    /**
     * Gets the scopeTypes value for this WUScopeFilter.
     * 
     * @return scopeTypes
     */
    public java.lang.String[] getScopeTypes() {
        return scopeTypes;
    }


    /**
     * Sets the scopeTypes value for this WUScopeFilter.
     * 
     * @param scopeTypes
     */
    public void setScopeTypes(java.lang.String[] scopeTypes) {
        this.scopeTypes = scopeTypes;
    }


    /**
     * Gets the propertyFilters value for this WUScopeFilter.
     * 
     * @return propertyFilters
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyFilter[] getPropertyFilters() {
        return propertyFilters;
    }


    /**
     * Sets the propertyFilters value for this WUScopeFilter.
     * 
     * @param propertyFilters
     */
    public void setPropertyFilters(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyFilter[] propertyFilters) {
        this.propertyFilters = propertyFilters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUScopeFilter)) return false;
        WUScopeFilter other = (WUScopeFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxDepth==null && other.getMaxDepth()==null) || 
             (this.maxDepth!=null &&
              this.maxDepth.equals(other.getMaxDepth()))) &&
            ((this.scopes==null && other.getScopes()==null) || 
             (this.scopes!=null &&
              java.util.Arrays.equals(this.scopes, other.getScopes()))) &&
            ((this.ids==null && other.getIds()==null) || 
             (this.ids!=null &&
              java.util.Arrays.equals(this.ids, other.getIds()))) &&
            ((this.scopeTypes==null && other.getScopeTypes()==null) || 
             (this.scopeTypes!=null &&
              java.util.Arrays.equals(this.scopeTypes, other.getScopeTypes()))) &&
            ((this.propertyFilters==null && other.getPropertyFilters()==null) || 
             (this.propertyFilters!=null &&
              java.util.Arrays.equals(this.propertyFilters, other.getPropertyFilters())));
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
        if (getMaxDepth() != null) {
            _hashCode += getMaxDepth().hashCode();
        }
        if (getScopes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScopes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScopes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getPropertyFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyFilters(), i);
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
        new org.apache.axis.description.TypeDesc(WUScopeFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUScopeFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scopes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scope"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "id"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PropertyFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPropertyFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PropertyFilter"));
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
