/**
 * PhysicalFileStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_13;

public class PhysicalFileStruct  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean isDir;

    private java.lang.Long filesize;

    private java.lang.String modifiedtime;

    private java.lang.String path;

    private org.hpccsystems.ws.client.gen.filespray.v1_13.PhysicalFileStruct[] files;

    public PhysicalFileStruct() {
    }

    public PhysicalFileStruct(
           java.lang.String name,
           java.lang.Boolean isDir,
           java.lang.Long filesize,
           java.lang.String modifiedtime,
           java.lang.String path,
           org.hpccsystems.ws.client.gen.filespray.v1_13.PhysicalFileStruct[] files) {
           this.name = name;
           this.isDir = isDir;
           this.filesize = filesize;
           this.modifiedtime = modifiedtime;
           this.path = path;
           this.files = files;
    }


    /**
     * Gets the name value for this PhysicalFileStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PhysicalFileStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isDir value for this PhysicalFileStruct.
     * 
     * @return isDir
     */
    public java.lang.Boolean getIsDir() {
        return isDir;
    }


    /**
     * Sets the isDir value for this PhysicalFileStruct.
     * 
     * @param isDir
     */
    public void setIsDir(java.lang.Boolean isDir) {
        this.isDir = isDir;
    }


    /**
     * Gets the filesize value for this PhysicalFileStruct.
     * 
     * @return filesize
     */
    public java.lang.Long getFilesize() {
        return filesize;
    }


    /**
     * Sets the filesize value for this PhysicalFileStruct.
     * 
     * @param filesize
     */
    public void setFilesize(java.lang.Long filesize) {
        this.filesize = filesize;
    }


    /**
     * Gets the modifiedtime value for this PhysicalFileStruct.
     * 
     * @return modifiedtime
     */
    public java.lang.String getModifiedtime() {
        return modifiedtime;
    }


    /**
     * Sets the modifiedtime value for this PhysicalFileStruct.
     * 
     * @param modifiedtime
     */
    public void setModifiedtime(java.lang.String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }


    /**
     * Gets the path value for this PhysicalFileStruct.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this PhysicalFileStruct.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the files value for this PhysicalFileStruct.
     * 
     * @return files
     */
    public org.hpccsystems.ws.client.gen.filespray.v1_13.PhysicalFileStruct[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this PhysicalFileStruct.
     * 
     * @param files
     */
    public void setFiles(org.hpccsystems.ws.client.gen.filespray.v1_13.PhysicalFileStruct[] files) {
        this.files = files;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhysicalFileStruct)) return false;
        PhysicalFileStruct other = (PhysicalFileStruct) obj;
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
            ((this.isDir==null && other.getIsDir()==null) || 
             (this.isDir!=null &&
              this.isDir.equals(other.getIsDir()))) &&
            ((this.filesize==null && other.getFilesize()==null) || 
             (this.filesize!=null &&
              this.filesize.equals(other.getFilesize()))) &&
            ((this.modifiedtime==null && other.getModifiedtime()==null) || 
             (this.modifiedtime!=null &&
              this.modifiedtime.equals(other.getModifiedtime()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles())));
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
        if (getIsDir() != null) {
            _hashCode += getIsDir().hashCode();
        }
        if (getFilesize() != null) {
            _hashCode += getFilesize().hashCode();
        }
        if (getModifiedtime() != null) {
            _hashCode += getModifiedtime().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
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
        new org.apache.axis.description.TypeDesc(PhysicalFileStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDir");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "isDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "filesize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedtime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "modifiedtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Files"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct"));
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
