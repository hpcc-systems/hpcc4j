/**
 * ECLWUActions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class ECLWUActions implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ECLWUActions(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Abort = "Abort";
    public static final java.lang.String _Delete = "Delete";
    public static final java.lang.String _Deschedule = "Deschedule";
    public static final java.lang.String _Reschedule = "Reschedule";
    public static final java.lang.String _Pause = "Pause";
    public static final java.lang.String _PauseNow = "PauseNow";
    public static final java.lang.String _Protect = "Protect";
    public static final java.lang.String _Unprotect = "Unprotect";
    public static final java.lang.String _Restore = "Restore";
    public static final java.lang.String _Resume = "Resume";
    public static final java.lang.String _SetToFailed = "SetToFailed";
    public static final ECLWUActions Abort = new ECLWUActions(_Abort);
    public static final ECLWUActions Delete = new ECLWUActions(_Delete);
    public static final ECLWUActions Deschedule = new ECLWUActions(_Deschedule);
    public static final ECLWUActions Reschedule = new ECLWUActions(_Reschedule);
    public static final ECLWUActions Pause = new ECLWUActions(_Pause);
    public static final ECLWUActions PauseNow = new ECLWUActions(_PauseNow);
    public static final ECLWUActions Protect = new ECLWUActions(_Protect);
    public static final ECLWUActions Unprotect = new ECLWUActions(_Unprotect);
    public static final ECLWUActions Restore = new ECLWUActions(_Restore);
    public static final ECLWUActions Resume = new ECLWUActions(_Resume);
    public static final ECLWUActions SetToFailed = new ECLWUActions(_SetToFailed);
    public java.lang.String getValue() { return _value_;}
    public static ECLWUActions fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ECLWUActions enumeration = (ECLWUActions)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ECLWUActions fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ECLWUActions.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWUActions"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
