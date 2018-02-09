/**
 * LockQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive;

public class LockQuery  implements java.io.Serializable {
    private java.lang.String EPIP;

    private java.lang.String XPath;

    private org.apache.axis.types.UnsignedInt durationMSLow;

    private org.apache.axis.types.UnsignedInt durationMSHigh;

    private java.lang.String timeLockedLow;

    private java.lang.String timeLockedHigh;

    private org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockModes mode;

    private java.lang.Boolean allFileLocks;

    public LockQuery() {
    }

    public LockQuery(
           java.lang.String EPIP,
           java.lang.String XPath,
           org.apache.axis.types.UnsignedInt durationMSLow,
           org.apache.axis.types.UnsignedInt durationMSHigh,
           java.lang.String timeLockedLow,
           java.lang.String timeLockedHigh,
           org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockModes mode,
           java.lang.Boolean allFileLocks) {
           this.EPIP = EPIP;
           this.XPath = XPath;
           this.durationMSLow = durationMSLow;
           this.durationMSHigh = durationMSHigh;
           this.timeLockedLow = timeLockedLow;
           this.timeLockedHigh = timeLockedHigh;
           this.mode = mode;
           this.allFileLocks = allFileLocks;
    }


    /**
     * Gets the EPIP value for this LockQuery.
     * 
     * @return EPIP
     */
    public java.lang.String getEPIP() {
        return EPIP;
    }


    /**
     * Sets the EPIP value for this LockQuery.
     * 
     * @param EPIP
     */
    public void setEPIP(java.lang.String EPIP) {
        this.EPIP = EPIP;
    }


    /**
     * Gets the XPath value for this LockQuery.
     * 
     * @return XPath
     */
    public java.lang.String getXPath() {
        return XPath;
    }


    /**
     * Sets the XPath value for this LockQuery.
     * 
     * @param XPath
     */
    public void setXPath(java.lang.String XPath) {
        this.XPath = XPath;
    }


    /**
     * Gets the durationMSLow value for this LockQuery.
     * 
     * @return durationMSLow
     */
    public org.apache.axis.types.UnsignedInt getDurationMSLow() {
        return durationMSLow;
    }


    /**
     * Sets the durationMSLow value for this LockQuery.
     * 
     * @param durationMSLow
     */
    public void setDurationMSLow(org.apache.axis.types.UnsignedInt durationMSLow) {
        this.durationMSLow = durationMSLow;
    }


    /**
     * Gets the durationMSHigh value for this LockQuery.
     * 
     * @return durationMSHigh
     */
    public org.apache.axis.types.UnsignedInt getDurationMSHigh() {
        return durationMSHigh;
    }


    /**
     * Sets the durationMSHigh value for this LockQuery.
     * 
     * @param durationMSHigh
     */
    public void setDurationMSHigh(org.apache.axis.types.UnsignedInt durationMSHigh) {
        this.durationMSHigh = durationMSHigh;
    }


    /**
     * Gets the timeLockedLow value for this LockQuery.
     * 
     * @return timeLockedLow
     */
    public java.lang.String getTimeLockedLow() {
        return timeLockedLow;
    }


    /**
     * Sets the timeLockedLow value for this LockQuery.
     * 
     * @param timeLockedLow
     */
    public void setTimeLockedLow(java.lang.String timeLockedLow) {
        this.timeLockedLow = timeLockedLow;
    }


    /**
     * Gets the timeLockedHigh value for this LockQuery.
     * 
     * @return timeLockedHigh
     */
    public java.lang.String getTimeLockedHigh() {
        return timeLockedHigh;
    }


    /**
     * Sets the timeLockedHigh value for this LockQuery.
     * 
     * @param timeLockedHigh
     */
    public void setTimeLockedHigh(java.lang.String timeLockedHigh) {
        this.timeLockedHigh = timeLockedHigh;
    }


    /**
     * Gets the mode value for this LockQuery.
     * 
     * @return mode
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockModes getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this LockQuery.
     * 
     * @param mode
     */
    public void setMode(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockModes mode) {
        this.mode = mode;
    }


    /**
     * Gets the allFileLocks value for this LockQuery.
     * 
     * @return allFileLocks
     */
    public java.lang.Boolean getAllFileLocks() {
        return allFileLocks;
    }


    /**
     * Sets the allFileLocks value for this LockQuery.
     * 
     * @param allFileLocks
     */
    public void setAllFileLocks(java.lang.Boolean allFileLocks) {
        this.allFileLocks = allFileLocks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LockQuery)) return false;
        LockQuery other = (LockQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EPIP==null && other.getEPIP()==null) || 
             (this.EPIP!=null &&
              this.EPIP.equals(other.getEPIP()))) &&
            ((this.XPath==null && other.getXPath()==null) || 
             (this.XPath!=null &&
              this.XPath.equals(other.getXPath()))) &&
            ((this.durationMSLow==null && other.getDurationMSLow()==null) || 
             (this.durationMSLow!=null &&
              this.durationMSLow.equals(other.getDurationMSLow()))) &&
            ((this.durationMSHigh==null && other.getDurationMSHigh()==null) || 
             (this.durationMSHigh!=null &&
              this.durationMSHigh.equals(other.getDurationMSHigh()))) &&
            ((this.timeLockedLow==null && other.getTimeLockedLow()==null) || 
             (this.timeLockedLow!=null &&
              this.timeLockedLow.equals(other.getTimeLockedLow()))) &&
            ((this.timeLockedHigh==null && other.getTimeLockedHigh()==null) || 
             (this.timeLockedHigh!=null &&
              this.timeLockedHigh.equals(other.getTimeLockedHigh()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.allFileLocks==null && other.getAllFileLocks()==null) || 
             (this.allFileLocks!=null &&
              this.allFileLocks.equals(other.getAllFileLocks())));
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
        if (getEPIP() != null) {
            _hashCode += getEPIP().hashCode();
        }
        if (getXPath() != null) {
            _hashCode += getXPath().hashCode();
        }
        if (getDurationMSLow() != null) {
            _hashCode += getDurationMSLow().hashCode();
        }
        if (getDurationMSHigh() != null) {
            _hashCode += getDurationMSHigh().hashCode();
        }
        if (getTimeLockedLow() != null) {
            _hashCode += getTimeLockedLow().hashCode();
        }
        if (getTimeLockedHigh() != null) {
            _hashCode += getTimeLockedHigh().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getAllFileLocks() != null) {
            _hashCode += getAllFileLocks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LockQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">LockQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EPIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "XPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationMSLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DurationMSLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationMSHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DurationMSHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLockedLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TimeLockedLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLockedHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TimeLockedHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "LockModes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allFileLocks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "AllFileLocks"));
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
