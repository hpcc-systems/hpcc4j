/**
 * WUDownloadFiles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_71;

public class WUDownloadFiles  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String querySet;

    private java.lang.String query;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileDownloadOption downloadOption;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileOption[] WUFileOptions;

    public WUDownloadFiles() {
    }

    public WUDownloadFiles(
           java.lang.String wuid,
           java.lang.String querySet,
           java.lang.String query,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileDownloadOption downloadOption,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileOption[] WUFileOptions) {
           this.wuid = wuid;
           this.querySet = querySet;
           this.query = query;
           this.downloadOption = downloadOption;
           this.WUFileOptions = WUFileOptions;
    }


    /**
     * Gets the wuid value for this WUDownloadFiles.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUDownloadFiles.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the querySet value for this WUDownloadFiles.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this WUDownloadFiles.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the query value for this WUDownloadFiles.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this WUDownloadFiles.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the downloadOption value for this WUDownloadFiles.
     * 
     * @return downloadOption
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileDownloadOption getDownloadOption() {
        return downloadOption;
    }


    /**
     * Sets the downloadOption value for this WUDownloadFiles.
     * 
     * @param downloadOption
     */
    public void setDownloadOption(org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileDownloadOption downloadOption) {
        this.downloadOption = downloadOption;
    }


    /**
     * Gets the WUFileOptions value for this WUDownloadFiles.
     * 
     * @return WUFileOptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileOption[] getWUFileOptions() {
        return WUFileOptions;
    }


    /**
     * Sets the WUFileOptions value for this WUDownloadFiles.
     * 
     * @param WUFileOptions
     */
    public void setWUFileOptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_71.WUFileOption[] WUFileOptions) {
        this.WUFileOptions = WUFileOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUDownloadFiles)) return false;
        WUDownloadFiles other = (WUDownloadFiles) obj;
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
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.downloadOption==null && other.getDownloadOption()==null) || 
             (this.downloadOption!=null &&
              this.downloadOption.equals(other.getDownloadOption()))) &&
            ((this.WUFileOptions==null && other.getWUFileOptions()==null) || 
             (this.WUFileOptions!=null &&
              java.util.Arrays.equals(this.WUFileOptions, other.getWUFileOptions())));
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
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getDownloadOption() != null) {
            _hashCode += getDownloadOption().hashCode();
        }
        if (getWUFileOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWUFileOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWUFileOptions(), i);
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
        new org.apache.axis.description.TypeDesc(WUDownloadFiles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDownloadFiles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloadOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DownloadOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFileDownloadOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WUFileOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFileOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFileOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFileOption"));
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
