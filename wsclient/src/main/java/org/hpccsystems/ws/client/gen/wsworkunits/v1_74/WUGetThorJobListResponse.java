/**
 * WUGetThorJobListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUGetThorJobListResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] jobList;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] inProgressJobList;

    private java.lang.String warning;

    public WUGetThorJobListResponse() {
    }

    public WUGetThorJobListResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] jobList,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] inProgressJobList,
           java.lang.String warning) {
           this.exceptions = exceptions;
           this.jobList = jobList;
           this.inProgressJobList = inProgressJobList;
           this.warning = warning;
    }


    /**
     * Gets the exceptions value for this WUGetThorJobListResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUGetThorJobListResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the jobList value for this WUGetThorJobListResponse.
     * 
     * @return jobList
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] getJobList() {
        return jobList;
    }


    /**
     * Sets the jobList value for this WUGetThorJobListResponse.
     * 
     * @param jobList
     */
    public void setJobList(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] jobList) {
        this.jobList = jobList;
    }


    /**
     * Gets the inProgressJobList value for this WUGetThorJobListResponse.
     * 
     * @return inProgressJobList
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] getInProgressJobList() {
        return inProgressJobList;
    }


    /**
     * Sets the inProgressJobList value for this WUGetThorJobListResponse.
     * 
     * @param inProgressJobList
     */
    public void setInProgressJobList(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLJob[] inProgressJobList) {
        this.inProgressJobList = inProgressJobList;
    }


    /**
     * Gets the warning value for this WUGetThorJobListResponse.
     * 
     * @return warning
     */
    public java.lang.String getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this WUGetThorJobListResponse.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String warning) {
        this.warning = warning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUGetThorJobListResponse)) return false;
        WUGetThorJobListResponse other = (WUGetThorJobListResponse) obj;
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
            ((this.jobList==null && other.getJobList()==null) || 
             (this.jobList!=null &&
              java.util.Arrays.equals(this.jobList, other.getJobList()))) &&
            ((this.inProgressJobList==null && other.getInProgressJobList()==null) || 
             (this.inProgressJobList!=null &&
              java.util.Arrays.equals(this.inProgressJobList, other.getInProgressJobList()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning())));
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
        if (getJobList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInProgressJobList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInProgressJobList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInProgressJobList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUGetThorJobListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetThorJobListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inProgressJobList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "InProgressJobList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
