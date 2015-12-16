/**
 * WUCheckFeaturesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUCheckFeaturesResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.Integer buildVersionMajor;

    private java.lang.Integer buildVersionMinor;

    private java.lang.Integer buildVersionPoint;

    private org.apache.axis.types.UnsignedInt maxRequestEntityLength;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DeploymentFeatures deployment;

    public WUCheckFeaturesResponse() {
    }

    public WUCheckFeaturesResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.Integer buildVersionMajor,
           java.lang.Integer buildVersionMinor,
           java.lang.Integer buildVersionPoint,
           org.apache.axis.types.UnsignedInt maxRequestEntityLength,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DeploymentFeatures deployment) {
           this.exceptions = exceptions;
           this.buildVersionMajor = buildVersionMajor;
           this.buildVersionMinor = buildVersionMinor;
           this.buildVersionPoint = buildVersionPoint;
           this.maxRequestEntityLength = maxRequestEntityLength;
           this.deployment = deployment;
    }


    /**
     * Gets the exceptions value for this WUCheckFeaturesResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUCheckFeaturesResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the buildVersionMajor value for this WUCheckFeaturesResponse.
     * 
     * @return buildVersionMajor
     */
    public java.lang.Integer getBuildVersionMajor() {
        return buildVersionMajor;
    }


    /**
     * Sets the buildVersionMajor value for this WUCheckFeaturesResponse.
     * 
     * @param buildVersionMajor
     */
    public void setBuildVersionMajor(java.lang.Integer buildVersionMajor) {
        this.buildVersionMajor = buildVersionMajor;
    }


    /**
     * Gets the buildVersionMinor value for this WUCheckFeaturesResponse.
     * 
     * @return buildVersionMinor
     */
    public java.lang.Integer getBuildVersionMinor() {
        return buildVersionMinor;
    }


    /**
     * Sets the buildVersionMinor value for this WUCheckFeaturesResponse.
     * 
     * @param buildVersionMinor
     */
    public void setBuildVersionMinor(java.lang.Integer buildVersionMinor) {
        this.buildVersionMinor = buildVersionMinor;
    }


    /**
     * Gets the buildVersionPoint value for this WUCheckFeaturesResponse.
     * 
     * @return buildVersionPoint
     */
    public java.lang.Integer getBuildVersionPoint() {
        return buildVersionPoint;
    }


    /**
     * Sets the buildVersionPoint value for this WUCheckFeaturesResponse.
     * 
     * @param buildVersionPoint
     */
    public void setBuildVersionPoint(java.lang.Integer buildVersionPoint) {
        this.buildVersionPoint = buildVersionPoint;
    }


    /**
     * Gets the maxRequestEntityLength value for this WUCheckFeaturesResponse.
     * 
     * @return maxRequestEntityLength
     */
    public org.apache.axis.types.UnsignedInt getMaxRequestEntityLength() {
        return maxRequestEntityLength;
    }


    /**
     * Sets the maxRequestEntityLength value for this WUCheckFeaturesResponse.
     * 
     * @param maxRequestEntityLength
     */
    public void setMaxRequestEntityLength(org.apache.axis.types.UnsignedInt maxRequestEntityLength) {
        this.maxRequestEntityLength = maxRequestEntityLength;
    }


    /**
     * Gets the deployment value for this WUCheckFeaturesResponse.
     * 
     * @return deployment
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DeploymentFeatures getDeployment() {
        return deployment;
    }


    /**
     * Sets the deployment value for this WUCheckFeaturesResponse.
     * 
     * @param deployment
     */
    public void setDeployment(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.DeploymentFeatures deployment) {
        this.deployment = deployment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUCheckFeaturesResponse)) return false;
        WUCheckFeaturesResponse other = (WUCheckFeaturesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.buildVersionMajor==null && other.getBuildVersionMajor()==null) || 
             (this.buildVersionMajor!=null &&
              this.buildVersionMajor.equals(other.getBuildVersionMajor()))) &&
            ((this.buildVersionMinor==null && other.getBuildVersionMinor()==null) || 
             (this.buildVersionMinor!=null &&
              this.buildVersionMinor.equals(other.getBuildVersionMinor()))) &&
            ((this.buildVersionPoint==null && other.getBuildVersionPoint()==null) || 
             (this.buildVersionPoint!=null &&
              this.buildVersionPoint.equals(other.getBuildVersionPoint()))) &&
            ((this.maxRequestEntityLength==null && other.getMaxRequestEntityLength()==null) || 
             (this.maxRequestEntityLength!=null &&
              this.maxRequestEntityLength.equals(other.getMaxRequestEntityLength()))) &&
            ((this.deployment==null && other.getDeployment()==null) || 
             (this.deployment!=null &&
              this.deployment.equals(other.getDeployment())));
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
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getBuildVersionMajor() != null) {
            _hashCode += getBuildVersionMajor().hashCode();
        }
        if (getBuildVersionMinor() != null) {
            _hashCode += getBuildVersionMinor().hashCode();
        }
        if (getBuildVersionPoint() != null) {
            _hashCode += getBuildVersionPoint().hashCode();
        }
        if (getMaxRequestEntityLength() != null) {
            _hashCode += getMaxRequestEntityLength().hashCode();
        }
        if (getDeployment() != null) {
            _hashCode += getDeployment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUCheckFeaturesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCheckFeaturesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVersionMajor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BuildVersionMajor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVersionMinor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BuildVersionMinor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVersionPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BuildVersionPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRequestEntityLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "maxRequestEntityLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deployment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Deployment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DeploymentFeatures"));
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
