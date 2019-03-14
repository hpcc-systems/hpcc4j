/**
 * WUPropertyOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUPropertyOptions  implements java.io.Serializable {
    private java.lang.Boolean includeName;

    private java.lang.Boolean includeRawValue;

    private java.lang.Boolean includeFormatted;

    private java.lang.Boolean includeMeasure;

    private java.lang.Boolean includeCreator;

    private java.lang.Boolean includeCreatorType;

    public WUPropertyOptions() {
    }

    public WUPropertyOptions(
           java.lang.Boolean includeName,
           java.lang.Boolean includeRawValue,
           java.lang.Boolean includeFormatted,
           java.lang.Boolean includeMeasure,
           java.lang.Boolean includeCreator,
           java.lang.Boolean includeCreatorType) {
           this.includeName = includeName;
           this.includeRawValue = includeRawValue;
           this.includeFormatted = includeFormatted;
           this.includeMeasure = includeMeasure;
           this.includeCreator = includeCreator;
           this.includeCreatorType = includeCreatorType;
    }


    /**
     * Gets the includeName value for this WUPropertyOptions.
     * 
     * @return includeName
     */
    public java.lang.Boolean getIncludeName() {
        return includeName;
    }


    /**
     * Sets the includeName value for this WUPropertyOptions.
     * 
     * @param includeName
     */
    public void setIncludeName(java.lang.Boolean includeName) {
        this.includeName = includeName;
    }


    /**
     * Gets the includeRawValue value for this WUPropertyOptions.
     * 
     * @return includeRawValue
     */
    public java.lang.Boolean getIncludeRawValue() {
        return includeRawValue;
    }


    /**
     * Sets the includeRawValue value for this WUPropertyOptions.
     * 
     * @param includeRawValue
     */
    public void setIncludeRawValue(java.lang.Boolean includeRawValue) {
        this.includeRawValue = includeRawValue;
    }


    /**
     * Gets the includeFormatted value for this WUPropertyOptions.
     * 
     * @return includeFormatted
     */
    public java.lang.Boolean getIncludeFormatted() {
        return includeFormatted;
    }


    /**
     * Sets the includeFormatted value for this WUPropertyOptions.
     * 
     * @param includeFormatted
     */
    public void setIncludeFormatted(java.lang.Boolean includeFormatted) {
        this.includeFormatted = includeFormatted;
    }


    /**
     * Gets the includeMeasure value for this WUPropertyOptions.
     * 
     * @return includeMeasure
     */
    public java.lang.Boolean getIncludeMeasure() {
        return includeMeasure;
    }


    /**
     * Sets the includeMeasure value for this WUPropertyOptions.
     * 
     * @param includeMeasure
     */
    public void setIncludeMeasure(java.lang.Boolean includeMeasure) {
        this.includeMeasure = includeMeasure;
    }


    /**
     * Gets the includeCreator value for this WUPropertyOptions.
     * 
     * @return includeCreator
     */
    public java.lang.Boolean getIncludeCreator() {
        return includeCreator;
    }


    /**
     * Sets the includeCreator value for this WUPropertyOptions.
     * 
     * @param includeCreator
     */
    public void setIncludeCreator(java.lang.Boolean includeCreator) {
        this.includeCreator = includeCreator;
    }


    /**
     * Gets the includeCreatorType value for this WUPropertyOptions.
     * 
     * @return includeCreatorType
     */
    public java.lang.Boolean getIncludeCreatorType() {
        return includeCreatorType;
    }


    /**
     * Sets the includeCreatorType value for this WUPropertyOptions.
     * 
     * @param includeCreatorType
     */
    public void setIncludeCreatorType(java.lang.Boolean includeCreatorType) {
        this.includeCreatorType = includeCreatorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUPropertyOptions)) return false;
        WUPropertyOptions other = (WUPropertyOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeName==null && other.getIncludeName()==null) || 
             (this.includeName!=null &&
              this.includeName.equals(other.getIncludeName()))) &&
            ((this.includeRawValue==null && other.getIncludeRawValue()==null) || 
             (this.includeRawValue!=null &&
              this.includeRawValue.equals(other.getIncludeRawValue()))) &&
            ((this.includeFormatted==null && other.getIncludeFormatted()==null) || 
             (this.includeFormatted!=null &&
              this.includeFormatted.equals(other.getIncludeFormatted()))) &&
            ((this.includeMeasure==null && other.getIncludeMeasure()==null) || 
             (this.includeMeasure!=null &&
              this.includeMeasure.equals(other.getIncludeMeasure()))) &&
            ((this.includeCreator==null && other.getIncludeCreator()==null) || 
             (this.includeCreator!=null &&
              this.includeCreator.equals(other.getIncludeCreator()))) &&
            ((this.includeCreatorType==null && other.getIncludeCreatorType()==null) || 
             (this.includeCreatorType!=null &&
              this.includeCreatorType.equals(other.getIncludeCreatorType())));
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
        if (getIncludeName() != null) {
            _hashCode += getIncludeName().hashCode();
        }
        if (getIncludeRawValue() != null) {
            _hashCode += getIncludeRawValue().hashCode();
        }
        if (getIncludeFormatted() != null) {
            _hashCode += getIncludeFormatted().hashCode();
        }
        if (getIncludeMeasure() != null) {
            _hashCode += getIncludeMeasure().hashCode();
        }
        if (getIncludeCreator() != null) {
            _hashCode += getIncludeCreator().hashCode();
        }
        if (getIncludeCreatorType() != null) {
            _hashCode += getIncludeCreatorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUPropertyOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPropertyOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeRawValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeRawValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeFormatted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeFormatted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCreator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeCreator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCreatorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeCreatorType"));
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
