/**
 * WUPropertiesToReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUPropertiesToReturn  implements java.io.Serializable {
    private java.lang.Boolean allStatistics;

    private java.lang.Boolean allAttributes;

    private java.lang.Boolean allHints;

    private java.lang.Boolean allScopes;

    private java.lang.Boolean allProperties;

    private java.lang.String minVersion;

    private java.lang.String measure;

    private java.lang.String[] properties;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExtraProperties[] extraProperties;

    public WUPropertiesToReturn() {
    }

    public WUPropertiesToReturn(
           java.lang.Boolean allStatistics,
           java.lang.Boolean allAttributes,
           java.lang.Boolean allHints,
           java.lang.Boolean allScopes,
           java.lang.Boolean allProperties,
           java.lang.String minVersion,
           java.lang.String measure,
           java.lang.String[] properties,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExtraProperties[] extraProperties) {
           this.allStatistics = allStatistics;
           this.allAttributes = allAttributes;
           this.allHints = allHints;
           this.allScopes = allScopes;
           this.allProperties = allProperties;
           this.minVersion = minVersion;
           this.measure = measure;
           this.properties = properties;
           this.extraProperties = extraProperties;
    }


    /**
     * Gets the allStatistics value for this WUPropertiesToReturn.
     * 
     * @return allStatistics
     */
    public java.lang.Boolean getAllStatistics() {
        return allStatistics;
    }


    /**
     * Sets the allStatistics value for this WUPropertiesToReturn.
     * 
     * @param allStatistics
     */
    public void setAllStatistics(java.lang.Boolean allStatistics) {
        this.allStatistics = allStatistics;
    }


    /**
     * Gets the allAttributes value for this WUPropertiesToReturn.
     * 
     * @return allAttributes
     */
    public java.lang.Boolean getAllAttributes() {
        return allAttributes;
    }


    /**
     * Sets the allAttributes value for this WUPropertiesToReturn.
     * 
     * @param allAttributes
     */
    public void setAllAttributes(java.lang.Boolean allAttributes) {
        this.allAttributes = allAttributes;
    }


    /**
     * Gets the allHints value for this WUPropertiesToReturn.
     * 
     * @return allHints
     */
    public java.lang.Boolean getAllHints() {
        return allHints;
    }


    /**
     * Sets the allHints value for this WUPropertiesToReturn.
     * 
     * @param allHints
     */
    public void setAllHints(java.lang.Boolean allHints) {
        this.allHints = allHints;
    }


    /**
     * Gets the allScopes value for this WUPropertiesToReturn.
     * 
     * @return allScopes
     */
    public java.lang.Boolean getAllScopes() {
        return allScopes;
    }


    /**
     * Sets the allScopes value for this WUPropertiesToReturn.
     * 
     * @param allScopes
     */
    public void setAllScopes(java.lang.Boolean allScopes) {
        this.allScopes = allScopes;
    }


    /**
     * Gets the allProperties value for this WUPropertiesToReturn.
     * 
     * @return allProperties
     */
    public java.lang.Boolean getAllProperties() {
        return allProperties;
    }


    /**
     * Sets the allProperties value for this WUPropertiesToReturn.
     * 
     * @param allProperties
     */
    public void setAllProperties(java.lang.Boolean allProperties) {
        this.allProperties = allProperties;
    }


    /**
     * Gets the minVersion value for this WUPropertiesToReturn.
     * 
     * @return minVersion
     */
    public java.lang.String getMinVersion() {
        return minVersion;
    }


    /**
     * Sets the minVersion value for this WUPropertiesToReturn.
     * 
     * @param minVersion
     */
    public void setMinVersion(java.lang.String minVersion) {
        this.minVersion = minVersion;
    }


    /**
     * Gets the measure value for this WUPropertiesToReturn.
     * 
     * @return measure
     */
    public java.lang.String getMeasure() {
        return measure;
    }


    /**
     * Sets the measure value for this WUPropertiesToReturn.
     * 
     * @param measure
     */
    public void setMeasure(java.lang.String measure) {
        this.measure = measure;
    }


    /**
     * Gets the properties value for this WUPropertiesToReturn.
     * 
     * @return properties
     */
    public java.lang.String[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this WUPropertiesToReturn.
     * 
     * @param properties
     */
    public void setProperties(java.lang.String[] properties) {
        this.properties = properties;
    }


    /**
     * Gets the extraProperties value for this WUPropertiesToReturn.
     * 
     * @return extraProperties
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExtraProperties[] getExtraProperties() {
        return extraProperties;
    }


    /**
     * Sets the extraProperties value for this WUPropertiesToReturn.
     * 
     * @param extraProperties
     */
    public void setExtraProperties(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUExtraProperties[] extraProperties) {
        this.extraProperties = extraProperties;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUPropertiesToReturn)) return false;
        WUPropertiesToReturn other = (WUPropertiesToReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allStatistics==null && other.getAllStatistics()==null) || 
             (this.allStatistics!=null &&
              this.allStatistics.equals(other.getAllStatistics()))) &&
            ((this.allAttributes==null && other.getAllAttributes()==null) || 
             (this.allAttributes!=null &&
              this.allAttributes.equals(other.getAllAttributes()))) &&
            ((this.allHints==null && other.getAllHints()==null) || 
             (this.allHints!=null &&
              this.allHints.equals(other.getAllHints()))) &&
            ((this.allScopes==null && other.getAllScopes()==null) || 
             (this.allScopes!=null &&
              this.allScopes.equals(other.getAllScopes()))) &&
            ((this.allProperties==null && other.getAllProperties()==null) || 
             (this.allProperties!=null &&
              this.allProperties.equals(other.getAllProperties()))) &&
            ((this.minVersion==null && other.getMinVersion()==null) || 
             (this.minVersion!=null &&
              this.minVersion.equals(other.getMinVersion()))) &&
            ((this.measure==null && other.getMeasure()==null) || 
             (this.measure!=null &&
              this.measure.equals(other.getMeasure()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.extraProperties==null && other.getExtraProperties()==null) || 
             (this.extraProperties!=null &&
              java.util.Arrays.equals(this.extraProperties, other.getExtraProperties())));
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
        if (getAllStatistics() != null) {
            _hashCode += getAllStatistics().hashCode();
        }
        if (getAllAttributes() != null) {
            _hashCode += getAllAttributes().hashCode();
        }
        if (getAllHints() != null) {
            _hashCode += getAllHints().hashCode();
        }
        if (getAllScopes() != null) {
            _hashCode += getAllScopes().hashCode();
        }
        if (getAllProperties() != null) {
            _hashCode += getAllProperties().hashCode();
        }
        if (getMinVersion() != null) {
            _hashCode += getMinVersion().hashCode();
        }
        if (getMeasure() != null) {
            _hashCode += getMeasure().hashCode();
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
        if (getExtraProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtraProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtraProperties(), i);
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
        new org.apache.axis.description.TypeDesc(WUPropertiesToReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPropertiesToReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allStatistics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllStatistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allHints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllHints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allScopes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllScopes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MinVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Measure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Property"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ExtraProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExtraProperties"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Extra"));
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
