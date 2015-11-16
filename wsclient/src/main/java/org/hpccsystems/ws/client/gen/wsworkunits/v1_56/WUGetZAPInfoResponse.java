/**
 * WUGetZAPInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUGetZAPInfoResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.String WUID;

    private java.lang.String ESPIPAddress;

    private java.lang.String thorIPAddress;

    private java.lang.String buildVersion;

    private java.lang.String archive;

    public WUGetZAPInfoResponse() {
    }

    public WUGetZAPInfoResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.String WUID,
           java.lang.String ESPIPAddress,
           java.lang.String thorIPAddress,
           java.lang.String buildVersion,
           java.lang.String archive) {
           this.exceptions = exceptions;
           this.WUID = WUID;
           this.ESPIPAddress = ESPIPAddress;
           this.thorIPAddress = thorIPAddress;
           this.buildVersion = buildVersion;
           this.archive = archive;
    }


    /**
     * Gets the exceptions value for this WUGetZAPInfoResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUGetZAPInfoResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the WUID value for this WUGetZAPInfoResponse.
     * 
     * @return WUID
     */
    public java.lang.String getWUID() {
        return WUID;
    }


    /**
     * Sets the WUID value for this WUGetZAPInfoResponse.
     * 
     * @param WUID
     */
    public void setWUID(java.lang.String WUID) {
        this.WUID = WUID;
    }


    /**
     * Gets the ESPIPAddress value for this WUGetZAPInfoResponse.
     * 
     * @return ESPIPAddress
     */
    public java.lang.String getESPIPAddress() {
        return ESPIPAddress;
    }


    /**
     * Sets the ESPIPAddress value for this WUGetZAPInfoResponse.
     * 
     * @param ESPIPAddress
     */
    public void setESPIPAddress(java.lang.String ESPIPAddress) {
        this.ESPIPAddress = ESPIPAddress;
    }


    /**
     * Gets the thorIPAddress value for this WUGetZAPInfoResponse.
     * 
     * @return thorIPAddress
     */
    public java.lang.String getThorIPAddress() {
        return thorIPAddress;
    }


    /**
     * Sets the thorIPAddress value for this WUGetZAPInfoResponse.
     * 
     * @param thorIPAddress
     */
    public void setThorIPAddress(java.lang.String thorIPAddress) {
        this.thorIPAddress = thorIPAddress;
    }


    /**
     * Gets the buildVersion value for this WUGetZAPInfoResponse.
     * 
     * @return buildVersion
     */
    public java.lang.String getBuildVersion() {
        return buildVersion;
    }


    /**
     * Sets the buildVersion value for this WUGetZAPInfoResponse.
     * 
     * @param buildVersion
     */
    public void setBuildVersion(java.lang.String buildVersion) {
        this.buildVersion = buildVersion;
    }


    /**
     * Gets the archive value for this WUGetZAPInfoResponse.
     * 
     * @return archive
     */
    public java.lang.String getArchive() {
        return archive;
    }


    /**
     * Sets the archive value for this WUGetZAPInfoResponse.
     * 
     * @param archive
     */
    public void setArchive(java.lang.String archive) {
        this.archive = archive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUGetZAPInfoResponse)) return false;
        WUGetZAPInfoResponse other = (WUGetZAPInfoResponse) obj;
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
            ((this.WUID==null && other.getWUID()==null) || 
             (this.WUID!=null &&
              this.WUID.equals(other.getWUID()))) &&
            ((this.ESPIPAddress==null && other.getESPIPAddress()==null) || 
             (this.ESPIPAddress!=null &&
              this.ESPIPAddress.equals(other.getESPIPAddress()))) &&
            ((this.thorIPAddress==null && other.getThorIPAddress()==null) || 
             (this.thorIPAddress!=null &&
              this.thorIPAddress.equals(other.getThorIPAddress()))) &&
            ((this.buildVersion==null && other.getBuildVersion()==null) || 
             (this.buildVersion!=null &&
              this.buildVersion.equals(other.getBuildVersion()))) &&
            ((this.archive==null && other.getArchive()==null) || 
             (this.archive!=null &&
              this.archive.equals(other.getArchive())));
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
        if (getWUID() != null) {
            _hashCode += getWUID().hashCode();
        }
        if (getESPIPAddress() != null) {
            _hashCode += getESPIPAddress().hashCode();
        }
        if (getThorIPAddress() != null) {
            _hashCode += getThorIPAddress().hashCode();
        }
        if (getBuildVersion() != null) {
            _hashCode += getBuildVersion().hashCode();
        }
        if (getArchive() != null) {
            _hashCode += getArchive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUGetZAPInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetZAPInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESPIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ESPIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BuildVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Archive"));
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
