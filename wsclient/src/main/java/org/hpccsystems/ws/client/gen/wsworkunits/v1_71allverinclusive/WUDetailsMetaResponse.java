/**
 * WUDetailsMetaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive;

public class WUDetailsMetaResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.ArrayOfEspException exceptions;

    private java.lang.String[] statistics;

    private java.lang.String[] attributes;

    private java.lang.String[] scopeTypes;

    private java.lang.String[] measures;

    public WUDetailsMetaResponse() {
    }

    public WUDetailsMetaResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.ArrayOfEspException exceptions,
           java.lang.String[] statistics,
           java.lang.String[] attributes,
           java.lang.String[] scopeTypes,
           java.lang.String[] measures) {
           this.exceptions = exceptions;
           this.statistics = statistics;
           this.attributes = attributes;
           this.scopeTypes = scopeTypes;
           this.measures = measures;
    }


    /**
     * Gets the exceptions value for this WUDetailsMetaResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUDetailsMetaResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the statistics value for this WUDetailsMetaResponse.
     * 
     * @return statistics
     */
    public java.lang.String[] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this WUDetailsMetaResponse.
     * 
     * @param statistics
     */
    public void setStatistics(java.lang.String[] statistics) {
        this.statistics = statistics;
    }


    /**
     * Gets the attributes value for this WUDetailsMetaResponse.
     * 
     * @return attributes
     */
    public java.lang.String[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this WUDetailsMetaResponse.
     * 
     * @param attributes
     */
    public void setAttributes(java.lang.String[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the scopeTypes value for this WUDetailsMetaResponse.
     * 
     * @return scopeTypes
     */
    public java.lang.String[] getScopeTypes() {
        return scopeTypes;
    }


    /**
     * Sets the scopeTypes value for this WUDetailsMetaResponse.
     * 
     * @param scopeTypes
     */
    public void setScopeTypes(java.lang.String[] scopeTypes) {
        this.scopeTypes = scopeTypes;
    }


    /**
     * Gets the measures value for this WUDetailsMetaResponse.
     * 
     * @return measures
     */
    public java.lang.String[] getMeasures() {
        return measures;
    }


    /**
     * Sets the measures value for this WUDetailsMetaResponse.
     * 
     * @param measures
     */
    public void setMeasures(java.lang.String[] measures) {
        this.measures = measures;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUDetailsMetaResponse)) return false;
        WUDetailsMetaResponse other = (WUDetailsMetaResponse) obj;
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
            ((this.statistics==null && other.getStatistics()==null) || 
             (this.statistics!=null &&
              java.util.Arrays.equals(this.statistics, other.getStatistics()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.scopeTypes==null && other.getScopeTypes()==null) || 
             (this.scopeTypes!=null &&
              java.util.Arrays.equals(this.scopeTypes, other.getScopeTypes()))) &&
            ((this.measures==null && other.getMeasures()==null) || 
             (this.measures!=null &&
              java.util.Arrays.equals(this.measures, other.getMeasures())));
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
        if (getStatistics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatistics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatistics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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
        if (getMeasures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMeasures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMeasures(), i);
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
        new org.apache.axis.description.TypeDesc(WUDetailsMetaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDetailsMetaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Statistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Statistic"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Attribute"));
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
        elemField.setFieldName("measures");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Measures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Measure"));
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
