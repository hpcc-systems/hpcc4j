/**
 * TpSparkThor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_28;

public class TpSparkThor  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String build;

    private java.lang.String thorClusterName;

    private java.lang.String thorPath;

    private org.apache.axis.types.UnsignedInt sparkExecutorCores;

    private java.lang.Long sparkExecutorMemory;

    private org.apache.axis.types.UnsignedInt sparkMasterPort;

    private org.apache.axis.types.UnsignedInt sparkMasterWebUIPort;

    private org.apache.axis.types.UnsignedInt sparkWorkerCores;

    private java.lang.Long sparkWorkerMemory;

    private org.apache.axis.types.UnsignedInt sparkWorkerPort;

    private java.lang.String logDirectory;

    private java.lang.String path;

    private org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachine[] tpMachines;

    public TpSparkThor() {
    }

    public TpSparkThor(
           java.lang.String name,
           java.lang.String build,
           java.lang.String thorClusterName,
           java.lang.String thorPath,
           org.apache.axis.types.UnsignedInt sparkExecutorCores,
           java.lang.Long sparkExecutorMemory,
           org.apache.axis.types.UnsignedInt sparkMasterPort,
           org.apache.axis.types.UnsignedInt sparkMasterWebUIPort,
           org.apache.axis.types.UnsignedInt sparkWorkerCores,
           java.lang.Long sparkWorkerMemory,
           org.apache.axis.types.UnsignedInt sparkWorkerPort,
           java.lang.String logDirectory,
           java.lang.String path,
           org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachine[] tpMachines) {
           this.name = name;
           this.build = build;
           this.thorClusterName = thorClusterName;
           this.thorPath = thorPath;
           this.sparkExecutorCores = sparkExecutorCores;
           this.sparkExecutorMemory = sparkExecutorMemory;
           this.sparkMasterPort = sparkMasterPort;
           this.sparkMasterWebUIPort = sparkMasterWebUIPort;
           this.sparkWorkerCores = sparkWorkerCores;
           this.sparkWorkerMemory = sparkWorkerMemory;
           this.sparkWorkerPort = sparkWorkerPort;
           this.logDirectory = logDirectory;
           this.path = path;
           this.tpMachines = tpMachines;
    }


    /**
     * Gets the name value for this TpSparkThor.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TpSparkThor.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the build value for this TpSparkThor.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this TpSparkThor.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the thorClusterName value for this TpSparkThor.
     * 
     * @return thorClusterName
     */
    public java.lang.String getThorClusterName() {
        return thorClusterName;
    }


    /**
     * Sets the thorClusterName value for this TpSparkThor.
     * 
     * @param thorClusterName
     */
    public void setThorClusterName(java.lang.String thorClusterName) {
        this.thorClusterName = thorClusterName;
    }


    /**
     * Gets the thorPath value for this TpSparkThor.
     * 
     * @return thorPath
     */
    public java.lang.String getThorPath() {
        return thorPath;
    }


    /**
     * Sets the thorPath value for this TpSparkThor.
     * 
     * @param thorPath
     */
    public void setThorPath(java.lang.String thorPath) {
        this.thorPath = thorPath;
    }


    /**
     * Gets the sparkExecutorCores value for this TpSparkThor.
     * 
     * @return sparkExecutorCores
     */
    public org.apache.axis.types.UnsignedInt getSparkExecutorCores() {
        return sparkExecutorCores;
    }


    /**
     * Sets the sparkExecutorCores value for this TpSparkThor.
     * 
     * @param sparkExecutorCores
     */
    public void setSparkExecutorCores(org.apache.axis.types.UnsignedInt sparkExecutorCores) {
        this.sparkExecutorCores = sparkExecutorCores;
    }


    /**
     * Gets the sparkExecutorMemory value for this TpSparkThor.
     * 
     * @return sparkExecutorMemory
     */
    public java.lang.Long getSparkExecutorMemory() {
        return sparkExecutorMemory;
    }


    /**
     * Sets the sparkExecutorMemory value for this TpSparkThor.
     * 
     * @param sparkExecutorMemory
     */
    public void setSparkExecutorMemory(java.lang.Long sparkExecutorMemory) {
        this.sparkExecutorMemory = sparkExecutorMemory;
    }


    /**
     * Gets the sparkMasterPort value for this TpSparkThor.
     * 
     * @return sparkMasterPort
     */
    public org.apache.axis.types.UnsignedInt getSparkMasterPort() {
        return sparkMasterPort;
    }


    /**
     * Sets the sparkMasterPort value for this TpSparkThor.
     * 
     * @param sparkMasterPort
     */
    public void setSparkMasterPort(org.apache.axis.types.UnsignedInt sparkMasterPort) {
        this.sparkMasterPort = sparkMasterPort;
    }


    /**
     * Gets the sparkMasterWebUIPort value for this TpSparkThor.
     * 
     * @return sparkMasterWebUIPort
     */
    public org.apache.axis.types.UnsignedInt getSparkMasterWebUIPort() {
        return sparkMasterWebUIPort;
    }


    /**
     * Sets the sparkMasterWebUIPort value for this TpSparkThor.
     * 
     * @param sparkMasterWebUIPort
     */
    public void setSparkMasterWebUIPort(org.apache.axis.types.UnsignedInt sparkMasterWebUIPort) {
        this.sparkMasterWebUIPort = sparkMasterWebUIPort;
    }


    /**
     * Gets the sparkWorkerCores value for this TpSparkThor.
     * 
     * @return sparkWorkerCores
     */
    public org.apache.axis.types.UnsignedInt getSparkWorkerCores() {
        return sparkWorkerCores;
    }


    /**
     * Sets the sparkWorkerCores value for this TpSparkThor.
     * 
     * @param sparkWorkerCores
     */
    public void setSparkWorkerCores(org.apache.axis.types.UnsignedInt sparkWorkerCores) {
        this.sparkWorkerCores = sparkWorkerCores;
    }


    /**
     * Gets the sparkWorkerMemory value for this TpSparkThor.
     * 
     * @return sparkWorkerMemory
     */
    public java.lang.Long getSparkWorkerMemory() {
        return sparkWorkerMemory;
    }


    /**
     * Sets the sparkWorkerMemory value for this TpSparkThor.
     * 
     * @param sparkWorkerMemory
     */
    public void setSparkWorkerMemory(java.lang.Long sparkWorkerMemory) {
        this.sparkWorkerMemory = sparkWorkerMemory;
    }


    /**
     * Gets the sparkWorkerPort value for this TpSparkThor.
     * 
     * @return sparkWorkerPort
     */
    public org.apache.axis.types.UnsignedInt getSparkWorkerPort() {
        return sparkWorkerPort;
    }


    /**
     * Sets the sparkWorkerPort value for this TpSparkThor.
     * 
     * @param sparkWorkerPort
     */
    public void setSparkWorkerPort(org.apache.axis.types.UnsignedInt sparkWorkerPort) {
        this.sparkWorkerPort = sparkWorkerPort;
    }


    /**
     * Gets the logDirectory value for this TpSparkThor.
     * 
     * @return logDirectory
     */
    public java.lang.String getLogDirectory() {
        return logDirectory;
    }


    /**
     * Sets the logDirectory value for this TpSparkThor.
     * 
     * @param logDirectory
     */
    public void setLogDirectory(java.lang.String logDirectory) {
        this.logDirectory = logDirectory;
    }


    /**
     * Gets the path value for this TpSparkThor.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TpSparkThor.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the tpMachines value for this TpSparkThor.
     * 
     * @return tpMachines
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachine[] getTpMachines() {
        return tpMachines;
    }


    /**
     * Sets the tpMachines value for this TpSparkThor.
     * 
     * @param tpMachines
     */
    public void setTpMachines(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachine[] tpMachines) {
        this.tpMachines = tpMachines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpSparkThor)) return false;
        TpSparkThor other = (TpSparkThor) obj;
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
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this.thorClusterName==null && other.getThorClusterName()==null) || 
             (this.thorClusterName!=null &&
              this.thorClusterName.equals(other.getThorClusterName()))) &&
            ((this.thorPath==null && other.getThorPath()==null) || 
             (this.thorPath!=null &&
              this.thorPath.equals(other.getThorPath()))) &&
            ((this.sparkExecutorCores==null && other.getSparkExecutorCores()==null) || 
             (this.sparkExecutorCores!=null &&
              this.sparkExecutorCores.equals(other.getSparkExecutorCores()))) &&
            ((this.sparkExecutorMemory==null && other.getSparkExecutorMemory()==null) || 
             (this.sparkExecutorMemory!=null &&
              this.sparkExecutorMemory.equals(other.getSparkExecutorMemory()))) &&
            ((this.sparkMasterPort==null && other.getSparkMasterPort()==null) || 
             (this.sparkMasterPort!=null &&
              this.sparkMasterPort.equals(other.getSparkMasterPort()))) &&
            ((this.sparkMasterWebUIPort==null && other.getSparkMasterWebUIPort()==null) || 
             (this.sparkMasterWebUIPort!=null &&
              this.sparkMasterWebUIPort.equals(other.getSparkMasterWebUIPort()))) &&
            ((this.sparkWorkerCores==null && other.getSparkWorkerCores()==null) || 
             (this.sparkWorkerCores!=null &&
              this.sparkWorkerCores.equals(other.getSparkWorkerCores()))) &&
            ((this.sparkWorkerMemory==null && other.getSparkWorkerMemory()==null) || 
             (this.sparkWorkerMemory!=null &&
              this.sparkWorkerMemory.equals(other.getSparkWorkerMemory()))) &&
            ((this.sparkWorkerPort==null && other.getSparkWorkerPort()==null) || 
             (this.sparkWorkerPort!=null &&
              this.sparkWorkerPort.equals(other.getSparkWorkerPort()))) &&
            ((this.logDirectory==null && other.getLogDirectory()==null) || 
             (this.logDirectory!=null &&
              this.logDirectory.equals(other.getLogDirectory()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.tpMachines==null && other.getTpMachines()==null) || 
             (this.tpMachines!=null &&
              java.util.Arrays.equals(this.tpMachines, other.getTpMachines())));
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
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        if (getThorClusterName() != null) {
            _hashCode += getThorClusterName().hashCode();
        }
        if (getThorPath() != null) {
            _hashCode += getThorPath().hashCode();
        }
        if (getSparkExecutorCores() != null) {
            _hashCode += getSparkExecutorCores().hashCode();
        }
        if (getSparkExecutorMemory() != null) {
            _hashCode += getSparkExecutorMemory().hashCode();
        }
        if (getSparkMasterPort() != null) {
            _hashCode += getSparkMasterPort().hashCode();
        }
        if (getSparkMasterWebUIPort() != null) {
            _hashCode += getSparkMasterWebUIPort().hashCode();
        }
        if (getSparkWorkerCores() != null) {
            _hashCode += getSparkWorkerCores().hashCode();
        }
        if (getSparkWorkerMemory() != null) {
            _hashCode += getSparkWorkerMemory().hashCode();
        }
        if (getSparkWorkerPort() != null) {
            _hashCode += getSparkWorkerPort().hashCode();
        }
        if (getLogDirectory() != null) {
            _hashCode += getLogDirectory().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getTpMachines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpMachines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpMachines(), i);
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
        new org.apache.axis.description.TypeDesc(TpSparkThor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSparkThor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorClusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ThorClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ThorPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparkExecutorCores");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SparkExecutorCores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparkExecutorMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SparkExecutorMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparkMasterPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SparkMasterPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparkMasterWebUIPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SparkMasterWebUIPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparkWorkerCores");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SparkWorkerCores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparkWorkerMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SparkWorkerMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sparkWorkerPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SparkWorkerPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpMachines");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachines"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine"));
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
