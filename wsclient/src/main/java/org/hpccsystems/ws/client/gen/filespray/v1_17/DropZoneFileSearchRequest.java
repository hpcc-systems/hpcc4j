/**
 * DropZoneFileSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_17;

public class DropZoneFileSearchRequest  implements java.io.Serializable {
    private java.lang.String dropZoneName;

    private java.lang.String server;

    private java.lang.Boolean ECLWatchVisibleOnly;

    private java.lang.String nameFilter;

    public DropZoneFileSearchRequest() {
    }

    public DropZoneFileSearchRequest(
           java.lang.String dropZoneName,
           java.lang.String server,
           java.lang.Boolean ECLWatchVisibleOnly,
           java.lang.String nameFilter) {
           this.dropZoneName = dropZoneName;
           this.server = server;
           this.ECLWatchVisibleOnly = ECLWatchVisibleOnly;
           this.nameFilter = nameFilter;
    }


    /**
     * Gets the dropZoneName value for this DropZoneFileSearchRequest.
     * 
     * @return dropZoneName
     */
    public java.lang.String getDropZoneName() {
        return dropZoneName;
    }


    /**
     * Sets the dropZoneName value for this DropZoneFileSearchRequest.
     * 
     * @param dropZoneName
     */
    public void setDropZoneName(java.lang.String dropZoneName) {
        this.dropZoneName = dropZoneName;
    }


    /**
     * Gets the server value for this DropZoneFileSearchRequest.
     * 
     * @return server
     */
    public java.lang.String getServer() {
        return server;
    }


    /**
     * Sets the server value for this DropZoneFileSearchRequest.
     * 
     * @param server
     */
    public void setServer(java.lang.String server) {
        this.server = server;
    }


    /**
     * Gets the ECLWatchVisibleOnly value for this DropZoneFileSearchRequest.
     * 
     * @return ECLWatchVisibleOnly
     */
    public java.lang.Boolean getECLWatchVisibleOnly() {
        return ECLWatchVisibleOnly;
    }


    /**
     * Sets the ECLWatchVisibleOnly value for this DropZoneFileSearchRequest.
     * 
     * @param ECLWatchVisibleOnly
     */
    public void setECLWatchVisibleOnly(java.lang.Boolean ECLWatchVisibleOnly) {
        this.ECLWatchVisibleOnly = ECLWatchVisibleOnly;
    }


    /**
     * Gets the nameFilter value for this DropZoneFileSearchRequest.
     * 
     * @return nameFilter
     */
    public java.lang.String getNameFilter() {
        return nameFilter;
    }


    /**
     * Sets the nameFilter value for this DropZoneFileSearchRequest.
     * 
     * @param nameFilter
     */
    public void setNameFilter(java.lang.String nameFilter) {
        this.nameFilter = nameFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DropZoneFileSearchRequest)) return false;
        DropZoneFileSearchRequest other = (DropZoneFileSearchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dropZoneName==null && other.getDropZoneName()==null) || 
             (this.dropZoneName!=null &&
              this.dropZoneName.equals(other.getDropZoneName()))) &&
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer()))) &&
            ((this.ECLWatchVisibleOnly==null && other.getECLWatchVisibleOnly()==null) || 
             (this.ECLWatchVisibleOnly!=null &&
              this.ECLWatchVisibleOnly.equals(other.getECLWatchVisibleOnly()))) &&
            ((this.nameFilter==null && other.getNameFilter()==null) || 
             (this.nameFilter!=null &&
              this.nameFilter.equals(other.getNameFilter())));
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
        if (getDropZoneName() != null) {
            _hashCode += getDropZoneName().hashCode();
        }
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        if (getECLWatchVisibleOnly() != null) {
            _hashCode += getECLWatchVisibleOnly().hashCode();
        }
        if (getNameFilter() != null) {
            _hashCode += getNameFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DropZoneFileSearchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFileSearchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropZoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECLWatchVisibleOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ECLWatchVisibleOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "NameFilter"));
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
