/**
 * WUQuerysetImportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUQuerysetImportResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions;

    private java.lang.String target;

    private java.lang.Boolean clearedExisting;

    private java.lang.Boolean success;

    private java.lang.String[] importedQueries;

    private java.lang.String[] existingQueries;

    private java.lang.String[] missingWuids;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] fileErrors;

    public WUQuerysetImportResponse() {
    }

    public WUQuerysetImportResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions,
           java.lang.String target,
           java.lang.Boolean clearedExisting,
           java.lang.Boolean success,
           java.lang.String[] importedQueries,
           java.lang.String[] existingQueries,
           java.lang.String[] missingWuids,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] fileErrors) {
           this.exceptions = exceptions;
           this.target = target;
           this.clearedExisting = clearedExisting;
           this.success = success;
           this.importedQueries = importedQueries;
           this.existingQueries = existingQueries;
           this.missingWuids = missingWuids;
           this.fileErrors = fileErrors;
    }


    /**
     * Gets the exceptions value for this WUQuerysetImportResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUQuerysetImportResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the target value for this WUQuerysetImportResponse.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this WUQuerysetImportResponse.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the clearedExisting value for this WUQuerysetImportResponse.
     * 
     * @return clearedExisting
     */
    public java.lang.Boolean getClearedExisting() {
        return clearedExisting;
    }


    /**
     * Sets the clearedExisting value for this WUQuerysetImportResponse.
     * 
     * @param clearedExisting
     */
    public void setClearedExisting(java.lang.Boolean clearedExisting) {
        this.clearedExisting = clearedExisting;
    }


    /**
     * Gets the success value for this WUQuerysetImportResponse.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this WUQuerysetImportResponse.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the importedQueries value for this WUQuerysetImportResponse.
     * 
     * @return importedQueries
     */
    public java.lang.String[] getImportedQueries() {
        return importedQueries;
    }


    /**
     * Sets the importedQueries value for this WUQuerysetImportResponse.
     * 
     * @param importedQueries
     */
    public void setImportedQueries(java.lang.String[] importedQueries) {
        this.importedQueries = importedQueries;
    }


    /**
     * Gets the existingQueries value for this WUQuerysetImportResponse.
     * 
     * @return existingQueries
     */
    public java.lang.String[] getExistingQueries() {
        return existingQueries;
    }


    /**
     * Sets the existingQueries value for this WUQuerysetImportResponse.
     * 
     * @param existingQueries
     */
    public void setExistingQueries(java.lang.String[] existingQueries) {
        this.existingQueries = existingQueries;
    }


    /**
     * Gets the missingWuids value for this WUQuerysetImportResponse.
     * 
     * @return missingWuids
     */
    public java.lang.String[] getMissingWuids() {
        return missingWuids;
    }


    /**
     * Sets the missingWuids value for this WUQuerysetImportResponse.
     * 
     * @param missingWuids
     */
    public void setMissingWuids(java.lang.String[] missingWuids) {
        this.missingWuids = missingWuids;
    }


    /**
     * Gets the fileErrors value for this WUQuerysetImportResponse.
     * 
     * @return fileErrors
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] getFileErrors() {
        return fileErrors;
    }


    /**
     * Sets the fileErrors value for this WUQuerysetImportResponse.
     * 
     * @param fileErrors
     */
    public void setFileErrors(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.LogicalFileError[] fileErrors) {
        this.fileErrors = fileErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerysetImportResponse)) return false;
        WUQuerysetImportResponse other = (WUQuerysetImportResponse) obj;
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
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.clearedExisting==null && other.getClearedExisting()==null) || 
             (this.clearedExisting!=null &&
              this.clearedExisting.equals(other.getClearedExisting()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.importedQueries==null && other.getImportedQueries()==null) || 
             (this.importedQueries!=null &&
              java.util.Arrays.equals(this.importedQueries, other.getImportedQueries()))) &&
            ((this.existingQueries==null && other.getExistingQueries()==null) || 
             (this.existingQueries!=null &&
              java.util.Arrays.equals(this.existingQueries, other.getExistingQueries()))) &&
            ((this.missingWuids==null && other.getMissingWuids()==null) || 
             (this.missingWuids!=null &&
              java.util.Arrays.equals(this.missingWuids, other.getMissingWuids()))) &&
            ((this.fileErrors==null && other.getFileErrors()==null) || 
             (this.fileErrors!=null &&
              java.util.Arrays.equals(this.fileErrors, other.getFileErrors())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getClearedExisting() != null) {
            _hashCode += getClearedExisting().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getImportedQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportedQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportedQueries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExistingQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExistingQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExistingQueries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMissingWuids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingWuids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingWuids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileErrors(), i);
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
        new org.apache.axis.description.TypeDesc(WUQuerysetImportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetImportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearedExisting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClearedExisting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importedQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ImportedQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ExistingQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingWuids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MissingWuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "File"));
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
