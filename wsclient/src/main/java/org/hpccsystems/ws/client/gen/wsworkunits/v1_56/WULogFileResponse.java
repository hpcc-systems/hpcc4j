/**
 * WULogFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WULogFileResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.String wuid;

    private java.lang.String querySet;

    private java.lang.String queryName;

    private java.lang.String queryId;

    private java.lang.String fileName;

    private java.lang.String daliServer;

    private byte[] thefile;

    public WULogFileResponse() {
    }

    public WULogFileResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.String wuid,
           java.lang.String querySet,
           java.lang.String queryName,
           java.lang.String queryId,
           java.lang.String fileName,
           java.lang.String daliServer,
           byte[] thefile) {
           this.exceptions = exceptions;
           this.wuid = wuid;
           this.querySet = querySet;
           this.queryName = queryName;
           this.queryId = queryId;
           this.fileName = fileName;
           this.daliServer = daliServer;
           this.thefile = thefile;
    }


    /**
     * Gets the exceptions value for this WULogFileResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WULogFileResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the wuid value for this WULogFileResponse.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WULogFileResponse.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the querySet value for this WULogFileResponse.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this WULogFileResponse.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the queryName value for this WULogFileResponse.
     * 
     * @return queryName
     */
    public java.lang.String getQueryName() {
        return queryName;
    }


    /**
     * Sets the queryName value for this WULogFileResponse.
     * 
     * @param queryName
     */
    public void setQueryName(java.lang.String queryName) {
        this.queryName = queryName;
    }


    /**
     * Gets the queryId value for this WULogFileResponse.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this WULogFileResponse.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the fileName value for this WULogFileResponse.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this WULogFileResponse.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the daliServer value for this WULogFileResponse.
     * 
     * @return daliServer
     */
    public java.lang.String getDaliServer() {
        return daliServer;
    }


    /**
     * Sets the daliServer value for this WULogFileResponse.
     * 
     * @param daliServer
     */
    public void setDaliServer(java.lang.String daliServer) {
        this.daliServer = daliServer;
    }


    /**
     * Gets the thefile value for this WULogFileResponse.
     * 
     * @return thefile
     */
    public byte[] getThefile() {
        return thefile;
    }


    /**
     * Sets the thefile value for this WULogFileResponse.
     * 
     * @param thefile
     */
    public void setThefile(byte[] thefile) {
        this.thefile = thefile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WULogFileResponse)) return false;
        WULogFileResponse other = (WULogFileResponse) obj;
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
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.daliServer==null && other.getDaliServer()==null) || 
             (this.daliServer!=null &&
              this.daliServer.equals(other.getDaliServer()))) &&
            ((this.thefile==null && other.getThefile()==null) || 
             (this.thefile!=null &&
              java.util.Arrays.equals(this.thefile, other.getThefile())));
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getDaliServer() != null) {
            _hashCode += getDaliServer().hashCode();
        }
        if (getThefile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThefile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThefile(), i);
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
        new org.apache.axis.description.TypeDesc(WULogFileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULogFileResponse"));
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
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daliServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DaliServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thefile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "thefile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
