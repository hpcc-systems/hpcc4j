/**
 * WURecreateQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WURecreateQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions;

    private java.lang.String wuid;

    private java.lang.String querySet;

    private java.lang.String queryName;

    private java.lang.String queryId;

    private java.lang.String memoryLimit;

    private org.apache.axis.types.NonNegativeInteger timeLimit;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimit;

    private java.lang.String priority;

    private java.lang.String comment;

    private java.lang.Boolean reloadFailed;

    private java.lang.Boolean suspended;

    private java.lang.String errorMessage;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] fileErrors;

    public WURecreateQueryResponse() {
    }

    public WURecreateQueryResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions,
           java.lang.String wuid,
           java.lang.String querySet,
           java.lang.String queryName,
           java.lang.String queryId,
           java.lang.String memoryLimit,
           org.apache.axis.types.NonNegativeInteger timeLimit,
           org.apache.axis.types.NonNegativeInteger warnTimeLimit,
           java.lang.String priority,
           java.lang.String comment,
           java.lang.Boolean reloadFailed,
           java.lang.Boolean suspended,
           java.lang.String errorMessage,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] fileErrors) {
           this.exceptions = exceptions;
           this.wuid = wuid;
           this.querySet = querySet;
           this.queryName = queryName;
           this.queryId = queryId;
           this.memoryLimit = memoryLimit;
           this.timeLimit = timeLimit;
           this.warnTimeLimit = warnTimeLimit;
           this.priority = priority;
           this.comment = comment;
           this.reloadFailed = reloadFailed;
           this.suspended = suspended;
           this.errorMessage = errorMessage;
           this.fileErrors = fileErrors;
    }


    /**
     * Gets the exceptions value for this WURecreateQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WURecreateQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the wuid value for this WURecreateQueryResponse.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WURecreateQueryResponse.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the querySet value for this WURecreateQueryResponse.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this WURecreateQueryResponse.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the queryName value for this WURecreateQueryResponse.
     * 
     * @return queryName
     */
    public java.lang.String getQueryName() {
        return queryName;
    }


    /**
     * Sets the queryName value for this WURecreateQueryResponse.
     * 
     * @param queryName
     */
    public void setQueryName(java.lang.String queryName) {
        this.queryName = queryName;
    }


    /**
     * Gets the queryId value for this WURecreateQueryResponse.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this WURecreateQueryResponse.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the memoryLimit value for this WURecreateQueryResponse.
     * 
     * @return memoryLimit
     */
    public java.lang.String getMemoryLimit() {
        return memoryLimit;
    }


    /**
     * Sets the memoryLimit value for this WURecreateQueryResponse.
     * 
     * @param memoryLimit
     */
    public void setMemoryLimit(java.lang.String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }


    /**
     * Gets the timeLimit value for this WURecreateQueryResponse.
     * 
     * @return timeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getTimeLimit() {
        return timeLimit;
    }


    /**
     * Sets the timeLimit value for this WURecreateQueryResponse.
     * 
     * @param timeLimit
     */
    public void setTimeLimit(org.apache.axis.types.NonNegativeInteger timeLimit) {
        this.timeLimit = timeLimit;
    }


    /**
     * Gets the warnTimeLimit value for this WURecreateQueryResponse.
     * 
     * @return warnTimeLimit
     */
    public org.apache.axis.types.NonNegativeInteger getWarnTimeLimit() {
        return warnTimeLimit;
    }


    /**
     * Sets the warnTimeLimit value for this WURecreateQueryResponse.
     * 
     * @param warnTimeLimit
     */
    public void setWarnTimeLimit(org.apache.axis.types.NonNegativeInteger warnTimeLimit) {
        this.warnTimeLimit = warnTimeLimit;
    }


    /**
     * Gets the priority value for this WURecreateQueryResponse.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WURecreateQueryResponse.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the comment value for this WURecreateQueryResponse.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WURecreateQueryResponse.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the reloadFailed value for this WURecreateQueryResponse.
     * 
     * @return reloadFailed
     */
    public java.lang.Boolean getReloadFailed() {
        return reloadFailed;
    }


    /**
     * Sets the reloadFailed value for this WURecreateQueryResponse.
     * 
     * @param reloadFailed
     */
    public void setReloadFailed(java.lang.Boolean reloadFailed) {
        this.reloadFailed = reloadFailed;
    }


    /**
     * Gets the suspended value for this WURecreateQueryResponse.
     * 
     * @return suspended
     */
    public java.lang.Boolean getSuspended() {
        return suspended;
    }


    /**
     * Sets the suspended value for this WURecreateQueryResponse.
     * 
     * @param suspended
     */
    public void setSuspended(java.lang.Boolean suspended) {
        this.suspended = suspended;
    }


    /**
     * Gets the errorMessage value for this WURecreateQueryResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this WURecreateQueryResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the fileErrors value for this WURecreateQueryResponse.
     * 
     * @return fileErrors
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] getFileErrors() {
        return fileErrors;
    }


    /**
     * Sets the fileErrors value for this WURecreateQueryResponse.
     * 
     * @param fileErrors
     */
    public void setFileErrors(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] fileErrors) {
        this.fileErrors = fileErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WURecreateQueryResponse)) return false;
        WURecreateQueryResponse other = (WURecreateQueryResponse) obj;
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
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.queryName==null && other.getQueryName()==null) || 
             (this.queryName!=null &&
              this.queryName.equals(other.getQueryName()))) &&
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.memoryLimit==null && other.getMemoryLimit()==null) || 
             (this.memoryLimit!=null &&
              this.memoryLimit.equals(other.getMemoryLimit()))) &&
            ((this.timeLimit==null && other.getTimeLimit()==null) || 
             (this.timeLimit!=null &&
              this.timeLimit.equals(other.getTimeLimit()))) &&
            ((this.warnTimeLimit==null && other.getWarnTimeLimit()==null) || 
             (this.warnTimeLimit!=null &&
              this.warnTimeLimit.equals(other.getWarnTimeLimit()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.reloadFailed==null && other.getReloadFailed()==null) || 
             (this.reloadFailed!=null &&
              this.reloadFailed.equals(other.getReloadFailed()))) &&
            ((this.suspended==null && other.getSuspended()==null) || 
             (this.suspended!=null &&
              this.suspended.equals(other.getSuspended()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.fileErrors==null && other.getFileErrors()==null) || 
             (this.fileErrors!=null &&
              java.util.Arrays.equals(this.fileErrors, other.getFileErrors())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getQueryName() != null) {
            _hashCode += getQueryName().hashCode();
        }
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
        }
        if (getMemoryLimit() != null) {
            _hashCode += getMemoryLimit().hashCode();
        }
        if (getTimeLimit() != null) {
            _hashCode += getTimeLimit().hashCode();
        }
        if (getWarnTimeLimit() != null) {
            _hashCode += getWarnTimeLimit().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getReloadFailed() != null) {
            _hashCode += getReloadFailed().hashCode();
        }
        if (getSuspended() != null) {
            _hashCode += getSuspended().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getFileErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileErrors(), i);
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
        new org.apache.axis.description.TypeDesc(WURecreateQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WURecreateQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
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
        elemField.setFieldName("querySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnTimeLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarnTimeLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reloadFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ReloadFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Suspended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "File"));
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
