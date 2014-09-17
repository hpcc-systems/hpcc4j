/**
 * StatusServerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_19;

public class StatusServerInfo  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wssmc.v1_19.TargetCluster targetClusterInfo;

    private org.hpccsystems.ws.client.gen.wssmc.v1_19.ServerJobQueue serverInfo;

    private org.hpccsystems.ws.client.gen.wssmc.v1_19.ActiveWorkunit[] workunits;

    public StatusServerInfo() {
    }

    public StatusServerInfo(
           org.hpccsystems.ws.client.gen.wssmc.v1_19.TargetCluster targetClusterInfo,
           org.hpccsystems.ws.client.gen.wssmc.v1_19.ServerJobQueue serverInfo,
           org.hpccsystems.ws.client.gen.wssmc.v1_19.ActiveWorkunit[] workunits) {
           this.targetClusterInfo = targetClusterInfo;
           this.serverInfo = serverInfo;
           this.workunits = workunits;
    }


    /**
     * Gets the targetClusterInfo value for this StatusServerInfo.
     * 
     * @return targetClusterInfo
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.TargetCluster getTargetClusterInfo() {
        return targetClusterInfo;
    }


    /**
     * Sets the targetClusterInfo value for this StatusServerInfo.
     * 
     * @param targetClusterInfo
     */
    public void setTargetClusterInfo(org.hpccsystems.ws.client.gen.wssmc.v1_19.TargetCluster targetClusterInfo) {
        this.targetClusterInfo = targetClusterInfo;
    }


    /**
     * Gets the serverInfo value for this StatusServerInfo.
     * 
     * @return serverInfo
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.ServerJobQueue getServerInfo() {
        return serverInfo;
    }


    /**
     * Sets the serverInfo value for this StatusServerInfo.
     * 
     * @param serverInfo
     */
    public void setServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_19.ServerJobQueue serverInfo) {
        this.serverInfo = serverInfo;
    }


    /**
     * Gets the workunits value for this StatusServerInfo.
     * 
     * @return workunits
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.ActiveWorkunit[] getWorkunits() {
        return workunits;
    }


    /**
     * Sets the workunits value for this StatusServerInfo.
     * 
     * @param workunits
     */
    public void setWorkunits(org.hpccsystems.ws.client.gen.wssmc.v1_19.ActiveWorkunit[] workunits) {
        this.workunits = workunits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusServerInfo)) return false;
        StatusServerInfo other = (StatusServerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetClusterInfo==null && other.getTargetClusterInfo()==null) || 
             (this.targetClusterInfo!=null &&
              this.targetClusterInfo.equals(other.getTargetClusterInfo()))) &&
            ((this.serverInfo==null && other.getServerInfo()==null) || 
             (this.serverInfo!=null &&
              this.serverInfo.equals(other.getServerInfo()))) &&
            ((this.workunits==null && other.getWorkunits()==null) || 
             (this.workunits!=null &&
              java.util.Arrays.equals(this.workunits, other.getWorkunits())));
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
        if (getTargetClusterInfo() != null) {
            _hashCode += getTargetClusterInfo().hashCode();
        }
        if (getServerInfo() != null) {
            _hashCode += getServerInfo().hashCode();
        }
        if (getWorkunits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkunits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkunits(), i);
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
        new org.apache.axis.description.TypeDesc(StatusServerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StatusServerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetClusterInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TargetClusterInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TargetCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workunits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Workunits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit"));
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
