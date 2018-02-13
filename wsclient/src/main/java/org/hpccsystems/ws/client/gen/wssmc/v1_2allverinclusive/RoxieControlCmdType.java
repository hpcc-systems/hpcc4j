/**
 * RoxieControlCmdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive;

public class RoxieControlCmdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RoxieControlCmdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Attach = "Attach";
    public static final java.lang.String _Detach = "Detach";
    public static final java.lang.String _State = "State";
    public static final java.lang.String _Reload = "Reload";
    public static final java.lang.String _ReloadRetry = "ReloadRetry";
    public static final RoxieControlCmdType Attach = new RoxieControlCmdType(_Attach);
    public static final RoxieControlCmdType Detach = new RoxieControlCmdType(_Detach);
    public static final RoxieControlCmdType State = new RoxieControlCmdType(_State);
    public static final RoxieControlCmdType Reload = new RoxieControlCmdType(_Reload);
    public static final RoxieControlCmdType ReloadRetry = new RoxieControlCmdType(_ReloadRetry);
    public java.lang.String getValue() { return _value_;}
    public static RoxieControlCmdType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RoxieControlCmdType enumeration = (RoxieControlCmdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RoxieControlCmdType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RoxieControlCmdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlCmdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
