/**
 * HPCCFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_05;

public class HPCCFieldType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HPCCFieldType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BOOLEAN = "BOOLEAN";
    public static final java.lang.String _INTEGER = "INTEGER";
    public static final java.lang.String _UNSIGNED = "UNSIGNED";
    public static final java.lang.String _REAL = "REAL";
    public static final java.lang.String _DECIMAL = "DECIMAL";
    public static final java.lang.String _UDECIMAL = "UDECIMAL";
    public static final java.lang.String _STRING = "STRING";
    public static final java.lang.String _QSTRING = "QSTRING";
    public static final java.lang.String _UNICODE = "UNICODE";
    public static final java.lang.String _DATA = "DATA";
    public static final java.lang.String _VARSTRING = "VARSTRING";
    public static final java.lang.String _VARUNICODE = "VARUNICODE";
    public static final HPCCFieldType BOOLEAN = new HPCCFieldType(_BOOLEAN);
    public static final HPCCFieldType INTEGER = new HPCCFieldType(_INTEGER);
    public static final HPCCFieldType UNSIGNED = new HPCCFieldType(_UNSIGNED);
    public static final HPCCFieldType REAL = new HPCCFieldType(_REAL);
    public static final HPCCFieldType DECIMAL = new HPCCFieldType(_DECIMAL);
    public static final HPCCFieldType UDECIMAL = new HPCCFieldType(_UDECIMAL);
    public static final HPCCFieldType STRING = new HPCCFieldType(_STRING);
    public static final HPCCFieldType QSTRING = new HPCCFieldType(_QSTRING);
    public static final HPCCFieldType UNICODE = new HPCCFieldType(_UNICODE);
    public static final HPCCFieldType DATA = new HPCCFieldType(_DATA);
    public static final HPCCFieldType VARSTRING = new HPCCFieldType(_VARSTRING);
    public static final HPCCFieldType VARUNICODE = new HPCCFieldType(_VARUNICODE);
    public java.lang.String getValue() { return _value_;}
    public static HPCCFieldType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HPCCFieldType enumeration = (HPCCFieldType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HPCCFieldType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HPCCFieldType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCFieldType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
