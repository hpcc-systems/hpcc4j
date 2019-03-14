/**
 * WUDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUDetails  implements java.io.Serializable {
    private java.lang.String WUID;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeFilter scopeFilter;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUNestedFilter nestedFilter;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertiesToReturn propertiesToReturn;

    private java.lang.String filter;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeOptions scopeOptions;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyOptions propertyOptions;

    public WUDetails() {
    }

    public WUDetails(
           java.lang.String WUID,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeFilter scopeFilter,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUNestedFilter nestedFilter,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertiesToReturn propertiesToReturn,
           java.lang.String filter,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeOptions scopeOptions,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyOptions propertyOptions) {
           this.WUID = WUID;
           this.scopeFilter = scopeFilter;
           this.nestedFilter = nestedFilter;
           this.propertiesToReturn = propertiesToReturn;
           this.filter = filter;
           this.scopeOptions = scopeOptions;
           this.propertyOptions = propertyOptions;
    }


    /**
     * Gets the WUID value for this WUDetails.
     * 
     * @return WUID
     */
    public java.lang.String getWUID() {
        return WUID;
    }


    /**
     * Sets the WUID value for this WUDetails.
     * 
     * @param WUID
     */
    public void setWUID(java.lang.String WUID) {
        this.WUID = WUID;
    }


    /**
     * Gets the scopeFilter value for this WUDetails.
     * 
     * @return scopeFilter
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeFilter getScopeFilter() {
        return scopeFilter;
    }


    /**
     * Sets the scopeFilter value for this WUDetails.
     * 
     * @param scopeFilter
     */
    public void setScopeFilter(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeFilter scopeFilter) {
        this.scopeFilter = scopeFilter;
    }


    /**
     * Gets the nestedFilter value for this WUDetails.
     * 
     * @return nestedFilter
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUNestedFilter getNestedFilter() {
        return nestedFilter;
    }


    /**
     * Sets the nestedFilter value for this WUDetails.
     * 
     * @param nestedFilter
     */
    public void setNestedFilter(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUNestedFilter nestedFilter) {
        this.nestedFilter = nestedFilter;
    }


    /**
     * Gets the propertiesToReturn value for this WUDetails.
     * 
     * @return propertiesToReturn
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertiesToReturn getPropertiesToReturn() {
        return propertiesToReturn;
    }


    /**
     * Sets the propertiesToReturn value for this WUDetails.
     * 
     * @param propertiesToReturn
     */
    public void setPropertiesToReturn(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertiesToReturn propertiesToReturn) {
        this.propertiesToReturn = propertiesToReturn;
    }


    /**
     * Gets the filter value for this WUDetails.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this WUDetails.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }


    /**
     * Gets the scopeOptions value for this WUDetails.
     * 
     * @return scopeOptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeOptions getScopeOptions() {
        return scopeOptions;
    }


    /**
     * Sets the scopeOptions value for this WUDetails.
     * 
     * @param scopeOptions
     */
    public void setScopeOptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUScopeOptions scopeOptions) {
        this.scopeOptions = scopeOptions;
    }


    /**
     * Gets the propertyOptions value for this WUDetails.
     * 
     * @return propertyOptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyOptions getPropertyOptions() {
        return propertyOptions;
    }


    /**
     * Sets the propertyOptions value for this WUDetails.
     * 
     * @param propertyOptions
     */
    public void setPropertyOptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WUPropertyOptions propertyOptions) {
        this.propertyOptions = propertyOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUDetails)) return false;
        WUDetails other = (WUDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WUID==null && other.getWUID()==null) || 
             (this.WUID!=null &&
              this.WUID.equals(other.getWUID()))) &&
            ((this.scopeFilter==null && other.getScopeFilter()==null) || 
             (this.scopeFilter!=null &&
              this.scopeFilter.equals(other.getScopeFilter()))) &&
            ((this.nestedFilter==null && other.getNestedFilter()==null) || 
             (this.nestedFilter!=null &&
              this.nestedFilter.equals(other.getNestedFilter()))) &&
            ((this.propertiesToReturn==null && other.getPropertiesToReturn()==null) || 
             (this.propertiesToReturn!=null &&
              this.propertiesToReturn.equals(other.getPropertiesToReturn()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.scopeOptions==null && other.getScopeOptions()==null) || 
             (this.scopeOptions!=null &&
              this.scopeOptions.equals(other.getScopeOptions()))) &&
            ((this.propertyOptions==null && other.getPropertyOptions()==null) || 
             (this.propertyOptions!=null &&
              this.propertyOptions.equals(other.getPropertyOptions())));
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
        if (getWUID() != null) {
            _hashCode += getWUID().hashCode();
        }
        if (getScopeFilter() != null) {
            _hashCode += getScopeFilter().hashCode();
        }
        if (getNestedFilter() != null) {
            _hashCode += getNestedFilter().hashCode();
        }
        if (getPropertiesToReturn() != null) {
            _hashCode += getPropertiesToReturn().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getScopeOptions() != null) {
            _hashCode += getScopeOptions().hashCode();
        }
        if (getPropertyOptions() != null) {
            _hashCode += getPropertyOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUScopeFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nestedFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NestedFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUNestedFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertiesToReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PropertiesToReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPropertiesToReturn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUScopeOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PropertyOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPropertyOptions"));
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
