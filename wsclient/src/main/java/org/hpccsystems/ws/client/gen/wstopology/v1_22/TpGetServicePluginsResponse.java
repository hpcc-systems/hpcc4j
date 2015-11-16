/**
 * TpGetServicePluginsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_22;

public class TpGetServicePluginsResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wstopology.v1_22.TpEspServicePlugin[] plugins;

    public TpGetServicePluginsResponse() {
    }

    public TpGetServicePluginsResponse(
           org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wstopology.v1_22.TpEspServicePlugin[] plugins) {
           this.exceptions = exceptions;
           this.plugins = plugins;
    }


    /**
     * Gets the exceptions value for this TpGetServicePluginsResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpGetServicePluginsResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the plugins value for this TpGetServicePluginsResponse.
     * 
     * @return plugins
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpEspServicePlugin[] getPlugins() {
        return plugins;
    }


    /**
     * Sets the plugins value for this TpGetServicePluginsResponse.
     * 
     * @param plugins
     */
    public void setPlugins(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpEspServicePlugin[] plugins) {
        this.plugins = plugins;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpGetServicePluginsResponse)) return false;
        TpGetServicePluginsResponse other = (TpGetServicePluginsResponse) obj;
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
            ((this.plugins==null && other.getPlugins()==null) || 
             (this.plugins!=null &&
              java.util.Arrays.equals(this.plugins, other.getPlugins())));
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
        if (getPlugins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlugins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlugins(), i);
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
        new org.apache.axis.description.TypeDesc(TpGetServicePluginsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGetServicePluginsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plugins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Plugins"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEspServicePlugin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Plugin"));
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
