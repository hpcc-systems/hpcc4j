/**
 * WUResponseProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUResponseProperty  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String rawValue;

    private java.lang.String formatted;

    private java.lang.String measure;

    private java.lang.String creator;

    private java.lang.String creatorType;

    public WUResponseProperty() {
    }

    public WUResponseProperty(
           java.lang.String name,
           java.lang.String rawValue,
           java.lang.String formatted,
           java.lang.String measure,
           java.lang.String creator,
           java.lang.String creatorType) {
           this.name = name;
           this.rawValue = rawValue;
           this.formatted = formatted;
           this.measure = measure;
           this.creator = creator;
           this.creatorType = creatorType;
    }


    /**
     * Gets the name value for this WUResponseProperty.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WUResponseProperty.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rawValue value for this WUResponseProperty.
     * 
     * @return rawValue
     */
    public java.lang.String getRawValue() {
        return rawValue;
    }


    /**
     * Sets the rawValue value for this WUResponseProperty.
     * 
     * @param rawValue
     */
    public void setRawValue(java.lang.String rawValue) {
        this.rawValue = rawValue;
    }


    /**
     * Gets the formatted value for this WUResponseProperty.
     * 
     * @return formatted
     */
    public java.lang.String getFormatted() {
        return formatted;
    }


    /**
     * Sets the formatted value for this WUResponseProperty.
     * 
     * @param formatted
     */
    public void setFormatted(java.lang.String formatted) {
        this.formatted = formatted;
    }


    /**
     * Gets the measure value for this WUResponseProperty.
     * 
     * @return measure
     */
    public java.lang.String getMeasure() {
        return measure;
    }


    /**
     * Sets the measure value for this WUResponseProperty.
     * 
     * @param measure
     */
    public void setMeasure(java.lang.String measure) {
        this.measure = measure;
    }


    /**
     * Gets the creator value for this WUResponseProperty.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this WUResponseProperty.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the creatorType value for this WUResponseProperty.
     * 
     * @return creatorType
     */
    public java.lang.String getCreatorType() {
        return creatorType;
    }


    /**
     * Sets the creatorType value for this WUResponseProperty.
     * 
     * @param creatorType
     */
    public void setCreatorType(java.lang.String creatorType) {
        this.creatorType = creatorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUResponseProperty)) return false;
        WUResponseProperty other = (WUResponseProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.rawValue==null && other.getRawValue()==null) || 
             (this.rawValue!=null &&
              this.rawValue.equals(other.getRawValue()))) &&
            ((this.formatted==null && other.getFormatted()==null) || 
             (this.formatted!=null &&
              this.formatted.equals(other.getFormatted()))) &&
            ((this.measure==null && other.getMeasure()==null) || 
             (this.measure!=null &&
              this.measure.equals(other.getMeasure()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.creatorType==null && other.getCreatorType()==null) || 
             (this.creatorType!=null &&
              this.creatorType.equals(other.getCreatorType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRawValue() != null) {
            _hashCode += getRawValue().hashCode();
        }
        if (getFormatted() != null) {
            _hashCode += getFormatted().hashCode();
        }
        if (getMeasure() != null) {
            _hashCode += getMeasure().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getCreatorType() != null) {
            _hashCode += getCreatorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUResponseProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResponseProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rawValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RawValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Formatted"));
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
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CreatorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
