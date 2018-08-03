/**
 * RoxieControlCmd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_21;

public class RoxieControlCmd  implements java.io.Serializable {
    private java.lang.String processCluster;

    private org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdType command;

    private java.lang.Integer wait;

    public RoxieControlCmd() {
    }

    public RoxieControlCmd(
           java.lang.String processCluster,
           org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdType command,
           java.lang.Integer wait) {
           this.processCluster = processCluster;
           this.command = command;
           this.wait = wait;
    }


    /**
     * Gets the processCluster value for this RoxieControlCmd.
     * 
     * @return processCluster
     */
    public java.lang.String getProcessCluster() {
        return processCluster;
    }


    /**
     * Sets the processCluster value for this RoxieControlCmd.
     * 
     * @param processCluster
     */
    public void setProcessCluster(java.lang.String processCluster) {
        this.processCluster = processCluster;
    }


    /**
     * Gets the command value for this RoxieControlCmd.
     * 
     * @return command
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdType getCommand() {
        return command;
    }


    /**
     * Sets the command value for this RoxieControlCmd.
     * 
     * @param command
     */
    public void setCommand(org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdType command) {
        this.command = command;
    }


    /**
     * Gets the wait value for this RoxieControlCmd.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this RoxieControlCmd.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoxieControlCmd)) return false;
        RoxieControlCmd other = (RoxieControlCmd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processCluster==null && other.getProcessCluster()==null) || 
             (this.processCluster!=null &&
              this.processCluster.equals(other.getProcessCluster()))) &&
            ((this.command==null && other.getCommand()==null) || 
             (this.command!=null &&
              this.command.equals(other.getCommand()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait())));
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
        if (getProcessCluster() != null) {
            _hashCode += getProcessCluster().hashCode();
        }
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoxieControlCmd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RoxieControlCmd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ProcessCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Command"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlCmdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Wait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
