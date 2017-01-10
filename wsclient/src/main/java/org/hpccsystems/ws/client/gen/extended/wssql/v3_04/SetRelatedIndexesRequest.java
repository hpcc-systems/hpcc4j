/**
 * SetRelatedIndexesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_04;

public class SetRelatedIndexesRequest  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.extended.wssql.v3_04.RelatedIndexSet[] relatedIndexSets;

    public SetRelatedIndexesRequest() {
    }

    public SetRelatedIndexesRequest(
           org.hpccsystems.ws.client.gen.extended.wssql.v3_04.RelatedIndexSet[] relatedIndexSets) {
           this.relatedIndexSets = relatedIndexSets;
    }


    /**
     * Gets the relatedIndexSets value for this SetRelatedIndexesRequest.
     * 
     * @return relatedIndexSets
     */
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.RelatedIndexSet[] getRelatedIndexSets() {
        return relatedIndexSets;
    }


    /**
     * Sets the relatedIndexSets value for this SetRelatedIndexesRequest.
     * 
     * @param relatedIndexSets
     */
    public void setRelatedIndexSets(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.RelatedIndexSet[] relatedIndexSets) {
        this.relatedIndexSets = relatedIndexSets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetRelatedIndexesRequest)) return false;
        SetRelatedIndexesRequest other = (SetRelatedIndexesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relatedIndexSets==null && other.getRelatedIndexSets()==null) || 
             (this.relatedIndexSets!=null &&
              java.util.Arrays.equals(this.relatedIndexSets, other.getRelatedIndexSets())));
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
        if (getRelatedIndexSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedIndexSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedIndexSets(), i);
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
        new org.apache.axis.description.TypeDesc(SetRelatedIndexesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">SetRelatedIndexesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedIndexSets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "RelatedIndexSet"));
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
