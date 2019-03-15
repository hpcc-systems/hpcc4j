/**
 * WUCreateZAPInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUCreateZAPInfo  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String ESPIPAddress;

    private java.lang.String thorIPAddress;

    private java.lang.String buildVersion;

    private java.lang.String problemDescription;

    private java.lang.String whatChanged;

    private java.lang.String whereSlow;

    private java.lang.String ZAPFileName;

    private java.lang.String includeThorSlaveLog;

    private java.lang.String ZAPPassword;

    private java.lang.Boolean sendEmail;

    private java.lang.Boolean attachZAPReportToEmail;

    private java.lang.String emailFrom;

    private java.lang.String emailSubject;

    private java.lang.String emailBody;

    public WUCreateZAPInfo() {
    }

    public WUCreateZAPInfo(
           java.lang.String wuid,
           java.lang.String ESPIPAddress,
           java.lang.String thorIPAddress,
           java.lang.String buildVersion,
           java.lang.String problemDescription,
           java.lang.String whatChanged,
           java.lang.String whereSlow,
           java.lang.String ZAPFileName,
           java.lang.String includeThorSlaveLog,
           java.lang.String ZAPPassword,
           java.lang.Boolean sendEmail,
           java.lang.Boolean attachZAPReportToEmail,
           java.lang.String emailFrom,
           java.lang.String emailSubject,
           java.lang.String emailBody) {
           this.wuid = wuid;
           this.ESPIPAddress = ESPIPAddress;
           this.thorIPAddress = thorIPAddress;
           this.buildVersion = buildVersion;
           this.problemDescription = problemDescription;
           this.whatChanged = whatChanged;
           this.whereSlow = whereSlow;
           this.ZAPFileName = ZAPFileName;
           this.includeThorSlaveLog = includeThorSlaveLog;
           this.ZAPPassword = ZAPPassword;
           this.sendEmail = sendEmail;
           this.attachZAPReportToEmail = attachZAPReportToEmail;
           this.emailFrom = emailFrom;
           this.emailSubject = emailSubject;
           this.emailBody = emailBody;
    }


    /**
     * Gets the wuid value for this WUCreateZAPInfo.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUCreateZAPInfo.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the ESPIPAddress value for this WUCreateZAPInfo.
     * 
     * @return ESPIPAddress
     */
    public java.lang.String getESPIPAddress() {
        return ESPIPAddress;
    }


    /**
     * Sets the ESPIPAddress value for this WUCreateZAPInfo.
     * 
     * @param ESPIPAddress
     */
    public void setESPIPAddress(java.lang.String ESPIPAddress) {
        this.ESPIPAddress = ESPIPAddress;
    }


    /**
     * Gets the thorIPAddress value for this WUCreateZAPInfo.
     * 
     * @return thorIPAddress
     */
    public java.lang.String getThorIPAddress() {
        return thorIPAddress;
    }


    /**
     * Sets the thorIPAddress value for this WUCreateZAPInfo.
     * 
     * @param thorIPAddress
     */
    public void setThorIPAddress(java.lang.String thorIPAddress) {
        this.thorIPAddress = thorIPAddress;
    }


    /**
     * Gets the buildVersion value for this WUCreateZAPInfo.
     * 
     * @return buildVersion
     */
    public java.lang.String getBuildVersion() {
        return buildVersion;
    }


    /**
     * Sets the buildVersion value for this WUCreateZAPInfo.
     * 
     * @param buildVersion
     */
    public void setBuildVersion(java.lang.String buildVersion) {
        this.buildVersion = buildVersion;
    }


    /**
     * Gets the problemDescription value for this WUCreateZAPInfo.
     * 
     * @return problemDescription
     */
    public java.lang.String getProblemDescription() {
        return problemDescription;
    }


    /**
     * Sets the problemDescription value for this WUCreateZAPInfo.
     * 
     * @param problemDescription
     */
    public void setProblemDescription(java.lang.String problemDescription) {
        this.problemDescription = problemDescription;
    }


    /**
     * Gets the whatChanged value for this WUCreateZAPInfo.
     * 
     * @return whatChanged
     */
    public java.lang.String getWhatChanged() {
        return whatChanged;
    }


    /**
     * Sets the whatChanged value for this WUCreateZAPInfo.
     * 
     * @param whatChanged
     */
    public void setWhatChanged(java.lang.String whatChanged) {
        this.whatChanged = whatChanged;
    }


    /**
     * Gets the whereSlow value for this WUCreateZAPInfo.
     * 
     * @return whereSlow
     */
    public java.lang.String getWhereSlow() {
        return whereSlow;
    }


    /**
     * Sets the whereSlow value for this WUCreateZAPInfo.
     * 
     * @param whereSlow
     */
    public void setWhereSlow(java.lang.String whereSlow) {
        this.whereSlow = whereSlow;
    }


    /**
     * Gets the ZAPFileName value for this WUCreateZAPInfo.
     * 
     * @return ZAPFileName
     */
    public java.lang.String getZAPFileName() {
        return ZAPFileName;
    }


    /**
     * Sets the ZAPFileName value for this WUCreateZAPInfo.
     * 
     * @param ZAPFileName
     */
    public void setZAPFileName(java.lang.String ZAPFileName) {
        this.ZAPFileName = ZAPFileName;
    }


    /**
     * Gets the includeThorSlaveLog value for this WUCreateZAPInfo.
     * 
     * @return includeThorSlaveLog
     */
    public java.lang.String getIncludeThorSlaveLog() {
        return includeThorSlaveLog;
    }


    /**
     * Sets the includeThorSlaveLog value for this WUCreateZAPInfo.
     * 
     * @param includeThorSlaveLog
     */
    public void setIncludeThorSlaveLog(java.lang.String includeThorSlaveLog) {
        this.includeThorSlaveLog = includeThorSlaveLog;
    }


    /**
     * Gets the ZAPPassword value for this WUCreateZAPInfo.
     * 
     * @return ZAPPassword
     */
    public java.lang.String getZAPPassword() {
        return ZAPPassword;
    }


    /**
     * Sets the ZAPPassword value for this WUCreateZAPInfo.
     * 
     * @param ZAPPassword
     */
    public void setZAPPassword(java.lang.String ZAPPassword) {
        this.ZAPPassword = ZAPPassword;
    }


    /**
     * Gets the sendEmail value for this WUCreateZAPInfo.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this WUCreateZAPInfo.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the attachZAPReportToEmail value for this WUCreateZAPInfo.
     * 
     * @return attachZAPReportToEmail
     */
    public java.lang.Boolean getAttachZAPReportToEmail() {
        return attachZAPReportToEmail;
    }


    /**
     * Sets the attachZAPReportToEmail value for this WUCreateZAPInfo.
     * 
     * @param attachZAPReportToEmail
     */
    public void setAttachZAPReportToEmail(java.lang.Boolean attachZAPReportToEmail) {
        this.attachZAPReportToEmail = attachZAPReportToEmail;
    }


    /**
     * Gets the emailFrom value for this WUCreateZAPInfo.
     * 
     * @return emailFrom
     */
    public java.lang.String getEmailFrom() {
        return emailFrom;
    }


    /**
     * Sets the emailFrom value for this WUCreateZAPInfo.
     * 
     * @param emailFrom
     */
    public void setEmailFrom(java.lang.String emailFrom) {
        this.emailFrom = emailFrom;
    }


    /**
     * Gets the emailSubject value for this WUCreateZAPInfo.
     * 
     * @return emailSubject
     */
    public java.lang.String getEmailSubject() {
        return emailSubject;
    }


    /**
     * Sets the emailSubject value for this WUCreateZAPInfo.
     * 
     * @param emailSubject
     */
    public void setEmailSubject(java.lang.String emailSubject) {
        this.emailSubject = emailSubject;
    }


    /**
     * Gets the emailBody value for this WUCreateZAPInfo.
     * 
     * @return emailBody
     */
    public java.lang.String getEmailBody() {
        return emailBody;
    }


    /**
     * Sets the emailBody value for this WUCreateZAPInfo.
     * 
     * @param emailBody
     */
    public void setEmailBody(java.lang.String emailBody) {
        this.emailBody = emailBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUCreateZAPInfo)) return false;
        WUCreateZAPInfo other = (WUCreateZAPInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.ESPIPAddress==null && other.getESPIPAddress()==null) || 
             (this.ESPIPAddress!=null &&
              this.ESPIPAddress.equals(other.getESPIPAddress()))) &&
            ((this.thorIPAddress==null && other.getThorIPAddress()==null) || 
             (this.thorIPAddress!=null &&
              this.thorIPAddress.equals(other.getThorIPAddress()))) &&
            ((this.buildVersion==null && other.getBuildVersion()==null) || 
             (this.buildVersion!=null &&
              this.buildVersion.equals(other.getBuildVersion()))) &&
            ((this.problemDescription==null && other.getProblemDescription()==null) || 
             (this.problemDescription!=null &&
              this.problemDescription.equals(other.getProblemDescription()))) &&
            ((this.whatChanged==null && other.getWhatChanged()==null) || 
             (this.whatChanged!=null &&
              this.whatChanged.equals(other.getWhatChanged()))) &&
            ((this.whereSlow==null && other.getWhereSlow()==null) || 
             (this.whereSlow!=null &&
              this.whereSlow.equals(other.getWhereSlow()))) &&
            ((this.ZAPFileName==null && other.getZAPFileName()==null) || 
             (this.ZAPFileName!=null &&
              this.ZAPFileName.equals(other.getZAPFileName()))) &&
            ((this.includeThorSlaveLog==null && other.getIncludeThorSlaveLog()==null) || 
             (this.includeThorSlaveLog!=null &&
              this.includeThorSlaveLog.equals(other.getIncludeThorSlaveLog()))) &&
            ((this.ZAPPassword==null && other.getZAPPassword()==null) || 
             (this.ZAPPassword!=null &&
              this.ZAPPassword.equals(other.getZAPPassword()))) &&
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.attachZAPReportToEmail==null && other.getAttachZAPReportToEmail()==null) || 
             (this.attachZAPReportToEmail!=null &&
              this.attachZAPReportToEmail.equals(other.getAttachZAPReportToEmail()))) &&
            ((this.emailFrom==null && other.getEmailFrom()==null) || 
             (this.emailFrom!=null &&
              this.emailFrom.equals(other.getEmailFrom()))) &&
            ((this.emailSubject==null && other.getEmailSubject()==null) || 
             (this.emailSubject!=null &&
              this.emailSubject.equals(other.getEmailSubject()))) &&
            ((this.emailBody==null && other.getEmailBody()==null) || 
             (this.emailBody!=null &&
              this.emailBody.equals(other.getEmailBody())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
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
        if (getProblemDescription() != null) {
            _hashCode += getProblemDescription().hashCode();
        }
        if (getWhatChanged() != null) {
            _hashCode += getWhatChanged().hashCode();
        }
        if (getWhereSlow() != null) {
            _hashCode += getWhereSlow().hashCode();
        }
        if (getZAPFileName() != null) {
            _hashCode += getZAPFileName().hashCode();
        }
        if (getIncludeThorSlaveLog() != null) {
            _hashCode += getIncludeThorSlaveLog().hashCode();
        }
        if (getZAPPassword() != null) {
            _hashCode += getZAPPassword().hashCode();
        }
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getAttachZAPReportToEmail() != null) {
            _hashCode += getAttachZAPReportToEmail().hashCode();
        }
        if (getEmailFrom() != null) {
            _hashCode += getEmailFrom().hashCode();
        }
        if (getEmailSubject() != null) {
            _hashCode += getEmailSubject().hashCode();
        }
        if (getEmailBody() != null) {
            _hashCode += getEmailBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUCreateZAPInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateZAPInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
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
        elemField.setFieldName("problemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ProblemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whatChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WhatChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereSlow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WhereSlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZAPFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ZAPFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeThorSlaveLog");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeThorSlaveLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZAPPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ZAPPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachZAPReportToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AttachZAPReportToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EmailFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EmailSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBody");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EmailBody"));
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
