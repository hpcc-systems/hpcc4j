/**
 * WUQuerysetDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUQuerysetDetails  implements java.io.Serializable {
    private java.lang.String querySetName;

    private java.lang.String filter;

    private java.lang.String clusterName;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType filterType;

    private java.lang.Boolean checkAllNodes;

    public WUQuerysetDetails() {
    }

    public WUQuerysetDetails(
           java.lang.String querySetName,
           java.lang.String filter,
           java.lang.String clusterName,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType filterType,
           java.lang.Boolean checkAllNodes) {
           this.querySetName = querySetName;
           this.filter = filter;
           this.clusterName = clusterName;
           this.filterType = filterType;
           this.checkAllNodes = checkAllNodes;
    }


    /**
     * Gets the querySetName value for this WUQuerysetDetails.
     * 
     * @return querySetName
     */
    public java.lang.String getQuerySetName() {
        return querySetName;
    }


    /**
     * Sets the querySetName value for this WUQuerysetDetails.
     * 
     * @param querySetName
     */
    public void setQuerySetName(java.lang.String querySetName) {
        this.querySetName = querySetName;
    }


    /**
     * Gets the filter value for this WUQuerysetDetails.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this WUQuerysetDetails.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }


    /**
     * Gets the clusterName value for this WUQuerysetDetails.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this WUQuerysetDetails.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the filterType value for this WUQuerysetDetails.
     * 
     * @return filterType
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType getFilterType() {
        return filterType;
    }


    /**
     * Sets the filterType value for this WUQuerysetDetails.
     * 
     * @param filterType
     */
    public void setFilterType(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType filterType) {
        this.filterType = filterType;
    }


    /**
     * Gets the checkAllNodes value for this WUQuerysetDetails.
     * 
     * @return checkAllNodes
     */
    public java.lang.Boolean getCheckAllNodes() {
        return checkAllNodes;
    }


    /**
     * Sets the checkAllNodes value for this WUQuerysetDetails.
     * 
     * @param checkAllNodes
     */
    public void setCheckAllNodes(java.lang.Boolean checkAllNodes) {
        this.checkAllNodes = checkAllNodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerysetDetails)) return false;
        WUQuerysetDetails other = (WUQuerysetDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySetName==null && other.getQuerySetName()==null) || 
             (this.querySetName!=null &&
              this.querySetName.equals(other.getQuerySetName()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.filterType==null && other.getFilterType()==null) || 
             (this.filterType!=null &&
              this.filterType.equals(other.getFilterType()))) &&
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
        if (getQuerySetName() != null) {
            _hashCode += getQuerySetName().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getFilterType() != null) {
            _hashCode += getFilterType().hashCode();
        }
        if (getCheckAllNodes() != null) {
            _hashCode += getCheckAllNodes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUQuerysetDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySetName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FilterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetFilterType"));
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
