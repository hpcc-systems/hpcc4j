/**
 * Lock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive;

public class Lock  implements java.io.Serializable {
    private java.lang.String EPIP;

    private java.lang.String XPath;

    private java.lang.String logicalFile;

    private java.lang.Long sessionID;

    private org.apache.axis.types.UnsignedInt durationMS;

    private java.lang.String timeLocked;

    private java.lang.String modes;

    private java.lang.String[] modeNames;

    public Lock() {
    }

    public Lock(
           java.lang.String EPIP,
           java.lang.String XPath,
           java.lang.String logicalFile,
           java.lang.Long sessionID,
           org.apache.axis.types.UnsignedInt durationMS,
           java.lang.String timeLocked,
           java.lang.String modes,
           java.lang.String[] modeNames) {
           this.EPIP = EPIP;
           this.XPath = XPath;
           this.logicalFile = logicalFile;
           this.sessionID = sessionID;
           this.durationMS = durationMS;
           this.timeLocked = timeLocked;
           this.modes = modes;
           this.modeNames = modeNames;
    }


    /**
     * Gets the EPIP value for this Lock.
     * 
     * @return EPIP
     */
    public java.lang.String getEPIP() {
        return EPIP;
    }


    /**
     * Sets the EPIP value for this Lock.
     * 
     * @param EPIP
     */
    public void setEPIP(java.lang.String EPIP) {
        this.EPIP = EPIP;
    }


    /**
     * Gets the XPath value for this Lock.
     * 
     * @return XPath
     */
    public java.lang.String getXPath() {
        return XPath;
    }


    /**
     * Sets the XPath value for this Lock.
     * 
     * @param XPath
     */
    public void setXPath(java.lang.String XPath) {
        this.XPath = XPath;
    }


    /**
     * Gets the logicalFile value for this Lock.
     * 
     * @return logicalFile
     */
    public java.lang.String getLogicalFile() {
        return logicalFile;
    }


    /**
     * Sets the logicalFile value for this Lock.
     * 
     * @param logicalFile
     */
    public void setLogicalFile(java.lang.String logicalFile) {
        this.logicalFile = logicalFile;
    }


    /**
     * Gets the sessionID value for this Lock.
     * 
     * @return sessionID
     */
    public java.lang.Long getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this Lock.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.Long sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the durationMS value for this Lock.
     * 
     * @return durationMS
     */
    public org.apache.axis.types.UnsignedInt getDurationMS() {
        return durationMS;
    }


    /**
     * Sets the durationMS value for this Lock.
     * 
     * @param durationMS
     */
    public void setDurationMS(org.apache.axis.types.UnsignedInt durationMS) {
        this.durationMS = durationMS;
    }


    /**
     * Gets the timeLocked value for this Lock.
     * 
     * @return timeLocked
     */
    public java.lang.String getTimeLocked() {
        return timeLocked;
    }


    /**
     * Sets the timeLocked value for this Lock.
     * 
     * @param timeLocked
     */
    public void setTimeLocked(java.lang.String timeLocked) {
        this.timeLocked = timeLocked;
    }


    /**
     * Gets the modes value for this Lock.
     * 
     * @return modes
     */
    public java.lang.String getModes() {
        return modes;
    }


    /**
     * Sets the modes value for this Lock.
     * 
     * @param modes
     */
    public void setModes(java.lang.String modes) {
        this.modes = modes;
    }


    /**
     * Gets the modeNames value for this Lock.
     * 
     * @return modeNames
     */
    public java.lang.String[] getModeNames() {
        return modeNames;
    }


    /**
     * Sets the modeNames value for this Lock.
     * 
     * @param modeNames
     */
    public void setModeNames(java.lang.String[] modeNames) {
        this.modeNames = modeNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lock)) return false;
        Lock other = (Lock) obj;
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
            ((this.logicalFile==null && other.getLogicalFile()==null) || 
             (this.logicalFile!=null &&
              this.logicalFile.equals(other.getLogicalFile()))) &&
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.durationMS==null && other.getDurationMS()==null) || 
             (this.durationMS!=null &&
              this.durationMS.equals(other.getDurationMS()))) &&
            ((this.timeLocked==null && other.getTimeLocked()==null) || 
             (this.timeLocked!=null &&
              this.timeLocked.equals(other.getTimeLocked()))) &&
            ((this.modes==null && other.getModes()==null) || 
             (this.modes!=null &&
              this.modes.equals(other.getModes()))) &&
            ((this.modeNames==null && other.getModeNames()==null) || 
             (this.modeNames!=null &&
              java.util.Arrays.equals(this.modeNames, other.getModeNames())));
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
        if (getLogicalFile() != null) {
            _hashCode += getLogicalFile().hashCode();
        }
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getDurationMS() != null) {
            _hashCode += getDurationMS().hashCode();
        }
        if (getTimeLocked() != null) {
            _hashCode += getTimeLocked().hashCode();
        }
        if (getModes() != null) {
            _hashCode += getModes().hashCode();
        }
        if (getModeNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModeNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModeNames(), i);
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
        new org.apache.axis.description.TypeDesc(Lock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Lock"));
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
        elemField.setFieldName("logicalFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "LogicalFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationMS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DurationMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TimeLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Modes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ModeNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Item"));
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
