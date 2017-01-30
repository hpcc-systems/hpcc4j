/**
 * TpQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_25;

public class TpQueryType  implements java.io.Serializable {
    private java.lang.String TPCLUSTER;

    private java.lang.String TPNODE;

    public TpQueryType() {
    }

    public TpQueryType(
           java.lang.String TPCLUSTER,
           java.lang.String TPNODE) {
           this.TPCLUSTER = TPCLUSTER;
           this.TPNODE = TPNODE;
    }


    /**
     * Gets the TPCLUSTER value for this TpQueryType.
     * 
     * @return TPCLUSTER
     */
    public java.lang.String getTPCLUSTER() {
        return TPCLUSTER;
    }


    /**
     * Sets the TPCLUSTER value for this TpQueryType.
     * 
     * @param TPCLUSTER
     */
    public void setTPCLUSTER(java.lang.String TPCLUSTER) {
        this.TPCLUSTER = TPCLUSTER;
    }


    /**
     * Gets the TPNODE value for this TpQueryType.
     * 
     * @return TPNODE
     */
    public java.lang.String getTPNODE() {
        return TPNODE;
    }


    /**
     * Sets the TPNODE value for this TpQueryType.
     * 
     * @param TPNODE
     */
    public void setTPNODE(java.lang.String TPNODE) {
        this.TPNODE = TPNODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpQueryType)) return false;
        TpQueryType other = (TpQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TPCLUSTER==null && other.getTPCLUSTER()==null) || 
             (this.TPCLUSTER!=null &&
              this.TPCLUSTER.equals(other.getTPCLUSTER()))) &&
            ((this.TPNODE==null && other.getTPNODE()==null) || 
             (this.TPNODE!=null &&
              this.TPNODE.equals(other.getTPNODE())));
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
        if (getTPCLUSTER() != null) {
            _hashCode += getTPCLUSTER().hashCode();
        }
        if (getTPNODE() != null) {
            _hashCode += getTPNODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPCLUSTER");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TPCLUSTER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPNODE");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TPNODE"));
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
