/**
 * DFUWUActions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_12;

public class DFUWUActions implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DFUWUActions(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Delete = "Delete";
    public static final java.lang.String _Protect = "Protect";
    public static final java.lang.String _Unprotect = "Unprotect";
    public static final java.lang.String _Restore = "Restore";
    public static final java.lang.String _SetToFailed = "SetToFailed";
    public static final DFUWUActions Delete = new DFUWUActions(_Delete);
    public static final DFUWUActions Protect = new DFUWUActions(_Protect);
    public static final DFUWUActions Unprotect = new DFUWUActions(_Unprotect);
    public static final DFUWUActions Restore = new DFUWUActions(_Restore);
    public static final DFUWUActions SetToFailed = new DFUWUActions(_SetToFailed);
    public java.lang.String getValue() { return _value_;}
    public static DFUWUActions fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DFUWUActions enumeration = (DFUWUActions)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DFUWUActions fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DFUWUActions.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWUActions"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
