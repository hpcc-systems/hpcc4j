/**
 * ExecutePreparedSQLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class ExecutePreparedSQLResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException exceptions;

    private java.lang.String parentWuId;

    private java.lang.String result;

    private java.lang.Integer resultLimit;

    private org.apache.axis.types.UnsignedInt resultWindowStart;

    private org.apache.axis.types.UnsignedInt resultWindowCount;

    private org.hpccsystems.ws.client.soap.wssql.ECLWorkunit workunit;

    public ExecutePreparedSQLResponse() {
    }

    public ExecutePreparedSQLResponse(
           org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException exceptions,
           java.lang.String parentWuId,
           java.lang.String result,
           java.lang.Integer resultLimit,
           org.apache.axis.types.UnsignedInt resultWindowStart,
           org.apache.axis.types.UnsignedInt resultWindowCount,
           org.hpccsystems.ws.client.soap.wssql.ECLWorkunit workunit) {
           this.exceptions = exceptions;
           this.parentWuId = parentWuId;
           this.result = result;
           this.resultLimit = resultLimit;
           this.resultWindowStart = resultWindowStart;
           this.resultWindowCount = resultWindowCount;
           this.workunit = workunit;
    }


    /**
     * Gets the exceptions value for this ExecutePreparedSQLResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ExecutePreparedSQLResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the parentWuId value for this ExecutePreparedSQLResponse.
     * 
     * @return parentWuId
     */
    public java.lang.String getParentWuId() {
        return parentWuId;
    }


    /**
     * Sets the parentWuId value for this ExecutePreparedSQLResponse.
     * 
     * @param parentWuId
     */
    public void setParentWuId(java.lang.String parentWuId) {
        this.parentWuId = parentWuId;
    }


    /**
     * Gets the result value for this ExecutePreparedSQLResponse.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this ExecutePreparedSQLResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the resultLimit value for this ExecutePreparedSQLResponse.
     * 
     * @return resultLimit
     */
    public java.lang.Integer getResultLimit() {
        return resultLimit;
    }


    /**
     * Sets the resultLimit value for this ExecutePreparedSQLResponse.
     * 
     * @param resultLimit
     */
    public void setResultLimit(java.lang.Integer resultLimit) {
        this.resultLimit = resultLimit;
    }


    /**
     * Gets the resultWindowStart value for this ExecutePreparedSQLResponse.
     * 
     * @return resultWindowStart
     */
    public org.apache.axis.types.UnsignedInt getResultWindowStart() {
        return resultWindowStart;
    }


    /**
     * Sets the resultWindowStart value for this ExecutePreparedSQLResponse.
     * 
     * @param resultWindowStart
     */
    public void setResultWindowStart(org.apache.axis.types.UnsignedInt resultWindowStart) {
        this.resultWindowStart = resultWindowStart;
    }


    /**
     * Gets the resultWindowCount value for this ExecutePreparedSQLResponse.
     * 
     * @return resultWindowCount
     */
    public org.apache.axis.types.UnsignedInt getResultWindowCount() {
        return resultWindowCount;
    }


    /**
     * Sets the resultWindowCount value for this ExecutePreparedSQLResponse.
     * 
     * @param resultWindowCount
     */
    public void setResultWindowCount(org.apache.axis.types.UnsignedInt resultWindowCount) {
        this.resultWindowCount = resultWindowCount;
    }


    /**
     * Gets the workunit value for this ExecutePreparedSQLResponse.
     * 
     * @return workunit
     */
    public org.hpccsystems.ws.client.soap.wssql.ECLWorkunit getWorkunit() {
        return workunit;
    }


    /**
     * Sets the workunit value for this ExecutePreparedSQLResponse.
     * 
     * @param workunit
     */
    public void setWorkunit(org.hpccsystems.ws.client.soap.wssql.ECLWorkunit workunit) {
        this.workunit = workunit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecutePreparedSQLResponse)) return false;
        ExecutePreparedSQLResponse other = (ExecutePreparedSQLResponse) obj;
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
            ((this.parentWuId==null && other.getParentWuId()==null) || 
             (this.parentWuId!=null &&
              this.parentWuId.equals(other.getParentWuId()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.resultLimit==null && other.getResultLimit()==null) || 
             (this.resultLimit!=null &&
              this.resultLimit.equals(other.getResultLimit()))) &&
            ((this.resultWindowStart==null && other.getResultWindowStart()==null) || 
             (this.resultWindowStart!=null &&
              this.resultWindowStart.equals(other.getResultWindowStart()))) &&
            ((this.resultWindowCount==null && other.getResultWindowCount()==null) || 
             (this.resultWindowCount!=null &&
              this.resultWindowCount.equals(other.getResultWindowCount()))) &&
            ((this.workunit==null && other.getWorkunit()==null) || 
             (this.workunit!=null &&
              this.workunit.equals(other.getWorkunit())));
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
        if (getParentWuId() != null) {
            _hashCode += getParentWuId().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getResultLimit() != null) {
            _hashCode += getResultLimit().hashCode();
        }
        if (getResultWindowStart() != null) {
            _hashCode += getResultWindowStart().hashCode();
        }
        if (getResultWindowCount() != null) {
            _hashCode += getResultWindowCount().hashCode();
        }
        if (getWorkunit() != null) {
            _hashCode += getWorkunit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecutePreparedSQLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecutePreparedSQLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentWuId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ParentWuId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "resultLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultWindowStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultWindowStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultWindowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultWindowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workunit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Workunit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLWorkunit"));
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
