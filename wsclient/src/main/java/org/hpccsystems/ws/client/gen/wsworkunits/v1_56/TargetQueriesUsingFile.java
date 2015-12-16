/**
 * TargetQueriesUsingFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class TargetQueriesUsingFile  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.String packageMap;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QueryUsingFile[] queries;

    public TargetQueriesUsingFile() {
    }

    public TargetQueriesUsingFile(
           java.lang.String target,
           java.lang.String packageMap,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QueryUsingFile[] queries) {
           this.target = target;
           this.packageMap = packageMap;
           this.queries = queries;
    }


    /**
     * Gets the target value for this TargetQueriesUsingFile.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this TargetQueriesUsingFile.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the packageMap value for this TargetQueriesUsingFile.
     * 
     * @return packageMap
     */
    public java.lang.String getPackageMap() {
        return packageMap;
    }


    /**
     * Sets the packageMap value for this TargetQueriesUsingFile.
     * 
     * @param packageMap
     */
    public void setPackageMap(java.lang.String packageMap) {
        this.packageMap = packageMap;
    }


    /**
     * Gets the queries value for this TargetQueriesUsingFile.
     * 
     * @return queries
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QueryUsingFile[] getQueries() {
        return queries;
    }


    /**
     * Sets the queries value for this TargetQueriesUsingFile.
     * 
     * @param queries
     */
    public void setQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QueryUsingFile[] queries) {
        this.queries = queries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetQueriesUsingFile)) return false;
        TargetQueriesUsingFile other = (TargetQueriesUsingFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.packageMap==null && other.getPackageMap()==null) || 
             (this.packageMap!=null &&
              this.packageMap.equals(other.getPackageMap()))) &&
            ((this.queries==null && other.getQueries()==null) || 
             (this.queries!=null &&
              java.util.Arrays.equals(this.queries, other.getQueries())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getPackageMap() != null) {
            _hashCode += getPackageMap().hashCode();
        }
        if (getQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueries(), i);
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
        new org.apache.axis.description.TypeDesc(TargetQueriesUsingFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TargetQueriesUsingFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageMap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PackageMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Queries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryUsingFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryUsingFile"));
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
