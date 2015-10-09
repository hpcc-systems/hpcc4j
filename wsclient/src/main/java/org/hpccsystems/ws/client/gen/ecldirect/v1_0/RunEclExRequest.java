/**
 * RunEclExRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.ecldirect.v1_0;

public class RunEclExRequest  implements java.io.Serializable {
    private java.lang.String eclText;

    private java.lang.String userName;

    private java.lang.String cluster;

    private java.lang.String snapshot;

    private java.lang.Boolean includeResults;

    private java.lang.Boolean includeGraphs;

    private org.hpccsystems.ws.client.gen.ecldirect.v1_0.RunEclExFormat format;

    private java.lang.Integer wait;

    private java.lang.Integer resultLimit;

    public RunEclExRequest() {
    }

    public RunEclExRequest(
           java.lang.String eclText,
           java.lang.String userName,
           java.lang.String cluster,
           java.lang.String snapshot,
           java.lang.Boolean includeResults,
           java.lang.Boolean includeGraphs,
           org.hpccsystems.ws.client.gen.ecldirect.v1_0.RunEclExFormat format,
           java.lang.Integer wait,
           java.lang.Integer resultLimit) {
           this.eclText = eclText;
           this.userName = userName;
           this.cluster = cluster;
           this.snapshot = snapshot;
           this.includeResults = includeResults;
           this.includeGraphs = includeGraphs;
           this.format = format;
           this.wait = wait;
           this.resultLimit = resultLimit;
    }


    /**
     * Gets the eclText value for this RunEclExRequest.
     * 
     * @return eclText
     */
    public java.lang.String getEclText() {
        return eclText;
    }


    /**
     * Sets the eclText value for this RunEclExRequest.
     * 
     * @param eclText
     */
    public void setEclText(java.lang.String eclText) {
        this.eclText = eclText;
    }


    /**
     * Gets the userName value for this RunEclExRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this RunEclExRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the cluster value for this RunEclExRequest.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this RunEclExRequest.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the snapshot value for this RunEclExRequest.
     * 
     * @return snapshot
     */
    public java.lang.String getSnapshot() {
        return snapshot;
    }


    /**
     * Sets the snapshot value for this RunEclExRequest.
     * 
     * @param snapshot
     */
    public void setSnapshot(java.lang.String snapshot) {
        this.snapshot = snapshot;
    }


    /**
     * Gets the includeResults value for this RunEclExRequest.
     * 
     * @return includeResults
     */
    public java.lang.Boolean getIncludeResults() {
        return includeResults;
    }


    /**
     * Sets the includeResults value for this RunEclExRequest.
     * 
     * @param includeResults
     */
    public void setIncludeResults(java.lang.Boolean includeResults) {
        this.includeResults = includeResults;
    }


    /**
     * Gets the includeGraphs value for this RunEclExRequest.
     * 
     * @return includeGraphs
     */
    public java.lang.Boolean getIncludeGraphs() {
        return includeGraphs;
    }


    /**
     * Sets the includeGraphs value for this RunEclExRequest.
     * 
     * @param includeGraphs
     */
    public void setIncludeGraphs(java.lang.Boolean includeGraphs) {
        this.includeGraphs = includeGraphs;
    }


    /**
     * Gets the format value for this RunEclExRequest.
     * 
     * @return format
     */
    public org.hpccsystems.ws.client.gen.ecldirect.v1_0.RunEclExFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this RunEclExRequest.
     * 
     * @param format
     */
    public void setFormat(org.hpccsystems.ws.client.gen.ecldirect.v1_0.RunEclExFormat format) {
        this.format = format;
    }


    /**
     * Gets the wait value for this RunEclExRequest.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this RunEclExRequest.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }


    /**
     * Gets the resultLimit value for this RunEclExRequest.
     * 
     * @return resultLimit
     */
    public java.lang.Integer getResultLimit() {
        return resultLimit;
    }


    /**
     * Sets the resultLimit value for this RunEclExRequest.
     * 
     * @param resultLimit
     */
    public void setResultLimit(java.lang.Integer resultLimit) {
        this.resultLimit = resultLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RunEclExRequest)) return false;
        RunEclExRequest other = (RunEclExRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eclText==null && other.getEclText()==null) || 
             (this.eclText!=null &&
              this.eclText.equals(other.getEclText()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.snapshot==null && other.getSnapshot()==null) || 
             (this.snapshot!=null &&
              this.snapshot.equals(other.getSnapshot()))) &&
            ((this.includeResults==null && other.getIncludeResults()==null) || 
             (this.includeResults!=null &&
              this.includeResults.equals(other.getIncludeResults()))) &&
            ((this.includeGraphs==null && other.getIncludeGraphs()==null) || 
             (this.includeGraphs!=null &&
              this.includeGraphs.equals(other.getIncludeGraphs()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait()))) &&
            ((this.resultLimit==null && other.getResultLimit()==null) || 
             (this.resultLimit!=null &&
              this.resultLimit.equals(other.getResultLimit())));
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
        if (getEclText() != null) {
            _hashCode += getEclText().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getSnapshot() != null) {
            _hashCode += getSnapshot().hashCode();
        }
        if (getIncludeResults() != null) {
            _hashCode += getIncludeResults().hashCode();
        }
        if (getIncludeGraphs() != null) {
            _hashCode += getIncludeGraphs().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        if (getResultLimit() != null) {
            _hashCode += getResultLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RunEclExRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", ">RunEclExRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eclText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "eclText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "snapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "includeResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeGraphs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "includeGraphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "RunEclExFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "wait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "resultLimit"));
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
