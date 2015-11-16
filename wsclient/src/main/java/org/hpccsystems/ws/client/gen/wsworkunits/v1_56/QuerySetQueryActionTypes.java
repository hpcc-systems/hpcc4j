/**
 * QuerySetQueryActionTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class QuerySetQueryActionTypes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QuerySetQueryActionTypes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Suspend = "Suspend";
    public static final java.lang.String _Unsuspend = "Unsuspend";
    public static final java.lang.String _ToggleSuspend = "ToggleSuspend";
    public static final java.lang.String _Activate = "Activate";
    public static final java.lang.String _Delete = "Delete";
    public static final java.lang.String _RemoveAllAliases = "RemoveAllAliases";
    public static final java.lang.String _ResetQueryStats = "ResetQueryStats";
    public static final QuerySetQueryActionTypes Suspend = new QuerySetQueryActionTypes(_Suspend);
    public static final QuerySetQueryActionTypes Unsuspend = new QuerySetQueryActionTypes(_Unsuspend);
    public static final QuerySetQueryActionTypes ToggleSuspend = new QuerySetQueryActionTypes(_ToggleSuspend);
    public static final QuerySetQueryActionTypes Activate = new QuerySetQueryActionTypes(_Activate);
    public static final QuerySetQueryActionTypes Delete = new QuerySetQueryActionTypes(_Delete);
    public static final QuerySetQueryActionTypes RemoveAllAliases = new QuerySetQueryActionTypes(_RemoveAllAliases);
    public static final QuerySetQueryActionTypes ResetQueryStats = new QuerySetQueryActionTypes(_ResetQueryStats);
    public java.lang.String getValue() { return _value_;}
    public static QuerySetQueryActionTypes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        QuerySetQueryActionTypes enumeration = (QuerySetQueryActionTypes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QuerySetQueryActionTypes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(QuerySetQueryActionTypes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryActionTypes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
