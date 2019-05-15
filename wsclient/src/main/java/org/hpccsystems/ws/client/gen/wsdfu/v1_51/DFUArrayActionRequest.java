/**
 * DFUArrayActionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUArrayActionRequest  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActions type;

    private java.lang.Boolean noDelete;

    private java.lang.String backToPage;

    private java.lang.String[] logicalFiles;

    private java.lang.Boolean removeFromSuperfiles;

    private java.lang.Boolean removeRecursively;

    public DFUArrayActionRequest() {
    }

    public DFUArrayActionRequest(
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActions type,
           java.lang.Boolean noDelete,
           java.lang.String backToPage,
           java.lang.String[] logicalFiles,
           java.lang.Boolean removeFromSuperfiles,
           java.lang.Boolean removeRecursively) {
           this.type = type;
           this.noDelete = noDelete;
           this.backToPage = backToPage;
           this.logicalFiles = logicalFiles;
           this.removeFromSuperfiles = removeFromSuperfiles;
           this.removeRecursively = removeRecursively;
    }


    /**
     * Gets the type value for this DFUArrayActionRequest.
     * 
     * @return type
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActions getType() {
        return type;
    }


    /**
     * Sets the type value for this DFUArrayActionRequest.
     * 
     * @param type
     */
    public void setType(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActions type) {
        this.type = type;
    }


    /**
     * Gets the noDelete value for this DFUArrayActionRequest.
     * 
     * @return noDelete
     */
    public java.lang.Boolean getNoDelete() {
        return noDelete;
    }


    /**
     * Sets the noDelete value for this DFUArrayActionRequest.
     * 
     * @param noDelete
     */
    public void setNoDelete(java.lang.Boolean noDelete) {
        this.noDelete = noDelete;
    }


    /**
     * Gets the backToPage value for this DFUArrayActionRequest.
     * 
     * @return backToPage
     */
    public java.lang.String getBackToPage() {
        return backToPage;
    }


    /**
     * Sets the backToPage value for this DFUArrayActionRequest.
     * 
     * @param backToPage
     */
    public void setBackToPage(java.lang.String backToPage) {
        this.backToPage = backToPage;
    }


    /**
     * Gets the logicalFiles value for this DFUArrayActionRequest.
     * 
     * @return logicalFiles
     */
    public java.lang.String[] getLogicalFiles() {
        return logicalFiles;
    }


    /**
     * Sets the logicalFiles value for this DFUArrayActionRequest.
     * 
     * @param logicalFiles
     */
    public void setLogicalFiles(java.lang.String[] logicalFiles) {
        this.logicalFiles = logicalFiles;
    }


    /**
     * Gets the removeFromSuperfiles value for this DFUArrayActionRequest.
     * 
     * @return removeFromSuperfiles
     */
    public java.lang.Boolean getRemoveFromSuperfiles() {
        return removeFromSuperfiles;
    }


    /**
     * Sets the removeFromSuperfiles value for this DFUArrayActionRequest.
     * 
     * @param removeFromSuperfiles
     */
    public void setRemoveFromSuperfiles(java.lang.Boolean removeFromSuperfiles) {
        this.removeFromSuperfiles = removeFromSuperfiles;
    }


    /**
     * Gets the removeRecursively value for this DFUArrayActionRequest.
     * 
     * @return removeRecursively
     */
    public java.lang.Boolean getRemoveRecursively() {
        return removeRecursively;
    }


    /**
     * Sets the removeRecursively value for this DFUArrayActionRequest.
     * 
     * @param removeRecursively
     */
    public void setRemoveRecursively(java.lang.Boolean removeRecursively) {
        this.removeRecursively = removeRecursively;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUArrayActionRequest)) return false;
        DFUArrayActionRequest other = (DFUArrayActionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.noDelete==null && other.getNoDelete()==null) || 
             (this.noDelete!=null &&
              this.noDelete.equals(other.getNoDelete()))) &&
            ((this.backToPage==null && other.getBackToPage()==null) || 
             (this.backToPage!=null &&
              this.backToPage.equals(other.getBackToPage()))) &&
            ((this.logicalFiles==null && other.getLogicalFiles()==null) || 
             (this.logicalFiles!=null &&
              java.util.Arrays.equals(this.logicalFiles, other.getLogicalFiles()))) &&
            ((this.removeFromSuperfiles==null && other.getRemoveFromSuperfiles()==null) || 
             (this.removeFromSuperfiles!=null &&
              this.removeFromSuperfiles.equals(other.getRemoveFromSuperfiles()))) &&
            ((this.removeRecursively==null && other.getRemoveRecursively()==null) || 
             (this.removeRecursively!=null &&
              this.removeRecursively.equals(other.getRemoveRecursively())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getNoDelete() != null) {
            _hashCode += getNoDelete().hashCode();
        }
        if (getBackToPage() != null) {
            _hashCode += getBackToPage().hashCode();
        }
        if (getLogicalFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogicalFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogicalFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemoveFromSuperfiles() != null) {
            _hashCode += getRemoveFromSuperfiles().hashCode();
        }
        if (getRemoveRecursively() != null) {
            _hashCode += getRemoveRecursively().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUArrayActionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUArrayActionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUArrayActions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NoDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backToPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BackToPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeFromSuperfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "removeFromSuperfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeRecursively");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "removeRecursively"));
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
