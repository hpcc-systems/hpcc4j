/**
 * WUDetailsMetaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUDetailsMetaResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsMetaProperty[] properties;

    private java.lang.String[] scopeTypes;

    private java.lang.String[] measures;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsActivityInfo[] activities;

    public WUDetailsMetaResponse() {
    }

    public WUDetailsMetaResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsMetaProperty[] properties,
           java.lang.String[] scopeTypes,
           java.lang.String[] measures,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsActivityInfo[] activities) {
           this.exceptions = exceptions;
           this.properties = properties;
           this.scopeTypes = scopeTypes;
           this.measures = measures;
           this.activities = activities;
    }


    /**
     * Gets the exceptions value for this WUDetailsMetaResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUDetailsMetaResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the properties value for this WUDetailsMetaResponse.
     * 
     * @return properties
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsMetaProperty[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this WUDetailsMetaResponse.
     * 
     * @param properties
     */
    public void setProperties(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsMetaProperty[] properties) {
        this.properties = properties;
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


    /**
     * Gets the activities value for this WUDetailsMetaResponse.
     * 
     * @return activities
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsActivityInfo[] getActivities() {
        return activities;
    }


    /**
     * Sets the activities value for this WUDetailsMetaResponse.
     * 
     * @param activities
     */
    public void setActivities(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUDetailsActivityInfo[] activities) {
        this.activities = activities;
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
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.scopeTypes==null && other.getScopeTypes()==null) || 
             (this.scopeTypes!=null &&
              java.util.Arrays.equals(this.scopeTypes, other.getScopeTypes()))) &&
            ((this.measures==null && other.getMeasures()==null) || 
             (this.measures!=null &&
              java.util.Arrays.equals(this.measures, other.getMeasures()))) &&
            ((this.activities==null && other.getActivities()==null) || 
             (this.activities!=null &&
              java.util.Arrays.equals(this.activities, other.getActivities())));
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
        if (getActivities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivities(), i);
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
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDetailsMetaProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Property"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDetailsActivityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activity"));
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
