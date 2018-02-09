/**
 * WUFileOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive;

public class WUFileOption  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.WUFileType fileType;

    private java.lang.String name;

    private java.lang.String IPAddress;

    private java.lang.String description;

    private java.lang.String process;

    private java.lang.String logDate;

    private java.lang.String clusterGroup;

    private java.lang.String plainText;

    private java.lang.Integer slaveNumber;

    private java.lang.Long sizeLimit;

    public WUFileOption() {
    }

    public WUFileOption(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.WUFileType fileType,
           java.lang.String name,
           java.lang.String IPAddress,
           java.lang.String description,
           java.lang.String process,
           java.lang.String logDate,
           java.lang.String clusterGroup,
           java.lang.String plainText,
           java.lang.Integer slaveNumber,
           java.lang.Long sizeLimit) {
           this.fileType = fileType;
           this.name = name;
           this.IPAddress = IPAddress;
           this.description = description;
           this.process = process;
           this.logDate = logDate;
           this.clusterGroup = clusterGroup;
           this.plainText = plainText;
           this.slaveNumber = slaveNumber;
           this.sizeLimit = sizeLimit;
    }


    /**
     * Gets the fileType value for this WUFileOption.
     * 
     * @return fileType
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.WUFileType getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this WUFileOption.
     * 
     * @param fileType
     */
    public void setFileType(org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.WUFileType fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the name value for this WUFileOption.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WUFileOption.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the IPAddress value for this WUFileOption.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this WUFileOption.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the description value for this WUFileOption.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WUFileOption.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the process value for this WUFileOption.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this WUFileOption.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the logDate value for this WUFileOption.
     * 
     * @return logDate
     */
    public java.lang.String getLogDate() {
        return logDate;
    }


    /**
     * Sets the logDate value for this WUFileOption.
     * 
     * @param logDate
     */
    public void setLogDate(java.lang.String logDate) {
        this.logDate = logDate;
    }


    /**
     * Gets the clusterGroup value for this WUFileOption.
     * 
     * @return clusterGroup
     */
    public java.lang.String getClusterGroup() {
        return clusterGroup;
    }


    /**
     * Sets the clusterGroup value for this WUFileOption.
     * 
     * @param clusterGroup
     */
    public void setClusterGroup(java.lang.String clusterGroup) {
        this.clusterGroup = clusterGroup;
    }


    /**
     * Gets the plainText value for this WUFileOption.
     * 
     * @return plainText
     */
    public java.lang.String getPlainText() {
        return plainText;
    }


    /**
     * Sets the plainText value for this WUFileOption.
     * 
     * @param plainText
     */
    public void setPlainText(java.lang.String plainText) {
        this.plainText = plainText;
    }


    /**
     * Gets the slaveNumber value for this WUFileOption.
     * 
     * @return slaveNumber
     */
    public java.lang.Integer getSlaveNumber() {
        return slaveNumber;
    }


    /**
     * Sets the slaveNumber value for this WUFileOption.
     * 
     * @param slaveNumber
     */
    public void setSlaveNumber(java.lang.Integer slaveNumber) {
        this.slaveNumber = slaveNumber;
    }


    /**
     * Gets the sizeLimit value for this WUFileOption.
     * 
     * @return sizeLimit
     */
    public java.lang.Long getSizeLimit() {
        return sizeLimit;
    }


    /**
     * Sets the sizeLimit value for this WUFileOption.
     * 
     * @param sizeLimit
     */
    public void setSizeLimit(java.lang.Long sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUFileOption)) return false;
        WUFileOption other = (WUFileOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            ((this.logDate==null && other.getLogDate()==null) || 
             (this.logDate!=null &&
              this.logDate.equals(other.getLogDate()))) &&
            ((this.clusterGroup==null && other.getClusterGroup()==null) || 
             (this.clusterGroup!=null &&
              this.clusterGroup.equals(other.getClusterGroup()))) &&
            ((this.plainText==null && other.getPlainText()==null) || 
             (this.plainText!=null &&
              this.plainText.equals(other.getPlainText()))) &&
            ((this.slaveNumber==null && other.getSlaveNumber()==null) || 
             (this.slaveNumber!=null &&
              this.slaveNumber.equals(other.getSlaveNumber()))) &&
            ((this.sizeLimit==null && other.getSizeLimit()==null) || 
             (this.sizeLimit!=null &&
              this.sizeLimit.equals(other.getSizeLimit())));
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
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        if (getLogDate() != null) {
            _hashCode += getLogDate().hashCode();
        }
        if (getClusterGroup() != null) {
            _hashCode += getClusterGroup().hashCode();
        }
        if (getPlainText() != null) {
            _hashCode += getPlainText().hashCode();
        }
        if (getSlaveNumber() != null) {
            _hashCode += getSlaveNumber().hashCode();
        }
        if (getSizeLimit() != null) {
            _hashCode += getSizeLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUFileOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFileOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFileType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("logDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plainText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PlainText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SlaveNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SizeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
