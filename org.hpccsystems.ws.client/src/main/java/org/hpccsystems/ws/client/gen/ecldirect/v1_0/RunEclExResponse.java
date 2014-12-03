/**
 * RunEclExResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.ecldirect.v1_0;

public class RunEclExResponse  implements java.io.Serializable {
    private java.lang.String wuid;

    private org.hpccsystems.ws.client.gen.ecldirect.v1_0.ECLDirectException[] errors;

    private java.lang.String results;

    private java.lang.String graphsXGMML;

    public RunEclExResponse() {
    }

    public RunEclExResponse(
           java.lang.String wuid,
           org.hpccsystems.ws.client.gen.ecldirect.v1_0.ECLDirectException[] errors,
           java.lang.String results,
           java.lang.String graphsXGMML) {
           this.wuid = wuid;
           this.errors = errors;
           this.results = results;
           this.graphsXGMML = graphsXGMML;
    }


    /**
     * Gets the wuid value for this RunEclExResponse.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this RunEclExResponse.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the errors value for this RunEclExResponse.
     * 
     * @return errors
     */
    public org.hpccsystems.ws.client.gen.ecldirect.v1_0.ECLDirectException[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this RunEclExResponse.
     * 
     * @param errors
     */
    public void setErrors(org.hpccsystems.ws.client.gen.ecldirect.v1_0.ECLDirectException[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the results value for this RunEclExResponse.
     * 
     * @return results
     */
    public java.lang.String getResults() {
        return results;
    }


    /**
     * Sets the results value for this RunEclExResponse.
     * 
     * @param results
     */
    public void setResults(java.lang.String results) {
        this.results = results;
    }


    /**
     * Gets the graphsXGMML value for this RunEclExResponse.
     * 
     * @return graphsXGMML
     */
    public java.lang.String getGraphsXGMML() {
        return graphsXGMML;
    }


    /**
     * Sets the graphsXGMML value for this RunEclExResponse.
     * 
     * @param graphsXGMML
     */
    public void setGraphsXGMML(java.lang.String graphsXGMML) {
        this.graphsXGMML = graphsXGMML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunEclExResponse)) return false;
        RunEclExResponse other = (RunEclExResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              this.results.equals(other.getResults()))) &&
            ((this.graphsXGMML==null && other.getGraphsXGMML()==null) || 
             (this.graphsXGMML!=null &&
              this.graphsXGMML.equals(other.getGraphsXGMML())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResults() != null) {
            _hashCode += getResults().hashCode();
        }
        if (getGraphsXGMML() != null) {
            _hashCode += getGraphsXGMML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunEclExResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", ">RunEclExResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "ECLDirectException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "ECLDirectException"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphsXGMML");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "graphsXGMML"));
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
