/**
 * ExecuteSQLRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class ExecuteSQLRequest  implements java.io.Serializable {
    private java.lang.String sqlText;

    private java.lang.String userName;

    private java.lang.String targetCluster;

    private java.lang.String targetQuerySet;

    private java.lang.Boolean suppressResults;

    private java.lang.Boolean suppressXmlSchema;

    private java.lang.Integer wait;

    private java.lang.Integer resultLimit;

    private java.lang.Integer resultWindowStart;

    private java.lang.Integer resultWindowCount;

    public ExecuteSQLRequest() {
    }

    public ExecuteSQLRequest(
           java.lang.String sqlText,
           java.lang.String userName,
           java.lang.String targetCluster,
           java.lang.String targetQuerySet,
           java.lang.Boolean suppressResults,
           java.lang.Boolean suppressXmlSchema,
           java.lang.Integer wait,
           java.lang.Integer resultLimit,
           java.lang.Integer resultWindowStart,
           java.lang.Integer resultWindowCount) {
           this.sqlText = sqlText;
           this.userName = userName;
           this.targetCluster = targetCluster;
           this.targetQuerySet = targetQuerySet;
           this.suppressResults = suppressResults;
           this.suppressXmlSchema = suppressXmlSchema;
           this.wait = wait;
           this.resultLimit = resultLimit;
           this.resultWindowStart = resultWindowStart;
           this.resultWindowCount = resultWindowCount;
    }


    /**
     * Gets the sqlText value for this ExecuteSQLRequest.
     * 
     * @return sqlText
     */
    public java.lang.String getSqlText() {
        return sqlText;
    }


    /**
     * Sets the sqlText value for this ExecuteSQLRequest.
     * 
     * @param sqlText
     */
    public void setSqlText(java.lang.String sqlText) {
        this.sqlText = sqlText;
    }


    /**
     * Gets the userName value for this ExecuteSQLRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this ExecuteSQLRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the targetCluster value for this ExecuteSQLRequest.
     * 
     * @return targetCluster
     */
    public java.lang.String getTargetCluster() {
        return targetCluster;
    }


    /**
     * Sets the targetCluster value for this ExecuteSQLRequest.
     * 
     * @param targetCluster
     */
    public void setTargetCluster(java.lang.String targetCluster) {
        this.targetCluster = targetCluster;
    }


    /**
     * Gets the targetQuerySet value for this ExecuteSQLRequest.
     * 
     * @return targetQuerySet
     */
    public java.lang.String getTargetQuerySet() {
        return targetQuerySet;
    }


    /**
     * Sets the targetQuerySet value for this ExecuteSQLRequest.
     * 
     * @param targetQuerySet
     */
    public void setTargetQuerySet(java.lang.String targetQuerySet) {
        this.targetQuerySet = targetQuerySet;
    }


    /**
     * Gets the suppressResults value for this ExecuteSQLRequest.
     * 
     * @return suppressResults
     */
    public java.lang.Boolean getSuppressResults() {
        return suppressResults;
    }


    /**
     * Sets the suppressResults value for this ExecuteSQLRequest.
     * 
     * @param suppressResults
     */
    public void setSuppressResults(java.lang.Boolean suppressResults) {
        this.suppressResults = suppressResults;
    }


    /**
     * Gets the suppressXmlSchema value for this ExecuteSQLRequest.
     * 
     * @return suppressXmlSchema
     */
    public java.lang.Boolean getSuppressXmlSchema() {
        return suppressXmlSchema;
    }


    /**
     * Sets the suppressXmlSchema value for this ExecuteSQLRequest.
     * 
     * @param suppressXmlSchema
     */
    public void setSuppressXmlSchema(java.lang.Boolean suppressXmlSchema) {
        this.suppressXmlSchema = suppressXmlSchema;
    }


    /**
     * Gets the wait value for this ExecuteSQLRequest.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this ExecuteSQLRequest.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }


    /**
     * Gets the resultLimit value for this ExecuteSQLRequest.
     * 
     * @return resultLimit
     */
    public java.lang.Integer getResultLimit() {
        return resultLimit;
    }


    /**
     * Sets the resultLimit value for this ExecuteSQLRequest.
     * 
     * @param resultLimit
     */
    public void setResultLimit(java.lang.Integer resultLimit) {
        this.resultLimit = resultLimit;
    }


    /**
     * Gets the resultWindowStart value for this ExecuteSQLRequest.
     * 
     * @return resultWindowStart
     */
    public java.lang.Integer getResultWindowStart() {
        return resultWindowStart;
    }


    /**
     * Sets the resultWindowStart value for this ExecuteSQLRequest.
     * 
     * @param resultWindowStart
     */
    public void setResultWindowStart(java.lang.Integer resultWindowStart) {
        this.resultWindowStart = resultWindowStart;
    }


    /**
     * Gets the resultWindowCount value for this ExecuteSQLRequest.
     * 
     * @return resultWindowCount
     */
    public java.lang.Integer getResultWindowCount() {
        return resultWindowCount;
    }


    /**
     * Sets the resultWindowCount value for this ExecuteSQLRequest.
     * 
     * @param resultWindowCount
     */
    public void setResultWindowCount(java.lang.Integer resultWindowCount) {
        this.resultWindowCount = resultWindowCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteSQLRequest)) return false;
        ExecuteSQLRequest other = (ExecuteSQLRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqlText==null && other.getSqlText()==null) || 
             (this.sqlText!=null &&
              this.sqlText.equals(other.getSqlText()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.targetCluster==null && other.getTargetCluster()==null) || 
             (this.targetCluster!=null &&
              this.targetCluster.equals(other.getTargetCluster()))) &&
            ((this.targetQuerySet==null && other.getTargetQuerySet()==null) || 
             (this.targetQuerySet!=null &&
              this.targetQuerySet.equals(other.getTargetQuerySet()))) &&
            ((this.suppressResults==null && other.getSuppressResults()==null) || 
             (this.suppressResults!=null &&
              this.suppressResults.equals(other.getSuppressResults()))) &&
            ((this.suppressXmlSchema==null && other.getSuppressXmlSchema()==null) || 
             (this.suppressXmlSchema!=null &&
              this.suppressXmlSchema.equals(other.getSuppressXmlSchema()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait()))) &&
            ((this.resultLimit==null && other.getResultLimit()==null) || 
             (this.resultLimit!=null &&
              this.resultLimit.equals(other.getResultLimit()))) &&
            ((this.resultWindowStart==null && other.getResultWindowStart()==null) || 
             (this.resultWindowStart!=null &&
              this.resultWindowStart.equals(other.getResultWindowStart()))) &&
            ((this.resultWindowCount==null && other.getResultWindowCount()==null) || 
             (this.resultWindowCount!=null &&
              this.resultWindowCount.equals(other.getResultWindowCount())));
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
        if (getSqlText() != null) {
            _hashCode += getSqlText().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getTargetCluster() != null) {
            _hashCode += getTargetCluster().hashCode();
        }
        if (getTargetQuerySet() != null) {
            _hashCode += getTargetQuerySet().hashCode();
        }
        if (getSuppressResults() != null) {
            _hashCode += getSuppressResults().hashCode();
        }
        if (getSuppressXmlSchema() != null) {
            _hashCode += getSuppressXmlSchema().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteSQLRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">ExecuteSQLRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SqlText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TargetCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetQuerySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TargetQuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SuppressResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressXmlSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SuppressXmlSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Wait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultWindowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultWindowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
