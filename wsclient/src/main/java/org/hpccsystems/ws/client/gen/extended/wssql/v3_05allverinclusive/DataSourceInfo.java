/**
 * DataSourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive;

public class DataSourceInfo  implements java.io.Serializable {
    private java.lang.String sprayedFileName;

    private java.lang.String landingZoneIP;

    private java.lang.String landingZonePath;

    private java.lang.String landingZoneFileName;

    public DataSourceInfo() {
    }

    public DataSourceInfo(
           java.lang.String sprayedFileName,
           java.lang.String landingZoneIP,
           java.lang.String landingZonePath,
           java.lang.String landingZoneFileName) {
           this.sprayedFileName = sprayedFileName;
           this.landingZoneIP = landingZoneIP;
           this.landingZonePath = landingZonePath;
           this.landingZoneFileName = landingZoneFileName;
    }


    /**
     * Gets the sprayedFileName value for this DataSourceInfo.
     * 
     * @return sprayedFileName
     */
    public java.lang.String getSprayedFileName() {
        return sprayedFileName;
    }


    /**
     * Sets the sprayedFileName value for this DataSourceInfo.
     * 
     * @param sprayedFileName
     */
    public void setSprayedFileName(java.lang.String sprayedFileName) {
        this.sprayedFileName = sprayedFileName;
    }


    /**
     * Gets the landingZoneIP value for this DataSourceInfo.
     * 
     * @return landingZoneIP
     */
    public java.lang.String getLandingZoneIP() {
        return landingZoneIP;
    }


    /**
     * Sets the landingZoneIP value for this DataSourceInfo.
     * 
     * @param landingZoneIP
     */
    public void setLandingZoneIP(java.lang.String landingZoneIP) {
        this.landingZoneIP = landingZoneIP;
    }


    /**
     * Gets the landingZonePath value for this DataSourceInfo.
     * 
     * @return landingZonePath
     */
    public java.lang.String getLandingZonePath() {
        return landingZonePath;
    }


    /**
     * Sets the landingZonePath value for this DataSourceInfo.
     * 
     * @param landingZonePath
     */
    public void setLandingZonePath(java.lang.String landingZonePath) {
        this.landingZonePath = landingZonePath;
    }


    /**
     * Gets the landingZoneFileName value for this DataSourceInfo.
     * 
     * @return landingZoneFileName
     */
    public java.lang.String getLandingZoneFileName() {
        return landingZoneFileName;
    }


    /**
     * Sets the landingZoneFileName value for this DataSourceInfo.
     * 
     * @param landingZoneFileName
     */
    public void setLandingZoneFileName(java.lang.String landingZoneFileName) {
        this.landingZoneFileName = landingZoneFileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSourceInfo)) return false;
        DataSourceInfo other = (DataSourceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sprayedFileName==null && other.getSprayedFileName()==null) || 
             (this.sprayedFileName!=null &&
              this.sprayedFileName.equals(other.getSprayedFileName()))) &&
            ((this.landingZoneIP==null && other.getLandingZoneIP()==null) || 
             (this.landingZoneIP!=null &&
              this.landingZoneIP.equals(other.getLandingZoneIP()))) &&
            ((this.landingZonePath==null && other.getLandingZonePath()==null) || 
             (this.landingZonePath!=null &&
              this.landingZonePath.equals(other.getLandingZonePath()))) &&
            ((this.landingZoneFileName==null && other.getLandingZoneFileName()==null) || 
             (this.landingZoneFileName!=null &&
              this.landingZoneFileName.equals(other.getLandingZoneFileName())));
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
        if (getSprayedFileName() != null) {
            _hashCode += getSprayedFileName().hashCode();
        }
        if (getLandingZoneIP() != null) {
            _hashCode += getLandingZoneIP().hashCode();
        }
        if (getLandingZonePath() != null) {
            _hashCode += getLandingZonePath().hashCode();
        }
        if (getLandingZoneFileName() != null) {
            _hashCode += getLandingZoneFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sprayedFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SprayedFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingZoneIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "LandingZoneIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingZonePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "LandingZonePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingZoneFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "LandingZoneFileName"));
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
