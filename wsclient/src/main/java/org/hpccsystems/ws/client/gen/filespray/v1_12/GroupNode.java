/**
 * GroupNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_12;

public class GroupNode  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String clusterType;

    private java.lang.Boolean replicateOutputs;

    public GroupNode() {
    }

    public GroupNode(
           java.lang.String name,
           java.lang.String clusterType,
           java.lang.Boolean replicateOutputs) {
           this.name = name;
           this.clusterType = clusterType;
           this.replicateOutputs = replicateOutputs;
    }


    /**
     * Gets the name value for this GroupNode.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GroupNode.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the clusterType value for this GroupNode.
     * 
     * @return clusterType
     */
    public java.lang.String getClusterType() {
        return clusterType;
    }


    /**
     * Sets the clusterType value for this GroupNode.
     * 
     * @param clusterType
     */
    public void setClusterType(java.lang.String clusterType) {
        this.clusterType = clusterType;
    }


    /**
     * Gets the replicateOutputs value for this GroupNode.
     * 
     * @return replicateOutputs
     */
    public java.lang.Boolean getReplicateOutputs() {
        return replicateOutputs;
    }


    /**
     * Sets the replicateOutputs value for this GroupNode.
     * 
     * @param replicateOutputs
     */
    public void setReplicateOutputs(java.lang.Boolean replicateOutputs) {
        this.replicateOutputs = replicateOutputs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupNode)) return false;
        GroupNode other = (GroupNode) obj;
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
            ((this.clusterType==null && other.getClusterType()==null) || 
             (this.clusterType!=null &&
              this.clusterType.equals(other.getClusterType()))) &&
            ((this.replicateOutputs==null && other.getReplicateOutputs()==null) || 
             (this.replicateOutputs!=null &&
              this.replicateOutputs.equals(other.getReplicateOutputs())));
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
        if (getClusterType() != null) {
            _hashCode += getClusterType().hashCode();
        }
        if (getReplicateOutputs() != null) {
            _hashCode += getReplicateOutputs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GroupNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ClusterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicateOutputs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ReplicateOutputs"));
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
