/**
 * WUScopeOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUScopeOptions  implements java.io.Serializable {
    private java.lang.Boolean includeMatchedScopesInResults;

    private java.lang.Boolean includeScope;

    private java.lang.Boolean includeId;

    private java.lang.Boolean includeScopeType;

    public WUScopeOptions() {
    }

    public WUScopeOptions(
           java.lang.Boolean includeMatchedScopesInResults,
           java.lang.Boolean includeScope,
           java.lang.Boolean includeId,
           java.lang.Boolean includeScopeType) {
           this.includeMatchedScopesInResults = includeMatchedScopesInResults;
           this.includeScope = includeScope;
           this.includeId = includeId;
           this.includeScopeType = includeScopeType;
    }


    /**
     * Gets the includeMatchedScopesInResults value for this WUScopeOptions.
     * 
     * @return includeMatchedScopesInResults
     */
    public java.lang.Boolean getIncludeMatchedScopesInResults() {
        return includeMatchedScopesInResults;
    }


    /**
     * Sets the includeMatchedScopesInResults value for this WUScopeOptions.
     * 
     * @param includeMatchedScopesInResults
     */
    public void setIncludeMatchedScopesInResults(java.lang.Boolean includeMatchedScopesInResults) {
        this.includeMatchedScopesInResults = includeMatchedScopesInResults;
    }


    /**
     * Gets the includeScope value for this WUScopeOptions.
     * 
     * @return includeScope
     */
    public java.lang.Boolean getIncludeScope() {
        return includeScope;
    }


    /**
     * Sets the includeScope value for this WUScopeOptions.
     * 
     * @param includeScope
     */
    public void setIncludeScope(java.lang.Boolean includeScope) {
        this.includeScope = includeScope;
    }


    /**
     * Gets the includeId value for this WUScopeOptions.
     * 
     * @return includeId
     */
    public java.lang.Boolean getIncludeId() {
        return includeId;
    }


    /**
     * Sets the includeId value for this WUScopeOptions.
     * 
     * @param includeId
     */
    public void setIncludeId(java.lang.Boolean includeId) {
        this.includeId = includeId;
    }


    /**
     * Gets the includeScopeType value for this WUScopeOptions.
     * 
     * @return includeScopeType
     */
    public java.lang.Boolean getIncludeScopeType() {
        return includeScopeType;
    }


    /**
     * Sets the includeScopeType value for this WUScopeOptions.
     * 
     * @param includeScopeType
     */
    public void setIncludeScopeType(java.lang.Boolean includeScopeType) {
        this.includeScopeType = includeScopeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUScopeOptions)) return false;
        WUScopeOptions other = (WUScopeOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeMatchedScopesInResults==null && other.getIncludeMatchedScopesInResults()==null) || 
             (this.includeMatchedScopesInResults!=null &&
              this.includeMatchedScopesInResults.equals(other.getIncludeMatchedScopesInResults()))) &&
            ((this.includeScope==null && other.getIncludeScope()==null) || 
             (this.includeScope!=null &&
              this.includeScope.equals(other.getIncludeScope()))) &&
            ((this.includeId==null && other.getIncludeId()==null) || 
             (this.includeId!=null &&
              this.includeId.equals(other.getIncludeId()))) &&
            ((this.includeScopeType==null && other.getIncludeScopeType()==null) || 
             (this.includeScopeType!=null &&
              this.includeScopeType.equals(other.getIncludeScopeType())));
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
        if (getIncludeMatchedScopesInResults() != null) {
            _hashCode += getIncludeMatchedScopesInResults().hashCode();
        }
        if (getIncludeScope() != null) {
            _hashCode += getIncludeScope().hashCode();
        }
        if (getIncludeId() != null) {
            _hashCode += getIncludeId().hashCode();
        }
        if (getIncludeScopeType() != null) {
            _hashCode += getIncludeScopeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUScopeOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUScopeOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeMatchedScopesInResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeMatchedScopesInResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeScopeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeScopeType"));
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
