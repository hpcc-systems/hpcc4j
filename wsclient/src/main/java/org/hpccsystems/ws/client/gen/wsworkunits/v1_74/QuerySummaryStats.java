/**
 * QuerySummaryStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class QuerySummaryStats  implements java.io.Serializable {
    private java.lang.String endpoint;

    private java.lang.String status;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.Integer countTotal;

    private java.lang.Integer countFailed;

    private java.lang.Integer averageSlavesReplyLen;

    private java.lang.Long averageBytesOut;

    private java.lang.Long sizeAvgPeakMemory;

    private java.lang.Long timeAvgTotalExecuteMinutes;

    private java.lang.Long timeMinTotalExecuteMinutes;

    private java.lang.Long timeMaxTotalExecuteMinutes;

    private java.lang.Long percentile97;

    private java.lang.Boolean percentile97Estimate;

    public QuerySummaryStats() {
    }

    public QuerySummaryStats(
           java.lang.String endpoint,
           java.lang.String status,
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.Integer countTotal,
           java.lang.Integer countFailed,
           java.lang.Integer averageSlavesReplyLen,
           java.lang.Long averageBytesOut,
           java.lang.Long sizeAvgPeakMemory,
           java.lang.Long timeAvgTotalExecuteMinutes,
           java.lang.Long timeMinTotalExecuteMinutes,
           java.lang.Long timeMaxTotalExecuteMinutes,
           java.lang.Long percentile97,
           java.lang.Boolean percentile97Estimate) {
           this.endpoint = endpoint;
           this.status = status;
           this.startTime = startTime;
           this.endTime = endTime;
           this.countTotal = countTotal;
           this.countFailed = countFailed;
           this.averageSlavesReplyLen = averageSlavesReplyLen;
           this.averageBytesOut = averageBytesOut;
           this.sizeAvgPeakMemory = sizeAvgPeakMemory;
           this.timeAvgTotalExecuteMinutes = timeAvgTotalExecuteMinutes;
           this.timeMinTotalExecuteMinutes = timeMinTotalExecuteMinutes;
           this.timeMaxTotalExecuteMinutes = timeMaxTotalExecuteMinutes;
           this.percentile97 = percentile97;
           this.percentile97Estimate = percentile97Estimate;
    }


    /**
     * Gets the endpoint value for this QuerySummaryStats.
     * 
     * @return endpoint
     */
    public java.lang.String getEndpoint() {
        return endpoint;
    }


    /**
     * Sets the endpoint value for this QuerySummaryStats.
     * 
     * @param endpoint
     */
    public void setEndpoint(java.lang.String endpoint) {
        this.endpoint = endpoint;
    }


    /**
     * Gets the status value for this QuerySummaryStats.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this QuerySummaryStats.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the startTime value for this QuerySummaryStats.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this QuerySummaryStats.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this QuerySummaryStats.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this QuerySummaryStats.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the countTotal value for this QuerySummaryStats.
     * 
     * @return countTotal
     */
    public java.lang.Integer getCountTotal() {
        return countTotal;
    }


    /**
     * Sets the countTotal value for this QuerySummaryStats.
     * 
     * @param countTotal
     */
    public void setCountTotal(java.lang.Integer countTotal) {
        this.countTotal = countTotal;
    }


    /**
     * Gets the countFailed value for this QuerySummaryStats.
     * 
     * @return countFailed
     */
    public java.lang.Integer getCountFailed() {
        return countFailed;
    }


    /**
     * Sets the countFailed value for this QuerySummaryStats.
     * 
     * @param countFailed
     */
    public void setCountFailed(java.lang.Integer countFailed) {
        this.countFailed = countFailed;
    }


    /**
     * Gets the averageSlavesReplyLen value for this QuerySummaryStats.
     * 
     * @return averageSlavesReplyLen
     */
    public java.lang.Integer getAverageSlavesReplyLen() {
        return averageSlavesReplyLen;
    }


    /**
     * Sets the averageSlavesReplyLen value for this QuerySummaryStats.
     * 
     * @param averageSlavesReplyLen
     */
    public void setAverageSlavesReplyLen(java.lang.Integer averageSlavesReplyLen) {
        this.averageSlavesReplyLen = averageSlavesReplyLen;
    }


    /**
     * Gets the averageBytesOut value for this QuerySummaryStats.
     * 
     * @return averageBytesOut
     */
    public java.lang.Long getAverageBytesOut() {
        return averageBytesOut;
    }


    /**
     * Sets the averageBytesOut value for this QuerySummaryStats.
     * 
     * @param averageBytesOut
     */
    public void setAverageBytesOut(java.lang.Long averageBytesOut) {
        this.averageBytesOut = averageBytesOut;
    }


    /**
     * Gets the sizeAvgPeakMemory value for this QuerySummaryStats.
     * 
     * @return sizeAvgPeakMemory
     */
    public java.lang.Long getSizeAvgPeakMemory() {
        return sizeAvgPeakMemory;
    }


    /**
     * Sets the sizeAvgPeakMemory value for this QuerySummaryStats.
     * 
     * @param sizeAvgPeakMemory
     */
    public void setSizeAvgPeakMemory(java.lang.Long sizeAvgPeakMemory) {
        this.sizeAvgPeakMemory = sizeAvgPeakMemory;
    }


    /**
     * Gets the timeAvgTotalExecuteMinutes value for this QuerySummaryStats.
     * 
     * @return timeAvgTotalExecuteMinutes
     */
    public java.lang.Long getTimeAvgTotalExecuteMinutes() {
        return timeAvgTotalExecuteMinutes;
    }


    /**
     * Sets the timeAvgTotalExecuteMinutes value for this QuerySummaryStats.
     * 
     * @param timeAvgTotalExecuteMinutes
     */
    public void setTimeAvgTotalExecuteMinutes(java.lang.Long timeAvgTotalExecuteMinutes) {
        this.timeAvgTotalExecuteMinutes = timeAvgTotalExecuteMinutes;
    }


    /**
     * Gets the timeMinTotalExecuteMinutes value for this QuerySummaryStats.
     * 
     * @return timeMinTotalExecuteMinutes
     */
    public java.lang.Long getTimeMinTotalExecuteMinutes() {
        return timeMinTotalExecuteMinutes;
    }


    /**
     * Sets the timeMinTotalExecuteMinutes value for this QuerySummaryStats.
     * 
     * @param timeMinTotalExecuteMinutes
     */
    public void setTimeMinTotalExecuteMinutes(java.lang.Long timeMinTotalExecuteMinutes) {
        this.timeMinTotalExecuteMinutes = timeMinTotalExecuteMinutes;
    }


    /**
     * Gets the timeMaxTotalExecuteMinutes value for this QuerySummaryStats.
     * 
     * @return timeMaxTotalExecuteMinutes
     */
    public java.lang.Long getTimeMaxTotalExecuteMinutes() {
        return timeMaxTotalExecuteMinutes;
    }


    /**
     * Sets the timeMaxTotalExecuteMinutes value for this QuerySummaryStats.
     * 
     * @param timeMaxTotalExecuteMinutes
     */
    public void setTimeMaxTotalExecuteMinutes(java.lang.Long timeMaxTotalExecuteMinutes) {
        this.timeMaxTotalExecuteMinutes = timeMaxTotalExecuteMinutes;
    }


    /**
     * Gets the percentile97 value for this QuerySummaryStats.
     * 
     * @return percentile97
     */
    public java.lang.Long getPercentile97() {
        return percentile97;
    }


    /**
     * Sets the percentile97 value for this QuerySummaryStats.
     * 
     * @param percentile97
     */
    public void setPercentile97(java.lang.Long percentile97) {
        this.percentile97 = percentile97;
    }


    /**
     * Gets the percentile97Estimate value for this QuerySummaryStats.
     * 
     * @return percentile97Estimate
     */
    public java.lang.Boolean getPercentile97Estimate() {
        return percentile97Estimate;
    }


    /**
     * Sets the percentile97Estimate value for this QuerySummaryStats.
     * 
     * @param percentile97Estimate
     */
    public void setPercentile97Estimate(java.lang.Boolean percentile97Estimate) {
        this.percentile97Estimate = percentile97Estimate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySummaryStats)) return false;
        QuerySummaryStats other = (QuerySummaryStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endpoint==null && other.getEndpoint()==null) || 
             (this.endpoint!=null &&
              this.endpoint.equals(other.getEndpoint()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.countTotal==null && other.getCountTotal()==null) || 
             (this.countTotal!=null &&
              this.countTotal.equals(other.getCountTotal()))) &&
            ((this.countFailed==null && other.getCountFailed()==null) || 
             (this.countFailed!=null &&
              this.countFailed.equals(other.getCountFailed()))) &&
            ((this.averageSlavesReplyLen==null && other.getAverageSlavesReplyLen()==null) || 
             (this.averageSlavesReplyLen!=null &&
              this.averageSlavesReplyLen.equals(other.getAverageSlavesReplyLen()))) &&
            ((this.averageBytesOut==null && other.getAverageBytesOut()==null) || 
             (this.averageBytesOut!=null &&
              this.averageBytesOut.equals(other.getAverageBytesOut()))) &&
            ((this.sizeAvgPeakMemory==null && other.getSizeAvgPeakMemory()==null) || 
             (this.sizeAvgPeakMemory!=null &&
              this.sizeAvgPeakMemory.equals(other.getSizeAvgPeakMemory()))) &&
            ((this.timeAvgTotalExecuteMinutes==null && other.getTimeAvgTotalExecuteMinutes()==null) || 
             (this.timeAvgTotalExecuteMinutes!=null &&
              this.timeAvgTotalExecuteMinutes.equals(other.getTimeAvgTotalExecuteMinutes()))) &&
            ((this.timeMinTotalExecuteMinutes==null && other.getTimeMinTotalExecuteMinutes()==null) || 
             (this.timeMinTotalExecuteMinutes!=null &&
              this.timeMinTotalExecuteMinutes.equals(other.getTimeMinTotalExecuteMinutes()))) &&
            ((this.timeMaxTotalExecuteMinutes==null && other.getTimeMaxTotalExecuteMinutes()==null) || 
             (this.timeMaxTotalExecuteMinutes!=null &&
              this.timeMaxTotalExecuteMinutes.equals(other.getTimeMaxTotalExecuteMinutes()))) &&
            ((this.percentile97==null && other.getPercentile97()==null) || 
             (this.percentile97!=null &&
              this.percentile97.equals(other.getPercentile97()))) &&
            ((this.percentile97Estimate==null && other.getPercentile97Estimate()==null) || 
             (this.percentile97Estimate!=null &&
              this.percentile97Estimate.equals(other.getPercentile97Estimate())));
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
        if (getEndpoint() != null) {
            _hashCode += getEndpoint().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getCountTotal() != null) {
            _hashCode += getCountTotal().hashCode();
        }
        if (getCountFailed() != null) {
            _hashCode += getCountFailed().hashCode();
        }
        if (getAverageSlavesReplyLen() != null) {
            _hashCode += getAverageSlavesReplyLen().hashCode();
        }
        if (getAverageBytesOut() != null) {
            _hashCode += getAverageBytesOut().hashCode();
        }
        if (getSizeAvgPeakMemory() != null) {
            _hashCode += getSizeAvgPeakMemory().hashCode();
        }
        if (getTimeAvgTotalExecuteMinutes() != null) {
            _hashCode += getTimeAvgTotalExecuteMinutes().hashCode();
        }
        if (getTimeMinTotalExecuteMinutes() != null) {
            _hashCode += getTimeMinTotalExecuteMinutes().hashCode();
        }
        if (getTimeMaxTotalExecuteMinutes() != null) {
            _hashCode += getTimeMaxTotalExecuteMinutes().hashCode();
        }
        if (getPercentile97() != null) {
            _hashCode += getPercentile97().hashCode();
        }
        if (getPercentile97Estimate() != null) {
            _hashCode += getPercentile97Estimate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySummaryStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySummaryStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Endpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CountTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CountFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageSlavesReplyLen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AverageSlavesReplyLen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageBytesOut");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AverageBytesOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeAvgPeakMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SizeAvgPeakMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeAvgTotalExecuteMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeAvgTotalExecuteMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeMinTotalExecuteMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeMinTotalExecuteMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeMaxTotalExecuteMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeMaxTotalExecuteMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentile97");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Percentile97"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentile97Estimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Percentile97Estimate"));
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
