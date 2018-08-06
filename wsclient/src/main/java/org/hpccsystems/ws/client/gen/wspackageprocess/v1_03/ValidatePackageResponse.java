/**
 * ValidatePackageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class ValidatePackageResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions;

    private java.lang.String PMID;

    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus status;

    private java.lang.String[] warnings;

    private java.lang.String[] errors;

    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageInfo packages;

    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageQueries queries;

    private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageFiles files;

    public ValidatePackageResponse() {
    }

    public ValidatePackageResponse(
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions,
           java.lang.String PMID,
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus status,
           java.lang.String[] warnings,
           java.lang.String[] errors,
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageInfo packages,
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageQueries queries,
           org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageFiles files) {
           this.exceptions = exceptions;
           this.PMID = PMID;
           this.status = status;
           this.warnings = warnings;
           this.errors = errors;
           this.packages = packages;
           this.queries = queries;
           this.files = files;
    }


    /**
     * Gets the exceptions value for this ValidatePackageResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ValidatePackageResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the PMID value for this ValidatePackageResponse.
     * 
     * @return PMID
     */
    public java.lang.String getPMID() {
        return PMID;
    }


    /**
     * Sets the PMID value for this ValidatePackageResponse.
     * 
     * @param PMID
     */
    public void setPMID(java.lang.String PMID) {
        this.PMID = PMID;
    }


    /**
     * Gets the status value for this ValidatePackageResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ValidatePackageResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus status) {
        this.status = status;
    }


    /**
     * Gets the warnings value for this ValidatePackageResponse.
     * 
     * @return warnings
     */
    public java.lang.String[] getWarnings() {
        return warnings;
    }


    /**
     * Sets the warnings value for this ValidatePackageResponse.
     * 
     * @param warnings
     */
    public void setWarnings(java.lang.String[] warnings) {
        this.warnings = warnings;
    }


    /**
     * Gets the errors value for this ValidatePackageResponse.
     * 
     * @return errors
     */
    public java.lang.String[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this ValidatePackageResponse.
     * 
     * @param errors
     */
    public void setErrors(java.lang.String[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the packages value for this ValidatePackageResponse.
     * 
     * @return packages
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageInfo getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this ValidatePackageResponse.
     * 
     * @param packages
     */
    public void setPackages(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageInfo packages) {
        this.packages = packages;
    }


    /**
     * Gets the queries value for this ValidatePackageResponse.
     * 
     * @return queries
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageQueries getQueries() {
        return queries;
    }


    /**
     * Sets the queries value for this ValidatePackageResponse.
     * 
     * @param queries
     */
    public void setQueries(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageQueries queries) {
        this.queries = queries;
    }


    /**
     * Gets the files value for this ValidatePackageResponse.
     * 
     * @return files
     */
    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageFiles getFiles() {
        return files;
    }


    /**
     * Sets the files value for this ValidatePackageResponse.
     * 
     * @param files
     */
    public void setFiles(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageFiles files) {
        this.files = files;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatePackageResponse)) return false;
        ValidatePackageResponse other = (ValidatePackageResponse) obj;
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
            ((this.PMID==null && other.getPMID()==null) || 
             (this.PMID!=null &&
              this.PMID.equals(other.getPMID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.warnings==null && other.getWarnings()==null) || 
             (this.warnings!=null &&
              java.util.Arrays.equals(this.warnings, other.getWarnings()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              this.packages.equals(other.getPackages()))) &&
            ((this.queries==null && other.getQueries()==null) || 
             (this.queries!=null &&
              this.queries.equals(other.getQueries()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              this.files.equals(other.getFiles())));
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
        if (getPMID() != null) {
            _hashCode += getPMID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getWarnings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarnings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarnings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackages() != null) {
            _hashCode += getPackages().hashCode();
        }
        if (getQueries() != null) {
            _hashCode += getQueries().hashCode();
        }
        if (getFiles() != null) {
            _hashCode += getFiles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatePackageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">ValidatePackageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "BasePackageStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Warnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ValidatePackageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "queries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ValidatePackageQueries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ValidatePackageFiles"));
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
