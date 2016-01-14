/**
 * WUListQueriesUsingFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUListQueriesUsingFileResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.String process;

    private java.lang.String fileName;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.TargetQueriesUsingFile[] targets;

    public WUListQueriesUsingFileResponse() {
    }

    public WUListQueriesUsingFileResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.String process,
           java.lang.String fileName,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.TargetQueriesUsingFile[] targets) {
           this.exceptions = exceptions;
           this.process = process;
           this.fileName = fileName;
           this.targets = targets;
    }


    /**
     * Gets the exceptions value for this WUListQueriesUsingFileResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUListQueriesUsingFileResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the process value for this WUListQueriesUsingFileResponse.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this WUListQueriesUsingFileResponse.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the fileName value for this WUListQueriesUsingFileResponse.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this WUListQueriesUsingFileResponse.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the targets value for this WUListQueriesUsingFileResponse.
     * 
     * @return targets
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.TargetQueriesUsingFile[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this WUListQueriesUsingFileResponse.
     * 
     * @param targets
     */
    public void setTargets(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.TargetQueriesUsingFile[] targets) {
        this.targets = targets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUListQueriesUsingFileResponse)) return false;
        WUListQueriesUsingFileResponse other = (WUListQueriesUsingFileResponse) obj;
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
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets())));
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
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
        new org.apache.axis.description.TypeDesc(WUListQueriesUsingFileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesUsingFileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Process"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TargetQueriesUsingFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TargetQueriesUsingFile"));
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
