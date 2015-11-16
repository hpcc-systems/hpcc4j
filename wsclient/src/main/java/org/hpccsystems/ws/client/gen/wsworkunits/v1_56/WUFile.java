/**
 * WUFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUFile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String wuid;

    private java.lang.String type;

    private java.lang.Integer option;

    private java.lang.String slaveIP;

    private java.lang.String IPAddress;

    private java.lang.String description;

    private java.lang.String querySet;

    private java.lang.String query;

    private java.lang.String process;

    private java.lang.String clusterGroup;

    private java.lang.String logDate;

    private java.lang.Integer slaveNumber;

    private java.lang.Long sizeLimit;

    private java.lang.String plainText;

    public WUFile() {
    }

    public WUFile(
           java.lang.String name,
           java.lang.String wuid,
           java.lang.String type,
           java.lang.Integer option,
           java.lang.String slaveIP,
           java.lang.String IPAddress,
           java.lang.String description,
           java.lang.String querySet,
           java.lang.String query,
           java.lang.String process,
           java.lang.String clusterGroup,
           java.lang.String logDate,
           java.lang.Integer slaveNumber,
           java.lang.Long sizeLimit,
           java.lang.String plainText) {
           this.name = name;
           this.wuid = wuid;
           this.type = type;
           this.option = option;
           this.slaveIP = slaveIP;
           this.IPAddress = IPAddress;
           this.description = description;
           this.querySet = querySet;
           this.query = query;
           this.process = process;
           this.clusterGroup = clusterGroup;
           this.logDate = logDate;
           this.slaveNumber = slaveNumber;
           this.sizeLimit = sizeLimit;
           this.plainText = plainText;
    }


    /**
     * Gets the name value for this WUFile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WUFile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the wuid value for this WUFile.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUFile.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the type value for this WUFile.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WUFile.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the option value for this WUFile.
     * 
     * @return option
     */
    public java.lang.Integer getOption() {
        return option;
    }


    /**
     * Sets the option value for this WUFile.
     * 
     * @param option
     */
    public void setOption(java.lang.Integer option) {
        this.option = option;
    }


    /**
     * Gets the slaveIP value for this WUFile.
     * 
     * @return slaveIP
     */
    public java.lang.String getSlaveIP() {
        return slaveIP;
    }


    /**
     * Sets the slaveIP value for this WUFile.
     * 
     * @param slaveIP
     */
    public void setSlaveIP(java.lang.String slaveIP) {
        this.slaveIP = slaveIP;
    }


    /**
     * Gets the IPAddress value for this WUFile.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this WUFile.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the description value for this WUFile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WUFile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the querySet value for this WUFile.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this WUFile.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the query value for this WUFile.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this WUFile.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the process value for this WUFile.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this WUFile.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the clusterGroup value for this WUFile.
     * 
     * @return clusterGroup
     */
    public java.lang.String getClusterGroup() {
        return clusterGroup;
    }


    /**
     * Sets the clusterGroup value for this WUFile.
     * 
     * @param clusterGroup
     */
    public void setClusterGroup(java.lang.String clusterGroup) {
        this.clusterGroup = clusterGroup;
    }


    /**
     * Gets the logDate value for this WUFile.
     * 
     * @return logDate
     */
    public java.lang.String getLogDate() {
        return logDate;
    }


    /**
     * Sets the logDate value for this WUFile.
     * 
     * @param logDate
     */
    public void setLogDate(java.lang.String logDate) {
        this.logDate = logDate;
    }


    /**
     * Gets the slaveNumber value for this WUFile.
     * 
     * @return slaveNumber
     */
    public java.lang.Integer getSlaveNumber() {
        return slaveNumber;
    }


    /**
     * Sets the slaveNumber value for this WUFile.
     * 
     * @param slaveNumber
     */
    public void setSlaveNumber(java.lang.Integer slaveNumber) {
        this.slaveNumber = slaveNumber;
    }


    /**
     * Gets the sizeLimit value for this WUFile.
     * 
     * @return sizeLimit
     */
    public java.lang.Long getSizeLimit() {
        return sizeLimit;
    }


    /**
     * Sets the sizeLimit value for this WUFile.
     * 
     * @param sizeLimit
     */
    public void setSizeLimit(java.lang.Long sizeLimit) {
        this.sizeLimit = sizeLimit;
    }


    /**
     * Gets the plainText value for this WUFile.
     * 
     * @return plainText
     */
    public java.lang.String getPlainText() {
        return plainText;
    }


    /**
     * Sets the plainText value for this WUFile.
     * 
     * @param plainText
     */
    public void setPlainText(java.lang.String plainText) {
        this.plainText = plainText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUFile)) return false;
        WUFile other = (WUFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            ((this.slaveIP==null && other.getSlaveIP()==null) || 
             (this.slaveIP!=null &&
              this.slaveIP.equals(other.getSlaveIP()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            ((this.clusterGroup==null && other.getClusterGroup()==null) || 
             (this.clusterGroup!=null &&
              this.clusterGroup.equals(other.getClusterGroup()))) &&
            ((this.logDate==null && other.getLogDate()==null) || 
             (this.logDate!=null &&
              this.logDate.equals(other.getLogDate()))) &&
            ((this.slaveNumber==null && other.getSlaveNumber()==null) || 
             (this.slaveNumber!=null &&
              this.slaveNumber.equals(other.getSlaveNumber()))) &&
            ((this.sizeLimit==null && other.getSizeLimit()==null) || 
             (this.sizeLimit!=null &&
              this.sizeLimit.equals(other.getSizeLimit()))) &&
            ((this.plainText==null && other.getPlainText()==null) || 
             (this.plainText!=null &&
              this.plainText.equals(other.getPlainText())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        if (getSlaveIP() != null) {
            _hashCode += getSlaveIP().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        if (getClusterGroup() != null) {
            _hashCode += getClusterGroup().hashCode();
        }
        if (getLogDate() != null) {
            _hashCode += getLogDate().hashCode();
        }
        if (getSlaveNumber() != null) {
            _hashCode += getSlaveNumber().hashCode();
        }
        if (getSizeLimit() != null) {
            _hashCode += getSizeLimit().hashCode();
        }
        if (getPlainText() != null) {
            _hashCode += getPlainText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaveIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SlaveIP"));
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
        elemField.setFieldName("querySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query"));
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
        elemField.setFieldName("clusterGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterGroup"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plainText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PlainText"));
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
