/**
 * GetDBSystemInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive;

public class GetDBSystemInfoResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException exceptions;

    private java.lang.String name;

    private java.lang.String fullVersion;

    private java.lang.String major;

    private java.lang.String minor;

    private java.lang.String point;

    private java.lang.String project;

    private java.lang.String maturity;

    private java.lang.String wsSQLFullVersion;

    private java.lang.String wsSQLMajor;

    private java.lang.String wsSQLMinor;

    private java.lang.String wsSQLPoint;

    private java.lang.String wsSQLProject;

    private java.lang.String wsSQLMaturity;

    public GetDBSystemInfoResponse() {
    }

    public GetDBSystemInfoResponse(
           org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException exceptions,
           java.lang.String name,
           java.lang.String fullVersion,
           java.lang.String major,
           java.lang.String minor,
           java.lang.String point,
           java.lang.String project,
           java.lang.String maturity,
           java.lang.String wsSQLFullVersion,
           java.lang.String wsSQLMajor,
           java.lang.String wsSQLMinor,
           java.lang.String wsSQLPoint,
           java.lang.String wsSQLProject,
           java.lang.String wsSQLMaturity) {
           this.exceptions = exceptions;
           this.name = name;
           this.fullVersion = fullVersion;
           this.major = major;
           this.minor = minor;
           this.point = point;
           this.project = project;
           this.maturity = maturity;
           this.wsSQLFullVersion = wsSQLFullVersion;
           this.wsSQLMajor = wsSQLMajor;
           this.wsSQLMinor = wsSQLMinor;
           this.wsSQLPoint = wsSQLPoint;
           this.wsSQLProject = wsSQLProject;
           this.wsSQLMaturity = wsSQLMaturity;
    }


    /**
     * Gets the exceptions value for this GetDBSystemInfoResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetDBSystemInfoResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.extended.wssql.v3_05allverinclusive.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the name value for this GetDBSystemInfoResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GetDBSystemInfoResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the fullVersion value for this GetDBSystemInfoResponse.
     * 
     * @return fullVersion
     */
    public java.lang.String getFullVersion() {
        return fullVersion;
    }


    /**
     * Sets the fullVersion value for this GetDBSystemInfoResponse.
     * 
     * @param fullVersion
     */
    public void setFullVersion(java.lang.String fullVersion) {
        this.fullVersion = fullVersion;
    }


    /**
     * Gets the major value for this GetDBSystemInfoResponse.
     * 
     * @return major
     */
    public java.lang.String getMajor() {
        return major;
    }


    /**
     * Sets the major value for this GetDBSystemInfoResponse.
     * 
     * @param major
     */
    public void setMajor(java.lang.String major) {
        this.major = major;
    }


    /**
     * Gets the minor value for this GetDBSystemInfoResponse.
     * 
     * @return minor
     */
    public java.lang.String getMinor() {
        return minor;
    }


    /**
     * Sets the minor value for this GetDBSystemInfoResponse.
     * 
     * @param minor
     */
    public void setMinor(java.lang.String minor) {
        this.minor = minor;
    }


    /**
     * Gets the point value for this GetDBSystemInfoResponse.
     * 
     * @return point
     */
    public java.lang.String getPoint() {
        return point;
    }


    /**
     * Sets the point value for this GetDBSystemInfoResponse.
     * 
     * @param point
     */
    public void setPoint(java.lang.String point) {
        this.point = point;
    }


    /**
     * Gets the project value for this GetDBSystemInfoResponse.
     * 
     * @return project
     */
    public java.lang.String getProject() {
        return project;
    }


    /**
     * Sets the project value for this GetDBSystemInfoResponse.
     * 
     * @param project
     */
    public void setProject(java.lang.String project) {
        this.project = project;
    }


    /**
     * Gets the maturity value for this GetDBSystemInfoResponse.
     * 
     * @return maturity
     */
    public java.lang.String getMaturity() {
        return maturity;
    }


    /**
     * Sets the maturity value for this GetDBSystemInfoResponse.
     * 
     * @param maturity
     */
    public void setMaturity(java.lang.String maturity) {
        this.maturity = maturity;
    }


    /**
     * Gets the wsSQLFullVersion value for this GetDBSystemInfoResponse.
     * 
     * @return wsSQLFullVersion
     */
    public java.lang.String getWsSQLFullVersion() {
        return wsSQLFullVersion;
    }


    /**
     * Sets the wsSQLFullVersion value for this GetDBSystemInfoResponse.
     * 
     * @param wsSQLFullVersion
     */
    public void setWsSQLFullVersion(java.lang.String wsSQLFullVersion) {
        this.wsSQLFullVersion = wsSQLFullVersion;
    }


    /**
     * Gets the wsSQLMajor value for this GetDBSystemInfoResponse.
     * 
     * @return wsSQLMajor
     */
    public java.lang.String getWsSQLMajor() {
        return wsSQLMajor;
    }


    /**
     * Sets the wsSQLMajor value for this GetDBSystemInfoResponse.
     * 
     * @param wsSQLMajor
     */
    public void setWsSQLMajor(java.lang.String wsSQLMajor) {
        this.wsSQLMajor = wsSQLMajor;
    }


    /**
     * Gets the wsSQLMinor value for this GetDBSystemInfoResponse.
     * 
     * @return wsSQLMinor
     */
    public java.lang.String getWsSQLMinor() {
        return wsSQLMinor;
    }


    /**
     * Sets the wsSQLMinor value for this GetDBSystemInfoResponse.
     * 
     * @param wsSQLMinor
     */
    public void setWsSQLMinor(java.lang.String wsSQLMinor) {
        this.wsSQLMinor = wsSQLMinor;
    }


    /**
     * Gets the wsSQLPoint value for this GetDBSystemInfoResponse.
     * 
     * @return wsSQLPoint
     */
    public java.lang.String getWsSQLPoint() {
        return wsSQLPoint;
    }


    /**
     * Sets the wsSQLPoint value for this GetDBSystemInfoResponse.
     * 
     * @param wsSQLPoint
     */
    public void setWsSQLPoint(java.lang.String wsSQLPoint) {
        this.wsSQLPoint = wsSQLPoint;
    }


    /**
     * Gets the wsSQLProject value for this GetDBSystemInfoResponse.
     * 
     * @return wsSQLProject
     */
    public java.lang.String getWsSQLProject() {
        return wsSQLProject;
    }


    /**
     * Sets the wsSQLProject value for this GetDBSystemInfoResponse.
     * 
     * @param wsSQLProject
     */
    public void setWsSQLProject(java.lang.String wsSQLProject) {
        this.wsSQLProject = wsSQLProject;
    }


    /**
     * Gets the wsSQLMaturity value for this GetDBSystemInfoResponse.
     * 
     * @return wsSQLMaturity
     */
    public java.lang.String getWsSQLMaturity() {
        return wsSQLMaturity;
    }


    /**
     * Sets the wsSQLMaturity value for this GetDBSystemInfoResponse.
     * 
     * @param wsSQLMaturity
     */
    public void setWsSQLMaturity(java.lang.String wsSQLMaturity) {
        this.wsSQLMaturity = wsSQLMaturity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDBSystemInfoResponse)) return false;
        GetDBSystemInfoResponse other = (GetDBSystemInfoResponse) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.fullVersion==null && other.getFullVersion()==null) || 
             (this.fullVersion!=null &&
              this.fullVersion.equals(other.getFullVersion()))) &&
            ((this.major==null && other.getMajor()==null) || 
             (this.major!=null &&
              this.major.equals(other.getMajor()))) &&
            ((this.minor==null && other.getMinor()==null) || 
             (this.minor!=null &&
              this.minor.equals(other.getMinor()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.maturity==null && other.getMaturity()==null) || 
             (this.maturity!=null &&
              this.maturity.equals(other.getMaturity()))) &&
            ((this.wsSQLFullVersion==null && other.getWsSQLFullVersion()==null) || 
             (this.wsSQLFullVersion!=null &&
              this.wsSQLFullVersion.equals(other.getWsSQLFullVersion()))) &&
            ((this.wsSQLMajor==null && other.getWsSQLMajor()==null) || 
             (this.wsSQLMajor!=null &&
              this.wsSQLMajor.equals(other.getWsSQLMajor()))) &&
            ((this.wsSQLMinor==null && other.getWsSQLMinor()==null) || 
             (this.wsSQLMinor!=null &&
              this.wsSQLMinor.equals(other.getWsSQLMinor()))) &&
            ((this.wsSQLPoint==null && other.getWsSQLPoint()==null) || 
             (this.wsSQLPoint!=null &&
              this.wsSQLPoint.equals(other.getWsSQLPoint()))) &&
            ((this.wsSQLProject==null && other.getWsSQLProject()==null) || 
             (this.wsSQLProject!=null &&
              this.wsSQLProject.equals(other.getWsSQLProject()))) &&
            ((this.wsSQLMaturity==null && other.getWsSQLMaturity()==null) || 
             (this.wsSQLMaturity!=null &&
              this.wsSQLMaturity.equals(other.getWsSQLMaturity())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFullVersion() != null) {
            _hashCode += getFullVersion().hashCode();
        }
        if (getMajor() != null) {
            _hashCode += getMajor().hashCode();
        }
        if (getMinor() != null) {
            _hashCode += getMinor().hashCode();
        }
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getMaturity() != null) {
            _hashCode += getMaturity().hashCode();
        }
        if (getWsSQLFullVersion() != null) {
            _hashCode += getWsSQLFullVersion().hashCode();
        }
        if (getWsSQLMajor() != null) {
            _hashCode += getWsSQLMajor().hashCode();
        }
        if (getWsSQLMinor() != null) {
            _hashCode += getWsSQLMinor().hashCode();
        }
        if (getWsSQLPoint() != null) {
            _hashCode += getWsSQLPoint().hashCode();
        }
        if (getWsSQLProject() != null) {
            _hashCode += getWsSQLProject().hashCode();
        }
        if (getWsSQLMaturity() != null) {
            _hashCode += getWsSQLMaturity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDBSystemInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBSystemInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "FullVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("major");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Major"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Minor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maturity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Maturity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSQLFullVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLFullVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSQLMajor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLMajor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSQLMinor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLMinor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSQLPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSQLProject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLProject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSQLMaturity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLMaturity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
