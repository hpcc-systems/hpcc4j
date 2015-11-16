/**
 * WUQueryDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUQueryDetails  implements java.io.Serializable {
    private java.lang.String queryId;

    private java.lang.String querySet;

    private java.lang.Boolean includeStateOnClusters;

    private java.lang.Boolean includeSuperFiles;

    private java.lang.Boolean includeWsEclAddresses;

    private java.lang.Boolean checkAllNodes;

    public WUQueryDetails() {
    }

    public WUQueryDetails(
           java.lang.String queryId,
           java.lang.String querySet,
           java.lang.Boolean includeStateOnClusters,
           java.lang.Boolean includeSuperFiles,
           java.lang.Boolean includeWsEclAddresses,
           java.lang.Boolean checkAllNodes) {
           this.queryId = queryId;
           this.querySet = querySet;
           this.includeStateOnClusters = includeStateOnClusters;
           this.includeSuperFiles = includeSuperFiles;
           this.includeWsEclAddresses = includeWsEclAddresses;
           this.checkAllNodes = checkAllNodes;
    }


    /**
     * Gets the queryId value for this WUQueryDetails.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this WUQueryDetails.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the querySet value for this WUQueryDetails.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this WUQueryDetails.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the includeStateOnClusters value for this WUQueryDetails.
     * 
     * @return includeStateOnClusters
     */
    public java.lang.Boolean getIncludeStateOnClusters() {
        return includeStateOnClusters;
    }


    /**
     * Sets the includeStateOnClusters value for this WUQueryDetails.
     * 
     * @param includeStateOnClusters
     */
    public void setIncludeStateOnClusters(java.lang.Boolean includeStateOnClusters) {
        this.includeStateOnClusters = includeStateOnClusters;
    }


    /**
     * Gets the includeSuperFiles value for this WUQueryDetails.
     * 
     * @return includeSuperFiles
     */
    public java.lang.Boolean getIncludeSuperFiles() {
        return includeSuperFiles;
    }


    /**
     * Sets the includeSuperFiles value for this WUQueryDetails.
     * 
     * @param includeSuperFiles
     */
    public void setIncludeSuperFiles(java.lang.Boolean includeSuperFiles) {
        this.includeSuperFiles = includeSuperFiles;
    }


    /**
     * Gets the includeWsEclAddresses value for this WUQueryDetails.
     * 
     * @return includeWsEclAddresses
     */
    public java.lang.Boolean getIncludeWsEclAddresses() {
        return includeWsEclAddresses;
    }


    /**
     * Sets the includeWsEclAddresses value for this WUQueryDetails.
     * 
     * @param includeWsEclAddresses
     */
    public void setIncludeWsEclAddresses(java.lang.Boolean includeWsEclAddresses) {
        this.includeWsEclAddresses = includeWsEclAddresses;
    }


    /**
     * Gets the checkAllNodes value for this WUQueryDetails.
     * 
     * @return checkAllNodes
     */
    public java.lang.Boolean getCheckAllNodes() {
        return checkAllNodes;
    }


    /**
     * Sets the checkAllNodes value for this WUQueryDetails.
     * 
     * @param checkAllNodes
     */
    public void setCheckAllNodes(java.lang.Boolean checkAllNodes) {
        this.checkAllNodes = checkAllNodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQueryDetails)) return false;
        WUQueryDetails other = (WUQueryDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.includeStateOnClusters==null && other.getIncludeStateOnClusters()==null) || 
             (this.includeStateOnClusters!=null &&
              this.includeStateOnClusters.equals(other.getIncludeStateOnClusters()))) &&
            ((this.includeSuperFiles==null && other.getIncludeSuperFiles()==null) || 
             (this.includeSuperFiles!=null &&
              this.includeSuperFiles.equals(other.getIncludeSuperFiles()))) &&
            ((this.includeWsEclAddresses==null && other.getIncludeWsEclAddresses()==null) || 
             (this.includeWsEclAddresses!=null &&
              this.includeWsEclAddresses.equals(other.getIncludeWsEclAddresses()))) &&
            ((this.checkAllNodes==null && other.getCheckAllNodes()==null) || 
             (this.checkAllNodes!=null &&
              this.checkAllNodes.equals(other.getCheckAllNodes())));
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
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
        }
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getIncludeStateOnClusters() != null) {
            _hashCode += getIncludeStateOnClusters().hashCode();
        }
        if (getIncludeSuperFiles() != null) {
            _hashCode += getIncludeSuperFiles().hashCode();
        }
        if (getIncludeWsEclAddresses() != null) {
            _hashCode += getIncludeWsEclAddresses().hashCode();
        }
        if (getCheckAllNodes() != null) {
            _hashCode += getCheckAllNodes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUQueryDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
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
        elemField.setFieldName("includeStateOnClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeStateOnClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSuperFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeSuperFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeWsEclAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeWsEclAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkAllNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CheckAllNodes"));
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
