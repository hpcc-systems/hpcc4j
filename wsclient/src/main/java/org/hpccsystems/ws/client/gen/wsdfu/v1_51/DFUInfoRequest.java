/**
 * DFUInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUInfoRequest  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String cluster;

    private java.lang.Boolean updateDescription;

    private java.lang.String querySet;

    private java.lang.String query;

    private java.lang.String fileDesc;

    private java.lang.Boolean includeJsonTypeInfo;

    private java.lang.Boolean includeBinTypeInfo;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUChangeProtection protect;

    public DFUInfoRequest() {
    }

    public DFUInfoRequest(
           java.lang.String name,
           java.lang.String cluster,
           java.lang.Boolean updateDescription,
           java.lang.String querySet,
           java.lang.String query,
           java.lang.String fileDesc,
           java.lang.Boolean includeJsonTypeInfo,
           java.lang.Boolean includeBinTypeInfo,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUChangeProtection protect) {
           this.name = name;
           this.cluster = cluster;
           this.updateDescription = updateDescription;
           this.querySet = querySet;
           this.query = query;
           this.fileDesc = fileDesc;
           this.includeJsonTypeInfo = includeJsonTypeInfo;
           this.includeBinTypeInfo = includeBinTypeInfo;
           this.protect = protect;
    }


    /**
     * Gets the name value for this DFUInfoRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DFUInfoRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the cluster value for this DFUInfoRequest.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this DFUInfoRequest.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the updateDescription value for this DFUInfoRequest.
     * 
     * @return updateDescription
     */
    public java.lang.Boolean getUpdateDescription() {
        return updateDescription;
    }


    /**
     * Sets the updateDescription value for this DFUInfoRequest.
     * 
     * @param updateDescription
     */
    public void setUpdateDescription(java.lang.Boolean updateDescription) {
        this.updateDescription = updateDescription;
    }


    /**
     * Gets the querySet value for this DFUInfoRequest.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this DFUInfoRequest.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the query value for this DFUInfoRequest.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this DFUInfoRequest.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the fileDesc value for this DFUInfoRequest.
     * 
     * @return fileDesc
     */
    public java.lang.String getFileDesc() {
        return fileDesc;
    }


    /**
     * Sets the fileDesc value for this DFUInfoRequest.
     * 
     * @param fileDesc
     */
    public void setFileDesc(java.lang.String fileDesc) {
        this.fileDesc = fileDesc;
    }


    /**
     * Gets the includeJsonTypeInfo value for this DFUInfoRequest.
     * 
     * @return includeJsonTypeInfo
     */
    public java.lang.Boolean getIncludeJsonTypeInfo() {
        return includeJsonTypeInfo;
    }


    /**
     * Sets the includeJsonTypeInfo value for this DFUInfoRequest.
     * 
     * @param includeJsonTypeInfo
     */
    public void setIncludeJsonTypeInfo(java.lang.Boolean includeJsonTypeInfo) {
        this.includeJsonTypeInfo = includeJsonTypeInfo;
    }


    /**
     * Gets the includeBinTypeInfo value for this DFUInfoRequest.
     * 
     * @return includeBinTypeInfo
     */
    public java.lang.Boolean getIncludeBinTypeInfo() {
        return includeBinTypeInfo;
    }


    /**
     * Sets the includeBinTypeInfo value for this DFUInfoRequest.
     * 
     * @param includeBinTypeInfo
     */
    public void setIncludeBinTypeInfo(java.lang.Boolean includeBinTypeInfo) {
        this.includeBinTypeInfo = includeBinTypeInfo;
    }


    /**
     * Gets the protect value for this DFUInfoRequest.
     * 
     * @return protect
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUChangeProtection getProtect() {
        return protect;
    }


    /**
     * Sets the protect value for this DFUInfoRequest.
     * 
     * @param protect
     */
    public void setProtect(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUChangeProtection protect) {
        this.protect = protect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUInfoRequest)) return false;
        DFUInfoRequest other = (DFUInfoRequest) obj;
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
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.updateDescription==null && other.getUpdateDescription()==null) || 
             (this.updateDescription!=null &&
              this.updateDescription.equals(other.getUpdateDescription()))) &&
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.fileDesc==null && other.getFileDesc()==null) || 
             (this.fileDesc!=null &&
              this.fileDesc.equals(other.getFileDesc()))) &&
            ((this.includeJsonTypeInfo==null && other.getIncludeJsonTypeInfo()==null) || 
             (this.includeJsonTypeInfo!=null &&
              this.includeJsonTypeInfo.equals(other.getIncludeJsonTypeInfo()))) &&
            ((this.includeBinTypeInfo==null && other.getIncludeBinTypeInfo()==null) || 
             (this.includeBinTypeInfo!=null &&
              this.includeBinTypeInfo.equals(other.getIncludeBinTypeInfo()))) &&
            ((this.protect==null && other.getProtect()==null) || 
             (this.protect!=null &&
              this.protect.equals(other.getProtect())));
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
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getUpdateDescription() != null) {
            _hashCode += getUpdateDescription().hashCode();
        }
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getFileDesc() != null) {
            _hashCode += getFileDesc().hashCode();
        }
        if (getIncludeJsonTypeInfo() != null) {
            _hashCode += getIncludeJsonTypeInfo().hashCode();
        }
        if (getIncludeBinTypeInfo() != null) {
            _hashCode += getIncludeBinTypeInfo().hashCode();
        }
        if (getProtect() != null) {
            _hashCode += getProtect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "UpdateDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "QuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeJsonTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeJsonTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeBinTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeBinTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Protect"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUChangeProtection"));
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
