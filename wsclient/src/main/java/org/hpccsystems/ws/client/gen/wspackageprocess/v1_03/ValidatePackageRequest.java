/**
 * ValidatePackageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class ValidatePackageRequest  implements java.io.Serializable {
    private java.lang.String info;

    private java.lang.String target;

    private java.lang.String process;

    private java.lang.Boolean active;

    private java.lang.String PMID;

    private java.lang.String queryIdToVerify;

    private java.lang.String[] queriesToVerify;

    private java.lang.Boolean checkDFS;

    private java.lang.Boolean globalScope;

    public ValidatePackageRequest() {
    }

    public ValidatePackageRequest(
           java.lang.String info,
           java.lang.String target,
           java.lang.String process,
           java.lang.Boolean active,
           java.lang.String PMID,
           java.lang.String queryIdToVerify,
           java.lang.String[] queriesToVerify,
           java.lang.Boolean checkDFS,
           java.lang.Boolean globalScope) {
           this.info = info;
           this.target = target;
           this.process = process;
           this.active = active;
           this.PMID = PMID;
           this.queryIdToVerify = queryIdToVerify;
           this.queriesToVerify = queriesToVerify;
           this.checkDFS = checkDFS;
           this.globalScope = globalScope;
    }


    /**
     * Gets the info value for this ValidatePackageRequest.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this ValidatePackageRequest.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }


    /**
     * Gets the target value for this ValidatePackageRequest.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ValidatePackageRequest.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the process value for this ValidatePackageRequest.
     * 
     * @return process
     */
    public java.lang.String getProcess() {
        return process;
    }


    /**
     * Sets the process value for this ValidatePackageRequest.
     * 
     * @param process
     */
    public void setProcess(java.lang.String process) {
        this.process = process;
    }


    /**
     * Gets the active value for this ValidatePackageRequest.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this ValidatePackageRequest.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the PMID value for this ValidatePackageRequest.
     * 
     * @return PMID
     */
    public java.lang.String getPMID() {
        return PMID;
    }


    /**
     * Sets the PMID value for this ValidatePackageRequest.
     * 
     * @param PMID
     */
    public void setPMID(java.lang.String PMID) {
        this.PMID = PMID;
    }


    /**
     * Gets the queryIdToVerify value for this ValidatePackageRequest.
     * 
     * @return queryIdToVerify
     */
    public java.lang.String getQueryIdToVerify() {
        return queryIdToVerify;
    }


    /**
     * Sets the queryIdToVerify value for this ValidatePackageRequest.
     * 
     * @param queryIdToVerify
     */
    public void setQueryIdToVerify(java.lang.String queryIdToVerify) {
        this.queryIdToVerify = queryIdToVerify;
    }


    /**
     * Gets the queriesToVerify value for this ValidatePackageRequest.
     * 
     * @return queriesToVerify
     */
    public java.lang.String[] getQueriesToVerify() {
        return queriesToVerify;
    }


    /**
     * Sets the queriesToVerify value for this ValidatePackageRequest.
     * 
     * @param queriesToVerify
     */
    public void setQueriesToVerify(java.lang.String[] queriesToVerify) {
        this.queriesToVerify = queriesToVerify;
    }


    /**
     * Gets the checkDFS value for this ValidatePackageRequest.
     * 
     * @return checkDFS
     */
    public java.lang.Boolean getCheckDFS() {
        return checkDFS;
    }


    /**
     * Sets the checkDFS value for this ValidatePackageRequest.
     * 
     * @param checkDFS
     */
    public void setCheckDFS(java.lang.Boolean checkDFS) {
        this.checkDFS = checkDFS;
    }


    /**
     * Gets the globalScope value for this ValidatePackageRequest.
     * 
     * @return globalScope
     */
    public java.lang.Boolean getGlobalScope() {
        return globalScope;
    }


    /**
     * Sets the globalScope value for this ValidatePackageRequest.
     * 
     * @param globalScope
     */
    public void setGlobalScope(java.lang.Boolean globalScope) {
        this.globalScope = globalScope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatePackageRequest)) return false;
        ValidatePackageRequest other = (ValidatePackageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.PMID==null && other.getPMID()==null) || 
             (this.PMID!=null &&
              this.PMID.equals(other.getPMID()))) &&
            ((this.queryIdToVerify==null && other.getQueryIdToVerify()==null) || 
             (this.queryIdToVerify!=null &&
              this.queryIdToVerify.equals(other.getQueryIdToVerify()))) &&
            ((this.queriesToVerify==null && other.getQueriesToVerify()==null) || 
             (this.queriesToVerify!=null &&
              java.util.Arrays.equals(this.queriesToVerify, other.getQueriesToVerify()))) &&
            ((this.checkDFS==null && other.getCheckDFS()==null) || 
             (this.checkDFS!=null &&
              this.checkDFS.equals(other.getCheckDFS()))) &&
            ((this.globalScope==null && other.getGlobalScope()==null) || 
             (this.globalScope!=null &&
              this.globalScope.equals(other.getGlobalScope())));
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
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getPMID() != null) {
            _hashCode += getPMID().hashCode();
        }
        if (getQueryIdToVerify() != null) {
            _hashCode += getQueryIdToVerify().hashCode();
        }
        if (getQueriesToVerify() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueriesToVerify());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueriesToVerify(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCheckDFS() != null) {
            _hashCode += getCheckDFS().hashCode();
        }
        if (getGlobalScope() != null) {
            _hashCode += getGlobalScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatePackageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">ValidatePackageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Process"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("queryIdToVerify");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "QueryIdToVerify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queriesToVerify");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "QueriesToVerify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkDFS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "CheckDFS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "GlobalScope"));
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
