/**
 * HPCCTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class HPCCTable  implements java.io.Serializable {
    private java.lang.String name;

    private org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] columns;

    private java.lang.String ECL;

    private java.lang.String format;

    private java.lang.String contentType;

    private java.lang.String description;

    private java.lang.Boolean isKeyed;

    private java.lang.Boolean isSuper;

    private java.lang.String csvQuote;

    private java.lang.String csvSeparate;

    private java.lang.String csvTerminate;

    private java.lang.String group;

    private java.math.BigInteger maxRecordSize;

    private java.lang.String modified;

    private java.math.BigInteger numParts;

    private java.lang.String owner;

    public HPCCTable() {
    }

    public HPCCTable(
           java.lang.String name,
           org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] columns,
           java.lang.String ECL,
           java.lang.String format,
           java.lang.String contentType,
           java.lang.String description,
           java.lang.Boolean isKeyed,
           java.lang.Boolean isSuper,
           java.lang.String csvQuote,
           java.lang.String csvSeparate,
           java.lang.String csvTerminate,
           java.lang.String group,
           java.math.BigInteger maxRecordSize,
           java.lang.String modified,
           java.math.BigInteger numParts,
           java.lang.String owner) {
           this.name = name;
           this.columns = columns;
           this.ECL = ECL;
           this.format = format;
           this.contentType = contentType;
           this.description = description;
           this.isKeyed = isKeyed;
           this.isSuper = isSuper;
           this.csvQuote = csvQuote;
           this.csvSeparate = csvSeparate;
           this.csvTerminate = csvTerminate;
           this.group = group;
           this.maxRecordSize = maxRecordSize;
           this.modified = modified;
           this.numParts = numParts;
           this.owner = owner;
    }


    /**
     * Gets the name value for this HPCCTable.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HPCCTable.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the columns value for this HPCCTable.
     * 
     * @return columns
     */
    public org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this HPCCTable.
     * 
     * @param columns
     */
    public void setColumns(org.hpccsystems.ws.client.soap.wssql.HPCCColumn[] columns) {
        this.columns = columns;
    }


    /**
     * Gets the ECL value for this HPCCTable.
     * 
     * @return ECL
     */
    public java.lang.String getECL() {
        return ECL;
    }


    /**
     * Sets the ECL value for this HPCCTable.
     * 
     * @param ECL
     */
    public void setECL(java.lang.String ECL) {
        this.ECL = ECL;
    }


    /**
     * Gets the format value for this HPCCTable.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this HPCCTable.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the contentType value for this HPCCTable.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this HPCCTable.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the description value for this HPCCTable.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HPCCTable.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isKeyed value for this HPCCTable.
     * 
     * @return isKeyed
     */
    public java.lang.Boolean getIsKeyed() {
        return isKeyed;
    }


    /**
     * Sets the isKeyed value for this HPCCTable.
     * 
     * @param isKeyed
     */
    public void setIsKeyed(java.lang.Boolean isKeyed) {
        this.isKeyed = isKeyed;
    }


    /**
     * Gets the isSuper value for this HPCCTable.
     * 
     * @return isSuper
     */
    public java.lang.Boolean getIsSuper() {
        return isSuper;
    }


    /**
     * Sets the isSuper value for this HPCCTable.
     * 
     * @param isSuper
     */
    public void setIsSuper(java.lang.Boolean isSuper) {
        this.isSuper = isSuper;
    }


    /**
     * Gets the csvQuote value for this HPCCTable.
     * 
     * @return csvQuote
     */
    public java.lang.String getCsvQuote() {
        return csvQuote;
    }


    /**
     * Sets the csvQuote value for this HPCCTable.
     * 
     * @param csvQuote
     */
    public void setCsvQuote(java.lang.String csvQuote) {
        this.csvQuote = csvQuote;
    }


    /**
     * Gets the csvSeparate value for this HPCCTable.
     * 
     * @return csvSeparate
     */
    public java.lang.String getCsvSeparate() {
        return csvSeparate;
    }


    /**
     * Sets the csvSeparate value for this HPCCTable.
     * 
     * @param csvSeparate
     */
    public void setCsvSeparate(java.lang.String csvSeparate) {
        this.csvSeparate = csvSeparate;
    }


    /**
     * Gets the csvTerminate value for this HPCCTable.
     * 
     * @return csvTerminate
     */
    public java.lang.String getCsvTerminate() {
        return csvTerminate;
    }


    /**
     * Sets the csvTerminate value for this HPCCTable.
     * 
     * @param csvTerminate
     */
    public void setCsvTerminate(java.lang.String csvTerminate) {
        this.csvTerminate = csvTerminate;
    }


    /**
     * Gets the group value for this HPCCTable.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this HPCCTable.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the maxRecordSize value for this HPCCTable.
     * 
     * @return maxRecordSize
     */
    public java.math.BigInteger getMaxRecordSize() {
        return maxRecordSize;
    }


    /**
     * Sets the maxRecordSize value for this HPCCTable.
     * 
     * @param maxRecordSize
     */
    public void setMaxRecordSize(java.math.BigInteger maxRecordSize) {
        this.maxRecordSize = maxRecordSize;
    }


    /**
     * Gets the modified value for this HPCCTable.
     * 
     * @return modified
     */
    public java.lang.String getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this HPCCTable.
     * 
     * @param modified
     */
    public void setModified(java.lang.String modified) {
        this.modified = modified;
    }


    /**
     * Gets the numParts value for this HPCCTable.
     * 
     * @return numParts
     */
    public java.math.BigInteger getNumParts() {
        return numParts;
    }


    /**
     * Sets the numParts value for this HPCCTable.
     * 
     * @param numParts
     */
    public void setNumParts(java.math.BigInteger numParts) {
        this.numParts = numParts;
    }


    /**
     * Gets the owner value for this HPCCTable.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this HPCCTable.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HPCCTable)) return false;
        HPCCTable other = (HPCCTable) obj;
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
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.ECL==null && other.getECL()==null) || 
             (this.ECL!=null &&
              this.ECL.equals(other.getECL()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isKeyed==null && other.getIsKeyed()==null) || 
             (this.isKeyed!=null &&
              this.isKeyed.equals(other.getIsKeyed()))) &&
            ((this.isSuper==null && other.getIsSuper()==null) || 
             (this.isSuper!=null &&
              this.isSuper.equals(other.getIsSuper()))) &&
            ((this.csvQuote==null && other.getCsvQuote()==null) || 
             (this.csvQuote!=null &&
              this.csvQuote.equals(other.getCsvQuote()))) &&
            ((this.csvSeparate==null && other.getCsvSeparate()==null) || 
             (this.csvSeparate!=null &&
              this.csvSeparate.equals(other.getCsvSeparate()))) &&
            ((this.csvTerminate==null && other.getCsvTerminate()==null) || 
             (this.csvTerminate!=null &&
              this.csvTerminate.equals(other.getCsvTerminate()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.maxRecordSize==null && other.getMaxRecordSize()==null) || 
             (this.maxRecordSize!=null &&
              this.maxRecordSize.equals(other.getMaxRecordSize()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.numParts==null && other.getNumParts()==null) || 
             (this.numParts!=null &&
              this.numParts.equals(other.getNumParts()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner())));
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
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getECL() != null) {
            _hashCode += getECL().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsKeyed() != null) {
            _hashCode += getIsKeyed().hashCode();
        }
        if (getIsSuper() != null) {
            _hashCode += getIsSuper().hashCode();
        }
        if (getCsvQuote() != null) {
            _hashCode += getCsvQuote().hashCode();
        }
        if (getCsvSeparate() != null) {
            _hashCode += getCsvSeparate().hashCode();
        }
        if (getCsvTerminate() != null) {
            _hashCode += getCsvTerminate().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getMaxRecordSize() != null) {
            _hashCode += getMaxRecordSize().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getNumParts() != null) {
            _hashCode += getNumParts().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HPCCTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Column"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKeyed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IsKeyed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSuper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IsSuper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvQuote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CsvQuote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvSeparate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CsvSeparate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvTerminate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CsvTerminate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRecordSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "MaxRecordSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numParts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "NumParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Owner"));
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
