/**
 * WURun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WURun  implements java.io.Serializable {
    private java.lang.String querySet;

    private java.lang.String query;

    private java.lang.String wuid;

    private java.lang.Boolean cloneWorkunit;

    private java.lang.String cluster;

    private java.lang.Integer wait;

    private java.lang.String input;

    private java.lang.Boolean noRootTag;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] debugValues;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] variables;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExceptionSeverity exceptionSeverity;

    public WURun() {
    }

    public WURun(
           java.lang.String querySet,
           java.lang.String query,
           java.lang.String wuid,
           java.lang.Boolean cloneWorkunit,
           java.lang.String cluster,
           java.lang.Integer wait,
           java.lang.String input,
           java.lang.Boolean noRootTag,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] debugValues,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] variables,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExceptionSeverity exceptionSeverity) {
           this.querySet = querySet;
           this.query = query;
           this.wuid = wuid;
           this.cloneWorkunit = cloneWorkunit;
           this.cluster = cluster;
           this.wait = wait;
           this.input = input;
           this.noRootTag = noRootTag;
           this.debugValues = debugValues;
           this.variables = variables;
           this.exceptionSeverity = exceptionSeverity;
    }


    /**
     * Gets the querySet value for this WURun.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this WURun.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the query value for this WURun.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this WURun.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the wuid value for this WURun.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WURun.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the cloneWorkunit value for this WURun.
     * 
     * @return cloneWorkunit
     */
    public java.lang.Boolean getCloneWorkunit() {
        return cloneWorkunit;
    }


    /**
     * Sets the cloneWorkunit value for this WURun.
     * 
     * @param cloneWorkunit
     */
    public void setCloneWorkunit(java.lang.Boolean cloneWorkunit) {
        this.cloneWorkunit = cloneWorkunit;
    }


    /**
     * Gets the cluster value for this WURun.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WURun.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the wait value for this WURun.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this WURun.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }


    /**
     * Gets the input value for this WURun.
     * 
     * @return input
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this WURun.
     * 
     * @param input
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the noRootTag value for this WURun.
     * 
     * @return noRootTag
     */
    public java.lang.Boolean getNoRootTag() {
        return noRootTag;
    }


    /**
     * Sets the noRootTag value for this WURun.
     * 
     * @param noRootTag
     */
    public void setNoRootTag(java.lang.Boolean noRootTag) {
        this.noRootTag = noRootTag;
    }


    /**
     * Gets the debugValues value for this WURun.
     * 
     * @return debugValues
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] getDebugValues() {
        return debugValues;
    }


    /**
     * Sets the debugValues value for this WURun.
     * 
     * @param debugValues
     */
    public void setDebugValues(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] debugValues) {
        this.debugValues = debugValues;
    }


    /**
     * Gets the variables value for this WURun.
     * 
     * @return variables
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] getVariables() {
        return variables;
    }


    /**
     * Sets the variables value for this WURun.
     * 
     * @param variables
     */
    public void setVariables(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.NamedValue[] variables) {
        this.variables = variables;
    }


    /**
     * Gets the exceptionSeverity value for this WURun.
     * 
     * @return exceptionSeverity
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExceptionSeverity getExceptionSeverity() {
        return exceptionSeverity;
    }


    /**
     * Sets the exceptionSeverity value for this WURun.
     * 
     * @param exceptionSeverity
     */
    public void setExceptionSeverity(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExceptionSeverity exceptionSeverity) {
        this.exceptionSeverity = exceptionSeverity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WURun)) return false;
        WURun other = (WURun) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.cloneWorkunit==null && other.getCloneWorkunit()==null) || 
             (this.cloneWorkunit!=null &&
              this.cloneWorkunit.equals(other.getCloneWorkunit()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.noRootTag==null && other.getNoRootTag()==null) || 
             (this.noRootTag!=null &&
              this.noRootTag.equals(other.getNoRootTag()))) &&
            ((this.debugValues==null && other.getDebugValues()==null) || 
             (this.debugValues!=null &&
              java.util.Arrays.equals(this.debugValues, other.getDebugValues()))) &&
            ((this.variables==null && other.getVariables()==null) || 
             (this.variables!=null &&
              java.util.Arrays.equals(this.variables, other.getVariables()))) &&
            ((this.exceptionSeverity==null && other.getExceptionSeverity()==null) || 
             (this.exceptionSeverity!=null &&
              this.exceptionSeverity.equals(other.getExceptionSeverity())));
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
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getCloneWorkunit() != null) {
            _hashCode += getCloneWorkunit().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getNoRootTag() != null) {
            _hashCode += getNoRootTag().hashCode();
        }
        if (getDebugValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebugValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebugValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExceptionSeverity() != null) {
            _hashCode += getExceptionSeverity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WURun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WURun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneWorkunit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CloneWorkunit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noRootTag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NoRootTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debugValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variables");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Variables"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NamedValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptionSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ExceptionSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExceptionSeverity"));
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
