/**
 * WUFileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_71;

public class WUFileType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WUFileType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _XML = "XML";
    public static final java.lang.String _cpp = "cpp";
    public static final java.lang.String _dll = "dll";
    public static final java.lang.String _res = "res";
    public static final java.lang.String _WUECL = "WUECL";
    public static final java.lang.String _ThorLog = "ThorLog";
    public static final java.lang.String _ThorSlaveLog = "ThorSlaveLog";
    public static final java.lang.String _EclAgentLog = "EclAgentLog";
    public static final java.lang.String _ArchiveQuery = "ArchiveQuery";
    public static final WUFileType XML = new WUFileType(_XML);
    public static final WUFileType cpp = new WUFileType(_cpp);
    public static final WUFileType dll = new WUFileType(_dll);
    public static final WUFileType res = new WUFileType(_res);
    public static final WUFileType WUECL = new WUFileType(_WUECL);
    public static final WUFileType ThorLog = new WUFileType(_ThorLog);
    public static final WUFileType ThorSlaveLog = new WUFileType(_ThorSlaveLog);
    public static final WUFileType EclAgentLog = new WUFileType(_EclAgentLog);
    public static final WUFileType ArchiveQuery = new WUFileType(_ArchiveQuery);
    public java.lang.String getValue() { return _value_;}
    public static WUFileType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WUFileType enumeration = (WUFileType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WUFileType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WUFileType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFileType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
