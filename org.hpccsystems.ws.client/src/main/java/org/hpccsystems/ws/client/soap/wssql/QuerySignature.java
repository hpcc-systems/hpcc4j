/**
 * QuerySignature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class QuerySignature  implements java.io.Serializable {
    private org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] inParams;

    private org.hpccsystems.ws.client.soap.wssql.OutputDataset[] resultSets;

    public QuerySignature() {
    }

    public QuerySignature(
           org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] inParams,
           org.hpccsystems.ws.client.soap.wssql.OutputDataset[] resultSets) {
           this.inParams = inParams;
           this.resultSets = resultSets;
    }


    /**
     * Gets the inParams value for this QuerySignature.
     * 
     * @return inParams
     */
    public org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] getInParams() {
        return inParams;
    }


    /**
     * Sets the inParams value for this QuerySignature.
     * 
     * @param inParams
     */
    public void setInParams(org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] inParams) {
        this.inParams = inParams;
    }


    /**
     * Gets the resultSets value for this QuerySignature.
     * 
     * @return resultSets
     */
    public org.hpccsystems.ws.client.soap.wssql.OutputDataset[] getResultSets() {
        return resultSets;
    }


    /**
     * Sets the resultSets value for this QuerySignature.
     * 
     * @param resultSets
     */
    public void setResultSets(org.hpccsystems.ws.client.soap.wssql.OutputDataset[] resultSets) {
        this.resultSets = resultSets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySignature)) return false;
        QuerySignature other = (QuerySignature) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inParams==null && other.getInParams()==null) || 
             (this.inParams!=null &&
              java.util.Arrays.equals(this.inParams, other.getInParams()))) &&
            ((this.resultSets==null && other.getResultSets()==null) || 
             (this.resultSets!=null &&
              java.util.Arrays.equals(this.resultSets, other.getResultSets())));
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
        if (getInParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResultSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultSets(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySignature.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySignature"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "InParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "InParam"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "OutputDataset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultSet"));
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
