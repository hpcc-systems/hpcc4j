/**
 * ESDLDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_2;

public class ESDLDefinition  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Integer seq;

    private java.lang.String id;

    private java.lang.String _interface;

    private java.lang.String[] ESDLServices;

    public ESDLDefinition() {
    }

    public ESDLDefinition(
           java.lang.String name,
           java.lang.Integer seq,
           java.lang.String id,
           java.lang.String _interface,
           java.lang.String[] ESDLServices) {
           this.name = name;
           this.seq = seq;
           this.id = id;
           this._interface = _interface;
           this.ESDLServices = ESDLServices;
    }


    /**
     * Gets the name value for this ESDLDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ESDLDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the seq value for this ESDLDefinition.
     * 
     * @return seq
     */
    public java.lang.Integer getSeq() {
        return seq;
    }


    /**
     * Sets the seq value for this ESDLDefinition.
     * 
     * @param seq
     */
    public void setSeq(java.lang.Integer seq) {
        this.seq = seq;
    }


    /**
     * Gets the id value for this ESDLDefinition.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ESDLDefinition.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the _interface value for this ESDLDefinition.
     * 
     * @return _interface
     */
    public java.lang.String get_interface() {
        return _interface;
    }


    /**
     * Sets the _interface value for this ESDLDefinition.
     * 
     * @param _interface
     */
    public void set_interface(java.lang.String _interface) {
        this._interface = _interface;
    }


    /**
     * Gets the ESDLServices value for this ESDLDefinition.
     * 
     * @return ESDLServices
     */
    public java.lang.String[] getESDLServices() {
        return ESDLServices;
    }


    /**
     * Sets the ESDLServices value for this ESDLDefinition.
     * 
     * @param ESDLServices
     */
    public void setESDLServices(java.lang.String[] ESDLServices) {
        this.ESDLServices = ESDLServices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ESDLDefinition)) return false;
        ESDLDefinition other = (ESDLDefinition) obj;
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
            ((this.seq==null && other.getSeq()==null) || 
             (this.seq!=null &&
              this.seq.equals(other.getSeq()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this._interface==null && other.get_interface()==null) || 
             (this._interface!=null &&
              this._interface.equals(other.get_interface()))) &&
            ((this.ESDLServices==null && other.getESDLServices()==null) || 
             (this.ESDLServices!=null &&
              java.util.Arrays.equals(this.ESDLServices, other.getESDLServices())));
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
        if (getSeq() != null) {
            _hashCode += getSeq().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (get_interface() != null) {
            _hashCode += get_interface().hashCode();
        }
        if (getESDLServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESDLServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESDLServices(), i);
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
        new org.apache.axis.description.TypeDesc(ESDLDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seq");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Seq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_interface");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Interface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESDLServices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLServices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Name"));
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
