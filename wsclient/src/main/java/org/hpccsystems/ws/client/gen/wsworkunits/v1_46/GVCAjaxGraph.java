/**
 * GVCAjaxGraph.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_46;

public class GVCAjaxGraph  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String graphName;

    private java.lang.Integer subGraphId;

    private java.lang.Boolean subGraphOnly;

    public GVCAjaxGraph() {
    }

    public GVCAjaxGraph(
           java.lang.String name,
           java.lang.String graphName,
           java.lang.Integer subGraphId,
           java.lang.Boolean subGraphOnly) {
           this.name = name;
           this.graphName = graphName;
           this.subGraphId = subGraphId;
           this.subGraphOnly = subGraphOnly;
    }


    /**
     * Gets the name value for this GVCAjaxGraph.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GVCAjaxGraph.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the graphName value for this GVCAjaxGraph.
     * 
     * @return graphName
     */
    public java.lang.String getGraphName() {
        return graphName;
    }


    /**
     * Sets the graphName value for this GVCAjaxGraph.
     * 
     * @param graphName
     */
    public void setGraphName(java.lang.String graphName) {
        this.graphName = graphName;
    }


    /**
     * Gets the subGraphId value for this GVCAjaxGraph.
     * 
     * @return subGraphId
     */
    public java.lang.Integer getSubGraphId() {
        return subGraphId;
    }


    /**
     * Sets the subGraphId value for this GVCAjaxGraph.
     * 
     * @param subGraphId
     */
    public void setSubGraphId(java.lang.Integer subGraphId) {
        this.subGraphId = subGraphId;
    }


    /**
     * Gets the subGraphOnly value for this GVCAjaxGraph.
     * 
     * @return subGraphOnly
     */
    public java.lang.Boolean getSubGraphOnly() {
        return subGraphOnly;
    }


    /**
     * Sets the subGraphOnly value for this GVCAjaxGraph.
     * 
     * @param subGraphOnly
     */
    public void setSubGraphOnly(java.lang.Boolean subGraphOnly) {
        this.subGraphOnly = subGraphOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GVCAjaxGraph)) return false;
        GVCAjaxGraph other = (GVCAjaxGraph) obj;
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
            ((this.graphName==null && other.getGraphName()==null) || 
             (this.graphName!=null &&
              this.graphName.equals(other.getGraphName()))) &&
            ((this.subGraphId==null && other.getSubGraphId()==null) || 
             (this.subGraphId!=null &&
              this.subGraphId.equals(other.getSubGraphId()))) &&
            ((this.subGraphOnly==null && other.getSubGraphOnly()==null) || 
             (this.subGraphOnly!=null &&
              this.subGraphOnly.equals(other.getSubGraphOnly())));
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
        if (getGraphName() != null) {
            _hashCode += getGraphName().hashCode();
        }
        if (getSubGraphId() != null) {
            _hashCode += getSubGraphId().hashCode();
        }
        if (getSubGraphOnly() != null) {
            _hashCode += getSubGraphOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GVCAjaxGraph.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraph"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGraphId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SubGraphId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGraphOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SubGraphOnly"));
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
