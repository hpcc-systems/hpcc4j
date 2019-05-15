/**
 * DFUActionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUActionInfo  implements java.io.Serializable {
    private java.lang.String fileName;

    private java.lang.String nodeGroup;

    private java.lang.String actionResult;

    private java.lang.Boolean failed;

    public DFUActionInfo() {
    }

    public DFUActionInfo(
           java.lang.String fileName,
           java.lang.String nodeGroup,
           java.lang.String actionResult,
           java.lang.Boolean failed) {
           this.fileName = fileName;
           this.nodeGroup = nodeGroup;
           this.actionResult = actionResult;
           this.failed = failed;
    }


    /**
     * Gets the fileName value for this DFUActionInfo.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this DFUActionInfo.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the nodeGroup value for this DFUActionInfo.
     * 
     * @return nodeGroup
     */
    public java.lang.String getNodeGroup() {
        return nodeGroup;
    }


    /**
     * Sets the nodeGroup value for this DFUActionInfo.
     * 
     * @param nodeGroup
     */
    public void setNodeGroup(java.lang.String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }


    /**
     * Gets the actionResult value for this DFUActionInfo.
     * 
     * @return actionResult
     */
    public java.lang.String getActionResult() {
        return actionResult;
    }


    /**
     * Sets the actionResult value for this DFUActionInfo.
     * 
     * @param actionResult
     */
    public void setActionResult(java.lang.String actionResult) {
        this.actionResult = actionResult;
    }


    /**
     * Gets the failed value for this DFUActionInfo.
     * 
     * @return failed
     */
    public java.lang.Boolean getFailed() {
        return failed;
    }


    /**
     * Sets the failed value for this DFUActionInfo.
     * 
     * @param failed
     */
    public void setFailed(java.lang.Boolean failed) {
        this.failed = failed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUActionInfo)) return false;
        DFUActionInfo other = (DFUActionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.nodeGroup==null && other.getNodeGroup()==null) || 
             (this.nodeGroup!=null &&
              this.nodeGroup.equals(other.getNodeGroup()))) &&
            ((this.actionResult==null && other.getActionResult()==null) || 
             (this.actionResult!=null &&
              this.actionResult.equals(other.getActionResult()))) &&
            ((this.failed==null && other.getFailed()==null) || 
             (this.failed!=null &&
              this.failed.equals(other.getFailed())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getNodeGroup() != null) {
            _hashCode += getNodeGroup().hashCode();
        }
        if (getActionResult() != null) {
            _hashCode += getActionResult().hashCode();
        }
        if (getFailed() != null) {
            _hashCode += getFailed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUActionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUActionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NodeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ActionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Failed"));
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
