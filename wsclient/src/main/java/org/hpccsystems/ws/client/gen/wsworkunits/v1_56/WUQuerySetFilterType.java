/**
 * WUQuerySetFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUQuerySetFilterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WUQuerySetFilterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _All = "All";
    public static final java.lang.String _Id = "Id";
    public static final java.lang.String _Name = "Name";
    public static final java.lang.String _Alias = "Alias";
    public static final java.lang.String _Status = "Status";
    public static final WUQuerySetFilterType All = new WUQuerySetFilterType(_All);
    public static final WUQuerySetFilterType Id = new WUQuerySetFilterType(_Id);
    public static final WUQuerySetFilterType Name = new WUQuerySetFilterType(_Name);
    public static final WUQuerySetFilterType Alias = new WUQuerySetFilterType(_Alias);
    public static final WUQuerySetFilterType Status = new WUQuerySetFilterType(_Status);
    public java.lang.String getValue() { return _value_;}
    public static WUQuerySetFilterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WUQuerySetFilterType enumeration = (WUQuerySetFilterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WUQuerySetFilterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WUQuerySetFilterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetFilterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
