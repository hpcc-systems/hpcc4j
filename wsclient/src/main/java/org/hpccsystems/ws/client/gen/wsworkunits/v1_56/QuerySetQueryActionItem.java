/**
 * QuerySetQueryActionItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class QuerySetQueryActionItem  implements java.io.Serializable {
    private java.lang.String queryId;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryClientState clientState;

    public QuerySetQueryActionItem() {
    }

    public QuerySetQueryActionItem(
           java.lang.String queryId,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryClientState clientState) {
           this.queryId = queryId;
           this.clientState = clientState;
    }


    /**
     * Gets the queryId value for this QuerySetQueryActionItem.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this QuerySetQueryActionItem.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the clientState value for this QuerySetQueryActionItem.
     * 
     * @return clientState
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryClientState getClientState() {
        return clientState;
    }


    /**
     * Sets the clientState value for this QuerySetQueryActionItem.
     * 
     * @param clientState
     */
    public void setClientState(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQueryClientState clientState) {
        this.clientState = clientState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySetQueryActionItem)) return false;
        QuerySetQueryActionItem other = (QuerySetQueryActionItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.clientState==null && other.getClientState()==null) || 
             (this.clientState!=null &&
              this.clientState.equals(other.getClientState())));
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
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
        }
        if (getClientState() != null) {
            _hashCode += getClientState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySetQueryActionItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryActionItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClientState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryClientState"));
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
