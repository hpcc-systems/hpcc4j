/**
 * WUGetStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUGetStats  implements java.io.Serializable {
    private java.lang.String WUID;

    private java.lang.String creatorType;

    private java.lang.String creator;

    private java.lang.String scopeType;

    private java.lang.String scope;

    private java.lang.String kind;

    private java.lang.String measure;

    private org.apache.axis.types.UnsignedInt minScopeDepth;

    private org.apache.axis.types.UnsignedInt maxScopeDepth;

    private java.lang.Boolean includeGraphs;

    private java.lang.Boolean createDescriptions;

    public WUGetStats() {
    }

    public WUGetStats(
           java.lang.String WUID,
           java.lang.String creatorType,
           java.lang.String creator,
           java.lang.String scopeType,
           java.lang.String scope,
           java.lang.String kind,
           java.lang.String measure,
           org.apache.axis.types.UnsignedInt minScopeDepth,
           org.apache.axis.types.UnsignedInt maxScopeDepth,
           java.lang.Boolean includeGraphs,
           java.lang.Boolean createDescriptions) {
           this.WUID = WUID;
           this.creatorType = creatorType;
           this.creator = creator;
           this.scopeType = scopeType;
           this.scope = scope;
           this.kind = kind;
           this.measure = measure;
           this.minScopeDepth = minScopeDepth;
           this.maxScopeDepth = maxScopeDepth;
           this.includeGraphs = includeGraphs;
           this.createDescriptions = createDescriptions;
    }


    /**
     * Gets the WUID value for this WUGetStats.
     * 
     * @return WUID
     */
    public java.lang.String getWUID() {
        return WUID;
    }


    /**
     * Sets the WUID value for this WUGetStats.
     * 
     * @param WUID
     */
    public void setWUID(java.lang.String WUID) {
        this.WUID = WUID;
    }


    /**
     * Gets the creatorType value for this WUGetStats.
     * 
     * @return creatorType
     */
    public java.lang.String getCreatorType() {
        return creatorType;
    }


    /**
     * Sets the creatorType value for this WUGetStats.
     * 
     * @param creatorType
     */
    public void setCreatorType(java.lang.String creatorType) {
        this.creatorType = creatorType;
    }


    /**
     * Gets the creator value for this WUGetStats.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this WUGetStats.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the scopeType value for this WUGetStats.
     * 
     * @return scopeType
     */
    public java.lang.String getScopeType() {
        return scopeType;
    }


    /**
     * Sets the scopeType value for this WUGetStats.
     * 
     * @param scopeType
     */
    public void setScopeType(java.lang.String scopeType) {
        this.scopeType = scopeType;
    }


    /**
     * Gets the scope value for this WUGetStats.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this WUGetStats.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the kind value for this WUGetStats.
     * 
     * @return kind
     */
    public java.lang.String getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this WUGetStats.
     * 
     * @param kind
     */
    public void setKind(java.lang.String kind) {
        this.kind = kind;
    }


    /**
     * Gets the measure value for this WUGetStats.
     * 
     * @return measure
     */
    public java.lang.String getMeasure() {
        return measure;
    }


    /**
     * Sets the measure value for this WUGetStats.
     * 
     * @param measure
     */
    public void setMeasure(java.lang.String measure) {
        this.measure = measure;
    }


    /**
     * Gets the minScopeDepth value for this WUGetStats.
     * 
     * @return minScopeDepth
     */
    public org.apache.axis.types.UnsignedInt getMinScopeDepth() {
        return minScopeDepth;
    }


    /**
     * Sets the minScopeDepth value for this WUGetStats.
     * 
     * @param minScopeDepth
     */
    public void setMinScopeDepth(org.apache.axis.types.UnsignedInt minScopeDepth) {
        this.minScopeDepth = minScopeDepth;
    }


    /**
     * Gets the maxScopeDepth value for this WUGetStats.
     * 
     * @return maxScopeDepth
     */
    public org.apache.axis.types.UnsignedInt getMaxScopeDepth() {
        return maxScopeDepth;
    }


    /**
     * Sets the maxScopeDepth value for this WUGetStats.
     * 
     * @param maxScopeDepth
     */
    public void setMaxScopeDepth(org.apache.axis.types.UnsignedInt maxScopeDepth) {
        this.maxScopeDepth = maxScopeDepth;
    }


    /**
     * Gets the includeGraphs value for this WUGetStats.
     * 
     * @return includeGraphs
     */
    public java.lang.Boolean getIncludeGraphs() {
        return includeGraphs;
    }


    /**
     * Sets the includeGraphs value for this WUGetStats.
     * 
     * @param includeGraphs
     */
    public void setIncludeGraphs(java.lang.Boolean includeGraphs) {
        this.includeGraphs = includeGraphs;
    }


    /**
     * Gets the createDescriptions value for this WUGetStats.
     * 
     * @return createDescriptions
     */
    public java.lang.Boolean getCreateDescriptions() {
        return createDescriptions;
    }


    /**
     * Sets the createDescriptions value for this WUGetStats.
     * 
     * @param createDescriptions
     */
    public void setCreateDescriptions(java.lang.Boolean createDescriptions) {
        this.createDescriptions = createDescriptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUGetStats)) return false;
        WUGetStats other = (WUGetStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WUID==null && other.getWUID()==null) || 
             (this.WUID!=null &&
              this.WUID.equals(other.getWUID()))) &&
            ((this.creatorType==null && other.getCreatorType()==null) || 
             (this.creatorType!=null &&
              this.creatorType.equals(other.getCreatorType()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.scopeType==null && other.getScopeType()==null) || 
             (this.scopeType!=null &&
              this.scopeType.equals(other.getScopeType()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.measure==null && other.getMeasure()==null) || 
             (this.measure!=null &&
              this.measure.equals(other.getMeasure()))) &&
            ((this.minScopeDepth==null && other.getMinScopeDepth()==null) || 
             (this.minScopeDepth!=null &&
              this.minScopeDepth.equals(other.getMinScopeDepth()))) &&
            ((this.maxScopeDepth==null && other.getMaxScopeDepth()==null) || 
             (this.maxScopeDepth!=null &&
              this.maxScopeDepth.equals(other.getMaxScopeDepth()))) &&
            ((this.includeGraphs==null && other.getIncludeGraphs()==null) || 
             (this.includeGraphs!=null &&
              this.includeGraphs.equals(other.getIncludeGraphs()))) &&
            ((this.createDescriptions==null && other.getCreateDescriptions()==null) || 
             (this.createDescriptions!=null &&
              this.createDescriptions.equals(other.getCreateDescriptions())));
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
        if (getWUID() != null) {
            _hashCode += getWUID().hashCode();
        }
        if (getCreatorType() != null) {
            _hashCode += getCreatorType().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getScopeType() != null) {
            _hashCode += getScopeType().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getMeasure() != null) {
            _hashCode += getMeasure().hashCode();
        }
        if (getMinScopeDepth() != null) {
            _hashCode += getMinScopeDepth().hashCode();
        }
        if (getMaxScopeDepth() != null) {
            _hashCode += getMaxScopeDepth().hashCode();
        }
        if (getIncludeGraphs() != null) {
            _hashCode += getIncludeGraphs().hashCode();
        }
        if (getCreateDescriptions() != null) {
            _hashCode += getCreateDescriptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUGetStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CreatorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Measure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minScopeDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MinScopeDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxScopeDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxScopeDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeGraphs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeGraphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDescriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CreateDescriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
